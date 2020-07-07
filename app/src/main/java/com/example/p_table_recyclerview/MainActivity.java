package com.example.p_table_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private List<Test> tests;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tests = new ArrayList<>();
        Test test = new Test("123","1234","12345","1","222","123456","123");
        for(int i=0; i<50; i++){
            tests.add(test);
        }

        TestRecyclerViewAdapter testRecyclerViewAdapter = new TestRecyclerViewAdapter(tests);
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(testRecyclerViewAdapter);
    }
}
