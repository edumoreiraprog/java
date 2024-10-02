package ProgramacionII.POO.Ejercicios2509.Ejercicio3;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int nroLegajo;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(String nombre, int nroLegajo) {
        this.nombre = nombre;
        this.nroLegajo = nroLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public void inscribirACurso(Curso nuevoCurso) {
        this.cursos.add(nuevoCurso);
    }

    public void mostrarCursos() {
        System.out.println("Cursos actuales: ");
        for (Curso curso: this.cursos) {
            System.out.println("\t" + curso.getNombre());
        }
    }
}
