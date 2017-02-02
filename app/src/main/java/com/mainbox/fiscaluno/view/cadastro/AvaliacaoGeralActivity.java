package com.mainbox.fiscaluno.view.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mainbox.fiscaluno.R;

public class AvaliacaoGeralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao_geral);
    }

    public void onNextClick(View view) {
        startActivity(new Intent(AvaliacaoGeralActivity.this, CadastroPontosPositivosActivity.class));
    }
}
