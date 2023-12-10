package pos;

import Interfaces.IRentalPointsStrategy;
import pos.Movies.OperationRentalPointsChildrensMovie;
import pos.Movies.OperationRentalPointsNewReleaseMovie;
import pos.Movies.OperationRentalPointsRegularMovie;
import pos.PS4.OperationCostToRentPS4;
import pos.PS4.OperationRentalPointsPS4;

public class RentalPointsFactory {

    public IRentalPointsStrategy getRentalPointsStrategy(int itemType) {
        if (itemType == SalesItem.CHILDRENS_MOVIE) {
            return new OperationRentalPointsChildrensMovie();
        } else if (itemType == SalesItem.NEW_RELEASE_MOVIE) {
            return new OperationRentalPointsNewReleaseMovie();
        } else if (itemType == SalesItem.REGULAR_MOVIE) {
            return new OperationRentalPointsRegularMovie();
        } else if (itemType == SalesItem.PS4) {
            return new OperationRentalPointsPS4();
        }

        return null;
    }
}
