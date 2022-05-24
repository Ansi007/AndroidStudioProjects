package com.ansi.adapterpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView nameView;
    Button btnEnter;
    ListView friendsListView;
    ArrayList<String> friendsList;
    ArrayAdapter<String> friendsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameView = findViewById(R.id.nameView);
        btnEnter = findViewById(R.id.btnEnter);
        friendsListView = findViewById(R.id.friendsListView);
        friendsList = new ArrayList<String>();
        friendsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,friendsList);
        friendsListView.setAdapter(friendsAdapter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameView.getText().toString();
                if(!name.equals("")) {
                    friendsList.add(name);
                    Collections.sort(friendsList);
                    friendsAdapter.notifyDataSetChanged();
                    nameView.setText("");
                }
            }
        });
    }
}