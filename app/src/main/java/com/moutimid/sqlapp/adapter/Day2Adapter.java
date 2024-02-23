package com.moutimid.sqlapp.adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moutimid.sqlapp.fragments.DayFragments;

public class Day2Adapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public Day2Adapter(Context context, FragmentManager fm, int totalTabs)
    {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                DayFragments homeFragment = new DayFragments(11);
                return homeFragment;
            case 1:
                DayFragments homeFragment1 = new DayFragments(12);
                return homeFragment1;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}  