package com.example.neil.androidlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CountryActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        /**
         * retrieve extras sent by the intent from parent activity
         */
        TextView textViewCountryName = (TextView) findViewById(R.id.country_name2);
        textViewCountryName.setText(getIntent().getExtras().getString("country"));
        TextView textViewPositionNumber = (TextView) findViewById((R.id.country_position));
        textViewPositionNumber.setText(getIntent().getExtras().getString("position"));
    }
}