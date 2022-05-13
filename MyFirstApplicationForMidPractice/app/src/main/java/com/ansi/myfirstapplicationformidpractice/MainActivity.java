package com.ansi.myfirstapplicationformidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    TextView t2;
    Button b1,b2;

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.editTextTextPersonName);
        t2 = findViewById(R.id.editTextTextPersonName2);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                b1.setText(t1.getText());
            }
        });
    }


    public void forButton2(View v) {
        b2.setText(t2.getText());
    }
}