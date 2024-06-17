package Varios;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        System.out.print("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);

        int y = 5;
        int x = sc.nextInt();

        System.out.println(x >= 5 ? "Es mayor a " + y : "Es menor a " + y);
    }
}
