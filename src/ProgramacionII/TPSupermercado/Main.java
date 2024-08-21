package ProgramacionII.TPSupermercado;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Producto> carrito = new ArrayList<>();
        ArrayList<Caja> cajas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op;

        cargarProductos(productos);
        agregarCajas(cajas);

        do {
            mostrarMensaje();
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    // Ver productos disponibles
                    mostrarProductos(productos);
                    System.out.print("\nPresione cualquier tecla para continuar...");
                    sc.nextLine();
                    break;
                case 2:
                    //Agregar producto al carrito
                    System.out.print("Ingrese el nombre del producto: ");
                    String nProducto = sc.nextLine();
                    agregarProducto(productos, carrito, nProducto);
                    System.out.print("Presione cualquier tecla para continuar...");
                    sc.nextLine();
                    break;
                case 3:
                    //Eliminar producto del carrito
                    System.out.print("Ingrese el nombre del producto: ");
                    String eProducto = sc.nextLine();
                    eliminarProducto(carrito, eProducto);
                    System.out.print("Presione cualquier tecla para continuar...");
                    sc.nextLine();
                    break;
                case 4:
                    //Ver carrito
                    mostrarCarrito(carrito);
                    System.out.print("\nPresione cualquier tecla para continuar...");
                    sc.nextLine();
                    break;
                case 5:
                    //Ir a pagar
                    boolean mayorista = false;
                    mostrarCaja(cajas);
                    System.out.println("¿Es cliente mayorista? (1: Si, 2: No)");

                    if ( sc.nextInt() == 1) mayorista = true;

                    System.out.println("El cliente es mayorista?" + mayorista);
                    sc.nextLine();
                    break;
                case 6:
                    //Salir
                    System.out.println("Gracias, vuelva prontos.");
                    break;
                default: //Informar que se ingreso una opción incorrecta
                    System.out.println("¡¡¡Opción ingresada incorrecta!!!");
                    System.out.print("Presione cualquier tecla para continuar...");
                    sc.nextLine();
            }
        } while (op != 6);
    }

    public static void mostrarMensaje() {
        System.out.println("\n");
        System.out.println("================================================");
        System.out.println("                   TUPMarket                    ");
        System.out.println("================================================");
        System.out.println("\t1. Ver Productos");
        System.out.println("\t2. Agregar Producto al carrito");
        System.out.println("\t3. Eliminar producto del carrito");
        System.out.println("\t4. Ver mi carrito");
        System.out.println("\t5. Ir a pagar");
        System.out.println("\t6. Salir");
        System.out.println("================================================");
        System.out.print("\nIngrese el número de la opción que desea realizar: ");
    }

    public static void cargarProductos(ArrayList<Producto> productos) {
        productos.add(new Producto("Leche", 1500));
        productos.add(new Producto("Pan", 1350));
        productos.add(new Producto("Arroz", 2200));
        productos.add(new Producto("Huevos", 1200));
        productos.add(new Producto("Azúcar", 1000));
        productos.add(new Producto("Yerba", 3500));
        productos.add(new Producto("Queso", 1900));
        productos.add(new Producto("Gaseosa", 2300));
        productos.add(new Producto("Vino", 3200));
        productos.add(new Producto("Cerveza", 3500));
    }

    public static void mostrarProductos(ArrayList<Producto> productos) {
        System.out.println("\n");
        System.out.println("================================================");
        System.out.println("\t\t\tProductos");
        System.out.println("================================================");
        System.out.println("\n\tProducto\t\t\tPrecio");
        System.out.println("------------------------------------------------");
        for (Producto producto : productos){
            System.out.println("\t" + producto);
        }
    }

    public static void agregarProducto(ArrayList<Producto> productos, ArrayList<Producto> carrito, String nProducto) {
        boolean existe = false;

        for (Producto producto : productos) {
            if (Objects.equals(producto.getNombre(), nProducto)) {
                existe = true;
                carrito.add(producto);
                break;
            }
        }
        System.out.println("================================================");
        System.out.println(existe ? "\t\t***** Producto agregado *****" : "\t\t***** Producto no encontrado *****");
        System.out.println("================================================");
    }

    public static void eliminarProducto(ArrayList<Producto> carrito, String prodEliminar) {
        boolean existe = false;

        for (Producto producto : carrito) {
            if (Objects.equals(producto.getNombre(), prodEliminar)) {
                existe = true;
                carrito.remove(producto);
            }
        }

        System.out.println("================================================");
        System.out.println(existe ? "\t\t***** Producto eliminado *****" : "\t\t***** Producto no encontrado *****");
        System.out.println("================================================");
    }

    public static void mostrarCarrito(ArrayList<Producto> carrito) {
        System.out.println("\n");
        System.out.println("================================================");
        System.out.println("                    Carrito                     ");
        System.out.println("================================================");
        System.out.println("\n\tProducto\t\t\tPrecio");
        System.out.println("------------------------------------------------");
        for (Producto producto : carrito){
            System.out.println("\t" + producto);
        }

    }

    public static void agregarCajas(ArrayList<Caja> cajas) {
        cajas.add(new Caja(new Empleado("Ana", "López", 50000), 1));
        cajas.add(new Caja(new Empleado("Laura", "Martínez", 47800), 2));
        cajas.add(new Caja(new Empleado("Pedro", "Gómez", 49500), 3));
    }

    public static void mostrarCaja(ArrayList<Caja> cajas) {
        // Genera un número aleatorio entre 0 y 2
        int numCaja = numAleatorio(3);
        numCaja++;

        for (Caja caja: cajas) {
            if (caja.getNroCaja() == numCaja) {
                System.out.println("\n");
                System.out.println("================================================");
                System.out.println("\t\t\tFinalizando la compra");
                System.out.println("================================================");
                System.out.println("\t" + caja);
                break;
            }
        }
    }

    public static int numAleatorio(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }
}

