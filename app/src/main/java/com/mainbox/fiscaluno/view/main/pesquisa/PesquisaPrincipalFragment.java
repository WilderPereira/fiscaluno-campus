package com.mainbox.fiscaluno.view.main.pesquisa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.PesquisaRecente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 02/02/2017.
 */

public class PesquisaPrincipalFragment extends Fragment {

    private List<PesquisaRecente> pesquisaRecentes;
    private RecyclerView mRecycler;
    private RecyclerView.LayoutManager mLayoutManager;

    public PesquisaPrincipalFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.activity_pesquisa, container, false);

        mLayoutManager = new LinearLayoutManager(getContext());

        mRecycler = (RecyclerView) view.findViewById(R.id.frm_pesquisa_recente);
        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(mLayoutManager);

        gerarValor();

        PesquisaRecenteAdapter adapter = new PesquisaRecenteAdapter(getContext(), pesquisaRecentes);
        mRecycler.setAdapter(adapter);

        return view;
    }

    private void gerarValor() {
        pesquisaRecentes = new ArrayList<>();

        for (int i = 1; i <= 11; i++) {
            PesquisaRecente pesquisaRecente = new PesquisaRecente();
            pesquisaRecente.setCodigo(i);
            pesquisaRecente.setBusca("Nome " + i);
            pesquisaRecente.setLocal("Endereço " + i);

            pesquisaRecentes.add(pesquisaRecente);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
