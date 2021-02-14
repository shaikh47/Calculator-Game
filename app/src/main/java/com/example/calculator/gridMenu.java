package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Currency;

public class gridMenu extends AppCompatActivity {

    ImageView btnBaseConv;
    ImageView btnLenConv;
    ImageView btnVolumeConv;
    ImageView btnAreaConv;
    ImageView btnTimeConv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_menu);

        btnBaseConv = findViewById(R.id.baseConversion);
        btnLenConv = findViewById(R.id.length);
        btnVolumeConv = findViewById(R.id.volume);
        btnAreaConv = findViewById(R.id.area);
        btnTimeConv = findViewById(R.id.time);

        btnBaseConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),numberSystem.class);
                startActivity(intent);
            }
        });

        btnLenConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LengthConversion.class);
                startActivity(intent);
            }
        });

        btnVolumeConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),volumeConversion.class);
                startActivity(intent);
            }
        });

        btnAreaConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),areaConversion.class);
                startActivity(intent);
            }
        });

        btnTimeConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),timeConversion.class);
                startActivity(intent);
            }
        });


    }
}
