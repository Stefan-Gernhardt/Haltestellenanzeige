package org.sge.haltestellenanzeige.opnv.opnvs;

import android.content.Context;

import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserRMV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_DB_SVV;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.util.Util;

public class OPNV_RMV extends OPNVStringRequest {
    private static OPNV_RMV instance=null;


    private OPNV_RMV() {};


    public static OPNV_RMV getInstance() {
        if(instance == null) {
            instance = new OPNV_RMV();
        }
        return instance;
    };


    @Override
    public String getTag() {
        return "RMV"; //NON-NLS
    }


    @Override
    public String getUrl(String station) {
        // https://www.rmv.de/auskunft/bin/jp/stboard.exe/dox?&protocol=https:&seqnr=4&input=3000019&boardType=dep&time=now&view=STATIONINFO&maxJourneys=50&start=1&outputMode=stationInfoBoardOnly&boardType=arr&REQProduct_mask=
        return "https://www.rmv.de/auskunft/bin/jp/stboard.exe/dn?&protocol=https:&seqnr=4&input=" + station + "&boardType=dep&time=now&view=STATIONINFO&maxJourneys=50&start=1&outputMode=stationInfoBoardOnly&boardType=arr&REQProduct_mask=";
    }


    @Override
    public Parser getParserResult(String response) {
        return new ParserRMV(response);
    }


    @Override
    public String getSuggestionUrl(String searchString) {
        // https://www.rmv.de/auskunft/bin/jp/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G=speyerer?&js=true

        // REQ0JourneyStopsB: limit amount of stops, that returns
        // REQ0JourneyStopsS0A: kind of stops: bit 1 = station, bit 2 = Adress, bit 3 = POI, bit 4 = unknown
        final String predictionUrl_1 = "https://www.rmv.de/auskunft/bin/jp/ajax-getstop.exe/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&getstop=1&noSession=yes&REQ0JourneyStopsB=50&REQ0JourneyStopsS0G="; //NON-NLS
        final String predictionUrl_2 = "?&js=true"; //NON-NLS

        return predictionUrl_1 + Util.stringParameter2UrlParameter(searchString) + predictionUrl_2;
    }

    @Override
    public Stop getStopSynchron(Stop stopDB, Context appContext) {
        String response = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_RMV.getInstance(), stopDB.getName());
        return getStopFromSecondaryOPNV(response, stopDB);
    }


    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_DB_SVV();
    }


    @Override
    public Parser newParser() {
        return new ParserRMV();
    }


}
