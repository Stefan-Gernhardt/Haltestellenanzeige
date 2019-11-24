package org.sge.haltestellenanzeige.parser.parserStationBoard;

import android.text.Html;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_KVV;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

import static org.sge.haltestellenanzeige.util.Util.getStringHtmlForNode;

public class ParserKVV extends Parser {
    private HtmlCleaner htmlCleaner = new HtmlCleaner();

    public ParserKVV() { }
    public ParserKVV(String response) {
        parse(response);
    }

    @Override
    public String getOPNVTag() {
        return OPNV_KVV.getInstance().getTag();
    }

    @Override
    protected void parseDoing(String htmlResponse) {
        System.out.println("parseDoing KVV: " + Util.printPart(htmlResponse, Util.MESSAGE_LENGTH)); //NON-NLS

        try {
            htmlCleaner = new HtmlCleaner();
            System.out.println("HtmlCleaner"); //NON-NLS

            TagNode rootTagNode = htmlCleaner.clean(exchangeUmlaute(htmlResponse));
            if (rootTagNode == null) return;

            System.out.println("rootTagNode found"); //NON-NLS
            // Util.printHtmlForNode(htmlCleaner, rootTagNode);

            TagNode[] tableRows = rootTagNode.getElementsByName("div", true); //NON-NLS
            System.out.println("count div tags: " + tableRows.length);

            int row = 0;
            for (int r = 0; ((row < UI_StationDisplay.NUMBER_ROWS) && (r < tableRows.length)); r++) {
                try {
                    TagNode rowNode = tableRows[r];
                    if(r<3) System.out.println("parseSuggestionListResponse KVV row: " + r + "  " + Util.cutString(rowNode.getText().toString(), 500)); //NON-NLS

                    String classAttributeContent = rowNode.getAttributeByName("class");
                    // System.out.println("classAttributeContent: " + classAttributeContent);
                    if(classAttributeContent != null && !classAttributeContent.isEmpty()) {
                        if(classAttributeContent.contains("departure-line")) {
                            parseRow(row , rowNode, htmlCleaner);
                            row++;
                        }
                    }
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
            e.printStackTrace();
            parsingWithoutWarnings = false;
            return;
        }

        parsingWithoutWarnings = true;
    }


    public void parseRow(int row, TagNode rowNode, HtmlCleaner htmlCleaner) {
        // System.out.println("ParserKVV::parseRow row: " + row);
        // System.out.println("row content kvv: " + Util.getStringHtmlForNode(htmlCleaner, rowNode));

        parseDelayNode(rowNode, row, htmlCleaner);
        parseDepartureNode(rowNode, row);
        parseLineAndDestinationNode(rowNode, row);
    }


    private int parseSeverity(String delayString, int row) {
        int severity = Parser.DELAY_SERVERITY_UNKNOWN;
        if(delayString != null && !delayString.isEmpty()) {
            try {
                int delayGrade = Integer.parseInt(delayString);
                if(delayGrade == 0) severity = Parser.DELAY_SERVERITY_GREEN;
                if(delayGrade >= 1 && delayGrade <= BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED) severity = Parser.DELAY_SERVERITY_YELLOW;
                if(delayGrade > BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED) severity = Parser.DELAY_SERVERITY_RED;
            }
            catch(NumberFormatException  e) {
                countExceptions = countExceptions + 0;
                System.out.println("Warning ParserKVV.parseRow delay severity is set to unknown");
                Util.printStringInMultipleLines(delayString);
            }
        }

        return severity;
    }


    // departure
    private void parseDepartureNode(TagNode divNode, int row) {
        if(divNode == null) {
            departureArray.set(row, "");
            return;
        }

        try {
            TagNode div2 = divNode.findElementByName("div", false);
            if(div2 != null) {
                TagNode[] divArray = div2.getElementsByName("div", false);
                TagNode departureNode = divArray[0];

                String departureString = Html.fromHtml(departureNode.getText().toString()).toString().trim();
                departureArray.set(row, departureString);
                // System.out.println("parseDepartureNode() row: " + row + " departureString: " + departureString);
            }
        }
        catch (Exception e) {
            System.out.println("Parse exception in parseDepartureNode");
            countExceptions++;
            e.printStackTrace();
        }
    }


    // delay
    private void parseDelayNode(TagNode divNode, int row, HtmlCleaner htmlCleaner) {
        // System.out.println("ParserKVV::parseDelayNode()");
        if(divNode == null) {
            delayArray.set(row, "");
            System.out.println("ParserKVV::parseDelayNode() divNode == null");
            return;
        }

        try {
            TagNode div = divNode.findElementByName("div", false);
            if(div != null) {
                TagNode[] divArray = div.getElementsByName("div", false);
                // System.out.println("ParserKVV::parseDelayNode() divArray size:" + divArray.length);
                TagNode delayNode = divArray[1];
                // System.out.println("ParserKVV::parseDelayNode() delayNode: " + getStringHtmlForNode(htmlCleaner, delayNode));

                String delayString = Html.fromHtml(delayNode.getText().toString()).toString().trim();
                delayArray.set(row, delayString);
                // System.out.println("parseDelayNode() row: " + row + " delayString: " + delayString);

                int delaySeverity = parseSeverity(delayNode.getAttributeByName("data-delay"), row);
                delaySevArray.set(row, delaySeverity);
                // System.out.println("parseDelayNode() row: " + row + " delaySeverity: " + delaySeverity);
            }
        }
        catch (Exception e) {
            System.out.println("Parse exception in parseDelayNode");
            e.printStackTrace();
            countExceptions++;
        }
    }


    // line
    private void parseLineAndDestinationNode(TagNode divNode, int row) {
        if(divNode == null) {
            linieArray.set(row, "");
            return;
        }

        try {
            TagNode div2 = divNode.findElementByName("div", false);
            if(div2 != null) {
                TagNode[] divArray = div2.getElementsByName("div", false);
                TagNode lineAndDestinationNode = divArray[2];
                String destinationString = Html.fromHtml(lineAndDestinationNode.getText().toString()).toString().trim();
                // System.out.println("destinationString: " + destinationString);
                TagNode aHref = lineAndDestinationNode.findElementByName("a", false);
                TagNode span = aHref.findElementByName("span", false);
                TagNode[] spanArray = span.getElementsByName("span", false);
                String additionalLineName = "";

                TagNode label1 = spanArray[1];
                String labelStringLine = Html.fromHtml(label1.getText().toString()).toString().trim();
                // System.out.println("ParserKVV::parseLineAndDestinationNode: labelStringLine: " + labelStringLine);

                int countStd3MotElement = 0;
                for (int i = 0; i < spanArray.length; i++) {
                    // System.out.println("ParserKVV::parseLineAndDestinationNode: i: " + i);
                    String attributeContent = spanArray[i].getAttributeByName("class");
                    if ("std3_mot-label".contentEquals(attributeContent)) {
                        countStd3MotElement++;
                        TagNode subSpan = spanArray[i].findElementByName("span", false);
                        additionalLineName = Html.fromHtml(subSpan.getText().toString()).toString().trim();
                        // System.out.println("additionalLineName: " + additionalLineName);
                        destinationString = destinationString.replace(additionalLineName, "");

                        TagNode labelSpan = spanArray[i];
                        String labelString = Html.fromHtml(labelSpan.getText().toString()).toString().replace(additionalLineName, "").trim();
                        // System.out.println("labelString: " + labelString);
                        destinationString = destinationString.replace(labelString, "");

                        if (countStd3MotElement > 1) {
                            labelStringLine = labelStringLine.replace(additionalLineName, "").trim();
                        }
                    }
                }

                // System.out.println("line before replacement: " + labelStringLine);
                labelStringLine = labelStringLine.replace("Straßenbahn", "Tram").replace("Regionalbus", "Bus").replace("S-Bahn", "").trim();
                // System.out.println("line after replacement: " + labelStringLine);
                linieArray.set(row, labelStringLine);

                TagNode abTextNode = lineAndDestinationNode.findElementByName("span", false);
                String labelString3 = Html.fromHtml(abTextNode.getText().toString()).toString().trim();

                String destinationStringCleaned = destinationString.replace(labelString3, "");
                directionArray.set(row, destinationStringCleaned.trim());
            }
        }
        catch (Exception e) {
            System.out.println("Parse exception in parseLineAndDestinationNode");
            e.printStackTrace();
            countExceptions++;
            Util.printHtmlForNode(htmlCleaner, divNode);
        }
    }


    // departure
    private void parseDepartureNode5Lines(TagNode departureNode, int row) {
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

        // System.out.println("row: " + row + "  departureTimeString " + departureTimeString);
        departureArray.set(row, departureTimeString);
    }


    private void parseDelayNode5Lines(TagNode delayNode, int row) {
        if(delayNode == null) {
            delayArray.set(row, "");
            return;
        }

        TagNode span = delayNode.findElementByName("span", false);

        String delayString = Html.fromHtml(span.getText().toString()).toString().trim();
        delayArray.set(row, delayString);

        int severity = Parser.DELAY_SERVERITY_UNKNOWN;
        String dataDelayAttributeContent = span.getAttributeByName("data-delay");
        if(dataDelayAttributeContent != null && !dataDelayAttributeContent.isEmpty()) {
            try {
                int delayGrade = Integer.parseInt(dataDelayAttributeContent);
                if(delayGrade == 0) severity = Parser.DELAY_SERVERITY_GREEN;
                if(delayGrade >= 1 && delayGrade <= BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED) severity = Parser.DELAY_SERVERITY_YELLOW;
                if(delayGrade > BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED) severity = Parser.DELAY_SERVERITY_RED;
            }
            catch(NumberFormatException  e) {
                countExceptions = countExceptions + 0;
                System.out.println("Warning ParserKVV.parseDelayNode5Lines");
            }
        }

        delaySevArray.set(row, severity);
    }


    private void parseLineNode5Lines(TagNode lineNode, int row) {
        if(lineNode == null) {
            linieArray.set(row, "");
            return;
        }

        String lineNumber = "";

        try {
            TagNode a = lineNode.findElementByName("a", false); //NON-NLS
            TagNode span = a.findElementByName("span", false);
            TagNode[] spanArray = span.getElementsByName("span", false);

            TagNode spanLineNumber = spanArray[1];
            lineNumber = Html.fromHtml(spanLineNumber.getText().toString()).toString().trim();
        }
        catch (Exception e) {
            countExceptions++;
            System.out.println("parseSuggestionListResponse exception: " + getOPNVTag()); //NON-NLS
            System.out.println("parseSuggestionListResponse row number: " + row); //NON-NLS
            System.out.println("parseSuggestionListResponse line content: " + lineNode.toString()); //NON-NLS
            e.printStackTrace();
        }

        String replaceTram = "Straßenbahn";
        if(lineNumber.contains(replaceTram)) lineNumber = lineNumber.replace(replaceTram, "Tram");

        String replaceS_Bahn = "S-Bahn ";
        if(lineNumber.contains(replaceS_Bahn)) lineNumber = lineNumber.replace(replaceS_Bahn, "");

        linieArray.set(row, lineNumber);
    }



    // destination
    private void parseDestinationNode5Lines(TagNode destNode, int row) {
        // System.out.println("parseDestinationNode row: " + row);
        if(destNode == null) {
            directionArray.set(row, "");
            return;
        }

        String destinationString = Html.fromHtml(destNode.getText().toString()).toString().trim();
        // System.out.println("row: " + row + "  destinationString " + destinationString);

        if(!destinationString.isEmpty()) {
            int indexOfSpace = destinationString.indexOf(" ");
            if (indexOfSpace > 0 && indexOfSpace < destinationString.length()) {
                destinationString = destinationString.substring(indexOfSpace + 1, destinationString.length());
            }
        }

        directionArray.set(row, destinationString);
    }


    public void parseRow5Lines(HtmlCleaner htmlCleaner, int r, TagNode rowNode) {
        TagNode[] cols = rowNode.getElementsByName("td", false); //NON-NLS
        if(cols.length < 4) return;

        TagNode departureNode = cols[0];
        TagNode delayNode     = cols[1];
        TagNode lineNode      = cols[2];
        TagNode destNode      = cols[3];


        parseDepartureNode5Lines(departureNode, r);
        parseDelayNode5Lines(delayNode, r);
        parseLineNode5Lines(lineNode, r);
        parseDestinationNode5Lines(destNode, r);
    }


    public void parseDoing5Lines(String htmlResponse) {
        System.out.println("parseDoing KVV: " + Util.printPart(htmlResponse, Util.MESSAGE_LENGTH)); //NON-NLS

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

            for (int r = 0; ((r < UI_StationDisplay.NUMBER_ROWS) && (r < tableRows.length)); r++) {
                try {
                    TagNode rowNode = tableRows[r];
                    if(r<3) System.out.println("parseSuggestionListResponse KVV row: " + r + "  " + rowNode.getText().toString()); //NON-NLS
                    parseRow5Lines(htmlCleaner, r, rowNode);
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
            e.printStackTrace();
            parsingWithoutWarnings = false;
            return;
        }

        parsingWithoutWarnings = true;
    }


}
