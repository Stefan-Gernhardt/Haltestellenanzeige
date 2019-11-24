package org.sge.haltestellenanzeige.ui;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextView;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.parser.parserSuggestionList.ParserSuggestionList_DB_SVV;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.widget.HaltestellenWidget;
import org.sge.haltestellenanzeige.widget.WidgetManager;
import org.sge.haltestellenanzeige.widget.WidgetUI;

import java.util.ArrayList;
import java.util.List;

import static org.sge.haltestellenanzeige.widget.HaltestellenWidget.INTENT_EXTRA_PARAMETER_WIDGET_ID;
import static org.sge.haltestellenanzeige.widget.HaltestellenWidget.INTENT_EXTRA_PARAMETER_WIDGET_MODE;

public class ChangeStopActivity extends AppCompatActivity implements View.OnClickListener {

    private Button searchButton = null;
    private Button searchResetButton = null;
    private Button takeOverButton = null;

    private EditText editText = null;
    private List<TextView> tvList = new ArrayList<TextView>();
    private ArrayList<Stop> suggestionList = new ArrayList<Stop>();
    private int selectedIndex = -1;

    private int widgetMode = 0;
    private int widgetId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("ChangeStopActivity::onCreate()"); //NON-NLS
        setContentView(R.layout.activity_change_stop);

        Intent intent = getIntent();
        widgetId = intent.getIntExtra(INTENT_EXTRA_PARAMETER_WIDGET_ID, 0);
        widgetMode = intent.getIntExtra(INTENT_EXTRA_PARAMETER_WIDGET_MODE, 0);
        System.out.println("   widget mode: " + widgetMode + "   widget id: " + widgetId); //NON-NLS

        initSearchResetButton();
        initSearchStationButton();
        // initTakeOverButton(this);
        initChangeTextListener();
    }


    private void initChangeTextListener() {
        final ChangeStopActivity changeStopActivity = this;

        editText = (EditText) findViewById(R.id.plain_text_input);
        editText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                String text = editText.getText().toString();
                // System.out.println("edit text has changed: " + text + " " + text.length());
                if (text.length() >= 1) enableSearchButton(true);
                else enableSearchButton(false);

                if (text.length() >= 1) enableResetButton(true);

                if (text.length() >= 1)
                    BahnRequest.createSuggestionRequestAsynchron(getApplicationContext(), changeStopActivity, getEditFieldContent());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }


    private String getEditFieldContent() {
        editText = (EditText) findViewById(R.id.plain_text_input);
        return editText.getText().toString();
    }


    private void clearEditField() {
        editText = (EditText) findViewById(R.id.plain_text_input);
        editText.setText("");
    }


    private void initSearchStationButton() {
        final ChangeStopActivity changeStopActivity = this;
        searchButton = (Button) findViewById(R.id.searchStationButton);
        enableSearchButton(false);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("search station button pressed"); //NON-NLS
                clearLists();
                // enableTakeOverButton(false);
                BahnRequest.createSuggestionRequestAsynchron(getApplicationContext(), changeStopActivity, getEditFieldContent());
            }
        });
    }


    private void initSearchResetButton() {
        final ChangeStopActivity changeStopActivity = this;
        searchResetButton = (Button) findViewById(R.id.clearButton);
        enableResetButton(false);
        searchResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("search reset button pressed"); //NON-NLS
                clearEditField();
                clearLists();
                // enableTakeOverButton(false);
                enableSearchButton(false);
                enableResetButton(false);
            }
        });
    }


    /*
    private void enableTakeOverButton(boolean enable) {
        Button takeOverButton = (Button) findViewById(R.id.selectStationButton);
        takeOverButton.setEnabled(enable);
    }
    */


    private void enableResetButton(boolean enable) {
        Button searchButton = (Button) findViewById(R.id.clearButton);
        searchResetButton.setEnabled(enable);
    }


    private void enableSearchButton(boolean enable) {
        Button searchButton = (Button) findViewById(R.id.searchStationButton);
        searchButton.setEnabled(enable);
    }


    /*
    private void initTakeOverButton(final Context context) {
        final ChangeStopActivity changeStopActivity = this;
        takeOverButton = (Button) findViewById(R.id.selectStationButton);
        enableTakeOverButton(false);
        // takeOverButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        takeOverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("take over button pressed");

                String stationName  = suggestionList.get(selectedIndex).getName();
                int stationExtId = Integer.parseInt(suggestionList.get(selectedIndex).getId());
                double xCoord = suggestionList.get(selectedIndex).getXCoord();
                double yCoord = suggestionList.get(selectedIndex).getYCoord();

                System.out.println("set station ext id to: " + stationExtId);
                System.out.println("set station name to: " + stationName);

                if(widgetMode == 0) {
                    DisplayTimerActivity a = DisplayTimerActivity.getCurrentDisplayActivity();
                    Settings.getInstance().setStationName(a.getActivityNumber(), stationName);
                    Settings.getInstance().setStation(a.getApplicationContext(), a.getActivityNumber(), stationExtId, stationName, xCoord, yCoord, 0, 0);
                    Settings.getInstance().saveSettings(a.getApplicationContext());

                    Intent intent = new Intent(ChangeStopActivity.this, a.getClass());
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
                else {
                    WidgetManager.getInstance().getWidgetData(widgetId).setStation(suggestionList.get(selectedIndex));
                    WidgetManager.getInstance().saveWidget(context, widgetId);

                    // update station name on the widget
                    RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);
                    views.setTextViewText(R.id.textViewStationNameWidget,suggestionList.get(selectedIndex).getName());
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    appWidgetManager.updateAppWidget(widgetId,views);

                    finish();
                    HaltestellenWidget.refreshBoard(context, widgetId);
                }
            }
        });
    }
    */


    private void clearLists() {
        System.out.println("clear lists"); //NON-NLS

        LinearLayout lo = (LinearLayout) findViewById(R.id.suggestionList);
        lo.removeAllViews();
        tvList.clear();
        suggestionList.clear();
    }


    private void fillResultList() {
        LinearLayout lo = (LinearLayout) findViewById(R.id.suggestionList);

        for (int i = 0; i < suggestionList.size(); i++) {
            TextView textView = new TextView(this);
            textView.setId(i);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18.0F); // android:textSize="18sp"
            textView.setClickable(true);
            textView.setOnClickListener(this);
            tvList.add(textView);
            // System.out.println("add station name suggestion: " + i);

            textView.setText(suggestionList.get(i).getName());
            lo.addView(textView);
        }

    }


    public void sendSuggestionResponse(String jsonString) {
        System.out.println("suggestion response has arrived"); //NON-NLS
        // System.out.println(jsonString);

        clearLists();
        try {
            suggestionList = new ParserSuggestionList_DB_SVV(OPNV_BahnDB.getInstance(), jsonString).getList();
        } catch (Exception e) {
            System.out.println("parser exception"); //NON-NLS
            System.out.println("sendSuggestionResponse response: " + jsonString); //NON-NLS
        }

        fillResultList();
    }


    /*
    @Override
    public void onClick(View v) {
        System.out.println("on text view clicked id: " + v.getId() + " String: " + ((TextView)v).getText().toString());
        EditText ed = (EditText)findViewById(R.id.plain_text_input);
        selectedIndex = v.getId();
        ed.setText(suggestionList.get(selectedIndex).getName());
        enableTakeOverButton(true);
    }
    */


    public void updateStationNameOnTheWidget(Context context) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);
        views.setTextViewText(R.id.textViewStationNameWidget, suggestionList.get(selectedIndex).getName());
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        appWidgetManager.updateAppWidget(widgetId, views);
    }


    public void resetWidgetUI(Context context) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.haltestellen_appwidget);
        new WidgetUI().resetUI(context, widgetId);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        appWidgetManager.updateAppWidget(widgetId, views);
    }


    @Override
    public void onClick(View v) {
        System.out.println("on text view clicked id: " + v.getId() + " String: " + ((TextView)v).getText().toString()); //NON-NLS
        Context context = this.getApplicationContext();
        EditText ed = (EditText)findViewById(R.id.plain_text_input);
        selectedIndex = v.getId();

        String stationName  = suggestionList.get(selectedIndex).getName();
        int stationExtId = Integer.parseInt(suggestionList.get(selectedIndex).getId());
        double xCoord = suggestionList.get(selectedIndex).getXCoord();
        double yCoord = suggestionList.get(selectedIndex).getYCoord();


        if(widgetMode == 0) { // app mode
            System.out.println("ChangeStopActivity::set station ext id to: " + stationExtId + "  " +  "set station name to: " + stationName); //NON-NLS

            DisplayTimerActivity a = DisplayTimerActivity.getCurrentDisplayActivity();

            Settings.getInstance().setStationName(a.getActivityNumber(), stationName);
            Settings.getInstance().setStation(a.getApplicationContext(), a.getActivityNumber(), stationExtId, stationName, xCoord, yCoord, 0, 0);
            Settings.getInstance().saveSettings(a.getApplicationContext());
            Settings.getInstance().getRegPageSettings(a.getActivityNumber()).setStopPrimaryOPNV(suggestionList.get(selectedIndex));

            Intent intent = new Intent(ChangeStopActivity.this, a.getClass());
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        else { // widget mode
            System.out.println("ChangeStopActivity::set station of widget " + widgetId + " to station " + suggestionList.get(selectedIndex).getName()); //NON-NLS

            // set station to widget
            WidgetManager.getInstance().getWidgetData(widgetId).getRegPageSettings().setStopPrimaryOPNV(suggestionList.get(selectedIndex));
            WidgetManager.getInstance().getWidgetData(widgetId).setStation(suggestionList.get(selectedIndex));

            // save widget settings
            WidgetManager.getInstance().saveWidget(context, widgetId);

            // display the new station name on the widget UI
            updateStationNameOnTheWidget(context);
            resetWidgetUI(context);

            // close this activity
            finish();

            // restart alarm
            HaltestellenWidget.restartAlarm(context);

            // request data from server and refresh board
            HaltestellenWidget.refreshBoard(context, widgetId);

            // startActivity(new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME));
            moveTaskToBack(true);
        }
    }
}

