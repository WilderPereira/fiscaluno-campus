package com.mainbox.fiscaluno.model;

import java.util.List;

/**
 * Created by Wilder on 02/02/17.
 */

public class Instituicao {

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
}
