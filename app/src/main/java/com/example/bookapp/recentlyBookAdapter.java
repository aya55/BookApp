package com.example.bookapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recentlyBookAdapter extends RecyclerView.Adapter<recentlyBookAdapter.RecentBookViewHolder> {
    ArrayList<recentlyBookItems> recentlybookitems;

    public recentlyBookAdapter(ArrayList<com.example.bookapp.recentlyBookItems> recentlyBookItems) {
        this.recentlybookitems = recentlyBookItems;
    }

    @NonNull
    @Override
    public RecentBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bookcardview2,parent,false);
        RecentBookViewHolder recentBookViewHolder=new RecentBookViewHolder(view);
        return recentBookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecentBookViewHolder holder, int position) {
     recentlyBookItems recentlyBookItems= recentlybookitems.get(position);
     holder.image.setImageResource(recentlyBookItems.getImage());
        holder.title.setText(recentlyBookItems.getMtitle());
        holder.desc.setText(recentlyBookItems.getMdesc());

    }

    @Override
    public int getItemCount() {
        return recentlybookitems.size();
    }

    public static class RecentBookViewHolder extends RecyclerView.ViewHolder{
ImageView image;
TextView  title,desc;

        public RecentBookViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.bookimage2);
            title=itemView.findViewById(R.id.bookname2);
            desc=itemView.findViewById(R.id.bookdesc2);


        }
    }
}
