package org.sge.haltestellenanzeige;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.OPNV;
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
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.util.Util;

import static junit.framework.TestCase.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartureDelayRateOPNVTest {

    private Stop stopSelect(OPNV opnv, String partOfStopName) {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionResponseString = BahnRequest.createSuggestionRequestSynchron(appContext, opnv, partOfStopName);

        ParserSuggestionList suggestionList = opnv.newParserSuggestionList();
        suggestionList.parseSuggestionListResponse(opnv, suggestionResponseString);
        int sugggestionListDBSize = suggestionList.getList().size();

        if(sugggestionListDBSize == 0) return null;

        return suggestionList.getList().get(0);
    }


    private Parser departureRequest(OPNV opnv, Stop stop) {
        assertTrue(stop != null);
        String response = BahnRequest.createBahnRequestSynchronWithTag(InstrumentationRegistry.getTargetContext(), null, stop, opnv, stop.getUrl());

        Parser parser = opnv.newParser();
        parser.parse(response);
        assertTrue(parser.parsingDoneWithoutWarnings());
        return parser;
    }


    private void checkDelayAndDepartureInformation(String stationSearchNameArray[], OPNV opnv) {
        System.out.println("checkDelayAndDepartureInformation");

        int countDelays            = 0;
        int countOnTime            = 0;
        int countConnections       = 0;
        int countLineData          = 0;
        int countDirectionData     = 0;
        int countDepartureTimeData = 0;

        for(int i=0; i<stationSearchNameArray.length; i++) {
            Stop stop = stopSelect(opnv, stationSearchNameArray[i]);
            if(stop == null) continue;

            System.out.println("stop: " + stop.getName() + "  id: " + stop.getId());
            assertTrue(stop != null);
            Parser parser = departureRequest(opnv, stop);
            Assert.assertTrue("count exceptions not zero " + opnv.getTag(), parser.getCountExceptions() == 0);
            System.out.println("Delay and departure information on stop: " + stop.getName() + " count connections: " + parser.getAnzahlVerbindungenAbsolut() + " count delays: " + parser.getAnzahlVerspaetungenAbsolut());

            countOnTime            = countOnTime            + parser.getAnzahlPuenktlichAbsolut();
            countDelays            = countDelays            + parser.getAnzahlVerspaetungenAbsolut();
            countConnections       = countConnections       + parser.getAnzahlVerbindungenAbsolut();
            countLineData          = countLineData          + parser.getAnzahlLineData();
            countDirectionData     = countDirectionData     + parser.getAnzahlDirectionData();
            countDepartureTimeData = countDepartureTimeData + parser.getAnzahlDeparatureData();


            System.out.println("checkDelayAndDepartureInformation loop: " + i + "  countDelays: " + countDelays + "  countConnections: " + countConnections + "  countOnTime: " + countOnTime +
                    "  countLineData: " + countLineData + "  countDirectionData: " + countDirectionData + "  countDepartureTimeData: " + countDepartureTimeData);

            if((countDelays > 0) && (countConnections >0) && (countOnTime>=0) && (countLineData>=0) && (countDirectionData>=0) && (countDepartureTimeData>=0)) {
                System.out.println("checkDelayAndDepartureInformation test passed");
                return;
            }
            Util.waitMillis(5000);
        }

        assertTrue("OPNV: " + opnv.getTag() + " countDelays: "            + countDelays,            countDelays > 0);
        assertTrue("OPNV: " + opnv.getTag() + " countConnections: "       + countConnections,       countConnections >0);
        assertTrue("OPNV: " + opnv.getTag() + " countOnTime: "            + countOnTime,            countOnTime > 0);
        assertTrue("OPNV: " + opnv.getTag() + " countLineData: "          + countLineData,          countLineData > 0);
        assertTrue("OPNV: " + opnv.getTag() + " countDirectionData: "     + countDirectionData,     countDirectionData > 0);
        assertTrue("OPNV: " + opnv.getTag() + " countDepartureTimeData: " + countDepartureTimeData, countDepartureTimeData > 0);
    }


    @Test
    public void test01_checkDelayAndDepartureInformation_DB() {
        System.out.println("test01_checkDelayAndDepartureInformation_DB");

        String stationSearchNameArray[] = {"Leipzig Hbf", "Mannheim Hbf", "Frankfurt(Main)Hbf", "Leipzig Hbf"};
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_BahnDB.getInstance());
    }


    @Test
    public void test02_checkDelayAndDepartureInformation_KVV() {
        System.out.println("test02_checkDelayAndDepartureInformation_KVV");

        String stationSearchNameArray[] = {"Knielingen, Siemensallee", "Knielingen, Karlsruhe Knielingen", "Karlsruhe Tullastraße", "Karlsruhe, Volkswohnung"};
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_KVV.getInstance());
    }


    @Test
    public void test03_checkDelayAndDepartureInformation_RMV() {
        System.out.println("test03_checkDelayAndDepartureInformation_RMV");

        String stationSearchNameArray[] = {"Frankfurt (Main) Hauptwache", "Frankfurt (Main) Speyerer Straße"};
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_RMV.getInstance());
    }


    @Test
    public void test04_checkDelayAndDepartureInformation_SVV() {
        System.out.println("test04_checkDelayAndDepartureInformation_SVV");

        String stationSearchNameArray[] = {"Heusweiler, Markt", "Ludwigstr., Saarbrücken Malstatt", "Johanneskirche, Saarbrücken", "Pieper, Saarlouis"};
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_SaarSVV.getInstance());
    }


    @Test
    public void test05_checkDelayAndDepartureInformation_VRN() {
        System.out.println("test05_checkDelayAndDepartureInformation_VRN");

        String stationSearchNameArray[] = {"Heidelberg Karlsplatz", "Mannheim, Paradeplatz", "Viernheim Tivoli", "Mannheim, Wasserturm"};
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_VRN.getInstance());
    }


    @Test
    public void test06_checkDelayAndDepartureInformation_VBN() {
        System.out.println("test06_checkDelayAndDepartureInformation_VBN");

        String stationSearchNameArray[] = {"Bremen Neustadt", "Oldenburg(Oldb) Famila", "Bremen Am Brill"};
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_VBN.getInstance());
    }


    @Test
    public void test07_checkDelayAndDepartureInformation_HVV() {
        System.out.println("test07_checkDelayAndDepartureInformation_HVV");

        String stationSearchNameArray[] = {"St.Pauli", "Blankenese", "Niendorf Markt"};
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_HVV.getInstance());
    }


    @Test
    public void test08_checkDelayAndDepartureInformation_MVV() {
        System.out.println("test08_checkDelayAndDepartureInformation_MVV");

        String stationSearchNameArray[] = {"München, Studentenstadt", "München, Siemenswerke", "Marienplatz"};
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_MVV.getInstance());
    }


    @Test
    public void test09_checkDelayAndDepartureInformation_VRR() {
        System.out.println("test09_checkDelayAndDepartureInformation_VRR");

        String stationSearchNameArray[] = {"Duisburg, Bunker", "Dortmund, Hafen", "Wuppertal, Karlsplatz", "Köln, Chlodwigplatz" };
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_VRR.getInstance());
    }


    @Test
    public void test10_checkDelayAndDepartureInformation_VGN() {
        System.out.println("test09_checkDelayAndDepartureInformation_VGN");

        String stationSearchNameArray[] = {"Nürnberg, Friedrich-Ebert-Platz", "Aurach (Kr Ansbach), Blumenauer Platz", "Nürnberg, St. Johannisfriedhof"};
        checkDelayAndDepartureInformation(stationSearchNameArray, OPNV_VGN.getInstance());
    }

}
