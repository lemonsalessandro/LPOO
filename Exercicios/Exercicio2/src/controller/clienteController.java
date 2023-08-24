package controller;

import model.Automovel;
import model.Cliente;

import java.util.*;

public class clienteController {

     public static void main (String[] args){

         Cliente cliente1 = new Cliente(1L, "123131231", "Joao", "Silva", "Rua A", "1234", "12441", "aaa@gmail.com");
         Cliente cliente2 = new Cliente(2L, "313132188", "Jorge", "Silva", "Rua B", "12344", "115611", "aaa@gmail.com");
         Cliente cliente3 = new Cliente(3L, "151551313", "Maria", "Silva", "Rua B", "124234", "2221111", "aaa@gmail.com");
         Cliente cliente4 = new Cliente(4L, "177347734", "Bruno", "Silva", "Rua A", "16234", "61111", "aaa@gmail.com");
         Cliente cliente5 = new Cliente(5L, "884843131", "Daniela", "Silva", "Rua C", "81234", "881111", "aaa@gmail.com");
         Cliente cliente6 = new Cliente(1L, "123131231", "Joao", "Silva", "Rua A", "1234", "12441", "aaa@gmail.com");

         System.out.println(cliente1);

         cliente1.setCpf("03299987010");
         System.out.println(cliente1.getCpf());

         //LIST
         List<Cliente> clientesList = new ArrayList<Cliente>();
         clientesList.add(cliente1);
         clientesList.add(cliente2);
         clientesList.add(cliente3);
         clientesList.add(cliente4);
         clientesList.add(cliente5);
         clientesList.add(cliente6);

         System.out.println("LIST CLIENTES: " + clientesList);

         //ordenação list
         clientesList.sort(Comparator.comparing(Cliente::getId).reversed());
         System.out.println("LIST ORDENADO:\n " + clientesList);

        //pesquisa
         Cliente clienteID = clientesList.stream().filter(a -> a.getId().equals(5L)).findAny().orElse(null);
         System.out.println("cliente encontrado: " + clienteID);

         //MAP
         Map<Long, Cliente> clienteMap = new HashMap<>();

         clienteMap.put(cliente1.getId(), cliente1);
         clienteMap.put(cliente2.getId(), cliente2);
         clienteMap.put(cliente3.getId(), cliente3);
         clienteMap.put(cliente4.getId(), cliente4);
         clienteMap.put(cliente5.getId(), cliente5);
         clienteMap.put(cliente6.getId(), cliente6);

         System.out.println("Cliente Map: \n" + clienteMap);

         //busca map
         System.out.println("Cliente Map id: " + clienteMap.get(cliente2.getId()));
     }
}

