package com.mainbox.fiscaluno.view.instituicao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;

public class InstituicaoActivity extends AppCompatActivity {

    TextView nomeInstituicaoTv, mediaTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instituicao);

        nomeInstituicaoTv = (TextView) findViewById(R.id.nomeInstituicao);
        mediaTv = (TextView) findViewById(R.id.media_tv);


    }
}
