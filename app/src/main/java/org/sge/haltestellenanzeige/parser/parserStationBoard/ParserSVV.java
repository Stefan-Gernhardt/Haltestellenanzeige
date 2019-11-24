package org.sge.haltestellenanzeige.parser.parserStationBoard;

import android.text.Html;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_SaarSVV;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

/**
 * Created by Admin on 17.02.2018.
 */

public class ParserSVV extends Parser {
    public ParserSVV() { }
    public ParserSVV(String htmlResponse) {
        parse(htmlResponse);
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
    public String getPlatformRow(int r) {
        try {
            return platformArray.get(r);
        }
        catch (IndexOutOfBoundsException e) {
            countExceptions++;
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public String getOPNVTag() {
        return OPNV_SaarSVV.getInstance().getTag();
    }

    @Override
    protected void parseDoing(String htmlResponse) {
        System.out.println("parseDoing SVV: " + Util.printPart(htmlResponse, Util.MESSAGE_LENGTH)); //NON-NLS

        try {
            HtmlCleaner htmlCleaner = new HtmlCleaner();

            TagNode rootTagNode = htmlCleaner.clean(exchangeUmlaute(htmlResponse));
            if (rootTagNode == null) return;

            TagNode tableNode = rootTagNode.findElementByAttValue("class", "hfs_stboard", true, true); //NON-NLS
            if(tableNode == null) return;

            TagNode tbodyNode = tableNode.findElementByName("tbody", false); //NON-NLS
            if(tbodyNode == null) return;

            TagNode[] tableRows = tbodyNode.getElementsByName("tr", false); //NON-NLS

            int row = 1;
            for (int r = 0; ((r < UI_StationDisplay.NUMBER_ROWS) && (row < tableRows.length)); r++, row++) {
                try {
                    TagNode rowNode = tableRows[row];
                    if(r<5) System.out.println("parseSuggestionListResponse SVV row: " + r + "  " + rowNode.getText().toString()); //NON-NLS
                    parseRow(r, rowNode);
                } catch (Exception e) {
                    countExceptions = countExceptions + 0; // seperation lines in departure table for new days causes exceptions
                    System.out.println("Warning ParserSVV.parseDoing");
                    Util.printStringInMultipleLines(htmlResponse);
                    // e.printStackTrace();
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


    private void parseRow(int row, TagNode rowNode) {
        TagNode[] cols = rowNode.getElementsByName("td", false); //NON-NLS

        TagNode departureNode = rowNode.findElementByAttValue("class", "time", true, true); //NON-NLS NON-NLS
        if(row<5) System.out.print(" departureNode: " + departureNode.getText().toString()); //NON-NLS
        parseDepartureNode(row, departureNode);

        TagNode delayNode     = rowNode.findElementByAttValue("class", "prognosis", true, true); //NON-NLS NON-NLS
        parseDelayNode(row, delayNode);

        TagNode lineNode      = rowNode.findElementByAttValue("class", "journey", true, true); //NON-NLS NON-NLS
        parseLinieNode(row, lineNode);

        TagNode platformNode      = rowNode.findElementByAttValue("class", "track", true, true); //NON-NLS NON-NLS
        String platform = parsePlatformNode(row, platformNode);

        TagNode directionNode      = rowNode.findElementByAttValue("class", "direction", true, true); //NON-NLS
        parseDirectionNode(row, directionNode, platform);
    }


    private String parsePlatformNode(int row, TagNode platformNode) {
        if(platformNode == null) return "";

        String platform = Html.fromHtml(platformNode.getText().toString()).toString().trim();
        platformArray.set(row, platform);

        return platform;
    }


    private void parseDirectionNode(int row, TagNode directionNode, String platform) {
        if(directionNode == null) {
            directionArray.set(row, "");
            return;
        }

        if(platform != null && !platform.isEmpty()) {
            directionArray.set(row, Html.fromHtml(directionNode.getText().toString()).toString().trim());
            platformArray.set(row, platform);
        }
        else directionArray.set(row, Html.fromHtml(directionNode.getText().toString()).toString().trim());
    }


    private void parseLinieNode(int row, TagNode lineNode) {
        if(lineNode == null) linieArray.set(row, "");
        else linieArray.set(row, Html.fromHtml(lineNode.getText().toString()).toString().trim());
    }


    private void parseDelayNode(int row, TagNode prognosisNode) {
        if(prognosisNode == null) {
            this.delayArray.set(row, "");
            return;
        }

        TagNode delayNode = prognosisNode.findElementByAttValue("class", "delay", true, true); //NON-NLS
        if(delayNode != null) {
            String delayText = delayNode.getText().toString();
            if(delayText.startsWith("+")) {
                this.delaySevArray.set(row, Parser.DELAY_SERVERITY_YELLOW);
            }
            else {
                this.delaySevArray.set(row, Parser.DELAY_SERVERITY_RED);
            }

            delayArray.set(row, computeDelayText(row, Html.fromHtml(delayNode.getText().toString()).toString().trim()));
            return;
        }

        TagNode onTimeNode = prognosisNode.findElementByAttValue("class", "onTime", true, true); //NON-NLS
        if(onTimeNode != null) {
            this.delayArray.set(row, computeDelayText(row, Html.fromHtml(onTimeNode.getText().toString()).toString()));
            this.delaySevArray.set(row, Parser.DELAY_SERVERITY_GREEN);
            return;
        }

        this.delayArray.set(row, "");
        this.delaySevArray.set(row, Parser.DELAY_SERVERITY_UNKNOWN);
    }


    private void parseDepartureNode(int row, TagNode departureNode) {
        if(departureNode == null) departureArray.set(row, "");
        else departureArray.set(row, Html.fromHtml(departureNode.getText().toString()).toString().trim());
    }


    private String computeDelayText(int row, String delay) {
        if(delay == null) return "";
        if(delay.isEmpty()) return "";

        if(delay.contains(":")) return delay;
        if(delay.startsWith("+")) {
            return delay.substring(delay.indexOf('+') + 1);
        }
        if(Util.startsWithANumber(delay)) {
            return delay;
        }

        return delay;
    }

}
