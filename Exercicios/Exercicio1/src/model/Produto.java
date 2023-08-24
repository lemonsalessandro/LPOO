package model;

public class Produto {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;

    public Produto(String nome, String descricao, int estoque, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.valor = valor;
    }

    public Produto() {
    }


    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String toString() {
        return "Nome: " + nome + ", Descricao: " + descricao + ", Estoque: " + estoque + ", Valor: " + valor;
    }
}
