package ProgramacionII.TPSupermercado;

class Humane {
    private String apellido;
    private String nombre;

    public Humane(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  apellido + ", " + nombre;
    }
}


