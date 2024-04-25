import java.util.Scanner;

public class arreglos02 {
    public static void main(String[] args) {
        // Crear un programa que permita cargar manualmente un arreglo
        // y que lo recorra para mostrar su contenido.

        // Declaramos el arreglo
        int[] arreglo = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los valores del arreglo: ");

        for (int i = 0; i < arreglo.length; i ++) {
            arreglo[i] = sc.nextInt();
        }

        int pos = 0;

        for (int elemento: arreglo) {
            System.out.println("Posicion " + pos + " = " + elemento);
            pos++;
        }
    }
}
