package com.company;

import java.util.ArrayList;

public class Produto {

    protected int id;
    protected String nome;
    protected String SKU;
    protected boolean variacao;
    protected ArrayList tipoVariacao;
    protected int quantidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public boolean isVariacao() {
        return variacao;
    }

    public void setVariacao(boolean variacao) {
        this.variacao = variacao;
    }

    public ArrayList getTipoVariacao() {
        return tipoVariacao;
    }

    public void setTipoVariacao(ArrayList tipoVariacao) {
        this.tipoVariacao = tipoVariacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

