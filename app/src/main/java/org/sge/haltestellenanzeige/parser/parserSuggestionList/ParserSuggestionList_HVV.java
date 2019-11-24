package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.stop.Stop;

import java.util.ArrayList;

public class ParserSuggestionList_HVV extends ParserSuggestionList {
    public ParserSuggestionList_HVV() {}

    public ParserSuggestionList_HVV(OPNV opnv, String jsonStringSuggestionList) {
        parseSuggestionListResponse(opnv, jsonStringSuggestionList);
    }

    @Override
    public ArrayList<Stop> parseSuggestionListResponse(OPNV opnv, String jsonStringSuggestionList) {
        System.out.println("read json suggestion list HVV"); //NON-NLS
        getList().clear();
        String jsonString = ParserSuggestionList.extractJsonString(jsonStringSuggestionList);

        try {
            JSONObject reader = null;
            try {
                reader = new JSONObject(jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            // check return code
            try {
                String returnCode = reader.getString("returnCode");
                if(returnCode == null) return getList();
                if(!returnCode.contentEquals("OK")) return getList();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            // list of stops
            JSONArray stationArray = null;
            try {
                stationArray = reader.getJSONArray("results"); //NON-NLS
            } catch (JSONException e) {
                // result list is empty
                return getList();
            }

            for (int s = 0; s < stationArray.length(); s++) {
                JSONObject station = null;
                try {
                    station = stationArray.getJSONObject(s);
                    if(s<5) System.out.println("station string db " + s + ": " + station.toString()); //NON-NLS
                    parseStation(opnv, station);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("parseSuggestionListResponse exception db suggestion list: " + jsonString); //NON-NLS
        }

        return getList();
    }

    private void parseStation(OPNV opnv, JSONObject station) {
        String name    = getStringJasonWithExceptionHandling(station, "name"); //NON-NLS
        String id      = getStringJasonWithExceptionHandling(station, "id"); //NON-NLS
        String type    = getStringJasonWithExceptionHandling(station, "type"); //NON-NLS
        String typeStr = getStringJasonWithExceptionHandling(station, "typeStr"); //NON-NLS

        double x = 0;
        double y = 0;
        JSONObject coords = null;
        try {
            coords = station.getJSONObject("coordinate");
            if(coords != null) {
                String xString = coords.getString("x");
                String yString = coords.getString("y");

                x = Double.parseDouble(xString);
                y = Double.parseDouble(yString);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if (type != null) {
            if ("STATION".contentEquals(type)) {
                Stop stop = new Stop(opnv, name, id, x, y, opnv.getUrl(id));
                getList().add(stop);
            }
        }

    }

}
