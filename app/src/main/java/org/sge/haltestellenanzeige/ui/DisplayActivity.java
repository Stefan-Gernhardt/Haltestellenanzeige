package org.sge.haltestellenanzeige.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.activity.AboutActivity;
import org.sge.haltestellenanzeige.activity.MainActivity;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.settings.Settings;


/**
 * Created by Admin on 03.11.2017.
 */

public class DisplayActivity extends DisplayTimerActivity {

    //--- attributes ----------------------------
    protected final DisplayActivity displayActivity = this;
    private Button changeStationhButton = null;

    //--- class methods ---------------------------
    public DisplayActivity(String displayNumberPara, int activityNumber) {
        super(displayNumberPara, activityNumber);
    }


    public boolean isPortraitOrientation() {
        return getResources().getConfiguration().orientation ==Configuration.ORIENTATION_PORTRAIT;
    }


    public void sendResponse(OPNV opnv, String station, String responseString) {
        System.out.println("rrr sendResponse rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr"); //NON-NLS
        System.out.println("response has arrived at DisplayActivity " + this.getDisplayNumber() + " " + this.getActivityNumber() + " " + opnv.getTag() + " " + station); //NON-NLS
        // WriteAndReadFileUtil.writeStringToFile("htmlresoponse.html", responseString, getApplicationContext());
        try {
            Parser parser = opnv.getParserResult(responseString);

            boolean isOPNVbestChoice = Settings.getInstance().getRegPageSettings(getActivityNumber()).receiveRatings(getApplicationContext(), parser, opnv);
            if(!isOPNVbestChoice) return;

            Settings.getInstance().saveSettings(getApplicationContext());
            setStationNameDisplayedOnUI(station);
            setLastRefresh();

            fillUI(parser);
            resetTimer();
        }
        catch (Exception e) {
            System.out.println("parser exception"); //NON-NLS
            if(opnv != null) System.out.println("opnv: " + opnv.getTag()); //NON-NLS
            System.out.println("sendResponse exception response: " + responseString); //NON-NLS
        }
    }


    public void fillUI(Parser parser) {
        if (parser == null) {
            System.out.println("parserContent is empty"); //NON-NLS
            return;
        }

        new UI_StationDisplay().fillUI(parser, this, getDisplayNumber());
    }


    protected void initChangeStationButton() {
        changeStationhButton = (Button) findViewById(R.id.changeStationButton);
        changeStationhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("change station button pressed on a DisplyActivity"); //NON-NLS
                startActivity(new Intent(DisplayActivity.this, ChangeStopActivity.class));
            }
        });
    }


    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

            return true;
        }
        return super.onKeyLongPress(keyCode, event);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.job_status_option_menu, menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.app_reset) {
        // Toast.makeText(getApplicationContext(), getResources().getString(R.string.app_page_reset), Toast.LENGTH_LONG).show();
        // return true;
        //}
        // if (id == R.id.app_anerkennen) {
        //
        // return true;
        // }
        if (id == R.id.app_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            intent.putExtra("caller", this.getClass().getCanonicalName()); //NON-NLS
            startActivity(intent);

            return true;
        }


        if(id == R.id.app_auto_refresh_menu_entry) {
            if(item.isChecked()) {
                item.setChecked(false);
                stopHandler();
            }
            else {
                item.setChecked(true);
                startHandler();
            }
        }

        return super.onOptionsItemSelected(item);
    }


}
