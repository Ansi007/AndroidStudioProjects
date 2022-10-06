package com.ansi.final_14;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<DataClass> {
    private final Activity context;

    public MyAdapter(@NonNull Activity context, int resource, ArrayList<DataClass> arr) {
        super(context, resource, arr);
        this.context = context;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        view = inflater.inflate(R.layout.datalayout, null, false);
        TextView name = view.findViewById(R.id.textView);
        DataClass d = getItem(position);
        name.setText(d.getName());
        TextView pass = view.findViewById(R.id.textView2);
        pass.setText(d.getPassword());
        return view;
    }

}
