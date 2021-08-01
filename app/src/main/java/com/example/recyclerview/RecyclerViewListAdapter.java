package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecyclerViewListAdapter extends ListAdapter<String, RecyclerViewListAdapter.ViewHolder> {
    List<String> list;

    public RecyclerViewListAdapter(@NonNull DiffUtil.ItemCallback<String> diffCallback){
        super(diffCallback);
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.row_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerViewListAdapter.ViewHolder holder, int position) {
        holder.itemText.setText(getItem(position));
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView itemText;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            itemText = itemView.findViewById(R.id.itemTv);
        }
    }
}
