package ProgramacionI.ejercicios;
import java.util.Scanner;

/*
 Calcula el precio de un boleto de viaje,
 tomando en cuenta el número de kilómetros que se van a recorrer,
 siendo el precio $45 por Km.
*/

public class ej01 {
    public static void main(String[] args) {

        final double PRECIOKM = 45;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de kilometros de su viaje: ");
        double distanciaKm = sc.nextDouble();

        System.out.println("El precio del boleto es de: $" + (PRECIOKM * distanciaKm));
    }
}
