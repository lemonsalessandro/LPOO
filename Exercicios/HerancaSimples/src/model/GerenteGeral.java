package model;

public class GerenteGeral extends Gerente{

    public GerenteGeral (String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.40;
    }
}
