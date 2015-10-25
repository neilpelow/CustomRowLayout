package com.example.neil.androidlistview.HashMapAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.neil.androidlistview.R;

import java.util.ArrayList;
import java.util.Map;


public class CountryAdapter extends BaseAdapter {

  private static final String LOG_TAG = CountryAdapter.class.getSimpleName();
  private final ArrayList<Map.Entry<String, Integer>> countryList;

  private static class ViewHolder {
    private TextView countryName;
    private ImageView countryFlag;
  }

  public CountryAdapter(Map<String, Integer> map) {
    countryList = new ArrayList<>();
    countryList.addAll(map.entrySet());
  }

  @Override
  public int getCount() {
    return countryList.size();
  }

  @Override
  public Map.Entry<String, Integer> getItem(int position) {
    return (Map.Entry) countryList.get(position);
  }

  @Override
  public long getItemId(int position) {
    return 0;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder viewHolder;
    if (convertView == null) {
      convertView = LayoutInflater.from(parent.getContext())
          .inflate(R.layout.row, parent, false);

      viewHolder = new ViewHolder();
      viewHolder.countryName = (TextView) convertView.findViewById(R.id.country_name);
      viewHolder.countryFlag = (ImageView) convertView.findViewById(R.id.country_flag);
      convertView.setTag(viewHolder);
    } else {
      viewHolder = (ViewHolder) convertView.getTag();
    }

    Map.Entry<String, Integer> country = getItem(position);
    if (country != null) {
      viewHolder.countryName.setText(country.getKey());
      viewHolder.countryFlag.setImageResource(country.getValue());
    }

    return convertView;
  }

}