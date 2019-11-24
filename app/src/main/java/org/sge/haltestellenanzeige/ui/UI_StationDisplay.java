package org.sge.haltestellenanzeige.ui;

import android.app.Activity;
import android.graphics.Color;
import android.widget.TextView;


import org.sge.haltestellenanzeige.BuildConfig;
import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.parser.parserStationBoard.Parser;
import org.sge.haltestellenanzeige.util.Util;
import org.sge.haltestellenanzeige.net.StationBoardInterface;

/**
 * Created by peter on 23.10.2017.
 */

public class UI_StationDisplay {
    public final static int NUMBER_ROWS = 50;
    public static final int SWIPE_MIN_DISTANCE = 250;       // 120
    public static final int SWIPE_THRESHOLD_VELOCITY = 200; // 200

    public final static int maxLengthDestinationString = 80;
    public final static int maxLengthColumnString = 20;

    public void fillUI(StationBoardInterface content, DisplayActivity displayActivity, String displayNumber) {
        System.out.println("*** fillUI ******************************************************************************************"); //NON-NLS
        fillLetzteAktualisierung((DisplayTimerActivity) displayActivity, displayNumber, content.getOPNVTag());
        fillAbfahrt(content, displayActivity, displayNumber);
        fillPrognose(content, displayActivity, displayNumber);
        fillLinie(content, displayActivity, displayNumber);
        fillRichtung(content, displayActivity, displayNumber);
    }


    public void fillAbfahrt(StationBoardInterface content, Activity activity, String displayNumber) {
        System.out.println("fillAbfahrt"); //NON-NLS
        for(int row=0; row < NUMBER_ROWS; row++) {
            if(row == 0) System.out.println("  Abfahrt:" + content.getDepartureRow(row)); //NON-NLS
            TextView abfahrt  = (TextView) activity.findViewById(DisplayActivity.getCurrentDisplayActivity().getAbfahrtIdList().get(row));
            abfahrt.setText(Util.cutString(content.getDepartureRow(row), maxLengthColumnString));
        }
    }


    public boolean lastResponseWasSuccessfull(Activity activity, String displayNumber) {
        TextView abfahrt  = (TextView) activity.findViewById(DisplayActivity.getCurrentDisplayActivity().getAbfahrtIdList().get(0));
        String data = abfahrt.getText().toString();

        if(data == null) return false;
        if(Parser.DEFAULT_SIGN.contentEquals(data)) return false;
        if("...".contentEquals(data)) return false;

        return true;
    }


    private String getLastOPNV(String OPNVTag, String lastOutputString) {
        if(OPNVTag == null) {
            if(lastOutputString != null) {
                int posOpenBracket = lastOutputString.indexOf('(');
                int posCloseBracket = lastOutputString.indexOf(')');
                if((posCloseBracket >= 0) && (posOpenBracket >=0)) {
                    return lastOutputString.substring(posOpenBracket+1, posCloseBracket);
                }
            }

            return "";
        }

        return OPNVTag;
    }


    public void fillStation() {

    }


    public void fillLetzteAktualisierung(DisplayTimerActivity displayTimerActivity, String displayNumber, String OPNVTag) {
        // System.out.println("fillLetzteAktualisierung: " + "letzte Aktualisierung: " +  displayTimerActivity.getLastRefresh() + "   (" + displayTimerActivity.getCountDown() + ")");

        TextView letzteAktualisierung  = (TextView) displayTimerActivity.findViewById(Util.getResourceID("textViewLetzteAktualisierung" + displayNumber, "id", displayTimerActivity.getApplicationContext())); //NON-NLS
        if(BuildConfig.DEBUG) {
            if(displayTimerActivity.getLastRefresh() == null) {
                letzteAktualisierung.setText(displayTimerActivity.getApplicationContext().getResources().getString(R.string.app_aktualisierungstext_initial));
            }
            else {
                letzteAktualisierung.setText(displayTimerActivity.getApplicationContext().getResources().getString(R.string.app_aktualisierungstextroundbracket) + getLastOPNV(OPNVTag, letzteAktualisierung.getText().toString()) + ")" + ": " +  displayTimerActivity.getLastRefresh() + " (" + displayTimerActivity.getCountDown() + ")");
            }
        }
        else {
            if(displayTimerActivity.getLastRefresh() == null) {
                letzteAktualisierung.setText(displayTimerActivity.getApplicationContext().getResources().getString(R.string.app_aktualisierungstext_initial));
            }
            else {
                letzteAktualisierung.setText(displayTimerActivity.getApplicationContext().getResources().getString(R.string.app_aktualisierungstext) + displayTimerActivity.getLastRefresh() + " (" + displayTimerActivity.getCountDown() + ")");
            }
        }
    }


    public void resetLetzteAktualisierung(DisplayTimerActivity displayTimerActivity, String displayNumber, String OPNVTag) {
        System.out.println("resetLetzteAktualisierung");
        TextView letzteAktualisierung  = (TextView) displayTimerActivity.findViewById(Util.getResourceID("textViewLetzteAktualisierung" + displayNumber, "id", displayTimerActivity.getApplicationContext())); //NON-NLS
        letzteAktualisierung.setText(displayTimerActivity.getApplicationContext().getResources().getString(R.string.app_aktualisierungstext_initial));
    }


    public void fillRichtung(StationBoardInterface content, Activity activity, String displayNumber) {
        for(int row=0; row < NUMBER_ROWS; row++) {
            TextView richtungTextView = (TextView) activity.findViewById(DisplayActivity.getCurrentDisplayActivity().getRichtungIdList().get(row));

            String destination = Util.cutString(content.getDestinationRow(row), maxLengthDestinationString);
            String platform = Util.cutString(content.getPlatformRow(row), maxLengthDestinationString);

            if(platform != null) {
                if (!platform.isEmpty()) {
                    String gleisAbk = activity.getApplicationContext().getResources().getString(R.string.app_gleisabkuerzung);
                    String platformFormatted = ", ".concat(gleisAbk).concat(" ").concat(platform);
                    destination = Util.removeLineBreaks(destination + platformFormatted);
                }
            }

            richtungTextView.setText(destination);
        }
    }


    private void setTextColorGreenOrRed(TextView textView, int severityLevel) {
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_RED)       textView.setTextColor(Color.RED);
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_CANCELLED) textView.setTextColor(Color.RED);
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_YELLOW)    textView.setTextColor(Color.YELLOW);
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_GREEN)     textView.setTextColor(Color.GREEN);
        if(severityLevel == StationBoardInterface.DELAY_SERVERITY_UNKNOWN)   textView.setTextColor(Color.WHITE);
    }


    public static int parseDelayUnit(String delayText) {
        if(delayText == null)   return StationBoardInterface.DELAY_UNIT_UNKNOWN;
        if(delayText.isEmpty()) return StationBoardInterface.DELAY_UNIT_UNKNOWN;

        if(Parser.PUENKTLICH.contentEquals(delayText)) return StationBoardInterface.DELAY_UNIT_PKTL;

        if(delayText.contains(":")) return  StationBoardInterface.DELAY_UNIT_UHRZEIT;

        if(Util.isInteger(delayText)) return StationBoardInterface.DELAY_UNIT_MINUTEN;

        return StationBoardInterface.DELAY_UNIT_UNKNOWN;
    }


    private String cleanDelayText(String delayText) {
        if(delayText == null) delayText = "";
        if(delayText.toLowerCase().contentEquals("null")) delayText = "";
        return Util.cutString(delayText, maxLengthColumnString);
    }


    public void fillPrognose(StationBoardInterface content, Activity activity, String displayNumber) {
        for(int row=0; row < NUMBER_ROWS; row++) {
            // get ui control
            TextView prognose = (TextView) activity.findViewById(DisplayActivity.getCurrentDisplayActivity().getDelayIdList().get(row));

            // get data
            Integer severityLevel = content.getPredictionSeverityRow(row);
            String delayText = content.getPredictionRow(row);

            // delayUnit
            Integer delayUnit = parseDelayUnit(delayText);
            if(delayUnit == StationBoardInterface.DELAY_UNIT_PKTL || severityLevel == StationBoardInterface.DELAY_SERVERITY_GREEN) {
                delayText = activity.getResources().getString(R.string.app_ride_on_time);
            }
            else if(delayUnit == StationBoardInterface.DELAY_UNIT_UHRZEIT){
            }
            else if(delayUnit == StationBoardInterface.DELAY_UNIT_MINUTEN){
                delayText = "+" + delayText + " " + activity.getResources().getString(R.string.app_delay_unit_minutes);
            }
            if(severityLevel == StationBoardInterface.DELAY_SERVERITY_CANCELLED) {
                delayText = activity.getResources().getString(R.string.app_ride_cancelled);
            }


            // fill ui controls
            String delayTextToDisplay = cleanDelayText(delayText);
            prognose.setText(delayTextToDisplay);
            setTextColorGreenOrRed(prognose, severityLevel);
        }
    }


    public void fillLinie(StationBoardInterface content, Activity activity, String displayNumber) {
        for(int row=0; row < NUMBER_ROWS; row++) {
            TextView line  = (TextView) activity.findViewById(DisplayActivity.getCurrentDisplayActivity().getLinieIdList().get(row));
            line.setText(Util.cutString(content.getLineRow(row), maxLengthColumnString));
        }
    }
}