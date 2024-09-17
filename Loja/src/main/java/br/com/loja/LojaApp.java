package br.com.loja;

import br.com.loja.enums.Tamanhos;
import br.com.loja.pojo.ItemIncluso;
import br.com.loja.pojo.Produtos;
import br.com.loja.pojo.ProdutosInternacionais;
import br.com.loja.pojo.ProdutosNacionais;

import java.util.ArrayList;
import java.util.List;

public class LojaApp {
    public static void main(String[] args) {
        Produtos meusProdutos = new Produtos("Dell" , Tamanhos.MEDIO);

        meusProdutos.setNome("Notebook");
        meusProdutos.setTamanho(Tamanhos.PEQUENO);
        meusProdutos.setValor(4999.99);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Carregador", 1);
        itensInclusos.add(primeiroItemIncluso); // o

        ItemIncluso segundoItemIncluso = new ItemIncluso("Capa Protetora", 1);
        itensInclusos.add(segundoItemIncluso); // 1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Mouse sem fio", 1);
        itensInclusos.add(terceiroItemIncluso); // 2

        meusProdutos.setItensInclusos(itensInclusos);

        System.out.println(meusProdutos.getValor());
        System.out.println(meusProdutos.getTamanho());
        System.out.println(meusProdutos.getMarca());

        for (ItemIncluso itemAtual : meusProdutos.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Acabaram-se os itens!");

        ProdutosNacionais meuProdutoNacional = new ProdutosNacionais("Samsung", Tamanhos.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.2468);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutosInternacionais meuProdutoInternacional = new ProdutosInternacionais("Samsung", Tamanhos.MEDIO);
        meuProdutoInternacional.setValor(-100);
    }
}
