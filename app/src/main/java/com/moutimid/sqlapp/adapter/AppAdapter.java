package com.moutimid.sqlapp.adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moutimid.sqlapp.fragments.DayFragments;

public class AppAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public AppAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs  
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                DayFragments homeFragment = new DayFragments(1);
                return homeFragment;
            case 1:
                DayFragments homeFragment1 = new DayFragments(2);
                return homeFragment1;
            case 2:
                DayFragments homeFragment2 = new DayFragments(3);
                return homeFragment2;
            case 3:
                DayFragments homeFragment3 = new DayFragments(4);
                return homeFragment3;
            case 4:
                DayFragments homeFragment4 = new DayFragments(5);
                return homeFragment4;
//            case 1:
//                DayFragment sportFragment = new DayFragment();
//                return sportFragment;
//            case 2:
//                DayFragment movieFragment = new DayFragment();
//                return movieFragment;
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