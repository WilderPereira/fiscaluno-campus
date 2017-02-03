package com.mainbox.fiscaluno.model;

/**
 * Created by Wilder on 02/02/17.
 */

public class AvaliacaoGeral {

    private Integer codigo;
    private String categoria;
    private Float media;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Float getMedia() {
        return media;
    }

    public void setMedia(Float media) {
        this.media = media;
    }
}
