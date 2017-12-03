package com.example.practice.recyclerview.listexample;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {
     CustomAdapter(Context context,String[] foods) {
        super(context, R.layout.custom_row);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater buckyInflater = LayoutInflater.from(getContext());
        View customView = buckyInflater.inflate(R.layout.custom_row,parent, false);

        String singleFoodItem = getItem(position);
        TextView buckyText = (TextView) customView.findViewById(R.id.buckyText);
        ImageView image = (ImageView) customView.findViewById(R.id.image);

        buckyText.setText(singleFoodItem);
        image.setImageResource(R.drawable.image);
        return customView;

    }




}
