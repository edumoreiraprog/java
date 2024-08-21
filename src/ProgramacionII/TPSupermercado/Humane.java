package ProgramacionII.TPSupermercado;

class Humane {
    private String apellido;
    private String nombre;

    public Humane(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  apellido + ", " + nombre;
    }
}


