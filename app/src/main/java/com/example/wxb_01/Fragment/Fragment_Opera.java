package com.example.wxb_01.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wxb_01.R;
import com.example.wxb_01.adapter.adapter_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxb on 2016/6/17.
 */
public class Fragment_Opera extends Fragment {
    View view;
    RecyclerView recyclerView;
    adapter_3 adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.fragmentopera,container,false);
        init();
        return view;
    }
    private void init(){
      //  ListView listView = (ListView) view.findViewById(R.id.listv);
        List<String> list = new ArrayList<>();
        list.add("qwer");
        list.add("qweer"); list.add("qwe3r"); list.add("qw3er");
        list.add("qweer"); list.add("qwe3r"); list.add("qw3er");
        list.add("qweer"); list.add("qwe3r"); list.add("qw3er");
        list.add("qweer"); list.add("qwe3r"); list.add("qw3er");
        list.add("qweer"); list.add("qwe3r"); list.add("qw3er");
        list.add("qweer"); list.add("qwe3r"); list.add("qw3er");
        list.add("qweer"); list.add("qwe3r"); list.add("qw3er");
        final List<String> list2 = list;
      recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new adapter_3(getContext(),list2);
        recyclerView.setAdapter(adapter);
    }
}
