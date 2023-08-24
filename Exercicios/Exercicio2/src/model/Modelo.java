package model;

public class Modelo {
    private String descricao;
    private String id;

    public Modelo() {
    }

    public Modelo(String descricao, String id) {
        this.descricao = descricao;
        this.id = id;
    }

    //GETTERS E SETTERS
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Modelo{" +
                "descricao='" + descricao + '\'' +
                ", id='" + id + '\'' +
                '}' + "\n";
    }
}
