package ProgramacionII.Ejercicios.TPSupermercado;

public class Caja {
    private Empleado empleado;
    private int NroCaja;

    public Caja(Empleado empleado, int NroCaja) {
        this.empleado = empleado;
        this.NroCaja = NroCaja;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public int getNroCaja() {
        return NroCaja;
    }

    public String toString() {
        return "\nCaja N°: " + NroCaja + "\n" + empleado.toString();
    }
}
