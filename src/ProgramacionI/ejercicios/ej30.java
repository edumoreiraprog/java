package ProgramacionI.ejercicios;
import java.util.Scanner;

// Dado un número ingresado por el usuario determinar si es primo o no.

public class ej30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contDiv;
        int op = 1;

        while (op == 1) {
            contDiv = 0;
            System.out.print("Ingrese un numero natural: ");
            int num = sc.nextInt();

            if (num <= 1) {
                System.out.println("No es primo.");
            } else {
                for (int i=1; i<num; i++) {
                    if ((num % i) == 0) {
                        contDiv++;
                    }
                }
            }

            if (contDiv > 2) System.out.println("No es primo.");
            else System.out.println("Es primo");

            System.out.print("Desea consultar otro numero? ");
            op = sc.nextInt();
        }

        System.out.println("Gracias, vuelva prontos!");

    }

}
