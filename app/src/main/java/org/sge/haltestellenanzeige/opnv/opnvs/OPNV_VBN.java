package org.sge.haltestellenanzeige.opnv.opnvs;

import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.opnv.OPNVimpl;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVBN;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VBN;

public class OPNV_VBN extends OPNVStringRequest {
    private static OPNV_VBN instance=null;

    private OPNV_VBN() {};


    public static OPNV_VBN getInstance() {
        if(instance == null) {
            instance = new OPNV_VBN();
        }
        return instance;
    };


    @Override
    public String getTag() {
        return "VBN";
    }

    @Override
    public String getUrl(String station) {
        // https://fahrplaner.vbn.de/hafas/stboard.exe/dny?L=vs_liveticker&protocol=https:&tpl=liveticker2json&&input=008096108&boardType=dep&time=now&productsFilter=1111111111111111&additionalTime=0&ignoreMasts=yes&maxJourneys=50&start=yes&selectDate=today&monitor=1&outputMode=tickerDataOnly
        return "https://fahrplaner.vbn.de/hafas/stboard.exe/dny?L=vs_liveticker&protocol=https:&tpl=liveticker2json&&input=" + station + "&boardType=dep&time=now&productsFilter=1111111111111111&additionalTime=0&ignoreMasts=yes&maxJourneys=50&start=yes&selectDate=today&monitor=1&outputMode=tickerDataOnly";
    }

    @Override
    public String getSuggestionUrl(String searchString) {
        // https://fahrplaner.vbn.de/hafas/ajax-getstop.exe/dny?/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&REQ0JourneyStopsB=12&S=Uhlhorn?&js=true&getring=1
        return "https://fahrplaner.vbn.de/hafas/ajax-getstop.exe/dny?/dny?start=1&tpl=suggest2json&REQ0JourneyStopsS0A=1&REQ0JourneyStopsB=12&S=" + searchString + "?&js=true&getring=1";
    }

    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_VBN();
    }

    @Override
    public Parser newParser() {
        return new ParserVBN();
    }
}
