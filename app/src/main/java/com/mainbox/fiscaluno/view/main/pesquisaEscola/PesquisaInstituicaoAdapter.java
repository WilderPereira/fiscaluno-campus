package com.mainbox.fiscaluno.view.main.pesquisaEscola;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.Instituicao;

import java.util.List;

/**
 * Created by Admin on 02/02/2017.
 */

public class PesquisaInstituicaoAdapter extends RecyclerView.Adapter<PesquisaInstituicaoHolder> {

    private Context context;
    private List<Instituicao> instituicaos;

    public PesquisaInstituicaoAdapter(Context context, List<Instituicao> instituicaos) {
        this.context = context;
        this.instituicaos = instituicaos;
    }

    @Override
    public PesquisaInstituicaoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_escola, parent, false);
        PesquisaInstituicaoHolder viewHolder = new PesquisaInstituicaoHolder(context, view, instituicaos);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PesquisaInstituicaoHolder holder, int position) {
        Instituicao instituicao = instituicaos.get(position);
        holder.setElements(instituicao);
    }

    @Override
    public int getItemCount() {
        return instituicaos.size();
    }
}
