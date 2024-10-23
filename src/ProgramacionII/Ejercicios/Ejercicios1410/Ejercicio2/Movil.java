package ProgramacionII.Ejercicios.Ejercicios1410.Ejercicio2;

public class Movil {
    private Pantalla pantalla;
    private Bateria bateria;
    private Procesador procesador;

    public Movil() {
    }

    public Movil(Pantalla pantalla, Bateria bateria, Procesador procesador) {
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.procesador = procesador;
    }

    public void mostrarMovil() {
        System.out.println("-----------------------------");
        System.out.println("\tDetalles del Móvil");
        System.out.println("-----------------------------");
        System.out.println("Pantalla: " + pantalla.getTamanio() + " pulgadas.");
        System.out.println("Batería: " + bateria.getCapacidad() + " mAh.");
        System.out.println("Procesador: " + procesador.getVelocidad() + " GHz.");
    }
}
