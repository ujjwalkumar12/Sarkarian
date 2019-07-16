package com.example.sarkarian.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sarkarian.R;

import java.util.ArrayList;
import java.util.Random;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private ArrayList<String> listItems;
    private Context context;
    int orange = Color.parseColor("#FF9800");
    int green = Color.parseColor("#4CAF50");
    int blue = Color.parseColor("#2196F3");
    int red = Color.parseColor("#B71C1C");

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
        System.out.println(position);
        if (position%4==0){
            holder.cardView.setCardBackgroundColor(orange);
        }else if(position %4 ==1){
            holder.cardView.setCardBackgroundColor(green);
        }else if(position%4==2){
            holder.cardView.setCardBackgroundColor(blue);
        }else if(position%4==3){
            holder.cardView.setCardBackgroundColor(red);
        }
        holder.tv.setText(itemName);
    }

    @Override
    public int getItemCount() {
            return listItems.size();
            }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv;
        private CardView cardView;

        private ViewHolder(@NonNull final View view) {
            super(view);
            tv = view.findViewById(R.id.text_list);
            cardView = view.findViewById(R.id.itemCard);
        }
    }
}

