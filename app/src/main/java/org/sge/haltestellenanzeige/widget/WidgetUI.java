package org.sge.haltestellenanzeige.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Color;
import android.widget.RemoteViews;

import org.sge.haltestellenanzeige.BuildConfig;
import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.net.StationBoardInterface;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;
import org.sge.haltestellenanzeige.util.Util;

import static org.sge.haltestellenanzeige.ui.UI_StationDisplay.maxLengthColumnString;
import static org.sge.haltestellenanzeige.ui.UI_StationDisplay.maxLengthDestinationString;

public class WidgetUI {
    public final static String INIT_CHARACTOR_DEPARTURE_TABLE = "...";
    
    public void fillUI(Context context, int widgetId, Parser parser) {
        if (parser == null) {
            System.out.println("parserContent is empty"); //NON-NLS
            return;
        }

        System.out.println("*** fill widget UI ******************************************************************************************"); //NON-NLS

        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);
        // views.setTextViewText(R.id.textViewAbfahrtWidget0, "response received");

        fillLetzteAktualisierung(context, parser, widgetId, views);
        fillAbfahrt(context, parser, views);
        fillPrognose(context, parser, views);
        fillLinie(context, parser, views);
        fillRichtung(context, parser, views);


        // call update
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        appWidgetManager.updateAppWidget(widgetId, views);
    }


    public void resetUI(Context context, int widgetId) {
        System.out.println("*** reset widget UI ******************************************************************************************"); //NON-NLS

        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);

        resetLetzteAktualisierung(context, widgetId, views);
        resetAbfahrt(context, views);
        resetPrognose(context, views);
        resetLinie(context, views);
        resetRichtung(context, views);


        // call update
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        appWidgetManager.updateAppWidget(widgetId, views);
    }


    public void fillLetzteAktualisierung(Context context, StationBoardInterface content, int widgetId, RemoteViews views) {
        if(BuildConfig.DEBUG) {
            String aktualisierungsText = context.getResources().getString(R.string.app_aktualisierungstext) + Util.getTimeStamp() + " (" + content.getOPNVTag() + ")";
            WidgetManager.getInstance().getWidgetData(widgetId).setAktualisierungsText(aktualisierungsText);
            views.setTextViewText(R.id.textViewLetzteAktualisierungWidget, aktualisierungsText);
        }
        else {
            String aktualisierungsText = context.getResources().getString(R.string.app_aktualisierungstext) + Util.getTimeStamp();
            WidgetManager.getInstance().getWidgetData(widgetId).setAktualisierungsText(aktualisierungsText);
            views.setTextViewText(R.id.textViewLetzteAktualisierungWidget, aktualisierungsText);
        }
    }


    public void resetLetzteAktualisierung(Context context, int widgetId, RemoteViews views) {
        String aktualisierungsText = context.getResources().getString(R.string.app_aktualisierungstext_initial);
        WidgetManager.getInstance().getWidgetData(widgetId).setAktualisierungsText(aktualisierungsText);
        views.setTextViewText(R.id.textViewLetzteAktualisierungWidget, aktualisierungsText);
    }


    public void fillAbfahrt(Context context, StationBoardInterface content, RemoteViews views) {
        System.out.println("fillAbfahrt widget"); //NON-NLS

        views.setTextViewText(R.id.textViewAbfahrtWidget0, Util.cutString(content.getDepartureRow(0), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget1, Util.cutString(content.getDepartureRow(1), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget2, Util.cutString(content.getDepartureRow(2), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget3, Util.cutString(content.getDepartureRow(3), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget4, Util.cutString(content.getDepartureRow(4), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget5, Util.cutString(content.getDepartureRow(5), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget6, Util.cutString(content.getDepartureRow(6), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget7, Util.cutString(content.getDepartureRow(7), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget8, Util.cutString(content.getDepartureRow(8), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget9, Util.cutString(content.getDepartureRow(9), maxLengthColumnString));

        views.setTextViewText(R.id.textViewAbfahrtWidget10, Util.cutString(content.getDepartureRow(10), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget11, Util.cutString(content.getDepartureRow(11), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget12, Util.cutString(content.getDepartureRow(12), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget13, Util.cutString(content.getDepartureRow(13), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget14, Util.cutString(content.getDepartureRow(14), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget15, Util.cutString(content.getDepartureRow(15), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget16, Util.cutString(content.getDepartureRow(16), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget17, Util.cutString(content.getDepartureRow(17), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget18, Util.cutString(content.getDepartureRow(18), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget19, Util.cutString(content.getDepartureRow(19), maxLengthColumnString));

        views.setTextViewText(R.id.textViewAbfahrtWidget20, Util.cutString(content.getDepartureRow(20), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget21, Util.cutString(content.getDepartureRow(21), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget22, Util.cutString(content.getDepartureRow(22), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget23, Util.cutString(content.getDepartureRow(23), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget24, Util.cutString(content.getDepartureRow(24), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget25, Util.cutString(content.getDepartureRow(25), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget26, Util.cutString(content.getDepartureRow(26), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget27, Util.cutString(content.getDepartureRow(27), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget28, Util.cutString(content.getDepartureRow(28), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget29, Util.cutString(content.getDepartureRow(29), maxLengthColumnString));

        views.setTextViewText(R.id.textViewAbfahrtWidget30, Util.cutString(content.getDepartureRow(30), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget31, Util.cutString(content.getDepartureRow(31), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget32, Util.cutString(content.getDepartureRow(32), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget33, Util.cutString(content.getDepartureRow(33), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget34, Util.cutString(content.getDepartureRow(34), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget35, Util.cutString(content.getDepartureRow(35), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget36, Util.cutString(content.getDepartureRow(36), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget37, Util.cutString(content.getDepartureRow(37), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget38, Util.cutString(content.getDepartureRow(38), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget39, Util.cutString(content.getDepartureRow(39), maxLengthColumnString));

        views.setTextViewText(R.id.textViewAbfahrtWidget40, Util.cutString(content.getDepartureRow(40), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget41, Util.cutString(content.getDepartureRow(41), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget42, Util.cutString(content.getDepartureRow(42), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget43, Util.cutString(content.getDepartureRow(43), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget44, Util.cutString(content.getDepartureRow(44), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget45, Util.cutString(content.getDepartureRow(45), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget46, Util.cutString(content.getDepartureRow(46), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget47, Util.cutString(content.getDepartureRow(47), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget48, Util.cutString(content.getDepartureRow(48), maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget49, Util.cutString(content.getDepartureRow(49), maxLengthColumnString));
    }


    public void resetAbfahrt(Context context, RemoteViews views) {
        System.out.println("resetAbfahrt widget"); //NON-NLS

        views.setTextViewText(R.id.textViewAbfahrtWidget0, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget1, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE , maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget2, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE , maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget3, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE , maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget4, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE , maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget5, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE , maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget6, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE , maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget7, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE , maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget8, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE , maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget9, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE , maxLengthColumnString));

        views.setTextViewText(R.id.textViewAbfahrtWidget10, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget11, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget12, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget13, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget14, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget15, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget16, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget17, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget18, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget19, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));

        views.setTextViewText(R.id.textViewAbfahrtWidget20, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget21, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget22, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget23, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget24, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget25, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget26, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget27, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget28, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget29, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));

        views.setTextViewText(R.id.textViewAbfahrtWidget30, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget31, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget32, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget33, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget34, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget35, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget36, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget37, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget38, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget39, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));

        views.setTextViewText(R.id.textViewAbfahrtWidget40, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget41, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget42, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget43, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget44, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget45, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget46, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget47, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget48, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
        views.setTextViewText(R.id.textViewAbfahrtWidget49, Util.cutString(INIT_CHARACTOR_DEPARTURE_TABLE, maxLengthColumnString));
    }


    public void fillPrognose(Context context, StationBoardInterface content, RemoteViews views) {
        System.out.println("fillPrognose widget"); //NON-NLS

        fillPrognoseTextView(views, R.id.textViewDelayWidget0, content.getPredictionRow(0), content.getPredictionSeverityRow(0), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget1, content.getPredictionRow(1), content.getPredictionSeverityRow(1), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget2, content.getPredictionRow(2), content.getPredictionSeverityRow(2), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget3, content.getPredictionRow(3), content.getPredictionSeverityRow(3), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget4, content.getPredictionRow(4), content.getPredictionSeverityRow(4), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget5, content.getPredictionRow(5), content.getPredictionSeverityRow(5), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget6, content.getPredictionRow(6), content.getPredictionSeverityRow(6), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget7, content.getPredictionRow(7), content.getPredictionSeverityRow(7), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget8, content.getPredictionRow(8), content.getPredictionSeverityRow(8), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget9, content.getPredictionRow(9), content.getPredictionSeverityRow(9), context);

        fillPrognoseTextView(views, R.id.textViewDelayWidget10, content.getPredictionRow(10), content.getPredictionSeverityRow(10), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget11, content.getPredictionRow(11), content.getPredictionSeverityRow(11), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget12, content.getPredictionRow(12), content.getPredictionSeverityRow(12), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget13, content.getPredictionRow(13), content.getPredictionSeverityRow(13), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget14, content.getPredictionRow(14), content.getPredictionSeverityRow(14), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget15, content.getPredictionRow(15), content.getPredictionSeverityRow(15), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget16, content.getPredictionRow(16), content.getPredictionSeverityRow(16), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget17, content.getPredictionRow(17), content.getPredictionSeverityRow(17), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget18, content.getPredictionRow(18), content.getPredictionSeverityRow(18), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget19, content.getPredictionRow(19), content.getPredictionSeverityRow(19), context);

        fillPrognoseTextView(views, R.id.textViewDelayWidget20, content.getPredictionRow(20), content.getPredictionSeverityRow(20), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget21, content.getPredictionRow(21), content.getPredictionSeverityRow(21), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget22, content.getPredictionRow(22), content.getPredictionSeverityRow(22), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget23, content.getPredictionRow(23), content.getPredictionSeverityRow(23), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget24, content.getPredictionRow(24), content.getPredictionSeverityRow(24), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget25, content.getPredictionRow(25), content.getPredictionSeverityRow(25), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget26, content.getPredictionRow(26), content.getPredictionSeverityRow(26), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget27, content.getPredictionRow(27), content.getPredictionSeverityRow(27), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget28, content.getPredictionRow(28), content.getPredictionSeverityRow(28), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget29, content.getPredictionRow(29), content.getPredictionSeverityRow(29), context);

        fillPrognoseTextView(views, R.id.textViewDelayWidget30, content.getPredictionRow(30), content.getPredictionSeverityRow(30), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget31, content.getPredictionRow(31), content.getPredictionSeverityRow(31), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget32, content.getPredictionRow(32), content.getPredictionSeverityRow(32), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget33, content.getPredictionRow(33), content.getPredictionSeverityRow(33), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget34, content.getPredictionRow(34), content.getPredictionSeverityRow(34), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget35, content.getPredictionRow(35), content.getPredictionSeverityRow(35), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget36, content.getPredictionRow(36), content.getPredictionSeverityRow(36), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget37, content.getPredictionRow(37), content.getPredictionSeverityRow(37), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget38, content.getPredictionRow(38), content.getPredictionSeverityRow(38), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget39, content.getPredictionRow(39), content.getPredictionSeverityRow(39), context);

        fillPrognoseTextView(views, R.id.textViewDelayWidget40, content.getPredictionRow(40), content.getPredictionSeverityRow(40), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget41, content.getPredictionRow(41), content.getPredictionSeverityRow(41), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget42, content.getPredictionRow(42), content.getPredictionSeverityRow(42), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget43, content.getPredictionRow(43), content.getPredictionSeverityRow(43), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget44, content.getPredictionRow(44), content.getPredictionSeverityRow(44), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget45, content.getPredictionRow(45), content.getPredictionSeverityRow(45), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget46, content.getPredictionRow(46), content.getPredictionSeverityRow(46), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget47, content.getPredictionRow(47), content.getPredictionSeverityRow(47), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget48, content.getPredictionRow(48), content.getPredictionSeverityRow(48), context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget49, content.getPredictionRow(49), content.getPredictionSeverityRow(49), context);
    }


    public void resetPrognose(Context context, RemoteViews views) {
        System.out.println("resetPrognose widget"); //NON-NLS

        fillPrognoseTextView(views, R.id.textViewDelayWidget0, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget1, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget2, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget3, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget4, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget5, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget6, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget7, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget8, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget9, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);

        fillPrognoseTextView(views, R.id.textViewDelayWidget10, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget11, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget12, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget13, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget14, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget15, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget16, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget17, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget18, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget19, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);

        fillPrognoseTextView(views, R.id.textViewDelayWidget20, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget21, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget22, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget23, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget24, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget25, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget26, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget27, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget28, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget29, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);

        fillPrognoseTextView(views, R.id.textViewDelayWidget30, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget31, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget32, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget33, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget34, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget35, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget36, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget37, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget38, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget39, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);

        fillPrognoseTextView(views, R.id.textViewDelayWidget40, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget41, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget42, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget43, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget44, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget45, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget46, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget47, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget48, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
        fillPrognoseTextView(views, R.id.textViewDelayWidget49, INIT_CHARACTOR_DEPARTURE_TABLE, StationBoardInterface.DELAY_SERVERITY_UNKNOWN, context);
    }


    public void fillLinie(Context context, StationBoardInterface content, RemoteViews views) {
        System.out.println("fillLinie widget"); //NON-NLS

        views.setTextViewText(R.id.textViewLinieWidget0, Util.cutString(content.getLineRow(0), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget1, Util.cutString(content.getLineRow(1), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget2, Util.cutString(content.getLineRow(2), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget3, Util.cutString(content.getLineRow(3), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget4, Util.cutString(content.getLineRow(4), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget5, Util.cutString(content.getLineRow(5), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget6, Util.cutString(content.getLineRow(6), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget7, Util.cutString(content.getLineRow(7), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget8, Util.cutString(content.getLineRow(8), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget9, Util.cutString(content.getLineRow(9), maxLengthColumnString));

        views.setTextViewText(R.id.textViewLinieWidget10, Util.cutString(content.getLineRow(10), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget11, Util.cutString(content.getLineRow(11), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget12, Util.cutString(content.getLineRow(12), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget13, Util.cutString(content.getLineRow(13), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget14, Util.cutString(content.getLineRow(14), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget15, Util.cutString(content.getLineRow(15), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget16, Util.cutString(content.getLineRow(16), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget17, Util.cutString(content.getLineRow(17), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget18, Util.cutString(content.getLineRow(18), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget19, Util.cutString(content.getLineRow(19), maxLengthColumnString));

        views.setTextViewText(R.id.textViewLinieWidget20, Util.cutString(content.getLineRow(20), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget21, Util.cutString(content.getLineRow(21), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget22, Util.cutString(content.getLineRow(22), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget23, Util.cutString(content.getLineRow(23), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget24, Util.cutString(content.getLineRow(24), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget25, Util.cutString(content.getLineRow(25), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget26, Util.cutString(content.getLineRow(26), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget27, Util.cutString(content.getLineRow(27), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget28, Util.cutString(content.getLineRow(28), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget29, Util.cutString(content.getLineRow(29), maxLengthColumnString));

        views.setTextViewText(R.id.textViewLinieWidget30, Util.cutString(content.getLineRow(30), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget31, Util.cutString(content.getLineRow(31), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget32, Util.cutString(content.getLineRow(32), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget33, Util.cutString(content.getLineRow(33), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget34, Util.cutString(content.getLineRow(34), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget35, Util.cutString(content.getLineRow(35), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget36, Util.cutString(content.getLineRow(36), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget37, Util.cutString(content.getLineRow(37), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget38, Util.cutString(content.getLineRow(38), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget39, Util.cutString(content.getLineRow(39), maxLengthColumnString));

        views.setTextViewText(R.id.textViewLinieWidget40, Util.cutString(content.getLineRow(40), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget41, Util.cutString(content.getLineRow(41), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget42, Util.cutString(content.getLineRow(42), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget43, Util.cutString(content.getLineRow(43), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget44, Util.cutString(content.getLineRow(44), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget45, Util.cutString(content.getLineRow(45), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget46, Util.cutString(content.getLineRow(46), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget47, Util.cutString(content.getLineRow(47), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget48, Util.cutString(content.getLineRow(48), maxLengthColumnString));
        views.setTextViewText(R.id.textViewLinieWidget49, Util.cutString(content.getLineRow(49), maxLengthColumnString));
    }


    public void resetLinie(Context context, RemoteViews views) {
        System.out.println("resetLinie widget"); //NON-NLS

        views.setTextViewText(R.id.textViewLinieWidget0, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget1, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget2, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget3, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget4, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget5, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget6, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget7, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget8, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget9, INIT_CHARACTOR_DEPARTURE_TABLE);

        views.setTextViewText(R.id.textViewLinieWidget10, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget11, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget12, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget13, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget14, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget15, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget16, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget17, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget18, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget19, INIT_CHARACTOR_DEPARTURE_TABLE);

        views.setTextViewText(R.id.textViewLinieWidget20, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget21, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget22, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget23, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget24, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget25, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget26, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget27, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget28, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget29, INIT_CHARACTOR_DEPARTURE_TABLE);

        views.setTextViewText(R.id.textViewLinieWidget30, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget31, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget32, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget33, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget34, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget35, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget36, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget37, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget38, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget39, INIT_CHARACTOR_DEPARTURE_TABLE);

        views.setTextViewText(R.id.textViewLinieWidget40, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget41, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget42, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget43, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget44, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget45, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget46, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget47, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget48, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewLinieWidget49, INIT_CHARACTOR_DEPARTURE_TABLE);
    }


    private String getDestinationAndPlatform(Context context, StationBoardInterface content, int row) {
        String destination = Util.cutString(content.getDestinationRow(row), maxLengthDestinationString);
        String platform = Util.cutString(content.getPlatformRow(row), maxLengthDestinationString);

        if(platform != null) {
            if (!platform.isEmpty()) {
                String gleisAbk = context.getResources().getString(R.string.app_gleisabkuerzung);
                String platformFormatted = ", ".concat(gleisAbk).concat(" ").concat(platform);
                destination = Util.removeLineBreaks(destination + platformFormatted);
            }
        }

        return destination;
    }


    public void fillRichtung(Context context, StationBoardInterface content, RemoteViews views) {
        System.out.println("fillRichtung widget"); //NON-NLS

        views.setTextViewText(R.id.textViewRichtungWidget0, getDestinationAndPlatform( context, content,0));
        views.setTextViewText(R.id.textViewRichtungWidget1, getDestinationAndPlatform( context, content,1));
        views.setTextViewText(R.id.textViewRichtungWidget2, getDestinationAndPlatform( context, content,2));
        views.setTextViewText(R.id.textViewRichtungWidget3, getDestinationAndPlatform( context, content,3));
        views.setTextViewText(R.id.textViewRichtungWidget4, getDestinationAndPlatform( context, content,4));
        views.setTextViewText(R.id.textViewRichtungWidget5, getDestinationAndPlatform( context, content,5));
        views.setTextViewText(R.id.textViewRichtungWidget6, getDestinationAndPlatform( context, content,6));
        views.setTextViewText(R.id.textViewRichtungWidget7, getDestinationAndPlatform( context, content,7));
        views.setTextViewText(R.id.textViewRichtungWidget8, getDestinationAndPlatform( context, content,8));
        views.setTextViewText(R.id.textViewRichtungWidget9, getDestinationAndPlatform( context, content,9));

        views.setTextViewText(R.id.textViewRichtungWidget10, getDestinationAndPlatform( context, content,10));
        views.setTextViewText(R.id.textViewRichtungWidget11, getDestinationAndPlatform( context, content,11));
        views.setTextViewText(R.id.textViewRichtungWidget12, getDestinationAndPlatform( context, content,12));
        views.setTextViewText(R.id.textViewRichtungWidget13, getDestinationAndPlatform( context, content,13));
        views.setTextViewText(R.id.textViewRichtungWidget14, getDestinationAndPlatform( context, content,14));
        views.setTextViewText(R.id.textViewRichtungWidget15, getDestinationAndPlatform( context, content,15));
        views.setTextViewText(R.id.textViewRichtungWidget16, getDestinationAndPlatform( context, content,16));
        views.setTextViewText(R.id.textViewRichtungWidget17, getDestinationAndPlatform( context, content,17));
        views.setTextViewText(R.id.textViewRichtungWidget18, getDestinationAndPlatform( context, content,18));
        views.setTextViewText(R.id.textViewRichtungWidget19, getDestinationAndPlatform( context, content,19));

        views.setTextViewText(R.id.textViewRichtungWidget20, getDestinationAndPlatform( context, content,20));
        views.setTextViewText(R.id.textViewRichtungWidget21, getDestinationAndPlatform( context, content,21));
        views.setTextViewText(R.id.textViewRichtungWidget22, getDestinationAndPlatform( context, content,22));
        views.setTextViewText(R.id.textViewRichtungWidget23, getDestinationAndPlatform( context, content,23));
        views.setTextViewText(R.id.textViewRichtungWidget24, getDestinationAndPlatform( context, content,24));
        views.setTextViewText(R.id.textViewRichtungWidget25, getDestinationAndPlatform( context, content,25));
        views.setTextViewText(R.id.textViewRichtungWidget26, getDestinationAndPlatform( context, content,26));
        views.setTextViewText(R.id.textViewRichtungWidget27, getDestinationAndPlatform( context, content,27));
        views.setTextViewText(R.id.textViewRichtungWidget28, getDestinationAndPlatform( context, content,28));
        views.setTextViewText(R.id.textViewRichtungWidget29, getDestinationAndPlatform( context, content,29));

        views.setTextViewText(R.id.textViewRichtungWidget30, getDestinationAndPlatform( context, content,30));
        views.setTextViewText(R.id.textViewRichtungWidget31, getDestinationAndPlatform( context, content,31));
        views.setTextViewText(R.id.textViewRichtungWidget32, getDestinationAndPlatform( context, content,32));
        views.setTextViewText(R.id.textViewRichtungWidget33, getDestinationAndPlatform( context, content,33));
        views.setTextViewText(R.id.textViewRichtungWidget34, getDestinationAndPlatform( context, content,34));
        views.setTextViewText(R.id.textViewRichtungWidget35, getDestinationAndPlatform( context, content,35));
        views.setTextViewText(R.id.textViewRichtungWidget36, getDestinationAndPlatform( context, content,36));
        views.setTextViewText(R.id.textViewRichtungWidget37, getDestinationAndPlatform( context, content,37));
        views.setTextViewText(R.id.textViewRichtungWidget38, getDestinationAndPlatform( context, content,38));
        views.setTextViewText(R.id.textViewRichtungWidget39, getDestinationAndPlatform( context, content,39));

        views.setTextViewText(R.id.textViewRichtungWidget40, getDestinationAndPlatform( context, content,40));
        views.setTextViewText(R.id.textViewRichtungWidget41, getDestinationAndPlatform( context, content,41));
        views.setTextViewText(R.id.textViewRichtungWidget42, getDestinationAndPlatform( context, content,42));
        views.setTextViewText(R.id.textViewRichtungWidget43, getDestinationAndPlatform( context, content,43));
        views.setTextViewText(R.id.textViewRichtungWidget44, getDestinationAndPlatform( context, content,44));
        views.setTextViewText(R.id.textViewRichtungWidget45, getDestinationAndPlatform( context, content,45));
        views.setTextViewText(R.id.textViewRichtungWidget46, getDestinationAndPlatform( context, content,46));
        views.setTextViewText(R.id.textViewRichtungWidget47, getDestinationAndPlatform( context, content,47));
        views.setTextViewText(R.id.textViewRichtungWidget48, getDestinationAndPlatform( context, content,48));
        views.setTextViewText(R.id.textViewRichtungWidget49, getDestinationAndPlatform( context, content,49));
    }


    public void resetRichtung(Context context, RemoteViews views) {
        System.out.println("resetRichtung widget"); //NON-NLS

        views.setTextViewText(R.id.textViewRichtungWidget0, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget1, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget2, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget3, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget4, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget5, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget6, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget7, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget8, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget9, INIT_CHARACTOR_DEPARTURE_TABLE);

        views.setTextViewText(R.id.textViewRichtungWidget10, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget11, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget12, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget13, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget14, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget15, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget16, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget17, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget18, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget19, INIT_CHARACTOR_DEPARTURE_TABLE);

        views.setTextViewText(R.id.textViewRichtungWidget20, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget21, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget22, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget23, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget24, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget25, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget26, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget27, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget28, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget29, INIT_CHARACTOR_DEPARTURE_TABLE);

        views.setTextViewText(R.id.textViewRichtungWidget30, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget31, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget32, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget33, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget34, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget35, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget36, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget37, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget38, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget39, INIT_CHARACTOR_DEPARTURE_TABLE);

        views.setTextViewText(R.id.textViewRichtungWidget40, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget41, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget42, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget43, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget44, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget45, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget46, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget47, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget48, INIT_CHARACTOR_DEPARTURE_TABLE);
        views.setTextViewText(R.id.textViewRichtungWidget49, INIT_CHARACTOR_DEPARTURE_TABLE);
    }


    private void setTextColorGreenOrRed(RemoteViews views, int resId, int severityLevel) {
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_RED)       views.setTextColor(resId, Color.RED);
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_CANCELLED) views.setTextColor(resId, Color.RED);
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_YELLOW)    views.setTextColor(resId, Color.YELLOW);
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_GREEN)     views.setTextColor(resId, Color.GREEN);
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_UNKNOWN)   views.setTextColor(resId, Color.WHITE);
    }


    public void fillPrognoseTextView(RemoteViews views, int resId, String delayText, Integer severityLevel, Context context) {
        // get data
        int delayUnit = UI_StationDisplay.parseDelayUnit(delayText);
        if(delayUnit == StationBoardInterface.DELAY_UNIT_PKTL || severityLevel == StationBoardInterface.DELAY_SERVERITY_GREEN) {
            delayText = context.getResources().getString(R.string.app_ride_on_time);
        }
        else if((delayText == null) || (delayText.isEmpty())){
        }
        else if(delayUnit == StationBoardInterface.DELAY_UNIT_MINUTEN){
            delayText = "+" + delayText + " " + context.getResources().getString(R.string.app_delay_unit_minutes);
        }
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_CANCELLED) {
            delayText = context.getResources().getString(R.string.app_ride_cancelled);
        }

        // fill ui controls
        views.setTextViewText(resId, Util.cutString(delayText, maxLengthColumnString));
        setTextColorGreenOrRed(views, resId, severityLevel);
    }

}
