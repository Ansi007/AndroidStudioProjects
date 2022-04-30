package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnClear, btnEqual, btnZero, btnOne, btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine;
    Button btnMul,btnMod,btnDiv,btnAdd,btnSub;
    TextView resultText;
    int val1 = 0, val2 = 0;
    boolean Add,Sub,Div,Mul,Mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClear = findViewById(R.id.btnClear);
        btnEqual = findViewById(R.id.btnEqual);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnMul = findViewById(R.id.btnMul);
        btnMod = findViewById(R.id.btnMod);
        btnDiv = findViewById(R.id.btnDiv);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        resultText = findViewById(R.id.resultTextView);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText("");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultText.getText().length() > 0){
                    if (Add || Sub || Mul || Div || Mod) {
                        val2 = Integer.parseInt(resultText.getText() + "");
                    }

                    if (Add) {
                        resultText.setText(val1 + val2 + "");
                        Add = false;
                    }

                    if (Sub) {

                        resultText.setText(val1 - val2 + "");
                        Sub = false;
                    }

                    if (Mul) {
                        resultText.setText(val1 * val2 + "");
                        Mul = false;
                    }

                    if (Div) {
                        resultText.setText(val1 / val2 + "");
                        Div = false;
                    }
                    if (Mod) {
                        resultText.setText(val1 % val2 + "");
                        Mod = false;
                    }


                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultText.getText().length() > 0){
                    val1 = Integer.parseInt(resultText.getText() + "");
                    Mod = true;
                    resultText.setText("");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultText.getText().length() > 0){
                    val1 = Integer.parseInt(resultText.getText() + "");
                    Mul = true;
                    resultText.setText("");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultText.getText().length() > 0){
                    val1 = Integer.parseInt(resultText.getText() + "");
                    Div = true;
                    resultText.setText("");
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultText.getText().length() > 0){
                    val1 = Integer.parseInt(resultText.getText() + "");
                    Add = true;
                    resultText.setText("");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultText.getText().length() > 0){
                    val1 = Integer.parseInt(resultText.getText() + "");
                    Sub = true;
                    resultText.setText("");
                }
            }
        });

        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnZero:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("0").toString());
                break;
            case R.id.btnOne:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("1").toString());
                break;
            case R.id.btnTwo:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("2").toString());
                break;
            case R.id.btnThree:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("3").toString());
                break;
            case R.id.btnFour:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("4").toString());
                break;
            case R.id.btnFive:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("5").toString());
                break;
            case R.id.btnSix:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("6").toString());
                break;
            case R.id.btnSeven:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("7").toString());
                break;
            case R.id.btnEight:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("8").toString());
                break;
            case R.id.btnNine:
                resultText.setText(new StringBuilder().append(resultText.getText()).append("9").toString());
                break;
        }
    }
}