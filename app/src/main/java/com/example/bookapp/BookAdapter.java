package com.example.bookapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

ArrayList<BookItems>bookitems;

    public BookAdapter(ArrayList<BookItems> bookitems) {
        this.bookitems = bookitems;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bookcardview1,parent,false);
        BookViewHolder bookViewHolder=new BookViewHolder(view);

        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
   BookItems bookItems=bookitems.get(position);
  holder.image.setImageResource(bookItems.getBookImage());
  holder.title.setText(bookItems.getBookTitle());
        holder.desc.setText(bookItems.getBookDescription());
    }

    @Override
    public int getItemCount() {
        return bookitems.size();
    }


    public static class BookViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView  title,desc;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.bookimage1);
            title=itemView.findViewById(R.id.bookname);
            desc=itemView.findViewById(R.id.bookdesc);
        }
    }

}
