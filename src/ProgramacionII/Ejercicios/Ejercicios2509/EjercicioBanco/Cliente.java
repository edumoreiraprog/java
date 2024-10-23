package ProgramacionII.Ejercicios.Ejercicios2509.EjercicioBanco;

public class Cliente {
    private String nombre;
    private int dni;
    private CuentaBancaria cuenta;

    public Cliente() {
    }

    public Cliente(String nombre, int dni, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
}
