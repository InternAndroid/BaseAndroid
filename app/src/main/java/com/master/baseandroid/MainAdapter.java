package com.master.baseandroid;

import android.content.Context;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.master.baseandroid.base.BaseAdapter;

import java.util.List;

public class MainAdapter extends BaseAdapter<CustomModel> {

    public MainAdapter(List<CustomModel> mList, Context context) {
        super(mList, context);
    }

    @Override
    protected RecyclerView.ViewHolder viewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    protected void onBindView(RecyclerView.ViewHolder viewHolder, int position) {

    }
}
