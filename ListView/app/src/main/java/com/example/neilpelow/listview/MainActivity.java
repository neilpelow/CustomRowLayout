package com.example.neil.androidlistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.neil.androidlistview.HashMapAdapter.HashMapActivity;
import com.example.neil.androidlistview.ArrayListAdapter.ArrayListActivity;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button arrayAdapterButton = (Button) findViewById(R.id.array_adapter_button);
    arrayAdapterButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, ArrayListActivity.class);
        startActivity(intent);
      }
    });

    Button hashMapAdapterButton = (Button) findViewById(R.id.hashmap_adapter_button);
    hashMapAdapterButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, HashMapActivity.class);
        startActivity(intent);
      }
    });
  }
}