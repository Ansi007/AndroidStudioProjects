package com.ansi.final_14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add,update, updateList;
    ListView list;
    EditText name,password;
    ArrayList<DataClass> arrayList;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.button);
        update = findViewById(R.id.button2);
        updateList = findViewById(R.id.button3);
        list = findViewById(R.id.listview);
        name = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPassword);

        updateList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList = getArrayList();
                adapter.notifyDataSetChanged();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String p = password.getText().toString();
                DataClass d = new DataClass(n,p);
                DbHelper dbHelper = new DbHelper(getApplicationContext());
                dbHelper.Add(d);
                arrayList = getArrayList();
                adapter.notifyDataSetChanged();
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String p = password.getText().toString();
                DataClass d = new DataClass(n,p);
                DbHelper dbHelper = new DbHelper(getApplicationContext());
                dbHelper.Update(d);
                arrayList = getArrayList();
                adapter.notifyDataSetChanged();
            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DataClass d = arrayList.get(i);
                DbHelper dbHelper = new DbHelper(getApplicationContext());
                dbHelper.Remove(d);
                arrayList = getArrayList();
                adapter.notifyDataSetChanged();
            }
        });
        arrayList = getArrayList();
        adapter = new MyAdapter(this,0 , arrayList);
        list.setAdapter(adapter);
    }
    public ArrayList<DataClass> getArrayList() {
        return new DbHelper(getApplicationContext()).getArrayList();
    }
}