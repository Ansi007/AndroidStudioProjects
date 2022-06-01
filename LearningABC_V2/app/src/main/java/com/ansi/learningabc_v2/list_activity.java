package com.ansi.learningabc_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class list_activity extends AppCompatActivity {
    ListView mainListView;
    ArrayList<AlphabetWithImage> myImageList = new ArrayList<AlphabetWithImage>();
    int imagesA[] = {R.drawable.apple,R.drawable.airplane,R.drawable.ant,R.drawable.arrow,R.drawable.art};
    int imagesB[] = {R.drawable.box,R.drawable.boy,R.drawable.bus};
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
        }

        for (int i : loopArray) {
            myImageList.add(new AlphabetWithImage(i,alphabet));
        }
    }
}