package ProgramacionI.ejercicios;
import java.util.Scanner;

/*
    En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología.
    El presupuesto anual del hospital se reparte de la siguiente manera:
        Urgencias: 37%
        Pediatría: 42%
        Traumatología: 21%
    Obtener la cantidad de dinero que recibirá cada área para cualquier monto presupuestal.
*/

public class ej03 {
    public static void main(String[] args) {
        final double URGENCIAS = 0.37;
        final double PEDIATRIA = 0.42;
        final double TRAUMATOLOGIA = 0.21;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el presupuesto anual: ");
        double presupuesto = sc.nextDouble();

        System.out.println("El presupuesto para las distintas areas se reparte de la siguente manera:");
        System.out.println("\tUrgencias: $" + presupuesto * URGENCIAS);
        System.out.println("\tPediatría: $" + presupuesto * PEDIATRIA);
        System.out.println("\tTraumatología: $" + presupuesto * TRAUMATOLOGIA);
    }
}
