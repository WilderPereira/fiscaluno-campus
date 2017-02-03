package com.mainbox.fiscaluno.view.main.pesquisa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.Instituicao;
import com.mainbox.fiscaluno.model.PesquisaRecente;
import com.mainbox.fiscaluno.view.custom.ButtonRadius;
import com.mainbox.fiscaluno.view.main.pesquisaEscola.PesquisaInstituicaoActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 02/02/2017.
 */

public class PesquisaPrincipalFragment extends Fragment {

    private List<PesquisaRecente> pesquisaRecentes;
    private RecyclerView mRecycler;
    private RecyclerView.LayoutManager mLayoutManager;

    private EditText frm_busca;
    private EditText frm_localizacao;
    private Button frm_pesquisar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.activity_pesquisa, container, false);

        mLayoutManager = new LinearLayoutManager(getContext());

        frm_busca = (EditText) view.findViewById(R.id.frm_busca);
        frm_localizacao = (EditText) view.findViewById(R.id.frm_localizacao);
        frm_pesquisar = (Button) view.findViewById(R.id.frm_pesquisar);

        mRecycler = (RecyclerView) view.findViewById(R.id.frm_pesquisa_recente);
        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(mLayoutManager);

        gerarValor();

        PesquisaRecenteAdapter adapter = new PesquisaRecenteAdapter(getContext(), pesquisaRecentes);
        mRecycler.setAdapter(adapter);

        frm_pesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(validacao()) {
                    frm_busca.setText("");
                    frm_localizacao.setText("");

                    Intent intent = new Intent(getContext(), PesquisaInstituicaoActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("Pesquisa", frm_busca.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

            }
        });

        return view;
    }

    private Boolean validacao() {
        Boolean retorno = true;

        if(frm_busca.getText().toString().isEmpty()) {
            frm_busca.setError("Invalido");
            retorno = false;
        }

        if(frm_localizacao.getText().toString().isEmpty()) {
            frm_localizacao.setError("Invalido");
            retorno = false;
        }

        return retorno;
    }

    private void gerarValor() {
        pesquisaRecentes = new ArrayList<>();
        String[] arr = {"Escola", "Faculdade"};

        for (int i = 0; i <= 1; i++) {
            PesquisaRecente pesquisaRecente = new PesquisaRecente();
            pesquisaRecente.setCodigo(i);
            pesquisaRecente.setBusca(arr[i]+" ABC");
            pesquisaRecente.setLocal("SP");

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
