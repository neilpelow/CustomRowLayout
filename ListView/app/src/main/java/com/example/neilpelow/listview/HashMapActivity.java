package com.example.neil.androidlistview.HashMapAdapter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.example.neil.androidlistview.CountryActivity;
import com.example.neil.androidlistview.R;

import java.util.HashMap;
import java.util.Map;

public class HashMapActivity extends ListActivity {

  private static final String LOG_TAG = HashMapActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_hashmap);

    CountryAdapter countryAdapter = new CountryAdapter(loadCountryMap());
    setListAdapter(countryAdapter);
  }


  @Override
  public void onListItemClick(ListView listView, View view, int position, long id) {
    Intent intent = new Intent(HashMapActivity.this, CountryActivity.class);
    Map.Entry<String, Integer> selectedCountryMap =
        (Map.Entry<String, Integer>) listView.getItemAtPosition(position);
    String selectedCountry = selectedCountryMap.getKey();
    Log.d(LOG_TAG, "Selected country: " + selectedCountry);
    intent.putExtra("country", selectedCountry);
    intent.putExtra("position", Integer.toString(position));
    startActivity(intent);
  }


  private HashMap<String, Integer> loadCountryMap() {

    HashMap<String, Integer> countryMap = new HashMap<>();

    countryMap.put("Estonia", getResources().getIdentifier("estonia", "drawable", getPackageName()));
    countryMap.put("Finland", getResources().getIdentifier("finland", "drawable", getPackageName()));
    countryMap.put("France", getResources().getIdentifier("france", "drawable", getPackageName()));
    countryMap.put("Germany", getResources().getIdentifier("germany", "drawable", getPackageName()));
    countryMap.put("Greece", getResources().getIdentifier("greece", "drawable", getPackageName()));
    countryMap.put("Ireland", getResources().getIdentifier("ireland", "drawable", getPackageName()));
    countryMap.put("Italy", getResources().getIdentifier("italy", "drawable", getPackageName()));
    countryMap.put("Latvia", getResources().getIdentifier("latvia", "drawable", getPackageName()));
    countryMap.put("Lithuania", getResources().getIdentifier("lithuania", "drawable", getPackageName()));
    countryMap.put("Netherlands", getResources().getIdentifier("netherlands", "drawable", getPackageName()));
    countryMap.put("Norway", getResources().getIdentifier("norway", "drawable", getPackageName()));
    countryMap.put("Poland", getResources().getIdentifier("poland", "drawable", getPackageName()));
    countryMap.put("Portugal", getResources().getIdentifier("portugal", "drawable", getPackageName()));
    countryMap.put("Russia", getResources().getIdentifier("russia", "drawable", getPackageName()));
    countryMap.put("Spain", getResources().getIdentifier("spain", "drawable", getPackageName()));
    countryMap.put("Sweden", getResources().getIdentifier("sweden", "drawable", getPackageName()));

    return countryMap;
  }

}