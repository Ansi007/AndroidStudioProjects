
package com.ansi.lecture_16_08_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class StudentLayout extends AppCompatActivity {

    Button removeButton, updateButton;
    EditText nameText, rollNoText;
    Switch isEnrollSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_layout);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String rollNo = intent.getStringExtra("RollNo");
        String isEnroll = intent.getStringExtra("IsEnroll");
        String id = intent.getStringExtra("ID");
        nameText = (EditText) findViewById(R.id.nameEdit);
        rollNoText = (EditText) findViewById(R.id.rollNoEdit);
        isEnrollSwitch = (Switch) findViewById(R.id.enrollSwitch);
        removeButton = (Button) findViewById(R.id.buttonRemoveNew);
        updateButton =  (Button) findViewById(R.id.buttonUpdateNew);

        nameText.setText(name);
        rollNoText.setText(rollNo);
        isEnrollSwitch.setChecked(Boolean.parseBoolean(isEnroll));
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(StudentLayout.this);
                dbHelper.removeStudent(name);
                finish();
            }
        });

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(StudentLayout.this);
                StudentModel student = new StudentModel(nameText.getText().toString(), (rollNoText.getText().toString()), isEnrollSwitch.isChecked());
                dbHelper.updateStudent(name, student);
                finish();
            }
        });

    }

}