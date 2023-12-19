package pos.XBOX;

import Interfaces.IRentalPointsStrategy;

public class OperationRentalPointsXBox implements IRentalPointsStrategy {
    @Override
    public int calculateRentalPoints(int daysRented) {
        // add one frequent renter point by default
        int rentalPoints = 5;

        return rentalPoints;
    }
}
