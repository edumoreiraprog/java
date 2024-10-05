package ProgramacionII.POO.Ejercicios2509.Ejercicio4;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String infoVehiculo() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}
