package com.androidtut.qaifi.collapsingtoolbartutorial;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CollapsingToolbarLayout toolbarLayout = findViewById(R.id.collapsing_toolbar);
        toolbarLayout.setTitle("Collapsing Toolbar");
        toolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.colorAccent));
        toolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
    }
}
