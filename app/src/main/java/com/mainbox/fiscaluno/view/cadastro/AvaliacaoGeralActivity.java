package com.mainbox.fiscaluno.view.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;

import me.zhanghai.android.materialratingbar.MaterialRatingBar;

public class AvaliacaoGeralActivity extends AppCompatActivity {

    private TextView tv_avaliacao_nome;
    private String nomeInstituicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao_geral);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nomeInstituicao = getIntent().getStringExtra("instituicao");
        tv_avaliacao_nome = (TextView) findViewById(R.id.tv_avaliacao_nome);
        tv_avaliacao_nome.setText(nomeInstituicao);
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(AvaliacaoGeralActivity.this, CadastroPontosPositivosActivity.class);
        intent.putExtra("instituicao", nomeInstituicao);
        startActivity(intent);
    }

    public void rate(View view) {
        MaterialRatingBar materialRatingBar = (MaterialRatingBar) findViewById(R.id.rated);
        MaterialRatingBar materialRatingBarNotRated = (MaterialRatingBar) findViewById(R.id.notrated);
        materialRatingBarNotRated.setVisibility(View.GONE);
        materialRatingBar.setVisibility(View.VISIBLE);
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
