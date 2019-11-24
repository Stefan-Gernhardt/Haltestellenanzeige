package org.sge.haltestellenanzeige;

import org.sge.haltestellenanzeige.opnv.OPNV;

import java.util.HashMap;

public class StatisticRecord {
    HashMap<String, String> searchStringHashMap = new HashMap<>();
    HashMap<String, Integer> sizeHashMap        = new HashMap<>();
    HashMap<String, Integer> greenHashMap       = new HashMap<>();
    HashMap<String, Integer> yellowHashMap      = new HashMap<>();
    HashMap<String, Integer> redHashMap         = new HashMap<>();
    HashMap<String, Integer> unknownHashMap     = new HashMap<>();

    public HashMap<String, String> getSearchStringHashMap() {
        return searchStringHashMap;
    }

    public HashMap<String, Integer> getSizeHashMap() {
        return sizeHashMap;
    }

    public HashMap<String, Integer> getGreenHashMap() {
        return greenHashMap;
    }

    public HashMap<String, Integer> getYellowHashMap() {
        return yellowHashMap;
    }

    public HashMap<String, Integer> getRedHashMap() {
        return redHashMap;
    }

    public HashMap<String, Integer> getUnknownHashMap() {
        return unknownHashMap;
    }

    public void reportSuggestionListSize(OPNV opnv, String searchString, int sugggestionListSize) {
        searchStringHashMap.put(opnv.getTag(), searchString);
        sizeHashMap.put(opnv.getTag(), sugggestionListSize);
    }


    public void reportSeverities(OPNV opnv, int greenCounter, int yellowCounter, int redCounter, int unknownCounter) {
        greenHashMap.put(opnv.getTag(), greenCounter);
        yellowHashMap.put(opnv.getTag(), yellowCounter);
        redHashMap.put(opnv.getTag(), redCounter);
        unknownHashMap.put(opnv.getTag(), unknownCounter);
    }
}
