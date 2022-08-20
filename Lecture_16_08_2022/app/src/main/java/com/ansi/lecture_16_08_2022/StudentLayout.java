package com.ansi.lecture_16_08_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class StudentLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_layout);
//
//        Intent intent = getIntent();
//        String name = intent.getStringExtra("Name");
//        String rollNo = intent.getStringExtra("RollNo");
//        String isEnroll = intent.getStringExtra("IsEnroll");
//        String id = (intent.getStringExtra("Id"));
//        EditText nameText = findViewById(R.id.nameEdit);
//        EditText rollNoText = findViewById(R.id.rollNoEdit);
//        Switch isEnrollSwitch = findViewById(R.id.enrollSwitch);
//
//        nameText.setText(name);
//        rollNoText.setText(rollNo);
//        isEnrollSwitch.setChecked(isEnroll == "True" ? true : false);
//
//        Button remove = findViewById(R.id.removeButton);
//        Button update = findViewById(R.id.updateButton);
//        remove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                DBHelper dbHelper = new DBHelper(StudentLayout.this);
//                dbHelper.removeStudent(id);
//            }
//        });
//
//        update.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                DBHelper dbHelper = new DBHelper(StudentLayout.this);
//                StudentModel student = new StudentModel(nameText.getText().toString(), Integer.parseInt(rollNoText.getText().toString()), isEnrollSwitch.isChecked());
//                dbHelper.updateStudent(student, id);
//            }
//        });

    }

}