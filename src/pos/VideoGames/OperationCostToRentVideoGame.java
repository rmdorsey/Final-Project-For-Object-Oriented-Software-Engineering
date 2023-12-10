package pos.VideoGames;

import Interfaces.IRentStrategy;

public class OperationCostToRentVideoGame implements IRentStrategy {
    private double rentalAmount = 0;
    private double discount = 0;
    private int discountThreshold = 0;
    private double costPerDay = 2;
    @Override
    public double calculateCostToRent(int daysRented) {
        double cost = rentalAmount;

        cost += daysRented * costPerDay;
        return cost;
    }
}
