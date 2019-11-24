package org.sge.haltestellenanzeige.parser.parserStationBoard;

import android.text.Html;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_MVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRR;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

public class ParserMVV extends Parser {
    public ParserMVV() { }
    public ParserMVV(String response) {
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
                    if (r < 3)
                        System.out.println("parseSuggestionListResponse RMV row: " + r + "  " + rowNode.getText().toString()); //NON-NLS
                    parseRow(r, rowNode);
                } catch (Exception e) {
                    countExceptions++;
                    System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
                    System.out.println("parseSuggestionListResponse row number: " + r); //NON-NLS
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            countExceptions++;
            System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
            System.out.println("responseString: " + htmlResponse);
            e.printStackTrace();
            parsingWithoutWarnings = false;
            return;
        }

        parsingWithoutWarnings = true;

        //for (int r = 0; r < UI_StationDisplay.NUMBER_ROWS; r++) {
        //    System.out.println("row MVV: " + departureArray.get(r) + " " + delayArray.get(r) + " " + linieArray.get(r) + " " + directionArray.get(r));
        //}
    }


    private void parseLineNode(TagNode lineNode, int row) {
        if(lineNode == null) {
            linieArray.set(row, "");
        }

        TagNode spanLinie = lineNode.findElementByName("span", false);
        if(spanLinie == null) {
            linieArray.set(row, "");
            return;
        }

        String linieString = Html.fromHtml(spanLinie.getText().toString()).toString().trim();
        linieArray.set(row, linieString);
    }


    private void parseDestinationNode(TagNode destNode, int row) {
        if(destNode == null) {
            directionArray.set(row, "");
        }
        else {
            String linieString = Html.fromHtml(destNode.getText().toString()).toString().trim();
            directionArray.set(row, linieString);
        }
    }


    private void parseDelay(TagNode delayNode, int row) {
        if(delayNode == null) {
            delayArray.set(row, "");
            return;
        }

        TagNode spanDelay = delayNode.findElementByName("span", false);

        if(spanDelay == null) {
            delayArray.set(row, "");
            return;
        }

        String delayString = Html.fromHtml(spanDelay.getText().toString()).toString().trim();
        delayArray.set(row, delayString);
    }


    private void parseDepartureNode(TagNode departureNode, int row) {
        if(departureNode == null) {
            departureArray.set(row, "");
        }
        else {
            String departureString = Html.fromHtml(departureNode.getText().toString()).toString().trim();
            departureArray.set(row, departureString);
        }
    }


    private void setDelaySeverity(int row) {
        int delayInMinutes = Util.getTimeDifferenceInMinutes(departureArray.get(row), delayArray.get(row));
        int severity = computeDelaySeverity(delayInMinutes);
        delaySevArray.set(row, severity);
    }


    private void parseRow(int r, TagNode rowNode) {
        TagNode[] cols = rowNode.getElementsByName("td", false); //NON-NLS
        if(cols.length < 4) return;

        TagNode lineNode      = cols[0];
        TagNode destNode      = cols[1];
        TagNode delayNode     = cols[2];
        TagNode departureNode = cols[3];

        parseLineNode(lineNode, r);
        parseDestinationNode(destNode, r);
        parseDelay(delayNode, r);
        parseDepartureNode(departureNode, r);
        setDelaySeverity(r);
    }


    @Override
    public String getOPNVTag() {
        return OPNV_MVV.getInstance().getTag();

    }
}
