package br.com.loja.pojo;

import br.com.loja.enums.Tamanhos;

import java.util.List;

public class Produtos {
    public String setNome;
    private String nome;
    private String marca;
    private Tamanhos tamanho;
    private List<ItemIncluso> itensInclusos;
    protected double valor;

    public Produtos(String marcaInicial, Tamanhos tamanhoInicial) {
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public Tamanhos getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanhos novoTamanho) {
            this.tamanho = novoTamanho;
    }

    public List<ItemIncluso> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        if (novoValor > 0 & novoValor < 100000) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0 e menores que 100000");
        }
    }
}
