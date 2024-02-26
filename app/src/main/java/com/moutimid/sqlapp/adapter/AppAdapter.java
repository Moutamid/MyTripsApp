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
        fragments = new Fragment[totalTabs];
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                fragments[position] = new DayFragments(1);
                return fragments[position];
            case 1:
                fragments[position] = new DayFragments(2);
                return fragments[position];
            case 2:
                fragments[position] = new DayFragments(3);
                return fragments[position];
            case 3:
                fragments[position] = new DayFragments(4);
                return fragments[position];
            case 4:
                fragments[position] = new DayFragments(5);
                return fragments[position];
            default:
                return null;
        }
    }

    // Method to get fragment instance
    public Fragment getFragment(int position) {
        return fragments[position];
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
