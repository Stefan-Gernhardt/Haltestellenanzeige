package org.sge.haltestellenanzeige.ui;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TableRow;
import android.widget.TextView;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.settings.RegPageSettings;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.util.Util;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.opnv.OPNV;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Delayed;

import static org.sge.haltestellenanzeige.settings.Settings.getDefaultStop;


/**
 * Created by Admin on 03.11.2017.
 */

public abstract class DisplayTimerActivity extends AppCompatActivity {
    protected final DisplayTimerActivity displayTimerActivity = this;
    public static final int REFRESH_INTERVAL_SECONDS = 30;
    public static final int RETRY_INTERVAL_MILLIS = 1300;
    public static final int DELAY_MILLIS = 200;
    public static final int INITIAL_DELAY = 0;
    private boolean initial = true;

    private static String letzteAktualisierungGlobal = null;

    private int activityNumber;
    private String displayNumber = "";
    static private DisplayTimerActivity currentActivity = null;
    public final static int COUNT_ACTIVITIES = 4;
    static private List<DisplayTimerActivity> activityList = new ArrayList<DisplayTimerActivity>(COUNT_ACTIVITIES);

    private List<Integer> abfahrtIdList  = new ArrayList<Integer>();
    private List<Integer> delayIdList    = new ArrayList<Integer>();
    private List<Integer> linieIdList    = new ArrayList<Integer>();
    private List<Integer> richtungIdList = new ArrayList<Integer>();

    public List<Integer> getAbfahrtIdList()  { return abfahrtIdList; }
    public List<Integer> getDelayIdList()    { return delayIdList; }
    public List<Integer> getLinieIdList()    { return linieIdList; }
    public List<Integer> getRichtungIdList() { return richtungIdList; }


    //--- abstract methods ----------------------
    abstract public void sendResponse(OPNV opnv, String station, String responseString);

    //--- class methods ---------------------------
    public DisplayTimerActivity(String displayNumberPara, int activityNumberPara) {
        super();

        displayNumber    = displayNumberPara;
        activityNumber   = activityNumberPara;
    }

    public String getStationNameValue() { return Settings.getInstance().getStationName(activityNumber); }
    public String getDisplayNumber() { return displayNumber; }
    public int getActivityNumber() { return activityNumber; }

    public String getLastRefresh() {
        return letzteAktualisierungGlobal;
    }

    protected void setLastRefresh() {
        letzteAktualisierungGlobal = Util.getTimeStamp();
    }

    long startTime = 0; // System.currentTimeMillis();
    TextView timerTextView = null;

    public int getCountDown() {
        long millis = System.currentTimeMillis() - startTime;
        int seconds = (int) (millis / 1000);

        int countDownTime = REFRESH_INTERVAL_SECONDS - seconds;
        if(countDownTime < 0) countDownTime = 0;

        return countDownTime;
    }


    public void startTimer() {
        startTime = System.currentTimeMillis();
        timerHandler.postDelayed(timerRunnable, INITIAL_DELAY);
    }


    public void resetTimer() {
        startTime = System.currentTimeMillis();
    }

    public void startHandler() {
        timerHandler.postDelayed(timerRunnable, DELAY_MILLIS);
    }

    public void stopHandler() {
        timerHandler.removeCallbacks(timerRunnable);
    }


    public boolean stationSelectedForThisDisplayUI() {
        String stationName = Settings.getInstance().getRegPageSettings(activityNumber).getStationName();
        if(stationName == null) return false;
        if(stationName.isEmpty()) return false;

        String defaultStopName = Settings.getDefaultStop(this);
        if(defaultStopName.contentEquals(stationName)) return false;

        return true;
    }


    // runs without a timer by reposting this handler at the end of the runnable
    public Handler timerHandler = new Handler();
    public Runnable timerRunnable = new Runnable() {

        @Override
        public void run() {
            long millis = System.currentTimeMillis() - startTime;
            int seconds = (int) (millis / 1000);

            if(stationSelectedForThisDisplayUI()) new UI_StationDisplay().fillLetzteAktualisierung(displayTimerActivity, displayNumber, null);

            boolean lastResponseWasSuccessFull = new UI_StationDisplay().lastResponseWasSuccessfull(displayTimerActivity, displayNumber);

            if(initial || (seconds > REFRESH_INTERVAL_SECONDS) || ((!lastResponseWasSuccessFull) && (millis > RETRY_INTERVAL_MILLIS))) {
                // System.out.println("seconds: " + seconds + "  lastResponseWasSuccessFull: " + lastResponseWasSuccessFull + "  millis: " + millis);
                resetTimer();
                System.out.println("timerRunnable createBahnRequestAsynchronWithTag"); //NON-NLS
                BahnRequest.createBahnRequestAsynchronWithTag(getApplicationContext(), displayTimerActivity, null, -1, Settings.getInstance().getRegPageSettings(activityNumber));
                initial = false;
            }

            timerHandler.postDelayed(this, DELAY_MILLIS);
        }
    };


    static public void setCurrentDisplayActivity(DisplayTimerActivity activity) {
        System.out.println("set current display activity: " + activity); //NON-NLS
        currentActivity = activity;
    }


    static public DisplayTimerActivity getCurrentDisplayActivity() {
        return currentActivity;
    }


    private void setRadioButtonVerkehrsart(boolean nurBahn) {
        RadioButton radioButtonNurBahn  = (RadioButton) findViewById(Util.getResourceID("radioButtonNurBahn" + displayNumber, "id", getApplicationContext())); //NON-NLS
        RadioButton radioButtonAlle     = (RadioButton) findViewById(Util.getResourceID("radioButtonAlle"    + displayNumber, "id", getApplicationContext())); //NON-NLS


        if(nurBahn) {
            radioButtonNurBahn.setChecked(true);
            radioButtonAlle.setChecked(false);
        }
        else {
            radioButtonNurBahn.setChecked(false);
            radioButtonAlle.setChecked(true);
        }
    }


    public void setStationNameDisplayedOnUI(String stationName) {
        TextView name  = (TextView) findViewById(Util.getResourceID("textView1" + displayNumber, "id", getApplicationContext())); //NON-NLS
        name.setText(stationName);
    }


    protected void refreshStationNameOnUI() {
        TextView name  = (TextView) findViewById(Util.getResourceID("textView1" + displayNumber, "id", getApplicationContext())); //NON-NLS
        name.setText(Settings.getInstance().getStationName(this.getActivityNumber()));
    }


    protected void loadSettings() {
        System.out.println("DisplayTimerActivity::loadSettings()"); //NON-NLS
        Settings.getInstance().loadSettings(this); //NON-NLS
        refreshStationNameOnUI(); //NON-NLS
    }


    public void initResultTable(LinearLayout resultTable) {
        // System.out.println("initResultTableApp");

        for(int row=0; row<UI_StationDisplay.NUMBER_ROWS; row++) {
            final TableRow tableRowXML = (TableRow) getLayoutInflater().inflate(R.layout.result_table, null);

            //Filling in cells
            TextView tv = null;

            tv = (TextView) tableRowXML.findViewById(R.id.textViewAbfahrt1);
            int idA = View.generateViewId();
            getAbfahrtIdList().add(row, idA);
            tv.setId(idA);
            tv.setText("...");

            tv = (TextView) tableRowXML.findViewById(R.id.textViewDelay1);
            int idD = View.generateViewId();
            getDelayIdList().add(row, idD);
            tv.setId(idD);
            tv.setText("...");

            tv = (TextView) tableRowXML.findViewById(R.id.textViewLinie1);
            int idL = View.generateViewId();
            getLinieIdList().add(row, idL);
            tv.setId(idL);
            tv.setText("...");

            tv = (TextView) tableRowXML.findViewById(R.id.textViewRichtung1);
            int idR = View.generateViewId();
            getRichtungIdList().add(row, idR);
            tv.setId(idR);
            tv.setText("...");

            resultTable.addView(tableRowXML);
        }
    }
}
