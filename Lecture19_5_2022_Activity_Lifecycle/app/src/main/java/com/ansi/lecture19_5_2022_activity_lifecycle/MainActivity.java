package com.ansi.lecture19_5_2022_activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Tag","MainActivityOnCreate");
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("value", "Last Button Text");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String myString = savedInstanceState.getString("value");
        btn.setText(myString);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Tag","MainActivityOnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Tag","MainActivityOnResume");
    }

    @Override
    protected    void onPause(){
        super.onPause();
        Log.d("Tag","MainActivityOnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Tag","MainActivityOnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Tag","MainActivityOnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Tag","MainActivityOnRestart");
        //Revision
    }
}