package com.moutimid.sqlapp.adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.MainActivity;
import com.moutimid.sqlapp.fragments.Day3Fragments;
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
        switch (position) {
            case 0:
                Stash.put("iterneraries_type", "Day31");
                Day3Fragments homeFragment = new Day3Fragments(31);
                return homeFragment;
            case 1:
                Stash.put("iterneraries_type", "Day32");
                Day3Fragments homeFragment1 = new Day3Fragments(32);
                return homeFragment1;
            case 2:
                Stash.put("iterneraries_type", "Day33");
                Day3Fragments homeFragment2 = new Day3Fragments(33);
                return homeFragment2;
            default:
        }
        return null; }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}