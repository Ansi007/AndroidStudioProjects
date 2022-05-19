package com.ansi.lecture19_5_2022_activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("Tag2","SecondActivityOnCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Tag2","SecondActivityOnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Tag2","SecondActivityOnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Tag2","SecondActivityOnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Tag2","SecondActivityOnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Tag2","SecondActivityOnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Tag2","SecondActivityOnRestart");
    }
}