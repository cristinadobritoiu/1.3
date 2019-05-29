package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.app.Activity;


public class AgeCheck extends AppCompatActivity {
    Button button;
    Button button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_age_check);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.check1);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(AgeCheck.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        button2 = (Button) findViewById(R.id.check2);

        // Capture button clicks
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent homeIntent = new Intent(AgeCheck.this,
                        underAgeActivity.class);
                startActivity(homeIntent);
            }
        });
    }

    public void OnCheckedClick(View view) {
    }
}
