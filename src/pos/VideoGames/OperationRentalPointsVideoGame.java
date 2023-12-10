package pos.VideoGames;

import Interfaces.IRentalPointsStrategy;

public class OperationRentalPointsVideoGame implements IRentalPointsStrategy {
    @Override
    public int calculateRentalPoints(int daysRented) {
        // add one frequent renter point by default
        int rentalPoints = 2;

        return rentalPoints;
    }
}
