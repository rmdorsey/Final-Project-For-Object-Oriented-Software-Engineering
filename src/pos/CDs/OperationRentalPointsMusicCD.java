package pos.CDs;

import Interfaces.IRentalPointsStrategy;

public class OperationRentalPointsMusicCD implements IRentalPointsStrategy {
    @Override
    public int calculateRentalPoints(int daysRented) {
        // add one frequent renter point by default
        int rentalPoints = 1;

        return rentalPoints;
    }
}
