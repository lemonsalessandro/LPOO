package model;

import java.sql.Date;
import java.sql.Time;

public class Locacao {
    private Long id;
    private String dataLocacao;
    private String horaLocacao;
    private String dataDevolucao;
    private String horaDevolucao;
    private int quilometragem;
    private double valorCalcao;
    private double valor_locacao;
    private boolean devolvido;

    public Locacao() {
    }

    public Locacao(Long id, String dataLocacao, String horaLocacao, String dataDevolucao, String horaDevolucao, int quilometragem, double valorCalcao, double valor_locacao, boolean devolvido) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    //GETTERS E SETTERS


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(String horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(String horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }


    //TO STRING

    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", dataLocacao='" + dataLocacao + '\'' +
                ", horaLocacao='" + horaLocacao + '\'' +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                ", horaDevolucao='" + horaDevolucao + '\'' +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valor_locacao=" + valor_locacao +
                ", devolvido=" + devolvido +
                '}' + "\n";
    }
}
