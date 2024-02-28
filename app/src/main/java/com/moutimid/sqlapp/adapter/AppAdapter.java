package com.moutimid.sqlapp.adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moutimid.sqlapp.fragments.DayFragments;

public class AppAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;
    private Fragment[] fragments;

    public AppAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        // Adjust position handling to start from 0
        position++; // Increment position to start from 1 for DayFragments constructor
        return new DayFragments(position);
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
