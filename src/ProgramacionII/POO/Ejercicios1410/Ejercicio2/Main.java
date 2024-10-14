package ProgramacionII.POO.Ejercicios1410.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Creamos los componentes
        Pantalla pantalla = new Pantalla(6.7);
        Bateria bateria = new Bateria(5000);
        Procesador procesador = new Procesador(2.84);

        // Creamos un móvil y le asociamos los componentes
        Movil celu = new Movil(pantalla, bateria, procesador);

        // Mostramos la información del móvil
        celu.mostrarMovil();
    }
}
