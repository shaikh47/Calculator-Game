package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Random;

public class gameActivity extends AppCompatActivity {

    final int[] score = {0};
    int complexity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Bundle difficulty = getIntent().getExtras();
        String val1 = difficulty.getString("difficulty");
        complexity = Integer.parseInt(val1);

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
        TextView btnEqual = (TextView)findViewById(R.id.equal);
        TextView btnClear = (TextView)findViewById(R.id.cut);
        ImageView btnBack = (ImageView) findViewById(R.id.backspace);
        TextView btnMinus = (TextView)findViewById(R.id.minus);

        final TextView answer = (TextView)findViewById(R.id.Answer);
        final TextView question = (TextView)findViewById(R.id.question);


        String input = questionMethod();  //calls the fucntion to generate the expression
        question.setText("What is, "+input+"= ?");  //shows the expression on the textview

        answer.setText("0");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("1");
                }
                else{
                    answer.setText(answer.getText() + "1");
                }

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("2");
                }
                else{
                    answer.setText(answer.getText() + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("3");
                }
                else{
                    answer.setText(answer.getText() + "3");
                }
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("4");
                }
                else{
                    answer.setText(answer.getText() + "4");
                }
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("5");
                }
                else{
                    answer.setText(answer.getText() + "5");
                }
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("6");
                }
                else{
                    answer.setText(answer.getText() + "6");
                }
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("7");
                }
                else{
                    answer.setText(answer.getText() + "7");
                }
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("8");
                }
                else{
                    answer.setText(answer.getText() + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("9");
                }
                else{
                    answer.setText(answer.getText() + "9");
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() != "0") {
                    answer.setText(answer.getText() + "0");
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0")
                    answer.setText("-");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText() == "0") {
                    answer.setText("0.");
                }
                else{
                    answer.setText(answer.getText() + ".");
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("0");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = (String) answer.getText();
                int length = str.length();

                if(str.length() != 1) {
                    answer.setText(str.substring(0, length - 1));
                }
                else{
                    answer.setText("0");
                }

            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    try {
                        Expression exp = new ExpressionBuilder((String)question.getText()).build();
                        double result = exp.evaluate();  //holds the actual result of the expression

                        Expression userExp = new ExpressionBuilder((String)answer.getText()).build();
                        double userResult = userExp.evaluate();  //compares the result with user input

                        if(result == userResult){
                           score[0]++;
                           answer.setText("0");
                        }
                        else{
                            Intent intent = new Intent(getApplicationContext(),gameOver.class);
                            String sendScore = String.valueOf(score[0]);
                            intent.putExtra("score",sendScore);
                            startActivity(intent);
                        }

                        String input = questionMethod();  //calls the fucntion to generate the expression
                        question.setText(input);  //shows the expression on the textview

                    } catch (Exception e) {
                        question.setText("Error");
                    }
            }

        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        score[0]=0;
    }

    String questionMethod() {
        int random = new Random().nextInt(complexity) + 3;    //length of the expression

        if (random % 2 == 0)  //makes the expression odd in length
            random++;

        String expr = "";

        for (int i = 0; i < random; i++) {
            if (i % 2 == 0) {     //will assign a random number to it
                int randomNum = new Random().nextInt(15);
                expr = expr + randomNum;
            } else {             //will assign a random operator to it
                int randomOperator = new Random().nextInt(4);
                if(randomOperator == 0){      //plus
                    expr = expr + "+";
                }
                else if(randomOperator == 1){    //minus
                    expr = expr + "-";
                }
                else if(randomOperator == 2){     //multiplication
                    expr = expr + "*";
                }
                else if(randomOperator == 3){     //division
                    expr = expr + "+";
                }
            }
        }
        return expr;
    }
}
