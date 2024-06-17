package Varios;// "psvm" : Abreviatura del método "public static void main(String[] args) {}"

import java.util.Scanner;

/*Calcula el precio de un boleto de viaje, tomando en cuenta el número de kilómetros
que se van a recorrer, siendo el precio $45 por Km.*/
public class precioBoleto {
    public static void main(String[] args) {

        final float precioKm = 45.50f;
        boolean opcion = true;
        int continuar;
        float distancia;
        float total;
        Scanner sc = new Scanner(System.in);

        while (opcion) {

            System.out.print("Ingrese la distancia en kilometros que corresponde a su viaje: ");
            distancia = sc.nextFloat();

            total = distancia * precioKm;

            System.out.println("El precio de su boleto es de: $" + total);

            System.out.println("Desea calcular el precio de otro boleto? (Si: 1, No:2)");
            continuar = sc.nextInt();

            opcion = continuar == 1;
        }

    }
}
