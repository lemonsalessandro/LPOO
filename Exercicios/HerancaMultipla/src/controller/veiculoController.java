package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class veiculoController {

    public static void main(String[] args) {

        Bicicleta b1 = new Bicicleta(2, "humana", "marca1", "modelo1", 2018, 18, "abc123");
        Bicicleta b2 = new Bicicleta(2, "humana", "marca2", "modelo2", 2010, 16, "abc321");
        Bicicleta b3 = new Bicicleta(2, "humana", "marca1", "modelo3", 2012, 26, "abc432");
        Bicicleta b4 = new Bicicleta(2, "humana", "marca2", "modelo4", 2020, 24, "abc515");
        Bicicleta b5 = new Bicicleta(2, "humana", "marca1", "modelo5", 2023, 20, "abc566");


        Carro c1 = new Carro(4, "motor", "fiat", "uno", 1999, 100);
        Carro c2 = new Carro(4, "motor", "volkswagen", "gol", 2005, 100);
        Carro c3 = new Carro(4, "motor", "ford", "focus", 2010, 100);
        Carro c4 = new Carro(4, "motor", "chevrolet", "chevette", 1998, 100);
        Carro c5 = new Carro(4, "motor", "volkswagen", "santana", 1997, 100);

        Caminhao caminhao1 = new Caminhao(12, "motor", "volvo", "modelo1", 2008, 10000);
        Caminhao caminhao2 = new Caminhao(20, "motor", "mercedes", "modelo2", 2012, 15000);
        Caminhao caminhao3 = new Caminhao(16, "motor","iveco", "modelo3", 2005, 8000);
        Caminhao caminhao4 = new Caminhao(12, "motor","volkswagen", "modelo4", 2010, 10000);
        Caminhao caminhao5 = new Caminhao(16, "motor","ford", "modelo5", 2000, 16000);


        c1.setPlaca("iaa123");
        c2.setPlaca("aaa123");
        c3.setPlaca("iccc123");
        c4.setPlaca("aeiou");
        c5.setPlaca("eglc1");
        caminhao1.setPlaca("acb123");
        caminhao2.setPlaca("abc123");
        caminhao3.setPlaca("iii111");
        caminhao4.setPlaca("ivb222");
        caminhao5.setPlaca("izx000");

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(b3);
        veiculos.add(b4);
        veiculos.add(b5);

        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(c3);
        veiculos.add(c4);
        veiculos.add(c5);

        veiculos.add(caminhao1);
        veiculos.add(caminhao2);
        veiculos.add(caminhao3);
        veiculos.add(caminhao4);
        veiculos.add(caminhao5);

        //a- Ordene e liste os veiculos do maior para o menor ano de fabricação;
        System.out.println("Ordene e liste os veiculos do maior para o menor ano de fabricação");
        veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println(veiculos);


        //b-Ordene e imprima a lista de automóveis cadastradas no sistema, na mesma ordem do item a;
        System.out.println("Ordene e imprima a lista de automóveis cadastradas");
        for(Veiculo veiculo: veiculos){
            if(veiculo instanceof Automovel){
                System.out.println(veiculo);
            }
        }

        //c - imprima a lista de bicicletas cadastradas no sistema na ordem do item a
        System.out.println("Imprima a lista de bicicletas");
        for(Veiculo veiculo: veiculos){
            if(veiculo instanceof Bicicleta){
                System.out.println(veiculo);
            }
        }

        //d - Ordene e imprima a lista de veículos que possuem placas que começam pela letra
        //“I” ou “i” (organize o código para que dois ou mais veículos tenham placas que
        //comecem por “I” ou “i”), em ordem crescente pelo ano de fabricação.
        System.out.println(" Ordene e imprima a lista de veículos que possuem placas que começam pela letra I ou i");

        List<Veiculo> veiculosPlacaI = new ArrayList<>();

        for(Veiculo veiculo: veiculos){
            if(veiculo instanceof Automovel){
                if(((Automovel) veiculo).getPlaca().startsWith("i")){
                veiculosPlacaI.add(veiculo);
                }
            }
        }

        veiculosPlacaI.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println(veiculosPlacaI);


    }
}
