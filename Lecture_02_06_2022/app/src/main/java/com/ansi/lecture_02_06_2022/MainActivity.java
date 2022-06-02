package com.ansi.lecture_02_06_2022;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    Button button3;
    String color = "";
    String colors[] = {"Red","Blue","Green","Pink"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setText("CLICKED");
                LayoutInflater layoutInflater = getLayoutInflater();
                View myLayout = layoutInflater.inflate(R.layout.customtoast,null);
                ImageView imageView = myLayout.findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.ic_launcher_background);
                TextView textView = myLayout.findViewById(R.id.textView2);
                textView.setText("My Message");
                Toast toast = new Toast(getApplicationContext());
                toast.setView(myLayout);
                toast.show();
                //Toast.makeText(MainActivity.this, "GG", Toast.LENGTH_SHORT).show();
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Message for the builder");
                builder.setTitle("Title for the builder");
                builder.setCancelable(false);
                builder.setPositiveButton("Close App", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Choose any color").setItems(colors, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        LayoutInflater layoutInflater = getLayoutInflater();
                        View myLayout = layoutInflater.inflate(R.layout.customtoast,null);
                        ImageView imageView = myLayout.findViewById(R.id.imageView2);
                        imageView.setImageResource(R.drawable.ic_launcher_background);
                        TextView textView = myLayout.findViewById(R.id.textView2);
                        String text = colors[i];
                        textView.setText(text);
                        Toast toast = new Toast(getApplicationContext());
                        toast.setView(myLayout);
                        toast.show();
                    }
                });
            }
        });

    }
}