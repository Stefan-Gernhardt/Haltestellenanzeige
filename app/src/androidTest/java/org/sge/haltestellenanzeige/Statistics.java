package org.sge.haltestellenanzeige;

import org.sge.haltestellenanzeige.opnv.OPNV;

import java.util.ArrayList;

public class Statistics {
    private ArrayList<StatisticRecord> statisticRecords = new ArrayList<>(200);


    public void reportSuggestionListSize(int loop, OPNV opnv, String searchString, int sugggestionListSize) {
        if (loop >= statisticRecords.size()) statisticRecords.add(loop, new StatisticRecord());
        statisticRecords.get(loop).reportSuggestionListSize(opnv, searchString, sugggestionListSize);
    }


    public void reportSeverities(int loop, OPNV opnv, int greenCounter, int yellowCounter, int redCounter, int unknownCounter) {
        if (loop >= statisticRecords.size()) statisticRecords.add(loop, new StatisticRecord());
        statisticRecords.get(loop).reportSeverities(opnv, greenCounter, yellowCounter, redCounter, unknownCounter);
    }


    public void printStatistics() {
        System.out.println("printStatistics (records " + (statisticRecords.size()) + ")");
        for(int i=0; i<statisticRecords.size(); i++) {
            System.out.println("record: " + i);
            StatisticRecord statisticRecord = statisticRecords.get(i);
            for(String opnv : statisticRecord.getSearchStringHashMap().keySet()) {
                System.out.println(opnv + "  searchString: " +
                        statisticRecord.getSearchStringHashMap().get(opnv) + "  size: " + statisticRecord.getSizeHashMap().get(opnv) +
                        "  green: " + statisticRecord.getGreenHashMap().get(opnv) +
                        "  yellow: " + statisticRecord.getYellowHashMap().get(opnv) +
                        "  red: " + statisticRecord.getRedHashMap().get(opnv) +
                        "  unknown: " + statisticRecord.getUnknownHashMap().get(opnv)
                );
            }
        }
    }


    public void printWholeStatistics() {
        System.out.println("printWholeStatistics (records " + (statisticRecords.size()) + ")");

        for(int i=0; i<1; i++) {
            StatisticRecord statisticRecord = statisticRecords.get(i);

            for(String opnv : statisticRecord.getSearchStringHashMap().keySet()) {

                int totalSuggestions = 0;
                int totalGreen = 0;
                int totalYellow = 0;
                int totalRed = 0;
                int totalUnknown = 0;

                for(int j=0; j<statisticRecords.size(); j++) {
                    StatisticRecord statisticRecordJ = statisticRecords.get(j);

                    totalSuggestions = totalSuggestions + (statisticRecordJ.getSizeHashMap().get(opnv)    == null ? 0 : statisticRecordJ.getSizeHashMap().get(opnv));
                    totalGreen       = totalGreen       + (statisticRecordJ.getGreenHashMap().get(opnv)   == null ? 0 : statisticRecordJ.getGreenHashMap().get(opnv));
                    totalYellow      = totalYellow      + (statisticRecordJ.getYellowHashMap().get(opnv)  == null ? 0 : statisticRecordJ.getYellowHashMap().get(opnv));
                    totalRed         = totalRed         + (statisticRecordJ.getRedHashMap().get(opnv)     == null ? 0 : statisticRecordJ.getRedHashMap().get(opnv));
                    totalUnknown     = totalUnknown     + (statisticRecordJ.getUnknownHashMap().get(opnv) == null ? 0 : statisticRecordJ.getUnknownHashMap().get(opnv));
                }

                System.out.println(opnv + "  total size suggestions: " + totalSuggestions +
                        "  totalGreen: " + totalGreen +
                        "  totalYellow: " +  totalYellow +
                        "  totalRed: " +  totalRed +
                        "  totalUnknown: " + totalUnknown
                );

            }
        }
    }

    public boolean complete() {
        if(statisticRecords.isEmpty()) return false;

        for(int i=0; i<1; i++) {
            StatisticRecord statisticRecord = statisticRecords.get(i);

            for(String opnv : statisticRecord.getSearchStringHashMap().keySet()) {

                int totalSuggestions = 0;
                int totalGreen = 0;
                int totalYellow = 0;
                int totalRed = 0;
                int totalUnknown = 0;

                for(int j=0; j<statisticRecords.size(); j++) {
                    StatisticRecord statisticRecordJ = statisticRecords.get(j);

                    totalSuggestions = totalSuggestions + (statisticRecordJ.getSizeHashMap().get(opnv)    == null ? 0 : statisticRecordJ.getSizeHashMap().get(opnv));
                    totalGreen       = totalGreen       + (statisticRecordJ.getGreenHashMap().get(opnv)   == null ? 0 : statisticRecordJ.getGreenHashMap().get(opnv));
                    totalYellow      = totalYellow      + (statisticRecordJ.getYellowHashMap().get(opnv)  == null ? 0 : statisticRecordJ.getYellowHashMap().get(opnv));
                    totalRed         = totalRed         + (statisticRecordJ.getRedHashMap().get(opnv)     == null ? 0 : statisticRecordJ.getRedHashMap().get(opnv));
                    totalUnknown     = totalUnknown     + (statisticRecordJ.getUnknownHashMap().get(opnv) == null ? 0 : statisticRecordJ.getUnknownHashMap().get(opnv));
                }

                if(totalSuggestions <= 0) return false;
                if(totalGreen <= 0) return false;
                if(totalYellow <= 0) return false;
                if(totalRed <= 0) return false;
                if(totalUnknown <= 0) return false;
            }
        }

        return true;
    }
}
