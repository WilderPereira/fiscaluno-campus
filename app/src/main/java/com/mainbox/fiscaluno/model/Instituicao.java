package com.mainbox.fiscaluno.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Wilder on 02/02/17.
 */

public class Instituicao implements Parcelable {

    private Integer codigo;
    private String logo;
    private String nome;
    private AvaliacaoGeral avaliacao;
    private List<AvaliacaoProContra> avaliacoes;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AvaliacaoGeral getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(AvaliacaoGeral avaliacao) {
        this.avaliacao = avaliacao;
    }

    public List<AvaliacaoProContra> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacaoProContra> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.codigo);
        dest.writeString(this.logo);
        dest.writeString(this.nome);
        dest.writeParcelable(this.avaliacao, flags);
        dest.writeTypedList(this.avaliacoes);
    }

    public Instituicao() {
    }

    protected Instituicao(Parcel in) {
        this.codigo = (Integer) in.readValue(Integer.class.getClassLoader());
        this.logo = in.readString();
        this.nome = in.readString();
        this.avaliacao = in.readParcelable(AvaliacaoGeral.class.getClassLoader());
        this.avaliacoes = in.createTypedArrayList(AvaliacaoProContra.CREATOR);
    }

    public static final Parcelable.Creator<Instituicao> CREATOR = new Parcelable.Creator<Instituicao>() {
        @Override
        public Instituicao createFromParcel(Parcel source) {
            return new Instituicao(source);
        }

        @Override
        public Instituicao[] newArray(int size) {
            return new Instituicao[size];
        }
    };
}