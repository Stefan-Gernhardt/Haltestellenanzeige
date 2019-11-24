package org.sge.haltestellenanzeige;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.sge.haltestellenanzeige.net.StationBoardInterface;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_HVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_KVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_MVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_RMV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VBN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VGN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRR;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_DB_SVV;
import org.sge.haltestellenanzeige.stop.Stop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.sge.haltestellenanzeige.net.BahnRequest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_SaarSVV;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class SuggestionAndDepartueRequestAndPerformanceOPNVTest {
    public Stop check_SuggestionSearch(OPNV opnv, String stationNameSearch, String stationNameDB, String stationIdDB, String suggestionUrlSecondary, String stationNameSecondary, String stationIdSecondary, String coordLati, String coordLongi) {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), stationNameSearch);

        long startTime = System.currentTimeMillis();
        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        assertTrue("Parserzeit suggestionList db " + duration + " kleiner als 1000 ms", duration < TestData.PERFORMANCE_GOAL_PARSER);

        Stop stopDB = suggestionList_DB.getList().get(0);
        assertEquals(stationNameDB, stopDB.getName());
        assertEquals(stationIdDB, stopDB.getId());

        assertEquals(suggestionUrlSecondary, opnv.getSuggestionUrl(stopDB.getName()));

        String suggestionResponseString = BahnRequest.createSuggestionRequestSynchron(appContext, opnv, stopDB.getName());
        System.out.println("suggestionResponseString: " + suggestionResponseString);
        assertTrue(suggestionResponseString.length() > 0);
        startTime = System.currentTimeMillis();
        Stop stop = opnv.getStopFromSecondaryOPNV(suggestionResponseString, stopDB);
        assertTrue("assert stop!=null", stop != null);

        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        assertTrue("Parserzeit suggestionList " + opnv.getTag() + " " + duration + " kleiner als 1000 ms", duration < TestData.PERFORMANCE_GOAL_PARSER);

        assertEquals(opnv.getTag(), stop.getOPNV().getTag());
        assertEquals(stationNameSecondary, stop.getName());
        assertEquals(stationIdSecondary, stop.getId());
        assertEquals(coordLati, "" + stop.getXCoord());
        assertEquals(coordLongi, "" + stop.getYCoord());

        assertTrue("coord formt is xx.xxxxx", new String("" + stop.getXCoord()).indexOf('.') > 0);
        assertTrue("coord formt is xx.xxxxx", new String("" + stop.getYCoord()).indexOf('.') > 0);

        return stop;
    }


    public void checkBahnRequest(Stop stop, String url, String[] linePartArrayString, String[] directionPartArrayString) {
        assertEquals(url, stop.getUrl());

        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, stop.getOPNV(), stop.getName(), stop);

        assertTrue("Response not empty" , !response.isEmpty());

        long startTime = System.currentTimeMillis();
        Parser parser = stop.getOPNV().newParser();
        parser.parse(response);
        assertTrue("count exceptions not zero " + stop.getOPNV().getTag(), parser.getCountExceptions() == 0);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Parserzeit bahnRequest "  + stop.getOPNV().getTag() + " " + duration + " kleiner als " + TestData.PERFORMANCE_GOAL_PARSER + " 1000 ms");
        assertTrue("AssertTrue: Parserzeit bahnRequest " + stop.getOPNV().getTag() + " " + duration + " kleiner als " + TestData.PERFORMANCE_GOAL_PARSER + " ms", duration < TestData.PERFORMANCE_GOAL_PARSER);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, false);

        ValidateResult.getInstance().checkLineContained(parser, linePartArrayString);
        ValidateResult.getInstance().checkDirectionContained(parser, directionPartArrayString);

        int greenCounter = 0;
        int yellowCounter = 0;
        int redCounter = 0;
        int unknownCounter = 0;
        for(int r = 0; r< UI_StationDisplay.NUMBER_ROWS; r++) {
            if(StationBoardInterface.DELAY_SERVERITY_GREEN     == parser.getPredictionSeverityRow(r)) greenCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_YELLOW    == parser.getPredictionSeverityRow(r)) yellowCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_RED       == parser.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_CANCELLED == parser.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_UNKNOWN   == parser.getPredictionSeverityRow(r)) unknownCounter++;
        }
        assertTrue(greenCounter + yellowCounter + redCounter + unknownCounter >= 0);


        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm-rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_00_check_DB() {
        System.out.println("test_00_check_DB");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Viernheim Tivoli");

        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);

        Stop stop = suggestionList_DB.getList().get(0);
        assertEquals("Tivoli (RNZ), Viernheim", stop.getName());
        assertEquals("000518554", stop.getId());
        assertEquals(OPNV_BahnDB.getInstance().getTag(), stop.getOPNV().getTag());
        assertEquals(8.565902, stop.getXCoord(), 0.0000001);
        assertEquals(49.52846, stop.getYCoord(), 0.0000001);
    }


    @Test
    public void test_01_check_DB() {
        System.out.println("test_01_check_DB");
        Stop stop = check_SuggestionSearch(
                OPNV_BahnDB.getInstance(),
                "Frankfurt Hauptbahnhof",
                "Frankfurt(Main)Hbf",
                "008000105",
                "https://reiseauskunft.bahn.de/bin/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G=Frankfurt%28Main%29Hbf?&js=true",
                "Frankfurt(Main)Hbf",
                "008000105",
                "8.663785",
                "50.107149");

        checkBahnRequest(
                stop,
                "https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=008000105&boardType=dep&time=now&start=yes&maxJourneys=50",
                new String[] { "STR 11", "STR 21", "S 4", "S 9"},
                new String[] {"Frankfurt", "Offenbach"});
    }


    @Test
    public void test_02_check_VRN() {
        System.out.println("test_02_check_VRN");
        Stop stop = check_SuggestionSearch(
                OPNV_VRN.getInstance(),
                "Viernheim Tivoli",
                "Tivoli (RNZ), Viernheim",
                "000518554",
                "https://www.vrn.de/mngvrn/XML_STOPFINDER_REQUEST?anyObjFilter_sf=0&coordOutputFormat=EPSG:4326&locationServerActive=1&name_sf=Tivoli+%28RNZ%29%2C+Viernheim&outputFormat=json&type_sf=any&vrnsuggestMacro=vrn_suggest&w_regPrefAl=5",
                "Viernheim, Tivoli (RNZ)",
                "de:06431:3865",
                "8.56525",
                "49.52822");

        checkBahnRequest(
                stop,
                "https://www.vrn.de/mngvrn/XML_DM_REQUEST?coordOutputFormat=EPSG:4326&depType=stopEvents&includeCompleteStopSeq=0&limit=50&locationServerActive=1&mode=direct&name_dm=de:06431:3865&outputFormat=json&type_dm=any&useOnlyStops=1&useRealtime=1",
                new String[] {"RNV 5", "612"},
                new String[] {"Mannheim", "Heidelberg"});
    }


    @Test
    public void test_03_check_SVV() {
        System.out.println("test_03_check_SVV");
        Stop stop = check_SuggestionSearch(
                OPNV_SaarSVV.getInstance(),
                "Heusweiler, Markt",
                "Markt, Heusweiler",
                "000836472",
                "http://www.saarfahrplan.de/cgi-bin/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G=Markt%2C+Heusweiler?&js=true",
                "Markt, Heusweiler",
                "000015537",
                "6.930009",
                "49.33681");

        checkBahnRequest(
                stop,
                "http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&M=d&dpm=0&dw=128&dh=128&input=000015537&boardType=dep&time=now&selectDate=today&maxJourneys=50&start=yes",
                new String[] {"S 1"},
                new String[] {"Lebach", "Brebach"});
    }


    @Test
    public void test_04_check_RMV() {
        System.out.println("test_04_check_RMV");
        Stop stop = check_SuggestionSearch(
                OPNV_RMV.getInstance(),
                "Frankfurt (Main) Speyerer Straße",
                "Speyerer Straße, Frankfurt a.M.",
                "000100019",
                "https://www.rmv.de/auskunft/bin/jp/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G=Speyerer+Stra%C3%9Fe%2C+Frankfurt+a.M.?&js=true",
                "Frankfurt (Main) Speyerer Straße",
                "003000019",
                "8.65085",
                "50.105558");

        checkBahnRequest(
                stop,
                "https://www.rmv.de/auskunft/bin/jp/stboard.exe/dn?&protocol=https:&seqnr=4&input=003000019&boardType=dep&time=now&view=STATIONINFO&maxJourneys=50&start=1&outputMode=stationInfoBoardOnly&boardType=arr&REQProduct_mask=",
                new String[] {"Tram 11", "Tram 14"},
                new String[] {"Frankfurt", "Hauptwache"});
    }


    @Test
    public void test_05_check_KVV() {
        System.out.println("test_05b_check_KVV");
        Stop stop = check_SuggestionSearch(
                OPNV_KVV.getInstance(),
                "Volkswohnung/Staatstheater, Karlsruhe",
                "Volkswohnung/Staatstheater, Karlsruhe",
                "000720472",
                "https://www.kvv.de/tunnelEfaDirect.php?action=XSLT_STOPFINDER_REQUEST&coordOutputFormat=WGS84%5Bdd.ddddd%5D&language=de&outputFormat=JSON&snapDistance_sf=500&std3_suggestMacro=std3_suggest&type_sf=any&name_sf=Volkswohnung/Staatstheater, Karlsruhe",
                "Karlsruhe, Volkswohnung / Staatstheater",
                "de:08212:72",
                "8.40393",
                "49.00383");

        checkBahnRequest(
                stop,
                "https://www.kvv.de/tunnelEfaDirect.php?action=XSLT_DM_REQUEST&itdLPxx_timeFormat=23&language=de&useAllStops=1&name_dm=de:08212:72&type_dm=any&itdDateTimeDepArr=dep&useRealtime=1&deleteAssignedStops=1&mode=direct&line=all",
                new String[] {"Tram 6", "Tram 5", "Bus 10"},
                new String[] {"Karlsruhe", "Marktplatz"});
    }


    @Test
    public void test_06_check_VBN() {
        System.out.println("test_06_check_VBN");
        Stop stop = check_SuggestionSearch(
                OPNV_VBN.getInstance(),
                "Am Brill, Bremen",
                "Am Brill, Bremen",
                "000775471",
                "https://fahrplaner.vbn.de/hafas/ajax-getstop.exe/dny?/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&REQ0JourneyStopsB=12&S=Am Brill, Bremen?&js=true&getring=1",
                "Bremen Am Brill",
                "008096108",
                "8.800565",
                "53.078714");

        checkBahnRequest(
                stop,
                "https://fahrplaner.vbn.de/hafas/stboard.exe/dny?L=vs_liveticker&protocol=https:&tpl=liveticker2json&&input=008096108&boardType=dep&time=now&productsFilter=1111111111111111&additionalTime=0&ignoreMasts=yes&maxJourneys=50&start=yes&selectDate=today&monitor=1&outputMode=tickerDataOnly",
                new String[] {"Tram 3", "Tram 1", "Bus 27"},
                new String[] {"Bremen", "Huchting"});
    }


    @Test
    public void test_07_check_HVV() {
        System.out.println("test_07_check_HVV");
        Stop stop = check_SuggestionSearch(
                OPNV_HVV.getInstance(),
                "St.Pauli, Hamburg",
                "St.Pauli, Hamburg",
                "000895176",
                "https://www.hvv.de/geofox/checkName",
                "St.Pauli",
                "Master:80900",
                "9.970189",
                "53.550799");

        checkBahnRequest(
                stop,
                "https://www.hvv.de/geofox/departureList",
                new String[] {"U3", "37"},
                new String[] {"Rathaus", "Schlump - Barmbek"});
    }


    @Test
    public void test_08_check_MVV() {
        System.out.println("test_08_check_MVV");
        Stop stop = check_SuggestionSearch(
                OPNV_MVV.getInstance(),
                "marienplatz",
                "München Marienplatz",
                "008004135",
                "https://efa.mvv-muenchen.de/ng/XML_STOPFINDER_REQUEST?macro_sf=mvv&type_sf=stop&name_sf=München Marienplatz&coordOutputFormat=EPSG:4326",
                "München, Marienplatz",
                "de:09162:2",
                "11.57542",
                "48.13725");

        checkBahnRequest(
                stop,
                "https://efa.mvv-muenchen.de/xhr_departures?locationServerActive=1&stateless=1&type_dm=stop&name_dm=de:09162:2&useAllStops=1&useRealtime=1&limit=50&mode=direct&zope_command=enquiry%3Adepartures&coordOutputFormat=EPSG:4326", // "http://efa.mvv-muenchen.de/xhr_departures?locationServerActive=1&stateless=1&type_dm=stop&name_dm=91000002&useAllStops=1&useRealtime=1&limit=50&mode=direct&zope_command=enquiry%3Adepartures&coordOutputFormat=EPSG:4326",
                new String[] {"U6", "U3"},
                new String[] {"Münchner Freiheit", "Fröttmaning", "München Ost", "Mammendorf", "Erding"});
    }


    @Test
    public void test_09_check_VRR() {
        System.out.println("test_09_check_VRR");
        Stop stop = check_SuggestionSearch(
                OPNV_VRR.getInstance(),
                "Köln Heumarkt",
                "Heumarkt, Köln",
                "000444507",
                "https://haltestellenmonitor.vrr.de/backend/api/stations/search?query=Heumarkt, Köln",
                "Köln Heumarkt",
                "22000001",
                "6.857103",
                "51.349555");

        checkBahnRequest(
                stop,
                "https://haltestellenmonitor.vrr.de/backend/api/stations/table",
                new String[] {"13", "7", "978", "106", "1E"},
                new String[] {"Königsforst,Rath/Heumar", "Reiherstr.,Hochkirchen", "Weiden West,Köln", "Breslauer Platz/Hbf,Köln", "Brück Mauspfad,Köln", "Sparkasse Am Butzweilerhof,Köln"});
    }


    @Test
    public void test_10_check_VGN() {
        System.out.println("test_10_check_VGN");
        Stop stop = check_SuggestionSearch(
                OPNV_VGN.getInstance(),
                "Nürnberg, Friedrich-Ebert-Platz",
                "Friedrich-Ebert-Platz, Nürnberg",
                "000676356",
                "https://www.vgn.de/ib/site/tools/DEFAS_Suggest.php?query=Friedrich-Ebert-Platz, Nürnberg",
                "Friedrich-Ebert-Platz",
                "de:09564:232",
                "11.081717",
                "49.445525");

        checkBahnRequest(
                stop,
                "https://www.vgn.de/abfahrten/?dm=de:09564:232",
                new String[] {"4", "U3"},
                new String[] {"Gibitzenhof", "Nordwestring", "Gustav-\u200BAdolf-\u200BStr"});
    }
}

