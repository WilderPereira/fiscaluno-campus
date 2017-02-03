package com.mainbox.fiscaluno.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Wilder on 02/02/17.
 */

public class AvaliacaoGeral implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.codigo);
        dest.writeString(this.categoria);
        dest.writeValue(this.media);
    }

    public AvaliacaoGeral() {
    }

    protected AvaliacaoGeral(Parcel in) {
        this.codigo = (Integer) in.readValue(Integer.class.getClassLoader());
        this.categoria = in.readString();
        this.media = (Float) in.readValue(Float.class.getClassLoader());
    }

    public static final Parcelable.Creator<AvaliacaoGeral> CREATOR = new Parcelable.Creator<AvaliacaoGeral>() {
        @Override
        public AvaliacaoGeral createFromParcel(Parcel source) {
            return new AvaliacaoGeral(source);
        }

        @Override
        public AvaliacaoGeral[] newArray(int size) {
            return new AvaliacaoGeral[size];
        }
    };
}
