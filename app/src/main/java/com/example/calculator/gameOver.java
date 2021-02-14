package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class gameOver extends AppCompatActivity {

    EditText nameEditText;
    Button saveButton;
    String scr;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        databaseReference = FirebaseDatabase.getInstance().getReference("SCORE");

        TextView score = findViewById(R.id.scoreView);
        nameEditText = findViewById(R.id.name);
        saveButton = findViewById(R.id.save);

        Bundle extras = getIntent().getExtras();
        scr = extras.getString("score");
        score.setText("YOUR SCORE IS: "+scr);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
                Intent intent = new Intent(getApplicationContext(),scoreListView.class);
                startActivity(intent);
            }
        });
    }

    public void saveData(){
        String name = nameEditText.getText().toString().trim();
        String score = scr;

        String key = databaseReference.push().getKey();

        Database database = new Database(name,score);

        databaseReference.child(key).setValue(database);
        Toast.makeText(getApplicationContext(),"SCORE ENTRY SUCCESSFUL!",Toast.LENGTH_SHORT).show();
    }
}
