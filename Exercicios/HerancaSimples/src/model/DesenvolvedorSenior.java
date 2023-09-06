package model;

public class DesenvolvedorSenior extends Gerente{

    public DesenvolvedorSenior(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.10;
    }

    @Override
    public String toString() {
        return "Desenvolvedor Senior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
