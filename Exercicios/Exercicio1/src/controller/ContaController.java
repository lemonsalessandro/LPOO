package controller;

import model.Conta;

public class ContaController {

    public static void main(String[] args){

        Conta conta = new Conta(5000);

        conta.deposita(500);
        conta.saca(200);

        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.atualiza(10);
        System.out.println("Saldo com a taxa é: " + conta.getSaldo());
    }

}
