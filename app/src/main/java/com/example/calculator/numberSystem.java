package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class numberSystem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        final EditText edit1 = findViewById(R.id.editText1);
        final EditText edit2 = findViewById(R.id.editText2);
        final EditText edit3 = findViewById(R.id.editText3);
        final EditText edit4 = findViewById(R.id.editText4);

        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
            }
        });

        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
            }
        });

        edit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
            }
        });

        edit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st1 = edit1.getText().toString();
                String st2 = edit2.getText().toString();
                String st3 = edit3.getText().toString();
                String st4 = edit4.getText().toString();

                if (!st1.equals("")) {
                    String tempSt1 = edit1.getText().toString();

                    String octal = convert(tempSt1, 2, 8);
                    String decimal = convert(tempSt1, 2, 10);
                    String hex = convert(tempSt1, 2, 16);

                    edit2.setText(octal);
                    edit3.setText(decimal);
                    edit4.setText(hex);

                }
                if (!st2.equals("")) {
                    String tempSt1 = edit2.getText().toString();

                    String binary = convert(tempSt1, 8, 2);
                    String decimal = convert(tempSt1, 8, 10);
                    String hex = convert(tempSt1, 8, 16);

                    edit1.setText(binary);
                    edit3.setText(decimal);
                    edit4.setText(hex);
                }
                if (!st3.equals("")) {
                    String tempSt1 = edit3.getText().toString();

                    String binary = convert(tempSt1, 10, 2);
                    String octal = convert(tempSt1, 10, 8);
                    String hex = convert(tempSt1, 10, 16);

                    edit1.setText(binary);
                    edit2.setText(octal);
                    edit4.setText(hex);
                }
                if (!st4.equals("")) {
                    String tempSt1 = edit4.getText().toString();

                    String binary = convert(tempSt1, 16, 2);
                    String octal = convert(tempSt1, 16, 8);
                    String decimal = convert(tempSt1, 16, 10);

                    edit1.setText(binary);
                    edit2.setText(octal);
                    edit3.setText(decimal);
                }
            }
        });
    }
    public String convert(String str, int fromBase, int toBase) {
        try {
            return Integer.toString(Integer.parseInt(str, fromBase), toBase);
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Enter a valid number",Toast.LENGTH_SHORT).show();
            return "Error";
        }
    }
}
