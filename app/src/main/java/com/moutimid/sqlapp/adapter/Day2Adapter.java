package com.moutimid.sqlapp.adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.fragments.Day2Fragments;

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
                Stash.put("iterneraries_type", "Day11");
                Day2Fragments homeFragment = new Day2Fragments(11);
                return homeFragment;
            case 1:
                Stash.put("iterneraries_type", "Day12");
                Day2Fragments homeFragment1 = new Day2Fragments(12);
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