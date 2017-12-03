package com.example.practice.recyclerview.listexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListExamMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exam_main);

        String[] foods = {"Apple ","Potato ","Banana "};
        ListAdapter buckyAdapter = new CustomAdapter(this, foods);
        ListView buckyListView = (ListView) findViewById(R.id.buckyListView);
        buckyListView.setAdapter(buckyAdapter);

        buckyListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(ListExamMainActivity.this,food,Toast.LENGTH_LONG).show();
                    }
                }
        );

    }
}
