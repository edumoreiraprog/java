package ProgramacionII.TPSupermercado;

public class Cliente extends Humane{
    private boolean mayorista;

    public Cliente(String apellido, String nombre, boolean mayorista) {
        super(apellido, nombre);
        this.mayorista = mayorista;
    }

    @Override
    public String toString() {
        return "Cliente: " + super.toString() + "\nMayorista: " + mayorista;
    }
}
