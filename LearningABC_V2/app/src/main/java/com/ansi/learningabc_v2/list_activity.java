package com.ansi.learningabc_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class list_activity extends AppCompatActivity {
    ListView mainListView;
    ArrayList<AlphabetWithImage> myImageList = new ArrayList<AlphabetWithImage>();
    int imagesA[] = {R.drawable.apple,R.drawable.airplane};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mainListView = findViewById(R.id.mainList);
        for (int i : imagesA) {
            myImageList.add(new AlphabetWithImage(i,"Aa"));
        }
        MyAdapter myAdapter = new MyAdapter(this,0,myImageList);
        mainListView.setAdapter(myAdapter);
    }
}