package org.sge.haltestellenanzeige.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class CustomScrollView extends ScrollView {

    float touchX = 0;
    float touchY = 0;

    AppCompatActivity appCompatActivity;

    public void setActivty(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }


    public CustomScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomScrollView(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        // System.out.println("CustomScrollView::onTouchEvent");
/*
        switch (ev.getActionMasked()){
            case MotionEvent.ACTION_DOWN:
                System.out.println("CustomScrollView::onTouchEvent MotionEvent.Action_DOWN");
                touchX = ev.getX();
                touchY = ev.getY();
                return super.onTouchEvent(ev);
            case MotionEvent.ACTION_MOVE:
                System.out.println("CustomScrollView::onTouchEvent MotionEvent.Action_MOVE " + Math.abs(touchX-ev.getX()));
                if(Math.abs(touchX-ev.getX())<40){
                    return super.onTouchEvent(ev);
                } else {
                    System.out.println("CustomScrollView::onTouchEvent MotionEvent.Action_MOVE big move");
                    if (appCompatActivity==null) {
                        return false;
                    } else {
                        System.out.println("CustomScrollView::onTouchEvent sent to mainApp");
                        return appCompatActivity.onTouchEvent(ev);
                    }
                }
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                touchX=0;
                touchY=0;
                break;
        }

        return super.onTouchEvent(ev);
        */

        if(appCompatActivity != null) appCompatActivity.onTouchEvent(ev);

        return super.onTouchEvent(ev);
    }
}