package org.sge.haltestellenanzeige.parser.parserStationBoard;

import android.text.Html;

import org.htmlcleaner.HtmlCleaner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VBN;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

public class ParserVBN extends Parser {
    private HtmlCleaner htmlCleaner = new HtmlCleaner();

    public ParserVBN() { }
    public ParserVBN(String response) {
        parse(response);
    }


    @Override
    public String getOPNVTag() {
        return OPNV_VBN.getInstance().getTag();
    }


    private JSONArray getDepartureList(JSONObject reader) {
        try {
            if(reader.isNull("journey")) return null; //NON-NLS
            JSONArray stationArray = reader.getJSONArray("journey"); //NON-NLS
            return stationArray;
        } catch (JSONException e) {
            countExceptions++;
            e.printStackTrace();
        }

        return null;
    }


    private JSONObject getRow(JSONObject departure) {
        try {
            JSONObject servingLine = departure.getJSONObject("servingLine"); //NON-NLS
            return servingLine;
        } catch (JSONException e) {
            countExceptions++;
            e.printStackTrace();
        }

        return null;
    }


    private String getDirection(JSONObject servingLine) {
        if(servingLine == null) return "";

        try {
            return Html.fromHtml(servingLine.getString("st")).toString(); //NON-NLS
        } catch (JSONException e) {
            countExceptions++;
            e.printStackTrace();
            return "";
        }
    }


    private String getLinieName(JSONObject rowJson) {
        if(rowJson == null) return "";

        try {
            return Html.fromHtml(rowJson.getString("pr")).toString(); //NON-NLS
        } catch (JSONException e) {
            countExceptions++;
            e.printStackTrace();
            return "";
        }
    }


    private String getDepartureTime(JSONObject rowJson) {
        if(rowJson == null) return "";

        try {
            return Html.fromHtml(rowJson.getString("ti")).toString(); //NON-NLS
        } catch (JSONException e) {
            countExceptions++;
            e.printStackTrace();
            return "";
        }
    }


    private String getDelayMinutes(JSONObject rowJson) {
        if(rowJson == null) return "";

        boolean delayInformationExists = false;
        try {
            delayInformationExists = rowJson.getBoolean("rt");
            if(!delayInformationExists) return "";
        } catch (JSONException e) {
            // no delay inforamtion available
            countExceptions = countExceptions + 0;
        }

        try {
            JSONObject rtJson = rowJson.getJSONObject("rt");
            String delay = Html.fromHtml(rtJson.getString("dlm")).toString(); //NON-NLS
            if("null".contentEquals(delay)) return ""; //NON-NLS
            return delay;
        } catch (JSONException e) {
            // no delay inforamtion available
            countExceptions = countExceptions + 0;
            return "";
        }
    }


    @Override
    protected void parseDoing(String jsonResponseString) {
        System.out.println("parseDoing VBN: " + Util.printPart(jsonResponseString, Util.MESSAGE_LENGTH)); //NON-NLS
        try {
            String jsonString = jsonResponseString; // String jsonString = Util.convertStringFromISO8859ToUTF8(jsonResponseString);

            JSONObject reader = null;
            try {
                reader = new JSONObject(jsonString);

            } catch (JSONException e) {
                countExceptions++;
                System.out.println("parseSuggestionListResponse exception " + getOPNVTag()); //NON-NLS
                System.out.println(jsonString); //NON-NLS
            }


            JSONArray departureList = getDepartureList(reader);
            if (departureList == null) {
                System.out.println("departure list vbn: 0"); //NON-NLS
                return;
            }
            System.out.println("departure list vbn: " + departureList.length()); //NON-NLS

            for (int row = 0; row < Math.min(departureList.length(), UI_StationDisplay.NUMBER_ROWS); row++) {
                try {
                    JSONObject rowJson = departureList.getJSONObject(row);
                    String linie = "";
                    String direction = "";
                    String departureTime = "";
                    String delay = "";

                    if (rowJson != null) {
                        direction = getDirection(rowJson);
                        linie = getLinieName(rowJson);
                        departureTime = getDepartureTime(rowJson);
                        delay = getDelayMinutes(rowJson);
                    }

                    if(row<5) System.out.println("ParserVBN row: " + row + "  " + departureTime + "  " + delay + "  " +  linie + "  " + direction); //NON-NLS
                    delayArray.set(row, delay);
                    delaySevArray.set(row, computeDelaySeverity(delay));
                    linieArray.set(row, linie);
                    directionArray.set(row, direction);
                    departureArray.set(row, departureTime);

                } catch (JSONException e) {
                    countExceptions++;
                    System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
                    System.out.println("parseSuggestionListResponse row number: " + row); //NON-NLS
                    System.out.println("parseSuggestionListResponse row content: " + jsonString); //NON-NLS
                    e.printStackTrace();
                } catch (Exception e) {
                    countExceptions++;
                    System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
                    System.out.println("parseSuggestionListResponse row number: " + row); //NON-NLS
                    System.out.println("parseSuggestionListResponse row content: " + jsonString); //NON-NLS
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e) {
            countExceptions++;
            System.out.println("parseSuggestionListResponse exception vbn: " + getOPNVTag()); //NON-NLS
            System.out.println("responseString vbn: " + jsonResponseString);
            e.printStackTrace();
            parsingWithoutWarnings = false;
            return;
        }

        parsingWithoutWarnings = true;
    }



}
