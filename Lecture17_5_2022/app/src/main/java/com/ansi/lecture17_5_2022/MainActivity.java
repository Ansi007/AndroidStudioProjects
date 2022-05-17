package com.ansi.lecture17_5_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DialNumber(View view) {
        Uri uri = Uri.parse("tel:+923001234567");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    public void OpenBrowser(View view) {
        Uri uri = Uri.parse("https://www.google.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void EmailTo(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, "annsshahbaz@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        startActivity(intent);
    }

    public void MoveToSecondActivity(View view) {
        Intent intent = new Intent(this,Second_Activity.class);
        //startActivity(intent); //here this depends, sometimes it refers to class object
        //sometimes to onClick etc
        String message = "Assalam O Alaikum, ";
        intent.putExtra("Message",message);
        String country = "Pakistan";
        intent.putExtra("Country",country);
        startActivity(intent);

//        String text = t.getText().toString();
//        intent.putExtra("Message",text);
//        intent.putExtra("Country",text);
//        startActivity(intent);

    }
}

//Uri = Uri.parse("tel:+923001234567");
//Intent intent = new Intent(Intent.ACTION_DIAL,uri);   //Specifically to Dial a Number
//startActivity(intent);