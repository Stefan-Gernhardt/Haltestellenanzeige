package org.sge.haltestellenanzeige.activity;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.ui.ChangeStopActivity;
import org.sge.haltestellenanzeige.ui.CustomScrollView;
import org.sge.haltestellenanzeige.ui.DisplayActivity;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;


public class MainActivity extends DisplayActivity implements GestureDetector.OnGestureListener {
    public final static int INIT_STATION_ID = 15537;
    private Button vorwaertsButton;
    private Button refreshButton;
    private final MainActivity mainActiviy = this;
    private GestureDetectorCompat mDetector = null;
    public MainActivity() {
        super("", 0);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate panel 1"); //NON-NLS
        setContentView(R.layout.activity_main);

        initResultTable();
        initRefreshButton();
        initChangeStationButton();
        initVorwaertsButton();
        // initRueckwaertsButton();
        initCustomScrollView();

        // init/reset letzteAktualisierung
        new UI_StationDisplay().resetLetzteAktualisierung(displayTimerActivity, "", null);

        // Instantiate the gesture detector with the
        // application context and an implementation of
        // GestureDetector.OnGestureListener
        mDetector = new GestureDetectorCompat(this,this);
    }


    @Override
    public void onResume() {
        super.onResume();
        System.out.println("onResume"); //NON-NLS
        DisplayTimerActivity.setCurrentDisplayActivity(this);
        loadSettings();
        startTimer(); //startTimer() -> //BahnRequest.createBahnRequestAsynchronWithTag(getApplicationContext(), displayTimerActivity, Settings.getInstance().getRegPageSettings(getActivityNumber()));
    }


    @Override
    protected void onStop () {
        super.onStop();
        //BahnRequest.cancelAll(this.getApplicationContext());
    }


    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        // System.out.println("onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState (Bundle outState) {
        // System.out.println("onRestoreInstanceState");
    }


    @Override
    public void onPause() {
        super.onPause();
        timerHandler.removeCallbacks(timerRunnable);
    }


    private void initCustomScrollView() {
        CustomScrollView customScrollView = (CustomScrollView)findViewById(R.id.customscrollview);
        customScrollView.setActivty(this);
    }


    private void initVorwaertsButton() {
        vorwaertsButton = (Button) findViewById(R.id.buttonNext);
        vorwaertsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("vorwaerts button pressed"); //NON-NLS
                startActivity(new Intent(MainActivity.this, Display2Activity.class));
            }
        });
    }


    private void initRefreshButton() {
        refreshButton = (Button) findViewById(R.id.refreshButton);
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("refresh button createBahnRequestAsynchronWithTag"); //NON-NLS
                BahnRequest.createBahnRequestAsynchronWithTag(getApplicationContext(), displayTimerActivity, null, -1, Settings.getInstance().getRegPageSettings(getActivityNumber()));
            }
        });
    }


    @Override
    public boolean onTouchEvent(MotionEvent event){
        // System.out.println("MainActivity::onTouchEvent");
        this.mDetector.onTouchEvent(event);
        // Be sure to call the superclass implementation
        return super.onTouchEvent(event);
    }


    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }


    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        System.out.println("MainActivity::onFling: " + e1.toString() + e2.toString()); //NON-NLS

        if(e1.getX() - e2.getX() > UI_StationDisplay.SWIPE_MIN_DISTANCE && Math.abs(velocityX) > UI_StationDisplay.SWIPE_THRESHOLD_VELOCITY) {
            System.out.println("onFling right to left"); //NON-NLS
            startActivity(new Intent(MainActivity.this, Display2Activity.class));
            return false; // Right to left
        }  else if (e2.getX() - e1.getX() > UI_StationDisplay.SWIPE_MIN_DISTANCE && Math.abs(velocityX) > UI_StationDisplay.SWIPE_THRESHOLD_VELOCITY) {
            System.out.println("onFling left to right"); //NON-NLS
            return false; // Left to right
        }

        if(e1.getY() - e2.getY() > UI_StationDisplay.SWIPE_MIN_DISTANCE && Math.abs(velocityY) > UI_StationDisplay.SWIPE_THRESHOLD_VELOCITY) {
            return false; // Bottom to top
        }  else if (e2.getY() - e1.getY() > UI_StationDisplay.SWIPE_MIN_DISTANCE && Math.abs(velocityY) > UI_StationDisplay.SWIPE_THRESHOLD_VELOCITY) {
            return false; // Top to bottom
        }
        return false;
    }

    public void initResultTable() {
        // System.out.println("initResultTableApp");
        LinearLayout resultTable = (LinearLayout) findViewById(R.id.resultTable);
        initResultTable(resultTable);
    }
}

// todo: https://developer.android.com/distribute/
// todo: https://developer.android.com/distribute/best-practices/launch/launch-checklist
// todo: https://play.google.com/intl/de/about/monetization-ads/
// todo: alle OPNVs Deutschland: https://www.pro-bahn.de/auskunft/deutschland.htm
// todo: alle OPNVs Deutschland: https://orange.handelsblatt.com/artikel/34895
// todo: Suche nach //!

// todo: bei SVV wurde "Fahrt fällt aus" nicht angezeigt
// todo: VRN manchmal Verkehrshinweis https://www.vrn.de/mng/#/XSLT_DM_REQUEST?dm=6002475
// todo: nice to have: Grenzfall Test Haltestellen abfragen, die so selten fahren, dass manchmal keine Daten zurückkommen z.B. Baeckerei Feld, Lummerschied Heusweiler Berschweiler Ölmühle)
// todo: nice to have: Auto-Refresh bei Widget optional machen
// todo: nice to have: widget: wenn man Fragezeichen beim Widget hat, schneller versuchen zu aktualisieren, alle 5 Sekunden
// todo: nice to have: vielleicht muss die Haltestellensuche fürr SVV und DB doch wieder auf type alle bzw. 255 umgestellt werden
// todo: nice to have: Neustart des Telefons und der Name der Station wird angezeigt, aber keine Daten. Die Tabelle bleibt leer. Welche Methoden werden beim Widget nach einem Handy - Neustart aufgerufen https://stackoverflow.com/questions/34556834/android-appwidget-with-remoteviews-not-updating-after-reboot
// todo: nice to have: ListView fuer ScrollList im Widget: https://developer.android.com/guide/topics/appwidgets/
// Lübeck
// Kassel
// Abfahrtsmonitor ULM: https://www.ding.eu/de/fahrplan/abfahrtsmonitor/
// Abfahrtsmonitor Freiburg: https://www.efa-bw.de/vagfr3/XSLT_DM_REQUEST?&language=de
// Westfalenplan: https://westfalenfahrplan.de/std3/XSLT_DM_REQUEST?&language=de
// Braunschweig: http://bsvg.efa.de/bsvagstd/XSLT_TRIP_REQUEST2?language=de
// Karlsruhe https://www.kvv.de/en/plan-trip/departure-monitor.html?itdLPxx_formAction=%2Ffahrt-planen%2Fabfahrtsmonitor.html&language=de&std3_suggestMacro=std3_suggest&std3_commonMacro=dm&std3_contractorMacro=&includeCompleteStopSeq=1&mergeDep=1&mode=direct&useRealtime=1&nameInfo_dm=7032585%3A%24ZN&type_dm=any&sessionID=0&requestID=0&itdLPxx_directRequest=1&coordOutputFormat=WGS84%5Bdd.ddddd%5D&cHash=1d9b0f1a06db99ff40a5be403c29e0a1
// Baden-Wü.: http://efa.naldo.de/nvbw/XSLT_TRIP_REQUEST2?language=de
// RNN: https://www.rnn.info/fahrplan/abfahrtsmonitor
// Kiel: https://www.kvg-kiel.de/fahrplan/echtzeit/
// chemnitz: https://www.vms.de/fahrplan/abfahrtsmonitor/
// SWU: https://echtzeit.swu.de/haltestelle/abfahrtsmonitor.html#