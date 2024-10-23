package ProgramacionII.Ejercicios.Ejercicios2509.Ejercicio3;

import java.util.ArrayList;

public class Curso {
    private String Nombre;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Curso() {
    }

    public Curso(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void agregarEstudiante(Estudiante nuevoEstudiante) {
        this.estudiantes.add(nuevoEstudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("\nCursantes de " + this.Nombre + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("\t" + estudiante.getNombre());
        }
    }
}
