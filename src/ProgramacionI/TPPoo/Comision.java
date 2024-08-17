package ProgramacionI.TPPoo;

import java.util.ArrayList;

public class Comision {
    //private Profesor Profe = new Profesor("Facundo", "Uferer", 10101010, "Programacion I", 5);
    private Profesor profe;
    private ArrayList<Estudiante> estudiantes;

    public Comision(Profesor profe, ArrayList<Estudiante> estudiantes) {
        this.profe = profe;
        this.estudiantes = estudiantes;
    }

    public void listarComision() {
        profe.verAtributos();
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.verAtributos();
        }
    }

    public void insertarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void modificarEstudiante(int index, Estudiante nuevoEstudiante) {
        if (index >= 0 && index < estudiantes.size()) {
            estudiantes.set(index, nuevoEstudiante);
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }
}
