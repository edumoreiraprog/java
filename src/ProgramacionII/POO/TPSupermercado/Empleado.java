package ProgramacionII.POO.TPSupermercado;

public class Empleado extends Humane {
    private double sueldo;

    public Empleado(String apellido, String nombre, double sueldo) {
        super(apellido, nombre);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado: "+ super.toString() + "\nSueldo: " + sueldo;
    }
}
