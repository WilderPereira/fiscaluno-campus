package com.mainbox.fiscaluno.view.main.pesquisa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.mainbox.fiscaluno.model.PesquisaRecente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 02/02/2017.
 */

public class PesquisaPrincipalActivity extends AppCompatActivity {

    private List<PesquisaRecente> pesquisaRecentes;
    private RecyclerView mRecycler;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        mLayoutManager = new LinearLayoutManager(this);

        mRecycler = (RecyclerView) findViewById(R.id.rv_aplicativo);
        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(mLayoutManager);

        gerarValor();

        PesquisaRecenteAdapter adapter = new PesquisaRecenteAdapter(PesquisaPrincipalActivity.this, pesquisaRecentes);
        mRecycler.setAdapter(adapter);
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
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
