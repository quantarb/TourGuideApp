package com.example.johnnylee.tourguideapp;

import android.os.Bundle;

import java.util.ArrayList;

public class ParksActivity extends LocationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected ArrayList<Location> getLocations() {

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.park1_name), getString(R.string.park1_address), R.drawable.park1_image));
        locations.add(new Location(getString(R.string.park2_name), getString(R.string.park2_address), R.drawable.park2_image));
        locations.add(new Location(getString(R.string.park3_name), getString(R.string.park3_address), R.drawable.park3_image));
        locations.add(new Location(getString(R.string.park4_name), getString(R.string.park4_address), R.drawable.park4_image));

        return locations;
    }

    @Override
    protected int getColorResourceId() {
        return R.color.category_parks;
    }
}
