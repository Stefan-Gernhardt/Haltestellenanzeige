package org.sge.haltestellenanzeige.parser.parserStationBoard;

import android.text.Html;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_RMV;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

public class ParserRMV extends Parser {
    public ParserRMV() { }
    public ParserRMV(String response) {
        parse(response);
    }

    @Override
    protected void parseDoing(String htmlResponse) {
        System.out.println("parseDoing RMV: " + Util.printPart(htmlResponse, Util.MESSAGE_LENGTH)); //NON-NLS

        try {
            HtmlCleaner htmlCleaner = new HtmlCleaner();
            System.out.println("HtmlCleaner"); //NON-NLS

            TagNode rootTagNode = htmlCleaner.clean(exchangeUmlaute(htmlResponse));
            if (rootTagNode == null) return;

            System.out.println("rootTagNode found"); //NON-NLS

            TagNode tbodyNode = rootTagNode.findElementByName("tbody", true); //NON-NLS
            if (tbodyNode == null) return;
            System.out.println("tBody found"); //NON-NLS

            TagNode[] tableRows = tbodyNode.getElementsByName("tr", false); //NON-NLS

            int row = 0;
            for (int r = 0; ((r < UI_StationDisplay.NUMBER_ROWS) && (row < tableRows.length)); r++, row++) {
                try {
                    TagNode rowNode = tableRows[row];
                    if(r<3) System.out.println("parseSuggestionListResponse RMV row: " + r + "  " + rowNode.getText().toString()); //NON-NLS
                    parseRow(r, rowNode);
                } catch (Exception e) {
                    countExceptions++;
                    System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
                    System.out.println("parseSuggestionListResponse row number: " + r); //NON-NLS
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e) {
            countExceptions++;
            System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
            System.out.println("responseString: " + htmlResponse);
            e.printStackTrace();
            parsingWithoutWarnings = false;
            return;
        }

        parsingWithoutWarnings = true;
    }


    private void parseSeverity(String delayString, int row) {
        // System.out.println("delayString: <" + delayString + ">");
        if(delayString == null) {
            // severity unknown
            delaySevArray.set(row, Parser.DELAY_SERVERITY_UNKNOWN);
            delayArray.set(row, "");
            // System.out.println("parseSeverity row: " + row + " unknown");

            return;
        }

        if(delayString.isEmpty()) {
            // severity unknown
            delaySevArray.set(row, Parser.DELAY_SERVERITY_UNKNOWN);
            delayArray.set(row, "");
            // System.out.println("parseSeverity row: " + row + " unknown");

            return;
        }

        if(delayString.contains("pünktlich")) {
            // severity green
            delaySevArray.set(row, Parser.DELAY_SERVERITY_GREEN);
            delayArray.set(row, "pünktlich");
            // System.out.println("parseSeverity row: " + row + " pünktlich");

            return;
        }

        if(delayString.contains("Fahrt fällt aus")) {
            // severity red
            delaySevArray.set(row, Parser.DELAY_SERVERITY_RED);
            delayArray.set(row, "Fahrt fällt aus");
            // System.out.println("parseSeverity row: " + row + " red");

            return;
        }

        // severity yellow
        delaySevArray.set(row, Parser.DELAY_SERVERITY_YELLOW);
        delayArray.set(row, delayString);
        // System.out.println("parseSeverity row: " + row + " yellow");
    }


    private void parseDelayNode(TagNode delayNode, int row) {
        if(delayNode == null) {
            delayArray.set(row, "");
            return;
        }

        String delayString = Html.fromHtml(delayNode.getText().toString()).toString().trim();
        // System.out.println("row: " + row + "  delayString " + delayString);

        parseSeverity(delayString, row);
    }


    private void parseDepartureNode(TagNode departureNode, int row) {
        if(departureNode == null) {
            departureArray.set(row, "");
            return;
        }

        String departureTimeString = Html.fromHtml(departureNode.getText().toString()).toString().trim();
        if(departureTimeString == null) {
            departureArray.set(row, "");
            delayArray.set(row, "");
            delaySevArray.set(row, Parser.DELAY_SERVERITY_YELLOW);
            return;
        }

        int indexOfSpace = departureTimeString.indexOf(" ");
        if(indexOfSpace > 0) departureTimeString = departureTimeString.substring(0, indexOfSpace);

        final String token = "pünktlich";
        // System.out.println("parseDepartureNode row: " + row + "  departureTimeString " + departureTimeString);
        if(departureTimeString.contains(token)) {
            departureArray.set(row, departureTimeString.replace(token, ""));
            delaySevArray.set(row, Parser.DELAY_SERVERITY_GREEN);
            return;
        }
        else {
            departureArray.set(row, departureTimeString);
        }

        TagNode[] spans = departureNode.getElementsByName("span", false);
        // System.out.println("spans.length: " + spans.length);
        if(spans.length == 0) {
            delayArray.set(row, "");
            delaySevArray.set(row, Parser.DELAY_SERVERITY_YELLOW);
            return;
        }

        parseDelayNode(spans[0], row);
    }


    private void parseRow(int r, TagNode rowNode) {
        TagNode[] cols = rowNode.getElementsByName("td", false); //NON-NLS
        if(cols.length < 3) return;

        TagNode departureNode = cols[0];
        TagNode lineNode = cols[1];
        TagNode destNode = cols[2];

        parseDepartureNode(departureNode, r);
        parseLineNode(lineNode, r);
        parseDestinationNode(destNode, r);
    }


    private void parseDestinationNode(TagNode destNode, int row) {
        // System.out.println("parseDestinationNode row: " + row);
        TagNode[] as = destNode.getElementsByName("a", false); //NON-NLS
        if(as.length == 0) {
            directionArray.set(row, "");
            return;
        }

        String destinationString = Html.fromHtml(as[0].getText().toString()).toString().trim();
        directionArray.set(row, destinationString);
    }


    private void parseLineNode(TagNode lineNode, int row) {
        String linieString = Html.fromHtml(lineNode.getText().toString()).toString().trim();
        linieArray.set(row, linieString);
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
    public String getPlatformRow(int r) { return ""; }

    @Override
    public String getOPNVTag() {
        return OPNV_RMV.getInstance().getTag();
    }
}
