package com.mainbox.fiscaluno.view.main.ranking;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mainbox.fiscaluno.R;

import java.util.ArrayList;
import java.util.Arrays;

import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;

public class RankingFragment extends Fragment {

    private SectionedRecyclerViewAdapter adapter;
    private RecyclerView recyclerView;

    public RankingFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ranking, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        adapter = new SectionedRecyclerViewAdapter();

        adapter.addSection(new RankingSection("Melhores Faculdades avaliadas", new ArrayList<>(Arrays.asList("Faculdade a", "Faculdade b", "Faculdade c"))));
        adapter.addSection(new RankingSection("Piores Faculdades avaliadas", new ArrayList<>(Arrays.asList("Faculdade x", "Faculdade y", "Faculdade z"))));
        adapter.addSection(new RankingSection("Melhores Escolas avaliadas", new ArrayList<>(Arrays.asList("Escola x", "Escola y", "Escola z"))));
        adapter.addSection(new RankingSection("Piores Escolas avaliadas", new ArrayList<>(Arrays.asList("Escola a", "Escola b", "Escola c"))));
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
