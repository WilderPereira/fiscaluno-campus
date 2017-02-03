package com.mainbox.fiscaluno.view.main.pesquisaEscola;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mainbox.fiscaluno.R;
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
    private String bundle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_escolas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        bundle =  getIntent().getExtras().getString("Pesquisa");
        if(!bundle.isEmpty()) {
            getSupportActionBar().setTitle(bundle);
        }

        mRecycler = (RecyclerView) findViewById(R.id.rv_lista_escola);
        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        gerarValor();

        PesquisaInstituicaoAdapter adapter = new PesquisaInstituicaoAdapter(PesquisaInstituicaoActivity.this, instituicaos);
        mRecycler.setAdapter(adapter);

    }

    private void gerarValor() {
        instituicaos = new ArrayList<>();
        String[] arr = {"Escola", "Faculdade"};
        for (int i = 0; i <= 1; i++) {
            Instituicao instituicao = new Instituicao();
            instituicao.setCodigo(i);
            instituicao.setNome(arr[i]+" "+bundle);

            instituicaos.add(instituicao);
        }
    }
}
