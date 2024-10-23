package ProgramacionII.POO.Ejercicios2110.ListasEnlazadas;

public class ListaSimple {
    private Nodo primero;
    private int tamanio;

    public ListaSimple() {
        this.primero = null;
        this.tamanio = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
        } else {
            // se tiene que recorrer la lista hasta llegar al último nodo
            Nodo aux = this.primero;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        this.tamanio++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al último nodo
            Nodo aux = primero;
            Nodo nodoAnterior = aux;

            while (aux.getSiguiente() != null) {
                nodoAnterior = aux;
                aux = aux.getSiguiente();
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.
            if (aux == this.primero) {
                this.primero = null;
            } else {
                // Le indico al nodo anterior que no apunte más al nodo a eliminar "aux".
                nodoAnterior.setSiguiente(null);
            }

            // Decremento el tamaño
            this.tamanio--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.print("Lista vacia");
        } else {
            Nodo aux = this.primero;
            System.out.println("");
            for(int i = 0; i < this.tamanio; i++) {
                System.out.print(aux.getDato() + " ");
                aux = aux.getSiguiente();
            }
        }
    }

}
