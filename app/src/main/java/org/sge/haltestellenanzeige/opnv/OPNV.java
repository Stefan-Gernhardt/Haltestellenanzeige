package org.sge.haltestellenanzeige.opnv;

import android.content.Context;

import org.sge.haltestellenanzeige.net.ResponseContainer;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList;
import org.sge.haltestellenanzeige.settings.RegPageSettings;
import org.sge.haltestellenanzeige.stop.StopI;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.ui.ChangeStopActivity;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;
import org.sge.haltestellenanzeige.util.SgeCompare;
import org.sge.haltestellenanzeige.stop.StopDistance;
import org.sge.haltestellenanzeige.widget.WidgetManager;

import java.util.Map;

/**
 * Created by peter on 06.02.2018.
 */

public abstract class OPNV {
    public final static OPNV PRIMARY_OPNV = OPNV_BahnDB.getInstance();

    public static final double SIMILARITY_GRADE_STOP_NAMES = 70.0;
    public static final double SIMILARITY_COORDS = 0.003;
    public static final double SIMILARITY_COORDS_REGIO = 1.740284;

    public abstract String getTag();
    public abstract String getUrl(String station);
    public abstract Parser getParserResult(String response);
    public abstract String getSuggestionUrl(String searchString);
    public abstract Stop getStopSynchron(Stop stop, Context appContext);
    public abstract Stop getStopFromSecondaryOPNV(String response, Stop stop);
    public abstract ParserSuggestionList newParserSuggestionList();
    public abstract Parser newParser();
    public abstract boolean isRegioCoord();

    public abstract void createSuggestionRequest(final Context context, boolean asynchron, boolean secondary, String url, String searchString, String requestTag, final ChangeStopActivity changeStopActivity, final RegPageSettings regPageSettings, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId);
    public abstract ResponseContainer createDepartureRequestSynchron(final Context context, final OPNV opnv, final String stationNameForUrl, final String requestTag, final Stop stop);
    public abstract void createDepartureRequestAsynchron(final Context context, final OPNV opnvJsonRequest, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId, final String requestTag, final Stop stop);
    abstract public Map<String,String> getRequestMapPayloadForDeparture(String stationId, String stationName);


    public static StopDistance stopMeetsTheSimilarityCriteria(StopI stop1, StopI stop2) {
        final boolean printOut = false;

        // comparing names
        if(printOut) System.out.println("Name1: " + stop1.getName() + "  Name2: " + stop2.getName()); //NON-NLS

        boolean nameSimilarityMeet = SgeCompare.StringCompare(stop1.getName(), stop2.getName()) >= SIMILARITY_GRADE_STOP_NAMES;
        if(printOut) System.out.println("FuzzySearch.StringCompare: " + SgeCompare.StringCompare(stop1.getName(), stop2.getName())); //NON-NLS


        // comparing coords
        boolean regioCoordComparison = false;
        if(stop1.getOPNV() != null) {
            if(stop1.getOPNV().isRegioCoord()) regioCoordComparison = true;
        }
        if(stop2.getOPNV() != null) {
            if(stop2.getOPNV().isRegioCoord()) {
                if(regioCoordComparison) regioCoordComparison = false;
                else regioCoordComparison = true;
            }
        }

        double similarityBorderCoords = SIMILARITY_COORDS;
        if(regioCoordComparison) similarityBorderCoords = SIMILARITY_COORDS_REGIO;
        else similarityBorderCoords = SIMILARITY_COORDS;

        boolean geoNearnessMeet = StopDistance.distanceDeviation(stop1.getXCoord(), stop1.getYCoord(), stop2.getXCoord(), stop2.getYCoord()) <= similarityBorderCoords;
        if(printOut) System.out.println("stop1x: " + stop1.getXCoord() + "  stop1y: " + stop1.getYCoord() + "  stop2x: " + stop2.getXCoord() + "  stop2y: " +  stop2.getYCoord()); //NON-NLS
        if(printOut) System.out.println("distanceDeviation: " + StopDistance.distanceDeviation(stop1.getXCoord(), stop1.getYCoord(), stop2.getXCoord(), stop2.getYCoord())); //NON-NLS

        StopDistance stopDistance = new StopDistance();
        stopDistance.isMatch = nameSimilarityMeet && geoNearnessMeet;
        stopDistance.nameDistance = SgeCompare.StringCompare(stop1.getName(), stop2.getName());
        stopDistance.coordDistance = StopDistance.distanceDeviation(stop1.getXCoord(), stop1.getYCoord(), stop2.getXCoord(), stop2.getYCoord());

        return stopDistance;
    }

}
