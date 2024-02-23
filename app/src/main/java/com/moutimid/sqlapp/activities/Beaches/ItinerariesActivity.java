package com.moutimid.sqlapp.activities.Beaches;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.adapter.AppAdapter;
import com.moutimid.sqlapp.adapter.Day2Adapter;
import com.moutimid.sqlapp.adapter.Day3Adapter;

public class ItinerariesActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabLayout tabLayout1;
    ViewPager viewPager;
    ViewPager viewPager1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineraries);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout1 = (TabLayout) findViewById(R.id.tabLayout1);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager1 = (ViewPager) findViewById(R.id.viewPager1);
        tabLayout.addTab(tabLayout.newTab().setText("IN 1 DAY"));
        tabLayout.addTab(tabLayout.newTab().setText("IN 2 DAY"));
        tabLayout.addTab(tabLayout.newTab().setText("IN 3 DAY"));
        tabLayout.addTab(tabLayout.newTab().setText("IN 4 DAY"));
        tabLayout.addTab(tabLayout.newTab().setText("IN 5 DAY"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final AppAdapter adapter = new AppAdapter(this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    tabLayout.setVisibility(View.VISIBLE);
                    tabLayout1.setVisibility(View.GONE);
                    viewPager.setVisibility(View.VISIBLE);
                    viewPager1.setVisibility(View.GONE);
                }
                if (tab.getPosition() == 1) {
                    tabLayout.setVisibility(View.VISIBLE);
                    tabLayout1.setVisibility(View.VISIBLE);
                    viewPager.setVisibility(View.GONE);
                    viewPager1.setVisibility(View.VISIBLE);
                    tabLayout1.removeAllTabs();

                    tabLayout1.addTab(tabLayout1.newTab().setText("DAY1"));
                    tabLayout1.addTab(tabLayout1.newTab().setText("DAY2"));
                    tabLayout1.setTabGravity(TabLayout.GRAVITY_FILL);
                    Day2Adapter day2Adapter = new Day2Adapter(ItinerariesActivity.this, getSupportFragmentManager(), tabLayout1.getTabCount());
                    viewPager1.setAdapter(day2Adapter);
                }
                if (tab.getPosition() == 2) {
                    tabLayout.setVisibility(View.VISIBLE);
                    tabLayout1.setVisibility(View.VISIBLE);
                    viewPager.setVisibility(View.GONE);
                    viewPager1.setVisibility(View.VISIBLE);
                    tabLayout1.removeAllTabs();
                    tabLayout1.addTab(tabLayout1.newTab().setText("DAY1"));
                    tabLayout1.addTab(tabLayout1.newTab().setText("DAY2"));
                    tabLayout1.addTab(tabLayout1.newTab().setText("DAY3"));
                    tabLayout1.setTabGravity(TabLayout.GRAVITY_FILL);
                    Day3Adapter day2Adapter = new Day3Adapter(ItinerariesActivity.this, getSupportFragmentManager(), tabLayout1.getTabCount());
                    viewPager1.setAdapter(day2Adapter);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void BackPress(View view) {
        onBackPressed();
    }
}