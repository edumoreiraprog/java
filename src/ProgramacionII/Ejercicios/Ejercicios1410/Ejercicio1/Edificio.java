package ProgramacionII.Ejercicios.Ejercicios1410.Ejercicio1;

import java.util.ArrayList;

public class Edificio {
    private ArrayList<Piso> pisos = new ArrayList<>();

    public void agregarPiso(Piso newPiso) {
        pisos.add(newPiso);
    }

    public void mostrarEdificio() {
        System.out.println("----------------------------------");
        System.out.println("  N° Piso \t N° Departamentos");
        System.out.println("----------------------------------");

        for (Piso piso : this.pisos) {
            System.out.print("\t" + piso.getNumPiso());
            System.out.println("\t\t\t\t" + piso.getCantDepartamentos());
        }
    }
}
