package com.mainbox.fiscaluno.view.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mainbox.fiscaluno.R;

public class CadastroPontosNegativosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pontos_negativos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void onNextClick(View view) {
        startActivity(new Intent(CadastroPontosNegativosActivity.this, AvaliacoesActivity.class));
    }
}
