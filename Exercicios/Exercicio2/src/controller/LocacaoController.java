package controller;

import model.Automovel;
import model.Cliente;
import model.Locacao;

import java.util.*;

public class LocacaoController {

    public static void main(String[] args) {

        Locacao locacaoTeste = new Locacao();

        System.out.println(locacaoTeste);

        locacaoTeste.setValor_locacao(1199.99);

        System.out.println(locacaoTeste.getValor_locacao());

        Locacao locacao1 = new Locacao(1L, "01/01/2020", "10:00", "08/01/2020", "10:00", 1500, 900.00, 3800, false);
        Locacao locacao2 = new Locacao(2L, "01/02/2020", "10:00", "08/02/2020", "10:00", 1500, 900.00, 3800, false);
        Locacao locacao3 = new Locacao(3L, "01/03/2020", "10:00", "08/03/2020", "10:00", 1500, 900.00, 3800, false);
        Locacao locacao4 = new Locacao(4L, "01/04/2020", "10:00", "08/04/2020", "10:00", 1500, 900.00, 3800, false);
        Locacao locacao5 = new Locacao(5L, "01/05/2020", "10:00", "08/05/2020", "10:00", 1500, 900.00, 3800, false);
        Locacao locacao6 = new Locacao(1L, "01/01/2020", "10:00", "08/01/2020", "10:00", 1500, 900.00, 3800, false);

        List<Locacao> locacaoList = new ArrayList<>();
        locacaoList.add(locacao1);
        locacaoList.add(locacao2);
        locacaoList.add(locacao3);
        locacaoList.add(locacao4);
        locacaoList.add(locacao5);
        locacaoList.add(locacao6);

        System.out.println(locacaoList);

        //ordenação com list
        locacaoList.sort(Comparator.comparing(Locacao::getId).reversed());
        System.out.println("locacaoList ordenado: " + locacaoList);

        //pesquisa com list locacao de id 4
        Locacao locacaoId4 = locacaoList.stream().filter(a -> a.getId().equals(4L)).findAny().orElse(null);
        System.out.println("Locacao de id 4: " + locacaoId4);


        Map<Long, Locacao> locacaoMap = new HashMap<>();

        locacaoMap.put(locacao1.getId(), locacao1);
        locacaoMap.put(locacao2.getId(), locacao2);
        locacaoMap.put(locacao3.getId(), locacao3);
        locacaoMap.put(locacao4.getId(), locacao4);
        locacaoMap.put(locacao5.getId(), locacao5);
        locacaoMap.put(locacao6.getId(), locacao6);

        System.out.println("Cliente Map: \n" + locacaoMap);

        //busca map
        System.out.println("Cliente Map id: " + locacaoMap.get(locacao4.getId()));
    }
}
