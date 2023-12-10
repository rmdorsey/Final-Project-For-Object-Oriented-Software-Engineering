package pos.PS4;

import Interfaces.IRentalPointsStrategy;

public class OperationRentalPointsPS4 implements IRentalPointsStrategy {
    @Override
    public int calculateRentalPoints(int daysRented) {
        // add one frequent renter point by default
        int rentalPoints = 4;

        return rentalPoints;
    }
}
