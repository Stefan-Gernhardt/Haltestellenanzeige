package org.sge.haltestellenanzeige.opnv;

import android.content.Context;

import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.stop.StopDistance;

import java.util.HashMap;
import java.util.Map;

public abstract class OPNVimpl extends OPNV {

    @Override
    public boolean isRegioCoord() {
        return false;
    }


    @Override
    public Map<String,String> getRequestMapPayloadForDeparture(String stationId, String stationName) {
        return new HashMap<String, String>();
    }


    @Override
    public Parser getParserResult(String response) {
        Parser parser = this.newParser();
        parser.parse(response);
        return parser;
    }


    @Override
    public Stop getStopSynchron(Stop stopDB, Context appContext) {
        String response = BahnRequest.createSuggestionRequestSynchron(appContext, this, stopDB.getName());
        return getStopFromSecondaryOPNV(response, stopDB);    }


    @Override
    public Stop getStopFromSecondaryOPNV(String response, Stop stopDB) {
        ParserSuggestionList parserSuggestionList = this.newParserSuggestionList();
        parserSuggestionList.parseSuggestionListResponse(this, response);

        if(parserSuggestionList.getList().size() == 0) {
            System.out.println("  Warning: suggestionList list empty!"); //NON-NLS
        }


        Stop topStop = null;
        StopDistance topStopDistance = null;
        for(int i=0; i<parserSuggestionList.getList().size(); i++) {
            Stop stop = parserSuggestionList.getList().get(i);

            // System.out.println("  getStopFromSecondaryOPNV() stop: " + stop.getName() + "  opnv.tag: " + stop.getOPNV().getTag() + "  x: " + stop.getXCoord() + "  y: " + stop.getYCoord()); //NON-NLS

            StopDistance stopDistance = stopMeetsTheSimilarityCriteria(stopDB, stop);
            if(stopDistance.isMatch) {
                // System.out.println("  getStopFromSecondaryOPNV() stop meets the similarity criteria: " + stop.getName() + "  " + stop.getOPNV().getTag() + "  url: " + stop.getUrl()); //NON-NLS
                if(topStop == null) {
                    topStop = stop;
                    topStopDistance = stopDistance;
                }
                else {
                    if(StopDistance.isBetter(stopDistance, topStopDistance)) {
                        topStop = stop;
                        topStopDistance = stopDistance;
                    }
                }
            }
        }

        if(topStop==null) {
            System.out.println("  getStopFromSecondaryOPNV(): OPNV " +  this.getTag() + " doesn't has the stop for criteria: " + stopDB.getName() + "  x: " + stopDB.getXCoord() + " y: " + stopDB.getYCoord()); //NON-NLS
        }
        else {
            System.out.println("  getStopFromSecondaryOPNV(): OPNV " +  this.getTag() + " has the stop for criteria: " + stopDB.getName() + "  x: " + stopDB.getXCoord() + " y: " + stopDB.getYCoord() + " stopName: " +  topStop.getName() + "  x: " + topStop.getXCoord() + " y: " + topStop.getYCoord() ); //NON-NLS
        }
        return topStop;
    }


}
