package com.mainbox.fiscaluno.view.main.pesquisaEscola;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.Instituicao;
import com.mainbox.fiscaluno.model.PesquisaRecente;

/**
 * Created by Admin on 02/02/2017.
 */

public class PesquisaInstituicaoHolder extends RecyclerView.ViewHolder {

    private ImageView iv_logo_escola;
    private TextView tv_nome_escola;

    public PesquisaInstituicaoHolder(View itemView) {
        super(itemView);

        iv_logo_escola = (ImageView) itemView.findViewById(R.id.iv_logo_escola);
        tv_nome_escola = (TextView) itemView.findViewById(R.id.tv_nome_escola);
    }

    public void setElements(Instituicao instituicao) {
        //iv_logo_escola.setText(pesquisaRecente.getBusca());
        tv_nome_escola.setText(instituicao.getNome());
    }

}
