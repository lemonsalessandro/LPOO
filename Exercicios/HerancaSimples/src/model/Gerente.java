package model;

public class Gerente extends Funcionario{

    public Gerente (String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.20;
    }
}
