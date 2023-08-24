package model;

public class Automovel {
    private Long id;
    private String renavam;
    private String placa;
    private String cor;
    private int num_rodas;
    private String combustivel;
    private int quilometragem;
    private String chassi;
    private double valor_alocacao;

    public Automovel() {
    }

    public Automovel(Long id, String renavam, String placa, String cor, int num_rodas, String combustivel, int quilometragem, String chassi, double valor_alocacao) {
        this.id = id;
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
        this.num_rodas = num_rodas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.valor_alocacao = valor_alocacao;
    }

    //GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long renavam) {
        this.id = id;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNum_rodas() {
        return num_rodas;
    }

    public void setNum_rodas(int num_rodas) {
        this.num_rodas = num_rodas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getValor_alocacao() {
        return valor_alocacao;
    }

    public void setValor_alocacao(double valor_alocacao) {
        this.valor_alocacao = valor_alocacao;
    }


    //TO STRING
    @Override
    public String toString() {
        return "Automovel{" +
                "id ='" + id + '\'' +
                "renavam='" + renavam + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", num_rodas=" + num_rodas +
                ", combustivel='" + combustivel + '\'' +
                ", quilometragem=" + quilometragem +
                ", chassi='" + chassi + '\'' +
                ", valor_alocacao=" + valor_alocacao +
                '}'
                + "\n";
    }
}
