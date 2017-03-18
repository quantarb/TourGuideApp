package com.example.johnnylee.tourguideapp;

import android.os.Bundle;

import java.util.ArrayList;

public class RestaurantsActivity extends LocationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected ArrayList<Location> getLocations() {

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.restaurant1_name), getString(R.string.restaurant1_address), R.drawable.restaurant1_image));
        locations.add(new Location(getString(R.string.restaurant2_name), getString(R.string.restaurant2_address), R.drawable.restaurant2_image));
        locations.add(new Location(getString(R.string.restaurant3_name), getString(R.string.restaurant3_address), R.drawable.restaurant3_image));
        locations.add(new Location(getString(R.string.restaurant4_name), getString(R.string.restaurant4_address), R.drawable.restaurant4_image));


        return locations;
    }

    @Override
    protected int getColorResourceId() {
        return R.color.category_restaurants;
    }


}
