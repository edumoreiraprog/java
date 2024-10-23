package ProgramacionII.Ejercicios.Ejercicios2509.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        // Creamos algunos cursos
        Curso cMat = new Curso("Matemáticas");
        Curso cIng = new Curso("Ingles");
        Curso cProg = new Curso("Programación 2");
        Curso cBbDd = new Curso("Base de Datos 1");

        // Creamos algunos estudiantes
        Estudiante estudiante1 = new Estudiante("Carlos Pérez", 12345);
        Estudiante estudiante2 = new Estudiante("Amanda Gonzalez", 10101);

        // Inscribimos al estudiante 1
        estudiante1.inscribirACurso(cIng);
        cIng.agregarEstudiante(estudiante1);

        estudiante1.inscribirACurso(cProg);
        cProg.agregarEstudiante(estudiante1);

        estudiante1.inscribirACurso(cBbDd);
        cBbDd.agregarEstudiante(estudiante1);

        // Inscribimos al estudiante 2
        estudiante2.inscribirACurso(cBbDd);
        cBbDd.agregarEstudiante(estudiante2);

        estudiante2.inscribirACurso(cProg);
        cProg.agregarEstudiante(estudiante2);

        estudiante2.inscribirACurso(cMat);
        cMat.agregarEstudiante(estudiante2);

        // Cursos del estudiante 1
        System.out.println("\nEstudiante: " + estudiante1.getNombre());
        estudiante1.mostrarCursos();

        // Cursos del estudiante 2
        System.out.println("\nEstudiante: " + estudiante2.getNombre());
        estudiante2.mostrarCursos();

        // Estudiantes de Programación 2
        cProg.mostrarEstudiantes();

        // Estudiantes de Base de Datos 1
        cBbDd.mostrarEstudiantes();
    }
}
