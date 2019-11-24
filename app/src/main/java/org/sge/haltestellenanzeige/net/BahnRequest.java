package org.sge.haltestellenanzeige.net;

import android.content.Context;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONObject;
import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.opnv.OPNVJsonRequest;
import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.opnv.OPNVManager;
import org.sge.haltestellenanzeige.settings.RegPageSettings;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.ui.ChangeStopActivity;
import org.sge.haltestellenanzeige.ui.DisplayActivity;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;
import org.sge.haltestellenanzeige.widget.HaltestellenWidget;
import org.sge.haltestellenanzeige.widget.WidgetManager;

import java.util.HashMap;
import java.util.Map;


public class BahnRequest {
	public final static String REQUEST_TAG = "BahnRequestDBV1.0"; //NON-NLS
	public final static String BOARD_REQUEST = "BOARDREQUEST"; //NON-NLS
	public final static String SUGGESTION_REQUEST = "SUGGESTIONREQUEST"; //NON-NLS
	public final static String SYNC_REQUEST = "SYNC"; //NON-NLS
	public final static String ASYNC_REQUEST = "ASYNC"; //NON-NLS
	public final static String SEARCH_TAG = "SEARCHEQUEST"; //NON-NLS
	public final static int countTries = 3;
	public final static long timeoutValue = 10000;
	public final static int intervallTime = 500;
	public final static int timeBetweenRetries = 10000;
	public final static int WAITING_TIME_AFTER_REQEST_TIMEOUT = 5000;


	// public final static String auskunftUrl   = "http://www.saarfahrplan.de/cgi-bin/stboard.exe/dn?L=public&input=15537&boardType=dep&time=now&productsFilter=7:1111101&selectDate=today&maxJourneys=15&start=yes";
	// public final static String predictionUrl = "http://www.saarfahrplan.de/cgi-bin/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=255&getstop=1&noSession=yes&REQ0JourneyStopsB=12&REQ0JourneyStopsS0G=heus?&js=true&";

	// Haltestellensuche
	// https://fahrplaner.vbn.de/hafas/ajax-getstop.exe/dny?/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&REQ0JourneyStopsB=12&S=Uhlhorn?&js=true&getring=1

	// Liveticker
	// https://fahrplaner.vbn.de/hafas/stboard.exe/dny?L=vs_liveticker&protocol=https:&tpl=liveticker2json&&input=000179080&boardType=dep&time=now&productsFilter=1111111111&additionalTime=0&ignoreMasts=yes&maxJourneys=30&start=yes&selectDate=today&monitor=1&outputMode=tickerDataOnly

	public final static long MIN_WAITING_TIME = 250;
	private static HashMap<String, Long> startTime = new HashMap<String, Long>();


	public static void createBahnRequestAsynchronWithTag(
			Context context,
			final DisplayTimerActivity displayActivity,
			final WidgetManager widgetManager,
			final int widgetId,
			final RegPageSettings regPageSettings)
	{
		if((displayActivity == null) && (widgetManager == null)) return;
		if(regPageSettings == null) return;

		if(widgetManager != null) {
			if(WidgetManager.getInstance().getWidgetData(widgetId).getStation(context) == null) return;
			if(Settings.getDefaultStop(context).contentEquals(WidgetManager.getInstance().getWidgetData(widgetId).getStation(context).getName())) return;
		}

		if(displayActivity != null) {
			if("".equals(regPageSettings.getStationNameDB())) return;
		}

		if(Settings.getDefaultStop(context).contentEquals(regPageSettings.getStationName())) return;

		System.out.println("createBahnRequestAsynchronWithTag: " + regPageSettings.getStationName()); //NON-NLS
		// Toast.makeText(context, "createBahnRequestAsynchronWithTag", Toast.LENGTH_SHORT).show(); //NON-NLS

		// reset ratings
		regPageSettings.resetRatings();

		askSecondaryOPNVsWhetherTheyOwnThisStation(context, displayActivity, widgetManager, widgetId, regPageSettings);

		System.out.println("BahnRequest::createBahnRequestAsynchronWithTag() loop over OPNVs"); //NON-NLS
		for(OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
			if (regPageSettings.isStatusHasStop(opnv) || OPNV.PRIMARY_OPNV.getTag().contentEquals(opnv.getTag())) {
				Stop stop = regPageSettings.getStopFromOPNV(opnv);
				if(stop != null) {
					System.out.println("BahnRequest::createBahnRequestAsynchronWithTag() opnv: " + opnv.getTag() + " " + stop.getName()); //NON-NLS
					createBahnRequestAsynchronWithTagAndPrimaryAndSecondaryOPNV(context, displayActivity, widgetManager, widgetId, stop);
				}
				else {
					System.out.println("BahnRequest::createBahnRequestAsynchronWithTag() opnv: " + opnv.getTag() + " stop not set! OPNV skipped!"); //NON-NLS
				}
			}
		}
	}


	public static void createBahnRequestAsynchronWithTagSingleOPNV(
			Context context,
			final DisplayTimerActivity displayActivity,
			final WidgetManager widgetManager,
			final int widgetId,
			final RegPageSettings regPageSettings,
			final OPNV opnv)
	{
		// System.out see below
		if((displayActivity == null) && (widgetManager == null)) return;
		if(regPageSettings == null) return;

		if(widgetManager != null) {
			if(WidgetManager.getInstance().getWidgetData(widgetId).getStation(context) == null) return;
			if(Settings.getDefaultStop(context).contentEquals(WidgetManager.getInstance().getWidgetData(widgetId).getStation(context).getName())) return;
		}

		if(displayActivity != null) {
			// System.out.println("BahnRequest::createBahnRequestAsynchronWithTag() Station name db: " + regPageSettings.getStationNameDB());
			if("".equals(regPageSettings.getStationNameDB())) return;
		}

		if(Settings.getDefaultStop(context).contentEquals(regPageSettings.getStationName())) return;

		// Toast.makeText(context, "createBahnRequestAsynchronWithTag", Toast.LENGTH_SHORT).show(); //NON-NLS
		System.out.println("BahnRequest::createBahnRequestAsynchronWithTagSingleOPNV: " + opnv.getTag() + " " + regPageSettings.getStationName()); //NON-NLS

		if (regPageSettings.isStatusHasStop(opnv) || OPNV.PRIMARY_OPNV.getTag().contentEquals(opnv.getTag())) {
			System.out.println("BahnRequest::createBahnRequestAsynchronWithTag() opnv: " + opnv.getTag()); //NON-NLS
			Stop stop = regPageSettings.getStopFromOPNV(opnv);
			if(stop != null) {
				createBahnRequestAsynchronWithTagAndPrimaryAndSecondaryOPNV(context, displayActivity, widgetManager, widgetId, stop);
			}
			else {
				System.out.println("BahnRequest::createBahnRequestAsynchronWithTag() opnv: " + opnv.getTag() + " stop not set! OPNV skipped!"); //NON-NLS
			}
		}
	}


	private static void askSecondaryOPNVsWhetherTheyOwnThisStation(
			Context context,
			final DisplayTimerActivity displayActivity,
			final WidgetManager widgetManager,
			final int widgetId,
			final RegPageSettings regPageSettings) {
		System.out.println("askSecondaryOPNVsWhetherTheyOwnThisStation"); //NON-NLS
		int i=0;
		for(OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
			System.out.println("  opnv number: " + i++ + "  opnvTag: " + opnv.getTag() + "  status (0=init, 1,2= wait, 3=no,4=has station): " + regPageSettings.getStatusForStopFromOPNV(opnv) + "  isStatusForStopFromOPNVInitial: " + regPageSettings.isStatusForStopFromOPNVInitial(opnv)); //NON-NLS
			//if (regPageSettings.isStatusForStopFromOPNVInitial(opnv)) {
			if(regPageSettings.isStatusForStopFromOPNVInitial(opnv) || regPageSettings.isStatusForStopFromOPNVWaitingForResponse(opnv)) {
				if(!OPNV.PRIMARY_OPNV.getTag().contentEquals(opnv.getTag())) { // Primary_OPNV has always the station (hard coded), you see this later in the program flow
					System.out.println("    ask provider " + opnv.getTag() + "  to stop: " + regPageSettings.getStationNameDB()); //NON-NLS
					createSuggestionRequestAsynchronForSecondaryOPVN(context, displayActivity, widgetManager, widgetId, regPageSettings, opnv);
				}
			}
		}
	}


	public static void createDepartureJsonRequestAsynchron(final Context context, final OPNVJsonRequest opnvJsonRequest, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId, final String requestTag, final Stop stop) {
        if(stop == null) return;
        final String station = stop.getName();

		System.out.println("request url1: " + opnvJsonRequest.getUrl()); //NON-NLS

        int volleyCounterCreateRequestTime = VolleyResponse.getInstance().getCounter();
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
                opnvJsonRequest.getUrl(),
                opnvJsonRequest.getRequestPayloadForDeparture(stop),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR"); //NON-NLS
                        System.out.println("Tag: " + opnvJsonRequest.getTag()); //NON-NLS
                        System.out.println("Request response: " + Util.printPart(response.toString(), Util.MESSAGE_LENGTH)); //NON-NLS

                        if(displayActivity != null) {
                            System.out.println("displayActivity is not null"); //NON-NLS
                            displayActivity.sendResponse(opnvJsonRequest, station, response.toString());
                        }

                        if(widgetManager != null) {
                            System.out.println("displayActivity is not null"); //NON-NLS
                            HaltestellenWidget.updateBoard(context, widgetId, stop, response.toString());
                        }
                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // listenerForTag.onErrorResponse(tagProvider, error);
                        // Toast.makeText(context, context.getResources().getString(R.string.app_no_network), Toast.LENGTH_SHORT).show(); //NON-NLS
                        clearPostfix(context, widgetId);

                        System.out.println("ERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERER01"); //NON-NLS
                        String responseString = "";
                        System.out.println("Request failed"); //NON-NLS                        }
                    }
                }
        );
        jsonObjectRequest.setTag(requestTag);
        VolleyQueue.getInstance().getQueue(context).add(jsonObjectRequest);
        System.out.println("json request added to queue"); //NON-NLS
	}


	public static void createDepartureStringRequestAsynchron(final Context context, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId, final String requestTag, final Stop stop) {
        if(stop == null) return;
        final OPNV opnv = stop.getOPNV();
        final String station = stop.getName();
        String auskunftUrl = stop.getUrl();
        System.out.println("request url1: " + auskunftUrl); //NON-NLS

        StringRequest stringRequest = new StringRequest(Request.Method.GET, auskunftUrl,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println("RRRR createDepartureStringRequestAsynchron RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" + "Tag: " + opnv.getTag()); //NON-NLS
                        System.out.println("Request response: " + Util.printPart(response, Util.MESSAGE_LENGTH)); //NON-NLS

                        if(displayActivity != null) {
                            System.out.println("displayActivity is not null"); //NON-NLS
                            displayActivity.sendResponse(opnv, station, response);
                        }

                        if(widgetManager != null) {
                            System.out.println("displayActivity is not null"); //NON-NLS
                            HaltestellenWidget.updateBoard(context, widgetId, stop, response);
                        }
                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // listenerForTag.onErrorResponse(tagProvider, error);
                        // Toast.makeText(context, context.getResources().getString(R.string.app_no_network), Toast.LENGTH_SHORT).show(); //NON-NLS
                        clearPostfix(context, widgetId);

                        System.out.println("ERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERER02"); //NON-NLS
                        String responseString = "";
                        System.out.println("Request failed"); //NON-NLS
                    }
                }
        );

        stringRequest.setTag(requestTag);
        VolleyQueue.getInstance().getQueue(context).add(stringRequest);
        System.out.println("string request added to queue"); //NON-NLS
	}


	private static void createBahnRequestAsynchronWithTagAndPrimaryAndSecondaryOPNV(
			final Context context,
			final DisplayTimerActivity displayActivity,
			final WidgetManager widgetManager,
			final int widgetId,
			final Stop stop)
	{
	    if(stop == null) return;
		final OPNV opnv = stop.getOPNV();
		final String station = stop.getName();
		final String stationNameForUrl = stop.getUrl();
		System.out.println("BahnRequest::createBahnRequestAsynchronWithTagAndPrimaryAndSecondaryOPNV: " + opnv.getTag() + "  " + station + "  " + stationNameForUrl); //NON-NLS
		waitMinDuration(opnv);

		final String requestTag = REQUEST_TAG + BOARD_REQUEST + ASYNC_REQUEST + opnv.getTag();
		VolleyQueue.getInstance().getQueue(context).cancelAll(requestTag);

		final int queueNumber = VolleyQueue.getInstance().getQueue(context).getSequenceNumber();
		System.out.println("Queue: " + queueNumber); //NON-NLS
		System.out.println("Tag (opnv): " + opnv.getTag()); //NON-NLS
		System.out.println("station: " + station); //NON-NLS
		System.out.println("stationNameForUrl: " + stationNameForUrl); //NON-NLS

		opnv.createDepartureRequestAsynchron(context, stop.getOPNV(), displayActivity, widgetManager, widgetId, requestTag, stop);
	}


	// used for testing only
	public static String createBahnRequestSynchronWithTag(
			Context context,
			final DisplayActivity displayActivity,
			final OPNV opnv,
			final String stationNameForUrl) {
		System.out.println("createBahnRequestSynchronWithTag()"); //NON-NLS
		return createBahnRequestSynchronWithTag(context, displayActivity, opnv, stationNameForUrl,null);
	}


	// used for testing only
	public static String createBahnRequestSynchronWithTag(
			Context context,
			final DisplayActivity displayActivity,
			final OPNV opnv,
			final String stationNameForUrl,
			final Stop stop) {
		System.out.println("createBahnRequestSynchronWithTag()"); //NON-NLS
		return createBahnRequestSynchronWithTag(context, displayActivity, stop, opnv, stationNameForUrl);
	}


	// used for testing only
	public static String createBahnRequestSynchronWithTag(
		Context context,
		final DisplayActivity displayActivity,
		final Stop stop,
		final OPNV opnv,
		final String stationNameForUrl)
	{
		System.out.println("createBahnRequestSynchronWithTag()"); //NON-NLS

		final String requestTag = REQUEST_TAG + BOARD_REQUEST + SYNC_REQUEST + opnv.getTag();

		for(int t=0; t<countTries; t++) {
			ResponseContainer rc = createBahnRequestSynchronWithTagDoIt(context, displayActivity, opnv, stationNameForUrl, requestTag, stop, false);
			if(rc.status) return rc.content;
			VolleyQueue.getInstance().getQueue(context).cancelAll(requestTag);
			Util.waitMillis(timeBetweenRetries);
		}

		System.out.println("createBahnRequestSynchronWithTag() was not successfull"); //NON-NLS
		return "";
	}

	private static ResponseContainer createBahnRequestSynchronWithTagDoIt(
			final Context context,
			final DisplayActivity displayActivity,
			final OPNV opnv,
			final String stationNameForUrl,
			final String requestTag,
			final Stop stop)
	{
		return createBahnRequestSynchronWithTagDoIt(
		 context,
		 displayActivity,
		 opnv,
		 stationNameForUrl,
		 requestTag,
		 stop,
		 true);
	}


	private static ResponseContainer createBahnRequestSynchronWithTagDoIt(
			final Context context,
			final DisplayActivity displayActivity,
			final OPNV opnv,
			final String stationNameForUrl,
			final String requestTag,
			final Stop stop,
			final boolean withTimeoutCheck)
	{
		System.out.println("createBahnRequestSynchronWithTag"); //NON-NLS

		ResponseContainer responseContainer = createBahnRequestSynchronWithTagDoItDoIt(context, displayActivity, opnv, stationNameForUrl, requestTag, stop);

		if(responseContainer.status == false) {
			Util.waitMillis(WAITING_TIME_AFTER_REQEST_TIMEOUT);
			responseContainer = createBahnRequestSynchronWithTagDoItDoIt(context, displayActivity, opnv, stationNameForUrl, requestTag, stop);
		}

		if(withTimeoutCheck) {
			if(responseContainer.status == false) {
				responseContainer.timedOut = true;
			}
		}

		return responseContainer;
	}


	public static ResponseContainer createBahnDepartureStringRequestSynchron(final Context context, final OPNV opnv, final String stationNameForUrl, final String requestTag, final Stop stop) {
		String auskunftUrl = "";
		if (stop == null) auskunftUrl = opnv.getUrl(stationNameForUrl);
		else auskunftUrl = stop.getUrl();

		System.out.println("createBahnDepartureStringRequestSynchron() request url2: " + auskunftUrl); //NON-NLS

		int volleyCounterCreateRequestTime = VolleyResponse.getInstance().getCounter();
		StringRequest stringRequest = new StringRequest(Request.Method.GET, auskunftUrl,
				new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						VolleyResponse.getInstance().receiveResponse(response);
					}
				},

				new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError error) {
						//listenerForTag.onErrorResponse(tag,error);
						// Toast.makeText(context, context.getResources().getString(R.string.app_no_network), Toast.LENGTH_SHORT).show(); //NON-NLS
						System.out.println("ERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERER03"); //NON-NLS
						String responseString = "";
						System.out.println("Request failed"); //NON-NLS
					}
				}
		);

		// Add the request to the RequestQueue.
		stringRequest.setTag(requestTag);
		VolleyQueue.getInstance().getQueue(context).add(stringRequest);
		System.out.println("request added to queue"); //NON-NLS

		return getResponseStringSync(volleyCounterCreateRequestTime);
	}


	public static ResponseContainer createBahnDepartureJsonRequestSynchron(final Context context, final OPNVJsonRequest opnvJsonRequest, final String stationNameForUrl, final String requestTag, final Stop stop) {
		System.out.println("createBahnDepartureJsonRequestSynchron()"); //NON-NLS

		int volleyCounterCreateRequestTime = VolleyResponse.getInstance().getCounter();
		JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
				opnvJsonRequest.getUrl(),
				opnvJsonRequest.getRequestPayloadForDeparture(stop),
				// opnvJsonSuggestionRequest.getRequestPayloadForDeparture(stationNameForUrl),
				new Response.Listener<JSONObject>() {
					@Override
					public void onResponse(JSONObject response) {
						System.out.println("createBahnDepartureJsonRequestSynchron response arrived" ); //NON-NLS
						VolleyResponse.getInstance().receiveResponse(response.toString());
					}
				},

				new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError error) {
						//listenerForTag.onErrorResponse(tag,error);
						// Toast.makeText(context, context.getResources().getString(R.string.app_no_network), Toast.LENGTH_SHORT).show(); //NON-NLS
						System.out.println("ERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERER04"); //NON-NLS
						String responseString = "";
						System.out.println("createBahnDepartureJsonRequestSynchron request failed"); //NON-NLS
					}
				}
		);

		// Add the request to the RequestQueue.
		jsonObjectRequest.setTag(requestTag);
		VolleyQueue.getInstance().getQueue(context).add(jsonObjectRequest);
		System.out.println("request added to queue"); //NON-NLS

		return getResponseStringSync(volleyCounterCreateRequestTime);
	}


	private static ResponseContainer createBahnRequestSynchronWithTagDoItDoIt(
			final Context context,
			final DisplayActivity displayActivity,
			final OPNV opnv,
			final String stationNameForUrl,
			final String requestTag,
			final Stop stop)
	{
		System.out.println("createBahnRequestSynchronWithTag"); //NON-NLS
		waitMinDuration(opnv);

		VolleyQueue.getInstance().getQueue(context).cancelAll(requestTag);
		final int queueNumber = VolleyQueue.getInstance().getQueue(context).getSequenceNumber();
		System.out.println("Queue: " + queueNumber); //NON-NLS
		System.out.println("Tag: " + opnv.getTag()); //NON-NLS

		return opnv.createDepartureRequestSynchron(context, opnv, stationNameForUrl, requestTag, stop);
	}


	private static boolean responseReceived(int volleyCounterRequestTime) {
		// System.out.println("wait for response getCounter from Volley: " + VolleyResponse.getInstance().getCounter() + "   volleyCounterRequestTime: " + volleyCounterRequestTime + "   responseReceived: " + (VolleyResponse.getInstance().getCounter() > volleyCounterRequestTime)); //NON-NLS
		return VolleyResponse.getInstance().getCounter() > volleyCounterRequestTime;
	}


	private static boolean timeoutHasReached(long startTime, long timeoutValue) {
		return System.currentTimeMillis() > startTime + timeoutValue;
	}


	private static ResponseContainer getResponseStringSync(int volleyCounterCreateRequestTime) {
		if (waitForResponse(volleyCounterCreateRequestTime)) {
			//System.out.println(VolleyResponse.getInstance().getResponse());
			return new ResponseContainer(true, VolleyResponse.getInstance().getResponse(), false);
		}
		else {
			return new ResponseContainer(false, "", true);
		}
	}


	private static boolean waitForResponse(int currentVolleyCounter) {
		long startTime = System.currentTimeMillis();

		while(!timeoutHasReached(startTime, timeoutValue) && !responseReceived(currentVolleyCounter)) {
			// System.out.println("waiting cycle: " + (System.currentTimeMillis() - startTime) + " " + timeoutHasReached(startTime, timeoutValue)); //NON-NLS
			// System.out.println("response received: " + responseReceived(currentVolleyCounter)); //NON-NLS
			Util.waitMillis(intervallTime);
		}

		if(timeoutHasReached(startTime, timeoutValue)) {
			System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"); //NON-NLS
			System.out.println("Timeout for response!"); //NON-NLS
			return false;
		}

		System.out.println("response received: " + responseReceived(currentVolleyCounter)); //NON-NLS

		if(responseReceived(currentVolleyCounter)) return true;
		else return false;
	}


	public static void createSuggestionRequestAsynchron(final Context context, final ChangeStopActivity changeStopActivity, String searchString) {
		System.out.println("createSuggestionRequestAsynchron"); //NON-NLS
		waitMinDuration(OPNV.PRIMARY_OPNV);

		System.out.println("Queue" + VolleyQueue.getInstance().getQueue(context).getSequenceNumber()); //NON-NLS

		final String requestTag = SEARCH_TAG + REQUEST_TAG + SUGGESTION_REQUEST + ASYNC_REQUEST + searchString;
		VolleyQueue.getInstance().getQueue(context).cancelAll(requestTag);

		// Request a string response from the provided URL.
		// String auskunftUrl = predictionUrl;
		String auskunftUrl = getSuggestionUrlPrimary(Util.stringParameter2UrlParameter(searchString));
		System.out.println("request url3: " + auskunftUrl); //NON-NLS

		OPNV.PRIMARY_OPNV.createSuggestionRequest(context, true, false, auskunftUrl, searchString, requestTag, changeStopActivity, null, null, null, 0);
	}


	private static void createSuggestionRequestAsynchronForSecondaryOPVN(
			final Context context,
			final DisplayTimerActivity displayActivity,
			final WidgetManager widgetManager,
			final int widgetId,
			final RegPageSettings regPageSettings,
			final OPNV opnv) {
        System.out.println("createSuggestionRequestAsynchronForSecondaryOPVN " + opnv.getTag()); //NON-NLS

		String searchString = "";
		if(regPageSettings != null) {
			searchString = regPageSettings.getStationNameDB();
		}

		waitMinDuration(opnv);

        System.out.println("Queue" + VolleyQueue.getInstance().getQueue(context).getSequenceNumber()); //NON-NLS

        final String requestTag = REQUEST_TAG + SUGGESTION_REQUEST + ASYNC_REQUEST + opnv.getTag();
		VolleyQueue.getInstance().getQueue(context).cancelAll(requestTag);

        String auskunftUrl = opnv.getSuggestionUrl(regPageSettings.getStationNameDB());
        System.out.println("request url secondary opnv " + opnv.getTag() + " : " + auskunftUrl); //NON-NLS

        regPageSettings.setStatusToWaitingForAnswer(opnv);
		opnv.createSuggestionRequest(context, true, true, auskunftUrl, searchString, requestTag, null, regPageSettings, displayActivity, widgetManager, widgetId);
    }


	public static String createSuggestionRequestSynchron(Context context, OPNV opnv, String searchString) {
		return createSuggestionRequestSynchron(context, opnv, searchString, true);
	}


	public static String createSuggestionRequestSynchron(Context context, OPNV opnv, String searchString, boolean withTimeoutCheck) {
		final String requestTag = REQUEST_TAG + SUGGESTION_REQUEST + SYNC_REQUEST + opnv.getTag();

		ResponseContainer rc = null;
		for(int t=0; t<countTries; t++) {
			System.out.println("BahnRequest.createSuggestionRequestSynchron try: " + t);
			rc = createSuggestionRequestSynchronDoIt(context, opnv, searchString, requestTag);
			if(rc.status) {
				System.out.println("BahnRequest.createSuggestionRequestSynchron try: " + t + " was succesful!");
				return rc.content;
			}

			VolleyQueue.getInstance().getQueue(context).cancelAll(requestTag);
			Util.waitMillis(timeBetweenRetries*(t+1));
		}

		System.out.println("BahnRequest.createSuggestionRequestSynchron() was not successfull"); //NON-NLS
		if(withTimeoutCheck)  rc.timedOut = true;
		return "";
	}


	public static void opnvStringSuggestionRequest(final Context context, final boolean asynchron, final boolean secondary, final String url, final String requestTag, final String searchString, final ChangeStopActivity changeStopActivity, final RegPageSettings regPageSettings, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId, final OPNV opnv) {
		System.out.println("Bahnrequest.opnvStringSuggestionRequest()"); //NON-NLS
		System.out.println("request url4: " + url); //NON-NLS

		StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
				new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						String responseString = response;
						System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR suggestionlist " + opnv.getTag()); //NON-NLS
						System.out.println("opnvStringSuggestionRequest suggestion response arrived" /*+ response*/); //NON-NLS
						if(!asynchron) {
							VolleyResponse.getInstance().receiveResponse(responseString);
						}
						else {
							if(!secondary) {
								changeStopActivity.sendSuggestionResponse(responseString);
							}
							else {
								regPageSettings.receiveSuggestionList(context, displayActivity, widgetManager, widgetId, responseString, opnv);
							}
						}

					}
				}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				System.out.println("opnvStringSuggestionRequest failed asynchron: " + asynchron + " secondary: " + secondary); //NON-NLS
				// Toast.makeText(context, context.getResources().getString(R.string.app_no_network), Toast.LENGTH_SHORT).show(); //NON-NLS
			}
		});

		// Add the request to the RequestQueue.
		stringRequest.setTag(requestTag);
		VolleyQueue.getInstance().getQueue(context).add(stringRequest);
		System.out.println("request added to queue"); //NON-NLS
	}


	public static void opnvJsonSuggestionRequest(final Context context, final boolean asynchron, final boolean secondary, OPNVJsonRequest opnvJsonRequest, String requestTag, String searchString, final ChangeStopActivity changeStopActivity, final RegPageSettings regPageSettings, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId, final OPNV opnv) {
		System.out.println("Bahnrequest.opnvJsonSuggestionRequest()"); //NON-NLS
		System.out.println("searchStation: " + searchString);
		JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
				Request.Method.POST,
				opnvJsonRequest.getSuggestionUrl(),
				opnvJsonRequest.getRequestPayloadForSuggestionList(searchString),
				new Response.Listener<JSONObject>() {
					@Override
					public void onResponse(JSONObject response) {
						System.out.println("opnvJsonSuggestionRequest suggestion response arrived" /*+ response*/); //NON-NLS
						if(!asynchron) {
							VolleyResponse.getInstance().receiveResponse(response.toString());
						}
						else {
							if(!secondary) {
								changeStopActivity.sendSuggestionResponse(response.toString());
							}
							else {
								regPageSettings.receiveSuggestionList(context, displayActivity, widgetManager, widgetId, response.toString(), opnv);
							}
						}
					}
				},
				new Response.ErrorListener(){
					@Override
					public void onErrorResponse(VolleyError error){
						System.out.println("opnvJsonSuggestionRequest failed asynchron: " + asynchron + " secondary: " + secondary); //NON-NLS
						// Toast.makeText(context, context.getResources().getString(R.string.app_no_network), Toast.LENGTH_SHORT).show(); //NON-NLS
					}
				}
		);

		// Add the request to the RequestQueue.
		jsonObjectRequest.setTag(requestTag);
		VolleyQueue.getInstance().getQueue(context).add(jsonObjectRequest);
	}


	private static ResponseContainer createSuggestionRequestSynchronDoIt(final Context context, OPNV opnv, String searchString, String requestTag) {
		System.out.println("Bahnrequest.createSuggestionRequestSynchronDoIt() opnvtag: " + opnv.getTag() + " searchString: " + searchString + " requestTag: " + requestTag); //NON-NLS
		waitMinDuration(opnv);
		VolleyQueue.getInstance().getQueue(context).cancelAll(requestTag);
		System.out.println("Queue " + VolleyQueue.getInstance().getQueue(context).getSequenceNumber()); //NON-NLS
		int currentVolleyCounter = VolleyResponse.getInstance().getCounter();
		String auskunftUrl = opnv.getSuggestionUrl(searchString);

		opnv.createSuggestionRequest(context, false, false, auskunftUrl, searchString, requestTag, null, null, null, null, 0);

		System.out.println("request added to queue. Counter: " + currentVolleyCounter); //NON-NLS
		if(waitForResponse(currentVolleyCounter)) {
			System.out.println("createSuggestionRequestSynchronDoIt response: " + Util.cutString(VolleyResponse.getInstance().getResponse(), 1000)); //NON-NLS
			String response = VolleyResponse.getInstance().getResponse();

			return new ResponseContainer(true, response, false);
		}
		else {  // time out
			System.out.println("Time out response is empty string"); //NON-NLS
			return new ResponseContainer(false, "", true);
		}
	}


	public static String getSuggestionUrlPrimary(String search) {
		return OPNV.PRIMARY_OPNV.getSuggestionUrl(search);
	}


	private static void waitMinDuration(OPNV opnv) {
		long lastStartPoint = 0;
		if(startTime.containsKey(opnv.getTag())) {
			lastStartPoint = startTime.get(opnv.getTag());
			long currentTime = System.currentTimeMillis();

			if(currentTime - lastStartPoint < MIN_WAITING_TIME) {
				Util.waitMillis((int)(MIN_WAITING_TIME - (currentTime - lastStartPoint)));
			}
		}

		startTime.put(opnv.getTag(), System.currentTimeMillis());
	}


	private static void clearPostfix(Context context, int widgetId) {
		RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);
		views.setTextViewText(R.id.textViewLetzteAktualisierungWidget, HaltestellenWidget.updatePostfix(context, widgetId));
	}


	public static ResponseContainer createBahnDepartureStringPostRequestSynchron(final Context context, final String requestTag, final OPNV opnv, final String id, final String name) {
		System.out.println("createBahnDepartureStringPostRequestSynchron() request url2: " + opnv.getUrl(id)); //NON-NLS

		int volleyCounterCreateRequestTime = VolleyResponse.getInstance().getCounter();
		StringRequest stringRequest = new StringRequest(Request.Method.POST, opnv.getUrl(id),
				new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						VolleyResponse.getInstance().receiveResponse(response);
					}
				},

				new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError error) {
						//listenerForTag.onErrorResponse(tag,error);
						// Toast.makeText(context, context.getResources().getString(R.string.app_no_network), Toast.LENGTH_SHORT).show(); //NON-NLS
						System.out.println("ERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERER05"); //NON-NLS
						String responseString = "";
						System.out.println("Request failed"); //NON-NLS
					}
				}
		)
		{
			/*
			@Override
			protected Map<String,String> getParams(){
				Map<String,String> params = new HashMap<String, String>();
				params.put("table[departure][stationId]", id);
				params.put("table[departure][stationName]", name);
				params.put("table[departure][platformVisibility]", "1");
				params.put("table[departure][transport]", "0,1,2,3,4,15,6");
				params.put("table[departure][useAllLines]", "1");
				params.put("table[departure][linesFilter]", "");
				params.put("table[departure][optimizedForStation]", "0");
				params.put("table[departure][rowCount]", "10");
				params.put("table[departure][refreshInterval]", "30000");
				params.put("table[departure][distance]", "0");
				params.put("table[departure][marquee]", "0");
				params.put("table[sortBy]", "1");
				params.put("table[sortBy]", "0");
				return params;
			}
			*/
			@Override
			protected Map<String,String> getParams(){
				Map<String,String> params = new HashMap<String, String>();
				params.put("table[departure][stationId]", id);
				params.put("table[departure][stationName]", name);
				params.put("table[departure][platformVisibility]", "1");
				params.put("table[departure][transport]", "0,1,2,3,4,15,6");
				params.put("table[departure][useAllLines]", "1");
				params.put("table[departure][linesFilter]", "");
				params.put("table[departure][optimizedForStation]", "0");
				params.put("table[departure][rowCount]", "6");
				params.put("table[departure][refreshInterval]", "30000");
				params.put("table[departure][distance]", "0");
				params.put("table[departure][marquee]", "0");
				params.put("table[sortBy]", "0");
				return params;
			}


		};

		// Add the request to the RequestQueue.
		stringRequest.setTag(requestTag);
		VolleyQueue.getInstance().getQueue(context).add(stringRequest);
		System.out.println("request added to queue"); //NON-NLS

		return getResponseStringSync(volleyCounterCreateRequestTime);
	}


	public static void createBahnDepartureStringPostRequestAsynchron(final Context context, final String requestTag, final OPNV opnv, final String id, final String name, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId, final Stop stop) {
		System.out.println("createBahnDepartureStringPostRequestAsynchron() request url2: " + opnv.getUrl(id)); //NON-NLS

		StringRequest stringRequest = new StringRequest(Request.Method.POST, opnv.getUrl(id),
				new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						System.out.println("RRR createBahnDepartureStringPostRequestAsynchron RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR"); //NON-NLS
						System.out.println("Tag: " + opnv.getTag()); //NON-NLS
						System.out.println("Request response: " + Util.printPart(response.toString(), Util.MESSAGE_LENGTH)); //NON-NLS

						if(displayActivity != null) {
							System.out.println("displayActivity is not null"); //NON-NLS
							displayActivity.sendResponse(opnv, name, response.toString());
						}

						if(widgetManager != null) {
							System.out.println("displayActivity is not null"); //NON-NLS
							HaltestellenWidget.updateBoard(context, widgetId, stop, response.toString());
						}
					}
				},

				new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError error) {
						//listenerForTag.onErrorResponse(tag,error);
						// Toast.makeText(context, context.getResources().getString(R.string.app_no_network), Toast.LENGTH_SHORT).show(); //NON-NLS
						System.out.println("ERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERER06"); //NON-NLS
						String responseString = "";
						System.out.println("Request failed + " + requestTag + " " + opnv.getTag() + " " + error.getMessage() ); //NON-NLS
					}
				}
		)
		{
			@Override
			protected Map<String,String> getParams(){
				return opnv.getRequestMapPayloadForDeparture(id, name);
			}

		};


		// Add the request to the RequestQueue.
		stringRequest.setTag(requestTag);
		VolleyQueue.getInstance().getQueue(context).add(stringRequest);
		System.out.println("string request post added to queue"); //NON-NLS
	}
}


