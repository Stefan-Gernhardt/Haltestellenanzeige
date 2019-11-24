package org.sge.haltestellenanzeige.opnv.opnvs;

import android.content.Context;

import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_DB_SVV;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserDB;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

/**
 * Created by peter on 07.02.2018.
 */

public class OPNV_BahnDB extends OPNVStringRequest {
    private static OPNV_BahnDB instance=null;

    private OPNV_BahnDB() {};

    public static OPNV_BahnDB getInstance() {
        if(instance == null) {
            instance = new OPNV_BahnDB();
        }
        return instance;
    };


    @Override
    public String getTag() {
        return "DB"; //NON-NLS
    }


    @Override
        public String getUrl(String station) {
        // https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=Hauptwache,+Frankfurt+a.M.&boardType=dep&time=actual&productsFilter=111111111&start=yes
        // https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=Tivoli%20(RNZ),%20Viernheim&boardType=dep&time=now&productsFilter=1111111111&start=yes&maxJourneys=3

        String baseUrl = "https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox"; //NON-NLS
        String paraL = "ld=15046"; //NON-NLS
        String paraCountry = "country=DEU"; //NON-NLS
        String paraProtocol = "protocol=https:&rt=1"; //NON-NLS
        String paraStation = "input=" + Util.stringParameter2UrlParameter(station);  // for example "input=Hauptwache,+Frankfurt+a.M.", "input=Frankfurt(Main)Hbf", "input=Tivoli%20(RNZ),%20Viernheim" //NON-NLS
        String paraBoardType = "boardType=dep"; //NON-NLS
        String paraTime = "time=now"; //NON-NLS
        String paraProductFilter = "productsFilter=1111111111"; //NON-NLS
        String maxJourneys = "maxJourneys=" + UI_StationDisplay.NUMBER_ROWS; //NON-NLS
        String start = "start=yes"; //NON-NLS
        String selectDate = "selectDate=today"; //NON-NLS
        String country = "country=DEU"; //NON-NLS

        String returnUrl = baseUrl + "?" + paraL + "&" + paraCountry + "&" + paraProtocol + "&" + paraStation + "&" + paraBoardType + "&" + paraTime + "&" + start + "&" + maxJourneys; //NON-NLS
        // System.out.println("getAuskunftUrl: " + returnUrl);
        return returnUrl;
    }


    @Override
    public Parser getParserResult(String response) {
        return new ParserDB(response);
    }


    @Override
    public String getSuggestionUrl(String searchString) {
        System.out.println("OPNV_BahnDB.getSuggestionUrl() searchString: <" + searchString + ">");
        // https://reiseauskunft.bahn.de/bin/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G=Ramstein?&js=true
        // https://reiseauskunft.bahn.de/bin/ajax-getstop.exe/dn?S=Uhlhorn
        // REQ0JourneyStopsB: limit amount of stops, that returns
        // REQ0JourneyStopsS0A: kind of stops: bit 1 = station, bit 2 = Adress, bit 3 = POI, bit 4 = unknown
        final String predictionUrl_1 = "https://reiseauskunft.bahn.de/bin/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G="; //NON-NLS
        final String predictionUrl_2 = "?&js=true"; //NON-NLS

        return predictionUrl_1 + Util.stringParameter2UrlParameter(searchString) + predictionUrl_2;
    }


    @Override
    public Stop getStopSynchron(Stop dbStop, Context appContext) {
        return dbStop;
    }


    @Override
    public Stop getStopFromSecondaryOPNV(String Response, Stop dbStop) {
        return dbStop;
    }

    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_DB_SVV();
    }

    @Override
    public Parser newParser() {
        return new ParserDB();
    }

}
