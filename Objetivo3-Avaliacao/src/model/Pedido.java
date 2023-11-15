package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private java.util.Date data;
    private double valor;
    //ligação entre Pedido e Item
    List<Item> itens = new ArrayList<>();
    //ligação entre Pedido e Vendedor;
    Vendedor vendedor;

    public Pedido(int numero, java.util.Date data, double valor, List<Item> itens, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.itens = itens;
        this.vendedor = vendedor;
    }

    public Pedido(int numero, java.util.Date data, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.vendedor = vendedor;
    }

    public Pedido() {
    }


//    public static boolean manterPedido(int numero){

//    }
//
//    public static boolean manterItem(int codItem){

//    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public java.util.Date getData() {
        return data;
    }

    public void setData(java.util.Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void adicionaItem(Item item) {
        try {
            if (item.getProduto().getQuantidade() < item.getQuantidade()) {
                throw new EstoqueInsuficienteException();
            }
            this.itens.add(item);
            item.getProduto().setQuantidade(item.getProduto().getQuantidade() - item.getQuantidade());
        } catch (EstoqueInsuficienteException e) {
            System.err.println(e.getMessage());
        }
    }

    public void removeItem(Item item) {
        this.itens.remove(item);
        item.getProduto().setQuantidade(item.getProduto().getQuantidade() + item.getQuantidade());
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor+
                ", itens=" + itens +
                ", vendedor=" + vendedor.getNome() +
                '}';
    }
}
