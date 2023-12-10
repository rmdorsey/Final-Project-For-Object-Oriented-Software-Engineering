package pos.PS4;
import Interfaces.IRentStrategy;
public class OperationCostToRentPS4 implements IRentStrategy {
    private double rentalAmount = 0; //per day
    private double discount = 0;
    private int discountThreshold = 0;
    private int costPerDay = 20;
    @Override
    public double calculateCostToRent(int daysRented) {
        double cost = rentalAmount;

        cost += daysRented * costPerDay;
        return cost;
    }
}
