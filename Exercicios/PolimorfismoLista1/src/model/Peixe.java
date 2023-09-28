package model;

public class Peixe extends Animal {

    private double z = 0;

    public Peixe(){
        super();
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Peixe(double x, double y) {
        super(x, y);
    }

    public void mover(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou peixe");
    }


    @Override
    public String toString() {
        return "Peixe [ x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
