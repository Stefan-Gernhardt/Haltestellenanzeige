package org.sge.haltestellenanzeige.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.ui.CustomScrollView;
import org.sge.haltestellenanzeige.ui.DisplayActivity;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;
import org.sge.haltestellenanzeige.ui.UI_StationDisplay;


public class Display2Activity extends DisplayActivity implements GestureDetector.OnGestureListener {
    public final static String DISPLAY_NUMBER = "D2"; //NON-NLS
    private Button refreshButton;
    private Button vorwaertsButton;
    private Button rueckwaertsButton;
    private GestureDetectorCompat mDetector = null;


    public Display2Activity() {
        super(DISPLAY_NUMBER, 1);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate panel 2"); //NON-NLS
        setContentView(R.layout.activity_display2);

        initResultTable();
        initRefreshButton();
        initChangeStationButton();
        initVorwaertsButton();
        initRueckwaertsButton();
        initCustomScrollView();

        // init/reset letzteAktualisierung
        new UI_StationDisplay().resetLetzteAktualisierung(displayTimerActivity, DISPLAY_NUMBER, null);

        mDetector = new GestureDetectorCompat(this,this);
    }


    @Override
    protected void onStop () {
        super.onStop();
        //BahnRequest.cancelAll(this.getApplicationContext());
    }


    @Override
    public void onResume() {
        super.onResume();
        System.out.println("onResume"); //NON-NLS
        DisplayTimerActivity.setCurrentDisplayActivity(this);
        loadSettings();
        startTimer();
        //startTimer -> BahnRequest.createBahnRequestAsynchronWithTag(getApplicationContext(), displayTimerActivity, Settings.getInstance().getRegPageSettings(getActivityNumber()));
    }


    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println("onSaveInstanceState"); //NON-NLS
    }


    @Override
    protected void onRestoreInstanceState (Bundle outState) {
        System.out.println("onRestoreInstanceState"); //NON-NLS
    }


    @Override
    public void onPause() {
        super.onPause();
        timerHandler.removeCallbacks(timerRunnable);
    }


    private void initRefreshButton() {
        refreshButton = (Button) findViewById(R.id.refreshButtonD2);
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("refresh button createBahnRequestAsynchronWithTag"); //NON-NLS
                BahnRequest.createBahnRequestAsynchronWithTag(getApplicationContext(), displayTimerActivity, null, -1, Settings.getInstance().getRegPageSettings(getActivityNumber()));
            }
        });
   }


    private void initVorwaertsButton() {
        vorwaertsButton = (Button) findViewById(R.id.buttonNextD2);
        vorwaertsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Display2Activity.this, Display3Activity.class));
            }
        });
    }


    private void initRueckwaertsButton() {
        rueckwaertsButton = (Button) findViewById(R.id.buttonBackD2);
        rueckwaertsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Display2Activity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right); // backward
            }
        });
    }


    private void initCustomScrollView() {
        CustomScrollView customScrollView = (CustomScrollView)findViewById(R.id.customscrollviewD2);
        customScrollView.setActivty(this);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event){
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


    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        // System.out.println("onFling: " + e1.toString() + e2.toString());

        if(e1.getX() - e2.getX() > UI_StationDisplay.SWIPE_MIN_DISTANCE && Math.abs(velocityX) > UI_StationDisplay.SWIPE_THRESHOLD_VELOCITY) {
            System.out.println("onFling right to left"); //NON-NLS
            startActivity(new Intent(Display2Activity.this, Display3Activity.class));
            return false; // Right to left
        }  else if (e2.getX() - e1.getX() > UI_StationDisplay.SWIPE_MIN_DISTANCE && Math.abs(velocityX) > UI_StationDisplay.SWIPE_THRESHOLD_VELOCITY) {
            System.out.println("onFling left to right"); //NON-NLS
            startActivity(new Intent(Display2Activity.this, MainActivity.class));
            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right); // backward
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
        System.out.println("initResultTableApp"); //NON-NLS
        LinearLayout resultTable = (LinearLayout) findViewById(R.id.resultTableD2);
        initResultTable(resultTable);
    }


}