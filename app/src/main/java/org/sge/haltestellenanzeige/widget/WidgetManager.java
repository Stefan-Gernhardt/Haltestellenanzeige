package org.sge.haltestellenanzeige.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.io.WriteAndReadFileUtil;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVManager;
import org.sge.haltestellenanzeige.settings.RegPageSettings;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;

import java.util.HashMap;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;
import static org.sge.haltestellenanzeige.settings.RegPageSettings.STATUS_STOP_OPNV_HAS_STOP;
import static org.sge.haltestellenanzeige.settings.Settings.DEFAULT_CONFIGURATION_STRING;
import static org.sge.haltestellenanzeige.settings.Settings.SEP;

public class WidgetManager {
    private static final String WIDGET_SETTINGS_FILE_NAME = "widgetsettings"; //NON-NLS;
    private static final String FILE_SUFFIX = ".txt"; //NON-NLS;
    private static WidgetManager widgetManager = null;
    private static HashMap<Integer, WidgetData> widgetMap = new HashMap<Integer, WidgetData>();


    private WidgetManager() {
    }


    public static WidgetManager getInstance() {
        if(widgetManager == null) widgetManager = new WidgetManager();
        return widgetManager;
    }


    public WidgetData getWidgetData(int widgetId) {
        if(widgetMap.containsKey(widgetId)) {
            System.out.println("WidgetManager::getWidgetData() widget is in Map-Container: " + widgetId);
            return widgetMap.get(widgetId);
        }
        else {
            System.out.println("WidgetManager::getWidgetData() widget is not in Map-Container: " + widgetId);
            WidgetData widgetData = new WidgetData(widgetId);
            widgetMap.put(widgetId, widgetData);
            return widgetData;
        }
    }


    public void saveWidget(Context context, int widgetId) {
        String saveString = computeSaveStringWidget(context, widgetId);
        System.out.println("save widget string of widget id: " + widgetId +  " : " + saveString); //NON-NLS
        saveSettings(context, saveString, widgetId);
        // save(context, widgetId, saveString);
    }


    public void saveSettings(Context context, String saveString, int widgetId) {
        WriteAndReadFileUtil.writeStringToFile(WIDGET_SETTINGS_FILE_NAME + widgetId + FILE_SUFFIX, saveString, context);
    }


    /*
    private void save(Context context, int widgetId, String saveString) {
        SharedPreferences pref = getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("" + widgetId, saveString);
        editor.commit();
    }
    */


    public boolean isStopNull(Context context, int widgetId) {
        return getWidgetData(widgetId).getStation(context) == null;
    }


    public Stop loadWidgetSettings(Context context, int widgetId) {
        // Toast.makeText(context, "load widget " + widgetId, Toast.LENGTH_SHORT).show(); //NON-NLS
        System.out.println("WidgetManager::loadSettings"); //NON-NLS

        String readString = WriteAndReadFileUtil.readStringFromFile(WIDGET_SETTINGS_FILE_NAME + widgetId + FILE_SUFFIX, context);
        if(readString == null) readString = DEFAULT_CONFIGURATION_STRING;

        System.out.println("load widget " + widgetId + " settings: " + readString); //NON-NLS

        if(!"".equals(readString)) {
            Settings.getInstance().parseLoadStringSingleStation(context, readString, this.getWidgetData(widgetId).getRegPageSettings());
            WidgetManager.getInstance().getWidgetData(widgetId).setStation(this.getWidgetData(widgetId).getRegPageSettings().getStopFromOPNV(OPNV.PRIMARY_OPNV));
            return this.getWidgetData(widgetId).getRegPageSettings().getStopFromOPNV(OPNV.PRIMARY_OPNV);
        }

        return null;
    }


    public void deleteWidgetData(int widgetId) {
        System.out.println("WidgetManager::deleteWidgetData(): " + widgetId);
        widgetMap.remove(widgetId);
    }


    public void deleteWidget(Context context, int widgetId) {
        WriteAndReadFileUtil.deleteFile(WIDGET_SETTINGS_FILE_NAME + widgetId + FILE_SUFFIX, context);
        deleteWidgetData(widgetId);
    }


    /*
    public boolean loadWidget(Context context, int widgetId) {
        SharedPreferences pref = getDefaultSharedPreferences(context);
        String value = pref.getString("" + widgetId, "");
        System.out.println("load widget " + widgetId + " settings: " + value); //NON-NLS

        if(!"".equals(value)) {
            Settings.getInstance().parseLoadStringSingleStation(context, value, this.getWidgetData(widgetId).getRegPageSettings());
            WidgetManager.getInstance().getWidgetData(widgetId).setStation(this.getWidgetData(widgetId).getRegPageSettings().getStopFromOPNV(OPNV.PRIMARY_OPNV));
            // updateStationNameOnTheWidget(context);
            HaltestellenWidget.refreshBoard(context, widgetId);
            return true;
        }

        return false;
    }
    */


    private String computeSaveStringWidget(Context context, int widgetId) {
        System.out.println("WidgetManager::computeSaveStringWidget stationNameDB: <" + this.getWidgetData(widgetId).getRegPageSettings().getStationNameDB() + ">"); //NON-NLS

        return Settings.computeSaveStringForOneStation(context, this.getWidgetData(widgetId).getRegPageSettings(), "Widget");
    }

}
