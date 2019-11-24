package org.sge.haltestellenanzeige;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Test;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_MVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_SaarSVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRN;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_DB_SVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_MVV;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.stop.StopDistance;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CoordsTest {
    @Test
    public void test_01_checkCoordsDistance() {
        System.out.println("test_01_checkCoordsDistance");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String suggestionStringMalstatt = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), OrchestrationTest.STOP_NAME_SVV_MALSTATT);
        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionStringMalstatt);

        Stop stopMalstatt = suggestionList_DB.getList().get(0);
        assertEquals(OrchestrationTest.STOP_NAME_SVV_MALSTATT, stopMalstatt.getName());
        assertEquals("000835814", stopMalstatt.getId());
        assertEquals(6.978281, stopMalstatt.getXCoord(), 0.00001);
        assertEquals(49.241219, stopMalstatt.getYCoord(), 0.00001);

        String suggestionStringWasserturm = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), OrchestrationTest.STOP_NAME_MA_WASSEERTURM);
        ParserSuggestionList_DB_SVV suggestionList_DBWasserturm = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionStringWasserturm);

        Stop stopWasserturm = suggestionList_DBWasserturm.getList().get(0);
        assertEquals(OrchestrationTest.STOP_NAME_MA_WASSEERTURM, stopWasserturm.getName());
        assertEquals("000518374", stopWasserturm.getId());
        assertEquals(8.474796, stopWasserturm.getXCoord(), 0.00001);
        assertEquals(49.484988, stopWasserturm.getYCoord(), 0.00001);

        StopDistance stopDistance = OPNV.stopMeetsTheSimilarityCriteria(stopMalstatt, stopWasserturm);
        assertEquals(stopDistance.coordDistance, 1.740284, 0.00001);
        assertEquals(stopDistance.nameDistance, 32.0, 0.00001);
        assertTrue(!stopDistance.isMatch);

        // Bocholt 51.838408, 6.613957
        // Bonn 50.731025, 7.102479
        double d = StopDistance.distanceDeviation(51.838408, 6.613957, 50.731025, 7.102479);
        assertEquals(1.5959049999999984, d, 0.00001);
    }


    @Test
    public void test_12_check_GeoDistanceFunction() {
        Context appContext = InstrumentationRegistry.getTargetContext();

        Stop StopUhlhorn = new Stop(
                OPNV_BahnDB.getInstance(),
                "Uhlhorn, Asendorf (Diepholz)",
                "A=1@O=Uhlhorn, Asendorf (Diepholz)@X=9006850@Y=52768631@U=80@L=000600112@B=1@p=1517269699@",
                8.47410,
                49.48465,
                "id");

        Stop stopViernheimRnzVRN = new Stop(
                OPNV_VRN.getInstance(),
                "Viernheim, Tivoli (RNZ)",
                "de:06431:3865",
                8.57242,
                49.54917,
                "");

        Stop stopUhlhornVRN = new Stop(
                OPNV_VRN.getInstance(),
                "Uhlhorn, Asendorf Diepholz",
                "de:06431:3865",
                8.47410,
                49.48465,
                "");

        assertTrue(!OPNV_VRN.getInstance().stopMeetsTheSimilarityCriteria(StopUhlhorn, stopViernheimRnzVRN).isMatch);
        assertTrue(OPNV_VRN.getInstance().stopMeetsTheSimilarityCriteria(StopUhlhorn, stopUhlhornVRN).isMatch);


        Stop StopWasserturm = new Stop(
                OPNV_BahnDB.getInstance(),
                "Wasserturm, Mannheim",
                "A=1@O=Wasserturm, Mannheim@X=8474787@Y=49484979@U=80@L=000518374@B=1@p=1517956154@",
                8.474787,
                49.484979,
                "");


        Stop stopVRNWasserturm = new Stop(
                OPNV_VRN.getInstance(),
                "Mannheim, Wasserturm",
                "de:08222:2475",
                8.47410,
                49.48465,
                "");

        assertTrue(OPNV_VRN.getInstance().stopMeetsTheSimilarityCriteria(StopWasserturm, stopVRNWasserturm).isMatch);
    }


    @Test
    public void test_12_check_distance_DB_SVV() {
        Context appContext = InstrumentationRegistry.getTargetContext();

        String suggestionStringSVV = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_SaarSVV.getInstance(), "Ludwigstr., Saarbrücken Malstatt");
        ParserSuggestionList_DB_SVV suggestionListSVV = new ParserSuggestionList_DB_SVV(OPNV_SaarSVV.getInstance(), suggestionStringSVV);
        assertTrue(suggestionListSVV.getList().size()>0);

        String suggestionStringDB = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Ludwigstr., Saarbrücken Malstatt");
        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionStringDB);
        assertTrue(suggestionListDB.getList().size()>0);

        Stop stopSVV = suggestionListSVV.getList().get(0);
        assertEquals("Ludwigstr., Saarbrücken Malstatt", stopSVV.getName());
        assertEquals("000010201", stopSVV.getId());
        assertEquals(6.978281, stopSVV.getXCoord(), 0.0000001);
        assertEquals(49.241219, stopSVV.getYCoord(), 0.0000001);

        Stop stopDB = suggestionListDB.getList().get(0);
        assertEquals("Ludwigstr. Malstatt, Saarbrücken", stopDB.getName());
        assertEquals("000835814", stopDB.getId());
        assertEquals(6.978281, stopDB.getXCoord(), 0.0000001);
        assertEquals(49.241219, stopDB.getYCoord(), 0.0000001);

        StopDistance stopDistance = OPNV.stopMeetsTheSimilarityCriteria(stopDB, stopSVV);
        assertTrue(stopDistance.isMatch);
        assertEquals(stopDistance.nameDistance, 100);
        assertEquals((int)(stopDistance.coordDistance*100000), 0);
    }


    @Test
    public void test_12_check_distance_DB_MVV() {
        Context appContext = InstrumentationRegistry.getTargetContext();

        String suggestionStringDB = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Marienplatz");
        ParserSuggestionList_DB_SVV suggestionListDB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionStringDB);
        assertTrue(suggestionListDB.getList().size()>0);

        Stop stopDB = suggestionListDB.getList().get(0);
        assertEquals("München Marienplatz", stopDB.getName());
        assertEquals("008004135", stopDB.getId());
        assertEquals(11.575383, stopDB.getXCoord(), 0.0000001);
        assertEquals(48.137047, stopDB.getYCoord(), 0.0000001);

        String suggestionStringMVV = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_MVV.getInstance(), "München Marienplatz");
        ParserSuggestionList_MVV suggestionListMVV = new ParserSuggestionList_MVV(OPNV_MVV.getInstance(), suggestionStringMVV);

        assertTrue("list size: " + suggestionListMVV.getList().size(), suggestionListMVV.getList().size()>=2);

        Stop stopMVV1 = suggestionListMVV.getList().get(0);
        assertEquals("München, Marienplatz (Theatinerstraße)", stopMVV1.getName());
        assertEquals("de:09162:20", stopMVV1.getId());
        assertEquals(11.57532, stopMVV1.getXCoord(), 0.0000001);
        assertEquals(48.13947, stopMVV1.getYCoord(), 0.0000001);

        Stop stopMVV2 = suggestionListMVV.getList().get(1);
        assertEquals("München, Pasinger Marienplatz", stopMVV2.getName());
        assertEquals("de:09162:1622", stopMVV2.getId());
        assertEquals(11.45936, stopMVV2.getXCoord(), 0.0000001);
        assertEquals(48.14663, stopMVV2.getYCoord(), 0.0000001);

        Stop stopMVV3 = suggestionListMVV.getList().get(2);
        assertEquals("München, Marienplatz", stopMVV3.getName());
        assertEquals("de:09162:2", stopMVV3.getId());
        assertEquals(11.57542, stopMVV3.getXCoord(), 0.0000001);
        assertEquals(48.13725, stopMVV3.getYCoord(), 0.0000001);

        StopDistance stopDistance1 = OPNV.stopMeetsTheSimilarityCriteria(stopDB, stopMVV1);
        assertTrue(stopDistance1.isMatch);
        assertEquals(stopDistance1.nameDistance, 100);
        assertEquals("coordDistance: " + stopDistance1.coordDistance, (int)(100000*stopDistance1.coordDistance), 248);

        StopDistance stopDistance2 = OPNV.stopMeetsTheSimilarityCriteria(stopDB, stopMVV2);
        assertTrue(!stopDistance2.isMatch);
        assertEquals(stopDistance2.nameDistance, 100);
        assertEquals("coordDistance: " + stopDistance1.coordDistance, (int)(100000*stopDistance2.coordDistance), 12560);

        StopDistance stopDistance3 = OPNV.stopMeetsTheSimilarityCriteria(stopDB, stopMVV3);
        assertTrue(stopDistance3.isMatch);
        assertEquals(stopDistance3.nameDistance, 100);
        assertEquals("coordDistance: " + stopDistance1.coordDistance, (int)(100000*stopDistance3.coordDistance), 23);

        assertTrue(StopDistance.isBetter(stopDistance1, stopDistance2));
        assertTrue(!StopDistance.isBetter(stopDistance1, stopDistance3));
        assertTrue(!StopDistance.isBetter(stopDistance2, stopDistance3));
    }


    @Test
    public void test_23_checkCoordinatesTwoDigitsAndOneDigitForXCoord_DB() {
        System.out.println("test_23_checkCoordinatesTwoDigitsAndOneDigitForXCoord_DB");
        Context appContext = InstrumentationRegistry.getTargetContext();

        String suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Tivoli (RNZ), Viernheim");
        ParserSuggestionList_DB_SVV suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);

        assertEquals(50, suggestionList_DB.getList().size());

        Stop stop = suggestionList_DB.getList().get(0);
        assertEquals("Tivoli (RNZ), Viernheim", stop.getName());
        assertEquals("000518554", stop.getId());
        assertEquals(8.565902, stop.getXCoord(), 0.0000001);
        assertEquals(49.528460, stop.getYCoord(), 0.0000001);

        suggestionString = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_BahnDB.getInstance(), "Jena");
        suggestionList_DB = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), suggestionString);

        assertEquals(50, suggestionList_DB.getList().size());

        stop = suggestionList_DB.getList().get(0);
        assertEquals("JENA", stop.getName());
        assertEquals("008096004", stop.getId());
        assertEquals(11.582727, stop.getXCoord(), 0.0000001);
        assertEquals(50.924008, stop.getYCoord(), 0.0000001);
    }


}
