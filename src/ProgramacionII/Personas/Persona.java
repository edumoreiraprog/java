package ProgramacionII.Personas;

public class Persona {
    private int dni;
    private String nombre;
    private int tel;
    

    public Persona(int dni, String nombre, int tel) {
        this.dni = dni;
        this.nombre = nombre;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Tel: " + tel;
    }
}
