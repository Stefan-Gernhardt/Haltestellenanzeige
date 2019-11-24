package org.sge.haltestellenanzeige.parser.parserStationBoard;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_HVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParserHVV extends Parser {
    public ParserHVV() { };

    public ParserHVV(String jsonString) {
        parse(jsonString);
    }


    @Override
    protected void parseDoing(String jsonStringList) {
        System.out.println("parseDoing HVV"); //NON-NLS
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

            // check return code
            try {
                String returnCode = reader.getString("returnCode");
                if(returnCode == null) return;
                if(!returnCode.contentEquals("OK")) return;
            } catch (JSONException e) {
                e.printStackTrace();
                parsingWithoutWarnings = false;
            }

            // base time
            String baseTime = "";
            try {
                JSONObject dateTime = reader.getJSONObject("time");

                String dateString = dateTime.getString("date");
                String timeString = dateTime.getString("time");
                baseTime = timeString + " " + dateString;
            } catch (JSONException e) {
                e.printStackTrace();
                countExceptions = countExceptions + 1;
                parsingWithoutWarnings = false;
            }

            // list of stops
            JSONArray stationArray = null;
            try {
                stationArray = reader.getJSONArray("departures"); //NON-NLS
            } catch (JSONException e) {
                e.printStackTrace();
                countExceptions = countExceptions + 0;
                parsingWithoutWarnings = false;
            }

            for (int row = 0; (row < stationArray.length()) && (row < UI_StationDisplay.NUMBER_ROWS); row++) {
                JSONObject station = null;
                try {
                    station = stationArray.getJSONObject(row);
                    // if(row<5) System.out.println("station string hvv " + row + ": " + station.toString()); //NON-NLS
                    parseStation(station, row, baseTime);
                } catch (JSONException e) {
                    e.printStackTrace();
                    countExceptions = countExceptions + 0;
                    parsingWithoutWarnings = false;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("parseSuggestionListResponse exception hvv suggestion list: " + jsonString); //NON-NLS
            countExceptions = countExceptions + 0;
            parsingWithoutWarnings = false;
        }

        return;
    }


    private void parseLine(JSONObject station, int row) {
        try {
            JSONObject line = station.getJSONObject("line");
            linieArray.set(row, line.getString("name"));
            if(row<5) System.out.println("station linie hvv " + row + ": " + line.getString("name")); //NON-NLS

            directionArray.set(row, line.getString("direction"));
            if(row<5) System.out.println("station direction hvv " + row + ": " + line.getString("direction")); //NON-NLS

        } catch (JSONException e) {
            e.printStackTrace();
            countExceptions = countExceptions + 1;
            parsingWithoutWarnings = false;
        }
    }


    private void parseDepartureTime(JSONObject station, int row, String baseTime) {
        try {
            String departureTime = station.getString("timeOffset");
            departureArray.set(row, departureTime);

            if((departureTime != null) && (!departureTime.isEmpty())) {
                long timeOffset = Long.parseLong(departureTime);
                departureTime = Util.computeDepartureTime(baseTime, timeOffset);

                departureArray.set(row, departureTime);
            }

            if(row<5) System.out.println("station departure time hvv " + row + ": " + departureArray.get(row)); //NON-NLS
        } catch (JSONException e) {
            e.printStackTrace();
            countExceptions = countExceptions + 1;
            parsingWithoutWarnings = false;
        }
    }


    private void parseDelayTime(JSONObject station, int row, String baseTime) {
        String delayString =station.optString("delay");
        delayArray.set(row, delayString);
        if(row<5) System.out.println("station delay time hvv " + row + ": " + delayArray.set(row, delayString)); //NON-NLS

        if(delayString != null && !delayString.isEmpty()) {
            int delayInSeconds = Integer.parseInt(delayString);
            int delayInMinutes = delayInSeconds / 60;
            String departureDelayTime = Util.computeDepartureTime(departureArray.get(row), delayInMinutes);
            delayArray.set(row, departureDelayTime);
            // delayArray.set(row, "" + delayInMinutes);

            if(delayInMinutes <= 0) delaySevArray.set(row, DELAY_SERVERITY_GREEN);
            if((0 < delayInMinutes) && (delayInMinutes <= BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED)) {
                delaySevArray.set(row, DELAY_SERVERITY_YELLOW);
            }
            if(delayInMinutes > BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED) delaySevArray.set(row, DELAY_SERVERITY_RED);
            if(row<5) System.out.println("station severity time hvv " + row + ": " + delaySevArray.get(row)); //NON-NLS
        }
    }


    private void parsePlatform(JSONObject station, int row) {
        platformArray.set(row, station.optString("platform"));
        if(row<5) System.out.println("station platform hvv " + row + ": " + platformArray.get(row)); //NON-NLS
    }


    private void parseStation(JSONObject station, int row, String baseTime) {
        parseLine(station, row);
        parseDepartureTime(station, row, baseTime);
        parseDelayTime(station, row, baseTime);
        parsePlatform(station, row);
    }


    @Override
    public String getOPNVTag() {
        return OPNV_HVV.getInstance().getTag();
    }
}
