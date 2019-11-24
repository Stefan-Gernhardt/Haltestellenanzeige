package org.sge.haltestellenanzeige.opnv.opnvs;

import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVGN;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VGN;

public class OPNV_VGN extends OPNVStringRequest {
    public final static double xcoord = 11.081717;
    public final static double ycoord = 49.445525;
    public final static double regioDistance  = 1.5;


    /*
    public final static double xcoord_VGN = 4433548.32565;
    public final static double ycoord_VGN = 681026.78559;

    public final static double xcoord_BAM = 10.8986251771901;
    public final static double ycoord_BAM = 49.9001695519942;

    public final static double xcoord_BAM_VGN = 4421013.02226;
    public final static double ycoord_BAM_VGN = 630157.04642;
    */


    private static OPNV_VGN instance=null;

    public static OPNV_VGN getInstance() {
        if(instance == null) {
            instance = new OPNV_VGN();
        }
        return instance;
    }

    @Override
    public String getTag() {
        return "VGN";
    }

    @Override
    public boolean isRegioCoord() { return true; };

    @Override
    public String getUrl(String station_id) {
        return "https://www.vgn.de/abfahrten/?dm=" + station_id;
    }

    @Override
    public String getSuggestionUrl(String searchString) {
        return "https://www.vgn.de/ib/site/tools/DEFAS_Suggest.php?query=" + searchString;
    }

    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_VGN();
    }

    @Override
    public Parser newParser() {
        return new ParserVGN();
    }
}
