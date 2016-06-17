package com.example.wxb_01;

import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

import com.example.wxb_01.Fragment.Fragment_Community;
import com.example.wxb_01.Fragment.Fragment_Home;
import com.example.wxb_01.Fragment.Fragment_Opera;
import com.example.wxb_01.Fragment.Fragment_Recommend;
import com.example.wxb_01.adapter.ViewpagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SwipeRefreshLayout sp;
    List<Fragment> list;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);
        initData();
     /*   AppBarLayout ab = (AppBarLayout) findViewById(R.id.appbarlayout);
        int y = ab.getHeight();*/



    }

    /**
     * 初始化数据
     */
    private void initData(){
        list = new ArrayList<>();

        Fragment_Home fragment_home = new Fragment_Home();
        list.add(fragment_home);

        Fragment_Community fragment_conmmunity = new Fragment_Community();
        list.add(fragment_conmmunity);

        Fragment_Recommend fragment_recommend = new Fragment_Recommend();
        list.add(fragment_recommend);

        Fragment_Opera fragment_opera = new Fragment_Opera();
        list.add(fragment_opera);
    }

    /**
     * 初始化Viewpager，sp
     */
    private void initUI(){

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        ViewpagerAdapter vp = new ViewpagerAdapter(getSupportFragmentManager());
        vp.setlist(list);
        viewPager.setAdapter(vp);



    }


}
