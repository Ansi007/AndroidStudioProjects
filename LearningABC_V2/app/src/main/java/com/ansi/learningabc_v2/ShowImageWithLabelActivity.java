package com.ansi.learningabc_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowImageWithLabelActivity extends AppCompatActivity {
    ImageView imageView;
    TextView alphabetTextView;
    TextView nameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image_with_label);
        alphabetTextView = findViewById(R.id.alphabetTextView);
        nameTextView = findViewById(R.id.nameTextView);
        imageView = findViewById(R.id.imageViewCenterShape);
        Intent intent = getIntent();
        int imageId = intent.getIntExtra("Image",-1);
        String alphabet = intent.getStringExtra("Alphabet");
        if(imageId == -1){
            //Error Loading
        }
        String imageName = getResources().getResourceName(imageId);
        imageName = imageName.substring(imageName.indexOf('/') + 1);
        imageName = imageName.substring(0, 1).toUpperCase() + imageName.substring(1);
        nameTextView.setText(imageName);
        alphabetTextView.setText(alphabet);
        imageView.setImageResource(imageId);
    }
}