package com.samroid.mindrelextest;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Neotrixs on 22-Apr-17.
 */

public class SampleAdapter extends BaseAdapter {
    List<Pojo> arrayList;
    Context context;
    ImageView imageView;
    int res;
    Activity obj;
    SampleAdapter(Activity obj,int res,List<Pojo> arrayList)
    {
        this.arrayList=arrayList;
        this.res=res;
this.obj=obj;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return getItem(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Pojo p=new Pojo();


        View view1= LayoutInflater.from(context).inflate(R.layout.single_items_gridview,null);
        imageView= (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(p.getImage());
        return view1;
    }
}
