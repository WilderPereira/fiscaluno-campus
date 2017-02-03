package com.mainbox.fiscaluno.view.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.view.custom.EditTextBox;
import com.mainbox.fiscaluno.view.main.MainActivity;

public class CadastroInstituicaoActivity extends AppCompatActivity {

    private EditTextBox nomeInstituicao_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_instituicao);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nomeInstituicao_tv = (EditTextBox) findViewById(R.id.nomeInstituicao_tv);
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(CadastroInstituicaoActivity.this, AvaliacaoGeralActivity.class);
        intent.putExtra("instituicao", nomeInstituicao_tv.getText().toString());
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
