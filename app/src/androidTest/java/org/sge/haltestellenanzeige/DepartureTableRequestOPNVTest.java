package org.sge.haltestellenanzeige;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.sge.haltestellenanzeige.net.ResponseContainer;
import org.sge.haltestellenanzeige.net.StationBoardInterface;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_HVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_KVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_MVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_RMV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_SaarSVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VBN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VGN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRR;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserDB;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserHVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserKVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserMVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserRMV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserSVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVBN;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVGN;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVRN;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVRR;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertTrue;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class DepartureTableRequestOPNVTest {

    @Test
    public void test_00_TestParserRequestAsynWithTagResponseDB() {
        System.out.println("test_02_TestParserRequestAsynWithTagResponseDB");
        Context appContext = InstrumentationRegistry.getTargetContext();
        BahnRequest.createBahnRequestSynchronWithTag(appContext,null, OPNV_BahnDB.getInstance(), "Frankfurt(Main)Hbf");
    }


    @Test
    public void test_01a_TestParserRequestResponseDB_FFMHauptbahnhof() {
        System.out.println("test_01a_TestParserRequestResponseDB_FFMHauptbahnhof");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_BahnDB.getInstance(), "Frankfurt(Main)Hbf");
        System.out.println("test_01: Response not empty");
        assertTrue("Response not null", response != null);
        System.out.println("response size: " + response.length());
        assertTrue("Response is empty" , !response.isEmpty());

        ParserDB parser = new ParserDB(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        // getDepartureRow: 21:56
        assertTrue("getDepartureRow" , parser.getDepartureRow(0).length() >= 4);

        // getLineRow: RNV 5
        assertTrue("getLineRow: ", parser.getLineRow(0).length() > 0);

        // getPredictionRow:
        assertTrue("getPredictionRow: ", parser.getPredictionRow(0).length() >= 0);

        // getPredictionSeverityRow: 0
        assertTrue("getPredictionSeverityRow: ", parser.getPredictionSeverityRow(0) >= 0);
        assertTrue("getPredictionSeverityRow: ", parser.getPredictionSeverityRow(0) <= 3);

        // sum of predictions > 0
        int sumLength = 0;
        int sum = 0;
        for(int r=0; r< UI_StationDisplay.NUMBER_ROWS; r++) {
            sumLength = sumLength + parser.getPredictionRow(r).length();
            sum = sum + parser.getPredictionSeverityRow(r);
        }
        assertTrue("sum delays1: ", sumLength > 0);
        assertTrue("sum delays2: ", sum > 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, true);
        ValidateResult.getInstance().checkLineContained(parser, "STR 12" ,"STR 11", "Bus 33");
        ValidateResult.getInstance().checkDirectionContained(parser, new String[] { "München Hbf", "Zürich HB", "Wiesbaden Hbf", "Passau Hbf", "Friedberg(Hess)", "Schwanheim Rheinlandstraße, Frankfurt a.M.", "Bockenheimer Warte, Frankfurt a.M.", "Frankfurt(Main)Süd" });

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_01b_TestParserRequestResponseDB_FFMHauptwache() {
        System.out.println("test_01b_TestParserRequestResponseDB_FFMHauptwache");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_BahnDB.getInstance(), "Frankfurt(M)Hauptwache");
        System.out.println("=== test_01b_TestParserRequestResponseDB_FFMHauptwache =============================================");
        System.out.println(response);
        System.out.println("================================================");
        System.out.println("test_01: Response not empty");
        assertTrue("Response not null", response != null);
        System.out.println("response size: " + response.length());
        assertTrue("Response not empty" , !response.isEmpty());

        ParserDB parser = new ParserDB(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, true);
        ValidateResult.getInstance().validateDelayInformationExists(parser);
        ValidateResult.getInstance().checkLineContained(parser, "S 3", "S 5", "U 3");
        ValidateResult.getInstance().checkDirectionContained(parser, "Frankfurt a.M.", "Frankfurt(Main)Süd");

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));

        int greenCounter = 0;
        int yellowCounter = 0;
        int redCounter = 0;
        int unknownCounter = 0;
        for(int r=0; r< UI_StationDisplay.NUMBER_ROWS; r++) {
            if(StationBoardInterface.DELAY_SERVERITY_GREEN   == parser.getPredictionSeverityRow(r)) greenCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_YELLOW  == parser.getPredictionSeverityRow(r)) yellowCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_RED     == parser.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_UNKNOWN == parser.getPredictionSeverityRow(r)) unknownCounter++;
        }

        System.out.println("Anzahl an pünktlichen Verbindungen: " + greenCounter);
        System.out.println("Anzahl an leichten Verspaetungen: " + yellowCounter);
        System.out.println("Anzahl an großen Verspaetungen: " + redCounter);
        System.out.println("Anzahl an unbekannten Verbindungen: " + unknownCounter);

        Assert.assertTrue("Erwartete Anzahl an pünktlichen Verbindungen groesser 0", greenCounter > 0);
        Assert.assertTrue("Erwartete Anzahl an leichten Verspaetungen groesser 0", yellowCounter > 0);
        Assert.assertTrue("Erwartete Anzahl an großen Verspaetungen groesser 0", redCounter >= 0);
        Assert.assertTrue("Erwartete Anzahl an unbekannten Verspaetungen groesser 0", unknownCounter >= 0);
    }


    @Test
    public void test_01c_TestParserRequestResponseDB_VRNTivoli() {
        System.out.println("test_01c_TestParserRequestResponseDB_VRNTivoli");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_BahnDB.getInstance(), "Viernheim, Tivoli");

        ParserDB parser = new ParserDB(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);
        ValidateResult.getInstance().check(parser);
    }


    @Test
    public void test_02_TestParserRequestResponseDB_HbfSB() {
        System.out.println("test_02_TestParserRequestResponseDB_HbfSB");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_BahnDB.getInstance(), "008000323");

        ParserDB parser = new ParserDB(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, true);
        ValidateResult.getInstance().checkLineContained(parser, "RE 29533", "Bus 122", "Bus 125");
        ValidateResult.getInstance().checkDirectionContained(parser, new String[] { "Saarbrücken", "Supermarché Hombourg-Haut, Frankreich", "Neues Rathaus Bisten, Überherrn",  "Matzenberg Siedlung Burbach, Saarbrücken", "Dudoplatz Dudweiler, Saarbrücken", "Luxembourg" });

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_03_TestParserRequestResponseSVV_LudwigstrSaarland() {
        System.out.println("test_03_TestParserRequestResponseSVV_LudwigstrSaarland");
        Context appContext = InstrumentationRegistry.getTargetContext();
        // 000010201 entspricht Ludwigstr. Malstatt, Saarbrücken
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_SaarSVV.getInstance(), "000010201");
        assertTrue("Response not empty" , !response.isEmpty());

        ParserSVV parser = new ParserSVV(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, true);
        ValidateResult.getInstance().checkLineContained(parser, "S 1");
        ValidateResult.getInstance().checkDirectionContained(parser, "Lebach", "Brebach");

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_04_TestParserRequestResponseSVV_SB() {
        System.out.println("test_04_TestParserRequestResponseSVV_SB");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null,
                OPNV_SaarSVV.getInstance(), OrchestrationTest.STOP_NAME_SVV_MALSTATT_EXTID);
        assertTrue("Response not empty" , !response.isEmpty());
        // System.out.println("response: " + response);

        ParserSVV parser = new ParserSVV(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, true);
        ValidateResult.getInstance().validateDelayInformationExists(parser);
        ValidateResult.getInstance().checkLineContained(parser, "S 1");
        ValidateResult.getInstance().checkDirectionContained(parser, "Lebach");
        ValidateResult.getInstance().checkDirectionContained(parser, "Brebach");

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_05_TestParserRequestResponseVRN_ViernheimRnz() {
        System.out.println("test_05_TestParserRequestResponseVREN_ViernheimRnz");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_VRN.getInstance(), "de:06431:3865");
        assertTrue("Response not empty", !response.isEmpty());

        ParserVRN parser = new ParserVRN(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, false);
        ValidateResult.getInstance().checkLineContained(parser, "RNV 5", "612");
        ValidateResult.getInstance().checkDirectionContained(parser, "Ma Hbf", "Weinheim", "Viernheim");
    }

    @Test
    public void test_06_TestParserRequestResponseVRN_MannheimHbf() {
        System.out.println("test_06_TestParserRequestResponseVRN_MannheimHbf");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_VRN.getInstance(), "de:08222:2417");
        assertTrue("Response not empty", !response.isEmpty());

        ParserVRN parser = new ParserVRN(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, false);
        ValidateResult.getInstance().checkLineContained(parser, "RNV 1", "RNV 4");
        ValidateResult.getInstance().checkDirectionContained(parser, "Mannheim", "Heidelberg");
    }


    @Test
    public void test_07_TestParserRequestResponseSVV_ManchmalKeineAnzeige() {
        System.out.println("test_07_TestParserRequestResponseSVV_ManchmalKeineAnzeige");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_SaarSVV.getInstance(), "000082108");
        assertTrue("Response not empty" , !response.isEmpty());

        System.out.println(response);
        // <p class="error">Im angegebenen Zeitraum f&#228;hrt an dieser Haltestelle keines der ausgew&#228;hlten Verkehrsmittel.</p>

        ParserSVV parser = new ParserSVV(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);
        if(!parser.parsingDoneWithoutWarnings()) return;

        // ValidateResult.getInstance().validateDepartureTime(parser);
        // ValidateResult.getInstance().checkLineContained(parser, "Bus 161", "Bus 170");
        // ValidateResult.getInstance().checkDirectionContained(parser, "Lebach", "Landstuhl", "Hohenecken");

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_08_TestParserRequestResponse_RMV_SpeyererStrasse() {
        System.out.println("test_08_TestParserRequestResponse_RMV_SpeyererStrasse");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null,
                OPNV_RMV.getInstance(), OrchestrationTest.STOP_NAME_RMV_SPEYERERSTRASSE);

        assertTrue("Response not empty" , !response.isEmpty());

        ParserRMV parser = new ParserRMV(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, false);
        ValidateResult.getInstance().validateDelayInformationExists(parser);

        ValidateResult.getInstance().checkLineContained(parser, "Tram 12", "Tram 11");
        ValidateResult.getInstance().checkDirectionContained(parser, "Frankfurt");

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_09_TestParserRequestResponse_KVV() {
        System.out.println("test_09_TestParserRequestResponse_KVV");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null,
                OPNV_KVV.getInstance(), OrchestrationTest.STOP_NAME_KVV);

        // System.out.println("==================================================================");
        // System.out.println(response);
        // System.out.println("==================================================================");

        assertTrue("Response is empty" , !response.isEmpty());

        long startTime = System.currentTimeMillis();
        ParserKVV parser = new ParserKVV(response);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        long endTime = System.currentTimeMillis();
        System.out.println("parsing time KVV (ms): " + (endTime - startTime)); // 669 ms

        assertTrue("count exceptions not zero " + OPNV_KVV.getInstance().getTag(), parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, false);

        ValidateResult.getInstance().checkLineContained(parser, "Bus 10", "Tram 6");
        ValidateResult.getInstance().checkDirectionContained(parser, "Hauptbahnhof");

        assertTrue("delay rate: " + parser.getDelayRate(), (parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 0));
    }


    @Test
    public void test_10_TestParserRequestResponse_VBN() {
        System.out.println("test_10_TestParserRequestResponse_VBN");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null,
                OPNV_VBN.getInstance(), OrchestrationTest.STOP_NAME_VBN);

        System.out.println("test_10_TestParserRequestResponse_VBN response: " + response);
        assertTrue("Response is empty" , !response.isEmpty());

        ParserVBN parser = new ParserVBN(response);
        assertTrue("count exceptions not zero " + OPNV_VBN.getInstance().getTag(), parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, false);
        ValidateResult.getInstance().checkLineContained(parser, "Tram 3", "Bus 26", "Tram 2");
        ValidateResult.getInstance().checkDirectionContained(parser, "Bremen","Huchting", "Weserwehr");

        assertTrue("delay rate: " + parser.getDelayRate(), (parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 0));
    }


    @Test
    public void test_10_TestParserRequestResponse_StPauli_VBN() {
        System.out.println("test_10_TestParserRequestResponse_StPauli_VBN");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null,
                OPNV_VBN.getInstance(), OrchestrationTest.STOP_NAME_VBN_StPauli);

        System.out.println("test_10_TestParserRequestResponse_StPauli_VBN response: " + response);
        assertTrue("Response is empty" , !response.isEmpty());

        ParserVBN parser = new ParserVBN(response);
        assertTrue("count exceptions not zero " + OPNV_VBN.getInstance().getTag(), parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, false);

        ValidateResult.getInstance().checkLineContained(parser, "Bus 112", "U3");
        ValidateResult.getInstance().checkDirectionContained(parser, "S Blankenese","Barmbek", "Hamburg-Barmbek");

        assertTrue("delay rate: " + parser.getDelayRate(), (parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 0));
    }


    @Test
    public void test_11_TestParserRequestResponse_HVV() {
        System.out.println("test_11_TestParserRequestResponse_HVV");
        Context appContext = InstrumentationRegistry.getTargetContext();
        Stop stopHVV = new Stop(OPNV_HVV.getInstance(), OrchestrationTest.STOP_NAME_HVV, OrchestrationTest.STOP_ID_HVV, 0.0, 0.0, OPNV_HVV.getInstance().getUrl(""));
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_HVV.getInstance(), OrchestrationTest.STOP_ID_HVV, stopHVV);

        System.out.println("test_11_TestParserRequestResponse_HVV response: " + response);
        assertTrue("Response is empty" , !response.isEmpty());

        ParserHVV parser = new ParserHVV(response);
        assertTrue("count exceptions not zero " + OPNV_HVV.getInstance().getTag(), parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, false);

        ValidateResult.getInstance().checkLineContained(parser, "U3");

        ValidateResult.getInstance().checkDirectionContained(parser, "Rathaus","Osterbrookplatz", "Berner Heerweg");

        assertTrue("delay rate: " + parser.getDelayRate(), (parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 0));
    }


    @Test
    public void test_12_TestParserRequestResponse_MVV() {
        System.out.println("test_12_TestParserRequestResponse_MVV");
        Context appContext = InstrumentationRegistry.getTargetContext();
        long startTime = System.currentTimeMillis();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null,
                OPNV_MVV.getInstance(), OrchestrationTest.STOP_ID_MVV_MARIENPLATZ);
        long endTime = System.currentTimeMillis();
        System.out.println("response time(ms): " + (endTime - startTime));

        System.out.println("test_12_TestParserRequestResponse_MVV response: " + response);
        assertTrue("Response is empty" , !response.isEmpty());

        ParserMVV parser = new ParserMVV(response);
        assertTrue("count exceptions not zero " + OPNV_MVV.getInstance().getTag(), parser.getCountExceptions() == 0);

        ValidateResult.getInstance().checkLineContained(parser, "U6", "U3", "S2");
        ValidateResult.getInstance().checkDirectionContained(parser, new String[] {"Fröttmaning", "München Flughafen Terminal", "München Ost", "Freising", "München-Trudering", "Herrsching", "Klinikum Großhadern"});
        ValidateResult.getInstance().validateDelay(parser, false);
        ValidateResult.getInstance().validateDepartureTime(parser);

        assertTrue("delay rate: " + parser.getDelayRate(), (parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_13_TestParser_VRR() {
        Context context = InstrumentationRegistry.getTargetContext();
        ResponseContainer response = BahnRequest.createBahnDepartureStringPostRequestSynchron(context, "tag", OPNV_VRR.getInstance(), "22000018", "Köln, Chlodwigplatz");
        System.out.println("response status: " + response.status);
        System.out.println("response content: " + response.content);

        assertTrue("response.status: ", response.status);
        assertTrue("response.content > 0: ", response.content.length() > 0);

        ParserVRR parser = new ParserVRR(response.content);
        assertTrue("count exceptions not zero " + OPNV_VRR.getInstance().getTag(), parser.getCountExceptions() == 0);

        ValidateResult.getInstance().checkLineContained(parser, new String[] {"133", "142", "106", "15", "132", "17"});
        ValidateResult.getInstance().checkDirectionContained(parser, new String[] {"Marienburg Südpark,Köln", "Heumarkt,Köln", "Wesseling,Wesseling", "Severinstr.,Köln", "Frankenstr.,Meschenich", "Breslauer Platz/Hbf,Köln", "Ubierring,Köln", ""});
        ValidateResult.getInstance().validateDelay(parser, false);
        ValidateResult.getInstance().validateDepartureTime(parser);

        assertTrue("delay rate: " + parser.getDelayRate(), (parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_14_TestParser_VRR_DortmundHafen() {
        Context context = InstrumentationRegistry.getTargetContext();

        long startTime = System.currentTimeMillis();
        ResponseContainer response = BahnRequest.createBahnDepartureStringPostRequestSynchron(context, "tag", OPNV_VRR.getInstance(), "20000201", "Dortmund, Hafen");
        long endTime = System.currentTimeMillis();
        System.out.println("response time(ms): " + (endTime - startTime));

        System.out.println("response.status: " + response.status);
        // System.out.println("response.content: " + response.content);

        /*
        int chunkSize = 500;
        int chunks = response.content.length() / chunkSize;

        System.out.println("response.content chunked:");
        for(int i=0; i<chunks+1; i++) {
            System.out.println(response.content.substring(Math.min(0 + i*chunkSize, response.content.length()), Math.min(chunkSize + i*chunkSize, response.content.length())));
        }
        */

        assertTrue("response.status: ", response.status);
        assertTrue("response.content > 0: ", response.content.length() > 0);

        ParserVRR parser = new ParserVRR(response.content);
        assertTrue("count exceptions not zero " + OPNV_VRR.getInstance().getTag(), parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, true);
        ValidateResult.getInstance().checkLineContained(parser, "U47" ,"475");
        ValidateResult.getInstance().checkDirectionContained(parser, new String[] { "Dortmund Westerfilde S", "Dortmund, Aplerbeck", "Dortmund Deusen"});

        assertTrue("delay rate: " + parser.getDelayRate(), (parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }


    @Test
    public void test_15_TestParser_VGN_Nuernberg() {
        Context context = InstrumentationRegistry.getTargetContext();

        long startTime = System.currentTimeMillis();
        ResponseContainer response = BahnRequest.createBahnDepartureStringPostRequestSynchron(context, "tag", OPNV_VGN.getInstance(), "de:09564:232", "(Nürnberg, Friedrich-Ebert-Platz");
        long endTime = System.currentTimeMillis();
        System.out.println("response time(ms): " + (endTime - startTime));

        System.out.println("response.status: " + response.status);
        assertTrue("response.status: ", response.status);
        assertTrue("response.content > 0: ", response.content.length() > 0);

        long startTime2 = System.currentTimeMillis();
        ParserVGN parser = new ParserVGN(response.content);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);
        long endTime2 = System.currentTimeMillis();
        System.out.println("parsing time VGN (ms): " + (endTime2 - startTime2));
        assertTrue("count exceptions not zero " + OPNV_VGN.getInstance().getTag(), parser.getCountExceptions() == 0);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, true);
        ValidateResult.getInstance().checkLineContained(parser, "4" ,"34", "U3");
        ValidateResult.getInstance().checkDirectionContained(parser, new String[] { "Gustav-\u200BAdolf-\u200BStr", "Nordwestring", "AmWegfeld", "", "", "", "", "" });

        assertTrue("delay rate: " + parser.getDelayRate(), (parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue("qm rate: " + parser.getQMRate(), (parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }
}

