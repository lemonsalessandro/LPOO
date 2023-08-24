package model;

public class Marca {
    private String descricao;
    private Long id;

    public Marca() {
    }

    public Marca(String descricao, Long id) {
        this.descricao = descricao;
        this.id = id;
    }

    //GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Marca{" +
                "descricao='" + descricao + '\'' +
                ", id=" + id +
                '}' + "\n";
    }
}
