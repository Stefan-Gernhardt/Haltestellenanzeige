package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;

import java.util.ArrayList;

/**
 * Created by Admin on 25.03.2018.
 */

public class ParserSuggestionList_DB_SVV extends ParserSuggestionList {

    public ParserSuggestionList_DB_SVV() { }
    public ParserSuggestionList_DB_SVV(OPNV opnv, String jsonStringSuggestionList) {
        parseSuggestionListResponse(opnv, jsonStringSuggestionList);
    }

    public ArrayList<Stop> parseSuggestionListResponse(OPNV opnv, String jsonStringPara) {
        System.out.println("read json suggestion list db"); //NON-NLS
        getList().clear();
        String jsonString = ParserSuggestionList.extractJsonString(jsonStringPara);

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
                    String id = getStringJasonWithExceptionHandling(station, "id"); //NON-NLS
                    String valueWork = getStringJasonWithExceptionHandling(station, "value"); //NON-NLS
                    String value = computeValue(id, valueWork);
                    String extId = getStringJasonWithExceptionHandling(station, "extId"); //NON-NLS
                    String type = getStringJasonWithExceptionHandling(station, "type"); //NON-NLS
                    String typeStr = getStringJasonWithExceptionHandling(station, "typeStr"); //NON-NLS
                    double xcoord = Double.parseDouble(insertDecimalPointXCoord(getStringJasonWithExceptionHandling(station, "xcoord"))); //NON-NLS
                    double ycoord = Double.parseDouble(insertDecimalPointYCoord(getStringJasonWithExceptionHandling(station, "ycoord"))); //NON-NLS
                    String state = getStringJasonWithExceptionHandling(station, "state"); //NON-NLS
                    String prodClass = getStringJasonWithExceptionHandling(station, "prodClass"); //NON-NLS
                    String weight = getStringJasonWithExceptionHandling(station, "weight"); //NON-NLS

                    // System.out.println("value: " + value);
                    // System.out.println("xcoord: " + xcoord);
                    // System.out.println("ycoord: " + ycoord);

                    // to make sure it is a stop/station and not something else like location
                    if (type != null) {
                        if ("1".contentEquals(type)) {
                            // System.out.println("  parseSuggestionListResponse()  opnv.tag: " + opnv.getTag());
                            // StopDB stopDB = new StopDB(opnv, value, id, extId, type, typeStr, xcoord, ycoord, state, prodClass, weight);
                            // StopDB stopDB = new StopDB(opnv, value, id, extId, type, typeStr, xcoord, ycoord, state, prodClass, weight, opnv.getUrl(extId));
                            Stop stop = new Stop(opnv, value, extId, xcoord, ycoord, opnv.getUrl(extId));

                            // System.out.println("  parseSuggestionListResponse() stop: " + stop.getName() + "  opnv.tag: " + stop.getOPNV().getTag() + "  x: " + stop.getXCoord() + "  y: " + stop.getYCoord());
                            getList().add(stop);
                            // System.out.println("  parseSuggestionListResponse() stop: " + stopGet.getName() + "  opnv.tag: " + stopGet.getOPNV().getTag() + "  x: " + stopGet.getXCoord() + "  y: " + stopGet.getYCoord());
                        }
                    }

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

    private String computeValue(String id, String valueWork) {
        // id example:
        // "A=1@O=Tivoli (RNZ), Viernheim@X=8565902@Y=49528460@U=80@L=000518554@B=1@p=1550613617@"

        // value work example:
        // "Tivoli &#x0028;RNZ&#x0029;, Viernheim"

        //System.out.println("computeValue " + id + " " +  valueWork);

        try {
            int startAtSign = id.indexOf("@");
            // System.out.println("startAtSign " + startAtSign);

            int startEqualSign = id.indexOf("=", startAtSign);
            // System.out.println("startEqualSign " + startEqualSign);

            int end = id.indexOf("@", startEqualSign);
            // System.out.println("end " + end);

            String returnString =  id.substring(startEqualSign + 1, end);
            // System.out.println("returnString " + returnString);

            return returnString;
        }
        catch (RuntimeException e) {
            return valueWork;
        }

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
