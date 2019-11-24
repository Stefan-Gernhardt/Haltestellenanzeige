package org.sge.haltestellenanzeige.parser.parserStationBoard;

import org.htmlcleaner.TagNode;
import org.sge.haltestellenanzeige.net.StationBoardInterface;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;

import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/**
 * Created by Admin on 09.02.2018.
 */

public abstract class Parser implements StationBoardInterface {
    // only used for parser content comparison -> not language dependent
    public static final String PUENKTLICH = "pktl."; // lang NON-NLS

    public final static String DEFAULT_SIGN = "?";
    public final static String ERROR_SIGN = "!";
    public final static String CANCELLED_SIGN = "X";

    protected Vector<String> departureArray = new Vector<String>(0);
    protected Vector<String> directionArray = new Vector<String>(0);
    protected Vector<String> platformArray = new Vector<String>(0);
    protected Vector<String> linieArray = new Vector<String>(0);
    protected Vector<String> delayArray = new Vector<String>(0);
    protected Vector<Integer> delaySevArray = new Vector<Integer>(0);


    protected double delayRate = 0; // delay rate of 1 means all connections have delay information
    protected double questionMarkRate = 0; // QM=question mark rate. Rate of 1 means all connections have a question mark and are unknown

    protected boolean parsingWithoutWarnings = true;
    protected int countExceptions = 0;
    public int getCountExceptions() { return countExceptions; }


    abstract protected void parseDoing(String htmlResponse);

    public boolean parsingDoneWithoutWarnings() {
        return parsingWithoutWarnings;
    }

    // returns delay rate. Delay rate of 1 means all connections have delay information
    public double getDelayRate() { return delayRate; }

    // returns qm=questionMarkRat. QM rate of 1 means all connections have a question mark and is unknown
    public double getQMRate() { return questionMarkRate; }


    public String exchangeUmlaute(String input) {
        return input
                //.replaceAll("&#252;", "ü") // repaced by Html.fromHtml(returnString).toString() in the get-methods
                //.replaceAll("&#220;", "Ü")
                //.replaceAll("&#246;", "ö")
                //.replaceAll("&#214;", "Ö")
                //.replaceAll("&#228;", "ä")
                //.replaceAll("&#196;", "Ä")
                //.replaceAll("&#223;", "ß")
                //.replaceAll("&#225;", "á")
                .replaceAll("&nbsp;", " ")//NON-NLS
                .replaceAll("&quot;", " ")//NON-NLS
                .replaceAll("&gt;", " ")//NON-NLS
                .replaceAll("&lt;", " ")//NON-NLS
                .replaceAll("&amp;", " ")//NON-NLS
                .replaceAll("&apos;", " "); //NON-NLS
    }


    public void parse(String responseString) {
        resetResultContainer();

        long parseDoingZeit = System.currentTimeMillis();

        try {
            parseDoing(responseString);
        }
        catch (Exception e) {
            countExceptions++;
            System.out.println("countExceptions++");
            parsingWithoutWarnings = false;
            System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
            e.printStackTrace();
            System.out.println("responseString: " + responseString);
        }

        System.out.println("performance parseDoingZeit ms: " + (System.currentTimeMillis() - parseDoingZeit)); //NON-NLS

        computeDelayAndQMRate();
    }


    public void resetResultContainer() {
        System.out.println("resetResultContainer");
        parsingWithoutWarnings = true;

        departureArray.setSize(UI_StationDisplay.NUMBER_ROWS);
        directionArray.setSize(UI_StationDisplay.NUMBER_ROWS);
        platformArray.setSize(UI_StationDisplay.NUMBER_ROWS);
        linieArray.setSize(UI_StationDisplay.NUMBER_ROWS);
        delayArray.setSize(UI_StationDisplay.NUMBER_ROWS);
        delaySevArray.setSize(UI_StationDisplay.NUMBER_ROWS);

        for (int i = 0; i < UI_StationDisplay.NUMBER_ROWS; i++) {
            departureArray.set(i, DEFAULT_SIGN);
            directionArray.set(i, DEFAULT_SIGN);
            platformArray.set(i, "");
            linieArray.set(i, DEFAULT_SIGN);
            delayArray.set(i, DEFAULT_SIGN);
            delaySevArray.set(i, DELAY_SERVERITY_UNKNOWN);
        }

        double delayRate = 0;
        double questionMarkRate = 0;
    }


    public void displayAttributes(TagNode rowTag) {
        Map<String, String> attributeMap = rowTag.getAttributes();

        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> iter = attributeMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }

        sb.append(rowTag.getText());

        System.out.println(sb.toString()); //NON-NLS
    }


    public void printDirectChildren(TagNode rowTag) {
        TagNode[] children = rowTag.getAllElements(false);
        for (int child = 0; child < children.length; child++) {
            TagNode childNode = children[child];
            System.out.println("" + child + " child: " + childNode.getName()); //NON-NLS
        }
    }

    public String extendToTwoDigits(String s) {
        if (s == null) return s;
        if (s.length() == 1) return "0" + s;
        return s;
    }


    boolean isDelay(String delay) {
        if (delay != null) {
            if ((!delay.contentEquals(" ")) && !delay.contentEquals("...") && (!delay.contentEquals(DEFAULT_SIGN)) && (!delay.contentEquals(ERROR_SIGN)) && (!delay.isEmpty())) {
                return true;
            }
        }

        return false;
    }


    boolean isValidDepartureInformation(String departure) {
        if (departure != null) {
            if (departure.contentEquals(DEFAULT_SIGN)) {
                return false;
            } else if (departure.contentEquals(ERROR_SIGN)) {
                return  false;
            }
        }

        return true;
    }

    public void computeDelayAndQMRate() {
        System.out.println("computeDelayAndQMRate"); //NON-NLS

        int countLinesWithDelayInformation = 0;
        int countLinesWithQuestionMark = 0;

        int linesWhole = Math.min(UI_StationDisplay.NUMBER_ROWS, 10);

        for (int r = 0; r < linesWhole; r++) {
            String departure = departureArray.get(r);
            // System.out.println("compute qm rate row: " + r + "  >" + departure + "<");
            if(!isValidDepartureInformation(departure)) countLinesWithQuestionMark++;;

            String delay = delayArray.get(r);
            // System.out.println("compute delay rate row: " + r + "  >" + delay + "<");
            if(isDelay(delay))countLinesWithDelayInformation++;
        }

        delayRate = (1.0 * countLinesWithDelayInformation / 1.0 * linesWhole) / 100.0;
        questionMarkRate = (1.0 * countLinesWithQuestionMark / 1.0 * linesWhole) / 100.0;
        System.out.println("questionMarkRate rate: " + questionMarkRate + "  countLinesWithQuestionMark: " + countLinesWithQuestionMark); //NON-NLS
        System.out.println("delay rate: " + delayRate + "  countLinesWithDelayInformation: " + countLinesWithDelayInformation); //NON-NLS
    }


    public int getAnzahlPuenktlichAbsolut() {
        int countOnTime = 0;
        for (int r = 0; r < UI_StationDisplay.NUMBER_ROWS; r++) {
            int severity = delaySevArray.get(r);
            if(severity == StationBoardInterface.DELAY_SERVERITY_GREEN) countOnTime++;
        }

        return countOnTime;
    }


    public int getAnzahlVerspaetungenAbsolut() {
        int countLinesWithDelayInformation = 0;
        for (int r = 0; r < UI_StationDisplay.NUMBER_ROWS; r++) {
            int severity = delaySevArray.get(r);
            if((DELAY_SERVERITY_YELLOW == severity) || (severity == DELAY_SERVERITY_RED) || (severity == DELAY_SERVERITY_CANCELLED)) countLinesWithDelayInformation++;
        }

        return countLinesWithDelayInformation;
    }


    public int getAnzahlVerbindungenAbsolut() {
        int countLinesWithValidDepartureTimes = 0;
        for (int r = 0; r < UI_StationDisplay.NUMBER_ROWS; r++) {
            String departure = departureArray.get(r);
            if(isValidDepartureInformation(departure))countLinesWithValidDepartureTimes++;
        }

        return countLinesWithValidDepartureTimes;
    }


    public int getAnzahlLineData() {
        int countRowsWithValidLineData = 0;
        for (int r = 0; r < UI_StationDisplay.NUMBER_ROWS; r++) {
            String linie = linieArray.get(r);
            if((linie != null) && (!linie.isEmpty())) countRowsWithValidLineData++;
        }

        return countRowsWithValidLineData;
    }


    public int getAnzahlDirectionData() {
        int countRowsWithValidDirectionData = 0;
        for (int r = 0; r < UI_StationDisplay.NUMBER_ROWS; r++) {
            String dir = directionArray.get(r);
            if((dir != null) && (!dir.isEmpty())) countRowsWithValidDirectionData++;
        }

        return countRowsWithValidDirectionData;
    }


    public int getAnzahlDeparatureData() {
        int countRowsWithValidDepartureData = 0;
        for (int r = 0; r < UI_StationDisplay.NUMBER_ROWS; r++) {
            String dep = departureArray.get(r);
            if((dep != null) && (dep.isEmpty()))countRowsWithValidDepartureData++;
        }

        return countRowsWithValidDepartureData;
    }


    public Integer computeDelaySeverity(int delayInMinutes) {
        if(delayInMinutes == Integer.MIN_VALUE) {
            return Parser.DELAY_SERVERITY_UNKNOWN;
        }

        return computeDelaySeverity("" + delayInMinutes);
    }


    public Integer computeDelaySeverity(String delayInMinutes) {
        if(delayInMinutes == null) return Parser.DELAY_SERVERITY_UNKNOWN;
        if(delayInMinutes.isEmpty()) return Parser.DELAY_SERVERITY_UNKNOWN;

        if(Parser.CANCELLED_SIGN.contentEquals(delayInMinutes)) {
            return Parser.DELAY_SERVERITY_CANCELLED;
        }

        try {
            int delayInteger = Integer.parseInt(delayInMinutes);
            if(delayInteger == 0) return Parser.DELAY_SERVERITY_GREEN;
            if(delayInteger <= BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED) return Parser.DELAY_SERVERITY_YELLOW;
            return Parser.DELAY_SERVERITY_RED;
        }
        catch(NumberFormatException e) {
            return Parser.DELAY_SERVERITY_UNKNOWN;
        }
    }


    @Override
    public String getDepartureRow(int r) { return departureArray.get(r); }

    @Override
    public String getPredictionRow(int r) {
        return delayArray.get(r);
    }

    @Override
    public Integer getPredictionSeverityRow(int r) {
        return delaySevArray.get(r);
    }

    @Override
    public String getLineRow(int r) {
        return linieArray.get(r);
    }

    @Override
    public String getDestinationRow(int r) {
        return directionArray.get(r);
    }

    @Override
    public String getPlatformRow(int r) { return platformArray.get(r); }

    public String getErrorMessage(TagNode rootTagNode) {
        if(rootTagNode == null) return "";

        TagNode errorNode = rootTagNode.findElementByAttValue("class", "haupt errormsg", true, true ); //NON-NLS
        if(errorNode != null) return errorNode.getText().toString();
        return "";
    }


}
