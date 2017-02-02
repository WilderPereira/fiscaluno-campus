package com.mainbox.fiscaluno.view.instituicao;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mainbox.fiscaluno.R;
import com.mainbox.fiscaluno.model.AvaliacaoProContra;

import java.util.ArrayList;

/**
 * Created by Wilder on 02/02/17.
 */

public class AvaliacaoAdapter extends RecyclerView.Adapter<AvaliacaoAdapter.ViewHolder> {
    private ArrayList<AvaliacaoProContra> dataset;
    private AvaliacaoProContra avaliacao;
    private Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvTitulo, tvContra, tvPros, tvHoras;

        public ViewHolder(View v) {
            super(v);
            tvTitulo = (TextView) v.findViewById(R.id.avaliacao_titulo_tv);
            tvContra = (TextView) v.findViewById(R.id.contras_tv);
            tvPros = (TextView) v.findViewById(R.id.pros_tv);
            tvHoras = (TextView) v.findViewById(R.id.horas_tv);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    //todo: change to item array
    public AvaliacaoAdapter(ArrayList<AvaliacaoProContra> myDataset) {
        dataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AvaliacaoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        context = parent.getContext();
        // create a new view
        View v = LayoutInflater.from(context).inflate(R.layout.item_avaliacao, parent, false);

        ViewHolder vh = new ViewHolder(v);

        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        avaliacao = dataset.get(position);
        holder.tvTitulo.setText(avaliacao.getTitulo());
        holder.tvContra.setText(avaliacao.getContra());
        holder.tvPros.setText(avaliacao.getPros());
        holder.tvHoras.setText("Hoje");
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return dataset.size();
    }

}
