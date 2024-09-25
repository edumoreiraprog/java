import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cargar datos del cliente
        System.out.println("--------------------------------");
        System.out.println("\t\tSalón de Belleza");
        System.out.println("--------------------------------");
        System.out.print("Nombre del cliente: ");
        Customer cliente = new Customer(sc.nextLine());
        System.out.print("Tipo de suscripción (Premium, Gold o Silver): ");
        cliente.setMemberType(sc.nextLine());

        //Crear una visita
        Visit visita1 = new Visit(cliente, LocalDate.now());

        // Agregar gastos
        System.out.print("Gastos en servicios: ");
        visita1.setServiceExpense(sc.nextDouble());
        System.out.print("Gastos en productos: ");
        visita1.setProductExpense(sc.nextDouble());

        // Mostrar el ticket
        visita1.showTicket();

    }
}