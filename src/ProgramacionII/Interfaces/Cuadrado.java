package ProgramacionII.Interfaces;

public class Cuadrado implements Figura, Dibujable {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un cuadrado.");
    }
}
