package com.androidtut.qaifi.recyclerviewtutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        CustomAdapter customAdapter = new CustomAdapter(this, getArrayList());
        recyclerView.setAdapter(customAdapter);
    }

    private ArrayList<String> getArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String s = "Cupcake";
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);
        arrayList.add(s);

        return arrayList;
    }
}
