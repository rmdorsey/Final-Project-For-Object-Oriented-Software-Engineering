public class OperationCostToRentChildrensMovie implements IRentStrategy {
    private double rentalAmount = 1.5;
    private double discount = 1.5;
    private int discountThreshold = 3;
    @Override
    public double calculateCostToRent(int daysRented) {
        double cost = rentalAmount;

        if (daysRented > discountThreshold) {
            cost += (daysRented - discountThreshold) * discount;
        }

        return cost;
    }
}
