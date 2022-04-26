package com.example.a26042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBoxDone;
    CheckBox checkBoxPending;
    CheckBox checkBoxRead;
    Button mainButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxDone = findViewById(R.id.checkBoxDone);
        checkBoxPending = findViewById(R.id.checkBoxPending);
        checkBoxRead = findViewById(R.id.checkBoxRead);
        mainButton = findViewById(R.id.mainButton);
        checkBoxDone.setOnClickListener(this);
        checkBoxPending.setOnClickListener(this);
        checkBoxRead.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.checkBoxDone:
                if(checkBoxDone.isChecked()) mainButton.setText("Check Box Done Checked");
                else mainButton.setText("Check Box Done Un Checked");
                break;
            case R.id.checkBoxPending:
                if(checkBoxPending.isChecked()) mainButton.setText("Check Box Pending Checked");
                else mainButton.setText("Check Box Pending Un Checked");
                break;
            case R.id.checkBoxRead:
                if(checkBoxRead.isChecked()) mainButton.setText("Check Box Read Checked");
                else mainButton.setText("Check Box Read Un Checked");
                break;
        }
    }
}