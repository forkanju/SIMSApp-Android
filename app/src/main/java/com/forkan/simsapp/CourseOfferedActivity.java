package com.forkan.simsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CourseOfferedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_offered);
        getSupportActionBar().setTitle("Offered Courses");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}