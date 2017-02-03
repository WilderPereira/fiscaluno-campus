package com.mainbox.fiscaluno.view.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mainbox.fiscaluno.R;

import me.zhanghai.android.materialratingbar.MaterialRatingBar;

public class AvaliacaoGeralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao_geral);
    }

    public void onNextClick(View view) {
        startActivity(new Intent(AvaliacaoGeralActivity.this, CadastroPontosPositivosActivity.class));
    }

    public void rate(View view) {
        MaterialRatingBar materialRatingBar = (MaterialRatingBar) findViewById(R.id.rated);
        MaterialRatingBar materialRatingBarNotRated = (MaterialRatingBar) findViewById(R.id.notrated);
        materialRatingBarNotRated.setVisibility(View.GONE);
        materialRatingBar.setVisibility(View.VISIBLE);
    }
}
