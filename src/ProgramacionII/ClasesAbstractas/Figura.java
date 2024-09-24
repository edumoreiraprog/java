package ProgramacionII.ClasesAbstractas;

public abstract class Figura {
    protected double x;
    protected double y;

    protected Figura() {
    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();
}
