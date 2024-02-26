package com.moutimid.sqlapp.adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moutimid.sqlapp.fragments.DayFragments;

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
        switch (position) {
            case 0:
                DayFragments homeFragment = new DayFragments(41);
                return homeFragment;
            case 1:
                DayFragments homeFragment1 = new DayFragments(42);
                return homeFragment1;
            case 2:
                DayFragments homeFragment2 = new DayFragments(43);
                return homeFragment2;
           case 3:
                DayFragments homeFragment3 = new DayFragments(44);
                return homeFragment3;
           case 4:
                DayFragments homeFragment4 = new DayFragments(45);
                return homeFragment4;
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