package com.example.tablayouttest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablayouttest.databinding.ItemBinding;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VH> {

    ArrayList<Item> items;
    Context context;


    public MyAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new VH(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

        holder.binding.tv.setText(items.get(position).s);
        holder.binding.tv2.setText(items.get(position).s1);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class VH extends RecyclerView.ViewHolder{

        ItemBinding binding;

        public VH(@NonNull View itemView) {
            super(itemView);
            binding = ItemBinding.bind(itemView);
        }
    }

}
