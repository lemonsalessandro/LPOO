package model;

public class GerenteDeDesenv extends Gerente{

    public GerenteDeDesenv(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.40;
    }
}
