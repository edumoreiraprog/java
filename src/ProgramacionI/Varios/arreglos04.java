package ProgramacionI.Varios;

import java.util.Scanner;

public class arreglos04 {
    public static void main(String[] args) {
        /*
         Crear un programa que permita elegir al usuario si eliminar los numeros pares o impares de un arreglo
         y que luego muestre el arreglo resultante
        */

        Scanner sc = new Scanner(System.in);
        int[] arreglo1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("El arreglo actual es:");

        // Recorremos y mostramos cada elemento del arreglo
        for (int elemento : arreglo1) {
            System.out.print(elemento + " ");
        }

        System.out.println("\n¿Qué elementos del arreglo desea eliminar? (0:Pares, 1:Impares)");
        int opcion = sc.nextInt();







        // Crear un a funcion que muestre el arreglo resultante











        /*int[] elementos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner sc = new Scanner(System.in);

        System.out.println("Arreglo actual");

        for (int elemento : elementos) {
            System.out.print(elemento + " ");
        }

        System.out.println("Desea eliminar (Pares: 0, Impares: 1)");
        int decision = sc.nextInt();

        if (decision == 0) {

            // Crear una funcion que elimine los pares

        } else if (decision == 1) {

            // Crear una funcion que elimine los impares

        } else System.out.println("Valor no valido");*/
    }
}
