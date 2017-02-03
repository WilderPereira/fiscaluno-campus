package com.mainbox.fiscaluno.view.main.pesquisa;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.PesquisaRecente;

import java.util.List;

/**
 * Created by Admin on 02/02/2017.
 */
public class PesquisaRecenteAdapter extends RecyclerView.Adapter<PesquisaRecenteHolder> {

    private Context context;
    private List<PesquisaRecente> pesquisaRecentes;

    public PesquisaRecenteAdapter(Context context, List<PesquisaRecente> pesquisaRecentes) {
        this.context = context;
        this.pesquisaRecentes = pesquisaRecentes;
    }

    @Override
    public PesquisaRecenteHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_pesquisa_recente, parent, false);

        PesquisaRecenteHolder viewHolder = new PesquisaRecenteHolder(context, view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PesquisaRecenteHolder holder, int position) {
        PesquisaRecente pesquisaRecente = pesquisaRecentes.get(position);
        holder.setElements(pesquisaRecente);
    }

    @Override
    public int getItemCount() {
        return pesquisaRecentes.size();
    }
}
