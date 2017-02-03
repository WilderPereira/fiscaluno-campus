package com.mainbox.fiscaluno.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Wilder on 02/02/17.
 */

public class AvaliacaoProContra implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.codigo);
        dest.writeString(this.titulo);
        dest.writeString(this.pros);
        dest.writeString(this.contra);
        dest.writeString(this.dias);
    }

    public AvaliacaoProContra() {
    }

    protected AvaliacaoProContra(Parcel in) {
        this.codigo = (Integer) in.readValue(Integer.class.getClassLoader());
        this.titulo = in.readString();
        this.pros = in.readString();
        this.contra = in.readString();
        this.dias = in.readString();
    }

    public static final Parcelable.Creator<AvaliacaoProContra> CREATOR = new Parcelable.Creator<AvaliacaoProContra>() {
        @Override
        public AvaliacaoProContra createFromParcel(Parcel source) {
            return new AvaliacaoProContra(source);
        }

        @Override
        public AvaliacaoProContra[] newArray(int size) {
            return new AvaliacaoProContra[size];
        }
    };
}
