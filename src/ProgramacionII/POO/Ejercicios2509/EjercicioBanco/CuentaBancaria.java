package ProgramacionII.POO.Ejercicios2509.EjercicioBanco;

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

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.out.println("Cantidad no valida.");
        }

    }

    public void retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
