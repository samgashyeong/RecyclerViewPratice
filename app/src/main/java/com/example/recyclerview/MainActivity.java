package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button listViewBtn;
    Button recyclerViewBaseBtn;
    Button recyclerVIewListBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewBtn = findViewById(R.id.ListViewBtn);
        recyclerViewBaseBtn = findViewById(R.id.RecyclerViewBaseBtn);
        recyclerVIewListBtn = findViewById(R.id.RecyclerViewListBtn);

        listViewBtn.setOnClickListener(view ->{
            startActivity(new Intent(this, ListViewActivity.class));
        });

        recyclerViewBaseBtn.setOnClickListener(view -> {
            startActivity(new Intent(this, RecyclerVIewBaseAdapterActivity.class));
        });

        recyclerVIewListBtn.setOnClickListener(view -> {
            startActivity(new Intent(this, RecyclerViewListAdapterActivity.class));
        });
    }
}