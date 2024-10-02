package ProgramacionII.POO.Ejercicios2509.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        // Creamos la biblioteca
        Biblioteca biblioteca1 = new Biblioteca();

        // Creamos algunos libros
        Libro libro1 = new Libro("Fahrenheit 451", "Ray Bradbury", 1953);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        Libro libro3 = new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", 1981);
        Libro libro4 = new Libro("El alquimista", "Paulo Coelho", 1988);

        // Los agregamos a la lista
        biblioteca1.agregaLibro(libro1);
        biblioteca1.agregaLibro(libro2);
        biblioteca1.agregaLibro(libro3);
        biblioteca1.agregaLibro(libro4);

        // Mostramos la lista
        biblioteca1.mostrarLibros();
    }
}
