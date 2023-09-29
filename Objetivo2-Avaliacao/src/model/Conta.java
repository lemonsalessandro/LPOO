package model;

public abstract class Conta {

    protected double saldo;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if(this.saldo > valor && valor > 0){
            this.saldo -= valor;}
        else{
            System.out.println("Você não possui saldo disponível");
        }
    }

    public void atualiza (double taxa){
        this.saldo += saldo * (taxa/100);
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
