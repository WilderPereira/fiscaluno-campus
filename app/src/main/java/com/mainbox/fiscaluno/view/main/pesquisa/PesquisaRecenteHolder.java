package com.mainbox.fiscaluno.view.main.pesquisa;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.PesquisaRecente;

/**
 * Created by Admin on 02/02/2017.
 */

public class PesquisaRecenteHolder extends RecyclerView.ViewHolder {

    private TextView tv_card_nome;
    private TextView tv_card_local;

    public PesquisaRecenteHolder(View itemView) {
        super(itemView);

        tv_card_nome = (TextView) itemView.findViewById(R.id.tv_card_nome);
        tv_card_local = (TextView) itemView.findViewById(R.id.tv_card_local);
    }

    public void setElements(PesquisaRecente pesquisaRecente) {
        tv_card_nome.setText(pesquisaRecente.getBusca());
        tv_card_local.setText(pesquisaRecente.getLocal());
    }

}
