package com.ansi.myfirstapplicationformidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox c1,c2,c3;
    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.checkBox:
                c1.setText(Integer.toString(R.id.checkBox));
                break;
            case R.id.checkBox2:
                c2.setText(Integer.toString(R.id.checkBox2));
                break;
            case R.id.checkBox3:
                c3.setText(Integer.toString(R.id.checkBox3));
                break;
        }
    }

}