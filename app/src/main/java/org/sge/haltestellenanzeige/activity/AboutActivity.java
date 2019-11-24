package org.sge.haltestellenanzeige.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.sge.haltestellenanzeige.R;
import org.sge.haltestellenanzeige.ui.DisplayActivity;
import org.sge.haltestellenanzeige.util.Util;


public class AboutActivity extends AppCompatActivity {
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle(this.getApplicationContext().getResources().getString(R.string.app_ueber_title));
        setVersion();
        initOkButton();
    }


    private void setVersion() {
        String version = "";
        try {
            version = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        }
        catch(PackageManager.NameNotFoundException e) {
        }

        TextView versionTextView = (TextView) findViewById(Util.getResourceID("textViewVersion", "id", getApplicationContext())); //NON-NLS
        versionTextView.setText(version);
    }


    private void initOkButton() {
        okButton = (Button) findViewById(R.id.buttonAboutOk);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String caller = getIntent().getStringExtra("caller"); //NON-NLS
            Class callerClass = null;
            try {
                callerClass = Class.forName(caller);
            }
            catch (ClassNotFoundException e) {
                callerClass = MainActivity.class;
            }
            Intent intent = new Intent(AboutActivity.this, callerClass);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            }
        });
    }

}
