package org.sge.haltestellenanzeige.settings;

import android.content.Context;

import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVManager;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;
import org.sge.haltestellenanzeige.util.Util;
import org.sge.haltestellenanzeige.widget.WidgetManager;

import java.util.HashMap;

public class RegPageSettings {
    private String stationNameDB  = "";
    private String extStationIdDB = "";
    private double xCoordDB = 0;
    private double yCoordDB = 0;
    private double delayRate = 0;
    private double qmRate = 0;

    private HashMap<String, Stop> opnvStopMap = new HashMap<String, Stop>();
    private static HashMap<String, Integer> statusStopOPNVMap = new HashMap<String, Integer>();
    private HashMap<String, Double> rateDelayInformationMap = new HashMap<String, Double>();
    private HashMap<String, Double> rateOfQuestionMarks = new HashMap<String, Double>();
    public final static int STATUS_STOP_OPNV_INITIAL            = 0;
    public final static int STATUS_STOP_OPNV_WAITING_FOR_ANSWER = 1;
    public final static int STATUS_STOP_OPNV_ANSWER_RECEIVED    = 2;
    public final static int STATUS_STOP_OPNV_HASNT_STOP         = 3;
    public final static int STATUS_STOP_OPNV_HAS_STOP           = 4;

    private int pageNumber = 0;


    public RegPageSettings(int pageNumber) {
        this.pageNumber = pageNumber;
        init();
    }


    public void init() {
        System.out.println("RegPageSettings::init()");
        for(OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
            // System.out.println("tag: " + opnv.getTag() + "  Status: " + STATUS_STOP_OPNV_INITIAL);
            opnvStopMap.put(opnv.getTag(), null);
            statusStopOPNVMap.put(opnv.getTag(), STATUS_STOP_OPNV_INITIAL);
            rateDelayInformationMap.put(opnv.getTag(), 0.0);
            rateOfQuestionMarks.put(opnv.getTag(), 1.1);
        }
    }


    public String getStationNameDB() {
        return stationNameDB;
    }


    public String getStationName() { return getStationNameDB(); }
    public double getXCoordDB() { return xCoordDB; }
    public double getYCoordDB() { return yCoordDB; }
    public void setXCoordDB(double x) { xCoordDB=x; }
    public void setYCoordDB(double y) { yCoordDB=y; }
    public double getDelayRate() { return delayRate; }
    public double getQmRate() { return qmRate; }
    public void setDelayRate(double x) { delayRate=x; }
    public void setQmRate(double y) { qmRate=y; }


    public void setStationNameDB(String stationNameDB) {
        System.out.println("RegPageSettings::setStationNameDB() stationNameDB: <" + stationNameDB + ">" + " regno: " + this.pageNumber); //NON-NLS
        this.stationNameDB = stationNameDB;
        statusStopOPNVMap.clear();
        init();
    }


    public String getExtStationIdDB() { return this.extStationIdDB; }
    public void setExtStationIdDB(String station) {
        this.extStationIdDB = station;
    }


    public boolean isStatusForStopFromOPNVInitial(OPNV opnv) {
        if(opnv == null) return true;

        String tag = opnv.getTag();
        if(tag == null) return true;

        Integer status = statusStopOPNVMap.get(tag);

        if(status == null) return true;

        return status.intValue() == STATUS_STOP_OPNV_INITIAL;
    }


    public boolean isStatusForStopFromOPNVWaitingForResponse(OPNV opnv) {
        if(opnv == null) return true;

        String tag = opnv.getTag();
        if(tag == null) return true;

        Integer status = statusStopOPNVMap.get(tag);

        if(status == null) return true;

        return status.intValue() == STATUS_STOP_OPNV_WAITING_FOR_ANSWER;
    }


    public boolean isStatusHasStop(OPNV opnv) {
        System.out.print("isStatusHasStop: " + this.stationNameDB + " " + opnv.getTag() + " regno: " + this.pageNumber); //NON-NLS
        if(opnv == null) return false;

        String tag = opnv.getTag();
        if(tag == null) return false;

        Integer status = statusStopOPNVMap.get(tag);

        if(status == null) return false;

        System.out.println(" status (0=init, 1,2= wait, 3=no,4=has station): " + status.intValue()); //NON-NLS
        return status.intValue() == STATUS_STOP_OPNV_HAS_STOP;
    }


    public int getStatusForStopFromOPNV(OPNV opnv) {
        if(opnv == null) return STATUS_STOP_OPNV_INITIAL;

        String tag = opnv.getTag();
        if(tag == null) return STATUS_STOP_OPNV_INITIAL;

        Integer status = statusStopOPNVMap.get(tag);

        if(status == null) return STATUS_STOP_OPNV_INITIAL;

        return status.intValue();
    }


    public void setStatusForStopFromOPNV(OPNV opnv, int status) {
        if(opnv == null) return;
        statusStopOPNVMap.put(opnv.getTag(), status);
    }


    public Stop getStopFromOPNV(OPNV opnv) {
        if(opnv == null) return null;

        String tag = opnv.getTag();
        if(tag == null) return null;

        Stop stop = opnvStopMap.get(tag);
        return stop;
    }


    public void setStopFromOPNV(OPNV opnv, Stop stop) {
        if(opnv == null) return;

        String tag = opnv.getTag();
        if(tag == null) return;

        opnvStopMap.put(opnv.getTag(), stop);
    }


    public double getDelayRate(OPNV opnv) {
        if(opnv == null) return 0;

        String tag = opnv.getTag();
        if(tag == null) return 0;

        Double  delayRate = rateDelayInformationMap.get(tag);
        return delayRate.doubleValue();
    }


    public double getQuestionMarkRate(OPNV opnv) {
        if(opnv == null) return 0;

        String tag = opnv.getTag();
        if(tag == null) return 0;

        Double  questionMarkRate = rateOfQuestionMarks.get(tag);
        return questionMarkRate.doubleValue();
    }


    public void setDelayRate(OPNV opnv, double rate) {
        rateDelayInformationMap.put(opnv.getTag(), rate);
    }


    public void setQuestionMarkRate(OPNV opnv, double rate) {
        rateOfQuestionMarks.put(opnv.getTag(), rate);
    }


    public void setStatusToWaitingForAnswer(OPNV opnv) {
        statusStopOPNVMap.put(opnv.getTag(), STATUS_STOP_OPNV_WAITING_FOR_ANSWER);
    }


    public void receiveSuggestionList(Context context, DisplayTimerActivity displayActivity, WidgetManager widgetManager, int widgetId, String response, OPNV opnv) {
        System.out.println("  receiveSuggestionList: " + opnv.getTag() + " regno: " + this.pageNumber); //NON-NLS
        System.out.println("  response string (part): " + Util.printPart(response, Util.MESSAGE_LENGTH)); //NON-NLS

        statusStopOPNVMap.put(opnv.getTag(), STATUS_STOP_OPNV_ANSWER_RECEIVED);

        Stop stop = null;
        try {
            Stop findStopSimilarToMe = getStopPrimaryOPNV();
            stop = opnv.getStopFromSecondaryOPNV(response, findStopSimilarToMe);
            opnvStopMap.put(opnv.getTag(), stop);
        }
        catch (Exception e) {
            System.out.println("parser exception in receiveSuggestionList"); //NON-NLS
            System.out.println("stack trace"); //NON-NLS
            e.printStackTrace();

            if(opnv != null) System.out.println("opnv: " + opnv.getTag()); //NON-NLS
            System.out.println("receiveSuggestionList exception response: " + response); //NON-NLS
            System.out.println("stop: " + stop); //NON-NLS
            if(stop != null) System.out.println("stop url: " + stop.getUrl()); //NON-NLS
        }


        if(stop == null) {
            statusStopOPNVMap.put(opnv.getTag(), STATUS_STOP_OPNV_HASNT_STOP);
        }
        else {
            statusStopOPNVMap.put(opnv.getTag(), STATUS_STOP_OPNV_HAS_STOP);
            System.out.println("provider " + opnv.getTag() + " has stop " + stop.getName() + " regno: " + this.pageNumber) ; //NON-NLS

            BahnRequest.createBahnRequestAsynchronWithTagSingleOPNV(context, displayActivity, widgetManager, widgetId, this, opnv);
        }
    }


    public boolean receiveRatings(Context context, Parser parser, OPNV opnv) {
        System.out.println("receiveRatings(): " + opnv.getTag() + " regno: " + this.pageNumber); //NON-NLS
        boolean isProviderOPNVBestChoice = false;

        if(opnv == null) return isProviderOPNVBestChoice;

        if(parser == null) return isProviderOPNVBestChoice;

        if(opnv == null) {
            return isProviderOPNVBestChoice;
        }
        else {
            if (OPNV.PRIMARY_OPNV.getTag().contentEquals(opnv.getTag())) {
                setDelayRate(parser.getDelayRate());
                setQmRate(parser.getQMRate());
                Settings.getInstance().saveSettings(context);
            }
        }


        System.out.println("receiveRatings() opnv ratings: " + opnv.getTag() + "  dr: " + parser.getDelayRate() + "  qmr: " + parser.getQMRate() + " regno: " + this.pageNumber);
        setDelayRate(opnv, parser.getDelayRate());
        setQuestionMarkRate(opnv, parser.getQMRate());

        OPNV bestOPNVAfterUpdatingStatistics = getBestOPNVForThisStationDelayRateQMRate(opnv);

        if(bestOPNVAfterUpdatingStatistics == null) {
            System.out.println("opnv " + opnv.getTag() + " is best choice" + " regno: " + this.pageNumber); //NON-NLS
            isProviderOPNVBestChoice = true;
            return isProviderOPNVBestChoice;
        }

        if(bestOPNVAfterUpdatingStatistics.getTag().contentEquals(opnv.getTag())) {
            System.out.println("opnv " + opnv.getTag() + " is best choice" + " regno: " + this.pageNumber); //NON-NLS
            isProviderOPNVBestChoice = true;
        }
        else {
            System.out.println("opnv " + opnv.getTag() + " is not best choice" + " regno: " + this.pageNumber); //NON-NLS
            isProviderOPNVBestChoice = false;
        }

        return isProviderOPNVBestChoice;
    }


    private int getNumberOfSecondaryOPNVForThisStation() {
        int number = 0;
        for(OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
            if(isStatusHasStop(opnv)) {
                Stop stop = opnvStopMap.get(opnv.getTag());
                // System.out.println(" number: " + (number+1) + "  opnv tag: " + opnv.getTag() + "   name: " + stop.getName() + "   url-para: " + stop.getUrl() + " delay-rate: " + getDelayRate(opnv) + "   qm-rate: " + getQuestionMarkRate(opnv));
                number++;
            }
        }

        return number;
    }


    public OPNV getBestOPNVForThisStationDelayRateQMRate(OPNV opnvC) {
        if(opnvC == null) System.out.println("RegPageSettings::getBestOPNVForThisStationDelayRateQMRate:" + " regno: " + this.pageNumber); //NON-NLS
        else System.out.println("RegPageSettings::getBestOPNVForThisStationDelayRateQMRate opnv: " + opnvC.getTag() + "  regno: " + this.pageNumber); //NON-NLS
        OPNV bestOPNV = null;
        double bestDelayRate = 0;
        double bestQuestionMarkRate = 1;

        if(opnvC != null) {
            bestOPNV = opnvC;
            bestDelayRate = getDelayRate(opnvC);
            bestQuestionMarkRate = getQuestionMarkRate(opnvC);
        }

        for(OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
            System.out.println("begin of for loop getBestOPNVForThisStationDelayRateQMRate() for opnv: " + opnv.getTag() + " regno: " + this.pageNumber); //NON-NLS

            boolean isItOpnvC = false;
            if(opnvC != null) {
                if (opnv.getTag().contentEquals(opnvC.getTag()))  isItOpnvC=true;
            }

            if(!isItOpnvC) {
                if (isStatusHasStop(opnv)) {
                    if (bestOPNV == null) {
                        bestOPNV = opnv;
                        bestDelayRate = getDelayRate(opnv);
                        bestQuestionMarkRate = getQuestionMarkRate(opnv);
                    }
                    System.out.println("getBestOPNVForThisStationDelayRateQMRate() StatusHasStop " + opnv.getTag() + " regno: " + this.pageNumber); //NON-NLS
                    System.out.println("  questionMarkRate " + opnv.getTag() + "  qm-rate: " + getQuestionMarkRate(opnv) + "  bestQM rate: " + bestQuestionMarkRate + " regno: " + this.pageNumber);
                    if (getQuestionMarkRate(opnv) < bestQuestionMarkRate) {
                        System.out.println("  getQuestionMarkRate(" + opnv.getTag() + ") < bestQuestionMarkRat" + " regno: " + this.pageNumber); //NON-NLS
                        System.out.println("  opnv " + opnv.getTag() + " is the new best OPNV" + " regno: " + this.pageNumber); //NON-NLS
                        bestDelayRate = getDelayRate(opnv);
                        bestQuestionMarkRate = getQuestionMarkRate(opnv);
                        bestOPNV = opnv;
                    } else {
                        if (getQuestionMarkRate(opnv) == bestQuestionMarkRate) {
                            System.out.println("  getQuestionMarkRate(" + opnv.getTag() + ") == bestQuestionMarkRate" + " regno: " + this.pageNumber); //NON-NLS
                            System.out.println("  delayRate " + opnv.getTag() + " " + getDelayRate(opnv) + " bestDelayRate: " + bestDelayRate + " regno: " + this.pageNumber); //NON-NLS);
                            if (getDelayRate(opnv) >= bestDelayRate) {
                                System.out.println("  getDelayRate(" + opnv.getTag() + ") >= bestDelayRate: " + bestDelayRate + " regno: " + this.pageNumber); //NON-NLS
                                bestDelayRate = getDelayRate(opnv);
                                bestQuestionMarkRate = getQuestionMarkRate(opnv);
                                bestOPNV = opnv;
                                System.out.println("  new best OPNV: " + opnv.getTag() + " regno: " + this.pageNumber); //NON-NLS
                            } else {
                                System.out.println("  opnv " + opnv.getTag() + " is not the new best OPNV (delay rate not better)" + " regno: " + this.pageNumber); //NON-NLS
                            }
                        } else {
                            System.out.println("  opnv " + opnv.getTag() + " is not the new best OPNV" + " regno: " + this.pageNumber); //NON-NLS
                        }
                    }
                }
            }
        }

        if(bestOPNV == null) {
            System.out.println("best provider total result: opnv unknown" + " regno: " + this.pageNumber); //NON-NLS
        }
        else {
            System.out.println("best provider total result: " + bestOPNV.getTag() + " regno: " + this.pageNumber); //NON-NLS
        }
        return bestOPNV;
    }


    public Stop getSecondaryOPNVForThisStation() {
        System.out.println("getSecondaryOPNVForThisStation" + " regno: " + this.pageNumber); //NON-NLS
        int numberOfSecondaryOPNVForThisStation = getNumberOfSecondaryOPNVForThisStation();
        System.out.println("numberOfSecondaryOPNVForThisStation: " + numberOfSecondaryOPNVForThisStation + " regno: " + this.pageNumber); //NON-NLS

        if(numberOfSecondaryOPNVForThisStation == 0) return null;

        if(numberOfSecondaryOPNVForThisStation >= 1) {
            OPNV bestOPNV = getBestOPNVForThisStationDelayRateQMRate(null);
            if(bestOPNV == null) return null;

            System.out.println("secondaryOPNV: " + bestOPNV.getTag() + " regno: " + this.pageNumber); //NON-NLS
            return getStopFromOPNV(bestOPNV);
        }

        return null;
    }


    public Stop getStopPrimaryOPNV() {
        return new Stop(OPNV.PRIMARY_OPNV, this.stationNameDB, this.extStationIdDB, this.xCoordDB, this.yCoordDB, OPNV.PRIMARY_OPNV.getUrl(this.extStationIdDB));
    }


    public void setStopPrimaryOPNV(Stop stop) {
        System.out.println("RegPageSettings::setStopPrimaryOPNV()");
        init();
        setStationNameDB(stop.getName());
        setExtStationIdDB("" + stop.getId());
        setXCoordDB(stop.getXCoord());
        setYCoordDB(stop.getYCoord());
        setStopFromOPNV(OPNV.PRIMARY_OPNV, stop);

        setStatusForStopFromOPNV(stop.getOPNV(), STATUS_STOP_OPNV_HAS_STOP);
    }


    public void print() {
        /*
        System.out.println("RegpageSettings::setStopPrimaryOPNV() print()");
        for (OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
            Stop s = getStopFromOPNV(opnv);
            if (s != null) {
                System.out.println("RegpageSettings::setStopPrimaryOPNV() opnv: " + opnv.getTag() + " stop set!");
            } else {
                System.out.println("RegpageSettings::setStopPrimaryOPNV() opnv: " + opnv.getTag() + " stop not set!");
            }
        }
        */
    }


    public void resetRatings() {
        for(OPNV opnv : OPNVManager.getInstance().getOPNVList()) {
            rateDelayInformationMap.put(opnv.getTag(), 0.0);
            rateOfQuestionMarks.put(opnv.getTag(), 1.1);
        }
    }
}
