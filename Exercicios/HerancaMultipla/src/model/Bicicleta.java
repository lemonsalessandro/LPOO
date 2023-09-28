package model;

public class Bicicleta extends Veiculo{

   private int tamanhoRoda;
   private String chassi;

    public Bicicleta(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int tamanhoRoda, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }




    @Override
    public String toString() {
        return "Bicicleta{" +
                "tamanhoRoda=" + tamanhoRoda +
                ", chassi='" + chassi + '\'' +
                "} " + super.toString();
    }
}
