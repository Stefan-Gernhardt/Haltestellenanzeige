package org.sge.haltestellenanzeige.widget;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.ui.ChangeStopActivity;


public class HaltestellenWidget extends AppWidgetProvider {
    public static final String SELECT_STATION_ACTION = "selectStationAction"; //NON-NLS
    public static final String REFRESH_ACTION_BY_BUTTON = "refreshBoardActionByButton"; //NON-NLS
    public static final String UPDATE_BOARD_ACTION = "updateBoardAction"; //NON-NLS
    public static final String APPWIDGET_DELETED_ACTION = "android.appwidget.action.APPWIDGET_DELETED_ACTION"; //NON-NLS
    public static final String APPWIDGET_UPDATE_OPTIONS_ACTION = "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS"; //NON-NLS

    public static final String INTENT_EXTRA_PARAMETER_WIDGET_ID = "org.sge.haltestellenanzeige.extra_widgetId"; //NON-NLS
    public static final String INTENT_EXTRA_PARAMETER_WIDGET_MODE = "org.sge.haltestellenanzeige.extra_widgetMode"; //NON-NLS

    public final static long ALARM_INTERVAL = 180000; // 3 minutes
    public final static long ALARM_OFFSET = 30000; // 30 seconds

    private static long lastRefreshOn = 0;
    public final static long REFRESH_INTERVALL = 500;

    final static String UPDATE_RIGHT = "↓ "; // "→ ";
    final static String UPDATE_LEFT  = "↓ "; // "← ";
    final static String UPDATE_UP    = "↓ "; // "↑ ";
    final static String UPDATE_DOWN  = "↓ ";

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        // Toast.makeText(context, "TimeWidgetRemoved id(s):" + appWidgetIds, Toast.LENGTH_SHORT).show();
        for (int widgetId : appWidgetIds) {
            WidgetManager.getInstance().getWidgetData(widgetId).setStation(null);
        }
        super.onDeleted(context, appWidgetIds);
    }


    public static void restartAlarm(Context context) {
        stopAlarm(context);
        startAlarm(context);
    }


    private static void startAlarm(Context context) {
        /*
        System.out.println("HaltestellenWidget::startAlarm()"); //NON-NLS
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, AlarmManagerBroadcastReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(context, 0, intent, 0);
        am.setInexactRepeating(AlarmManager.RTC, System.currentTimeMillis() + ALARM_OFFSET, ALARM_INTERVAL , pi);
        // am.setInexactRepeating(AlarmManager.ELAPSED_REALTIME, SystemClock.elapsedRealtime() + ALARM_INTERVAL, ALARM_INTERVAL, pi);
        */
    }


    private static void startOneTimeAlarm(Context context) {
        /*
        System.out.println("HaltestellenWidget::startOneTimeAlarm()"); //NON-NLS
        // Toast.makeText(context, "startOneTimeAlarm", Toast.LENGTH_SHORT).show(); //NON-NLS

        AlarmManager am = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, AlarmManagerBroadcastReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(context, 0, intent, 0);
        long alarmTime = System.currentTimeMillis() + 5000;
        am.setExact(AlarmManager.RTC, alarmTime, pi);
        */
    }


    private static void stopAlarm(Context context) {
        /*
        Intent intent = new Intent(context, AlarmManagerBroadcastReceiver.class);
        PendingIntent sender = PendingIntent.getBroadcast(context, 0, intent, 0);
        AlarmManager alarmManager = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        alarmManager.cancel(sender);
        */
    }


    @Override
    public void onDisabled(Context context) {
        // Toast.makeText(context, "onDisabled():last widget instance removed", Toast.LENGTH_SHORT).show();
        stopAlarm(context);
        super.onDisabled(context);
    }


    @Override
    public void onEnabled(Context context) {
        // first widget added
        super.onEnabled(context);
        System.out.println("HaltestellenWidget::onEnabled"); //NON-NLS
        // Toast.makeText(context, "HaltestellenWidget::onEnabled", Toast.LENGTH_SHORT).show(); //NON-NLS

        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        ComponentName thisWidget = new ComponentName(context, HaltestellenWidget.class);

        for (int widgetId : appWidgetManager.getAppWidgetIds(thisWidget)) {
            WidgetManager.getInstance().loadWidgetSettings(context, widgetId);
        }

        startAlarm(context);
    }


    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        System.out.println("HaltestellenWidget::onUpdate"); //NON-NLS
        // Toast.makeText(context, "HaltestellenWidget::onUpdate count widgets: " + appWidgetIds.length, Toast.LENGTH_SHORT).show(); //NON-NLS
        ComponentName thisWidget = new ComponentName(context, HaltestellenWidget.class);

        for (int appWidgetId : appWidgetManager.getAppWidgetIds(thisWidget)) {
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);

            // views.setTextViewText(R.id.textViewAbfahrtWidget1, Util.getCurrentTime("hh:mm:ss a"));
            views.setOnClickPendingIntent(R.id.changeStationButtonWidget, this.getPendingSelfIntent(context, SELECT_STATION_ACTION, appWidgetId));
            views.setOnClickPendingIntent(R.id.refreshButtonWidget, this.getPendingSelfIntent(context, REFRESH_ACTION_BY_BUTTON, appWidgetId));
            views.setOnClickPendingIntent(R.id.widgetLayout, this.getPendingSelfIntent(context, UPDATE_BOARD_ACTION, appWidgetId));

            String stationName = WidgetManager.getInstance().getWidgetData(appWidgetId).getRegPageSettings().getStationName();
            if(!stationName.isEmpty()) views.setTextViewText(R.id.textViewStationNameWidget, stationName);
            // views.setTextViewText(R.id.textViewStationNameWidget, "onUpdate");
            // views.setTextViewText(R.id.textViewAbfahrtWidget2, "onUpdate() " + Util.getCurrentTime("hh:mm:ss a"));

            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        int widgetId = intent.getIntExtra(INTENT_EXTRA_PARAMETER_WIDGET_ID, 0);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); //NON-NLS
        System.out.println("Action received = " + action + "  widget id: " + widgetId); //NON-NLS
        // Toast.makeText(context, "Action received = " + action + "  widget id: " + widgetId, Toast.LENGTH_LONG).show(); //NON-NLS

        // change station
        if (SELECT_STATION_ACTION.contentEquals(action)) {
            System.out.println("change station button pressed on a Widget"); //NON-NLS
            // Toast.makeText(context, "change station button pressed on a Widget", Toast.LENGTH_SHORT).show(); //NON-NLS

            Intent intentToChooseStation = new Intent(context, ChangeStopActivity.class);
            intentToChooseStation.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intentToChooseStation.putExtra(INTENT_EXTRA_PARAMETER_WIDGET_ID, widgetId);
            intentToChooseStation.putExtra(INTENT_EXTRA_PARAMETER_WIDGET_MODE, 1);
            context.startActivity(intentToChooseStation);
        }


        // update board
        if(UPDATE_BOARD_ACTION.contentEquals(action) || REFRESH_ACTION_BY_BUTTON.contentEquals(action)) {
            if(checkWaitMinDuration()) {
                System.out.println("refresh board initiated by touch click on ui or refresh button"); //NON-NLS
                // Toast.makeText(context, "update action", Toast.LENGTH_SHORT).show(); //NON-NLS
                lastRefreshOn = System.currentTimeMillis();
                refreshBoard(context, widgetId);
            }
        }


        // widget deleted
        if(APPWIDGET_DELETED_ACTION.contentEquals(action)) {
            WidgetManager.getInstance().deleteWidget(context, widgetId);
        }


        if(APPWIDGET_UPDATE_OPTIONS_ACTION.contentEquals(action)) {
        }

        super.onReceive(context, intent);
    }


    boolean checkWaitMinDuration() {
        return (System.currentTimeMillis() - lastRefreshOn > REFRESH_INTERVALL);
    }


    protected PendingIntent getPendingSelfIntent(Context context, String action, int appWidgetId) {
        Intent intent = new Intent(context, HaltestellenWidget.class);
        intent.setAction(action);
        intent.putExtra(INTENT_EXTRA_PARAMETER_WIDGET_ID, appWidgetId);
        intent.setData(Uri.parse(intent.toUri(Intent.URI_INTENT_SCHEME)));
        // System.out.println("put extra data widget id: " + appWidgetId + "  retrieved: " + intent.getIntExtra(INTENT_EXTRA_PARAMETER_WIDGET_ID, 0));

        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }


    @Override
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId, Bundle newOptions) {
        System.out.println("HaltestellenWidget::onAppWidgetOptionsChanged"); //NON-NLS
        // Toast.makeText(context, "onAppWidgetOptionsChanged() called", Toast.LENGTH_SHORT).show();
    }


    public static String updatePostfix(Context context, int widgetId) {
        String currentText = WidgetManager.getInstance().getWidgetData(widgetId).getAktualisierungsText(context);
        if(currentText.length() <= 0) return "";
        String updateText = "";

        if(currentText.endsWith(UPDATE_DOWN))        updateText = currentText.substring(0, currentText.length() - 2) + UPDATE_RIGHT;
        else if(currentText.endsWith(UPDATE_RIGHT))  updateText = currentText.substring(0, currentText.length() - 2) + UPDATE_UP;
        else if(currentText.endsWith(UPDATE_UP))     updateText = currentText.substring(0, currentText.length() - 2) + UPDATE_LEFT;
        else if(currentText.endsWith(UPDATE_LEFT))   updateText = currentText.substring(0, currentText.length() - 2) + UPDATE_DOWN;
        else updateText = currentText + UPDATE_DOWN;

        WidgetManager.getInstance().getWidgetData(widgetId).setAktualisierungsText(updateText);
        return updateText;
    }


    private static String clearPostfix(Context context, int widgetId) {
        String currentText = WidgetManager.getInstance().getWidgetData(widgetId).getAktualisierungsText(context);
        if(currentText.length() <= 0) return "";
        String updateText = "";

        if(currentText.endsWith(UPDATE_DOWN))        updateText = currentText.substring(0, currentText.length() - 2);
        else if(currentText.endsWith(UPDATE_RIGHT))  updateText = currentText.substring(0, currentText.length() - 2);
        else if(currentText.endsWith(UPDATE_UP))     updateText = currentText.substring(0, currentText.length() - 2);
        else if(currentText.endsWith(UPDATE_LEFT))   updateText = currentText.substring(0, currentText.length() - 2);
        else updateText = currentText;

        WidgetManager.getInstance().getWidgetData(widgetId).setAktualisierungsText(updateText);
        return updateText;
    }


    public static void refreshBoard(Context context, int widgetId) {
        System.out.println("HaltestellenWidget::refreshBoard()"); //NON-NLS
        Stop stop = WidgetManager.getInstance().getWidgetData(widgetId).getStation(context);
        String stationName = WidgetManager.getInstance().getWidgetData(widgetId).getRegPageSettings().getStationName();

        System.out.println("HaltestellenWidget::refreshBoard():stop name: " + stop.getName()); //NON-NLS
        System.out.println("HaltestellenWidget::refreshBoard():stationName: " + stationName); //NON-NLS
        if(stop == null || stationName.isEmpty() || Settings.getDefaultStop(context).contentEquals(WidgetManager.getInstance().getWidgetData(widgetId).getStation(context).getName())) {
            System.out.println("HaltestellenWidget::refreshBoard():Stop for widget " + widgetId + " not set! No refresh possible!"); //NON-NLS
            // Toast.makeText(context, "HaltestellenWidget::refreshBoard():Stop for widget " + widgetId + " not set! No refresh possible!", Toast.LENGTH_SHORT).show(); //NON-NLS
            return;
        }
        else {
            // Toast.makeText(context, "HaltestellenWidget::refreshBoard():stop name: " + stop.getName(), Toast.LENGTH_SHORT).show(); //NON-NLS

            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);
            views.setTextViewText(R.id.textViewLetzteAktualisierungWidget, updatePostfix(context, widgetId));
            views.setTextViewText(R.id.textViewStationNameWidget, WidgetManager.getInstance().getWidgetData(widgetId).getRegPageSettings().getStationName());
            AppWidgetManager.getInstance(context).updateAppWidget(widgetId, views);

            BahnRequest.createBahnRequestAsynchronWithTag(context, null, WidgetManager.getInstance(), widgetId, WidgetManager.getInstance().getWidgetData(widgetId).getRegPageSettings());
        }
    }


/*
    public void updateStationNameOnTheWidget(Context context, int widgetId, String name) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);
        views.setTextViewText(R.id.textViewStationNameWidget, name);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        appWidgetManager.updateAppWidget(widgetId,views);
    }
*/


    public static void updateBoard(Context context, int widgetId, Stop stop, String responseString) {
        // called by Bahnrequest after receiving response/StationBoardData to update UI data
        System.out.println("HaltestellenWidget::updateWidget board"); //NON-NLS

        if(stop == null) return;
        OPNV opnv = stop.getOPNV();

        try {
            Parser parser = opnv.getParserResult(responseString);

            boolean isOPNVbestChoice = WidgetManager.getInstance().getWidgetData(widgetId).getRegPageSettings().receiveRatings(context, parser, opnv);
            if(!isOPNVbestChoice) return;

            // save settings
            WidgetManager.getInstance().saveWidget(context, widgetId);

            new WidgetUI().fillUI(context, widgetId, parser);
        }
        catch (Exception e) {
            System.out.println("parser exception"); //NON-NLS
            System.out.println("updateBoard exception response: " + responseString); //NON-NLS
            e.printStackTrace();
        }
    }
}