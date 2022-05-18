package com.ansi.learningabc_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MoveToSecondActivity(View view) {
        Intent intent = new Intent(this,ShowImageActivity.class);
        String image = "";
        switch (view.getId()){
            case R.id.btnA:
                image = "imagea";
                break;
            default:
                break;
        }
        intent.putExtra("Image",image);
        startActivity(intent);
    }
}