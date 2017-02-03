package com.mainbox.fiscaluno.view.main.pesquisa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.Instituicao;
import com.mainbox.fiscaluno.model.PesquisaRecente;
import com.mainbox.fiscaluno.view.main.pesquisaEscola.PesquisaInstituicaoActivity;

/**
 * Created by Admin on 02/02/2017.
 */

public class PesquisaRecenteHolder extends RecyclerView.ViewHolder {

    private TextView tv_card_nome;
    private TextView tv_card_local;

    public PesquisaRecenteHolder(final Context context, final View itemView) {
        super(itemView);

        tv_card_nome = (TextView) itemView.findViewById(R.id.tv_card_nome);
        tv_card_local = (TextView) itemView.findViewById(R.id.tv_card_local);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PesquisaInstituicaoActivity.class);
                intent.putExtra("Pesquisa", tv_card_nome.getText().toString());

                context.startActivity(intent);
            }
        });
    }

    public void setElements(PesquisaRecente pesquisaRecente) {
        tv_card_nome.setText(pesquisaRecente.getBusca());
        tv_card_local.setText(pesquisaRecente.getLocal());
    }

}
