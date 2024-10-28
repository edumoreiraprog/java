package ProgramacionII.TAD.ListasEnlazadasDobles;

public class Nodo {
    // Atributos
    private int dato;
    private Nodo anterior;
    private Nodo siguiente;

    // Constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

    // Propiedades
    public int getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    // Métodos
}