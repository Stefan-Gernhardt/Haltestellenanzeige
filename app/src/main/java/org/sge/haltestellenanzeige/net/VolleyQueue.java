package org.sge.haltestellenanzeige.net;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Admin on 17.11.2017.
 */

public class VolleyQueue {
    private static VolleyQueue volleyInstance = null;
    private static RequestQueue queue = null;


    private VolleyQueue() {
    }

    public static synchronized  VolleyQueue getInstance() {
        if(volleyInstance == null) volleyInstance = new VolleyQueue();
        return volleyInstance;
    }

    public RequestQueue getQueue(Context context) {
        if(queue == null) queue = Volley.newRequestQueue(context);
        return queue;
    }
}
