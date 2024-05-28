import java.util.ArrayList;
import java.util.Scanner;

/*
    El programa debe mostrar un menú de opciones al usuario,
    permitiéndole interactuar con el sistema de venta de vehículos realizando diferentes operaciones.

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

public class ModeloParcial2 {
    public static void main(String[] args) {
        ArrayList<String> autos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del auto: ");
                    String auto = sc.next();
                    agregarAuto(autos, auto);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    listarAutos(autos);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
            }
        } while (opcion != 7);

    }

    public static void mostrarMenu() {
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
        System.out.print("Por favor, ingrese el número de la opción que desea realizar:");
    }

    public static void agregarAuto(ArrayList<String> autos, String auto) {
        autos.add(auto);
        System.out.println("El auto se agrego correctamente.");
    }

    public static void listarAutos(ArrayList<String> autos) {
        System.out.println("Lista de vehiculos acual:");
        System.out.println(autos);
    }
}
