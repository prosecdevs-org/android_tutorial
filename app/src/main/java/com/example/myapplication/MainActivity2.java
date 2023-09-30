package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    String text;
    MyAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        List<String> list = Arrays.asList("Str1","Str2");
        recyclerView = findViewById(R.id.recyclerFirst);
        adapter = new MyAdapter(getApplicationContext(),list);
        recyclerView.setAdapter(adapter);
    }
}