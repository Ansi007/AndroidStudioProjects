package com.ansi.final_preperation_09_10;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button emailBtn, callBtn, messageBtn, shareBtn, webBtn, activityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG ACTIVITY", " onCreate Activity Main");

        setContentView(R.layout.activity_main);
        emailBtn = findViewById(R.id.buttonEmail);

        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, "annsshahbaz@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Practice");
                startActivity(intent);
            }
        });

        callBtn = findViewById(R.id.buttonCall);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri mail = Uri.parse("tel:+923144026961");
                Intent intent = new Intent(Intent.ACTION_DIAL, mail);
                startActivity(intent);
            }
        });


        messageBtn = findViewById(R.id.buttonMessage);

        messageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "message");
                startActivity(intent);
            }
        });


        shareBtn = findViewById(R.id.buttonShare);

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_MEDIA_SHARED);
//                startActivity(intent);
            }
        });

        webBtn = findViewById(R.id.buttonWeb);

        webBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri mail = Uri.parse("https://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, mail);
                startActivity(intent);
            }
        });


        activityBtn = findViewById(R.id.buttonNewActivity);

        activityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                intent.putExtra("CHECK", "CHECK");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG ACTIVITY", "onStart Activity Main");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG ACTIVITY", " onResume Activity Main");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG ACTIVITY", " onPause Activity Main");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG ACTIVITY", " onStop Activity Main");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG ACTIVITY", " onDestroy Activity Main");
    }

}