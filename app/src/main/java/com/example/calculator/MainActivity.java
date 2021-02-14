package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView btn1 = (TextView)findViewById(R.id.one);
        TextView btn2 = (TextView)findViewById(R.id.two);
        TextView btn3 = (TextView)findViewById(R.id.three);

        TextView btn4 = (TextView)findViewById(R.id.four);
        TextView btn5 = (TextView)findViewById(R.id.five);
        TextView btn6 = (TextView)findViewById(R.id.six);

        TextView btn7 = (TextView)findViewById(R.id.seven);
        TextView btn8 = (TextView)findViewById(R.id.eight);
        TextView btn9 = (TextView)findViewById(R.id.nine);

        TextView btn0 = (TextView)findViewById(R.id.zero);
        TextView btnDot = (TextView)findViewById(R.id.point);
        TextView btnClear = (TextView)findViewById(R.id.cut);
        ImageView btnBack = (ImageView) findViewById(R.id.backspace);

        TextView btnOpeningBrac = (TextView)findViewById(R.id.openingbracket);
        TextView btnClosingBrac = (TextView)findViewById(R.id.closingbracket);
        TextView btnPower = (TextView)findViewById(R.id.power);
        TextView btnRoot = (TextView)findViewById(R.id.root);

        TextView btnPlus = (TextView)findViewById(R.id.plus);
        TextView btnMinus = (TextView)findViewById(R.id.minus);
        TextView btnDivide = (TextView)findViewById(R.id.divide);
        TextView btnMultiply = (TextView)findViewById(R.id.multiply);
        TextView btnFact = (TextView)findViewById(R.id.pi);

        TextView btnEqual = (TextView)findViewById(R.id.equal);



        final TextView eqn = (TextView)findViewById(R.id.equation);
        final TextView rslt = (TextView)findViewById(R.id.result);


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


        btnOpeningBrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("(");
                }
                else{
                    eqn.setText(eqn.getText() + "(");
                }
            }
        });

        btnClosingBrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText(")");
                }
                else{
                    eqn.setText(eqn.getText() + ")");
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

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqn.setText("0");
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

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("^");
                }
                else{
                    eqn.setText(eqn.getText() + "^");
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("+");
                }
                else{
                    eqn.setText(eqn.getText() + "+");
                }
            }
        });

        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("3.14159265");
                }
                else{
                    eqn.setText(eqn.getText() + "3.14159265");
                }
            }
        });

        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String input = (String) eqn.getText();
                    Expression exp = new ExpressionBuilder(input).build();
                    double result = exp.evaluate();

                    result = Math.sqrt(result);

                    rslt.setText(String.valueOf(result));
                    eqn.setText(String.valueOf(result));
                }catch (Exception e){
                    rslt.setText("Error");
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("-");
                }
                else{
                    eqn.setText(eqn.getText() + "-");
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("/");
                }
                else{
                    eqn.setText(eqn.getText() + "/");
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eqn.getText() == "0") {
                    eqn.setText("*");
                }
                else{
                    eqn.setText(eqn.getText() + "*");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String input = (String) eqn.getText();
                    Expression exp = new ExpressionBuilder(input).build();
                    double result = exp.evaluate();
                    rslt.setText(String.valueOf(result));
                }catch (Exception e){
                    rslt.setText("Error");
                }
            }
        });



    }
}
