package com.ansi.learningabc_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class list_activity extends AppCompatActivity {
    ListView mainListView;
    ArrayList<AlphabetWithImage> myImageList = new ArrayList<AlphabetWithImage>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mainListView = findViewById(R.id.mainList);
        myImageList.add(new AlphabetWithImage(R.drawable.apple,"Aa"));
        myImageList.add(new AlphabetWithImage(R.drawable.airplane,"Aa"));
        MyAdapter myAdapter = new MyAdapter(this,0,myImageList);
        mainListView.setAdapter(myAdapter);
    }
}