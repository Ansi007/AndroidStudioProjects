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
        int image = selectImage(view.getId());
        Log.d("NumberMain",Integer.toString(image));
        Intent intent = new Intent(MainActivity.this,ShowImageActivity.class);
        intent.putExtra("Image",image);
        startActivity(intent);
    }

    int selectImage(int id) {
        int image = -1;
        switch (id){
            case R.id.btnA:
                image = R.drawable.imagea;
                break;
            case R.id.btnB:
                image = R.drawable.imageb;
                break;
            case R.id.btnC:
                image = R.drawable.imagec;
                break;
            case R.id.btnD:
                image = R.drawable.imaged;
                break;
            case R.id.btnE:
                image = R.drawable.imagee;
                break;
            case R.id.btnF:
                image = R.drawable.imagef;
                break;
            case R.id.btnG:
                image = R.drawable.imageg;
                break;
            case R.id.btnH:
                image = R.drawable.imageh;
                break;
            case R.id.btnI:
                image = R.drawable.imagei;
                break;
            case R.id.btnJ:
                image = R.drawable.imagej;
                break;
            case R.id.btnK:
                image = R.drawable.imagek;
                break;
            case R.id.btnL:
                image = R.drawable.imagel;
                break;
            case R.id.btnM:
                image = R.drawable.imagem;
                break;
            case R.id.btnN:
                image = R.drawable.imagen;
                break;
            case R.id.btnO:
                image = R.drawable.imageo;
                break;
            case R.id.btnP:
                image = R.drawable.imagep;
                break;
            case R.id.btnQ:
                image = R.drawable.imageq;
                break;
            case R.id.btnR:
                image = R.drawable.imager;
                break;
            case R.id.btnS:
                image = R.drawable.images;
                break;
            case R.id.btnT:
                image = R.drawable.imaget;
                break;
            case R.id.btnU:
                image = R.drawable.imageu;
                break;
            case R.id.btnV:
                image = R.drawable.imagev;
                break;
            case R.id.btnW:
                image = R.drawable.imagew;
                break;
            case R.id.btnX:
                image = R.drawable.imagex;
                break;
            case R.id.btnY:
                image = R.drawable.imagey;
                break;
            case R.id.btnZ:
                image = R.drawable.imagez;
                break;
            default:
                break;
        }
        return image;
    }

}