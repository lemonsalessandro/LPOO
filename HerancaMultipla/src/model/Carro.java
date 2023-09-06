package model;

public class Carro extends Veiculo implements Automovel{

    private int capacidadePortaMalas;
    private String renavam;
    private String chassi;
    private String placa;

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String getRenavam() {
        return renavam;
    }

    @Override
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    @Override
    public String getChassi() {
        return chassi;
    }

    @Override
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa= placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "capacidadePortaMalas=" + capacidadePortaMalas +
                "} " + super.toString();
    }

}
