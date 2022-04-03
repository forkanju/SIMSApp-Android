package com.forkan.simsapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeActivity extends AppCompatActivity {

    CardView cOffered;
    CardView cFilter;
    CardView pCheckup;
    CardView aSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        cOffered = findViewById(R.id.courses_offered);
        cFilter = findViewById(R.id.course_filter);
        pCheckup = findViewById(R.id.pre_checkup);
        aSchedule = findViewById(R.id.advising_schedule);

        cOffered.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, CourseOfferedActivity.class);
            startActivity(intent);
        });

        pCheckup.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, PreCheckupActivity.class);
            startActivity(intent);
        });



    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}