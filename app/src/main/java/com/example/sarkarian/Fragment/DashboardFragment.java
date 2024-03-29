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
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sarkarian.Adapter.ListAdapter;
import com.example.sarkarian.R;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private RecyclerView recyclerView;
    private ListView noticeListView,jobsListView,resultsListView,admitCardListView;
    private ArrayList<String> listItems = new ArrayList<>();
    private ArrayList<String> noticesList = new ArrayList<>();
    private ArrayList<String> jobsList = new ArrayList<>();
    private ArrayList<String> resultsList = new ArrayList<>();
    private ArrayList<String> admitCardsList = new ArrayList<>();

    private ArrayAdapter<String> noticeAdapter,jobsAdapter,resultsAdapter,admitCardsAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addItems();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard,container,false);

        recyclerView = view.findViewById(R.id.recycler);
        noticeListView = view.findViewById(R.id.noticeList);
        jobsListView = view.findViewById(R.id.jobsList);
        resultsListView = view.findViewById(R.id.resultsList);
        admitCardListView = view.findViewById(R.id.admitCardList);

        ListAdapter adapter = new ListAdapter(getContext(),listItems);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        noticeAdapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,noticesList);
        jobsAdapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,jobsList);
        resultsAdapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,resultsList);
        admitCardsAdapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,admitCardsList);

        noticeListView.setAdapter(noticeAdapter);
        jobsListView.setAdapter(jobsAdapter);
        resultsListView.setAdapter(resultsAdapter);
        admitCardListView.setAdapter(admitCardsAdapter);

        return view;
    }

    public void addItems(){

        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");
        listItems.add("Specialist Cadre Officer");

        noticesList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        noticesList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        noticesList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        noticesList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        noticesList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        noticesList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");

        jobsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        jobsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        jobsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        jobsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        jobsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        jobsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");

        resultsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        resultsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        resultsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        resultsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        resultsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        resultsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");

        admitCardsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        admitCardsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        admitCardsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        admitCardsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        admitCardsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");
        admitCardsList.add("CSIR UGC NET, JRF Online Form 2019 Last Date : 18/03/2019");

    }

}
