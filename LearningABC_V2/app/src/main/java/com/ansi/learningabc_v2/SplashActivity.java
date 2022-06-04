package com.ansi.learningabc_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SplashActivity extends AppCompatActivity {

    ImageButton learnButton,testButton, repositoryButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        learnButton = findViewById(R.id.btnLearn);
        testButton = findViewById(R.id.btnTest);
        repositoryButton = findViewById(R.id.btnRepository);
        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        testButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(SplashActivity.this,TestActivity.class);
                        startActivity(intent);
                    }
                }
        );

        repositoryButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openWebPage("https://github.com/Ansi007/AndroidStudioProjects/tree/main/LearningABC_V2");
                    }
                }
        );
    }
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}