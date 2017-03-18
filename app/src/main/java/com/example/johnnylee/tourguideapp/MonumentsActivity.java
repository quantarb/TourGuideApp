package com.example.johnnylee.tourguideapp;

import android.os.Bundle;

import java.util.ArrayList;

public class MonumentsActivity extends LocationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected ArrayList<Location> getLocations() {

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.monument1_name), getString(R.string.monument1_address), R.drawable.monument1_image));
        locations.add(new Location(getString(R.string.monument2_name), getString(R.string.monument2_address), R.drawable.monument2_image));
        locations.add(new Location(getString(R.string.monument3_name), getString(R.string.monument3_address), R.drawable.monument3_image));
        locations.add(new Location(getString(R.string.monument4_name),getString(R.string.monument4_address), R.drawable.monument4_image));

        return locations;
    }

    @Override
    protected int getColorResourceId() {
        return R.color.category_monuments;
    }
}
