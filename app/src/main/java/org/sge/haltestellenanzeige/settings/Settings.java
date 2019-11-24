package org.sge.haltestellenanzeige.settings;

import android.content.Context;


import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.io.WriteAndReadFileUtil;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVManager;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;

import java.util.*;

import static org.sge.haltestellenanzeige.settings.RegPageSettings.STATUS_STOP_OPNV_HAS_STOP;


public class Settings {
    public final static String SEP = ";;;;;";

    /*
        FRANKFURT(MAIN);;;;;8096021;;;;;false;;;;;8.663785;;;;;50.107149;;;;;0.6;;;;;0.0;;;;;DB;;;;;FRANKFURT(MAIN);;;;;8096021;;;;;8.663785;;;;;50.107149;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=8096021&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.6;;;;;0.0;;;;;
        Saarbrücken Hbf;;;;;8000323;;;;;false;;;;;6.991019;;;;;49.241066;;;;;0.0;;;;;1.0;;;;;SVV;;;;;Saarbrücken Hbf;;;;;008000323;;;;;6.991019;;;;;49.241066;;;;;http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&M=d&dpm=0&dw=128&dh=128&input=008000323&boardType=dep&time=now&selectDate=today&maxJourneys=50&start=yes;;;;;;;;;;;;;;;;;;;;0.9;;;;;0.0;;;;;
        Mannheim Hbf;;;;;8000244;;;;;false;;;;;8.468917;;;;;49.479352;;;;;0.8;;;;;0.0;;;;;DB;;;;;Mannheim Hbf;;;;;8000244;;;;;8.468917;;;;;49.479352;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=8000244&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.8;;;;;0.0;;;;;
        Darmstadt Hbf;;;;;8000068;;;;;false;;;;;8.629635;;;;;49.872504;;;;;0.3;;;;;0.0;;;;;DB;;;;;Darmstadt Hbf;;;;;8000068;;;;;8.629635;;;;;49.872504;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=8000068&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.3;;;;;0.0;;;;;
    */

    public final static String DEFAULT_CONFIGURATION_STRING = ";;;;;;;;;;true;;;;;0.0;;;;;0.0;;;;;0.0;;;;;0.0;;;;;DB;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;;;;;;;;;;;true;;;;;0.0;;;;;0.0;;;;;0.0;;;;;0.0;;;;;DB;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;;;;;;;;;;;true;;;;;0.0;;;;;0.0;;;;;0.0;;;;;0.0;;;;;DB;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;;;;;;;;;;;true;;;;;0.0;;;;;0.0;;;;;0.0;;;;;0.0;;;;;DB;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;";

    /*
            ";;;;;;;;;;false;;;;;0.0;;;;;0.0;;;;;0.0;;;;;0.0;;;;;DB;;;;;" +//NON-NLS
            ";;;;;;;;;;0.0;;;;;0.0;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;" +//NON-NLS
            ";;;;;;;;;;false;;;;;0.0;;;;;0.0;;;;;0.0;;;;;0.0;;;;;DB;;;;;" +//NON-NLS
            ";;;;;;;;;;0.0;;;;;0.0;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;" +//NON-NLS
            ";;;;;;;;;;false;;;;;0.0;;;;;0.0;;;;;0.0;;;;;0.0;;;;;DB;;;;;" +//NON-NLS
            ";;;;;;;;;;0.0;;;;;0.0;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;" +//NON-NLS
            ";;;;;;;;;;false;;;;;0.0;;;;;0.0;;;;;0.0;;;;;0.0;;;;;DB;;;;;" +//NON-NLS
            ";;;;;;;;;;0.0;;;;;0.0;;;;;https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&country=DEU&protocol=https:&rt=1&input=&boardType=dep&time=now&start=yes&maxJourneys=50;;;;;;;;;;;;;;;;;;;;0.0;;;;;0.0;;;;;"; //NON-NLS
    */

    public final static String SETTINGS_FILE_NAME = "settings.txt"; //NON-NLS
    private static Settings settingsSingleton = null;
    public static final int START_LEVEL = 1;

    private List<RegPageSettings> regPageSettings = new ArrayList<RegPageSettings>();

    public static Settings getInstance() {
        if (settingsSingleton == null) settingsSingleton = new Settings();
        return settingsSingleton;
    }


    private Settings() {
        for(int i = 0; i<DisplayTimerActivity.COUNT_ACTIVITIES; i++) {
            regPageSettings.add(i, new RegPageSettings(i));
        }
    }


    public static String getDefaultStop(Context context) {
        return context.getResources().getString(R.string.app_default_haltestelle);
    }


    public void saveSettings(Context context) {
        System.out.println("saveSettings()"); //NON-NLS

        String saveString = computeSaveString(context);
        System.out.println("save string: " + saveString); //NON-NLS

        saveSettings(context, saveString);
    }


    public void saveSettings(Context context, String saveString) {
        WriteAndReadFileUtil.writeStringToFile(SETTINGS_FILE_NAME, saveString, context);
    }


    public void setStation(Context context, int activityNumber, int stationIdInt, String stationName, double x, double y, double delayRate, double qmRate) {
        System.out.println("setStation()"); //NON-NLS

        regPageSettings.get(activityNumber).init();
        regPageSettings.get(activityNumber).setStationNameDB(stationName);
        regPageSettings.get(activityNumber).setExtStationIdDB("" + stationIdInt);
        regPageSettings.get(activityNumber).setXCoordDB(x);
        regPageSettings.get(activityNumber).setYCoordDB(y);
        regPageSettings.get(activityNumber).setDelayRate(delayRate);
        regPageSettings.get(activityNumber).setQmRate(qmRate);
    }


    public String computeSaveString(Context context) {
        System.out.println("computeSaveString");
        String result = "";

        for(int i = 0; i< DisplayTimerActivity.COUNT_ACTIVITIES; i++)
        {
            String resultForOneStop = computeSaveStringForOneStation(context, regPageSettings.get(i), "App");
            result = result.concat(resultForOneStop);
            System.out.println("Settings::computeSaveString() page " + i + " resultForOneStop: " + resultForOneStop); //NON-NLS
        }

        System.out.println("Settings::computeSaveString() all pages " + " result: " + result); //NON-NLS
        return result;
    }


    public static String computeSaveStringForOneStation(Context context, RegPageSettings regPageSettings, String callerName) {
        System.out.println("Settings::computeSaveStringForOneStation() callerName: " + callerName + ": <" + regPageSettings.getStationNameDB() + ">"); //NON-NLS
        String result = "";

        String priStopName = regPageSettings.getStationNameDB();
        if(priStopName != null) {
            if(priStopName.equals(Settings.getDefaultStop(context))) priStopName = "";
        }

        result = result.concat(priStopName);
        result = result.concat(SEP);

        result = result.concat(regPageSettings.getExtStationIdDB());
        result = result.concat(SEP);

        result = result.concat("true");
        result = result.concat(SEP);

        result = result.concat("" + regPageSettings.getXCoordDB());
        result = result.concat(SEP);

        result = result.concat("" + regPageSettings.getYCoordDB());
        result = result.concat(SEP);

        result = result.concat("" + regPageSettings.getDelayRate());
        result = result.concat(SEP);

        result = result.concat("" + regPageSettings.getQmRate());
        result = result.concat(SEP);

        OPNV bestSecondaryOPNV = regPageSettings.getBestOPNVForThisStationDelayRateQMRate(null);
        Stop bestSecondaryStop = regPageSettings.getStopFromOPNV(bestSecondaryOPNV);

        if(bestSecondaryOPNV == null || bestSecondaryStop == null) {
            result = result.concat("" + SEP + "" + SEP + "" + SEP + "" + SEP + "" + SEP + "" + SEP + "" + SEP + "" + SEP + "" + SEP + "" + SEP + "" + SEP);
        }
        else {
            String bestSecondaryStopName = bestSecondaryStop.getName();
            if(bestSecondaryStopName != null) {
                if(bestSecondaryStopName.equals(Settings.getDefaultStop(context))) bestSecondaryStopName = "";
            }

            result = result.concat(
                    "" + bestSecondaryOPNV.getTag() + SEP +
                            bestSecondaryStopName + Settings.SEP +
                            bestSecondaryStop.getId() + Settings.SEP +
                            bestSecondaryStop.getXCoord() + Settings.SEP +
                            bestSecondaryStop.getYCoord() + Settings.SEP +
                            bestSecondaryStop.getUrl() + Settings.SEP +
                            "" + Settings.SEP +
                            "" + Settings.SEP +
                            "" + Settings.SEP +
                            regPageSettings.getDelayRate(bestSecondaryOPNV) + SEP +
                            regPageSettings.getQuestionMarkRate(bestSecondaryOPNV) + SEP
            );
        }

        return result;
    }


    private void parseLoadString(Context context, String loadString) {
        System.out.println("parseLoadString() >>>" + loadString + "<<<"); //NON-NLS
        String workString = loadString;

        for (int i = 0; i < DisplayTimerActivity.COUNT_ACTIVITIES; i++) {
            workString = parseLoadStringSingleStation(context, workString, regPageSettings.get(i));
        }
    }


    public String parseLoadStringSingleStation(Context context, String workString, RegPageSettings regPageSettings) {
        System.out.println("Settings::parseLoadStringSingleStation() " + workString); //NON-NLS

        int endOfPayload = workString.indexOf(SEP);
        String payLoad1 = workString.substring(0, endOfPayload);
        workString = workString.substring(endOfPayload + SEP.length());
        if(payLoad1.isEmpty()) payLoad1 = Settings.getDefaultStop(context);
        System.out.println("payload1: " + payLoad1); //NON-NLS
        regPageSettings.setStationNameDB(payLoad1);

        endOfPayload = workString.indexOf(SEP);
        String payLoad2 = workString.substring(0, endOfPayload);
        workString = workString.substring(endOfPayload + SEP.length());
        // System.out.println("payload2: " + payLoad2);
        regPageSettings.setExtStationIdDB(payLoad2);

        endOfPayload = workString.indexOf(SEP);
        String payLoad3 = workString.substring(0, endOfPayload);
        workString = workString.substring(endOfPayload + SEP.length());
        // System.out.println("payload3: " + payLoad3);
        // regPageSettings.setStationNurBahnDB(payLoad3);

        try {
            endOfPayload = workString.indexOf(SEP);
            String payLoad4 = workString.substring(0, endOfPayload);
            workString = workString.substring(endOfPayload + SEP.length());
            // System.out.println("payload4: " + payLoad4);
            regPageSettings.setXCoordDB(Double.parseDouble(payLoad4));
        }
        catch(NumberFormatException e) {
            regPageSettings.setXCoordDB(0);
        }

        try {
            endOfPayload = workString.indexOf(SEP);
            String payLoad5 = workString.substring(0, endOfPayload);
            workString = workString.substring(endOfPayload + SEP.length());
            // System.out.println("payload5: " + payLoad5);
            regPageSettings.setYCoordDB(Double.parseDouble(payLoad5));
        }
        catch(NumberFormatException e) {
            regPageSettings.setYCoordDB(0);
        }

        try {
            endOfPayload = workString.indexOf(SEP);
            String payLoad6 = workString.substring(0, endOfPayload);
            workString = workString.substring(endOfPayload + SEP.length());
            // System.out.println("payload6: " + payLoad6);
            regPageSettings.setDelayRate(Double.parseDouble(payLoad6));
        }
        catch(NumberFormatException e) {
            regPageSettings.setDelayRate(0);
        }

        try {
            endOfPayload = workString.indexOf(SEP);
            String payLoad7 = workString.substring(0, endOfPayload);
            workString = workString.substring(endOfPayload + SEP.length());
            // System.out.println("payload7: " + payLoad7);
            regPageSettings.setQmRate(Double.parseDouble(payLoad7));
        }
        catch(NumberFormatException e) {
            regPageSettings.setQmRate(0);
        }

        // set Primary_stop in secondary statistic data
        regPageSettings.setStopFromOPNV(OPNV.PRIMARY_OPNV, regPageSettings.getStopPrimaryOPNV());
        regPageSettings.setStatusForStopFromOPNV(OPNV.PRIMARY_OPNV, STATUS_STOP_OPNV_HAS_STOP);
        regPageSettings.setDelayRate(OPNV.PRIMARY_OPNV, regPageSettings.getDelayRate());
        regPageSettings.setQuestionMarkRate(OPNV.PRIMARY_OPNV, regPageSettings.getQmRate());


        // secondary stop
        String opnvSecondaryTag = "";
        {
            endOfPayload = workString.indexOf(SEP);
            String payLoad8 = workString.substring(0, endOfPayload);
            // System.out.println("payload8: " + payLoad8);
            workString = workString.substring(endOfPayload + SEP.length());
            opnvSecondaryTag = payLoad8;
        }

        String nameSecondary = "";
        {
            endOfPayload = workString.indexOf(SEP);
            String payLoad9 = workString.substring(0, endOfPayload);
            // System.out.println("payload9: " + payLoad9);
            workString = workString.substring(endOfPayload + SEP.length());
            if(payLoad9.isEmpty()) payLoad9 = Settings.getDefaultStop(context);
            nameSecondary = payLoad9;
        }

        String idSecondary = "";
        {
            endOfPayload = workString.indexOf(SEP);
            String payLoad10 = workString.substring(0, endOfPayload);
            // System.out.println("payload10: " + payLoad10);
            workString = workString.substring(endOfPayload + SEP.length());
            idSecondary = payLoad10;
        }

        double xSecondary = 0.0;
        try {
            endOfPayload = workString.indexOf(SEP);
            String payLoad11 = workString.substring(0, endOfPayload);
            // System.out.println("payload11: " + payLoad11);
            workString = workString.substring(endOfPayload + SEP.length());
            xSecondary = Double.parseDouble(payLoad11);
        }
        catch(NumberFormatException e) {
            xSecondary = 0.0;
        }

        double ySecondary = 0.0;
        try {
            endOfPayload = workString.indexOf(SEP);
            String payLoad12 = workString.substring(0, endOfPayload);
            // System.out.println("payload12: " + payLoad12);
            workString = workString.substring(endOfPayload + SEP.length());
            ySecondary = Double.parseDouble(payLoad12);
        }
        catch(NumberFormatException e) {
            ySecondary = 0.0;
        }

        String data1 = "";
        {
            endOfPayload = workString.indexOf(SEP);
            String payLoad13 = workString.substring(0, endOfPayload);
            // System.out.println("payload13: " + payLoad13);
            workString = workString.substring(endOfPayload + SEP.length());
            data1 = payLoad13;
        }

        String data2 = "";
        {
            endOfPayload = workString.indexOf(SEP);
            String payLoad14 = workString.substring(0, endOfPayload);
            // System.out.println("payload14: " + payLoad14);
            workString = workString.substring(endOfPayload + SEP.length());
            data2 = payLoad14;
        }

        String data3 = "";
        {
            endOfPayload = workString.indexOf(SEP);
            String payLoad15 = workString.substring(0, endOfPayload);
            // System.out.println("payload15: " + payLoad15);
            workString = workString.substring(endOfPayload + SEP.length());
            data3 = payLoad15;
        }

        String data4 = "";
        {
            endOfPayload = workString.indexOf(SEP);
            String payLoad16 = workString.substring(0, endOfPayload);
            // System.out.println("payload16: " + payLoad16);
            workString = workString.substring(endOfPayload + SEP.length());
            data4 = payLoad16;
        }

        double xDelayRate = 0.0;
        try {
            endOfPayload = workString.indexOf(SEP);
            String payLoad17 = workString.substring(0, endOfPayload);
            // System.out.println("payload17: " + payLoad17);
            workString = workString.substring(endOfPayload + SEP.length());
            xDelayRate = Double.parseDouble(payLoad17);
        }
        catch(NumberFormatException e) {
            xDelayRate = 0.0;
        }

        double qmRate = 1.0;
        try {
            endOfPayload = workString.indexOf(SEP);
            String payLoad18 = workString.substring(0, endOfPayload);
            // System.out.println("payload18: " + payLoad18);
            workString = workString.substring(endOfPayload + SEP.length());
            qmRate = Double.parseDouble(payLoad18);
        }
        catch(NumberFormatException e) {
            qmRate = 1.0;
        }

        // set secondary stop in secondary statistic data
        OPNV opnvSecondary = OPNVManager.getInstance().getOPNV(opnvSecondaryTag);
        if(opnvSecondary != null) {
            Stop stopSecondary = new Stop(opnvSecondary, nameSecondary, idSecondary, xSecondary, ySecondary, data1);

            regPageSettings.setStatusForStopFromOPNV(opnvSecondary, STATUS_STOP_OPNV_HAS_STOP);
            regPageSettings.setDelayRate(opnvSecondary, xDelayRate);
            regPageSettings.setQuestionMarkRate(opnvSecondary, qmRate);
            regPageSettings.setStopFromOPNV(opnvSecondary, stopSecondary);
        }
        
        return workString;
    }


    public void loadSettings(Context context) {
        System.out.println("Settings::loadSettings"); //NON-NLS

        String readString = WriteAndReadFileUtil.readStringFromFile(SETTINGS_FILE_NAME, context);
        if(readString == null) readString = DEFAULT_CONFIGURATION_STRING;

        try {
            parseLoadString(context, readString);
        }
        catch (RuntimeException e) {
            try {
                parseLoadString(context, DEFAULT_CONFIGURATION_STRING);
            }
            catch (RuntimeException ex) {
                ex.printStackTrace();
            }
        }
    }


    public String getStationName(int i)
    {
        if((i<0) || (i>=DisplayTimerActivity.COUNT_ACTIVITIES)) return "";
        return regPageSettings.get(i).getStationNameDB();
    }


    public void setStationName(int i, String stationName) {
        if((i<0) || (i>=DisplayTimerActivity.COUNT_ACTIVITIES)) return;
        regPageSettings.get(i).setStationNameDB(stationName);
    }


    public RegPageSettings getRegPageSettings(int i) {
        if((i<0) || (i>=DisplayTimerActivity.COUNT_ACTIVITIES)) return null;
        return regPageSettings.get(i);
    }
}