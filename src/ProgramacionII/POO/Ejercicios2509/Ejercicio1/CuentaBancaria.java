package ProgramacionII.POO.Ejercicios2509.Ejercicio1;

public class CuentaBancaria {
    private int nroCuenta;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int nroCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    /*  Los métodos depositar y retirar devuelven valores booleanos
        por si en algún momento queremos agregar alguna salida
        dependiendo del éxito o no del depósito/extracción
    */
}
