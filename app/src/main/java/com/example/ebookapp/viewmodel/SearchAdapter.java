package com.example.ebookapp.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ebookapp.R;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder>{
    private Context mContext;
    private List<Book> bookList;

    public SearchAdapter(Context mContext, List<Book> bookList) {
        this.mContext = mContext;
        this.bookList = bookList;
    }

    public static final class SearchViewHolder extends RecyclerView.ViewHolder{
        public ImageView bookImage;
        public TextView bookName;
        public Button buttonLook;

        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            this.bookImage = itemView.findViewById(R.id.imageViewBookCardBookImage);
            this.bookName = itemView.findViewById(R.id.textViewBookCardBookName);
            this.buttonLook = itemView.findViewById(R.id.buttonBookCardLook);
        }
    }

    @NonNull
    @Override
    public SearchAdapter.SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SearchAdapter.SearchViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.search_result_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SearchAdapter.SearchViewHolder holder, int position) {
        holder.bookImage.setImageResource(bookList.get(position).getImageUrl());
        holder.bookName.setText(bookList.get(position).getBookName());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }


}
