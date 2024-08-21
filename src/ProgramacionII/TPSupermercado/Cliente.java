package ProgramacionII.TPSupermercado;

public class Cliente extends Humane{
    private int tipo;

    public Cliente(String apellido, String nombre, int tipo) {
        super(apellido, nombre);
        this.tipo = tipo;
    }

}
