package org.sge.haltestellenanzeige;

/**
 * Created by Admin on 04.02.2018.
 */

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserDB;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)

public class DepartureTableRequestNegativeTest {

    public final static String STATION_NOT_EXIST = "DieseHaltestelleGibtEsNicht";

    @Test
    public void test_01_TestParserRequestResponseDB_Unit() {
        System.out.println("test_01_TestParserRequestResponseDB_Unit");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String response = BahnRequest.createBahnRequestSynchronWithTag(appContext, null, OPNV_BahnDB.getInstance(), "Frankfurt(Main)Hbf");

        assertTrue("Response not null", response != null);
        assertTrue("Response not empty" , !response.isEmpty());

        ParserDB parser = new ParserDB(response);

        // getDepartureRow: 21:56
        assertTrue("getDepartureRow" , parser.getDepartureRow(0).length() >= 4);

        // getDestinationRow: nach Hauptbahnhof, Mannheim
        assertTrue("getDestinationRow" , parser.getDestinationRow(0).length() > 0);

        // getLineRow: RNV 5
        assertTrue("getLineRow: ", parser.getLineRow(0).length() > 0);

        // getPredictionRow:
        assertTrue("getPredictionRow: ", parser.getPredictionRow(0).length() >= 0);

        // getPredictionSeverityRow: 0
        assertTrue("getPredictionSeverityRow: ", parser.getPredictionSeverityRow(0) >= 0);
        assertTrue("getPredictionSeverityRow: ", parser.getPredictionSeverityRow(0) <= 3);

        ValidateResult.getInstance().validateDepartureTime(parser);
        ValidateResult.getInstance().validateDelay(parser, true);
        ValidateResult.getInstance().checkLineContained(parser, "S 3", "S 8", "STR 17");
        ValidateResult.getInstance().checkDirectionContained(parser, new String[]{"Frankfurt a.M.", "Frankfurt", "Fechenheim Schießhüttenstraße, Frankfurt a.M.", "Erbach(Odenw)"});

        assertTrue((parser.getDelayRate() >= 0) && (parser.getDelayRate() <= 1));
        assertTrue((parser.getQMRate() >= 0) && (parser.getQMRate() <= 1));
    }

}
