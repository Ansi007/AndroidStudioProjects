package com.ansi.final_preperation_11_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView list;
//    ArrayList<String> data = new ArrayList<>();
    ArrayList<DataClass> data = new ArrayList<>();
    SeekBar seekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        list = findViewById(R.id.listView);
//        data.add("AAA");
//        data.add("ABA");
//        data.add("ACA");
//        data.add("ADA");
//        data.add("AEA");
//        data.add("AFA");
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, data);
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
////                data.remove(i);
////                adapter.notifyDataSetChanged();
//                Intent intent = new Intent(MainActivity.this, Detail.class);
//                intent.putExtra("Text", data.get(i));
//                startActivity(intent);
//            }
//        });
//        Collections.sort(data);
//        list.setAdapter(adapter);
        list = findViewById(R.id.listView);
        data.add(new DataClass("1"));
        data.add(new DataClass("2"));
        data.add(new DataClass("3"));
        data.add(new DataClass("4"));
        data.add(new DataClass("5"));
        MyAdapter adapter = new MyAdapter(this, 0, data);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("Text", data.get(i).getText());
                startActivity(intent);
            }
        });
       /* seekbar = findViewById(R.id.seekBar3);
        seekbar.setMax(100);
        seekbar.setProgress(0);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(getApplicationContext(), i + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });*/
    }
}