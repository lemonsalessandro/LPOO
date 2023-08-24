package controller;

import model.Produto;

public class ProdutoController {

    public static void main(String[] args) {

        Produto produto = new Produto("Caneta", "Preta", 30, 3.50);

        System.out.println(produto);

        produto.setNome("Lapis");
        produto.setDescricao("6b");
        produto.setEstoque(120);
        produto.setValor(2.50);

        System.out.println("\n");

        System.out.println(produto.getNome());
        System.out.println(produto.getDescricao());
        System.out.println(produto.getEstoque());
        System.out.println(produto.getValor());

    }
}

