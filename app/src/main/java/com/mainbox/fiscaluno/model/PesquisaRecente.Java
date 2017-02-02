package com.mainbox.fiscaluno.model;

import java.io.Serializable;

public class PesquisaRecente implements Serializable {

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