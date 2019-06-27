package com.example.sarkarian.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sarkarian.Adapter.ListAdapter;
import com.example.sarkarian.R;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<String> listItems = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard,container,false);
        recyclerView = view.findViewById(R.id.recycler);

        ListAdapter adapter = new ListAdapter(getContext(),listItems);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        return view;
    }
}
