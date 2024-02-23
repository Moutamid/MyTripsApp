package com.moutimid.sqlapp.adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moutimid.sqlapp.fragments.DayFragments;

public class Day3Adapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public Day3Adapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                DayFragments homeFragment = new DayFragments(21);
                return homeFragment;
            case 1:
                DayFragments homeFragment1 = new DayFragments(22);
                return homeFragment1;
            case 2:
                DayFragments homeFragment2 = new DayFragments(23);
                return homeFragment2;
            default:
                return null;
        }
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}  