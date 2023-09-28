package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class animalController {

    public static void main(String[] args) {

        // Crie três instâncias de cada classe do diagrama
        Peixe peixe1 = new Peixe();
        Peixe peixe2 = new Peixe(2,2);
        Peixe peixe3 = new Peixe(3,3,3);

        Cachorro cachorro1 = new Cachorro(4,4);
        Cachorro cachorro2 = new Cachorro(5,5);
        Cachorro cachorro3 = new Cachorro(6,6);


        Passaro passaro1 = new Passaro();
        Passaro passaro2 = new Passaro(8,8);
        Passaro passaro3 = new Passaro(9,9,9);

        //Insira-os em uma coleção do tipo List e os imprima
        List<Animal> animaisList = new ArrayList<Animal>();

        animaisList.add(peixe1);
        animaisList.add(peixe2);
        animaisList.add(peixe3);

        animaisList.add(cachorro1);
        animaisList.add(cachorro2);
        animaisList.add(cachorro3);

        animaisList.add(passaro1);
        animaisList.add(passaro2);
        animaisList.add(passaro3);

        System.out.println(animaisList);

        //Percorra a coleção e faça com que os personagens sejam posicionados nas coordenadas
        //(2, 2), os desenhe, e imprima-os;

        animaisList.forEach(animal ->{
            animal.mover(2, 2);
        });

        System.out.println("Movendo para a posição 2,2" + animaisList);


        //Reposicione os personagens que pertençam a classe Cachorro, nas coordenadas (8, 8),
        //os desenhe e imprima-os;
        animaisList.forEach(animal ->{
            if(animal instanceof Cachorro){
                animal.mover(8,8);
                animal.desenhar();
                System.out.println(animal);
            }
        });

        //Reposicione os personagens que pertençam as classes Peixe e Passaro, nas coordenadas
        //(5, 5, 5), os desenhe e imprima-os.
        animaisList.forEach(animal ->{
            if(animal instanceof Passaro){
                ((Passaro) animal).mover(5,5,5);
                animal.desenhar();
                System.out.println(animal);
            }
            if(animal instanceof Peixe){
                ((Peixe) animal).mover(5,5,5);
                animal.desenhar();
                System.out.println(animal);
            }
        });

    }
}
