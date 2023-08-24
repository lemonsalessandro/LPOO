package controller;

import model.Funcionario;

public class FuncionarioController {

    public static void main(String[] args){

        Funcionario func = new Funcionario("Sergio", 1500.80);
        Funcionario func2 = new Funcionario("Maria", 1550.00);

        System.out.println(func);
        System.out.println(func2);

        //MUDANÇA DE VALORES COM SETTER
        func.setNome("Marcelo");
        func.setSalario(1890.15);

        func2.setNome("Roberta");
        func2.setSalario(1700.50);

        System.out.println("\n");

        //PRINT COM GETTER
        System.out.println(func.getNome());
        System.out.println(func.getSalario());

        System.out.println(func2.getNome());
        System.out.println(func2.getSalario());

    }
}
