package model;

public class ContaCorrente extends Conta implements Associado{

    private double valorCota;
    private int qtdCota;


    public ContaCorrente(double saldo, double valorCota, int qtdCota) {
        super(saldo);
        this.valorCota = valorCota;
        this.qtdCota = qtdCota;
    }

    public ContaCorrente() {
    }


    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }

    @Override
    public int getQuantidadeCotas() {
        return qtdCota;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "valorCota=" + valorCota +
                ", qtdCota=" + qtdCota +
                ", saldo=" + saldo +
                "} ";
    }
}
