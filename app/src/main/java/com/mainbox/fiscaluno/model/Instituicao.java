package com.mainbox.fiscaluno.model;

import java.util.List;

/**
 * Created by Wilder on 02/02/17.
 */

public class Instituicao {
    String nome;
    AvaliacaoGeral avaliacao;
    List<AvaliacaoProContra> avaliacoes;


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
}
