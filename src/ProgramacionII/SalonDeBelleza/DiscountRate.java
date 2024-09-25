public class DiscountRate {
    private double discountPremium = 0.2;
    private double discountGold = 0.15;
    private double discountSilver = 0.1;

    public double getDiscountRate(Customer customer) {
        String memberType = customer.getMemberType();

        if (memberType.equals("Premium")) {
            return discountPremium;
        } else if (memberType.equals("Gold")) {
            return discountGold;
        } else if (memberType.equals("Silver")) {
            return discountSilver;
        } else return 0;
    }
}
