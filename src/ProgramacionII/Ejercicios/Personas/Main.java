package ProgramacionII.Ejercicios.Personas;

public class Main {
    public static void main(String[] args) {
        Directorio personas = new Directorio();

        personas.agregar(new Persona(01010101, "Tito Mena", 123456));
        personas.agregar(new Persona(76654564, "Tito Men", 657676));

        personas.listar();
    }
}
