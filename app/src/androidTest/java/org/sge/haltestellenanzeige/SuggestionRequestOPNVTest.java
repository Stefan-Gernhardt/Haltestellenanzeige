package org.sge.haltestellenanzeige;

/**
 * Created by Admin on 03.02.2018.
 */

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_HVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_MVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_SaarSVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VBN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VGN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRR;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_DB_SVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_HVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_MVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VBN;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VGN;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VRR;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VRN;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.assertTrue;

import org.sge.haltestellenanzeige.net.BahnRequest;

import static junit.framework.Assert.assertEquals;
import static org.sge.haltestellenanzeige.OrchestrationTest.STOP_NAME_MA_WASSEERTURM;

import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVRN;
import org.sge.haltestellenanzeige.util.SgeCompare;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class SuggestionRequestOPNVTest {


    @Test
    public void test_05_checkSearchStationViaDB() {
        System.out.println("test_05_checkSearchStationViaDB");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Viernheim Tivoli");
        System.out.println("---suggestion-------------------------");
        System.out.println(suggestionString);
        System.out.println("--------------------------------------");

        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);

        assertEquals(50, suggestionList_DB.getList().size());

        Stop stop = suggestionList_DB.getList().get(0);
        assertEquals("Tivoli (RNZ), Viernheim", stop.getName());
        assertEquals("000518554", stop.getId());
        assertEquals(8.565902, stop.getXCoord(), 0.0000001);
        assertEquals(49.528460, stop.getYCoord(), 0.0000001);
    }


    @Test
    public void test_06_checkSearchStationViaDB() {
        System.out.println("test_06_checkSearchStationViaDB");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), OrchestrationTest.STOP_NAME_SVV_MALSTATT);
        System.out.println(suggestionString);

        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);

        assertEquals(50, suggestionList_DB.getList().size());

        Stop stop = suggestionList_DB.getList().get(0);
        assertEquals(OrchestrationTest.STOP_NAME_SVV_MALSTATT, stop.getName());
        assertEquals("000835814", stop.getId());
        assertEquals(6.978281, stop.getXCoord(), 0.00001);
        assertEquals(49.241219, stop.getYCoord(), 0.00001);
    }


    @Test
    public void test_07_checkSuggestionListSizeDB() {
        System.out.println("test test_07_checkSuggestionListSizeDB");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Uhlhorn");

        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);

        assertTrue(suggestionList_DB.getList().size() >= 2);
    }


    @Test
    public void test_08_checkSearchTivoliDBSearchTivoliVRN() {
        System.out.println("test_08_checkSearchTivoliDBSearchTivoliVRN");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionStringDB = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Viernheim, Tivoli (RNZ)");
        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionStringDB);

        assertEquals(50, suggestionList_DB.getList().size());
        Stop stop = suggestionList_DB.getList().get(0);
        String value = stop.getName();

        assertEquals("Tivoli (RNZ), Viernheim", value);

        String suggestionStringVRN = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VRN.getInstance(), value);
        ParserSuggestionList_VRN suggestionListVRN = new ParserSuggestionList_VRN(OPNV_VRN.getInstance(), suggestionStringVRN);

        assertEquals(1, suggestionListVRN.getList().size());
        assertEquals("de:06431:3865", suggestionListVRN.getList().get(0).getId());
        assertEquals("Viernheim, Tivoli (RNZ)", suggestionListVRN.getList().get(0).getName());
    }


    @Test
    public void test_09_checkSearchFrankfurtHauptwacheDBSearchFrankfurtHauptwacheVRN() {
        System.out.println("test_09_checkSearchFrankfurtHauptwacheDBSearchFrankfurtHauptwacheVRN");
        String searchString = "Frankfurt (Main), Hauptwache";
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionStringDB = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), searchString);
        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionStringDB);

        assertEquals(50, suggestionList_DB.getList().size());
        Stop stop = suggestionList_DB.getList().get(0);
        String value = stop.getName();

        assertEquals("Frankfurt(M)Hauptwache", value);

        String suggestionStringVRN = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VRN.getInstance(), value);
        ParserSuggestionList_VRN suggestionListVRN = new ParserSuggestionList_VRN(OPNV_VRN.getInstance(), suggestionStringVRN);

        assertEquals(1, suggestionListVRN.getList().size());
        assertEquals("de:06412:1", suggestionListVRN.getList().get(0).getId());
        assertEquals(searchString, suggestionListVRN.getList().get(0).getName());
    }


    @Test
    public void test_10_checkSearchKirschenstrasseDBSearchKirschenstrasseTivoliVRN() {
        System.out.println("test_10_checkSearchKirschenstrasseDBSearchKirschenstrasseTivoliVRN");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionStringDB = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Kirschenstraße/Kindergarten, Viernheim");
        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionStringDB);

        assertEquals(50, suggestionList_DB.getList().size());
        Stop stop = suggestionList_DB.getList().get(0);
        String value = stop.getName();

        assertEquals("Kirschenstraße/Kindergarten, Viernheim", value);

        String suggestionStringVRNResponseString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VRN.getInstance(), value);
        System.out.println("suggestionStringVRNResponseString: " + suggestionStringVRNResponseString);
        ParserSuggestionList_VRN suggestionListVRN = new ParserSuggestionList_VRN(OPNV_VRN.getInstance(), suggestionStringVRNResponseString);

        assertEquals(1, suggestionListVRN.getList().size());
        assertEquals("de:06431:3843", suggestionListVRN.getList().get(0).getId());
        assertEquals("Viernheim, Kirschenstraße/Kindergarten", suggestionListVRN.getList().get(0).getName());
        assertEquals(96, SgeCompare.StringCompare("KirschenstraÃe/Kindergarten, Viernheim", "Kirschenstraße/Kindergarten, Viernheim"));
        assertEquals(8.57242, suggestionListVRN.getList().get(0).getXCoord(), 0.0000001);
        assertEquals(49.54917, suggestionListVRN.getList().get(0).getYCoord(), 0.0000001);
    }


    @Test
    public void test_11_checkSearchTivoliDBSearchWasserturmVRN() {
        System.out.println("test_11_checkSearchTivoliDBSearchParadePlatzVRN");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionStringDB = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Mannheim Paradeplatz");
        System.out.println("suggestionStringDB" + suggestionStringDB);
        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionStringDB);

        assertEquals(50, suggestionList_DB.getList().size());
        Stop stop = suggestionList_DB.getList().get(0);
        String value = stop.getName();
        assertEquals("Paradeplatz, Mannheim", value);
        assertEquals(8.467066, stop.getXCoord(), 0.0000001);
        assertEquals(49.487442, stop.getYCoord(), 0.0000001);

        String suggestionStringVRN = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VRN.getInstance(), value);
        ParserSuggestionList_VRN suggestionListVRN = new ParserSuggestionList_VRN(OPNV_VRN.getInstance(), suggestionStringVRN);

        assertEquals(1, suggestionListVRN.getList().size());

        assertEquals("de:08222:2451", suggestionListVRN.getList().get(0).getId());
        assertEquals("Mannheim, Paradeplatz", suggestionListVRN.getList().get(0).getName());
        assertEquals(63, SgeCompare.StringCompare("Mannheim, Wasserturm", suggestionListVRN.getList().get(0).getName()));
        assertEquals(8.46624, suggestionListVRN.getList().get(0).getXCoord(), 0.0000001);
        assertEquals(49.48778, suggestionListVRN.getList().get(0).getYCoord(), 0.0000001);
    }


    private Stop userSelectStopVRN(String stopName) {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), stopName);
        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);
        return stop;
    }


    private Stop userSelectDBStop(String stopName) {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), stopName);
        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);
        return stop;
    }


    private Stop userSelectStopFromSVV(String searchString) {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), searchString);
        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);
        System.out.println("db stop: " + stop.getName());
        return stop;
    }


    private Stop userSelectStopFromRMV(String searchString) {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), searchString);
        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);
        return stop;
    }


    private Stop userSelectStopFromRMVHauptwache() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Hauptwache, Frankfurt a.M.");
        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);
        return stop;
    }


    @Test
    public void test_13_check_OPNV_VRN_HasWasserturmStation() {
        System.out.println("test_13_check_OPNV_VRN_HasWasserturmStation");
        Stop stopWasserturmDB = userSelectStopVRN(STOP_NAME_MA_WASSEERTURM);

        Stop stopVRN = OPNV_VRN.getInstance().getStopSynchron(stopWasserturmDB, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: VRN contains Wasserturm stop", stopVRN != null);
        System.out.println("" + stopVRN.getName() + " " + stopVRN.getXCoord() + " " + stopVRN.getYCoord());
        assertTrue("", "Mannheim, Wasserturm".contentEquals(stopVRN.getName()));
        assertTrue("", 8.4741 == stopVRN.getXCoord());
        assertTrue("", 49.48465 == stopVRN.getYCoord());
    }


    /*
    @Test
    public void test_09_check_OPNV_SVV_HasNotWasserturmStation() {
        System.out.println("test_09_check_OPNV_SVV_HasNotWasserturmStation");
        StopFromSuggestionList_DB stopWasserturmDB = userSelectStopVRN(STOP_NAME_MA_WASSEERTURM);

        Stop stopSVV = OPNV_SaarSVV.getInstance().getStopSynchron(stopWasserturmDB, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: SVV does not contain Wasserturm stop", stopSVV == null);

    }
    */


    @Test
    public void test_14_check_OPNV_VRN_HasWallstadtWest() {
        System.out.println("test_14_check_OPNV_VRN_HasWallstadtWest");
        Stop Stop = userSelectStopVRN("Wallstadt West, Mannheim");

        Stop stopVRN = OPNV_VRN.getInstance().getStopSynchron(Stop, InstrumentationRegistry.getTargetContext());
        assertTrue(stopVRN != null);
        System.out.println("" + stopVRN.getName() + " " + stopVRN.getXCoord() + " " + stopVRN.getYCoord());
        assertEquals("Wallstadt, West", stopVRN.getName());
        assertEquals(8.4741, stopVRN.getXCoord(), 00000.1);
        assertEquals(49.48465, stopVRN.getYCoord(), 00000.1);
    }


    @Test
    public void test_15_check_OPNV_SVV_HasSVVStopMarktHeusweiler() {
        System.out.println("test_15_check_OPNV_SVV_HasSVVStopMarktHeusweiler");
        Stop Stop = userSelectStopFromSVV("Markt, Heusweiler");

        Stop stopSVV = OPNV_SaarSVV.getInstance().getStopSynchron(Stop, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: SVV has SVV stop", stopSVV != null);
    }


    @Test
    public void test_16_check_OPNV_SVV_HasSVVStopBerschweilerOelmuehle() {
        System.out.println("test_16_check_OPNV_SVV_HasSVVStopBerschweilerOelmuehle");
        Stop Stop = userSelectStopFromSVV("Berschweiler Ölmühle");

        Stop stopSVV = OPNV_SaarSVV.getInstance().getStopSynchron(Stop, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: SVV has SVV stop", stopSVV != null);

        System.out.println("stop name: " + stopSVV.getName());
        assertEquals("Berschweiler Ölmühle, Heusweiler", stopSVV.getName());
    }


    @Test
    public void test_17_check_OPNV_VRN_HasXXXStop() {
        System.out.println("test_17_check_OPNV_VRN_HasXXXStop");
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(InstrumentationRegistry.getTargetContext(), OPNV_BahnDB.getInstance(),
                "Wallstadt West, Mannheim");
        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);
        System.out.println("stop name from db search:" + stop.getName());

        Stop stopVRN = OPNV_VRN.getInstance().getStopSynchron(stop, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: VRN doesnt contain XXX stop", stopVRN != null);
        System.out.println("stop name from vrn search:" + stopVRN.getName());
        assertEquals("Wallstadt, West", stopVRN.getName());
        System.out.println("stop urlpara from vrn search:" + stopVRN.getUrl());
        assertEquals("https://www.vrn.de/mngvrn/XML_DM_REQUEST?coordOutputFormat=EPSG:4326&depType=stopEvents&includeCompleteStopSeq=0&limit=50&locationServerActive=1&mode=direct&name_dm=de:08222:2645&outputFormat=json&type_dm=any&useOnlyStops=1&useRealtime=1", stopVRN.getUrl());


        String response = BahnRequest.createBahnRequestSynchronWithTag(InstrumentationRegistry.getTargetContext(), null, OPNV_VRN.getInstance(),
                stopVRN.getUrl());
        assertTrue("Response not empty", !response.isEmpty());

        ParserVRN parser = new ParserVRN(response);

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_18_check_OPNV_VRN_HasStopDeidesheimBhf() {
        System.out.println("test_18_check_OPNV_VRN_HasStopDeidesheimBhf");
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(InstrumentationRegistry.getTargetContext(), OPNV_BahnDB.getInstance(),
                "Bahnhof, Deidesheim");
        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);
        System.out.println("stop name from db search:" + stop.getName());

        Stop stopVRN = OPNV_VRN.getInstance().getStopSynchron(stop, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: VRN doesnt contain XXX stop", stopVRN != null);
        System.out.println("stop name from vrn search:" + stopVRN.getName());
        assertEquals("Deidesheim, Bahnhof", stopVRN.getName());
        System.out.println("stop urlpara from vrn search:" + stopVRN.getUrl());
        assertEquals("https://www.vrn.de/mngvrn/XML_DM_REQUEST?coordOutputFormat=EPSG:4326&depType=stopEvents&includeCompleteStopSeq=0&limit=50&locationServerActive=1&mode=direct&name_dm=de:07332:470&outputFormat=json&type_dm=any&useOnlyStops=1&useRealtime=1", stopVRN.getUrl());


        String response = BahnRequest.createBahnRequestSynchronWithTag(InstrumentationRegistry.getTargetContext(), null, stopVRN, OPNV_VRN.getInstance(),
                stopVRN.getUrl());
        assertTrue("Response not empty", !response.isEmpty());

        ParserVRN parser = new ParserVRN(response);

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_19_check_OPNV_VRN_HasOggersheimFriedhof() {
        System.out.println("test_19_check_OPNV_VRN_HasOggersheimFriedhof");
        Stop Stop = userSelectDBStop("Oggersheim, Friedhof");

        Stop stopVRN = OPNV_VRN.getInstance().getStopSynchron(Stop, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: VRN contains OggersheimFriedhof stop", stopVRN != null);
        System.out.println("" + stopVRN.getName() + " " + stopVRN.getXCoord() + " " + stopVRN.getYCoord());
        assertTrue("", "Oggersheim, Friedhof".contentEquals(stopVRN.getName()));
        assertEquals(8.36754, stopVRN.getXCoord(), 0.000001);
        assertEquals(49.49722, stopVRN.getYCoord(), 0.000001);
    }


    @Test
    public void test_20_check_OPNV_VRN_HasRamstein() {
        System.out.println("test_20_check_OPNV_VRN_HasRamstein");
        Stop Stop = userSelectDBStop("Ramstein");

        Stop stopVRN = OPNV_VRN.getInstance().getStopSynchron(Stop, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: VRN contains Ramstein stop", stopVRN != null);
        System.out.println("" + stopVRN.getName() + " " + stopVRN.getXCoord() + " " + stopVRN.getYCoord());
        assertEquals("Ramstein (Pfalz), Bahnhof", stopVRN.getName());
        assertEquals(7.55681, stopVRN.getXCoord(), 0.000001);
        assertEquals(49.44862, stopVRN.getYCoord(), 0.000001);
    }


    @Test
    public void test_21_check_OPNV_SVV_Suggestion_List() {
        System.out.println("test_21_check_OPNV_SVV_Suggestion_List");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_SaarSVV.getInstance(), "jena");
        ParserSuggestionList_DB_SVV suggestionListSVV = new ParserSuggestionList_DB_SVV(OPNV_SaarSVV.getInstance(), suggestionString);

        assertTrue("suggestionList > 0", suggestionListSVV.getList().size() >= 1);


        for (int i = 0; i < suggestionListSVV.getList().size(); i++) {
            Stop stopSVV = suggestionListSVV.getList().get(i);

            String extId = stopSVV.getId();
            assertTrue("expectation: extId is not empty", !extId.isEmpty());
        }
    }


    @Test
    public void test_22_check_OPNV_VRN_Suggestion_List() {
        System.out.println("test_22_check_OPNV_VRN_Suggestion_List");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VRN.getInstance(), "platz");
        ParserSuggestionList_VRN suggestionListVRN = new ParserSuggestionList_VRN(OPNV_VRN.getInstance(), suggestionString);

        assertTrue("suggestionList > 0: " + suggestionListVRN.getList().size(), suggestionListVRN.getList().size() > 0);
    }


    @Test
    public void test_24_check_OPNV_HVV_Suggestion_List1() {
        System.out.println("test_24_check_OPNV_HVV_Suggestion_List1");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_HVV.getInstance(), "St. Pauli");
        ParserSuggestionList_HVV suggestionListHVV = new ParserSuggestionList_HVV(OPNV_HVV.getInstance(), suggestionString);

        System.out.println("suggestionString: " + suggestionString);

        assertEquals(1, suggestionListHVV.getList().size());

        Stop stop = suggestionListHVV.getList().get(0);
        assertEquals("St.Pauli", stop.getName());
        assertEquals("Master:80900", stop.getId());
        assertEquals(9.970189, stop.getXCoord(), 0.0000001);
        assertEquals(53.550799, stop.getYCoord(), 0.0000001);
    }


    @Test
    public void test_27_check_OPNV_HVV_Suggestion_List2() {
        System.out.println("test_25_check_OPNV_HVV_Suggestion_List2");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_HVV.getInstance(), "Bla");
        ParserSuggestionList_HVV suggestionListHVV = new ParserSuggestionList_HVV(OPNV_HVV.getInstance(), suggestionString);

        System.out.println("suggestionString: " + suggestionString);

        assertEquals(19, suggestionListHVV.getList().size());

        Stop stop = suggestionListHVV.getList().get(0);
        assertEquals("Blankenese", stop.getName());
        assertEquals("Master:81950", stop.getId());
        assertEquals(9.815271, stop.getXCoord(), 0.0000001);
        assertEquals(53.564518, stop.getYCoord(), 0.0000001);
    }


    @Test
    public void test_28_check_OPNV_VBN_Suggestion_List_3() {
        System.out.println("test_28_check_OPNV_VBN_Suggestion_List_3");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VBN.getInstance(), "St.Pauli Hamburg");
        ParserSuggestionList_VBN suggestionList = new ParserSuggestionList_VBN(OPNV_VBN.getInstance(), suggestionString);

        System.out.println("suggestionString: " + suggestionString);

        assertEquals(12, suggestionList.getList().size());

        Stop stop = suggestionList.getList().get(0);
        assertTrue("Hamburg-St.Pauli".contentEquals(stop.getName()));
        assertEquals("000702911", stop.getId());
        assertEquals(9.970044, stop.getXCoord(), 0.0000001);
        assertEquals(53.550288, stop.getYCoord(), 0.0000001);
    }


    @Test
    public void test_30_check_OPNV_MVV_Suggestion_List_2() {
        System.out.println("test_30_check_OPNV_MVV_Suggestion_List_2");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_MVV.getInstance(), "Bla");
        ParserSuggestionList_MVV suggestionList = new ParserSuggestionList_MVV(OPNV_MVV.getInstance(), suggestionString);

        System.out.println("suggestionString: " + suggestionString);

        assertEquals(3, suggestionList.getList().size());

        Stop stop = suggestionList.getList().get(0);
        assertEquals("Augsburg, Blaue Kappe", stop.getName());
        assertEquals("de:09761:528", stop.getId());
        assertEquals(10.88747, stop.getXCoord(), 0.0000001);
        assertEquals(48.37354, stop.getYCoord(), 0.0000001);
    }


    @Test
    public void test_31_check_OPNV_MVV_Suggestion_List_3() {
        System.out.println("test_31_check_OPNV_MVV_Suggestion_List_3");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_MVV.getInstance(), "Marienplatz");
        ParserSuggestionList_MVV suggestionList = new ParserSuggestionList_MVV(OPNV_MVV.getInstance(), suggestionString);

        System.out.println("suggestionString: " + suggestionString);

        assertEquals(1, suggestionList.getList().size());

        Stop stop = suggestionList.getList().get(0);
        assertEquals("München, Marienplatz", stop.getName());
        assertEquals("de:09162:2", stop.getId());
        assertEquals(11.57542, stop.getXCoord(), 0.0000001);
        assertEquals(48.13725, stop.getYCoord(), 0.0000001);
    }


    @Test
    public void test_32_check_OPNV_VRR_Suggestion_List() {
        System.out.println("test_32_check_OPNV_VRR_Suggestion_List");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VRR.getInstance(), "Chlodwigplatz");
        ParserSuggestionList_VRR suggestionList = new ParserSuggestionList_VRR(OPNV_VRR.getInstance(), suggestionString);

        System.out.println("suggestionString: " + suggestionString);

        assertEquals(3, suggestionList.getList().size());

        Stop stop = suggestionList.getList().get(0);
        assertEquals("Bonn Chlodwigplatz", stop.getName());
        assertEquals("22001182", stop.getId());
        assertEquals(6.857103, stop.getXCoord(), 0.0000001);
        assertEquals(51.349555, stop.getYCoord(), 0.0000001);
    }


    @Test
    public void test_33_check_OPNV_VRR_Suggestion_List_2() {
        System.out.println("test_33_check_OPNV_VRR_Suggestion_List_2");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VRR.getInstance(), "Chlodwigplatz, Köln");
        ParserSuggestionList_VRR suggestionList = new ParserSuggestionList_VRR(OPNV_VRR.getInstance(), suggestionString);

        System.out.println("suggestionString: " + suggestionString);

        assertEquals(1, suggestionList.getList().size());

        Stop stop = suggestionList.getList().get(0);
        assertEquals("Köln Chlodwigplatz", stop.getName());
        assertEquals("22000018", stop.getId());
        assertEquals(6.857103, stop.getXCoord(), 0.0000001);
        assertEquals(51.349555, stop.getYCoord(), 0.0000001);
    }

    @Test
    public void test_40_check_OPNV_VGN_Suggestion_List_1() {
        System.out.println("test_40_check_OPNV_VGN_Suggestion_List_1");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VGN.getInstance(), "Bamberg+Bahnhof");
        ParserSuggestionList_VGN suggestionList = new ParserSuggestionList_VGN(OPNV_VGN.getInstance(), suggestionString);

        System.out.println("suggestionString: " + suggestionString);

        assertEquals(5, suggestionList.getList().size());

        Stop stop = suggestionList.getList().get(3);
        assertEquals("", stop.getName());
        assertEquals("de:09461:20001", stop.getId());
        assertEquals(OPNV_VGN.xcoord, stop.getXCoord(), 0.0000001);
        assertEquals(OPNV_VGN.ycoord, stop.getYCoord(), 0.0000001);
        // assertEquals(10.8986251771901, stop.getXCoord(), 0.0000001);
        // assertEquals(49.9001695519942, stop.getYCoord(), 0.0000001);
    }

}