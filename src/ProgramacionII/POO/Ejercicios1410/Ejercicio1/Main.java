package ProgramacionII.POO.Ejercicios1410.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Creamos un edificio
        Edificio edificio1 = new Edificio();

        // Le agregamos varios pisos
        edificio1.agregarPiso(new Piso(1, 5));
        edificio1.agregarPiso(new Piso(2, 5));
        edificio1.agregarPiso(new Piso(3, 3));
        edificio1.agregarPiso(new Piso(4, 1));

        // Mostramos los detalles del edificio
        edificio1.mostrarEdificio();
    }
}
