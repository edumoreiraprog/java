package ProgramacionII.POO.Ejercicios2509.Ejercicio4;

public class Coche extends Vehiculo {
    private String conductor;

    public Coche() {
    }

    public Coche(String marca, String modelo, String conductor) {
        super(marca, modelo);
        this.conductor = conductor;
    }

    @Override
    public String infoVehiculo() {
        return super.infoVehiculo() + ", Conductor: " + conductor;
    }
}