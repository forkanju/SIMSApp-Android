package com.forkan.simsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PreCheckupActivity extends AppCompatActivity {

    LinearLayout inputLayout;
    LinearLayout resultLayout;
    Button btnSubmit, reSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_checkup);
        getSupportActionBar().setTitle("Prerequisite Course");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        inputLayout = findViewById(R.id.input_layout);
        resultLayout = findViewById(R.id.result_layout);
        btnSubmit = findViewById(R.id.btn_submit);
        reSubmit = findViewById(R.id.re_submit);

        btnSubmit.setOnClickListener(view -> {
            inputLayout.setVisibility(View.GONE);
            resultLayout.setVisibility(View.VISIBLE);
        });

        reSubmit.setOnClickListener(view -> {
            inputLayout.setVisibility(View.VISIBLE);
            resultLayout.setVisibility(View.GONE);
        });

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}