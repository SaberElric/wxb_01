package com.example.wxb_01.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * Created by wxb on 2016/6/17.
 */

public class ViewpagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    public ViewpagerAdapter(FragmentManager fm){
        super(fm);
    }
    public void  setlist(List<Fragment> list){
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }


}
