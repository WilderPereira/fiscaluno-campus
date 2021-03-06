package com.mainbox.fiscaluno.view.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;

public class CadastroPontosNegativosActivity extends AppCompatActivity {

    private TextView tv_negativo_nome;
    private String nomeInstituicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pontos_negativos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nomeInstituicao = getIntent().getStringExtra("instituicao");
        tv_negativo_nome = (TextView) findViewById(R.id.tv_negativo_nome);
        tv_negativo_nome.setText(nomeInstituicao);
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(CadastroPontosNegativosActivity.this, AvaliacoesActivity.class);
        intent.putExtra("instituicao", nomeInstituicao);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                this.finish();
        }
        return (super.onOptionsItemSelected(menuItem));
    }
}
