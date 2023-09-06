package model;

public class DesenvolvedorPleno extends Gerente{

    public DesenvolvedorPleno(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        double salario = getSalario();
        return salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor Pleno{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
