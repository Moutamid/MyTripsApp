package com.moutimid.sqlapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Beaches.ItinerariesActivity;
import com.moutimid.sqlapp.activities.Explore.ExploreActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void explore(View view) {
        startActivity(new Intent(DashboardActivity.this, ExploreActivity.class));
    }

    public void my_trips(View view) {
        startActivity(new Intent(DashboardActivity.this, MyTripsActivity.class));
    }

    public void iternties(View view) {
        startActivity(new Intent(DashboardActivity.this, ItinerariesActivity.class));

    }
}