package ProgramacionII.Ejercicios.Ejercicios1014.Ejercicio3;

public class Restaurante {
    private Menu menu = new Menu();

    public void agregarPlato(Plato newPlato) {
        menu.agregarPlato(newPlato);
    }

    public void mostrarMenu() {
        menu.mostrarMenu();
    }
}
