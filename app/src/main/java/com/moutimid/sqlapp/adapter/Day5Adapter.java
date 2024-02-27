package com.moutimid.sqlapp.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moutimid.sqlapp.fragments.Day5Fragments;

public class Day5Adapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public Day5Adapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        // Pass the position to the Day5Fragments using newInstance method
        return Day5Fragments.newInstance(position + 41);
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
