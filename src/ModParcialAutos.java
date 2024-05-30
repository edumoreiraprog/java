
/*
    El programa debe mostrar un menú de opciones al usuario,
    permitiéndole interactuar con el sistema de venta de vehículos
    realizando diferentes operaciones.

    El menú debe mostrar por consola lo siguiente:

    ================================================
    GESTIÓN DE VENTA DE VEHÍCULOS - MENÚ DE OPCIONES
    ================================================
    1. Agregar vehículo
    2. Buscar vehículo
    3. Eliminar vehículo
    4. Listar vehículos
    5. Ordenar vehículos alfabéticamente
    6. Editar vehículo por índice
    7. Salir
    ==================================

    Por favor, ingrese el número de la opción que desea realizar:
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ModParcialAutos {
    public static void main(String[] args) {

        ArrayList<String> autos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMensaje();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    //Agregar vehículo
                    System.out.println("Ingrese el nombre del nuevo auto: ");
                    String nuevoAuto = sc.nextLine();
                    agregarAuto(autos, nuevoAuto);
                    break;
                case 2:
                    //Buscar vehiculo
                    System.out.println("Ingrese el nombre del auto buscado: ");
                    String autoBuscado = sc.nextLine();
                    buscarAuto(autos, autoBuscado);
                    break;
                case 3:
                    //Eliminar vehiculo
                    System.out.println("Ingrese el nombre del auto a eliminar");
                    String auto = sc.nextLine();
                    eliminarAuto(autos, auto);
                    break;
                case 4:
                    //Listar vehículos
                    System.out.println(listarAutos(autos));
                    break;
                case 5:
                    //Ordenar vehículos alfabéticamente
                    ordenarAutos(autos);
                    break;
                case 6:
                    //Editar vehiculo por indice
                    System.out.println("Ingrese el indice del auto: ");
                    int i = sc.nextInt();
                    System.out.println("Ingrese el nuevo nombre: ");
                    String nombre = sc.nextLine();
                    editarAuto(autos, i, nombre);
                    break;
                case 7:
                    System.out.println("Gracias, vuelva prontos.");
                    //Salir
                    break;
                default: //Informar que se ingreso una opción incorrecta
            }
        } while (opcion != 7);
    }

    public static void mostrarMensaje() {
        System.out.println("================================================");
        System.out.println("GESTIÓN DE VENTA DE VEHÍCULOS - MENÚ DE OPCIONES");
        System.out.println("================================================");
        System.out.println("1. Agregar vehículo");
        System.out.println("2. Buscar vehículo");
        System.out.println("3. Eliminar vehículo");
        System.out.println("4. Listar vehículos");
        System.out.println("5. Ordenar vehículos alfabéticamente");
        System.out.println("6. Editar vehículo por índice");
        System.out.println("7. Salir");
        System.out.println("================================================");
        System.out.println("Por favor, ingrese el número de la opción que desea realizar:");
    }

    public static void agregarAuto(ArrayList<String> listaAutos, String nuevoAuto) {
        listaAutos.add(nuevoAuto);
        System.out.println("El auto se agrego correctamente");
    }

    public static void buscarAuto(ArrayList<String> listaAutos, String auto) {
            int i = listaAutos.indexOf(auto);
            if (i != -1) {
                System.out.println("Auto encontrado en la posición " + i + ".");
            } else {
                System.out.println("Auto no encontrado.");
            }
    }

    public static void eliminarAuto(ArrayList<String> listaAutos, String auto) {
        // listaAutos.remove(auto) devuelve true si encontró y elimino el elemento
        // false caso contrario
        if (listaAutos.remove(auto)) {
            System.out.println("Auto eliminado.");
        } else {
            System.out.println("Auto no encontrado");
        }
    }

    public static String listarAutos(ArrayList<String> listaAutos) {
        String lista = "";
        for (String auto : listaAutos) {
            lista += (listaAutos.indexOf(auto) + 1) + ": " + auto + "\n";
        }

        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Lista de autos:");
        }
        return lista;
    }

    public static void ordenarAutos(ArrayList<String> autos) {
        Collections.sort(autos);
        System.out.println("Lista de autos ordenada alfabéticamente.");
    }

    public static void editarAuto(ArrayList<String> listaAutos, int i, String nombre) {
        if (i >= 0 && i < listaAutos.size()) {
            listaAutos.set(i, nombre);
            System.out.println("Auto editado correctamente.");
        } else {
            System.out.println("Indice no valido");
        }
    }
}