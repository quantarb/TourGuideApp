package com.example.johnnylee.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView phrases = (TextView) findViewById(R.id.monuments);
        phrases.setOnClickListener(this);

        TextView colors = (TextView) findViewById(R.id.museums);
        colors.setOnClickListener(this);

        TextView numbers = (TextView) findViewById(R.id.parks);
        numbers.setOnClickListener(this);

        TextView family = (TextView) findViewById(R.id.restaurants);
        family.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.monuments:
                startActivity(new Intent(MainActivity.this, MonumentsActivity.class));
                break;
            case R.id.museums:
                startActivity(new Intent(MainActivity.this, MuseumsActivity.class));
                break;
            case R.id.parks:
                startActivity(new Intent(MainActivity.this, ParksActivity.class));
                break;
            case R.id.restaurants:
                startActivity(new Intent(MainActivity.this, RestaurantsActivity.class));
        }
    }


}
