package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class RecyclerVIewBaseAdapterActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button btn;

    List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_base_adapter);

        recyclerView = findViewById(R.id.recyclerViewBase);

        btn = findViewById(R.id.button);

        list.clear();
        list.add("1");
        list.add("2");
        list.add("3");


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);
        recyclerView.setAdapter(adapter);

        btn.setOnClickListener(view -> {
            list.add("추가된 아이템");
            adapter.notifyItemInserted(list.size()-1);
        });
    }
}