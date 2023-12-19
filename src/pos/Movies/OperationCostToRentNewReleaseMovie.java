package pos.Movies;

import Interfaces.IRentStrategy;

public class OperationCostToRentNewReleaseMovie implements IRentStrategy {
    private double rentalAmount = 0;
    @Override
    public double calculateCostToRent(int daysRented) {
        double cost = rentalAmount;

        cost += daysRented * 3;

        return cost;
    }
}
