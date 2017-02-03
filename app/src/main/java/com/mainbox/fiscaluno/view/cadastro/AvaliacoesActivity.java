package com.mainbox.fiscaluno.view.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;

import me.zhanghai.android.materialratingbar.MaterialRatingBar;

public class AvaliacoesActivity extends AppCompatActivity {

    private TextView tv_recomendacao_nome;
    private String nomeInstituicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendacao);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nomeInstituicao = getIntent().getStringExtra("instituicao");
        tv_recomendacao_nome = (TextView) findViewById(R.id.tv_recomendacao_nome);
        tv_recomendacao_nome.setText(nomeInstituicao);
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(AvaliacoesActivity.this, ConselhosActivity.class);
        intent.putExtra("instituicao", nomeInstituicao);
        startActivity(intent);
    }

    public void rate(View view) {
        MaterialRatingBar materialRatingBar = (MaterialRatingBar) findViewById(R.id.rated1);
        MaterialRatingBar materialRatingBarNotRated = (MaterialRatingBar) findViewById(R.id.notrated1);
        materialRatingBarNotRated.setVisibility(View.GONE);
        materialRatingBar.setVisibility(View.VISIBLE);
    }

    public void rate2(View view) {
        MaterialRatingBar materialRatingBar2 = (MaterialRatingBar) findViewById(R.id.rated2);
        MaterialRatingBar materialRatingBarNotRated2 = (MaterialRatingBar) findViewById(R.id.notrated2);
        materialRatingBarNotRated2.setVisibility(View.GONE);
        materialRatingBar2.setVisibility(View.VISIBLE);
    }

    public void rate3(View view) {
        MaterialRatingBar materialRatingBar3 = (MaterialRatingBar) findViewById(R.id.rated3);
        MaterialRatingBar materialRatingBarNotRated3 = (MaterialRatingBar) findViewById(R.id.notrated3);
        materialRatingBarNotRated3.setVisibility(View.GONE);
        materialRatingBar3.setVisibility(View.VISIBLE);
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
