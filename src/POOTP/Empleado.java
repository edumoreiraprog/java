package POOTP;

public class Empleado extends Persona{
    private double sueldo;
    private String puesto;

    public Empleado(String nombre, String apellido, int dni, double sueldo, String puesto) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    @Override
    public void verAtributos() {
        super.verAtributos();
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Puesto: " + puesto);
    }


}
