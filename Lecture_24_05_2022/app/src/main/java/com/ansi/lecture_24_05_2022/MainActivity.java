package com.ansi.lecture_24_05_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> friendList;
    Button btn;
    TextView nameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        nameView = findViewById(R.id.name);
        listView = findViewById(R.id.mylist);
        friendList = new ArrayList<>();
        friendList.add("Anns");
        friendList.add("Ahmad");
        friendList.add("Saad");
        friendList.add("Adil");
        friendList.add("Dar");
        friendList.add("Usman");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendList);
        listView.setAdapter(arrayAdapter);
        //Collections.sort(friendList);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                friendList.add(nameView.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}