import java.util.Scanner;

public class arreglos03 {
    public static void main(String[] args) {
        // Crear un programa que permita cargar manualmente un arreglo
        // y que lo recorra para mostrar los numeros pares.

        int[] elementos = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = sc.nextInt();
        }

        System.out.println("Los numeros pares son: ");
        for (int elemento : elementos) {
            if (elemento % 2 == 0) {
                System.out.println(elemento);
            }
        }
    }
}
