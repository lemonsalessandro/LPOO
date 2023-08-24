package controller;

import model.Marca;
import model.Modelo;

import java.util.*;

public class modeloController {

    public static void main(String[] args){

        Modelo modelo1 = new Modelo();

        System.out.println(modelo1);

        modelo1.setDescricao("modelo testeee");

        System.out.println(modelo1.getDescricao());

        Modelo modelo2 = new Modelo("Modelo2", "1");
        Modelo modelo3 = new Modelo("Modelo3", "2");
        Modelo modelo4 = new Modelo("Modelo4", "3");
        Modelo modelo5 = new Modelo("Modelo5", "4");
        Modelo modelo6 = new Modelo("Modelo6", "1");


        //LiST
        List<Modelo> modeloList = new ArrayList<>();
        modeloList.add(modelo2);
        modeloList.add(modelo3);
        modeloList.add(modelo4);
        modeloList.add(modelo5);
        modeloList.add(modelo6);

        System.out.println("modeloList: " + modeloList);

        //ordenacao list
        modeloList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println("Ordenacao por id reverso: " + modeloList);

        //busca list
        Modelo modeloId = modeloList.stream().filter(a -> a.getId().equals("3")).findAny().orElse(null);
        System.out.println("Busca: " + modeloId);


        //MAP
        Map<String, Modelo> modeloMap = new HashMap<>();
        modeloMap.put(modelo2.getId(), modelo2);
        modeloMap.put(modelo3.getId(), modelo3);
        modeloMap.put(modelo4.getId(), modelo4);
        modeloMap.put(modelo5.getId(), modelo5);
        modeloMap.put(modelo6.getId(), modelo6);

        System.out.println("modeloMap: " + modeloMap);

        System.out.println("busca no modeloMap por id: " + modeloMap.get(modelo4.getId()));


    }

}

