package com.example.qazacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.chip.Chip;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Chip fajarChip,zoharChip,asarChip,magribChip,ishaChip,witrChip;
    Chip fajarChipD,zoharChipD,asarChipD,magribChipD,ishaChipD,witrChipD;
    Button fajarBtn,zoharBtn,asarBtn,magribBtn,ishaBtn,witrBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fajarChip = findViewById(R.id.fajarChip);
        zoharChip = findViewById(R.id.zoharChip);
        asarChip = findViewById(R.id.asarChip);
        magribChip = findViewById(R.id.magribChip);
        ishaChip = findViewById(R.id.ishaChip);
        witrChip = findViewById(R.id.witrChip);
        fajarChip.setOnClickListener(this);
        zoharChip.setOnClickListener(this);
        asarChip.setOnClickListener(this);
        magribChip.setOnClickListener(this);
        ishaChip.setOnClickListener(this);
        witrChip.setOnClickListener(this);
        fajarChipD = findViewById(R.id.fajarChip3);
        zoharChipD = findViewById(R.id.zoharChip3);
        asarChipD = findViewById(R.id.asarChip3);
        magribChipD = findViewById(R.id.magribChip3);
        ishaChipD = findViewById(R.id.ishaChip3);
        witrChipD = findViewById(R.id.witrChip3);
        fajarChipD.setOnClickListener(this);
        zoharChipD.setOnClickListener(this);
        asarChipD.setOnClickListener(this);
        magribChipD.setOnClickListener(this);
        ishaChipD.setOnClickListener(this);
        witrChipD.setOnClickListener(this);
        fajarBtn = findViewById(R.id.fajarCount);
        zoharBtn = findViewById(R.id.zoharCount);
        asarBtn = findViewById(R.id.asarCount);
        magribBtn = findViewById(R.id.magribCount);
        ishaBtn = findViewById(R.id.ishaCount);
        witrBtn = findViewById(R.id.witrCount);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fajarChip:
                fajarBtn.setText(Integer.toString(Integer.parseInt((String) fajarBtn.getText()) + 1));
                break;
            case R.id.zoharChip:
                zoharBtn.setText(Integer.toString(Integer.parseInt((String) zoharBtn.getText()) + 1));
                break;
            case R.id.asarChip:
                asarBtn.setText(Integer.toString(Integer.parseInt((String) asarBtn.getText()) + 1));
                break;
            case R.id.magribChip:
                magribBtn.setText(Integer.toString(Integer.parseInt((String) magribBtn.getText()) + 1));
                break;
            case R.id.ishaChip:
                ishaBtn.setText(Integer.toString(Integer.parseInt((String) ishaBtn.getText()) + 1));
                break;
            case R.id.witrChip:
                witrBtn.setText(Integer.toString(Integer.parseInt((String) witrBtn.getText()) + 1));
                break;
            case R.id.fajarChip3:
                if(Integer.parseInt((String) fajarBtn.getText()) > 0) fajarBtn.setText(Integer.toString(Integer.parseInt((String) fajarBtn.getText()) - 1));
                break;
            case R.id.zoharChip3:
                if(Integer.parseInt((String) zoharBtn.getText()) > 0) zoharBtn.setText(Integer.toString(Integer.parseInt((String) zoharBtn.getText()) - 1));
                break;
            case R.id.asarChip3:
                if(Integer.parseInt((String) asarBtn.getText()) > 0) asarBtn.setText(Integer.toString(Integer.parseInt((String) asarBtn.getText()) - 1));
                break;
            case R.id.magribChip3:
                if(Integer.parseInt((String) magribBtn.getText()) > 0) magribBtn.setText(Integer.toString(Integer.parseInt((String) magribBtn.getText()) - 1));
                break;
            case R.id.ishaChip3:
                if(Integer.parseInt((String) ishaBtn.getText()) > 0) ishaBtn.setText(Integer.toString(Integer.parseInt((String) ishaBtn.getText()) - 1));
                break;
            case R.id.witrChip3:
                if(Integer.parseInt((String) witrBtn.getText()) > 0) witrBtn.setText(Integer.toString(Integer.parseInt((String) witrBtn.getText()) - 1));
                break;
        }
    }
}