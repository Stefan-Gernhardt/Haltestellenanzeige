package org.sge.haltestellenanzeige.opnv.opnvs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVJsonRequest;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserHVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_HVV;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

public class OPNV_HVV extends OPNVJsonRequest {
    private static OPNV_HVV instance=null;


    public static OPNV_HVV getInstance() {
        if(instance == null) {
            instance = new OPNV_HVV();
        }
        return instance;
    }

    @Override
    public JSONObject getRequestPayloadForSuggestionList(String searchStringForStation) {
        try {
            JSONObject requestPayload = new JSONObject();

            requestPayload.put("version", 30);

            JSONObject theNameJSONObject = new JSONObject();
            theNameJSONObject.put("name", searchStringForStation);
            theNameJSONObject.put("type", "STATION");

            requestPayload.put("theName", theNameJSONObject);
            requestPayload.put("maxList", UI_StationDisplay.NUMBER_ROWS);
            requestPayload.put("coordinateType", "EPSG_4326");

            // System.out.println("payload string for suggestion: ");
            // System.out.println(requestPayload.toString(3));

            return requestPayload;
        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println("Error: No payload for: " + searchStringForStation + " in method getRequestPayloadForSuggestionList()");
        return null;
    }


    public JSONObject getRequestPayloadForDeparture(String stationId, String stationName) {
        System.out.println("getRequestPayloadForDeparture for HVV");
        try {
            JSONObject requestPayload = new JSONObject();

            requestPayload.put("version", 30);

            JSONObject stationJSONObject = new JSONObject();
            stationJSONObject.put("id", stationId);
            stationJSONObject.put("name", stationName);
            stationJSONObject.put("type", "STATION");
            requestPayload.put("station", stationJSONObject);

            JSONObject timeJSONObject = new JSONObject();
            timeJSONObject.put("date", "" + Util.getCurrentDateDe());
            timeJSONObject.put("time", "" + Util.getCurrentTimeDe());
            requestPayload.put("time", timeJSONObject);

            requestPayload.put("maxList", UI_StationDisplay.NUMBER_ROWS);

            JSONArray serviceTypesJSONArray = new JSONArray();
            serviceTypesJSONArray.put("BUS");
            serviceTypesJSONArray.put("ZUG");
            serviceTypesJSONArray.put("FAEHRE");
            requestPayload.put("serviceTypes", serviceTypesJSONArray);

            requestPayload.put("useRealtime", true);
            requestPayload.put("maxTimeOffset", 120);

            System.out.println("payload string getRequestPayloadForDeparture: ");
            System.out.println(requestPayload.toString(3));

            return requestPayload;
        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println("Error: No payload for: " + stationId + " in method getRequestPayloadForDeparture()");
        return null;
    }


    public JSONObject getRequestPayloadForDeparture(Stop stop) {
        System.out.println("getRequestPayloadForDeparture for HVV");
        return getRequestPayloadForDeparture(stop.getId(), stop.getName());
    }


    @Override
    public String getTag() {
        return "HVV";
    }


    @Override
    public String getUrl(String station) {
        return "https://www.hvv.de/geofox/departureList";
    }


    @Override
    public String getSuggestionUrl(String searchString) {
        return "https://www.hvv.de/geofox/checkName";
    }


    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_HVV();
    }


    @Override
    public Parser newParser() {
        return new ParserHVV();
    }
}
