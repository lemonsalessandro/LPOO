package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class contaController {
    public static void main(String[] args) {

       //a. Crie 3 instâncias de cada classe (das possíveis de criar instâncias), insira valores válidos
        //nos atributos dessas instâncias, e imprima esses objetos;

        ContaCorrente cc1 = new ContaCorrente(1500, 1, 100);
        ContaCorrente cc2 = new ContaCorrente(1500, 2, 400);
        ContaCorrente cc3 = new ContaCorrente(1500, 3, 600);

        Cliente cliente1 = new Cliente("Bruno", 1, 300);
        Cliente cliente2 = new Cliente("Marta", 2, 600);
        Cliente cliente3 = new Cliente("Carlos", 3 , 600);

        ContaPoupanca cp1 = new ContaPoupanca(2000);
        ContaPoupanca cp2 = new ContaPoupanca(2000);
        ContaPoupanca cp3 = new ContaPoupanca(2000);

        //b Crie as coleções necessárias para expressar as contas registradas no sistema, bem como,
        //os associados, depois, imprima essa (s) coleção (ões);

        List<Conta> contasList = new ArrayList<>();

        contasList.add(cc1);
        contasList.add(cc2);
        contasList.add(cc3);

        contasList.add(cp1);
        contasList.add(cp2);
        contasList.add(cp3);

        System.out.println(contasList);

        List<Associado> associadoList = new ArrayList<>();
        associadoList.add(cliente1);
        associadoList.add(cliente2);
        associadoList.add(cliente3);
        associadoList.add(cc1);
        associadoList.add(cc2);
        associadoList.add(cc3);


        //c. Movimente, pelo menos, uma conta poupança, realizando as seguintes operações:
        //depósito de R$ 1.000,00; atualização monetária de 5%; saque de R$ 50,00;
        System.out.println("\n\nCONTA POUPANÇA");
        System.out.println("Depositou R$1000");
        cp1.deposita(1000);
        System.out.println(cp1);

        System.out.println("Atualizou 5%");
        cp1.atualiza(5);
        System.out.println(cp1);

        System.out.println("Sacou R$50,00");
        cp1.saca(50);
        System.out.println(cp1);

        //d. Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito
        //R$ 500,00; saque de R$ 400,00;
        System.out.println("\n\nCONTA CORRENTE");
        System.out.println("Depositou R$500");
        cc1.deposita(500);
        System.out.println(cc1);

        System.out.println("Sacou R$400");
        cc1.saca(400);
        System.out.println(cc1);


        //f. A partir da (s) coleção (ões), imprima todos os associados, ordenados pelo critério de
        //número de cotas, em ordem decrescente. E faça o programa calcular e imprimir os
        //associados com o maior número de cotas no sistema.
        associadoList.sort(Comparator.comparing(Associado::getQuantidadeCotas).reversed());

        System.out.println("\nAssociados em ordem de maior numero de cotas: " + associadoList);

        associadoList.sort(Comparator.comparing(Associado::getQuantidadeCotas));

        System.out.println("\nAssociado com o maior numero de cotas: ");

        int maxCota = associadoList.stream().max(Comparator.comparing(Associado::getQuantidadeCotas)).get().getQuantidadeCotas();

        System.out.println(maxCota);

        System.out.println("\nAssociados com maiores cotas: ");
        associadoList.forEach(a -> {
                if(a.getQuantidadeCotas() == maxCota){
                    System.out.println(a);
                }
        });

    //g A partir da (s) coleção (ões), imprima todas as contas cadastradas no sistema, ordenadas
        //pelo critério saldo, em ordem decrescente. E, imprima todas associados que sejam
        //Associado e possua conta cadastradas no sistema, em qualquer ordem. Também faça o
        //programa imprimir a lista de contas com maior saldo bancário.

        contasList.sort(Comparator.comparing(Conta::getSaldo).reversed());

        System.out.println("\nContas ordenadas por saldo: " + contasList);

        associadoList.forEach( a ->{
            if(a instanceof Conta){
                System.out.println(a);            }
        });

        double maxSaldo = contasList.stream().max(Comparator.comparing(Conta::getSaldo)).get().getSaldo();

        contasList.forEach(c -> {
            if(c.getSaldo() == maxSaldo){
                System.out.println("Maior saldo: " + c);
            }
        });


    }

}
