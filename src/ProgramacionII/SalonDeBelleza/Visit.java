import java.time.LocalDate;

public class Visit {
    private Customer customer;
    private LocalDate date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, LocalDate date) {
        this.customer = customer;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        if (customer.isMember()) {
            DiscountRate descuento = new DiscountRate();
            double discount = descuento.getDiscountRate(customer);
            double total = serviceExpense + productExpense;

            System.out.println("Descuento: " + discount*100 + "%");
            return (total - total * discount);
        } else {
            return (serviceExpense + productExpense);
        }
    }

    public void showTicket() {
        System.out.println("--------------------------------");
        System.out.println("\t\tInforme de compra");
        System.out.println("--------------------------------");
        System.out.println("Fecha: " + date);
        System.out.println("Cliente: " + customer.getName());
        System.out.println("Miembro: " + customer.getMemberType());
        System.out.println("Gastos en servicios: $" + serviceExpense);
        System.out.println("Gastos en productos: $" + productExpense);
        System.out.println("Total: $" + getTotalExpense());
    }

    @Override
    public String toString() {
        return "\nFecha: " + date + "\nCliente: " + customer.getName();
    }
}
