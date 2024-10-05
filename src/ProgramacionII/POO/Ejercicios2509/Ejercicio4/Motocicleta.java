package ProgramacionII.POO.Ejercicios2509.Ejercicio4;

public class Motocicleta extends Vehiculo {
    private String pasajero;

    public Motocicleta() {
    }

    public Motocicleta(String marca, String modelo, String pasajero) {
        super(marca, modelo);
        this.pasajero = pasajero;
    }

    @Override
    public String infoVehiculo() {
        return super.infoVehiculo() + ", Pasajero: " + pasajero;
    }
}
