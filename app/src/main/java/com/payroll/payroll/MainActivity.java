package com.payroll.payroll;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        CardView cardPayslips = findViewById(R.id.card_payslips);
        CardView cardProfile  = findViewById(R.id.card_profile);
        CardView cardAttendance = findViewById(R.id.card_attendance);
        CardView cardLeave = findViewById(R.id.card_leave);
        CardView cardDeductions = findViewById(R.id.card_deductions);
        CardView cardSupport = findViewById(R.id.card_support);

        cardPayslips.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PayslipsActivity.class);
            startActivity(intent);
        });

        cardProfile.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        cardAttendance.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AttendanceActivity.class);
            startActivity(intent);
        });

        cardLeave.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LeaveActivity.class);
            startActivity(intent);
        });

        cardDeductions.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DeductionsActivity.class);
            startActivity(intent);
        });

        cardSupport.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SupportActivity.class);
            startActivity(intent);
        });
    }
}