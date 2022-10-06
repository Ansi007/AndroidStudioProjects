package com.ansi.final_preperation_11_12;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

//public class MyAdapter extends ArrayAdapter {
//    private final Activity context;
//    private final ArrayList<String> myData;
//    public MyAdapter(Activity context, ArrayList<String> data) {
//        super(context, R.layout.activity_detail, data);
//        this.context = context;
//        myData = data;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        LayoutInflater inflater = context.getLayoutInflater();
//        View view = inflater.inflate(R.layout.activity_detail, null, false);
//        TextView textView = view.findViewById(R.id.textView);
//        textView.setText(myData.get(position));
//        return view;
//    }
//}

public class MyAdapter extends ArrayAdapter<DataClass> {

    public MyAdapter(Activity context, int resource, List<DataClass> list) {
        super(context, resource, list);
    }
    public View getView(int position, View convertVew, ViewGroup parent) {
        DataClass data = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertVew = inflater.inflate(R.layout.activity_detail, null, false);
        TextView tx = convertVew.findViewById(R.id.textView);
        tx.setText(data.getText());
        return convertVew;
    }

}
