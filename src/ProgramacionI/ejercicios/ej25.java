package ProgramacionI.ejercicios;
import java.util.Scanner;

/*
    Un programa que permita al usuario ingresar un número entre el 1 y el 9
    y nos muestre la tabla de dicho número hasta su multiplicación por 9.
    La salida debería ser en caso de que el usuario ingrese el número 2:
    2x1=2
    2x2=4
    -----
    2x9=18
*/

public class ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int  num = sc.nextInt();

        for (int i=1; i<10; i++) {
            System.out.println(num + "x" + i + "=" + num*i);
        }
    }
}
