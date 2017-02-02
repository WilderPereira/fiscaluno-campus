package com.mainbox.fiscaluno.model;

import java.util.List;

/**
 * Created by Wilder on 02/02/17.
 */

public class Instituicao {
    String nome;
    Float mediaAvaliacao;
    List<AvaliacaoProContra> avaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(Float mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public List<AvaliacaoProContra> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacaoProContra> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
