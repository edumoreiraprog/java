package ejercicios;
import java.util.Scanner;

/*
    Determinar la cantidad de dinero que recibirá un trabajador
    por concepto de las horas extras trabajadas en una empresa.

    - Se consideran horas extras a las horas de trabajo exceden de 40
    - Las horas extra se pagan al doble de una hora normal cuando no exceden de 8
    - si exceden de 8 se pagan las primeras 8 al doble de las horas normales
    y el resto al triple.
*/

public class ej18 {
    public static void main(String[] args) {

        final double precioHora = 20;
        double hNormal;
        double hExtra;
        double totalNormal;
        double totalExtra;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        double horas = sc.nextDouble();

        if (horas <= 40) {
            hNormal = horas;
            hExtra = 0;
            totalNormal = horas * precioHora;
            totalExtra = 0;
        } else if (horas > 40 && horas <= 48) {
            hNormal = 40;
            hExtra = horas - hNormal;
            totalNormal = hNormal * precioHora;
            totalExtra = hExtra * (precioHora * 2);
        } else {
            hNormal = 40;
            hExtra = horas - hNormal;
            totalNormal = hNormal * precioHora;
            totalExtra = (8 * (precioHora * 2)) + ((hExtra - 8) * (precioHora * 3));
        }

        System.out.println("Horas normales trabajadas: " + hNormal + " = $" + totalNormal);
        System.out.println("Horas extra trabajadas: " + hExtra + " = $" + totalExtra);
        System.out.println("Total (horas normales + horas extra): $" + (totalNormal + totalExtra));
    }
}
