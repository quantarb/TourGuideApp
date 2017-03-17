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

        for (int i = 0; i < 10; i++)
        {
            locations.add(new Location("Museum", "Address"));
        }


        return locations;
    }

    @Override
    protected int getColorResourceId() {
        return R.color.category_museums;
    }
}