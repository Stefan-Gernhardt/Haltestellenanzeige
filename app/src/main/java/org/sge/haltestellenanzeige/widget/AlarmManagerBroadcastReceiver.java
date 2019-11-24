package org.sge.haltestellenanzeige.widget;

/*
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.widget.RemoteViews;
import android.widget.Toast;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.util.Util;

import static org.sge.haltestellenanzeige.widget.HaltestellenWidget.INTENT_EXTRA_PARAMETER_WIDGET_ID;

public class AlarmManagerBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); //NON-NLS
        System.out.println("AlarmManagerBroadcastReceiver::onReceive"); //NON-NLS
        // Toast.makeText(context, "Alarm received", Toast.LENGTH_SHORT).show(); //NON-NLS


        PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "HALTESTELLENTAG"); //NON-NLS
        // power management lock
        wl.acquire();
        // AndroidManifast.xml <uses-permission android:name="android.permission.WAKE_LOCK"/>

        // You can do the processing here update the widget/remote views.
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);
        // String time = Util.getCurrentTime("hh:mm:ss a");
        // remoteViews.setTextViewText(R.id.textViewAbfahrtWidget1, time);
        // Toast.makeText(context, time, Toast.LENGTH_LONG).show();
        ComponentName thiswidget = new ComponentName(context, HaltestellenWidget.class);
        AppWidgetManager manager = AppWidgetManager.getInstance(context);
        // manager.updateAppWidget(thiswidget, remoteViews);

        int[] widgetIds = manager.getAppWidgetIds(thiswidget);
        if(widgetIds.length >= 0) {

            // update only the widget with the oldest data
            int widgetDasAmLaengstenNichtAktualisiertWurde = 0;
            long minimumTimestamp = 0;

            for (int widgetIndex = 0; widgetIndex < widgetIds.length; widgetIndex++) {
                if (widgetIndex == 0) {
                    minimumTimestamp = WidgetManager.getInstance().getWidgetData(widgetIds[0]).getLetzteAktualisierung();
                }

                if (WidgetManager.getInstance().getWidgetData(widgetIds[widgetIndex]).getLetzteAktualisierung() < minimumTimestamp) {
                    minimumTimestamp = WidgetManager.getInstance().getWidgetData(widgetIds[widgetIndex]).getLetzteAktualisierung();
                    widgetDasAmLaengstenNichtAktualisiertWurde = widgetIndex;
                }
            }

            WidgetManager.getInstance().getWidgetData(widgetIds[widgetDasAmLaengstenNichtAktualisiertWurde]).setLetzteAktualisierung(System.currentTimeMillis());
            HaltestellenWidget.refreshBoard(context, widgetIds[widgetDasAmLaengstenNichtAktualisiertWurde]);

            // check existance of widget
            // AppWidgetProviderInfo wi = AppWidgetManager.getInstance(context).getAppWidgetInfo(4711);
            // if(wi != null)
        }

        // power management lock
        wl.release();
    }

}

*/