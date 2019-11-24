package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import android.text.Html;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VGN;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.util.Util;

import java.util.ArrayList;

public class ParserSuggestionList_VGN extends ParserSuggestionList {
    public ParserSuggestionList_VGN() { }

    public ParserSuggestionList_VGN(OPNV_VGN opnv, String suggestionString) {
        parseSuggestionListResponse(opnv, suggestionString);
    }

    @Override
    public ArrayList<Stop> parseSuggestionListResponse(OPNV opnv, String jsonStringPara) {
        System.out.println("ParserSuggestionList_VGN::parseSuggestionListResponse"); //NON-NLS

        getList().clear();

        String jsonStringExtract = ParserSuggestionList.extractJsonString(jsonStringPara);
        System.out.println("ParserSuggestionList_VGN::jasonStringExtract"); //NON-NLS

        String jsonString = Util.convertStringFromISO8859ToUTF8(jsonStringExtract);
        System.out.println("ParserSuggestionList_VGN::start parsing"); //NON-NLS

        try {
            JSONObject reader = null;
            try {
                reader = new JSONObject(jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
                return getList();
            }

            JSONArray stationArray = null;
            try {
                stationArray = reader.optJSONArray("data"); //NON-NLS //NON-NLS
            } catch (Exception e) {
                e.printStackTrace();
                return getList();
            }

            if (stationArray == null) {
                System.out.println("ParserSuggestionList_VGN::stationArray is null"); //NON-NLS
            } else {
                System.out.println("ParserSuggestionList_VGN::stationArray found size: " + stationArray.length()); //NON-NLS
                for (int s = 0; s < stationArray.length(); s++) {
                    // System.out.println("ParserSuggestionList_VGN parseSuggestionListResponse s: " + s);
                    JSONObject station = null;
                    JSONObject ref = null;
                    try {
                        station = stationArray.getJSONObject(s);

                        String   name = Html.fromHtml(station.getString("object")).toString(); //NON-NLS
                        String     id = Html.fromHtml(station.getString("name")).toString(); //NON-NLS
                        String xCoord = Html.fromHtml(station.getString("x")).toString(); //NON-NLS
                        String yCoord = Html.fromHtml(station.getString("y")).toString(); //NON-NLS

                        if((xCoord != null) && (yCoord != null) && (name != null) && (id != null)) {
                            if(id.startsWith("de:")) {
                                getList().add(new Stop(opnv, name, id, OPNV_VGN.xcoord, OPNV_VGN.ycoord, opnv.getUrl(id)));
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("parseSuggestionListResponse exception ParserSuggestionList_VGN suggestion list: " + jsonString); //NON-NLS
            return getList();
        }

        return getList();
    }

}
