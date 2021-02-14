package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class timeConversion extends AppCompatActivity {

    Spinner selection1;
    Spinner selection2;
    TextView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnEqual;
    ImageView btnBack;
    TextView eqn; //shows the user input(from)
    TextView answer; //shows the output(to)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_conversion);

        selection1 = findViewById(R.id.selection);
        selection2 = findViewById(R.id.selection1);


        btn1 = (TextView)findViewById(R.id.one);
        btn2 = (TextView)findViewById(R.id.two);
        btn3 = (TextView)findViewById(R.id.three);

        btn4 = (TextView)findViewById(R.id.four);
        btn5 = (TextView)findViewById(R.id.five);
        btn6 = (TextView)findViewById(R.id.six);

        btn7 = (TextView)findViewById(R.id.seven);
        btn8 = (TextView)findViewById(R.id.eight);
        btn9 = (TextView)findViewById(R.id.nine);

        btn0 = (TextView)findViewById(R.id.zero);
        btnDot = (TextView)findViewById(R.id.point);
        btnBack = findViewById(R.id.backspace);
        btnEqual = findViewById(R.id.equal);

        eqn = (TextView)findViewById(R.id.from);
        answer = (TextView)findViewById(R.id.to);

        eqn.setText("0");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("1");
                }
                else{
                    eqn.setText(eqn.getText() + "1");
                }

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("2");
                }
                else{
                    eqn.setText(eqn.getText() + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("3");
                }
                else{
                    eqn.setText(eqn.getText() + "3");
                }
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("4");
                }
                else{
                    eqn.setText(eqn.getText() + "4");
                }
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("5");
                }
                else{
                    eqn.setText(eqn.getText() + "5");
                }
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("6");
                }
                else{
                    eqn.setText(eqn.getText() + "6");
                }
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("7");
                }
                else{
                    eqn.setText(eqn.getText() + "7");
                }
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("8");
                }
                else{
                    eqn.setText(eqn.getText() + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("9");
                }
                else{
                    eqn.setText(eqn.getText() + "9");
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() != "0") {
                    eqn.setText(eqn.getText() + "0");
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = (String) eqn.getText();
                int length = str.length();

                if(str.length() != 1) {
                    eqn.setText(str.substring(0, length - 1));
                }
                else{
                    eqn.setText("0");
                }

            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("0.");
                }
                else{
                    eqn.setText(eqn.getText() + ".");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fromUnit = (String) selection1.getSelectedItem();
                String toUnit = (String) selection2.getSelectedItem();
                double userInput=Double.parseDouble((String)eqn.getText());

                String getString = conversionMethod(fromUnit,toUnit,userInput);
                answer.setText(getString);
            }
        });
    }

    String conversionMethod(String fromUnit, String toUnit, double input){
        double millisecond=1.0;
        double second=1000.0;
        double minute=60000.0;
        double hour=3600000.0;
        double day=86400000.0;
        double week=604800000.0;
        double month=2628000000.0;
        double year = 31536000000.0;

        double weight=0;

        switch(fromUnit){
            case "Millisecond":
                weight=millisecond;
                break;
            case "Second":
                weight=second;
                break;
            case "Minute":
                weight=minute;
                break;
            case "Hour":
                weight=hour;
                break;
            case "Day":
                weight=day;
                break;
            case "Week":
                weight=week;
                break;
            case "Month":
                weight=month;
                break;
            case "year":
                weight=year;
                break;
        }


        double temp;
        temp = weight*input;

        switch(toUnit){
            case "Millisecond":
                weight=millisecond;
                break;
            case "Second":
                weight=second;
                break;
            case "Minute":
                weight=minute;
                break;
            case "Hour":
                weight=hour;
                break;
            case "Day":
                weight=day;
                break;
            case "Week":
                weight=week;
                break;
            case "Month":
                weight=month;
                break;
            case "year":
                weight=year;
                break;
        }

        temp = (double)temp / weight;

        return String.valueOf(temp);
    }
}
