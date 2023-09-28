package model;

public class Passaro extends Animal {

    private double z;

    public Passaro() {
    }

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Passaro(double x, double y) {
        super(x, y);
    }

    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou Passaro");
    }

    @Override
    public String toString() {
        return "Passaro [ x=" + x + ", y=" + y + ", z=" + z + "]";

    }
}
