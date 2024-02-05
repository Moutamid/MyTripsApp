package com.moutimid.sqlapp.activities.Beaches;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.moutimid.sqlapp.R;

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);
    }

    public void BackPress(View view) {
        onBackPressed();
    }

    public void beaches_in_east(View view) {
        startActivity(new Intent(BeachesActivity.this, BeachesinEastActivity.class));

    }

    public void beaches_in_west(View view) {
        startActivity(new Intent(BeachesActivity.this, BeachesinWestActivity.class));

    }

    public void beaches_in_south(View view) {
        startActivity(new Intent(BeachesActivity.this, BeachesinSouthActivity.class));

    }

    public void beaches_in_north(View view) {
        startActivity(new Intent(BeachesActivity.this, BeachesinNorthActivity.class));

    }
}