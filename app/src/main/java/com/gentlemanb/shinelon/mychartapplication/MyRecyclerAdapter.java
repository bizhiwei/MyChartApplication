package com.gentlemanb.shinelon.mychartapplication;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Shinelon on 2016/5/20.
 */
public class MyRecyclerAdapter extends
        RecyclerView.Adapter<MyRecyclerAdapter.MyHolder> {
    private List<Integer> list;

    public MyRecyclerAdapter(List<Integer> list) {
        this.list = list;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        return new MyHolder(inflate);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) holder.tv.getLayoutParams();
        params.height = list.get(position);
        holder.tv.setLayoutParams(params);
    }

    static class MyHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.item_tv);
        }
    }
}
