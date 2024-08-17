package ProgramacionI.Varios;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantida de elementos del vector:");
        int cant = sc.nextInt();
        int[] numeros = new int[cant];

        cargarArreglo(numeros, sc);
        mostrarArreglo(numeros);
    }

    public static void cargarArreglo(int[] arreglo, Scanner sc) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese valor para la posicion " + i + ":");
            arreglo[i] = sc.nextInt();
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        System.out.println("Vector de " + arreglo.length + " elementos:");
        for (int elem : arreglo) {
            System.out.print("\t" + elem);
        }
    }
}
