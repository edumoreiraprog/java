package ProgramacionI.TPPoo;

public class Profesor extends Persona {
    private String materia;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int dni, String materia, int antiguedad) {
        super(nombre, apellido, dni);
        this.materia = materia;
        this.antiguedad = antiguedad;
    }

    @Override
    public void verAtributos() {
        super.verAtributos();
        System.out.println("Materia: " + materia);
        System.out.println("Antigüedad: " + antiguedad);
    }
}
