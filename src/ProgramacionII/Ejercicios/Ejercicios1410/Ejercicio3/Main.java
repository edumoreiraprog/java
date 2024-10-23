package ProgramacionII.Ejercicios.Ejercicios1410.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Creamos un restaurante
        Restaurante restaurante1 = new Restaurante();

        // Creamos platos
        Plato p1 = new Plato("Milanesa napolitana con puré     ", 16500);
        Plato p2 = new Plato("Empanadas salteñas (2 unidades)  ", 4500);
        Plato p3 = new Plato("Ñoquis con salsa bolognesa       ", 12000);
        Plato p4 = new Plato("Lomo a la parrilla con guarnición", 22000);
        Plato p5 = new Plato("Bife de chorizo con papas fritas ", 20000);

        // Los agregamos al menu del restaurante
        restaurante1.agregarPlato(p1);
        restaurante1.agregarPlato(p2);
        restaurante1.agregarPlato(p3);
        restaurante1.agregarPlato(p4);
        restaurante1.agregarPlato(p5);

        // Mostramos el menu
        restaurante1.mostrarMenu();
    }
}
