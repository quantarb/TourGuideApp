package com.example.johnnylee.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView phrases = (TextView) findViewById(R.id.monuments);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MonumentsActivity.class);
                startActivity(i);
            }
        });

        TextView colors = (TextView) findViewById(R.id.museums);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(i);
            }
        });


        TextView numbers = (TextView) findViewById(R.id.parks);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(i);
            }
        });

        TextView family = (TextView) findViewById(R.id.restaurants);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(i);
            }
        });
    }
}
