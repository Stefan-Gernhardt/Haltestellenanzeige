package org.sge.haltestellenanzeige.opnv.opnvs;

import android.content.Context;

import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.opnv.OPNVimpl;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserKVV;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_KVV;
import org.sge.haltestellenanzeige.stop.Stop;

public class OPNV_KVV extends OPNVStringRequest {
    private static OPNV_KVV instance=null;

    private OPNV_KVV() {};


    public static OPNV_KVV getInstance() {
        if(instance == null) {
            instance = new OPNV_KVV();
        }
        return instance;
    };


    @Override
    public String getTag() {
        return "KVV"; //NON-NLS
    }


    @Override
    public String getUrl(String station) {
        // https://www.kvv.de/tunnelEfaDirect.php?action=XSLT_DM_REQUEST&std3_mapDMMacro=true&language=de&name_dm=7000525&type_dm=stopID&itdLPxx_template=tooltip&useRealtime=1
        return "https://www.kvv.de/tunnelEfaDirect.php?action=XSLT_DM_REQUEST&itdLPxx_timeFormat=23&language=de&useAllStops=1&name_dm=" + station + "&type_dm=any&itdDateTimeDepArr=dep&useRealtime=1&deleteAssignedStops=1&mode=direct&line=all";
    }


    @Override
    public String getSuggestionUrl(String searchString) {
        // https://www.kvv.de/tunnelEfaDirect.php?action=XSLT_STOPFINDER_REQUEST&coordOutputFormat=WGS84%5Bdd.ddddd%5D&language=de&outputFormat=JSON&snapDistance_sf=500&std3_suggestMacro=std3_suggest&type_sf=any&name_sf=7000525
        return "https://www.kvv.de/tunnelEfaDirect.php?action=XSLT_STOPFINDER_REQUEST&coordOutputFormat=WGS84%5Bdd.ddddd%5D&language=de&outputFormat=JSON&snapDistance_sf=500&std3_suggestMacro=std3_suggest&type_sf=any&name_sf=" + searchString;
    }


    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_KVV();
    }


    @Override
    public Parser newParser() {
        return new ParserKVV();
    }
}
