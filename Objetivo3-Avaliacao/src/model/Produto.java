package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    //ligação entre Produto e Item
    List<Item> itens = new ArrayList<>();

    //ligação entre Produto e Fornecedor
    List<Fornecedor> fornecedores = new ArrayList<>();

//    public static boolean manterProdutos(int codigo){
//
//    }

    public Produto(int codigo, String nome, int quantidade, double preco, List<Item> itens, List<Fornecedor> fornecedores) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.itens = itens;
        this.fornecedores = fornecedores;
    }

    //construtor sem Item
    public Produto(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto() {
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Item> getItensList() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
