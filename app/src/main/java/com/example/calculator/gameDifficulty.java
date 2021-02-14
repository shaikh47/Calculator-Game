package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gameDifficulty extends AppCompatActivity {

    Button easy,medium,hard;
    Button scoreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_difficulty);

        easy = findViewById(R.id.easy);
        medium = findViewById(R.id.medium);
        hard = findViewById(R.id.hard);
        scoreBtn = findViewById(R.id.score);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEasy = new Intent(getApplicationContext(), gameActivity.class);
                intentEasy.putExtra("difficulty", "1");
                startActivity(intentEasy);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEasy = new Intent(getApplicationContext(), gameActivity.class);
                intentEasy.putExtra("difficulty", "5");
                startActivity(intentEasy);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEasy = new Intent(getApplicationContext(), gameActivity.class);
                intentEasy.putExtra("difficulty", "10");
                startActivity(intentEasy);
            }
        });

        scoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),scoreListView.class);
                startActivity(intent);
            }
        });
    }
}
