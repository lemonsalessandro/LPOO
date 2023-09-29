package model;

public class Cliente implements Associado{
    private String nome;
    private double valorCota;
    private int qtdCota;

    public Cliente() {
    }

    public Cliente(String nome, double valorCota, int qtdCota) {
        this.nome = nome;
        this.valorCota = valorCota;
        this.qtdCota = qtdCota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    @Override
    public int getQuantidadeCotas() {
        return qtdCota;
    }

    public void setQtdCota(int qtdCota) {
        this.qtdCota = qtdCota;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", valorCota=" + valorCota +
                ", qtdCota=" + qtdCota +
                '}';
    }
}
