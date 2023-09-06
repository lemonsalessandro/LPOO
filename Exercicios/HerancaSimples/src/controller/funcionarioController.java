package controller;

import model.*;

public class funcionarioController {
    public static void main(String[] args) {

        GerenteGeral gerentegeral = new GerenteGeral("gerentegeral", 6500);
        GerenteDeDesenv gerentedesenv = new GerenteDeDesenv("gerentedesenv", 4.500);

        DesenvolvedorJunior devjunior1 = new DesenvolvedorJunior("devjunior1", 1800);
        DesenvolvedorJunior devjunior2 = new DesenvolvedorJunior("devjunior2", 1800);
        DesenvolvedorJunior devjunior3 = new DesenvolvedorJunior("devjunior3", 1800);
        DesenvolvedorJunior devjunior4 = new DesenvolvedorJunior("devjunior4", 1800);
        DesenvolvedorJunior devjunior5 = new DesenvolvedorJunior("devjunior5", 1800);
        DesenvolvedorJunior devjunior6 = new DesenvolvedorJunior("devjunior6", 1800);

        DesenvolvedorPleno devpleno1 = new DesenvolvedorPleno("devpleno1", 2500);
        DesenvolvedorPleno devpleno2 = new DesenvolvedorPleno("devpleno2", 2500);
        DesenvolvedorPleno devpleno3 = new DesenvolvedorPleno("devpleno3", 2500);
        DesenvolvedorPleno devpleno4 = new DesenvolvedorPleno("devpleno4", 2500);
        DesenvolvedorPleno devpleno5 = new DesenvolvedorPleno("devpleno5", 2500);
        DesenvolvedorPleno devpleno6 = new DesenvolvedorPleno("devpleno6", 2500);

        DesenvolvedorSenior devsenior1 = new DesenvolvedorSenior("devsenior1", 3500);
        DesenvolvedorSenior devsenior2 = new DesenvolvedorSenior("devsenior2", 3500);
        DesenvolvedorSenior devsenior3 = new DesenvolvedorSenior("devsenior3", 3500);
        DesenvolvedorSenior devsenior4 = new DesenvolvedorSenior("devsenior4", 3500);
        DesenvolvedorSenior devsenior5 = new DesenvolvedorSenior("devsenior5", 3500);
        DesenvolvedorSenior devsenior6 = new DesenvolvedorSenior("devsenior6", 3500);

        System.out.println("VALOR SEM BONUS");

        System.out.println(devjunior1);
        System.out.println(devjunior2);
        System.out.println(devjunior3);
        System.out.println(devjunior4);
        System.out.println(devjunior5);
        System.out.println(devjunior6);
        
    }

}
