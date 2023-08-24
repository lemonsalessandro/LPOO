package controller;

import model.Aluno;

import java.util.*;

public class alunoController {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(3, 3456, "José", "Silva", "bruno@gmail.com");
        Aluno aluno4 = new Aluno(4, 4567, "Maria", "Silva", "maria@gmail.com");
        Aluno aluno5 = new Aluno();
        Aluno aluno6 = new Aluno();

        //TO STRING
        System.out.println("TO STRING");
        System.out.println("Aluno 1: " + aluno1);
        System.out.println("Aluno 2: " + aluno2);
        System.out.println("Aluno 3: " + aluno3);
        System.out.println("Aluno 4: " + aluno4);
        System.out.println("Aluno 5: " + aluno5);
        System.out.println("Aluno 6: " + aluno6);

        //GETTERS E SETTERS
        System.out.println("\n\nGETTERS E SETTERS");

        //ALUNO 1
        aluno1.setId(1);
        aluno1.setCpf(1234);
        aluno1.setNome("Bruno");
        aluno1.setSobrenome("Ferreira");
        aluno1.setEmail("bruno@gmail.com");
        System.out.println("\nALUNO 1:");
        System.out.println("ID: " + aluno1.getId());
        System.out.println("CPF: " + aluno1.getCpf());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Sobrenome: " + aluno1.getSobrenome());
        System.out.println("Email: " + aluno1.getEmail());

        //ALUNO 2
        aluno2.setId(2);
        aluno2.setCpf(2345);
        aluno2.setNome("Guilherme");
        aluno2.setSobrenome("Carvalho");
        aluno2.setEmail("guilherme@gmail.com");
        System.out.println("\nALUNO 2:");
        System.out.println("ID: " + aluno2.getId());
        System.out.println("CPF: " + aluno2.getCpf());
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Sobrenome: " + aluno2.getSobrenome());
        System.out.println("Email: " + aluno2.getEmail());

        //ALUNO 5
        aluno5.setId(5);
        aluno5.setEmail("mariana@gmail.com");
        System.out.println("\nALUNO 5:");
        System.out.println("ID: " + aluno5.getId());
        System.out.println("Email: " + aluno5.getEmail());

        //ALUNO 6
        aluno6.setId(6);
        aluno6.setEmail("douglas@gmail.com");
        System.out.println("\nALUNO 6:");
        System.out.println("ID: " + aluno6.getId());
        System.out.println("Email: " + aluno6.getEmail());

    }
}