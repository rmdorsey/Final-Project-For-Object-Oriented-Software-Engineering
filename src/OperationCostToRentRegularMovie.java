public class OperationCostToRentRegularMovie implements IRentStrategy {
    private double rentalAmount = 2;
    private double discount = 1.5;
    private int discountThreshold = 2;
    @Override
    public double calculateCostToRent(int daysRented) {
        double cost = rentalAmount;

        if (daysRented > discountThreshold) {
            cost += (daysRented - discountThreshold) * discount;
        }

        return cost;
    }
}
