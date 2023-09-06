package model;

public class Caminhao extends Veiculo implements Automovel{

    private int capacidadeDeCarga;
    private String renavam;
    private String chassi;
    private String placa;

    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
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
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                "} " + super.toString();
    }
}
