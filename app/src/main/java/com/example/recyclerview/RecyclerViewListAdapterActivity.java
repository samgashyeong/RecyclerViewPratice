package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewListAdapterActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_list_adapter);
        addBtn = findViewById(R.id.editListBtn);
        recyclerView = findViewById(R.id.recyclerViewList);


        RecyclerViewListAdapter adapter = new RecyclerViewListAdapter(new RecyclerViewListAdapterDiffUtil());
        recyclerView.setAdapter(adapter);
        addBtn.setOnClickListener(view -> {
            List<String> list = new ArrayList<>();
            for(int i =0; i<20;i++){
                int num = (int)(Math.random() * 100);
                list.add(String.valueOf(num));
            }
            adapter.submitList(list);
        });
    }
}