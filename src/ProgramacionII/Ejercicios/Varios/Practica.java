package ProgramacionII.Ejercicios.Varios;

public class Practica {

    public static void main(String[] args) {
        mEstatico();
        //mPublico();
        Clase1 clase01 = new Clase1(1, 2 ,3);

    }

    static void mEstatico() {
        System.out.println("Hola, soy un método estático.");
    }

    public void mPublico() {
        System.out.println("Hola, soy un método público.");
    }
}
