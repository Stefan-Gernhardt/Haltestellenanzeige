package org.sge.haltestellenanzeige.opnv.opnvs;


import android.content.Context;

import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.net.ResponseContainer;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVRR;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VRR;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.widget.WidgetManager;

import java.util.HashMap;
import java.util.Map;

public class OPNV_VRR extends OPNVStringRequest {
    public final static double xcoord=6.857103;
    public final static double ycoord=51.349555;

    private static OPNV_VRR instance=null;


    public static OPNV_VRR getInstance() {
        if(instance == null) {
            instance = new OPNV_VRR();
        }
        return instance;
    }


    @Override
    public boolean isRegioCoord() { return true; };


    @Override
    public ResponseContainer createDepartureRequestSynchron(final Context context, final OPNV opnvStringRequest, final String stationNameForUrl, final String requestTag, final Stop stop) {
        return BahnRequest.createBahnDepartureStringPostRequestSynchron(context, requestTag, this, stop.getId(), stop.getName());
    }


    @Override
    public void createDepartureRequestAsynchron(final Context context, final OPNV opnvJsonRequest, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId, final String requestTag, final Stop stop) {
        BahnRequest.createBahnDepartureStringPostRequestAsynchron(context, requestTag, this, stop.getId(), stop.getName(), displayActivity, widgetManager, widgetId, stop);
    }

    @Override
    public Map<String,String> getRequestMapPayloadForDeparture(String stationId, String stationName) {
        System.out.println("getRequestPayloadForDeparture for VRR");
				Map<String,String> params = new HashMap<String, String>();
				params.put("table[departure][stationId]", stationId);
				params.put("table[departure][stationName]", stationName);
				params.put("table[departure][platformVisibility]", "1");
				params.put("table[departure][transport]", "0,1,2,3,4,15,6");
				params.put("table[departure][useAllLines]", "1");
				params.put("table[departure][linesFilter]", "");
				params.put("table[departure][optimizedForStation]", "0");
				params.put("table[departure][rowCount]", "" + UI_StationDisplay.NUMBER_ROWS);
				params.put("table[departure][refreshInterval]", "");
				params.put("table[departure][distance]", "0");
				params.put("table[departure][marquee]", "0");
				params.put("table[sortBy]", "1");
				params.put("table[sortBy]", "0");
				return params;
    }


    @Override
    public String getTag() {
        return "VRR";
    }


    @Override
    public String getUrl(String station) {
        return "https://haltestellenmonitor.vrr.de/backend/api/stations/table";
    }


    @Override
    public String getSuggestionUrl(String searchString) {
        // https://haltestellenmonitor.vrr.de/backend/api/stations/search?query=chlod
        return "https://haltestellenmonitor.vrr.de/backend/api/stations/search?query=" + searchString;
    }


    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_VRR();
    }


    @Override
    public Parser newParser() {
        return new ParserVRR();
    }
}
