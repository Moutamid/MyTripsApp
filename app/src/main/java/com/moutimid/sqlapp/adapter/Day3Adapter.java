package com.moutimid.sqlapp.adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.fragments.Day2Fragments;
import com.moutimid.sqlapp.fragments.Day3Fragments;
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
                Stash.put("iterneraries_type", "Day21");
                Day3Fragments homeFragment = new Day3Fragments(21);
                return homeFragment;
            case 1:
                Stash.put("iterneraries_type", "Day22");
                Day3Fragments homeFragment1 = new Day3Fragments(22);
                return homeFragment1;
            case 2:
                Stash.put("iterneraries_type", "Day23");
                Day3Fragments homeFragment2 = new Day3Fragments(23);
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