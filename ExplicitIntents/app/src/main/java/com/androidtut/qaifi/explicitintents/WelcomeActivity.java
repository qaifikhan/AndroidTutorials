package com.androidtut.qaifi.explicitintents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private TextView txtWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String strUsername = getIntent().getStringExtra("Username");
        txtWelcome = findViewById(R.id.txt_welcome);

        txtWelcome.setText("Welcome " + strUsername);
    }
}
