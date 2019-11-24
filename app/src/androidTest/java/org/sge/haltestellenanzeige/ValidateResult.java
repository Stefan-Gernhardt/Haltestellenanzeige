package org.sge.haltestellenanzeige;

import org.junit.Assert;
import org.sge.haltestellenanzeige.net.StationBoardInterface;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.sge.haltestellenanzeige.net.StationBoardInterface.DELAY_SERVERITY_CANCELLED;

/**
 * Created by Admin on 16.02.2018.
 */

public class ValidateResult {
    private static ValidateResult instance = null;

    private ValidateResult() {};

    public static ValidateResult getInstance() {
        if(instance == null) instance = new ValidateResult();

        return instance;
    }


    void validateDepartureTime(StationBoardInterface stationBoard) {
        System.out.println("validateStationBoardInterface");

        int countSuccessFullValidatedLines = 0;
        for(int row = 0; row< UI_StationDisplay.NUMBER_ROWS; row++) {
            System.out.println("row departure data: " + row + "   " + stationBoard.getDepartureRow(row));
            if(validateSingleDepartureTime(stationBoard.getDepartureRow(row))) countSuccessFullValidatedLines++;
        }

        assertTrue("countSuccessFullValidatedLines " + countSuccessFullValidatedLines, countSuccessFullValidatedLines > 0);
    }


    public boolean validateSingleDepartureTime(String departureTime) {
        if(departureTime == null) return false;
        if(departureTime.isEmpty()) return false;
        if(departureTime.contentEquals(Parser.DEFAULT_SIGN)) return false;
        if(departureTime.contentEquals(Parser.ERROR_SIGN)) return false;

        assertTrue("departure Time length equals four or five: " + departureTime, (departureTime.length() == 4) || (departureTime.length() == 5));
        assertTrue("first character is a number", Character.isDigit(departureTime.charAt(0)));
        assertTrue("departure Time find double point", departureTime.charAt(1) == ':' || departureTime.charAt(2) == ':');
        assertTrue("second part of departure time", Character.isDigit(departureTime.charAt(3)));

        return true;
    }


    public void checkDepartureTimeIsNotEmpty(StationBoardInterface stationBoard) {
        int lineLength = 0;
        for(int row = 0; row< UI_StationDisplay.NUMBER_ROWS; row++) {
            String linieRow = stationBoard.getDepartureRow(row);
            System.out.println("i: " + row + "  departure row: >" + linieRow + "<");
            lineLength = lineLength + linieRow.length();
            if(lineLength>0) return; // test passed
        }
        assertTrue("mindestens eine Abfahrtszeit gefunden", lineLength > 0);
    }



    public void validateDelay(StationBoardInterface stationBoard, boolean expectDelay) {
        int countDelays = 0;
        for(int row = 0; row< UI_StationDisplay.NUMBER_ROWS; row++) {
            int severity = stationBoard.getPredictionSeverityRow(row);
            String delay = stationBoard.getPredictionRow(row);
            System.out.println("Severity and Delay for row: " + row + "  Severity: " + severity + " delay: " + delay);
            assertTrue("Severity korrekt gesetzt " + severity, ((severity >= 0) && (severity <=DELAY_SERVERITY_CANCELLED)));
            assertFalse("Delay korrekt gesetzt ", "null".contentEquals(delay));
            if(severity >0) countDelays++;
        }

        if(expectDelay) assertTrue("Erwartete Anzahl an Verspaetungen groesser 0", countDelays > 0);

        int greenCounter   = 0;
        int yellowCounter  = 0;
        int redCounter     = 0;
        int unknownCounter = 0;
        for(int r=0; r< UI_StationDisplay.NUMBER_ROWS; r++) {
            if(StationBoardInterface.DELAY_SERVERITY_GREEN     == stationBoard.getPredictionSeverityRow(r)) greenCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_YELLOW    == stationBoard.getPredictionSeverityRow(r)) yellowCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_RED       == stationBoard.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_CANCELLED == stationBoard.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_UNKNOWN   == stationBoard.getPredictionSeverityRow(r)) unknownCounter++;
        }

        assertEquals(greenCounter + yellowCounter + redCounter + unknownCounter, UI_StationDisplay.NUMBER_ROWS);
    }


    public void countSeveritiesForStatistics(StationBoardInterface stationBoard, Statistics statistics, OPNV opnv, int loop) {
        int greenCounter   = 0;
        int yellowCounter  = 0;
        int redCounter     = 0;
        int unknownCounter = 0;
        for(int r=0; r< UI_StationDisplay.NUMBER_ROWS; r++) {
            if(StationBoardInterface.DELAY_SERVERITY_GREEN     == stationBoard.getPredictionSeverityRow(r)) greenCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_YELLOW    == stationBoard.getPredictionSeverityRow(r)) yellowCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_RED       == stationBoard.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_CANCELLED == stationBoard.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_UNKNOWN   == stationBoard.getPredictionSeverityRow(r)) unknownCounter++;
        }

        assertEquals(greenCounter + yellowCounter + redCounter + unknownCounter, UI_StationDisplay.NUMBER_ROWS);
        statistics.reportSeverities(loop, opnv, greenCounter, yellowCounter, redCounter, unknownCounter);
    }


    public void validateDelayInformationExists(StationBoardInterface stationBoard) {
        int countDelays = 0;

        int greenCounter = 0;
        int yellowCounter = 0;
        int redCounter = 0;
        int unknownCounter = 0;
        for(int r=0; r< UI_StationDisplay.NUMBER_ROWS; r++) {
            if(StationBoardInterface.DELAY_SERVERITY_GREEN     == stationBoard.getPredictionSeverityRow(r)) greenCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_YELLOW    == stationBoard.getPredictionSeverityRow(r)) yellowCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_RED       == stationBoard.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_CANCELLED == stationBoard.getPredictionSeverityRow(r)) redCounter++;
            if(StationBoardInterface.DELAY_SERVERITY_UNKNOWN   == stationBoard.getPredictionSeverityRow(r)) unknownCounter++;
        }

        assertTrue(greenCounter + yellowCounter + redCounter >= 1);
    }


    public void checkLineContained(StationBoardInterface stationBoard, String[] lineStringArray) {
        for(String line : lineStringArray) {
            if(line == null) continue;
            if(line.isEmpty()) continue;

            for (int row = 0; row < UI_StationDisplay.NUMBER_ROWS; row++) {
                String lineRow = stationBoard.getLineRow(row);
                // System.out.println("Line comparison: " + "<" + line + ">" + "<" + lineRow + ">");
                if (lineRow.contentEquals(line)) return;
            }
        }

        assertTrue("Linie nicht gefunden " + stationBoard.getLineRow(0) + "&" + stationBoard.getLineRow(1) + "&" + stationBoard.getLineRow(2), false);
    }


    public void checkLineContained(StationBoardInterface stationBoard, String linieTeilString1, String linieTeilString2, String linieTeilString3) {
        String sa[] = new String[3];
        sa[0] = linieTeilString1;
        sa[1] = linieTeilString2;
        sa[2] = linieTeilString3;
        checkLineContained(stationBoard, sa);
        /*
        System.out.println("  linieTeilString: >" + linieTeilString1 + " "  + linieTeilString3 + " " + linieTeilString3 + "<");
        for(int row = 0; row< UI_StationDisplay.NUMBER_ROWS; row++) {
            String linieRow = stationBoard.getLineRow(row);
            System.out.println("  linieRow: >" + linieRow + "<");
            if(linieRow.contains(linieTeilString1)) return;
            if(linieRow.contains(linieTeilString2)) return;
            if(linieRow.contains(linieTeilString3)) return;
        }
        assertTrue("Linie mit bestimmten Teilstring gefunden >" + linieTeilString1 + " "  + linieTeilString3 + " " + linieTeilString3 + "<", false);
        */
    }


    public void checkLineContained(StationBoardInterface stationBoard, String linieTeilString1, String linieTeilString2) {
        String sa[] = new String[3];
        sa[0] = linieTeilString1;
        sa[1] = linieTeilString2;
        checkLineContained(stationBoard, sa);
    }


    public void checkLineContained(StationBoardInterface stationBoard, String linieTeilString) {
        String sa[] = new String[1];
        sa[0] = linieTeilString;
        checkLineContained(stationBoard, sa);

        /*
        System.out.println("  linieTeilString: >" + linieTeilString + "<");
        for(int row = 0; row< UI_StationDisplay.NUMBER_ROWS; row++) {
            String linieRow = stationBoard.getLineRow(row);
            System.out.println("  linieRow: >" + linieRow + "<");
            if(linieRow.contains(linieTeilString)) return;
        }
        assertTrue("Linie mit bestimmten Teilstring gefunden >" + linieTeilString + "<", false);
        */
    }


    public void checkLineIs(StationBoardInterface stationBoard, String linie) {
        System.out.println("  linie: >" + linie + "<");
        for(int row = 0; row< UI_StationDisplay.NUMBER_ROWS; row++) {
            String linieRow = stationBoard.getLineRow(row);
            System.out.println("  linieRow: >" + linieRow + "<");
            if(linieRow.contentEquals(linie)) return;
        }
        assertTrue("bestimmte Linie gefunden >" + linie + "<", false);
    }


    public void checkLineIsNotEmpty(StationBoardInterface stationBoard) {
        System.out.println("checkLineIsNotEmpty");
        int lineLength = 0;
        for(int row = 0; row< UI_StationDisplay.NUMBER_ROWS; row++) {
            String linieRow = stationBoard.getLineRow(row);
            System.out.println("i: " + row + "  linieRow: >" + linieRow + "<");
            lineLength = lineLength + linieRow.length();
            if(lineLength>0) return; // test passed
        }
        assertTrue("mindestens eine Linie gefunden " + stationBoard.getOPNVTag(), lineLength > 0);
    }


    public void checkDirectionContained(StationBoardInterface stationBoard, String[] directionStringArray) {
        for(String direction : directionStringArray) {
            if(direction == null) continue;
            if(direction.isEmpty()) continue;

            for (int row = 0; row < UI_StationDisplay.NUMBER_ROWS; row++) {
                String destinationRow = stationBoard.getDestinationRow(row);
                if(destinationRow.startsWith(direction)) return;
            }
        }

        assertTrue("Richtung nicht gefunden " + stationBoard.getDestinationRow(0) + "&" + stationBoard.getDestinationRow(1) + "&" + stationBoard.getDestinationRow(2), false);
    }


    public void checkDirectionContained(StationBoardInterface stationBoard, String directionStringPart1) {
        String sa[] = new String[1];
        sa[0] = directionStringPart1;
        checkDirectionContained(stationBoard, sa);
    }


    public void checkDirectionContained(StationBoardInterface stationBoard, String directionStringPart1, String directionStringPart2) {
        String sa[] = new String[2];
        sa[0] = directionStringPart1;
        sa[1] = directionStringPart2;
        checkDirectionContained(stationBoard, sa);
    }


    public void checkDirectionContained(StationBoardInterface stationBoard, String directionStringPart1, String directionStringPart2, String directionStringPart3) {
        String sa[] = new String[3];
        sa[0] = directionStringPart1;
        sa[1] = directionStringPart2;
        sa[2] = directionStringPart3;
        checkDirectionContained(stationBoard, sa);
    }


    public void checkDirectionIsNotEmpty(StationBoardInterface stationBoard) {
        int lineLength = 0;
        for(int row = 0; row< UI_StationDisplay.NUMBER_ROWS; row++) {
            String linieRow = stationBoard.getDestinationRow(row);
            System.out.println("i: " + row + "  direction row: >" + linieRow + "<");
            lineLength = lineLength + linieRow.length();
            if(lineLength>0) return; // test passed
        }
        assertTrue("mindestens eine Richtung gefunden", lineLength > 0);
    }


    public void check(StationBoardInterface stationBoard) {
        ValidateResult.getInstance().validateDepartureTime(stationBoard);
        ValidateResult.getInstance().validateDelay(stationBoard, false);
        ValidateResult.getInstance().checkDirectionIsNotEmpty(stationBoard);
        ValidateResult.getInstance().checkLineIsNotEmpty(stationBoard);

        Assert.assertTrue((stationBoard.getDelayRate() >= 0) && (stationBoard.getDelayRate() <= 1));
        Assert.assertTrue((stationBoard.getQMRate() >= 0) && (stationBoard.getQMRate() <= 1));
    }

}
