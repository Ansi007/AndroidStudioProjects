
package com.ansi.lec_31_05_2022_arrayadapter_customized;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        return convertView;
    }
}
