package com.mainbox.fiscaluno.view.instituicao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.AvaliacaoProContra;

import java.util.ArrayList;
import java.util.List;

public class InstituicaoActivity extends AppCompatActivity {

    AvaliacaoAdapter avaliacaoAdapter;
    TextView nomeInstituicaoTv, mediaTv;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instituicao);

        nomeInstituicaoTv = (TextView) findViewById(R.id.nomeInstituicao);
        mediaTv = (TextView) findViewById(R.id.media_tv);
        recyclerView = (RecyclerView) findViewById(R.id.avaliacoesRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        AvaliacaoAdapter adapter = new AvaliacaoAdapter(gerarAvaliacaoProContra());
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<AvaliacaoProContra> gerarAvaliacaoProContra(){
        ArrayList<AvaliacaoProContra> avaliacaoProContras = new ArrayList<>();
        AvaliacaoProContra avaliacaoProContra = new AvaliacaoProContra();
        avaliacaoProContra.setContra("A infraestrutura não está muito boa e faltam professores.");
        avaliacaoProContra.setPros("Ótima Segurança no local.");
        avaliacaoProContras.add(avaliacaoProContra);

        avaliacaoProContra = new AvaliacaoProContra();
        avaliacaoProContra.setContra("A infraestrutura não está muito boa e faltam professores.");
        avaliacaoProContra.setPros("Ótima Segurança no local.");

        avaliacaoProContra = new AvaliacaoProContra();
        avaliacaoProContra.setContra("Infraestrutura ruim e falta de aulas.");
        avaliacaoProContra.setPros("A região é segura e de fácil acesso.");
        avaliacaoProContras.add(avaliacaoProContra);

        return avaliacaoProContras;
    }
}
