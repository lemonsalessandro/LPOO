package model;

public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }



    @Override
    public void desenhar() {
        System.out.println("Desenhou cachorro");
    }

    @Override
    public String toString() {
        return "Cachorros{" +
                "x=" + x +
                ", y=" + y +
                "} ";
    }
}
