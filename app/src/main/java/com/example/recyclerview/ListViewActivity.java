package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;

    List<String> list = new ArrayList<>();
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.listView);
        addBtn = findViewById(R.id.addBtn);

        list.clear();
        list.add("1");
        list.add("2");
        list.add("3");


        ListViewAdapter adapter = new ListViewAdapter(list);
        listView.setAdapter(adapter);

        addBtn.setOnClickListener(view -> {
            list.add("추가된 아이템");
            adapter.notifyDataSetChanged();
        });
    }
}