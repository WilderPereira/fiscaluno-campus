package com.mainbox.fiscaluno.view.main.pesquisaEscola;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.Instituicao;
import com.mainbox.fiscaluno.model.PesquisaRecente;
import com.mainbox.fiscaluno.view.instituicao.InstituicaoActivity;

import java.util.List;

/**
 * Created by Admin on 02/02/2017.
 */

public class PesquisaInstituicaoHolder extends RecyclerView.ViewHolder {

    private Context context;
    private List<Instituicao> instituicaos;
    private ImageView iv_logo_escola;
    private TextView tv_nome_escola;

    public PesquisaInstituicaoHolder(final Context context, final View itemView, final List<Instituicao> instituicaos) {
        super(itemView);
        this.context = context;
        this.instituicaos = instituicaos;

        iv_logo_escola = (ImageView) itemView.findViewById(R.id.iv_logo_escola);
        tv_nome_escola = (TextView) itemView.findViewById(R.id.tv_nome_escola);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, InstituicaoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("instituicao", instituicaos.get(getAdapterPosition()));
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    public void setElements(Instituicao instituicao) {
        //iv_logo_escola.setText(pesquisaRecente.getBusca());
        tv_nome_escola.setText(instituicao.getNome());
    }

}
