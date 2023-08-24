package controller;

import model.Marca;

import java.util.*;

public class marcaController {

    public static void main(String[] args){
        Marca marcaTeste = new Marca();

        System.out.println(marcaTeste);

        marcaTeste.setDescricao("marca testeee");

        System.out.println(marcaTeste.getDescricao());

        Marca marca1 = new Marca("Fiat", 1L);
        Marca marca2 = new Marca("Ford", 2L);
        Marca marca3 = new Marca("Chevrolet", 3L);
        Marca marca4 = new Marca("Nissan", 4L);
        Marca marca5 = new Marca("Toyota", 5L);
        Marca marca6 = new Marca("Ford", 2L);

        List<Marca> marcaList = new ArrayList<>();
        marcaList.add(marca1);
        marcaList.add(marca2);
        marcaList.add(marca3);
        marcaList.add(marca4);
        marcaList.add(marca5);
        marcaList.add(marca6);

        System.out.println("marcaList: " + marcaList);

        //ordenacao list
        marcaList.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println("Ordenacao por id reverso: " + marcaList);

        //busca list
        Marca marcaId = marcaList.stream().filter(a -> a.getId().equals(2L)).findAny().orElse(null);
        System.out.println("Busca: " + marcaId);


        //MAP

        Map<Long, Marca> marcaMap = new HashMap<>();

        marcaMap.put(marca1.getId(), marca1);
        marcaMap.put(marca2.getId(), marca2);
        marcaMap.put(marca3.getId(), marca3);
        marcaMap.put(marca4.getId(), marca4);
        marcaMap.put(marca5.getId(), marca5);
        marcaMap.put(marca6.getId(), marca6);

        //busca map
        System.out.println("busca no marcaMap por id: " + marcaMap.get(marca3.getId()));
    }

}
