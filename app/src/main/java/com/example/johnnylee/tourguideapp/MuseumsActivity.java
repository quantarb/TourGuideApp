package com.example.johnnylee.tourguideapp;

import android.os.Bundle;

import java.util.ArrayList;

public class MuseumsActivity extends LocationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected ArrayList<Location> getLocations() {

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.museum1_name), getString(R.string.museum1_address), R.drawable.museum1_image));
        locations.add(new Location(getString(R.string.museum2_name), getString(R.string.museum2_address), R.drawable.museum2_image));
        locations.add(new Location(getString(R.string.museum3_name), getString(R.string.museum3_address), R.drawable.museum3_image));
        locations.add(new Location(getString(R.string.museum4_name), getString(R.string.museum4_address), R.drawable.museum4_image));


        return locations;
    }

    @Override
    protected int getColorResourceId() {
        return R.color.category_museums;
    }
}
