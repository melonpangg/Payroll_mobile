package com.payroll.payroll;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start); // connect to your splash XML

        // Show splash for 3 seconds, then open MainActivity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(StartActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // close splash so user can’t go back to it
        }, 3000); // 3000 ms = 3 seconds
    }
}