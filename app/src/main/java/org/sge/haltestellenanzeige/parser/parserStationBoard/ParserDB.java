package org.sge.haltestellenanzeige.parser.parserStationBoard;

import android.text.Html;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

/**
 * Created by Admin on 20.01.2018.
 */

public class ParserDB extends Parser {
    public ParserDB() { }
    public ParserDB(String htmlResponse) {
        parse(htmlResponse);
    }


    private void printOutSubTagNodes(TagNode nodeCurrent, boolean recursive) {
        TagNode[] nodeArray = nodeCurrent.getAllElements(recursive);
        System.out.println("print sub nodes: " + nodeCurrent.getAllElements(recursive).length); //NON-NLS
        for(TagNode node : nodeArray) {
            System.out.println("  : " + node.getName()); //NON-NLS
            System.out.println(node.toString()); //NON-NLS
        }

        System.out.println("print whole node: " + nodeCurrent.toString()); //NON-NLS
    }


    private String retrieveDirection(TagNode row) {
        if(row == null) return "";

        TagNode[] divArray = row.getElementsByName("div", false); //NON-NLS

        System.out.println("print all divs from a row"); //NON-NLS
        for(int i=0; i<divArray.length; i++) {
            System.out.println("  div i: " + i + "  " + divArray[i].getText()); //NON-NLS
            String classAttribute = divArray[i].getAttributeByName("class"); //NON-NLS
            System.out.println("  div i class: " + classAttribute); //NON-NLS
        }

        return "testDir"; //NON-NLS
    }


    private String retrievePlatform(TagNode divNode) {
        if(divNode == null) return "";

        return Util.removeLineBreaks(divNode.getText().toString());
    }


    private void retrieveDepartureAndDelayTime(TagNode divNode, int row) {
        delayArray.set(row, "");

        // robustness test
        // if(row>=0) {
        //    departureArray.set(row, DEFAULT_SIGN);
        //    return;
        //}

        String departureTime = "";
        String delayTime = "";
        String delayTimeRed = "";

        TagNode[] spans = divNode.getElementsByName("span", true); //NON-NLS
        for(int s=0; s<spans.length; s++) {
            TagNode spanNode = spans[s];

            int displayFirstRows = 5;

            String classString = spanNode.getAttributeByName("class"); //NON-NLS
            if(classString != null) {
                if(classString.contentEquals("bold")) { //NON-NLS
                    departureTime = spanNode.getText().toString();
                    departureArray.set(row, Html.fromHtml(departureTime).toString());
                }

                // etwas Verspätung
                if(classString.contentEquals("delayOnTime")) { //NON-NLS
                    delayTime = spanNode.getText().toString();
                    delayArray.set(row, Html.fromHtml(delayTime).toString());
                }

                // verspätet
                if (classString.contentEquals("delay")) { //NON-NLS
                    delayTimeRed = spanNode.getText().toString();
                    delayArray.set(row, Html.fromHtml(delayTimeRed).toString());
                }

            }
        }

        if(!departureTime.isEmpty()) {
            if(departureTime.contentEquals(delayArray.get(row))) {
                // puenktlich
                delaySevArray.set(row, DELAY_SERVERITY_GREEN);
            }
            else {
                if(!delayTime.isEmpty()) {
                    delaySevArray.set(row, DELAY_SERVERITY_YELLOW);
                }

                if(!delayTimeRed.isEmpty()) {
                    delaySevArray.set(row, DELAY_SERVERITY_RED);
                }
            }
        }

        if (row < 5) {
            System.out.print("delay severity: " + delaySevArray.get(row)); //NON-NLS
        }
    }


    private void retrieveDirAndLine(TagNode divNode, int row, String bahnsteig) {
        int lengthLinie = 0;
        TagNode[] spans = divNode.getElementsByName("span", true); //NON-NLS
        for(int s=0; s<spans.length; s++) {
            TagNode spanNode = spans[s];

            String classString = spanNode.getAttributeByName("class"); //NON-NLS
            if (classString != null) {
                if (classString.contentEquals("bold")) {//NON-NLS
                    String linie = spanNode.getText().toString();
                    lengthLinie = linie.length();
                    linieArray.set(row, Html.fromHtml(linie).toString());
                    if(row<5) System.out.print("linie: " + linie + "  "); //NON-NLS
                }
            }
        }

        if(bahnsteig != null) {
            String workString = bahnsteig.trim();
            if(workString.length() > 0) {
                platformArray.set(row, bahnsteig);
            }
        }

        String richtung = divNode.getText().toString();
        if(richtung.length() > lengthLinie) {
            richtung = richtung.substring(lengthLinie);
        }
        directionArray.set(row, Html.fromHtml(richtung).toString().substring("nach ".length()));
    }


    private String retrieveAlerts(TagNode row) {
        if(row == null) return "";

        TagNode[] spans = row.getElementsByName("span", true); //NON-NLS
        String returnString = " ";
        for(int s=0; s<spans.length; s++) {
            TagNode spanNode = spans[s];
            String className = spanNode.getAttributeByName("class"); //NON-NLS
            if(className != null) {
                if(className.contentEquals("red")) {//NON-NLS
                    String spanText = spanNode.getText().toString();
                    //System.out.print("span: " + spanText + "  ");
                    returnString = returnString.concat(" " + spanText);
                }
            }
        }

        return Html.fromHtml(returnString).toString();
    }


    private String retrieveHimMeldung(TagNode divNode) {
        if(divNode == null) return "";

        String text = " " + divNode.getText().toString();
        System.out.print("himMeldung: " + text + "  "); //NON-NLS
        return Html.fromHtml(divNode.getText().toString()).toString();
    }


    private String retrieveRedMeldung(TagNode spanNode) {
        if(spanNode == null) return "";

        String text = " " + spanNode.getText().toString();
        System.out.print("redMeldung: " + text + "  "); //NON-NLS
        return Html.fromHtml(spanNode.getText().toString()).toString();
    }


    @Override
    protected void parseDoing(String htmlResponse) {
        System.out.println("parseDoing DB: " + Util.printPart(htmlResponse, Util.MESSAGE_LENGTH)); //NON-NLS
        try {
            HtmlCleaner htmlCleaner = new HtmlCleaner();
            TagNode rootTagNode = htmlCleaner.clean(htmlResponse);
            if (rootTagNode == null) return;

            TagNode table = rootTagNode.findElementByAttValue("class", "clicktable", true, true); //NON-NLS
            if (table == null) {
                String errorMessage = Html.fromHtml(getErrorMessage(rootTagNode)).toString();
                if (errorMessage.length() > 0) {
                    departureArray.set(0, ERROR_SIGN);
                    delayArray.set(0, ERROR_SIGN);
                    linieArray.set(0, ERROR_SIGN);
                    directionArray.set(0, errorMessage);
                }
                parsingWithoutWarnings = false;
                System.out.println("parseSuggestionListResponse error in DB"); //NON-NLS
                return;
            }

            TagNode[] tableRows = table.getElementsByAttValue("class", "sqdetailsDep trow", false, false); //NON-NLS
            if (tableRows == null) {
                System.out.println("parseSuggestionListResponse error in DB"); //NON-NLS
                departureArray.set(0, ERROR_SIGN);
                delayArray.set(0, ERROR_SIGN);
                linieArray.set(0, ERROR_SIGN);
                directionArray.set(0, "parseSuggestionListResponse error in DB"); //NON-NLS
                return;
            }

            for (int r = 0; r < Math.min(tableRows.length, UI_StationDisplay.NUMBER_ROWS); r++) {
                System.out.println(); //NON-NLS
                if(r<5) System.out.print("row_DB: " + r + "  "); //NON-NLS

                try {
                    String bahnsteig = "";
                    String himMeldung = "";

                    TagNode rowNode = tableRows[r];
                    TagNode[] divArray = rowNode.getElementsByName("div", false); //NON-NLS

                    for (int i = 0; i < divArray.length; i++) {
                        TagNode divNode = divArray[i];
                        String classAttribute = divNode.getAttributeByName("class"); //NON-NLS
                        if (classAttribute != null) {
                            if (classAttribute.contentEquals("sqPlatform")) {//NON-NLS
                                bahnsteig = retrievePlatform(divNode);
                                if(r<5) System.out.print("Bahnsteig = " + bahnsteig + "  "); //NON-NLS
                            }
                            if (classAttribute.contentEquals("sqTime")) {//NON-NLS
                                retrieveDepartureAndDelayTime(divNode, r);
                            }
                            if (classAttribute.contentEquals("sqProduct")) {//NON-NLS
                                // retrieveProduct(divNode);
                            }
                            if (classAttribute.contentEquals("sqDirection")) {//NON-NLS
                                retrieveDirAndLine(divNode, r, bahnsteig);
                            }
                            if (classAttribute.contentEquals("him")) {//NON-NLS
                                himMeldung = himMeldung.concat(" " + retrieveHimMeldung(divNode));
                            }
                        }
                    }

                    // Stoerungsmeldungen
                    String stoerungsMeldungen = retrieveAlerts(rowNode);
                    String richtung = directionArray.get(r);
                    directionArray.set(r, richtung + stoerungsMeldungen + himMeldung);
                } catch (Exception e) {
                    countExceptions++;
                    System.out.println("parseSuggestionListResponse exception db: "); //NON-NLS
                    System.out.println("parseSuggestionListResponse row number: " + r); //NON-NLS
                }
            }
            System.out.println(); //NON-NLS
        }
        catch (Exception e) {
            countExceptions++;
            System.out.println("parseSuggestionListResponse exception db: " + getOPNVTag()); //NON-NLS
            System.out.println("responseString db: " + htmlResponse);
            parsingWithoutWarnings = false;
            return;
        }

    }


    public String getDepartureRow(int r) {
        try {
            return departureArray.get(r);
        }
        catch (IndexOutOfBoundsException e) {
            countExceptions++;
            e.printStackTrace();
            return Parser.DEFAULT_SIGN;
        }
    }

    public String getPredictionRow(int r) {
        try {
            return delayArray.get(r);
        }
        catch (IndexOutOfBoundsException e) {
            countExceptions++;
            e.printStackTrace();
            return Parser.DEFAULT_SIGN;
        }
    }

    public Integer getPredictionSeverityRow(int r) {
        try {
            return delaySevArray.get(r);
        }
        catch (IndexOutOfBoundsException e) {
            countExceptions++;
            e.printStackTrace();
            return DELAY_SERVERITY_UNKNOWN;
        }
    }


    public String getLineRow(int r) {
        try {
            return linieArray.get(r);
        }
        catch (IndexOutOfBoundsException e) {
            countExceptions++;
            e.printStackTrace();
            return Parser.DEFAULT_SIGN;
        }
    }

    public String getDestinationRow(int r) {
        try {
            return directionArray.get(r);
        }
        catch (IndexOutOfBoundsException e) {
            countExceptions++;
            e.printStackTrace();
            return Parser.DEFAULT_SIGN;
        }
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
        return OPNV_BahnDB.getInstance().getTag();
    }
}
