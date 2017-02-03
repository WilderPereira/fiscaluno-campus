package com.mainbox.fiscaluno.view.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.view.main.MainActivity;

public class ConselhosActivity extends AppCompatActivity {

    private TextView tv_conselho_nome;
    private String nomeInstituicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conselhos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nomeInstituicao = getIntent().getStringExtra("instituicao");
        tv_conselho_nome = (TextView) findViewById(R.id.tv_conselho_nome);
        tv_conselho_nome.setText(nomeInstituicao);
    }

    public void onNextClick(View view) {
        startActivity(new Intent(ConselhosActivity.this, MainActivity.class));
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
