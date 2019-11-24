package org.sge.haltestellenanzeige.opnv.opnvs;

import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserMVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_MVV;

public class OPNV_MVV  extends OPNVStringRequest {
    private static OPNV_MVV instance=null;

    private OPNV_MVV() {};

    public static OPNV_MVV getInstance() {
        if(instance == null) {
            instance = new OPNV_MVV();
        }
        return instance;
    };


    @Override
    public String getTag() {
        return "MVV";
    }

    @Override
    public String getUrl(String station) {
        // https://efa.mvv-muenchen.de/xhr_departures?locationServerActive=1&stateless=1&type_dm=stop&name_dm=91000002&useAllStops=1&useRealtime=1&limit=50&mode=direct&zope_command=enquiry%3Adepartures&coordOutputFormat=EPSG:4326
        return "https://efa.mvv-muenchen.de/xhr_departures?locationServerActive=1&stateless=1&type_dm=stop&name_dm=" + station + "&useAllStops=1&useRealtime=1&limit=50&mode=direct&zope_command=enquiry%3Adepartures&coordOutputFormat=EPSG:4326";
    }

    @Override
    public String getSuggestionUrl(String searchString) {
        // https://efa.mvv-muenchen.de/ng/XML_STOPFINDER_REQUEST?macro_sf=mvv&type_sf=stop&name_sf=marienplat&coordOutputFormat=EPSG:4326
        return "https://efa.mvv-muenchen.de/ng/XML_STOPFINDER_REQUEST?macro_sf=mvv&type_sf=stop&name_sf=" + searchString + "&coordOutputFormat=EPSG:4326";
    }

    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_MVV();
    }

    @Override
    public Parser newParser() {
        return new ParserMVV();
    }
}
