package org.sge.haltestellenanzeige;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_SaarSVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_DB_SVV;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRN;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserDB;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserSVV;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by peter on 06.02.2018.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class OrchestrationTest {
    public final static String STOP_NAME_SVV_MALSTATT = "Ludwigstr. Malstatt, Saarbrücken";
    public final static String STOP_NAME_SVV_MALSTATT_EXTID = "000010201";
    public final static String STOP_NAME_MA_WASSEERTURM = "Wasserturm, Mannheim";
    public final static String STOP_NAME_RMV_SPEYERERSTRASSE = "3000019";
    public final static String STOP_NAME_KVV = "de:08212:72";
    public final static String STOP_NAME_VBN = "008096108";
    public final static String STOP_NAME_VBN_StPauli = "000702911";
    public final static String STOP_ID_HVV = "Master:80900";
    public final static String STOP_NAME_HVV = "St.Pauli";
    public final static String STOP_NAME_MVV_MARIENPLATZ = "Marienplatz";
    public final static String STOP_ID_MVV_MARIENPLATZ = "de:09162:2";

    private Stop userSelectStopSaarbrueckenMalstatt() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), STOP_NAME_SVV_MALSTATT);

        System.out.println("---suggestion-------------------------");
        System.out.println(suggestionString);
        System.out.println("--------------------------------------");

        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);

        System.out.println("---stop name -------------------------");
        System.out.println(stop.getName());
        assertEquals("Ludwigstr. Malstatt, Saarbrücken", stop.getName());

        return stop;
    }


    private Stop userSelectStopMannheimWasserturm() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), STOP_NAME_MA_WASSEERTURM);

        System.out.println("---suggestion-------------------------");
        System.out.println(suggestionString);
        System.out.println("--------------------------------------");

        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_VRN.getInstance(), suggestionString);
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);
        System.out.println("---stop name -------------------------");
        System.out.println(stop.getName());
        assertEquals("Wasserturm, Mannheim", stop.getName());

        return stop;
    }


    @Test
    public void test_01_chooseStop_SVV_Malstatt() {
        System.out.println("test_01_chooseStop_SVV_Malstatt");
        Stop stop = userSelectStopSaarbrueckenMalstatt();
        System.out.println("stop name:             " + stop.getName());
        System.out.println("STOP_NAME_SVV_MALSTATT: " + STOP_NAME_SVV_MALSTATT);
        assertTrue("Haltestellen name", stop.getName().contentEquals(STOP_NAME_SVV_MALSTATT));
    }


    @Test
    public void test_02_searchStationSBMalstattAndThanGetStationBoard_DB() {
        System.out.println("test_02_searchStationSBMalstattAndThanGetStationBoard_DB");

        Stop stop = userSelectStopSaarbrueckenMalstatt();

        String stationName = stop.getName();
        System.out.println("stop.value: " + stationName);

        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, stop,
                OPNV_BahnDB.getInstance(), stop.getUrl());

        assertTrue("Response not empty" , !response.isEmpty());

        ParserDB parser = new ParserDB(response);

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_03_searchStationSBMalstattAndAskOPNVsWhetherTheyHaveItOrNot() {
        System.out.println("test_03_searchStationSBMalstattAndAskOPNVWhetherTheyHaveIt");
        Stop stopSBMalstattDB = userSelectStopSaarbrueckenMalstatt();
        assertEquals("Ludwigstr. Malstatt, Saarbrücken", stopSBMalstattDB.getName());
        assertEquals("000835814", stopSBMalstattDB.getId());
        assertEquals(6.978281, stopSBMalstattDB.getXCoord(), 0.0001);
        assertEquals(49.241165, stopSBMalstattDB.getYCoord(), 0.0001);
        assertEquals("DB", stopSBMalstattDB.getOPNV().getTag());
        assertEquals("https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=000835814&boardType=dep&time=now&start=yes&maxJourneys=50", stopSBMalstattDB.getUrl());

        Stop stopVRN = OPNV_VRN.getInstance().getStopSynchron(stopSBMalstattDB, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: VRN does not contain SBMalstatt stop" , stopVRN == null);

        Stop stopSVV = OPNV_SaarSVV.getInstance().getStopSynchron(stopSBMalstattDB, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: SVV contains SBMalstatt stop" , stopSVV != null);
        assertTrue("", "Ludwigstr., Saarbrücken Malstatt".contentEquals(stopSVV.getName()));
        assertTrue("expected xcoord: 6.978281  current xcoord: " + stopSVV.getXCoord(), 6.978281 == stopSVV.getXCoord());
        assertTrue("expected ycoord: 49.241219  current xcoord: " + stopSVV.getYCoord(), 49.241219 == stopSVV.getYCoord());

        System.out.println("" + stopSVV.getName() + " " + stopSVV.getXCoord() + " " + stopSVV.getYCoord());
    }


    @Test
    public void test_04_searchStationVRNWasserturmAndAskOPNVsWhetherTheyHaveItOrNot() {
        System.out.println("test_04_searchStationVRNWasserturmAndAskOPNVsWhetherTheyHaveItOrNot");
        Stop stopWasserturm = userSelectStopMannheimWasserturm();

        Stop stopVRN = OPNV_VRN.getInstance().getStopSynchron(stopWasserturm, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: VRN contains Wasserturm stop" , stopVRN != null);
        System.out.println("" + stopVRN.getName() + " " + stopVRN.getXCoord() + " " + stopVRN.getYCoord());
        assertTrue("", "Mannheim, Wasserturm".contentEquals(stopVRN.getName()));
        assertTrue("", 8.4741 == stopVRN.getXCoord());
        assertTrue("", 49.48465 == stopVRN.getYCoord());


        Stop stopSVV = OPNV_SaarSVV.getInstance().getStopSynchron(stopWasserturm, InstrumentationRegistry.getTargetContext());
        assertTrue("condition: SVV does not contain Wasserturm stop" , stopSVV == null);
    }


    @Test
    public void test_05_searchStationSBMalstattAndThanGetStationBoard_SVV() {
        Stop stopSBMalstattDB = userSelectStopSaarbrueckenMalstatt();
        Stop stopSVV = OPNV_SaarSVV.getInstance().getStopSynchron(stopSBMalstattDB, InstrumentationRegistry.getTargetContext());
        String response = BahnRequest.createBahnRequestSynchronWithTag(InstrumentationRegistry.getTargetContext(), null, OPNV_SaarSVV.getInstance(), stopSVV.getUrl());

        ParserSVV parser = new ParserSVV(response);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, true);
        ValidateResult.getInstance().checkLineContained(parser, "S 1");
        ValidateResult.getInstance().checkDirectionContained(parser, "Lebach", "Brebach", "Siedlerheim");

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_getCoord() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), STOP_NAME_SVV_MALSTATT);

        System.out.println("---suggestion-------------------------");
        System.out.println(suggestionString);
        System.out.println("--------------------------------------");

        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), ParserSuggestionList.extractJsonString(suggestionString));
        assertTrue("suggestionList > 0", suggestionListDB.getList().size() >= 1);

        Stop stop = suggestionListDB.getList().get(0);
        System.out.println("---stop name -------------------------");
        System.out.println("Name: " + stop.getName());
        System.out.println("ExtId: " + stop.getId());
        System.out.println("XCoord: " + stop.getXCoord());
        System.out.println("YCoord: " + stop.getYCoord());
    }


    @Test
    public void test_06_Persistence_SaveAndLoadSettingsTest() {
        System.out.println("test_06_Persistence_SaveAndLoadSettingsTest");
        // final String saveData = "Ludwigstr. Malstatt, Saarbrücken;;;;;835814;;;;;true;;;;;6.978173;;;;;49.241165;;;;;0.0;;;;;0.0;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Tivoli (RNZ), Viernheim;;;;;518554;;;;;true;;;;;8.565902;;;;;49.52846;;;;;0.0;;;;;0.0;;;;;VRN;;;;;Viernheim, Tivoli (RNZ);;;;;de:06431:3865;;;;;8.56525;;;;;49.52822;;;;;https://www.vrn.de/mngvrn/XML_DM_REQUEST?coordOutputFormat=EPSG:4326&depType=stopEvents&includeCompleteStopSeq=0&limit=50&locationServerActive=1&mode=direct&name_dm=de:06431:3865&outputFormat=json&type_dm=any&useOnlyStops=1&useRealtime=1;;;;;;;;;;;;;;;;;;;;0.9;;;;;0.0;;;;;Frankfurt(M)Hauptwache;;;;;8006692;;;;;true;;;;;8.67895;;;;;50.113927;;;;;0.9;;;;;0.0;;;;;DB;;;;;Frankfurt(M)Hauptwache;;;;;8006692;;;;;8.67895;;;;;50.113927;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=8006692&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.9;;;;;0.0;;;;;Bahnhof, Deidesheim;;;;;510141;;;;;true;;;;;8.19311;;;;;49.408472;;;;;0.0;;;;;0.0;;;;;VRN;;;;;Deidesheim, Bahnhof;;;;;de:07332:470;;;;;8.19273;;;;;49.40849;;;;;https://www.vrn.de/mngvrn/XML_DM_REQUEST?coordOutputFormat=EPSG:4326&depType=stopEvents&includeCompleteStopSeq=0&limit=50&locationServerActive=1&mode=direct&name_dm=de:07332:470&outputFormat=json&type_dm=any&useOnlyStops=1&useRealtime=1;;;;;;;;;;;;;;;;;;;;0.6;;;;;0.0;;;;;";
        final String saveData    = "Ludwigstr. Malstatt, Saarbrücken;;;;;835814;;;;;true;;;;;6.978173;;;;;49.241165;;;;;0.0;;;;;0.0;;;;;DB;;;;;Ludwigstr. Malstatt, Saarbrücken;;;;;835814;;;;;6.978173;;;;;49.241165;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=835814&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;Tivoli (RNZ), Viernheim;;;;;518554;;;;;true;;;;;8.565902;;;;;49.52846;;;;;0.0;;;;;0.0;;;;;VRN;;;;;Viernheim, Tivoli (RNZ);;;;;de:06431:3865;;;;;8.56525;;;;;49.52822;;;;;https://www.vrn.de/mngvrn/XML_DM_REQUEST?coordOutputFormat=EPSG:4326&depType=stopEvents&includeCompleteStopSeq=0&limit=50&locationServerActive=1&mode=direct&name_dm=de:06431:3865&outputFormat=json&type_dm=any&useOnlyStops=1&useRealtime=1;;;;;;;;;;;;;;;;;;;;0.9;;;;;0.0;;;;;Frankfurt(M)Hauptwache;;;;;8006692;;;;;true;;;;;8.67895;;;;;50.113927;;;;;0.9;;;;;0.0;;;;;DB;;;;;Frankfurt(M)Hauptwache;;;;;8006692;;;;;8.67895;;;;;50.113927;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=8006692&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.9;;;;;0.0;;;;;Bahnhof, Deidesheim;;;;;510141;;;;;true;;;;;8.19311;;;;;49.408472;;;;;0.0;;;;;0.0;;;;;VRN;;;;;Deidesheim, Bahnhof;;;;;de:07332:470;;;;;8.19273;;;;;49.40849;;;;;https://www.vrn.de/mngvrn/XML_DM_REQUEST?coordOutputFormat=EPSG:4326&depType=stopEvents&includeCompleteStopSeq=0&limit=50&locationServerActive=1&mode=direct&name_dm=de:07332:470&outputFormat=json&type_dm=any&useOnlyStops=1&useRealtime=1;;;;;;;;;;;;;;;;;;;;0.6;;;;;0.0;;;;;";
        Context context = InstrumentationRegistry.getTargetContext();

        Settings.getInstance().saveSettings(InstrumentationRegistry.getTargetContext(), saveData);
        Settings.getInstance().loadSettings(InstrumentationRegistry.getTargetContext());
        String saveString = Settings.getInstance().computeSaveString(context);

        System.out.println("saveData: " + saveData);
        System.out.println("saveString: " + saveString);

        assertEquals(saveData, saveString);

        assertEquals(Settings.getInstance().getRegPageSettings(0).getStationName(), "Ludwigstr. Malstatt, Saarbrücken");
        assertEquals(Settings.getInstance().getRegPageSettings(1).getStationNameDB(), "Tivoli (RNZ), Viernheim");
        assertEquals(Settings.getInstance().getRegPageSettings(2).getStopPrimaryOPNV().getName(), "Frankfurt(M)Hauptwache");
        assertEquals(Settings.getInstance().getRegPageSettings(3).getQmRate(), 0, 0.0001);
        assertEquals(Settings.getInstance().getRegPageSettings(0).getXCoordDB(), 6.978173, 0.0001);
        assertEquals(Settings.getInstance().getRegPageSettings(1).getSecondaryOPNVForThisStation().getName(), "Viernheim, Tivoli (RNZ)");
        assertEquals(Settings.getInstance().getRegPageSettings(2).getDelayRate(), 0.9, 0.0001);
        assertEquals(Settings.getInstance().getRegPageSettings(3).getSecondaryOPNVForThisStation().getOPNV().getTag(), "VRN");
        assertEquals(Settings.getInstance().getRegPageSettings(0).getStopPrimaryOPNV().getOPNV().getTag(), "DB");
    }


    @Test
    public void test_07_Persistence_ParseDefaultSaveString() {
        System.out.println("test_07_Persistence_ParseDefaultSaveString");
        final String saveData = Settings.DEFAULT_CONFIGURATION_STRING;
        Context context = InstrumentationRegistry.getTargetContext();

        Settings.getInstance().saveSettings(InstrumentationRegistry.getTargetContext(), saveData);
        Settings.getInstance().loadSettings(InstrumentationRegistry.getTargetContext());
        String saveString = Settings.getInstance().computeSaveString(context);
        System.out.println("saveString: " + saveString);

        assertEquals(saveData, saveString);

        assertEquals(Settings.getInstance().getRegPageSettings(0).getStationName(), "Bitte Haltestelle wählen ->");
        assertEquals(Settings.getInstance().getRegPageSettings(1).getStationNameDB(), "Bitte Haltestelle wählen ->");
        assertEquals(Settings.getInstance().getRegPageSettings(2).getStopPrimaryOPNV().getName(), "Bitte Haltestelle wählen ->");
        assertEquals(Settings.getInstance().getRegPageSettings(3).getQmRate(), 0, 0.0001);
        assertEquals(Settings.getInstance().getRegPageSettings(0).getXCoordDB(), 0, 0.0001);
        assertEquals(Settings.getInstance().getRegPageSettings(1).getSecondaryOPNVForThisStation().getName(), "Bitte Haltestelle wählen ->");
        assertEquals(Settings.getInstance().getRegPageSettings(2).getDelayRate(), 0.0, 0.0001);
        assertEquals(Settings.getInstance().getRegPageSettings(3).getSecondaryOPNVForThisStation().getOPNV().getTag(), "DB");
        assertEquals(Settings.getInstance().getRegPageSettings(0).getStopPrimaryOPNV().getOPNV().getTag(), "DB");
    }

}
