package com.ansi.learningabc_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class list_activity extends AppCompatActivity {
    ListView mainListView;
    ArrayList<AlphabetWithImage> myImageList = new ArrayList<AlphabetWithImage>();
    int imagesA[] = {R.drawable.apple,R.drawable.airplane,R.drawable.ant,R.drawable.arrow,R.drawable.art};
    int imagesB[] = {R.drawable.box,R.drawable.boy,R.drawable.bus,R.drawable.bus,R.drawable.bed};
    int imagesC[] = {R.drawable.cake,R.drawable.car,R.drawable.candy,R.drawable.cat,R.drawable.cow};
    int imagesD[] = {R.drawable.dog,R.drawable.drum,R.drawable.drink,R.drawable.ducky};
    int imagesE[] = {R.drawable.eagle,R.drawable.earth,R.drawable.elephant,R.drawable.eleven,R.drawable.eye};
    int imagesF[] = {R.drawable.frog,R.drawable.face,R.drawable.five,R.drawable.flower,R.drawable.fox};
    int imagesG[] = {R.drawable.giraffe,R.drawable.girl,R.drawable.gloves,R.drawable.glue};
    int imagesH[] = {R.drawable.hen,R.drawable.hammer,R.drawable.helicopter,R.drawable.hungry,R.drawable.house};
    int imagesI[] = {R.drawable.igloo,R.drawable.ink,R.drawable.iron,R.drawable.icecream};
    int imagesJ[] = {R.drawable.jam,R.drawable.jeep,R.drawable.joker,R.drawable.jug,R.drawable.juice};
    int imagesK[] = {R.drawable.kangaroo,R.drawable.ketchup,R.drawable.kids,R.drawable.king,R.drawable.kite};
    int imagesL[] = {R.drawable.ladder,R.drawable.lamb,R.drawable.lamp,R.drawable.lava,R.drawable.lemon};
    int imagesM[] = {R.drawable.map,R.drawable.mango,R.drawable.mom,R.drawable.monkey,R.drawable.mouse};
    int imagesN[] = {R.drawable.nurse,R.drawable.nest,R.drawable.nails,R.drawable.notebook,R.drawable.nap};
    int imagesO[] = {R.drawable.octopus,R.drawable.one,R.drawable.ox,R.drawable.owl,R.drawable.orange,R.drawable.office};
    int imagesP[] = {R.drawable.pineapple,R.drawable.pizza,R.drawable.phone,R.drawable.pants,R.drawable.pen};
    int imagesQ[] = {R.drawable.queen,R.drawable.quack,R.drawable.question,R.drawable.queue,R.drawable.quiet};
    int imagesR[] = {R.drawable.rainbow,R.drawable.road,R.drawable.rain,R.drawable.rope};
    int imagesS[] = {R.drawable.school,R.drawable.sleep,R.drawable.star,R.drawable.smile,R.drawable.sun};
    int imagesT[] = {R.drawable.table,R.drawable.tea,R.drawable.teacher,R.drawable.telephone};
    int imagesU[] = {R.drawable.umbrella,R.drawable.uncle,R.drawable.under,R.drawable.unicorn,R.drawable.uniform};
    int imagesV[] = {R.drawable.van,R.drawable.vet,R.drawable.virus};
    int imagesW[] = {R.drawable.watermelon,R.drawable.water,R.drawable.wizard,R.drawable.wolf,R.drawable.workout};
    int imagesX[] = {R.drawable.xray,R.drawable.xylophone};
    int imagesY[] = {R.drawable.yacht,R.drawable.yell,R.drawable.yawn,R.drawable.yogurt,R.drawable.yoyo};
    int imagesZ[] = {R.drawable.zero,R.drawable.zero,R.drawable.zip,R.drawable.zoo,R.drawable.zigzag};
    int loopArray[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mainListView = findViewById(R.id.mainList);
        setData();
        MyAdapter myAdapter = new MyAdapter(this,0,myImageList);
        mainListView.setAdapter(myAdapter);
    }

    void setData() {
        int buttonId = getIntent().getIntExtra("ButtonId",-1);
        String alphabet = "";
        switch (buttonId){
            case R.id.btnA:
                loopArray = imagesA;
                alphabet = "Aa";
                break;
            case R.id.btnB:
                loopArray = imagesB;
                alphabet = "Bb";
                break;
            case R.id.btnC:
                loopArray = imagesC;
                alphabet = "Cc";
                break;
            case R.id.btnD:
                loopArray = imagesD;
                alphabet = "Dd";
                break;
            case R.id.btnE:
                loopArray = imagesE;
                alphabet = "Ee";
                break;
            case R.id.btnF:
                loopArray = imagesF;
                alphabet = "Ff";
                break;
            case R.id.btnG:
                loopArray = imagesG;
                alphabet = "Gg";
                break;
            case R.id.btnH:
                loopArray = imagesH;
                alphabet = "Hh";
                break;
            case R.id.btnI:
                loopArray = imagesI;
                alphabet = "Ii";
                break;
            case R.id.btnJ:
                loopArray = imagesJ;
                alphabet = "Jj";
                break;
            case R.id.btnK:
                loopArray = imagesK;
                alphabet = "Kk";
                break;
            case R.id.btnL:
                loopArray = imagesL;
                alphabet = "Ll";
                break;
            case R.id.btnM:
                loopArray = imagesM;
                alphabet = "Mm";
                break;
            case R.id.btnN:
                loopArray = imagesN;
                alphabet = "Nn";
                break;
            case R.id.btnO:
                loopArray = imagesO;
                alphabet = "Oo";
                break;
            case R.id.btnP:
                loopArray = imagesP;
                alphabet = "Pp";
                break;
            case R.id.btnQ:
                loopArray = imagesQ;
                alphabet = "Qq";
                break;
            case R.id.btnR:
                loopArray = imagesR;
                alphabet = "Rr";
                break;
            case R.id.btnS:
                loopArray = imagesS;
                alphabet = "Ss";
                break;
            case R.id.btnT:
                loopArray = imagesT;
                alphabet = "Tt";
                break;
            case R.id.btnU:
                loopArray = imagesU;
                alphabet = "Uu";
                break;
            case R.id.btnV:
                loopArray = imagesV;
                alphabet = "Vv";
                break;
            case R.id.btnW:
                loopArray = imagesW;
                alphabet = "Ww";
                break;
            case R.id.btnX:
                loopArray = imagesX;
                alphabet = "Xx";
                break;
            case R.id.btnY:
                loopArray = imagesY;
                alphabet = "Yy";
                break;
            case R.id.btnZ:
                loopArray = imagesZ;
                alphabet = "Zz";
                break;
        }

        for (int i : loopArray) {
            myImageList.add(new AlphabetWithImage(i,alphabet));
        }
    }
}