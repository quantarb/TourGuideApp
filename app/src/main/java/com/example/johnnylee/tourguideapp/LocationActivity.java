package com.example.johnnylee.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public abstract class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);
        LocationAdapter adapter = new LocationAdapter(this, getLocations(), getColorResourceId());
        ListView listView = (ListView) findViewById(R.id.location_list);
        listView.setAdapter(adapter);
    }

    protected abstract ArrayList<Location> getLocations();
    protected abstract int getColorResourceId();

    public String getStringResourceByName(String s) {
        String packageName = getPackageName();
        int resId = getResources().getIdentifier(s, "string", packageName);
        return getString(resId);
    }

}
