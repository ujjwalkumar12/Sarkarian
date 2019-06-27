package com.example.sarkarian.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sarkarian.R;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private ArrayList<String> listItems;
    private Context context;

    public ListAdapter(Context context, ArrayList<String> listItems) {
        this.listItems =  listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list,parent,false);
            return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
            String itemName = listItems.get(position);
            holder.tv.setText(itemName);
    }

    @Override
    public int getItemCount() {
            return listItems.size();
            }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv;
        private LinearLayout linearLayout;

        private ViewHolder(@NonNull final View view) {
            super(view);
            tv = view.findViewById(R.id.text_list);
        }
    }
}

