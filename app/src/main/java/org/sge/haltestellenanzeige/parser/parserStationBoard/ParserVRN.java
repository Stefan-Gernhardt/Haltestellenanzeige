package org.sge.haltestellenanzeige.parser.parserStationBoard;

import android.text.Html;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRN;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

/**
 * Created by Admin on 18.02.2018.
 */

public class ParserVRN extends Parser {
    public ParserVRN() { }
    public ParserVRN(String response) {
        parse(response);
    }

    @Override
    public String getDepartureRow(int r) { return departureArray.get(r); }

    @Override
    public String getPredictionRow(int r) {
        return delayArray.get(r);
    }

    @Override
    public Integer getPredictionSeverityRow(int r) {
        return delaySevArray.get(r);
    }

    @Override
    public String getLineRow(int r) {
        return linieArray.get(r);
    }

    @Override
    public String getDestinationRow(int r) {
        return directionArray.get(r);
    }

    @Override
    public String getPlatformRow(int r) {
        try {
            return platformArray.get(r);
        }
        catch (IndexOutOfBoundsException e) {
            countExceptions++;
            e.printStackTrace();
            return "";
        }
    }


    @Override
    public String getOPNVTag() {
        return OPNV_VRN.getInstance().getTag();
    }


    @Override
    protected void parseDoing(String jsonResponseString) {
        System.out.println("parseDoing VRN: " + Util.printPart(jsonResponseString, Util.MESSAGE_LENGTH)); //NON-NLS
        try {
            String jsonString = Util.convertStringFromISO8859ToUTF8(jsonResponseString);

            JSONObject reader = null;
            try {
                reader = new JSONObject(jsonString);
            } catch (JSONException e) {
                System.out.println("parseSuggestionListResponse exception " + getOPNVTag()); //NON-NLS
                countExceptions++;
                System.out.println(jsonString); //NON-NLS
            }


            JSONArray departureList = getDepartureList(reader, jsonString);
            if (departureList == null) return;

            for (int row = 0; row < Math.min(departureList.length(), UI_StationDisplay.NUMBER_ROWS); row++) {
                try {
                    JSONObject servingLine = getServingLine(departureList.getJSONObject(row));

                    String linie = "";
                    String direction = "";
                    String departureTime = "";
                    String delay = "";

                    if (servingLine != null) {
                        direction = getDirection(servingLine);
                        String linieName = getLinieName(servingLine);
                        String linieType = getLinieType(servingLine);
                        linie = linieName;
                    }

                    Date sollDate = null;
                    JSONObject dateTime = getDateTime(departureList.getJSONObject(row));
                    if (dateTime != null) {
                        String minute = getMinute(dateTime);
                        String hour   = getHour(dateTime);
                        String day    = getDay(dateTime);
                        String month  = getMonth(dateTime);
                        String year   = getYear(dateTime);

                        sollDate = new SimpleDateFormat("mm hh dd MM yyyy").parse(minute + " " + hour + " " + day +  " " + month +  " " + year );

                        departureTime = hour + ":" + minute;
                    }

                    Date istDate = null;
                    JSONObject realDateTime = getRealDateTime(departureList.getJSONObject(row));
                    if (realDateTime != null) {
                        String minute = getMinute(realDateTime);
                        String hour   = getHour(realDateTime);
                        String day    = getDay(realDateTime);
                        String month  = getMonth(realDateTime);
                        String year   = getYear(realDateTime);

                        istDate = new SimpleDateFormat("mm hh dd MM yyyy").parse(minute + " " + hour + " " + day +  " " + month +  " " + year );
                        delay = getDelayMinutes(sollDate, istDate);
                    }

                    if(row<5) System.out.println("ParserVRN row: " + row + "  " + departureTime + "  " + delay + "  " + computeDelayText(row, delay) + "  " + linie + "  " + direction); //NON-NLS
                    delayArray.set(row, computeDelayText(row, delay));
                    delaySevArray.set(row, computeDelaySeverity(delay));
                    departureArray.set(row, departureTime);

                    // roubstness test
                    // if(row>=0) {
                    //    departureArray.set(row, DEFAULT_SIGN);
                    //    return;
                    // }

                    directionArray.set(row, direction);
                    linieArray.set(row, linie);

                } catch (JSONException e) {
                    countExceptions++;
                    System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
                    System.out.println("parseSuggestionListResponse row number: " + row); //NON-NLS
                    System.out.println("parseSuggestionListResponse row content: " + jsonString); //NON-NLS
                } catch (Exception e) {
                    countExceptions++;
                    System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
                    System.out.println("parseSuggestionListResponse row number: " + row); //NON-NLS
                    System.out.println("parseSuggestionListResponse row content: " + jsonString); //NON-NLS
                }
            }
        }
        catch (Exception e) {
            countExceptions++;
            System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
            System.out.println("responseString: " + jsonResponseString);
            parsingWithoutWarnings = false;
            return;
        }

        parsingWithoutWarnings = true;
    }


    private String computeDelayText(int row, String delay) {
        if(delay == null) return "";
        if(delay.isEmpty()) return "";

        if(delay.contentEquals("0")) return PUENKTLICH;

        return delay;
    }


    private String getDelayMinutes(JSONObject servingLine) {
        // System.out.println("servingLine: " + servingLine.toString());

        if(servingLine == null) return "";

        String delay = Html.fromHtml(servingLine.optString("delay", "")).toString(); //NON-NLS

        // System.out.println("delayToString: " + delay);
        return delay;
    }

    private String getDelayMinutes(Date sollDate, Date istDate) {
        if(sollDate == null) return "";
        if(istDate == null) return "";

        long differenceInMilliSeconds = istDate.getTime() - sollDate.getTime();
        long differenceInMinutes = differenceInMilliSeconds / (1000 * 60);
        return "" + differenceInMinutes;
    }

    private String getTimeStampPart(JSONObject dateTime, String part) {
        if(dateTime == null) return "";

        try {
            return extendToTwoDigits(dateTime.getString(part)); //NON-NLS
        } catch (JSONException e) {
            countExceptions++;
            e.printStackTrace();
            return "";
        }
    }

    private String getMinute(JSONObject dateTime) {
        return getTimeStampPart(dateTime, "minute");
    }

    private String getHour(JSONObject dateTime) {
        return getTimeStampPart(dateTime, "hour");
    }

    private String getDay(JSONObject dateTime) {
        return getTimeStampPart(dateTime, "day");
    }

    private String getMonth(JSONObject dateTime) {
        return getTimeStampPart(dateTime, "month");
    }

    private String getYear(JSONObject dateTime) {
        return getTimeStampPart(dateTime, "year");
    }



    private JSONObject getDateTime(JSONObject departure) {
        try {
            return departure.getJSONObject("dateTime"); //NON-NLS
        } catch (JSONException e) {
            countExceptions++;
            e.printStackTrace();
            return null;
        }
    }

    private JSONObject getRealDateTime(JSONObject departure) {
        try {
            return departure.getJSONObject("realDateTime"); //NON-NLS
        } catch (JSONException e) {
            // this field is optional so no exceptions counting countExceptions++;
            // e.printStackTrace();
            return null;
        }
    }

    private String getDirection(JSONObject servingLine) {
        if(servingLine == null) return "";

        try {
            return Html.fromHtml(servingLine.getString("direction")).toString(); //NON-NLS
        } catch (JSONException e) {
            countExceptions++;
            e.printStackTrace();
            return "";
        }
    }


    private String getLinieType(JSONObject servingLine) {
        if(servingLine == null) return "";

        try {
            return Html.fromHtml(servingLine.getString("name")).toString(); //NON-NLS
        } catch (JSONException e) {
            countExceptions++;
            e.printStackTrace();
            return "";
        }
    }


    private String getLinieName(JSONObject servingLine) {
        if(servingLine == null) return "";

        try {
            return Html.fromHtml(servingLine.getString("number")).toString(); //NON-NLS
        } catch (JSONException e) {
            e.printStackTrace();
            countExceptions++;
            return "";
        }
    }


    private JSONArray getDepartureList(JSONObject reader, String json) {
        if(reader.isNull("departureList")) return null; //NON-NLS
        JSONObject stationObject = reader.optJSONObject("departureList"); //NON-NLS

        if(stationObject != null) {
            JSONObject departureObject = stationObject.optJSONObject("departure"); //NON-NLS
            if(departureObject != null) {
                JSONArray depListArray = new JSONArray();
                depListArray.put(departureObject);
                return depListArray;
            }
        }

        try {
            if(reader.isNull("departureList")) return null; //NON-NLS
            JSONArray stationArray = reader.getJSONArray("departureList"); //NON-NLS

            return stationArray;
        } catch (JSONException e) {
            countExceptions = countExceptions + 1;
            System.out.println("Warning. Invalid departureList in ParserVRN.getDepartureList()");
            e.printStackTrace();
            System.out.println("Exception in method ParserVRN.getDepartureList!");
            System.out.println("json: ");
            Util.printStringInMultipleLines(json);
        }

        return null;
    }


    private JSONObject getServingLine(JSONObject departure) {
        try {
            JSONObject servingLine = departure.getJSONObject("servingLine"); //NON-NLS
            return servingLine;
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

}
