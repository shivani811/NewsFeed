package com.example.newsfeed.modules;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;


public class Adapter extends RecyclerView.Adapter {

    private List<Article> articles;
    private Context context;
    private AdapterView.OnItemClickListener OnItemClickListener;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void OnItemClickListener(AdapterView.OnItemClickListener onItemClickListener){
        this.OnItemClickListener=onItemClickListener;
    }
    public interface OnItemclickListener{
        void OnIteClick(View view,int position);
    }


}
