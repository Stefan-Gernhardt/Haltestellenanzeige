package org.sge.haltestellenanzeige.widget;

import android.content.Context;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.settings.RegPageSettings;
import org.sge.haltestellenanzeige.stop.Stop;

public class WidgetData {
    private Stop stop = null;
    private int widgetId = 0;
    private RegPageSettings regPageSettings = null;
    private String aktualisierungsText = null;
    private long letzteAktualisierung = 0;


    public WidgetData(int widgetId) {
        this.widgetId = widgetId;
        regPageSettings = new RegPageSettings(0);
    }


    public long getLetzteAktualisierung() {
        return letzteAktualisierung;
    }


    public void setLetzteAktualisierung(long letzteAktualisierung) {
        this.letzteAktualisierung = letzteAktualisierung;
    }


    public String getAktualisierungsText(Context context) {
        if(aktualisierungsText == null) aktualisierungsText = context.getResources().getString(R.string.app_aktualisierungstext_initial);
        return aktualisierungsText;
    }


    public void setAktualisierungsText(String aktualisierungsText) {
        this.aktualisierungsText = aktualisierungsText;
    }


    public int getWidgetId() { return widgetId; }


    public Stop getStation(Context context) {
        if(stop != null) return stop;

        // try to load station
        Stop loadedStop =  WidgetManager.getInstance().loadWidgetSettings(context, widgetId);
        stop = loadedStop;

        return stop;
    }


    public void setStation(Stop stop) {
        this.stop = stop;
    }


    public RegPageSettings getRegPageSettings() {
        return regPageSettings;
    }

}
