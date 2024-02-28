package com.moutimid.sqlapp.activities.Iteneraries;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.fxn.stash.Stash;
import com.google.android.material.tabs.TabLayout;
import com.moutimid.sqlapp.MainActivity;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.adapter.AppAdapter;
import com.moutimid.sqlapp.adapter.Day2Adapter;
import com.moutimid.sqlapp.adapter.Day3Adapter;
import com.moutimid.sqlapp.adapter.Day4Adapter;
import com.moutimid.sqlapp.adapter.Day5Adapter;

public class ItinerariesActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabLayout subtablayout;
    ViewPager viewPager;
    ViewPager subviewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineraries);

        // Initialize views
        tabLayout = findViewById(R.id.tabLayout);
        subtablayout = findViewById(R.id.tabLayout1);
        viewPager = findViewById(R.id.viewPager);
        subviewPager = findViewById(R.id.viewPager1);

        // Add tabs to the first TabLayout
        tabLayout.addTab(tabLayout.newTab().setText("IN 1 DAY"));
        tabLayout.addTab(tabLayout.newTab().setText("IN 2 DAY"));
        tabLayout.addTab(tabLayout.newTab().setText("IN 3 DAY"));
        tabLayout.addTab(tabLayout.newTab().setText("IN 4 DAY"));
        tabLayout.addTab(tabLayout.newTab().setText("IN 5 DAY"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final AppAdapter adapter = new AppAdapter(this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        // Set listener to handle tab selection and viewpager synchronization
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                handleSecondTabLayout(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        subviewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(subtablayout));
    }

    private void handleSecondTabLayout(int position) {
        switch (position) {
            case 0:

                Stash.put("iterneraries_type", "Day1");
                tabLayout.setVisibility(View.VISIBLE);
                subtablayout.setVisibility(View.GONE);
                viewPager.setVisibility(View.VISIBLE);
                subviewPager.setVisibility(View.GONE);
                break;
            case 1:
                Stash.put("iterneraries_type", "Day21");
                tabLayout.setVisibility(View.VISIBLE);
                subtablayout.setVisibility(View.VISIBLE);
                viewPager.setVisibility(View.GONE);
                subviewPager.setVisibility(View.VISIBLE);
                setupSecondTabLayout(2);
                break;
            case 2:
                tabLayout.setVisibility(View.VISIBLE);
                subtablayout.setVisibility(View.VISIBLE);
                viewPager.setVisibility(View.GONE);
                subviewPager.setVisibility(View.VISIBLE);
                setupSecondTabLayout(3);
                break;
            case 3:
                tabLayout.setVisibility(View.VISIBLE);
                subtablayout.setVisibility(View.VISIBLE);
                viewPager.setVisibility(View.GONE);
                subviewPager.setVisibility(View.VISIBLE);
                setupSecondTabLayout(4);
                break;
            case 4:
                tabLayout.setVisibility(View.VISIBLE);
                subtablayout.setVisibility(View.VISIBLE);
                viewPager.setVisibility(View.GONE);
                subviewPager.setVisibility(View.VISIBLE);
                setupSecondTabLayout(5); // Setup second TabLayout with 5 tabs
                break;
        }
    }

    // Method to setup the second TabLayout based on the number of tabs required
    private void setupSecondTabLayout(int numberOfTabs) {
        subtablayout.removeAllTabs(); // Clear existing tabs
        for (int i = 0; i < numberOfTabs; i++) {
            subtablayout.addTab(subtablayout.newTab().setText("DAY " + (i + 1))); // Add new tabs
        }
        subtablayout.setTabGravity(TabLayout.GRAVITY_FILL);
        switch (numberOfTabs) {
            case 2:
                subviewPager.removeAllViews();
                Day2Adapter day2Adapter = new Day2Adapter(ItinerariesActivity.this, getSupportFragmentManager(), numberOfTabs);
                subviewPager.setAdapter(day2Adapter);
                break;
            case 3:
                subviewPager.removeAllViews();
                Day3Adapter day3Adapter = new Day3Adapter(ItinerariesActivity.this, getSupportFragmentManager(), numberOfTabs);
                subviewPager.setAdapter(day3Adapter);
                break;
            case 4:
                Day4Adapter day4Adapter = new Day4Adapter(ItinerariesActivity.this, getSupportFragmentManager(), numberOfTabs);
                subviewPager.setAdapter(day4Adapter);
                break;
            case 5:
                subviewPager.removeAllViews();
                Day5Adapter day5Adapter = new Day5Adapter(ItinerariesActivity.this, getSupportFragmentManager(), numberOfTabs);
                subviewPager.setAdapter(day5Adapter);
                break;
        }
    }

    public void BackPress(View view) {
        onBackPressed();
    }
}
