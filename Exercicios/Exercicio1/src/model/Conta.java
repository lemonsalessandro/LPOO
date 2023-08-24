package model;

public class Conta {

    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    public void deposita(double valor){
        if(valor > 0){
            saldo += valor;
        }
        else{
            System.out.println("[ERRO] Valor inválido!");
        }
    }

    public void saca(double valor){
        if(saldo > valor && valor > 0){
            saldo -= valor;
            System.out.println("Você sacou: " + valor);
        }else{
            System.out.println("[ERRO] Você não possui saldo suficiente");
        }
    }

    public void atualiza(double taxa) {
        saldo += saldo * (taxa / 100);
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }
}
