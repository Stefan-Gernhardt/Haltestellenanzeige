package org.sge.haltestellenanzeige;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sge.haltestellenanzeige.net.StationBoardInterface;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_HVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserDB;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserHVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserKVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserMVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserRMV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserSVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVBN;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVGN;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVRN;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVRR;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

import java.io.InputStream;

import static org.junit.Assert.*;
import static org.sge.haltestellenanzeige.net.StationBoardInterface.DELAY_SERVERITY_CANCELLED;
import static org.sge.haltestellenanzeige.net.StationBoardInterface.DELAY_SERVERITY_GREEN;
import static org.sge.haltestellenanzeige.net.StationBoardInterface.DELAY_SERVERITY_RED;
import static org.sge.haltestellenanzeige.net.StationBoardInterface.DELAY_SERVERITY_UNKNOWN;
import static org.sge.haltestellenanzeige.net.StationBoardInterface.DELAY_SERVERITY_YELLOW;


/**
 * Created by Admin on 28.01.2018.
 */

@RunWith(AndroidJUnit4.class)
public class DepartureTableRequestOPNVTest_Unit {
    @Test
    public void unitTestFFMHauptwache() throws Exception {
        System.out.println("unitTestFFMHauptwache");
        ParserDB bahnHtml = new ParserDB(TestData.htmlResponseFFMHauptwache);
        assertTrue("count exceptions not zero", bahnHtml.getCountExceptions() == 0);

        assertEquals("Südbahnhof, Frankfurt a.M.", bahnHtml.getDestinationRow(0));
        assertEquals("17:14", bahnHtml.getDepartureRow(0));
        assertEquals("17:23", bahnHtml.getPredictionRow(0));
        assertEquals((long)StationBoardInterface.DELAY_SERVERITY_RED, (long)bahnHtml.getPredictionSeverityRow(0));

        assertEquals("Gonzenheim (U), Bad Homburg v.d. Höhe", bahnHtml.getDestinationRow(1));
        assertEquals("17:16", bahnHtml.getDepartureRow(1));
        assertEquals("17:25", bahnHtml.getPredictionRow(1));
        assertEquals((long)StationBoardInterface.DELAY_SERVERITY_RED, (long)bahnHtml.getPredictionSeverityRow(1));

        assertEquals("Südbahnhof, Frankfurt a.M.", bahnHtml.getDestinationRow(2));
        assertEquals("17:16", bahnHtml.getDepartureRow(2));
        assertEquals("17:26", bahnHtml.getPredictionRow(2));
        assertEquals((long)StationBoardInterface.DELAY_SERVERITY_RED, (long)bahnHtml.getPredictionSeverityRow(2));

        assertEquals("Niedernhausen(Taunus)", bahnHtml.getDestinationRow(3));
        assertEquals("17:18", bahnHtml.getDepartureRow(3));
        assertEquals("17:18", bahnHtml.getPredictionRow(3));
        assertEquals((long)StationBoardInterface.DELAY_SERVERITY_GREEN, (long)bahnHtml.getPredictionSeverityRow(3));

        assertEquals("Hausen, Frankfurt a.M.", bahnHtml.getDestinationRow(7));
        assertEquals("17:22", bahnHtml.getDepartureRow(7));
        assertEquals("", bahnHtml.getPredictionRow(7));
        assertEquals((long)StationBoardInterface.DELAY_SERVERITY_UNKNOWN, (long)bahnHtml.getPredictionSeverityRow(7));

        int greenCounter = 0;
        int yellowCounter = 0;
        int redCounter = 0;
        int unknownCounter = 0;
        for(int r=0; r< UI_StationDisplay.NUMBER_ROWS; r++) {
            if(StationBoardInterface.DELAY_SERVERITY_GREEN     == bahnHtml.getPredictionSeverityRow(r)) greenCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_YELLOW    == bahnHtml.getPredictionSeverityRow(r)) yellowCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_RED       == bahnHtml.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_CANCELLED == bahnHtml.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_UNKNOWN   == bahnHtml.getPredictionSeverityRow(r)) unknownCounter++;
        }

        assertEquals(greenCounter, 1);
        assertEquals(yellowCounter, 18);
        assertEquals(redCounter, 5);
        assertEquals(unknownCounter, 26);

        assertEquals(greenCounter + yellowCounter + redCounter + unknownCounter, UI_StationDisplay.NUMBER_ROWS);
    }


    @Test
    public void unitTestFFMHauptwacheB() throws Exception {
        System.out.println("unitTestFFMHauptwache");
        ParserDB bahnHtml = new ParserDB(TestData.htmlResponseFFMHauptwacheB);
        assertTrue("count exceptions not zero", bahnHtml.getCountExceptions() == 0);

        assertEquals("Hanau HbfSignalstörung: Auf der Strecke Mainz-Bischofsheim - Frankfurt(Main)Hbf zwischen Rüsselsheim und Raunheim. Es kommt zu Verspätungen im S-Bahnverkehr der Deutschen Bahn.", bahnHtml.getDestinationRow(14));
        assertEquals("19:33", bahnHtml.getDepartureRow(14));
        assertEquals("19:33", bahnHtml.getPredictionRow(14));
        assertEquals((long)StationBoardInterface.DELAY_SERVERITY_GREEN, (long)bahnHtml.getPredictionSeverityRow(14));

        assertEquals("Gonzenheim (U), Bad Homburg v.d. HöheFahrt fällt aus", bahnHtml.getDestinationRow(17));
        assertEquals("19:34", bahnHtml.getDepartureRow(17));
        assertEquals("", bahnHtml.getPredictionRow(17));
        assertEquals((long)StationBoardInterface.DELAY_SERVERITY_UNKNOWN, (long)bahnHtml.getPredictionSeverityRow(17));

        assertEquals("Offenbach(Main)OstSignalstörung: Auf der Strecke Mainz-Bischofsheim - Frankfurt(Main)Hbf zwischen Rüsselsheim und Raunheim. Es kommt zu Verspätungen im S-Bahnverkehr der Deutschen Bahn.", bahnHtml.getDestinationRow(39));
        assertEquals("19:48", bahnHtml.getDepartureRow(39));
        assertEquals("19:50", bahnHtml.getPredictionRow(39));
        assertEquals((long)StationBoardInterface.DELAY_SERVERITY_YELLOW, (long)bahnHtml.getPredictionSeverityRow(39));

        int greenCounter = 0;
        int yellowCounter = 0;
        int redCounter = 0;
        int unknownCounter = 0;
        for(int r=0; r< UI_StationDisplay.NUMBER_ROWS; r++) {
            if(StationBoardInterface.DELAY_SERVERITY_GREEN     == bahnHtml.getPredictionSeverityRow(r)) greenCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_YELLOW    == bahnHtml.getPredictionSeverityRow(r)) yellowCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_RED       == bahnHtml.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_CANCELLED == bahnHtml.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_UNKNOWN   == bahnHtml.getPredictionSeverityRow(r)) unknownCounter++;
        }

        assertEquals(greenCounter, 26);
        assertEquals(yellowCounter, 13);
        assertEquals(redCounter, 1);
        assertEquals(unknownCounter, 10);

        assertEquals(greenCounter + yellowCounter + redCounter + unknownCounter, UI_StationDisplay.NUMBER_ROWS);
    }


    @Test
    public void unitTestFFMHbf() throws Exception {
        System.out.println("unitTestFFMHbf");
        ParserDB bahnHtml = new ParserDB(TestData.htmlResponseFFMHbf);
        assertTrue("count exceptions not zero", bahnHtml.getCountExceptions() == 0);

        System.out.println("erste Abfahrtzeit: " + bahnHtml.getDepartureRow(0));

        // First line
        assertEquals("10:14", bahnHtml.getDepartureRow(0));

        String platform = bahnHtml.getPlatformRow(0);
        assertEquals("9", platform);

        String dest = bahnHtml.getDestinationRow(0).substring(5);
        System.out.println("<" + "Berlin Gesundbrunnen" + ">");
        System.out.println("<" + dest + ">");
        assertEquals("n Gesundbrunnen", dest);

        assertEquals("ICE 692", bahnHtml.getLineRow(0));
        assertEquals("10:38",bahnHtml.getPredictionRow(0));
        assertEquals((long)DELAY_SERVERITY_RED, bahnHtml.getPredictionSeverityRow(0).longValue());

        // second line
        assertEquals("10:36", bahnHtml.getDepartureRow(1));
        assertEquals("on Straßenbahn, Frankfurt a.M.", bahnHtml.getDestinationRow(1).substring(5));
        assertEquals("STR 21", bahnHtml.getLineRow(1));
        assertEquals("10:37",bahnHtml.getPredictionRow(1));
        assertEquals((long)DELAY_SERVERITY_YELLOW, bahnHtml.getPredictionSeverityRow(1).longValue());

        // third line
        assertEquals("10:37", bahnHtml.getDepartureRow(2));
        assertEquals("101", bahnHtml.getPlatformRow(2));
        assertEquals("furt(Main)Süd", bahnHtml.getDestinationRow(2).substring(5));
        assertEquals("S 5", bahnHtml.getLineRow(2));
        assertEquals("10:38",bahnHtml.getPredictionRow(2));
        assertEquals((long)DELAY_SERVERITY_YELLOW, bahnHtml.getPredictionSeverityRow(2).longValue());

        // fourth line
        assertEquals("10:37", bahnHtml.getDepartureRow(3));
        assertEquals("Kirche, Frankfurt a.M.", bahnHtml.getDestinationRow(3).substring(5));
        assertEquals("STR 21", bahnHtml.getLineRow(3));
        assertEquals("",bahnHtml.getPredictionRow(3));
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, bahnHtml.getPredictionSeverityRow(3).longValue());

        assertEquals(0.5, bahnHtml.getDelayRate(), 0.01);
        assertEquals(0.0, bahnHtml.getQMRate(), 0.01);
    }


    @Test
    public void unitTestSvv() throws Exception {
        System.out.println("unitTestSvv");
        ParserSVV parser = new ParserSVV(TestData.htmlResponseSvv);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("15:39", parser.getDepartureRow(0));
        assertEquals("C", parser.getPlatformRow(10));
        assertEquals("Rodenhof Kálmánstr.", parser.getDestinationRow(10));
        assertEquals("S 1", parser.getLineRow(3));
        assertEquals("1",parser.getPredictionRow(1));
        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(2).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(3).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(4).longValue());
        assertEquals("Bus 102", parser.getLineRow(2));

        assertEquals(0.9, parser.getDelayRate(), 0.01);
        assertEquals(0.0, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestVRNRnz() throws Exception {
        ParserVRN parser = new ParserVRN(TestData.jsonVRNResponseViernheimRNZ);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("12:26", parser.getDepartureRow(0));
        assertEquals("Weinheim", parser.getDestinationRow(0));
        assertEquals("RNV 5", parser.getLineRow(3));
        assertEquals("612", parser.getLineRow(2));
        assertEquals("2",parser.getPredictionRow(0));
        assertEquals("3",parser.getPredictionRow(1));
        assertEquals("",parser.getPredictionRow(2));
        assertEquals("pktl.",parser.getPredictionRow(3));
        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(1).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(2).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(3).longValue());

        assertEquals(0.3, parser.getDelayRate(), 0.01);
        assertEquals(0.6, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestVRN_Wasserturm() throws Exception {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("VRNWasserturrm.json");
        String jsonVRNResponseViernheimWasserturm = Util.readTestDataFile(in);
        System.out.println(jsonVRNResponseViernheimWasserturm);

        ParserVRN parser = new ParserVRN(jsonVRNResponseViernheimWasserturm);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("13:22", parser.getDepartureRow(0));
        assertEquals("Mannheim, Luisenp./Technoseum", parser.getDestinationRow(0));
        assertEquals("RNV 9", parser.getLineRow(0));
        assertEquals("pktl.",parser.getPredictionRow(0));
        assertEquals("pktl.",parser.getPredictionRow(1));
        assertEquals("pktl.",parser.getPredictionRow(2));
        assertEquals("pktl.",parser.getPredictionRow(3));
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(1).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(2).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(3).longValue());

        assertEquals(1.0, parser.getDelayRate(), 0.01);
        assertEquals(0.0, parser.getQMRate(), 0.01);
    }

    @Test
    public void unitTestVRN_reproduceException() throws Exception {
        ParserVRN parser = new ParserVRN(TestData.FILE_CONTENT__REPRODUCE_EXCEPTION_VRN);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("07:49", parser.getDepartureRow(0));
        assertEquals("Brakel, Grundschule", parser.getDestinationRow(0));
        assertEquals("570", parser.getLineRow(0));
        assertEquals("",parser.getPredictionRow(0));
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(0).longValue());

        assertEquals(0.0, parser.getDelayRate(), 0.01);
        assertEquals(0.9, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestRMV_SpeyererStrasse() throws Exception {
        String s = new String(TestData.htmlResponse_RMV_SpeyererStrasse);
        ParserRMV parser = new ParserRMV(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("21:46", parser.getDepartureRow(0));
        assertEquals("Frankfurt (Main) Nied Kirche", parser.getDestinationRow(0));
        assertEquals("Tram 21", parser.getLineRow(3));
        assertEquals("Tram 11", parser.getLineRow(2));
        assertEquals("21:51",parser.getPredictionRow(0));
        assertEquals("pünktlich",parser.getPredictionRow(1));
        assertEquals("21:57",parser.getPredictionRow(2));
        assertEquals("22:01",parser.getPredictionRow(3));
        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_RED, parser.getPredictionSeverityRow(23).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(45).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(4).longValue());

        assertEquals(1.0, parser.getDelayRate(), 0.01);
        assertEquals(0.0, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestKVV() throws Exception {
        String s = new String(TestData.htmlResponseKVV);
        ParserKVV parser = new ParserKVV(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("23:59", parser.getDepartureRow(0));
        assertEquals("23:59", parser.getPredictionRow(0));
        assertEquals("Bus 10", parser.getLineRow(0));
        assertEquals("Hauptbahnhof", parser.getDestinationRow(0));

        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(1).longValue());

        assertEquals(0.1, parser.getDelayRate(), 0.01);
        assertEquals(0.9, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestKVV_SingleRow1() throws Exception {
        String s = new String(TestData.htmlResponseKvvLine1);
        ParserKVV parser = new ParserKVV(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("01:24", parser.getDepartureRow(0));
        assertEquals("01:25", parser.getPredictionRow(0));
        assertEquals("S11", parser.getLineRow(0));
        assertEquals("Hochstetten", parser.getDestinationRow(0));
        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(0).longValue());

        assertEquals(0.1, parser.getDelayRate(), 0.01);
        assertEquals(0.9, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestKVV_SingleRow2() throws Exception {
        String s = new String(TestData.htmlResponseKvvLine2);
        ParserKVV parser = new ParserKVV(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("12:45", parser.getDepartureRow(0));
        assertEquals("12:45", parser.getPredictionRow(0));
        assertEquals("Zug 12410", parser.getLineRow(0));
        assertEquals("Neustadt, Hauptbahnhof", parser.getDestinationRow(0));
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(0).longValue());

        assertEquals(0.1, parser.getDelayRate(), 0.01);
        assertEquals(0.9, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestVBN() throws Exception {
        String s = new String(TestData.htmlResponseVBN);
        ParserVBN parser = new ParserVBN(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("Gröpelingen", parser.getDestinationRow(0));
        assertEquals("Bremen Hbf", parser.getDestinationRow(1));
        assertEquals("Bf Mahndorf", parser.getDestinationRow(2));

        assertEquals("Tram 3", parser.getLineRow(0));
        assertEquals("Bus 101", parser.getLineRow(1));
        assertEquals("Tram 1", parser.getLineRow(2));

        assertEquals("09:10", parser.getDepartureRow(0));
        assertEquals("09:11", parser.getDepartureRow(1));
        assertEquals("09:13", parser.getDepartureRow(2));

        assertEquals("1", parser.getPredictionRow(0));
        assertEquals("2", parser.getPredictionRow(1));
        assertEquals("0", parser.getPredictionRow(2));

        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(1).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(2).longValue());

        assertEquals(0.3, parser.getDelayRate(), 0.01);
        assertEquals(0.7, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestVBN_Adelebsen() throws Exception {
        String s = new String(TestData.htmlResponseVBN_Adelebsen);
        ParserVBN parser = new ParserVBN(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("Paderborn Hbf", parser.getDestinationRow(0));
        assertEquals("Göttingen", parser.getDestinationRow(1));
        assertEquals("Paderborn Hbf", parser.getDestinationRow(2));

        assertEquals("RB85", parser.getLineRow(0));
        assertEquals("SEV", parser.getLineRow(1));
        assertEquals("RB85", parser.getLineRow(2));

        assertEquals("11:33", parser.getDepartureRow(0));
        assertEquals("12:31", parser.getDepartureRow(1));
        assertEquals("13:33", parser.getDepartureRow(2));

        assertEquals("0", parser.getPredictionRow(0));
        assertEquals("", parser.getPredictionRow(1));
        assertEquals("", parser.getPredictionRow(2));

        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(1).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(2).longValue());

        assertEquals(0.1, parser.getDelayRate(), 0.01);
        assertEquals(0.0, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestHVV_StPauli() throws Exception {
        String s = new String(TestData.jsonDepartureResponseHVVStPauli);
        ParserHVV parser = new ParserHVV(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("15:07", parser.getDepartureRow(3));
        assertEquals("", parser.getPredictionRow(3));

        assertEquals("15:18", parser.getDepartureRow(14));
        assertEquals("15:22", parser.getPredictionRow(14));
        assertEquals("Berner Heerweg", parser.getDestinationRow(14));
        assertEquals("36", parser.getLineRow(14));
        assertEquals((long)DELAY_SERVERITY_RED, parser.getPredictionSeverityRow(14).longValue());

        assertEquals("15:17", parser.getDepartureRow(13));
        assertEquals("15:21", parser.getPredictionRow(13));
        assertEquals("Gleis 2", parser.getPlatformRow(13));
        assertEquals((long)DELAY_SERVERITY_RED, parser.getPredictionSeverityRow(13).longValue());

        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(1).longValue());

        assertEquals(0.0, parser.getDelayRate(), 0.01);
        assertEquals(0.0, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestHVV_StPauli_DeparturePayload() throws Exception {
        String payload = OPNV_HVV.getInstance().getRequestPayloadForDeparture(OrchestrationTest.STOP_ID_HVV, "").toString();
        System.out.println("payload: " + payload);
        assertEquals("{\"version\":30,\"station\":{\"id\":\"Master:80900\",\"name\":\"\",\"type\":\"STATION\"},\"time\":{\"date\":\"" +
                Util.getCurrentDateDe() + // "01.02.2019" +
                "\",\"time\":\"" +
                Util.getCurrentTimeDe() + // "14:53" +
                "\"},\"maxList\":50,\"serviceTypes\":[\"BUS\",\"ZUG\",\"FAEHRE\"],\"useRealtime\":true,\"maxTimeOffset\":120}", payload);
    }


    @Test
    public void unitTestMVV_Marienplatz() throws Exception {
        String s = new String(TestData.departureResponseMVVMarienplatz);
        ParserMVV parser = new ParserMVV(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("Münchner Freiheit", parser.getDestinationRow(0));
        assertEquals("Tutzing", parser.getDestinationRow(1));
        assertEquals("Wolfratshausen", parser.getDestinationRow(2));

        assertEquals("U6", parser.getLineRow(0));
        assertEquals("S6", parser.getLineRow(1));
        assertEquals("S7", parser.getLineRow(2));

        assertEquals("12:48", parser.getDepartureRow(0));
        assertEquals("12:48", parser.getDepartureRow(1));
        assertEquals("12:50", parser.getDepartureRow(2));

        assertEquals("", parser.getPredictionRow(0));
        assertEquals("13:03", parser.getPredictionRow(14));
        assertEquals("13:02", parser.getPredictionRow(15));

        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_RED, parser.getPredictionSeverityRow(14).longValue());
        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(15).longValue());

        assertEquals(0.0, parser.getDelayRate(), 0.01);
        assertEquals(0.0, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestVRR_Chlodwigplatz() throws Exception {
        String s = new String(TestData.FILE_CONTENT_RVV_CHLODWIG_ABFARTEN);
        ParserVRR parser = new ParserVRR(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("16", parser.getLineRow(0));
        assertEquals("133", parser.getLineRow(1));
        assertEquals("142", parser.getLineRow(2));

        assertEquals("Niehl Sebastianstr.,Köln", parser.getDestinationRow(0));
        assertEquals("Breslauer Platz/Hbf,Köln", parser.getDestinationRow(1));
        assertEquals("Ubierring,Köln", parser.getDestinationRow(2));

        assertEquals("16:43", parser.getDepartureRow(0));
        assertEquals("16:45", parser.getDepartureRow(1));
        assertEquals("16:45", parser.getDepartureRow(2));

        assertEquals("", parser.getPredictionRow(0));
        assertEquals("", parser.getPredictionRow(1));
        assertEquals("", parser.getPredictionRow(2));

        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(1).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(2).longValue());

        assertEquals(0.0, parser.getDelayRate(), 0.01);
        assertEquals(0.4, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestVRR_Dortmund() throws Exception {
        String s = new String(TestData.FILE_CONTENT_RVV_DORTMUND_ABFARTEN);
        ParserVRR parser = new ParserVRR(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("U49", parser.getLineRow(0));
        assertEquals("475", parser.getLineRow(1));
        assertEquals("U47", parser.getLineRow(2));

        assertEquals("Dortmund Hacheney", parser.getDestinationRow(0));
        assertEquals("Dortmund Hbf", parser.getDestinationRow(1));
        assertEquals("Dortmund, Aplerbeck", parser.getDestinationRow(2));

        assertEquals("", parser.getPlatformRow(0));
        assertEquals("", parser.getPlatformRow(1));
        assertEquals("", parser.getPlatformRow(2));

        assertEquals("15:21", parser.getDepartureRow(0));
        assertEquals("15:24", parser.getDepartureRow(1));
        assertEquals("15:25", parser.getDepartureRow(2));

        assertEquals(Parser.CANCELLED_SIGN, parser.getPredictionRow(0));
        assertEquals("15:24", parser.getPredictionRow(1));
        assertEquals("15:25", parser.getPredictionRow(2));

        assertEquals((long)DELAY_SERVERITY_CANCELLED, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(1).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(2).longValue());
        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(3).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(4).longValue());
        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(14).longValue());

        assertEquals(0.6, parser.getDelayRate(), 0.01);
        assertEquals(0.4, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestVRR_DortmundHafen() throws Exception {
        String s = new String(TestData.FILE_CONTENT_RVV_DORTMUNDHAFEN_ABFARTEN);
        ParserVRR parser = new ParserVRR(s);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("U47", parser.getLineRow(0));
        assertEquals("U47", parser.getLineRow(1));

        assertEquals("Dortmund Hbf", parser.getDestinationRow(0));
        assertEquals("Dortmund Westerfilde S", parser.getDestinationRow(1));

        assertEquals("", parser.getPlatformRow(0));
        assertEquals("", parser.getPlatformRow(1));

        assertEquals("10:46", parser.getDepartureRow(0));
        assertEquals("11:13", parser.getDepartureRow(1));

        assertEquals("11:21", parser.getPredictionRow(0));
        assertEquals("11:13", parser.getPredictionRow(1));

        assertEquals((long)DELAY_SERVERITY_RED, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(1).longValue());

        assertEquals(0.8, parser.getDelayRate(), 0.01);
        assertEquals(0.0, parser.getQMRate(), 0.01);
    }


    @Test
    public void unitTestVGN_Nuernberg() throws Exception {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("VGN_Nurnberg.html");
        String htmlVGNResponseNuernberg = Util.readTestDataFile(in);
        System.out.println(htmlVGNResponseNuernberg);

        ParserVGN parser = new ParserVGN(htmlVGNResponseNuernberg);
        assertTrue("count exceptions not zero", parser.getCountExceptions() == 0);

        assertEquals("16:38", parser.getDepartureRow(0));
        assertEquals("FeuchtwangenMooswiese", parser.getDestinationRow(0));
        assertEquals("805", parser.getLineRow(0));
        assertEquals("",parser.getPredictionRow(0));

        assertEquals("14:17", parser.getDepartureRow(1));
        assertEquals("Gibitzenhof", parser.getDestinationRow(1));
        assertEquals("4", parser.getLineRow(1));
        assertEquals("14:18",parser.getPredictionRow(1));

        assertEquals("14:18", parser.getDepartureRow(2));
        assertEquals("Gustav-\u200BAdolf-\u200BStr", parser.getDestinationRow(2));
        assertEquals("U3", parser.getLineRow(2));
        assertEquals("14:18",parser.getPredictionRow(2));

        assertEquals((long)DELAY_SERVERITY_UNKNOWN, parser.getPredictionSeverityRow(0).longValue());
        assertEquals((long)DELAY_SERVERITY_YELLOW, parser.getPredictionSeverityRow(1).longValue());
        assertEquals((long)DELAY_SERVERITY_GREEN, parser.getPredictionSeverityRow(2).longValue());

        assertEquals(0.2, parser.getDelayRate(), 0.01);
        assertEquals(0.7, parser.getQMRate(), 0.01);
    }

}
