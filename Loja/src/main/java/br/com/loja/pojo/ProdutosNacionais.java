package br.com.loja.pojo;

import br.com.loja.enums.Tamanhos;
import br.com.loja.interfaes.Favoritos;

public class ProdutosNacionais extends Produtos implements Favoritos {
    private double impostoNacional;

    public ProdutosNacionais(String marcaInicial, Tamanhos tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getImpostoNacional() {
        return this.impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional) {
        this.impostoNacional = novoImpostoNacional;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
