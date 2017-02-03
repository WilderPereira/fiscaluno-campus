package com.mainbox.fiscaluno.model;

/**
 * Created by Wilder on 02/02/17.
 */

public class AvaliacaoProContra {

    private Integer codigo;
    private String titulo;
    private String pros;
    private String contra;
    private String dias;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPros() {
        return pros;
    }

    public void setPros(String pros) {
        this.pros = pros;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
}
