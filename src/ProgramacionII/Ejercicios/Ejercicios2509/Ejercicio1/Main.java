package ProgramacionII.Ejercicios.Ejercicios2509.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1;
        Cliente cliente1;

        cuenta1 = new CuentaBancaria(12345, 0);
        cliente1 = new Cliente("Carlos Pérez", 24986345, cuenta1);

        // Mostramos el saldo
        System.out.println(cliente1.getCuenta().getSaldo());
        // Depositamos un monto
        cliente1.getCuenta().depositar(-150000);
        // Mostramos el saldo
        System.out.println(cliente1.getCuenta().getSaldo());
        // Retiramos una cantidad
        cliente1.getCuenta().retirar(120000);
        // Mostramos el saldo de nuevo
        System.out.println(cliente1.getCuenta().getSaldo());

        // Si el monto a retirar es mayor que nuestro saldo actual, no se hará nada.
        // Lo mismo sucede si intento depositar un valor menor o igual que cero.
    }
}
