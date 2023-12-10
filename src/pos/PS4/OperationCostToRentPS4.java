package pos.PS4;
import Interfaces.IRentStrategy;
public class OperationCostToRentPS4 implements IRentStrategy {
    private double rentalAmount = 20; //per day
    private double discount = 0;
    private int discountThreshold = 0;

    @Override
    public double calculateCostToRent(int daysRented) {
        double cost = daysRented * rentalAmount;

        return cost;
    }
}
