package com.example.linneman_joseph_hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clear;
    private Button dec;
    private Button total;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUAL = 0;
    private double firstNum = Double.NaN;
    private double secNum;
    private char OPERATOR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum = Double.NaN;
                secNum = Double.NaN;
                result.setText(null);
            }
        });
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                OPERATOR = EQUAL;
                result.setText(String.valueOf(firstNum));
            }
        });{

        }
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                OPERATOR = ADDITION;
                result.setText(null);
                //result.setText(String.valueOf(firstNum));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                OPERATOR = SUBTRACTION;
                result.setText(null);
                //result.setText(String.valueOf(firstNum));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                OPERATOR = MULTIPLICATION;
                result.setText(null);
                //result.setText(String.valueOf(firstNum));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                OPERATOR = DIVISION;
                result.setText(null);
                //result.setText(String.valueOf(firstNum));
            }
        });
        dec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + ".");
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "9");
            }
        });
    }
    private void calculate(){
        if(!Double.isNaN(firstNum)){
            secNum = Double.parseDouble(result.getText().toString());

            switch(OPERATOR){
                case ADDITION:
                    firstNum = firstNum + secNum;
                    break;
                case SUBTRACTION:
                    firstNum = firstNum - secNum;
                    break;
                case MULTIPLICATION:
                    firstNum = firstNum * secNum;
                    break;
                case DIVISION:
                    firstNum = firstNum / secNum;
                    break;
                case EQUAL:
                    break;
            }
        }
        else{
            firstNum = Double.parseDouble(result.getText().toString());
        }
    }

    private void setupUIViews(){
        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        zero = (Button)findViewById(R.id.button0);
        add = (Button)findViewById(R.id.buttonAdd);
        sub = (Button)findViewById(R.id.buttonSub);
        mul = (Button)findViewById(R.id.buttonMul);
        div = (Button)findViewById(R.id.buttonDiv);
        clear = (Button)findViewById(R.id.buttonC);
        dec = (Button)findViewById(R.id.buttonD);
        total = (Button)findViewById(R.id.buttonTotal);
        result = (TextView)findViewById(R.id.result);
    }
}
