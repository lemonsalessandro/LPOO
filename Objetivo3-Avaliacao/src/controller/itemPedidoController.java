package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class itemPedidoController {

    public static void main(String[] args) {

        double totalFornecimentos = 0.0;


        Vendedor vend1 = new Vendedor(1, "Maria", "Rua ABC", "Bairro A", "00000-000", "Cidade A", "Estado A", "Local A");
        Vendedor vend2 = new Vendedor(1, "Joao", "Rua CDE", "Bairro B", "11111-111", "Cidade B", "Estado B", "Local B");

        Produto produto1 = new Produto(1, "Produto 1", 500, 50.0);
        Produto produto2 = new Produto(2, "Produto 2", 800, 20);

        Fornecedor fornec1 = new Fornecedor(12345, "999999999", "Fornecedor 1");
        Fornecedor fornec2 = new Fornecedor(67890, "888888888", "Fornecedor 2");

        Item item1 = new Item(1, 10, 30, produto1);
        Item item2 = new Item(2, 5, 25, produto2);

        produto1.getItensList().add(item1);
//        System.out.println(produto1);

        Pedido pedido1 = new Pedido(1, new java.util.Date(2023, 10, 10), vend1);
        Pedido pedido2 = new Pedido(2, new java.util.Date(2023, 10, 15), vend2);

//        System.out.println(pedido1);

        pedido1.adicionaItem(item1);
        pedido2.adicionaItem(item2);
        vend1.getPedidos().add(pedido1);
        vend1.getPedidos().add(pedido2);

        List<Pedido> vendas = new ArrayList<>();
        vendas.add(pedido1);
        vendas.add(pedido2);
        System.out.println("\nLISTA DE VENDAS");
        System.out.println(vendas);

        //estoque após a venda dos itens
        System.out.println("\nESTOQUE APÓS A VENDA");
        System.out.println(produto1);
        System.out.println(produto2);

        //adiciona item
        System.out.println("\nADICIONANDO");
        pedido1.adicionaItem(item2);
        System.out.println(produto2);

        //Remove item
        System.out.println("\nREMOVENDO ITEM");
        pedido2.removeItem(item2);
        System.out.println(produto2);

        produto1.getFornecedores().add(fornec1);
        produto2.getFornecedores().add(fornec2);

        Fornecimento fornecimento1 = new Fornecimento(new java.util.Date(2023, 10, 9), produto1.getPreco() * 20, produto1, fornec1);
        produto1.setQuantidade(produto1.getQuantidade() + 20);

        Fornecimento fornecimento2 = new Fornecimento(new java.util.Date(2023, 10, 13), produto2.getPreco() * 14, produto2, fornec2);
        produto1.setQuantidade(produto1.getQuantidade() + 14);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento1);
        fornecimentos.add(fornecimento2);

        System.out.println("\nLista de fornecimentos:");
        System.out.println(fornecimentos);


        for (Fornecimento fornecimento : fornecimentos) {
            totalFornecimentos += fornecimento.getValorTotal();
        }

        System.out.println("\nTotal em fornecimentos:");
        System.out.println("R$:" + totalFornecimentos);



    }
}
