package ProgramacionII.TAD.ListasEnlazadasSimples;

public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        lista.imprimir();
        lista.agregar(12);
        lista.imprimir();
        lista.agregar(23);
        lista.agregar(34);
        lista.agregar(18);
        lista.agregar(54);
        lista.imprimir();
        lista.eliminarUltimo();
        lista.imprimir();
    }
}
