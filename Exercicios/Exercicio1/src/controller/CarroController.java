package controller;

import model.Carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarroController {

    public static void main(String[] args){

        Carro golf = new Carro("Volkswagen", "Golf",  2010);
        Carro gol = new Carro("Volkswagen", "Gol",  1995);
        Carro focus = new Carro("Ford", "Focus",  2006);
        Carro corolla = new Carro("Toyota", "Corolla",  2001);
        Carro jetta = new Carro("Volkswagen", "Jetta",  2012);

        List<Carro>CarroList = new ArrayList<Carro>();

        CarroList.add(golf);
        CarroList.add(gol);
        CarroList.add(focus);
        CarroList.add(corolla);
        CarroList.add(jetta);
        CarroList.add(focus);

        System.out.println(CarroList);

//        Map<String, Carro> CarrosMap = new HashMap<>();
//        CarrosMap.put(golf.getMarca(), golf);
//
//        System.out.println(CarrosMap);

    }
}

