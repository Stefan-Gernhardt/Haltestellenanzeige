package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRR;
import org.sge.haltestellenanzeige.stop.Stop;
import java.util.ArrayList;

/**
 * Created by Admin on 25.03.2018.
 */

public class ParserSuggestionList_VRR extends ParserSuggestionList {

    public ParserSuggestionList_VRR() { }
    public ParserSuggestionList_VRR(OPNV opnv, String jsonStringSuggestionList) {
        parseSuggestionListResponse(opnv, jsonStringSuggestionList);
    }

    public ArrayList<Stop> parseSuggestionListResponse(OPNV opnv, String jsonStringPara) {
        System.out.println("read json suggestion list db"); //NON-NLS
        getList().clear();
        String jsonString = org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList.extractJsonString(jsonStringPara);

        try {
            JSONObject reader = null;
            try {
                reader = new JSONObject(jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            JSONArray stationArray = null;
            try {
                stationArray = reader.getJSONArray("suggestions"); //NON-NLS
            } catch (JSONException e) {
                e.printStackTrace();
            }

            for (int s = 0; s < stationArray.length(); s++) {
                JSONObject station = null;
                try {
                    station = stationArray.getJSONObject(s);
                    if(s<5) System.out.println("station string db " + s + ": " + station.toString()); //NON-NLS
                    String data_id = getStringJasonWithExceptionHandling(station, "data"); //NON-NLS
                    String value_name = getStringJasonWithExceptionHandling(station, "value"); //NON-NLS

                    Stop stop = new Stop(opnv, value_name, data_id, OPNV_VRR.xcoord, OPNV_VRR.ycoord, opnv.getUrl(data_id));
                    getList().add(stop);
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


    public String insertDecimalPointCoord(String coord) {
        final int countDigetsAfterPoint = 6;

        if(coord == null) return "0";
        if(coord.length() < countDigetsAfterPoint) return "0";

        boolean numberIsNegative = false;
        if(coord.startsWith("-")) {
            numberIsNegative = true;
            coord = coord.substring(1);
        }

        coord = "0" + coord;
        int lengthXCoordString = coord.length();
        int countDigitsBeforePoint = lengthXCoordString - countDigetsAfterPoint;

        String xCordWithDecimalPoint = coord.substring(0, countDigitsBeforePoint) + "." + coord.substring(countDigitsBeforePoint);

        if(numberIsNegative) xCordWithDecimalPoint = "-" + xCordWithDecimalPoint;

        return xCordWithDecimalPoint;
    }


    public String insertDecimalPointXCoord(String xCoord) {
        return insertDecimalPointCoord(xCoord);
    }


    public String insertDecimalPointYCoord(String yCoord) {
        return  insertDecimalPointCoord(yCoord);
    }

}
