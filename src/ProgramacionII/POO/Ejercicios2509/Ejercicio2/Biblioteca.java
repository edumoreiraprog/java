package ProgramacionII.POO.Ejercicios2509.Ejercicio2;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregaLibro(Libro nuevoLibro) {
        this.libros.add(nuevoLibro);
    }

    public void mostrarLibros() {
        for (Libro libro : this.libros) {
            System.out.println("\nTitulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año: " + libro.getAnio());
        }
    }
}
