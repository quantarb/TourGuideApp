package com.example.johnnylee.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();

        for(int i = 0; i < 10; i ++)
        {
            locations.add(new Location(R.string.category_restaurant + " i", "Address"));
        }


        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_restaurant);

        ListView listView = (ListView) findViewById(R.id.location_list);

        listView.setAdapter(adapter);

    }
}
