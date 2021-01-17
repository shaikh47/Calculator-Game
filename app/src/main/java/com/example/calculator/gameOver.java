package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class gameOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        TextView score = findViewById(R.id.scoreView);

        Bundle extras = getIntent().getExtras();
        String scr = extras.getString("score");
        score.setText("YOUR SCORE IS: "+scr);
    }
}
