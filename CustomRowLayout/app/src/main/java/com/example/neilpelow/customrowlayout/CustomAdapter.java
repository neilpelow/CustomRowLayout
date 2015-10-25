package com.example.neilpelow.customrowlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String[] country) {
        super(context, R.layout.row, country);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());

        if(convertView ==  null){
            convertView = myInflater.inflate(R.layout.row, parent, false);
        }

        String singleThingItem = getItem(position);

        TextView myText = (TextView) convertView.findViewById(R.id.myTextView);
        ImageView myImage = (ImageView) convertView.findViewById(R.id.myImageView);

        myText.setText(singleThingItem);
        myImage.setImageResource(R.drawable.ok);

        return convertView;
    }
}
