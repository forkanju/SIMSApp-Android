package com.forkan.simsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    private CardView homeCard;
    private CardView profileCard;
    private CardView accounts_card;
    private CardView courses_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().setTitle("Dashboard");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        homeCard = findViewById(R.id.homeCard);
        profileCard = findViewById(R.id.profile_card);
        accounts_card = findViewById(R.id.accounts_card);
        courses_card = findViewById(R.id.courses_card);

        homeCard.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        profileCard.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        accounts_card.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, AccountsActivity.class);
            startActivity(intent);
        });

        courses_card.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, CoursesActivity.class);
            startActivity(intent);
            startActivity(intent);
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}