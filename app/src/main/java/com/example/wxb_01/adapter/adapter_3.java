package com.example.wxb_01.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wxb_01.Fragment.Fragment_Home;
import com.example.wxb_01.R;

import java.util.List;

/**
 * Created by wxb on 2016/6/17.
 */
public class adapter_3 extends RecyclerView.Adapter<adapter_3.Myviewholder>{

    Context context;
    List<String> list;
    Myviewholder myviewholder;
    public adapter_3(Context context, List<String> list){
        this.context = context;
        this.list = list;
    }
    @Override
    public Myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        myviewholder = new Myviewholder(LayoutInflater.from(context).inflate(R.layout.listviewitem,parent,false));
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(Myviewholder holder, int position) {
        myviewholder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Myviewholder extends RecyclerView.ViewHolder{

        TextView textView;
        public Myviewholder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textview1);
        }
    }
}
