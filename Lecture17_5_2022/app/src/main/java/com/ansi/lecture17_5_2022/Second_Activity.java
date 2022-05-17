package com.ansi.lecture17_5_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent(); //Get the intent passed here
        String msg = intent.getStringExtra("Message");
        String country = intent.getStringExtra("Country");
        String text = msg + country;
        t = (TextView) findViewById(R.id.textView);
        t.setText(text);
    }
}