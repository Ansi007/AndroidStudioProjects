package com.ansi.learningabc_v2;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<AlphabetWithImage> {
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<AlphabetWithImage> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        AlphabetWithImage alpha = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.letterwithimage,parent,false);
        ImageView image = convertView.findViewById(R.id.imageViewShape);
        image.setImageResource(alpha.getImageId());
        TextView alphabetTextView = convertView.findViewById(R.id.textViewLetter);
        alphabetTextView.setText(alpha.getAlphabet());
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int imageId = alpha.getImageId();
                Context context = getContext();
                Intent intent = new Intent(context,ShowImageActivity.class);
                intent.putExtra("Image",imageId);
                Log.d("IMAGEIDOLD", String.valueOf(imageId));
                context.startActivity(intent);
            }
        });
        alphabetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int imageId = alpha.getImageId();
                Context context = getContext();
                Intent intent = new Intent(context,ShowImageWithLabelActivity.class);
                intent.putExtra("Alphabet",alpha.getAlphabet());
                intent.putExtra("Image",imageId);
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
