package org.sge.haltestellenanzeige.opnv;

import android.content.Context;

import org.json.JSONObject;
import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.net.ResponseContainer;
import org.sge.haltestellenanzeige.settings.RegPageSettings;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.ui.ChangeStopActivity;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;
import org.sge.haltestellenanzeige.widget.WidgetManager;

public abstract class OPNVJsonRequest extends OPNVimpl {

    public abstract JSONObject getRequestPayloadForSuggestionList(String searchStringForStation);
    public abstract JSONObject getRequestPayloadForDeparture(String stationId, String stationName);
    public abstract JSONObject getRequestPayloadForDeparture(Stop stop);

    public String getUrl() {
        return getUrl("");
    }

    public String getSuggestionUrl() {
        return getSuggestionUrl("");
    }

    public void createSuggestionRequest(final Context context, boolean asynchron, boolean secondary, String url, String searchString, String requestTag, final ChangeStopActivity changeStopActivity, final RegPageSettings regPageSettings, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId) {
        System.out.println("OPNVJsonRequest.createSuggestionRequest()"); //NON-NLS
        System.out.println("searchString: " + searchString); //NON-NLS
        BahnRequest.opnvJsonSuggestionRequest(context, asynchron, secondary,this, requestTag, searchString, changeStopActivity, regPageSettings, displayActivity, widgetManager, widgetId, this);
    }


    public ResponseContainer createDepartureRequestSynchron(final Context context, final OPNV opnvJsonRequest, final String stationNameForUrl, final String requestTag, final Stop stop) {
        return BahnRequest.createBahnDepartureJsonRequestSynchron(context, this, stationNameForUrl, requestTag, stop);
    }


    public void createDepartureRequestAsynchron(final Context context, final OPNV opnvJsonRequest, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId, final String requestTag, final Stop stop) {
        BahnRequest.createDepartureJsonRequestAsynchron(context, this, displayActivity, widgetManager, widgetId, requestTag, stop);
    }
}
