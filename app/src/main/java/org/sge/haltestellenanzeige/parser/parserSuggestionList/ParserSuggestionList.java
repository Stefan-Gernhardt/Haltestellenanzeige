package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.util.Util;

import java.util.ArrayList;

/**
 * Created by Admin on 10.02.2018.
 */

public abstract class ParserSuggestionList {
    private ArrayList<Stop> suggestionList = new ArrayList<Stop>();

    abstract public ArrayList<Stop> parseSuggestionListResponse(OPNV opnv, String stations);

    public ArrayList<Stop> getList() {
        return suggestionList;
    }

    public static String extractJsonString(String s) {
        if(s == null) return "";
        if(s.isEmpty()) return "";

        int start = s.indexOf('{');
        if(start == -1) return s;

        int end = s.lastIndexOf('}') + 1;
        String jsonString =  s.substring(start, end);

        return jsonString;
    }


    public String getStringJasonWithExceptionHandling(JSONObject jsonObject, String value) {
        try {
            return jsonObject.getString(value);
        }
        catch (JSONException e) {
            return "";
        }
    }
}
