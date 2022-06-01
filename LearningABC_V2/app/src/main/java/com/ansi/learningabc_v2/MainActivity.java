package com.ansi.learningabc_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton[] buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new ImageButton[26];
        buttons[0] = findViewById(R.id.btnA);
        buttons[1] = findViewById(R.id.btnB);
        buttons[2] = findViewById(R.id.btnC);
        buttons[3] = findViewById(R.id.btnD);
        buttons[4] = findViewById(R.id.btnE);
        buttons[5] = findViewById(R.id.btnF);
        buttons[6] = findViewById(R.id.btnG);
        buttons[7] = findViewById(R.id.btnH);
        buttons[8] = findViewById(R.id.btnI);
        buttons[9] = findViewById(R.id.btnJ);
        buttons[10] = findViewById(R.id.btnK);
        buttons[11] = findViewById(R.id.btnL);
        buttons[12] = findViewById(R.id.btnM);
        buttons[13] = findViewById(R.id.btnN);
        buttons[14] = findViewById(R.id.btnO);
        buttons[15] = findViewById(R.id.btnP);
        buttons[16] = findViewById(R.id.btnQ);
        buttons[17] = findViewById(R.id.btnR);
        buttons[18] = findViewById(R.id.btnS);
        buttons[19] = findViewById(R.id.btnT);
        buttons[20] = findViewById(R.id.btnU);
        buttons[21] = findViewById(R.id.btnV);
        buttons[22] = findViewById(R.id.btnW);
        buttons[23] = findViewById(R.id.btnX);
        buttons[24] = findViewById(R.id.btnY);
        buttons[25] = findViewById(R.id.btnZ);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        int buttonId = view.getId();
        Intent intent = new Intent(MainActivity.this,list_activity.class);
        intent.putExtra("Button",buttonId);
        startActivity(intent);
    }
//Resources kese add krte hain folder by folder
//Kese sab views k liye mantain krein layout ko expand ya shrink
}