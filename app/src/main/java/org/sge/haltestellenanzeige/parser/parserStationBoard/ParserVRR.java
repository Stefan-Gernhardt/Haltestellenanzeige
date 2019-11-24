package org.sge.haltestellenanzeige.parser.parserStationBoard;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRR;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;

public class ParserVRR extends Parser {
    public ParserVRR() { };

    public ParserVRR(String jsonString) {
        parse(jsonString);
    }


    @Override
    protected void parseDoing(String jsonStringList) {
        System.out.println("parseDoing VRR"); //NON-NLS
        // System.out.println(jsonStringList); //NON-NLS

        String jsonString = ParserSuggestionList.extractJsonString(jsonStringList);

        try {
            JSONObject reader = null;
            try {
                reader = new JSONObject(jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
                countExceptions = countExceptions + 0;
                parsingWithoutWarnings = false;
            }

            // list of stops
            JSONArray stationArray = null;
            try {
                stationArray = reader.getJSONArray("departureData"); //NON-NLS
            } catch (JSONException e) {
                e.printStackTrace();
                countExceptions = countExceptions + 0;
                parsingWithoutWarnings = false;
            }

            for (int row = 0; (row < stationArray.length()) && (row < UI_StationDisplay.NUMBER_ROWS); row++) {
                JSONObject station = null;
                try {
                    station = stationArray.getJSONObject(row);
                    // if(row<5) System.out.println("station string VRR " + row + ": " + station.toString()); //NON-NLS
                    parseStation(station, row);
                } catch (JSONException e) {
                    e.printStackTrace();
                    countExceptions = countExceptions + 0;
                    parsingWithoutWarnings = false;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("parseSuggestionListResponse exception VRR suggestion list: " + jsonString); //NON-NLS
            countExceptions = countExceptions + 0;
            parsingWithoutWarnings = false;
        }

        return;
    }


    private void parseLine(JSONObject station, int row) {
        try {
            linieArray.set(row, station.getString("lineNumber"));
            if(row<5) System.out.println("station linie VRR " + row + ": " + station.getString("lineNumber")); //NON-NLS
        } catch (JSONException e) {
            e.printStackTrace();
            countExceptions = countExceptions + 1;
            parsingWithoutWarnings = false;
        }
    }


    private void parseDirection(JSONObject station, int row) {
        try {
            directionArray.set(row, station.getString("direction"));
            if(row<5) System.out.println("station direction VRR " + row + ": " + station.getString("direction")); //NON-NLS
        } catch (JSONException e) {
            e.printStackTrace();
            countExceptions = countExceptions + 1;
            parsingWithoutWarnings = false;
        }
    }


    private void parseDepartureTime(JSONObject station, int row) {
        try {
            String orgHour = station.getString("orgHour");
            String orgMinute = station.getString("orgMinute");
            String departure = orgHour + ":" + orgMinute;
            departureArray.set(row, departure);
            if(row<5) System.out.println("station departure VRR " + row + ": " + departure); //NON-NLS
        } catch (JSONException e) {
            e.printStackTrace();
            countExceptions = countExceptions + 1;
            parsingWithoutWarnings = false;
        }
    }


    private void parseDelayTime(JSONObject station, int row) {
        String delayString = station.optString("delay", "");

        if(delayString.isEmpty()) {
            delayArray.set(row, "");
            delaySevArray.set(row, DELAY_SERVERITY_UNKNOWN);
            return;
        }

        try {
            String hour = station.getString("hour");
            String minute = station.getString("minute");
            String departure = hour + ":" + minute;
            delayArray.set(row, departure);

            if("-9999".contentEquals(delayString)) {
                delayArray.set(row, CANCELLED_SIGN);
                delaySevArray.set(row, DELAY_SERVERITY_CANCELLED);
                return;
            }

            // set severity
            int delayInMinutes = 0;
            try {
                delayInMinutes = Integer.parseInt(delayString);
                if(delayInMinutes <= 0) {
                    delaySevArray.set(row, DELAY_SERVERITY_GREEN);
                }
                if((0 < delayInMinutes) && (delayInMinutes <= BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED)) {
                    delaySevArray.set(row, DELAY_SERVERITY_YELLOW);
                }
                if(delayInMinutes > BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED) delaySevArray.set(row, DELAY_SERVERITY_RED);
            }
            catch(NumberFormatException e) {
                delaySevArray.set(row, DELAY_SERVERITY_UNKNOWN);
            }


            if(row<5) System.out.println("station departure VRR " + row + ": " + departure); //NON-NLS
            if(row<5) System.out.println("station severity time VRR " + row + ": " + delaySevArray.get(row)); //NON-NLS
        } catch (JSONException e) {
            e.printStackTrace();
            countExceptions = countExceptions + 1;
            parsingWithoutWarnings = false;
        }
    }


    private void parsePlatform(JSONObject station, int row) {
        platformArray.set(row, station.optString("platform"));
        if(row<5) System.out.println("station platform VRR " + row + ": " + platformArray.get(row)); //NON-NLS
    }


    private void parseStation(JSONObject station, int row) {
        parseLine(station, row);
        parseDirection(station, row);
        parseDepartureTime(station, row);
        parseDelayTime(station, row);
        parsePlatform(station, row);
    }


    @Override
    public String getOPNVTag() {
        return OPNV_VRR.getInstance().getTag();
    }

}
