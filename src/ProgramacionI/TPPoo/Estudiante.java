package ProgramacionI.TPPoo;

public class Estudiante extends Persona {
    private int matricula;
    private String carrera;

    public Estudiante(String nombre, String apellido, int dni, int matricula, String carrera) {
        super(nombre, apellido, dni);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    @Override
    public void verAtributos() {
        super.verAtributos();
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
    }
}
