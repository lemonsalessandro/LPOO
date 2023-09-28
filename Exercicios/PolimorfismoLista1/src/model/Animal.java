package model;

public abstract class Animal {

    protected double x;
    protected double y;

    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Animal() {
    }

    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar();

}
