package org.sge.haltestellenanzeige.opnv.opnvs;

import android.content.Context;

import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_DB_SVV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserSVV;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

/**
 * Created by Admin on 17.02.2018.
 */

public class OPNV_SaarSVV extends OPNVStringRequest {
    private static OPNV_SaarSVV instance=null;


    private OPNV_SaarSVV() {};


    public static OPNV_SaarSVV getInstance() {
        if(instance == null) {
            instance = new OPNV_SaarSVV();
        }
        return instance;
    };

    @Override
    public String getTag() {
        return "SVV"; //NON-NLS
    }

    public String getUrl(String extId) {
        // http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&input=Ludwigstr.+Malstatt,+Saarbrücken&boardType=dep&time=now&selectDate=today&maxJourneys=5&start=yes
        // http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&M=d&dpm=0&dw=128&dh=128&input=000010201&boardType=dep&time=16:39&productsFilter=&date=16.02.18&maxJourneys=5&start=yes // Ludwigstr., Saarbrücken Malstatt
        // http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&M=d&dpm=0&dw=128&dh=128&input=15537&boardType=dep&time=16:39&productsFilter=&date=16.02.18&maxJourneys=5&start=yes // Markt, Heusweiler
        // http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&M=d&dpm=0&dw=128&dh=128&input=008000323&boardType=dep&time=16:39&productsFilter=&date=16.02.18&maxJourneys=5&start=yes // Saarbrücken HBF

        // Heusweiler mit Verspätung und Gleis
        // http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&M=d&dpm=0&dw=128&dh=128&input=15537&boardType=dep&time=now&selectDate=today&maxJourneys=5&start=yes

        // SB mit Verspätung und Gleis
        // http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&M=d&dpm=0&dw=128&dh=128&input=008000323&boardType=dep&time=now&selectDate=today&maxJourneys=50&start=yes

        // 000010201 entspricht Ludwigstr. Malstatt, Saarbrücken

        return "http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&M=d&dpm=0&dw=128&dh=128&input=" + extId + "&boardType=dep&time=now&selectDate=today&maxJourneys=" + UI_StationDisplay.NUMBER_ROWS + "&start=yes"; //NON-NLS
    }


    @Override
    public Parser getParserResult(String response) {
        return new ParserSVV(response);
    }


    @Override
    public String getSuggestionUrl(String searchString) {
        // final String predictionUrl_1 = "http://www.saarfahrplan.de/cgi-bin/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G=";
        // "http://www.saarfahrplan.de/cgi-bin/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G=heus?&js=true&";
        // REQ0JourneyStopsB: limit amount of stops, that returns
        // REQ0JourneyStopsS0A: kind of stops: bit 1 = station, bit 2 = Adress, bit 3 = POI, bit 4 = unknown
        final String predictionUrl_1 = "http://www.saarfahrplan.de/cgi-bin/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G="; //NON-NLS
        final String predictionUrl_2 = "?&js=true"; //NON-NLS

        return predictionUrl_1 + Util.stringParameter2UrlParameter(searchString) + predictionUrl_2;
    }


    @Override
    public Stop getStopSynchron(Stop stopDB, Context appContext) {
        String response = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_SaarSVV.getInstance(), stopDB.getName());
        return getStopFromSecondaryOPNV(response, stopDB);
    }


    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_DB_SVV();
    }


    @Override
    public Parser newParser() {
        return new ParserSVV();
    }



}
