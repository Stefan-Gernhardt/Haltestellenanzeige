package org.sge.haltestellenanzeige.widget;

/*
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.sge.haltestellenanzeige.ui.DisplayTimerActivity.DELAY_MILLIS;
import static org.sge.haltestellenanzeige.ui.DisplayTimerActivity.INITIAL_DELAY;
import static org.sge.haltestellenanzeige.ui.DisplayTimerActivity.REFRESH_INTERVAL_SECONDS;
import static org.sge.haltestellenanzeige.ui.DisplayTimerActivity.RETRY_INTERVAL_MILLIS;
*/

public class WidgetTimerNotUsed  {
    /*
    long startTime = 0; // System.currentTimeMillis();
    public final static int INTERVALL_TIME_BOARD_UPDATE = 30000; // milli seconds
    private boolean initial = true;
    private Context context = null;
    private HaltestellenWidget haltestellenWidget = null;
    public Handler timerHandler = new Handler();


    public WidgetTimerNotUsed(Context context, HaltestellenWidget haltestellenWidget) {
        this.context = context;
        this.haltestellenWidget = haltestellenWidget;
    }
    */

    /*
    public void startTimer() {
        if(initial) {
            startTime = System.currentTimeMillis();
            timerHandler.postDelayed(timerRunnable, INTERVALL_TIME_BOARD_UPDATE);
            initial = false;
        }
    }
    */


    /*
    static long lastBoardUpdate = 0;
    static final long minimumUpdateIntervalLength = 5000;
    */
    /*
    public Runnable timerRunnable = new Runnable() {
        @Override
        public void run() {
            long millis = System.currentTimeMillis() - startTime;
            int seconds = (int) (millis / 1000);

            System.out.println("seconds: " + seconds + "  millis: " + millis + "  count Widgets: "+ WidgetManager.getInstance().getWidgets().size());

            timerHandler.postDelayed(this, INTERVALL_TIME_BOARD_UPDATE);

            if(System.currentTimeMillis() - lastBoardUpdate > minimumUpdateIntervalLength) {
                lastBoardUpdate = System.currentTimeMillis();

                int widgetDasAmLaengstenNichtAktualisiertWurde = 0;
                long minimumTimestamp = 0;

                int[] widgetIds = AppWidgetManager.getInstance(context).getAppWidgetI‌​ds(new ComponentName(context, HaltestellenWidget.class));
                if (widgetIds.length == 0) return;

                // update only the widget with the oldest data
                for (int widgetIndex = 0; widgetIndex < widgetIds.length; widgetIndex++) {
                    if (widgetIndex == 0)
                        minimumTimestamp = WidgetManager.getInstance().getWidgetData(widgetIds[0]).getLetzteAktualisierung();

                    if (WidgetManager.getInstance().getWidgetData(widgetIds[widgetIndex]).getLetzteAktualisierung() < minimumTimestamp) {
                        minimumTimestamp = WidgetManager.getInstance().getWidgetData(widgetIds[widgetIndex]).getLetzteAktualisierung();
                        widgetDasAmLaengstenNichtAktualisiertWurde = widgetIndex;
                    }
                }

                WidgetManager.getInstance().getWidgetData(widgetIds[widgetDasAmLaengstenNichtAktualisiertWurde]).setLetzteAktualisierung(System.currentTimeMillis());
                haltestellenWidget.refreshBoard(context, widgetIds[widgetDasAmLaengstenNichtAktualisiertWurde]);

                // check existance of widget
                // AppWidgetProviderInfo wi = AppWidgetManager.getInstance(context).getAppWidgetInfo(4711);
                // if(wi != null)
            }
        }
    };
    */

}