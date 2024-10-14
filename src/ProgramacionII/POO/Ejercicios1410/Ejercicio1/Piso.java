package ProgramacionII.POO.Ejercicios1410.Ejercicio1;

public class Piso {
    private int numPiso;
    private int cantDepartamentos;

    public Piso() {
    }

    public Piso(int numPiso, int cantDepartamentos) {
        this.numPiso = numPiso;
        this.cantDepartamentos = cantDepartamentos;
    }

    public int getNumPiso() {
        return numPiso;
    }

    public int getCantDepartamentos() {
        return cantDepartamentos;
    }
}
