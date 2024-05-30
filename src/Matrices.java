import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese cantidad de filas: ");
        int nFilas = sc.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        int nColumnas = sc.nextInt();

        int [][] numeros = new int[nFilas][nColumnas];

        cargarMatriz(numeros, nFilas, nColumnas, sc);

        mostrarMatriz(numeros, nFilas, nColumnas);
    }

    public static void cargarMatriz(int [][] matriz, int nFilas, int nColumnas, Scanner sc) {
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.println("Ingrese numero para la posicion " + i + ", " + j + ":");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int [][] matriz, int nFilas, int nColumnas) {
        System.out.println("La matriz de [" + nFilas + "]" + "[" + nColumnas + "] : \n");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("\n");
        }
    }

    /*
    public static void mostrarMatriz(int [][] matriz, int nFilas, int nColumnas) {
        System.out.println("[i][j] = Valor");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.println("[" + i + "]" + "[" + j + "] = " + matriz[i][j]);
            }
        }
    }
     */
}
