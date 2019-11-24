package org.sge.haltestellenanzeige;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.sge.haltestellenanzeige.net.StationBoardInterface;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVManager;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.util.Util;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RobustnessTest {


    private String getRandomLetter() {
        Random rnd = new Random();
        char c = (char) (rnd.nextInt(26) + 'a');

        return "" + c;
    }


    private String getSearchString() {
        String searchString = "";

        int searchStringLength = new Random().nextInt(4) +1;

        for(int i=0; i<searchStringLength; i++) {
            searchString = searchString.concat(getRandomLetter());
        }

        System.out.println("RobustnessTest::getSearchString() searchString: " + searchString);
        return searchString;
    }


    private Stop stopSelectRandomly(OPNV opnv) {
        return stopSelectRandomly(opnv, null, -1);
    }


    private Stop stopSelectRandomly(OPNV opnv, Statistics statistics, int loop) {
        Context appContext = InstrumentationRegistry.getTargetContext();

        Stop stop = null;
        while(stop == null) {
            String searchString = getSearchString();
            String suggestionResponseString = BahnRequest.createSuggestionRequestSynchron(appContext, opnv, getSearchString());

            ParserSuggestionList parserSuggestionList = opnv.newParserSuggestionList();
            parserSuggestionList.parseSuggestionListResponse(opnv, suggestionResponseString);
            int sugggestionListSize = parserSuggestionList.getList().size();
            if(statistics != null) statistics.reportSuggestionListSize(loop, opnv, searchString, sugggestionListSize);
            if (sugggestionListSize == 0) return null;

            stop = parserSuggestionList.getList().get(new Random().nextInt(sugggestionListSize));
        }

        System.out.println("RobustnessTest::stopSelectRandomly() stop name: " + stop.getName() + "  stop id: " + stop.getId() + "  url: " + stop.getUrl());

        return stop;
    }


    private Stop stopSelect(OPNV opnv, String partOfStopName) {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionResponseString = BahnRequest.createSuggestionRequestSynchron(appContext, opnv, partOfStopName, false);

        ParserSuggestionList suggestionList = opnv.newParserSuggestionList();
        suggestionList.parseSuggestionListResponse(opnv, suggestionResponseString);
        int sugggestionListDBSize = suggestionList.getList().size();
        if(sugggestionListDBSize == 0) return null;

        Stop stop = suggestionList.getList().get(new Random().nextInt(sugggestionListDBSize));
        System.out.println("stop name: " + stop.getName());

        return stop;
    }


    private void testSearchStationDoIt(OPNV opnv, Stop stop, Parser parser) {
        if(stop == null) {
            System.out.println("Keine Haltestelle zur Suche gefunden.");
        }
        else {
            String response = BahnRequest.createBahnRequestSynchronWithTag(InstrumentationRegistry.getTargetContext(), null, opnv, stop.getUrl());

            parser.parse(response);
            assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
            assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));

            if(parser.parsingDoneWithoutWarnings()) {
                ValidateResult.getInstance().checkDepartureTimeIsNotEmpty(parser);
                ValidateResult.getInstance().checkLineIsNotEmpty(parser);
                ValidateResult.getInstance().checkDirectionIsNotEmpty(parser);
            }
        }
    }


    private Parser testSearchStationDoIt(OPNV opnv, Stop stop, boolean withValidattion) {
        if(stop == null) {
            System.out.println("RobustnessTest::testSearchStationDoIt stop is null. Test not executed");
            return null;
        }
        System.out.println("RobustnessTest::testSearchStationDoIt opnv: " + opnv.getTag() + "   stop name: " + stop.getName());

        String response = BahnRequest.createBahnRequestSynchronWithTag(InstrumentationRegistry.getTargetContext(), null, stop, opnv, stop.getUrl());

        Parser parser = opnv.newParser();
        parser.parse(response);

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));

        if(withValidattion && parser.parsingDoneWithoutWarnings()) {
            ValidateResult.getInstance().checkDepartureTimeIsNotEmpty(parser);
            ValidateResult.getInstance().checkLineIsNotEmpty(parser);
            ValidateResult.getInstance().checkDirectionIsNotEmpty(parser);
        }

        return parser;
    }


    public Stop suggestionSearch(OPNV opnv, Stop stopDB) {
        Context
                appContext = InstrumentationRegistry.getTargetContext();

        String suggestionResponseString = BahnRequest.createSuggestionRequestSynchron(appContext, opnv, stopDB.getName(), false);
        return opnv.getStopFromSecondaryOPNV(suggestionResponseString, stopDB);
    }


    public Parser checkBahnRequest(Stop stop) {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, stop, stop.getOPNV(), stop.getName());

        if(response.isEmpty()) {
            System.out.println("Warning: RobustnessTest.checkBahnRequest() response is empty");
            return null;
        }

        Parser parser = stop.getOPNV().newParser();
        parser.parse(response);

        assertTrue("delay rate: " + parser.getDelayRate(), (parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));

        return parser;
    }


    @Test
    public void test01_SearchStationOnAllOPNVs() {
        System.out.println("test01_SearchStationOnAllOPNVs");
        String stationSearchName = "H";

        for (OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
            Stop stop = stopSelect(opnv, stationSearchName);
            if(stop != null) {
                Parser parser = testSearchStationDoIt(opnv, stop, true);
                assertTrue("count exceptions not zero " + opnv.getTag() + "  searchName: " + stationSearchName , parser.getCountExceptions() == 0);
            }
            Util.waitMillis(1000);
        }
    }


    @Test
    public void test02_SearchStationRandomlyAllOPNVs() {
        System.out.println("test02_SearchStationRandomlyAllOPNVs");

        for(int i=0; i<1; i++) {
            System.out.println("test02_SearchStationRandomlyAllOPNVs Durchlauf: " + i);

            for (OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
                Stop stop = stopSelectRandomly(opnv);
                if (stop != null) {
                    Parser parser = testSearchStationDoIt(opnv, stop, true);
                    assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);
            }
                Util.waitMillis(1000);
            }
        }
    }


    @Test
    public void test03_SearchStationRandomlyAllOPNVs() {
        System.out.println("test03_SearchStationRandomlyAllOPNVs");

        for(int i=0; i<1; i++) {
            System.out.println("test03_SearchStationRandomlyAllOPNVs Durchlauf: " + i);
            String stationSearchName = getSearchString();

            for (OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
                Stop stop = stopSelect(opnv, stationSearchName);
                if(stop != null) {
                    Parser parser = testSearchStationDoIt(opnv, stop,true);
                    assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);
                }
                Util.waitMillis(1000);
            }
        }
    }


    @Test
    public void test04_MainUseCase_AllOPNV() {
        System.out.println("test04_MainUseCase_AllOPNV");

        int countStopsChecked = 0;
        int j=0;
        // while(true) {
        for(int i=0; i<1; i++) {
            System.out.println("test04_MainUseCase_AllOPNV Durchlauf: " + ++j);
            String stationSearchName = getSearchString();
            System.out.println("test04_MainUseCase_AllOPNV search string for stop: " + stationSearchName);
            Stop stopDB = stopSelect(OPNV_BahnDB.getInstance(), stationSearchName);
            if(stopDB != null) {
                System.out.println("test04_MainUseCase_AllOPNV stopDB: " + stopDB.getName() + "  id: " + stopDB.getId() + "  coordx: " + stopDB.getXCoord() + "  coordy: " + stopDB.getYCoord());

                for (OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
                    Stop stop = suggestionSearch(opnv, stopDB);

                    Parser parser = null;
                    if (stop != null) {
                        System.out.println("test04_MainUseCase_AllOPNV stop: " + stop.getName() + "  id: " + stop.getId() + "  coordx: " + stop.getXCoord() + "  coordy: " + stop.getYCoord());
                        countStopsChecked++;
                        parser = checkBahnRequest(stop);
                        assertTrue("parser not null", parser != null);
                        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);
                    }

                    Util.waitMillis(5000);
                }
            }
        }
        // System.out.println("countStopsChecked: " + countStopsChecked);
    }



    @Test
    public void test05_Statistic() {
        System.out.println("test05_Statistic");

        Statistics statistics = new Statistics();

        int loop = -1;
        for(int i=0; i<1; i++) {
        //while(!statistics.complete()) {
            loop = loop + 1;
            System.out.println("test05_Statistic loop: " + loop);

            for (OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
                Stop stop = stopSelectRandomly(opnv, statistics, loop);
                if (stop != null) {
                    Parser parser = testSearchStationDoIt(opnv, stop, false);
                    ValidateResult.getInstance().countSeveritiesForStatistics(parser, statistics, opnv, loop);
                    assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);
                }
                Util.waitMillis(1000);
            }
            // statistics.printStatistics();
            statistics.printWholeStatistics();
        }
        System.out.println("test05_Statistic loops nessesary: " + loop);

    }
}

