package ProgramacionII.Ejercicios.Ejercicios1410.Ejercicio3;

import java.util.ArrayList;

public class Menu {
    ArrayList<Plato> platos = new ArrayList<>();

    public void agregarPlato(Plato newPlato) {
        platos.add(newPlato);
    }

    public void mostrarMenu() {
        System.out.println("---------------------------------------------");
        System.out.println("                     Menú                    ");
        System.out.println("---------------------------------------------");
        System.out.println("\tPlato\t\t\t\t\t\t\t Precio");
        System.out.println("---------------------------------------------");


        for (Plato plato : this.platos) {
            System.out.println(plato.getNombre() + " \t $" + plato.getPrecio());
        }
    }
}
