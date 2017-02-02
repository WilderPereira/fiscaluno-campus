package com.mainbox.fiscaluno.model;

/**
 * Created by Wilder on 02/02/17.
 */

public class PesquisaRecente {

    private Integer codigo;
    private String busca;
    private String local;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}