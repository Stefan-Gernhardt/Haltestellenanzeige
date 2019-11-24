package org.sge.haltestellenanzeige;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_HVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_MVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VGN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRR;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_DB_SVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_HVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_MVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VGN;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VRR;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VRN;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.assertTrue;

import static junit.framework.Assert.assertEquals;
import static org.sge.haltestellenanzeige.TestData.jsonResponseHVVStPauli;

import java.util.ArrayList;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)

public class SuggestionRequestOPNVTest_Unit {

    @Test
    public void test_01_checkSuggesitionParserDB_Unit() {
        System.out.println("test_01_checkSuggesitionParserDB");
        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), TestData.JSON_DB_SUGGESTION_RESPONSE);

        assertEquals(24, suggestionList_DB.getList().size());

        Stop stop = suggestionList_DB.getList().get(0);
        assertEquals("Reggio d'Emilia AV", stop.getName());
        assertEquals("008305254", stop.getId());
        assertEquals(10.656568, stop.getXCoord(), 0.0000001);
        assertEquals(44.723905, stop.getYCoord(), 0.0000001);

        Stop stop2 = suggestionList_DB.getList().get(1);
        assertEquals("Villena AV", stop2.getName());
        assertEquals("007103309", stop2.getId());
        assertEquals(-0.867701, stop2.getXCoord(), 0.0000001);
        assertEquals(38.631763, stop2.getYCoord(), 0.0000001);
    }


    @Test
    public void test_01b_checkSuggesitionParserDB_Unit() {
        System.out.println("test_01b_checkSuggesitionParserDB_Unit");
        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), TestData.JSON_DB_SUGGESTION_RESPONSE_b);

        assertEquals(12, suggestionList_DB.getList().size());

        Stop stop = suggestionList_DB.getList().get(0);
        assertEquals("Jößnitz", stop.getName());
    }


    @Test
    public void test_02_CheckParsingSearchResult_Unit() {
        System.out.println("test_02_CheckParsingSearchResult_Unit");

        String jsonFileContent = TestData.FILE_CONTENT;

        String json = ParserSuggestionList.extractJsonString(jsonFileContent);

        assertTrue(json.startsWith("{"));
        assertTrue(json.endsWith("}"));
    }


    @Test
    public void test_03_CheckParsingSearchResult_VRN_Tivoli_Unit() {
        System.out.println("test_03_CheckParsingSearchResult_VRN_Tivoli_Unit");

        ParserSuggestionList_VRN parserSuggestionList = new ParserSuggestionList_VRN(OPNV_VRN.getInstance(), TestData.FILE_CONTENT_VRN_TIVOLI);
        ArrayList<Stop> stopList = parserSuggestionList.getList();

        assertEquals(stopList.size(), 1);
    }


    @Test
    public void test_04_CheckParsingSearchResult_VRN_Unit() {
        System.out.println("test_04_CheckParsingSearchResult_VRN_Unit");

        ParserSuggestionList_VRN parserSuggestionList = new ParserSuggestionList_VRN(OPNV_VRN.getInstance(), TestData.FILE_CONTENT_VRN_H);
        ArrayList<Stop> stopList = parserSuggestionList.getList();

        assertEquals(stopList.size(), 0);
    }


    @Test
    public void test_25_TestHVV_StPauli_SuggestionPayload_Unit() throws Exception {
        String payload = OPNV_HVV.getInstance().getRequestPayloadForSuggestionList("St. Pauli").toString();
        assertEquals("{\"version\":30,\"theName\":{\"name\":\"St. Pauli\",\"type\":\"STATION\"},\"maxList\":50,\"coordinateType\":\"EPSG_4326\"}", payload);
    }


    @Test
    public void test_26_check_OPNV_HVV_Suggestion_List_Unit() {
        System.out.println("test_26_check_OPNV_HVV_Suggestion_List_Unit");

        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionString = jsonResponseHVVStPauli;
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
    public void test_29_check_OPNV_MVV_Suggestion_List_Unit() {
        System.out.println("test_29_check_OPNV_MVV_Suggestion_List_Unit");

        String suggestionString = TestData.jsonResponseMVVMarienplatz;
        ParserSuggestionList_MVV suggestionListMVV = new ParserSuggestionList_MVV(OPNV_MVV.getInstance(), suggestionString);

        System.out.println("suggestionString: " + suggestionString);

        assertEquals(20, suggestionListMVV.getList().size());

        Stop stop = suggestionListMVV.getList().get(0);
        assertEquals("Aiglsbach, Aiglsbach, Marienplatz", stop.getName());
        assertEquals("de:09273:770", stop.getId());
        assertEquals(1303902.0, stop.getXCoord(), 0.0000001);
        assertEquals(5777257.0, stop.getYCoord(), 0.0000001);
    }


    @Test
    public void test_30_check_OPNV_VRR_Suggestion_List_Unit() {
        System.out.println("test_30_check_OPNV_VRR_Suggestion_List_Unit");

        String suggestionString = TestData.FILE_CONTENT_RVV_CHLODWIG;
        ParserSuggestionList_VRR suggestionListVRR = new ParserSuggestionList_VRR(OPNV_VRR.getInstance(), suggestionString);

        assertEquals(5, suggestionListVRR.getList().size());

        Stop stop0 = suggestionListVRR.getList().get(0);
        assertEquals("Bonn Chlodwigplatz", stop0.getName());
        assertEquals("22001182", stop0.getId());
        assertEquals(6.857103, stop0.getXCoord(), 0.0000001);
        assertEquals(51.349555, stop0.getYCoord(), 0.0000001);

        Stop stop1 = suggestionListVRR.getList().get(1);
        assertEquals("Köln Chlodwigplatz", stop1.getName());
        assertEquals("22000018", stop1.getId());
        assertEquals(6.857103, stop1.getXCoord(), 0.0000001);
        assertEquals(51.349555, stop1.getYCoord(), 0.0000001);
    }


    @Test
    public void test_40_check_OPNV_VGN_Suggestion_List_Unit() {
        System.out.println("test_40_check_OPNV_VGN_Suggestion_List_Unit");

        String suggestionString = TestData.FILE_CONTENT_VGN_SUGGESTIONS;
        ParserSuggestionList_VGN suggestionListVGN = new ParserSuggestionList_VGN(OPNV_VGN.getInstance(), suggestionString);

        assertEquals(32, suggestionListVGN.getList().size());

        Stop stop0 = suggestionListVGN.getList().get(0);
        assertEquals("Nürnberg Hbf (Nelson-Mandela-Platz)", stop0.getName());
        assertEquals("de:09564:509", stop0.getId());
        assertEquals(OPNV_VGN.xcoord, stop0.getXCoord(), 0.0000001);
        assertEquals(OPNV_VGN.ycoord, stop0.getYCoord(), 0.0000001);
        // assertEquals(11.081717, stop0.getXCoord(), 0.0000001);
        // assertEquals(49.445525, stop0.getYCoord(), 0.0000001);

    }

}
