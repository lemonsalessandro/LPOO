package model;

public class DesenvolvedorJunior extends Gerente{

    public DesenvolvedorJunior(String nome, double salario){
        super(nome, 1800);
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor Junior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
