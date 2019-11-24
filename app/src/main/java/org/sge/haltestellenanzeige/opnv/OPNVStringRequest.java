package org.sge.haltestellenanzeige.opnv;

import android.content.Context;

import org.sge.haltestellenanzeige.net.BahnRequest;
import org.sge.haltestellenanzeige.net.ResponseContainer;
import org.sge.haltestellenanzeige.settings.RegPageSettings;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.ui.ChangeStopActivity;
import org.sge.haltestellenanzeige.ui.DisplayTimerActivity;
import org.sge.haltestellenanzeige.widget.WidgetManager;

public abstract class OPNVStringRequest extends OPNVimpl {
    public void createSuggestionRequest(final Context context, boolean asynchron, boolean secondary, String url, String searchString, String requestTag, final ChangeStopActivity changeStopActivity, final RegPageSettings regPageSettings, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId) {
        System.out.println("OPNVStringRequest.createSuggestionRequest()"); //NON-NLS
        BahnRequest.opnvStringSuggestionRequest(context, asynchron, secondary, url, requestTag, searchString, changeStopActivity, regPageSettings, displayActivity, widgetManager, widgetId, this);
    }


    public ResponseContainer createDepartureRequestSynchron(final Context context, final OPNV opnvStringRequest, final String stationNameForUrl, final String requestTag, final Stop stop) {
        return BahnRequest.createBahnDepartureStringRequestSynchron(context, this, stationNameForUrl, requestTag, stop);
    }


    public void createDepartureRequestAsynchron(final Context context, final OPNV opnvJsonRequest, final DisplayTimerActivity displayActivity, final WidgetManager widgetManager, final int widgetId, final String requestTag, final Stop stop) {
        BahnRequest.createDepartureStringRequestAsynchron(context, displayActivity, widgetManager, widgetId, requestTag, stop);
    }

}
