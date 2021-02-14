package com.example.calculator;

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

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Database> {

    private Activity context;
    private List<Database> scoreList;

    public CustomAdapter(Activity context,List<Database> scoreList) {
        super(context, R.layout.sample_layout, scoreList);
        this.context = context;
        this.scoreList = scoreList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout,null,true);

        Database database = scoreList.get(position);

        TextView nameView = view.findViewById(R.id.nameSample);
        TextView scoreView = view.findViewById(R.id.scoreSample);

        nameView.setText(database.getName());
        scoreView.setText(database.getScore());

        return view;
    }
}
