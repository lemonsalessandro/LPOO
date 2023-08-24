package controller;

import model.Automovel;

import java.util.*;

public class automovelController {

    public static void main(String[] args) {

        Automovel auto1 = new Automovel(1L, "1b1b1b1b", "abc123", "prata", 4, "gasolina", 13123, "1fafsa", 1200.25);
        Automovel auto2 = new Automovel(2L, "1c1c1c1c", "def123", "vermelho", 4, "gasolina", 60600, "afggff", 1400.50);
        Automovel auto3 = new Automovel(3L, "1e1e1e1e", "fgh123", "branco", 4, "gasolina", 15110, "ffaf11", 1200.25);
        Automovel auto4 = new Automovel(4L, "1f1f1f1f", "ijk123", "preto", 4, "gasolina", 16800, "gaff", 1200.25);
        Automovel auto5 = new Automovel(5L, "1g1g1g1g", "lmn123", "grafite", 4, "gasolina", 80000, "fasfasga", 1200.25);
        Automovel auto6 = new Automovel(1L, "1b1b1b1b", "abc123", "prata", 4, "gasolina", 13123, "1fafsa", 1200.25);

        System.out.println(auto1);

        //METODOS SET E GET
        auto1.setCor("Preto");
        System.out.println(auto1.getCor());


        //LIST
        List<Automovel> automovelList = new ArrayList<Automovel>();

        automovelList.add(auto1);
        automovelList.add(auto2);
        automovelList.add(auto3);
        automovelList.add(auto4);
        automovelList.add(auto5);
        automovelList.add(auto6);

        //ordenação com list
        automovelList.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println(automovelList);

        //pesquisa com list veiculo id 3
           Automovel veiculoId3 = automovelList.stream().filter(a -> a.getId().equals(3L)).findAny().orElse(null);
            System.out.println(veiculoId3);

        //MAP
        Map<Long, Automovel> automovelMap = new HashMap<>();
        automovelMap.put(auto1.getId(), auto1);
        automovelMap.put(auto2.getId(), auto2);
        automovelMap.put(auto3.getId(), auto3);
        automovelMap.put(auto4.getId(), auto4);
        automovelMap.put(auto5.getId(), auto5);
        automovelMap.put(auto6.getId(), auto6);

        System.out.println("\n\n\n" + automovelMap);

        //ordenação map
        System.out.println("BUSCA MAP VEICULO ID 4: " + automovelMap.get(auto4.getId()));
    }
}
