package com.moutimid.sqlapp.adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moutimid.sqlapp.MainActivity;
import com.moutimid.sqlapp.fragments.Day4Fragments;
import com.moutimid.sqlapp.fragments.Day5Fragments;

public class Day4Adapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public Day4Adapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        // Pass the position to the Day5Fragments using newInstance method
        return Day4Fragments.newInstance(position + 31);
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}