package com.qme.ui;

import com.gme.ui.R;
import com.gme.ui.R.layout;

import android.app.Activity;
import android.os.Bundle;

public class QMeAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}