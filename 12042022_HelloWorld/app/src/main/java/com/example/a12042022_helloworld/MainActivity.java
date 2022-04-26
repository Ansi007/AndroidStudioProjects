package com.example.a12042022_helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    Slider redSlider;
    Slider greenSlider;
    Slider blueSlider;
    Button button;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redSlider = findViewById(R.id.redSlider);
        greenSlider = findViewById(R.id.greenSlider);
        blueSlider = findViewById(R.id.blueSlider);
        button = findViewById(R.id.button);

        redSlider.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                setRGB();
            }
        });

        greenSlider.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                setRGB();
            }
        });

        blueSlider.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                setRGB();
            }
        });

        /*
        myButton = findViewById(R.id.button2);
        myTextView = findViewById(R.id.textview);
//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myTextView.setText("Button Clicked");
//            }
//        });
        myButton.setOnClickListener(view -> myTextView.setText("Button Clicked By New Lambda"));
    }

//    public void myView(View view) {
//        myButton.setBackgroundColor(199);
//    }*/


    }

    void setRGB() {
        float rV = redSlider.getValue();
        float gV = greenSlider.getValue();
        float bV = blueSlider.getValue();
        String color = "";
        color = Float.toString(rV) + "," + Float.toString(gV) + "," + Float.toString(bV);
        button.setText(color);
    }

}