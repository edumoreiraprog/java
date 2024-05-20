package ejercicios;

import java.util.Scanner;

/*
    Determinar si un alumno aprueba o desaprueba un curso,
    sabiendo que aprueba si su promedio de tres calificaciones es mayor o igual a 60;
    desaprueba en caso contrario.
*/
public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer calificación: ");
        double nota1 = sc.nextDouble();
        System.out.print("Ingrese segunda calificación: ");
        double nota2 = sc.nextDouble();
        System.out.print("Ingrese tercera calificación: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 6) {
            System.out.println("Promedio de " + promedio + " Aprueba el curso.");
        } else {
            System.out.println("Promedio de " + promedio + " Desaprueba el curso");
        }
    }
}
