package org.sge.haltestellenanzeige.opnv.opnvs;

import android.content.Context;

import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVStringRequest;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_VRN;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserStationBoard.ParserVRN;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

/**
 * Created by Admin on 18.02.2018.
 */

public class OPNV_VRN extends OPNVStringRequest {
    private static OPNV_VRN instance=null;


    private OPNV_VRN() {};


    public static OPNV_VRN getInstance() {
        if(instance == null) {
            instance = new OPNV_VRN();
        }
        return instance;
    };

    @Override
    public String getTag() {
        return "VRN"; //NON-NLS
    }

    @Override
    public String getUrl(String id) {
        // Viernheim Tivoli name_dm=de:06431:3865
        // Mannheim, Hauptbahnhof name_dm=de:08222:2417
        // eg: https://www.vrn.de/mngvrn/XML_DM_REQUEST?coordOutputFormat=EPSG:4326&depType=stopEvents&includeCompleteStopSeq=0&limit=30&locationServerActive=1&mode=direct&name_dm=de:06431:3865&outputFormat=json&type_dm=any&useOnlyStops=1&useRealtime=1
        return "https://www.vrn.de/mngvrn/XML_DM_REQUEST?coordOutputFormat=EPSG:4326&depType=stopEvents&includeCompleteStopSeq=0&limit=" + UI_StationDisplay.NUMBER_ROWS + "&locationServerActive=1&mode=direct&name_dm=" + id + "&outputFormat=json&type_dm=any&useOnlyStops=1&useRealtime=1"; //NON-NLS
    }


    @Override
    public Parser getParserResult(String jsonString) {
        return new ParserVRN(jsonString);
    }


    @Override
    public String getSuggestionUrl(String searchString) {
        // https://www.vrn.de/mngvrn/XML_STOPFINDER_REQUEST?anyObjFilter_sf=0&coordOutputFormat=EPSG:4326&locationServerActive=1&name_sf=tivoli&outputFormat=json&type_sf=any&vrnsuggestMacro=vrn_suggest&w_regPrefAl=5
        // https://www.vrn.de/mngvrn/XML_STOPFINDER_REQUEST?anyObjFilter_sf=0&coordOutputFormat=EPSG:4326&locationServerActive=1&name_sf=tivoli&outputFormat=json&type_sf=any&vrnsuggestMacro=vrn_suggest&w_regPrefAl=5

        return "https://www.vrn.de/mngvrn/XML_STOPFINDER_REQUEST?anyObjFilter_sf=0&coordOutputFormat=EPSG:4326&locationServerActive=1&name_sf=" + Util.stringParameter2UrlParameter(searchString) + "&outputFormat=json&type_sf=any&vrnsuggestMacro=vrn_suggest&w_regPrefAl=5"; //NON-NLS
    }


    @Override
    public Stop getStopSynchron(Stop dbStop, Context appContext) {
        String response = BahnRequest.createSuggestionRequestSynchron(appContext, OPNV_VRN.getInstance(), dbStop.getName());
        return getStopFromSecondaryOPNV(response, dbStop);
    }


    @Override
    public ParserSuggestionList newParserSuggestionList() {
        return new ParserSuggestionList_VRN();
    }


    @Override
    public Parser newParser() {
        return new ParserVRN();
    }


}
