package pos.Movies;

import Interfaces.IRentalPointsStrategy;

public class OperationRentalPointsChildrensMovie implements IRentalPointsStrategy {
    @Override
    public int calculateRentalPoints(int daysRented) {
        // add one frequent renter point by default
        int rentalPoints = 1;

        return rentalPoints;
    }
}
