package com.example.a21042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView counter;
    Button incButton, decButton, resButton;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = findViewById(R.id.counter);
        incButton = findViewById(R.id.increase);
        decButton = findViewById(R.id.decrease);
        resButton = findViewById(R.id.reset);


    }

    public void OnReset(View view) {
        counter.setText('0');
    }

    public void OnIncrease(View view) {
        count++;
        counter.setText(count);
    }

    public void OnDecrease(View view) {
        if(count > 0) {
            count--;
            counter.setText(count);
        }
    }
}