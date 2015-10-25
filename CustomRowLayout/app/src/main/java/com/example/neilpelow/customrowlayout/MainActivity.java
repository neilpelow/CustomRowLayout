package com.example.neilpelow.customrowlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] country = {"Ireland","USA","Germany","Mexico","Netherlands","China","Holland","Singapore","Venezuela"};

        ListAdapter myAdapter = new CustomAdapter(this, country);
        final ListView myListView = (ListView)findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String c = country[position];
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        intent.putExtra("country", c);
                        startActivity(intent);
                    }
                }
        );
    }
}