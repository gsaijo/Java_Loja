package br.com.loja.pojo;

import br.com.loja.enums.Tamanhos;
import br.com.loja.interfaes.Favoritos;

public class ProdutosInternacionais extends Produtos implements Favoritos {
    private double taxaDeImportacao;

    public ProdutosInternacionais(String marcaInicial, Tamanhos tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor) {
        if (novoValor > -100 & novoValor < 100000) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100 e menores que 100000");
        }
    }

    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
