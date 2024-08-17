package ProgramacionI.ejercicios;

/*
    Obtener un algoritmo que imprima por pantalla todos los números
    comprendidos entre el 5 y el 230, pero en orden inverso.
    Por ejemplo: 230,229,228,……………….,6,5.
*/

public class ej27 {
    public static void main(String[] args) {
        final int MIN = 5;
        int MAX = 230;

        for (int i = MAX; i >= MIN; i--) {
            if (i > MIN) System.out.print(i + ",");
            else System.out.print(i); // Para evitar la coma al final
        }
    }
}
