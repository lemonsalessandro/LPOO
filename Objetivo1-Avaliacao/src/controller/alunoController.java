package controller;

import model.Aluno;

import java.util.*;

public class alunoController {
    public static void main(String[] args) {

        //CONSTRUTOR VAZIO
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //CONSTRUTOR PARAMETRIZADO
        Aluno aluno3 = new Aluno(3, 3456, "José", "Silva", "bruno@gmail.com");
        Aluno aluno4 = new Aluno(4, 4567, "Maria", "Silva", "maria@gmail.com");

        //CONSTRUTOR 2 PARAMETROS
        Aluno aluno5 = new Aluno(5, "mariana@gmail.com");
        Aluno aluno6 = new Aluno(6, "douglas@gmail.com");


        //TO STRING
        System.out.println("TO STRING");
        System.out.println("Aluno 1: " + aluno1);
        System.out.println("Aluno 2: " + aluno2);
        System.out.println("Aluno 3: " + aluno3);
        System.out.println("Aluno 4: " + aluno4);
        System.out.println("Aluno 5: " + aluno5);
        System.out.println("Aluno 6: " + aluno6);

        //GETTERS E SETTERS CONSTRUTORES PADRÃO
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


        //LIST
        List<Aluno> alunosList = new ArrayList<>();

        System.out.println("\nALUNOS LIST: ");
        alunosList.add(aluno1);
        alunosList.add(aluno2);
        alunosList.add(aluno3);
        alunosList.add(aluno4);
        alunosList.add(aluno5);
        alunosList.add(aluno6);

        System.out.println(alunosList);

       Aluno alunoId5 = alunosList.stream().filter(a -> a.getId()==5).findAny().orElse(null);
       System.out.println("Aluno ID 5 LIST: " + alunoId5);


        //LIST COM ORDEM DESCRESCENTE
        alunosList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("\nLIST EM ORDEM DECRESCENTE");
        System.out.println(alunosList);

        //MAP
        System.out.println("\nALUNOS MAP");

        Map<Integer, Aluno> alunosMap = new HashMap<>();

        alunosMap.put(aluno1.getId(), aluno1);
        alunosMap.put(aluno2.getId(), aluno2);
        alunosMap.put(aluno3.getId(), aluno3);
        alunosMap.put(aluno4.getId(), aluno4);
        alunosMap.put(aluno5.getId(), aluno5);
        alunosMap.put(aluno6.getId(), aluno6);

        System.out.println(alunosMap);

        //PRINT DO OBJETO ID 5 COM MAP
        System.out.println("Aluno ID 5 MAP: " + alunosMap.get(aluno5.getId()));
    }
}