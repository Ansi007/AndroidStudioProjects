
package com.ansi.lec_31_05_2022_arrayadapter_customized;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Student> {
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.studentlayout,parent,false);
        TextView textViewName = convertView.findViewById(R.id.textViewName);
        textViewName.setText(student.getName());
        TextView textViewId = convertView.findViewById(R.id.textViewId);
        textViewId.setText(student.getId());
        TextView textViewSection = convertView.findViewById(R.id.textViewSection);
        textViewSection.setText(student.getSection());
        ImageView imageView = convertView.findViewById(R.id.imageView);
        imageView.setImageResource(student.getImageId());

        textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getContext());
                Log.d("Tag",textViewName.getText().toString());
            }
        });
        return convertView;
    }
}