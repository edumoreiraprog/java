package ProgramacionII.POO.Ejercicios2509.EjercicioBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        int option;

        System.out.println("==============================");
        System.out.println("=======  Banco de Oro  =======");
        System.out.println("==============================");

        do {
            menuInicio();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    //ingreso();
                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Gracias, vuelva prontos.");
                    break;
                default:
                    System.out.println("Opcion ingresada no valida");
            }
        } while (option != 4);
    }

    public static void menuInicio() {
        System.out.println("==============================");
        System.out.println("=======  Banco de Oro  =======");
        System.out.println("==============================");
        System.out.println("1. Ingresar");
        System.out.println("2. Crear cuenta");
        System.out.println("3. Salir");
        System.out.println("Ingrese el número de la opción que desea realizar:");
        System.out.println("==============================");
    }

    public static void menuGeneral() {
        System.out.println("==============================");
        System.out.println("=======  Banco de Oro  =======");
        System.out.println("=====  Menu de opciones  =====");
        System.out.println("==============================");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Salir");
        System.out.println("==============================");
        System.out.println("Ingrese el número de la opción que desea realizar:");
    }

    public static void ingreso(ArrayList<CuentaBancaria> cuentas, Scanner sc) {
        System.out.print("Ingrese su DNI:");
        int dni = sc.nextInt();
        for (CuentaBancaria cuenta: cuentas) {
            //if (cuenta.getNroCuenta() == )
        }
    }

}
