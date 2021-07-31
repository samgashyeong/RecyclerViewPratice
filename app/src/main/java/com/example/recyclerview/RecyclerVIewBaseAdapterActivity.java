package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerVIewBaseAdapterActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_base_adapter);

        recyclerView = findViewById(R.id.recyclerViewBase);


        list.clear();
        list.add("1");
        list.add("2");
        list.add("3");


        recyclerView.setAdapter(new RecyclerViewAdapter(list));
    }
}