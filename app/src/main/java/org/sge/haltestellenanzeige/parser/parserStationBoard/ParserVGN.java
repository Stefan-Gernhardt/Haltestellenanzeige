package org.sge.haltestellenanzeige.parser.parserStationBoard;

import android.text.Html;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.sge.haltestellenanzeige.net.StationBoardInterface;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VGN;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

public class ParserVGN extends Parser {
    public ParserVGN() { };

    public ParserVGN(String jsonString) {
        parse(jsonString);
    }

    private String extractTable(String htmlResponse) {
        try {
            int posTbodyStart = htmlResponse.indexOf("<tbody>");
            System.out.println("posTbodyStart: " + posTbodyStart); //NON-NLS

            int posTbodyEnd = htmlResponse.indexOf("</tbody>");
            System.out.println("posTbodyEnd: " + posTbodyEnd); //NON-NLS

            return this.html_template_start + htmlResponse.substring(posTbodyStart, posTbodyEnd + "</tbody>".length()) + this.html_template_end;
        }
        catch(IndexOutOfBoundsException e) {
            return this.html_template_start + "<tbody></tbody>" + this.html_template_end;
        }
    }


    @Override
    protected void parseDoing(String htmlResponseString) {
        String htmlResponse = extractTable(htmlResponseString);
        System.out.println("extracted htmlResponse: " + htmlResponse); //NON-NLS
        try {
            HtmlCleaner htmlCleaner = new HtmlCleaner();
            TagNode rootTagNode = htmlCleaner.clean(htmlResponse);
            if (rootTagNode == null) return;

            TagNode tbody = rootTagNode.findElementByName("tbody", true); //NON-NLS
            TagNode[] tbodyArray = rootTagNode.getElementsByName("tbody", true); //NON-NLS
            TagNode table = tbodyArray[0];
            if (table == null) {
                String errorMessage = Html.fromHtml(getErrorMessage(rootTagNode)).toString();
                if (errorMessage.length() > 0) {
                    departureArray.set(0, ERROR_SIGN);
                    delayArray.set(0, ERROR_SIGN);
                    linieArray.set(0, ERROR_SIGN);
                    directionArray.set(0, errorMessage);
                }
                parsingWithoutWarnings = false;
                System.out.println("parseSuggestionListResponse error in VGN"); //NON-NLS
                return;
            }

            TagNode[] tableRowsTR = table.getElementsByName("tr", false); //NON-NLS
            System.out.println("count table rows in VGN: " + tableRowsTR.length); //NON-NLS
            if (tableRowsTR == null) {
                System.out.println("parseSuggestionListResponse error in VGN"); //NON-NLS
                departureArray.set(0, ERROR_SIGN);
                delayArray.set(0, ERROR_SIGN);
                linieArray.set(0, ERROR_SIGN);
                directionArray.set(0, "parseSuggestionListResponse error in VGN"); //NON-NLS
                return;
            }

            int rowOut = 0;
            for (int rowIn = 1; rowIn < Math.min(tableRowsTR.length, UI_StationDisplay.NUMBER_ROWS); rowIn++, rowOut++) {
                System.out.println(); //NON-NLS
                if(rowOut<5) {
                    System.out.println("row_VGN: " + rowOut); //NON-NLS
                    // printDirectChildren(tableRowsTR[rowIn]);
                }

                try {
                    String bahnsteig = "";
                    String himMeldung = "";

                    TagNode rowTR = tableRowsTR[rowIn];
                    TagNode[] tdArray = rowTR.getElementsByName("td", false); //NON-NLS

                    // System.out.println("parseDepartureListResponse count tds: " + tdArray.length); //NON-NLS
                    if(tdArray.length > 1) parseDepartureDelay(rowOut, tdArray[1]);
                    if(tdArray.length > 0) parseDepartureTimeAndDelay(rowOut, tdArray[0]);
                    if(tdArray.length > 2) parseDepartureLinie(rowOut, tdArray[2]);
                    if(tdArray.length > 2) parseDepartureDirection(rowOut, tdArray[2]);

                    setDelaySeverity(rowOut);
                } catch (Exception e) {
                    countExceptions++;
                    System.out.println("parseDepartureListResponse exception VGN: "); //NON-NLS
                    System.out.println("parseDepartureListResponse row number: " + rowOut); //NON-NLS
                }
            }
            System.out.println(); //NON-NLS
        }
        catch (Exception e) {
            countExceptions++;
            System.out.println("parseSuggestionListResponse exception VGN: " + getOPNVTag()); //NON-NLS
            System.out.println("responseString VGN: " + htmlResponse);
            parsingWithoutWarnings = false;
            return;
        }

    }


    private void parseDepartureDelay(int rowOut, TagNode tagNode) {
        // System.out.println("parseDepartureDelay");
        TagNode[] spanArray = tagNode.getElementsByName("span", false); //NON-NLS
        if(spanArray.length > 0) {
            String delay = spanArray[0].getText().toString();
            delayArray.set(rowOut, Html.fromHtml(delay).toString());
        }
    }


    private void parseDepartureLinie(int rowOut, TagNode tagNode) {
        // System.out.println("parseDepartureLinie");
        TagNode[] hrefArray = tagNode.getElementsByName("a", false); //NON-NLS
        if(hrefArray.length > 0) {
            String linie = hrefArray[0].getText().toString();
            linieArray.set(rowOut, Html.fromHtml(linie).toString());
        }
    }


    private void parseDepartureDirection(int rowOut, TagNode tagNode) {
        // System.out.println("parseDepartureDirection");
        TagNode[] spanArray = tagNode.getElementsByName("span", false); //NON-NLS
        if(spanArray.length >= 1) {
            // System.out.println("spanArray > 0");
            TagNode span = spanArray[0];
            String classAttribute = span.getAttributeByName("class");
            // System.out.println("classAttribute: " + classAttribute);
            if((classAttribute != null) && (classAttribute.contentEquals("EFA-Richtung"))) {
                // System.out.println("dir1 found");
                TagNode[] spanArrayDirections = span.getElementsByName("span", false); //NON-NLS
                String richtung = "";
                for(int i=0; i<spanArrayDirections.length; i++) {
                    richtung = richtung + spanArrayDirections[i].getText().toString();
                }
                directionArray.set(rowOut, Html.fromHtml(richtung).toString());
            }
        }
    }


    private void parseDepartureTimeAndDelay(int rowOut, TagNode tagNode) {
        // System.out.println("parseDepartureTimeAndDelay");
        TagNode[] spanArray = tagNode.getElementsByName("span", false); //NON-NLS
        // System.out.println("spanArray size: " + spanArray.length);

        if(spanArray.length >= 1) {
            TagNode departureTagNode = spanArray[0];
            String departureTime = departureTagNode.getText().toString();
            // System.out.println("spanArray departure time: " + Html.fromHtml(departureTime).toString() + "  row: " + rowOut);
            departureArray.set(rowOut, Html.fromHtml(departureTime).toString());
        }

        if(spanArray.length >= 2) {
            TagNode delayTagNode = spanArray[1];
            String delayTime = delayTagNode.getText().toString();
            // System.out.println("spanArray delayTime time: " + delayTime);
            delayArray.set(rowOut, Html.fromHtml(delayTime).toString());

            String classAttribute = delayTagNode.getAttributeByName("class");
            if((classAttribute != null) && classAttribute.contentEquals("delay-missing")) {
                delaySevArray.set(rowOut, StationBoardInterface.DELAY_SERVERITY_UNKNOWN);
            }
        }
    }


    private void setDelaySeverity(int row) {
        String delayTime = delayArray.get(row);

        if((delayTime != null) && (!delayTime.isEmpty())) {
            int delayInMinutes = Util.getTimeDifferenceInMinutes(departureArray.get(row), delayArray.get(row));
            int severity = computeDelaySeverity(delayInMinutes);
            delaySevArray.set(row, severity);
        }
    }


    @Override
    public String getOPNVTag() {
        return OPNV_VGN.getInstance().getTag();
    }

    public final static String html_template_start = "<!DOCTYPE html>\n" +
            "<html lang=\"de\" style=\"\" class=\"svg no-touchevents nativeDateInput\">\n" +
            "  <head>\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=0\">\n" +
            "  </head>\n" +
            "  <body>\n" +
            "<table>\n";

    public final static String html_template_end = "</table></body></html>";

    public final static String vgn_response = "<!DOCTYPE html>\n" +
            "<html lang=\"de\">\n" +
            "  <head>\n" +
            "    <meta charset=\"utf-8\" />\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
            "    <title>Titel</title>\n" +
            "  </head>\n" +
            "  <body>\n" +
            "\n" +
            "  </body>\n" +
            "</html>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<!DOCTYPE html>\n" +
            "<html lang=\"de\" style=\"\" class=\"svg no-touchevents nativeDateInput\">\n" +
            "  <head>\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=0\">\n" +
            "  </head>\n" +
            "  <body>\n" +
            "<table>\n" +
            "<tbody>\n" +
            "                                                    <tr class=\"Liste\">\n" +
            "                                                        <th class=\"first sortScheduled selected\">\n" +
            "                                                            <span class=\"Icon rcOutput-sort2\"></span><span class=\"Icon rcOutput-sort-selected2\"></span>geplant</th>\n" +
            "                                                        <th class=\"second sortEstimated\">\n" +
            "                                                            <span class=\"Icon rcOutput-sort2\"></span><span class=\"Icon rcOutput-sort-selected2\"></span>aktuell</th>\n" +
            "                                                        <th>Linie&nbsp; Richtung</th>\n" +
            "                                                    </tr>\n" +
            "\n" +
            "\n" +
            "\n" +
            "                                                    <tr class=\"Liste classDeparture classBus\" data-stopname=\"Aurach Blumenauer Platz\" data-scheduled=\"2019_0323x16:38-2019_0323x16:38__001\" data-estimated=\"2019_0323x16:38-2019_0323x16:38__001\">\n" +
            "                                                        <td class=\"first\" style=\"white-space:nowrap\">\n" +
            "                                                            <span class=\"EFA-TimeDetail \">16:38</span><span class=\"delay-missing\"></span>\n" +
            "                                                        </td>\n" +
            "                                                        <td class=\"second\" style=\"white-space:nowrap\"><span class=\"EFA-TimeDetail delay-NI\">k.&nbsp;A.</span></td>\n" +
            "                                                        <td class=\"Nr last\">\n" +
            "                                                            <a class=\"EFA-Linienlink\" style=\"float:left\" href=\"/komfortauskunft/ttb/?lineName=805&amp;sessionID=0&amp;exactMatch=1\" data-title=\"Linieninformationen \"><span class=\"Mot\"><span class=\"Icon rcOutput-Bus motIcon\" title=\"Icon Regionalbus\"></span></span>805</a> <span class=\"EFA-Richtung\"><span class=\"word\">Feuchtwangen</span> <span class=\"word\">Mooswiese</span></span>\n" +
            "                                                        </td>\n" +
            "                                                    </tr><tr class=\"Liste classDeparture classBus\" data-stopname=\"Aurach Blumenauer Platz\" data-scheduled=\"2019_0323x17:18-2019_0323x17:18__002\" data-estimated=\"2019_0323x17:18-2019_0323x17:18__002\">\n" +
            "                                                        <td class=\"first\" style=\"white-space:nowrap\">\n" +
            "                                                            <span class=\"EFA-TimeDetail \">17:18</span><span class=\"delay-missing\"></span>\n" +
            "                                                        </td>\n" +
            "                                                        <td class=\"second\" style=\"white-space:nowrap\"><span class=\"EFA-TimeDetail delay-NI\">k.&nbsp;A.</span></td>\n" +
            "                                                        <td class=\"Nr last\">\n" +
            "                                                            <a class=\"EFA-Linienlink\" style=\"float:left\" href=\"/komfortauskunft/ttb/?lineName=805&amp;sessionID=0&amp;exactMatch=1\" data-title=\"Linieninformationen \"><span class=\"Mot\"><span class=\"Icon rcOutput-Bus motIcon\" title=\"Icon Regionalbus\"></span></span>805</a> <span class=\"EFA-Richtung\"><span class=\"word\">Ansbach</span></span>\n" +
            "                                                        </td>\n" +
            "                                                    </tr><tr class=\"Liste classDeparture classBus\" data-stopname=\"Aurach Blumenauer Platz\" data-scheduled=\"2019_0323x18:38-2019_0323x18:38__003\" data-estimated=\"2019_0323x18:38-2019_0323x18:38__003\">\n" +
            "                                                        <td class=\"first\" style=\"white-space:nowrap\">\n" +
            "                                                            <span class=\"EFA-TimeDetail \">18:38</span><span class=\"delay-missing\"></span>\n" +
            "                                                        </td>\n" +
            "                                                        <td class=\"second\" style=\"white-space:nowrap\"><span class=\"EFA-TimeDetail delay-NI\">k.&nbsp;A.</span></td>\n" +
            "                                                        <td class=\"Nr last\">\n" +
            "                                                            <a class=\"EFA-Linienlink\" style=\"float:left\" href=\"/komfortauskunft/ttb/?lineName=805&amp;sessionID=0&amp;exactMatch=1\" data-title=\"Linieninformationen \"><span class=\"Mot\"><span class=\"Icon rcOutput-Bus motIcon\" title=\"Icon Regionalbus\"></span></span>805</a> <span class=\"EFA-Richtung\"><span class=\"word\">Feuchtwangen</span> <span class=\"word\">Mooswiese</span></span>\n" +
            "                                                        </td>\n" +
            "                                                    </tr></tbody></table>\n" +
            "\n" +
            "  </body>\n" +
            "</html>\n";

    public static String rowExample = "<tr class=\"Liste classDeparture classU_Bahn\" data-stopname=\"Nürnberg Friedrich-Ebert-Pl.\" data-scheduled=\"2019_0323x23:13-2019_0323x23:13__001\" data-estimated=\"2019_0323x23:13-2019_0323x23:13__001\">\n" +
            "   <td class=\"first\" style=\"white-space:nowrap\">\n" +
            "      <span class=\"EFA-TimeDetail EFA-RBL\">23:13</span>\n" +
            "      <div class=\"delay2018\"><span class=\"delay-none\">+0</span></div>\n" +
            "   </td>\n" +
            "   <td class=\"second\" style=\"white-space:nowrap\"><span class=\"EFA-TimeDetail delay-none\">23:13</span></td>\n" +
            "   <td class=\"Nr last\">\n" +
            "      <a class=\"EFA-Linienlink\" style=\"float:left\" href=\"/komfortauskunft/ttb/?lineName=U3&amp;sessionID=0&amp;exactMatch=1\" data-title=\"Linieninformationen \"><span class=\"Mot\"><span class=\"Icon rcOutput-U_Bahn motIcon\" title=\"Icon U-Bahn\"></span></span>U3</a> <span class=\"EFA-Richtung\"><span class=\"word\">Nordwestring</span></span>\n" +
            "   </td>\n" +
            "</tr>";
}
