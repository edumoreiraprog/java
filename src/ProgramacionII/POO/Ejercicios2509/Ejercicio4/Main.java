package ProgramacionII.POO.Ejercicios2509.Ejercicio4;

public class Main {
    public static void main(String[] args) {

        // Instanciamos un coche
        Coche coche1 = new Coche("Ford", "Mustang", "María López");

        // Instanciamos una motocicleta
        Motocicleta moto1 = new Motocicleta("Harley-Davidson", "Iron 883", "Pedro Ramírez");

        System.out.println(coche1.infoVehiculo());
        System.out.println(moto1.infoVehiculo());
    }
}
