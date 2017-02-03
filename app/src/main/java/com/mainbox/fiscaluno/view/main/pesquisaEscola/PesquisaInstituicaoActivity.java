package com.mainbox.fiscaluno.view.main.pesquisaEscola;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.mainbox.fiscaluno.model.Instituicao;
import com.mainbox.fiscaluno.model.PesquisaRecente;
import com.mainbox.fiscaluno.view.main.pesquisa.PesquisaRecenteAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 02/02/2017.
 */

public class PesquisaInstituicaoActivity extends AppCompatActivity {

    private List<Instituicao> instituicaos;
    private RecyclerView mRecycler;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.id.activity_lista_escola);

        Bundle bundle =  getIntent().getExtras();
        if(!bundle.isEmpty()) {
            getSupportActionBar().setTitle(bundle.getString("Pesquisa"));
        }

        mRecycler = (RecyclerView) findViewById(R.id.rv_lista_escola);
        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(mLayoutManager);

        gerarValor();

        PesquisaInstituicaoAdapter adapter = new PesquisaInstituicaoAdapter(PesquisaInstituicaoActivity.this, instituicaos);
        mRecycler.setAdapter(adapter);

    }

    private void gerarValor() {
        instituicaos = new ArrayList<>();

        for (int i = 1; i <= 11; i++) {
            Instituicao instituicao = new Instituicao();
            instituicao.setCodigo(i);
            instituicao.setNome("Escola " + i);

            instituicaos.add(instituicao);
        }
    }
}
