public class OperationRentalPointsNewReleaseMovie implements IRentalPointsStrategy{
    @Override
    public int calculateRentalPoints(int daysRented) {
        // add one frequent renter point by default
        int rentalPoints = 1;

        // add bonus for a two-day new release rental
        if (daysRented > 1) {
            rentalPoints=2;
        }

        return rentalPoints;
    }
}
