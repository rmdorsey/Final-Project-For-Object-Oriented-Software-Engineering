package pos;

import Interfaces.IRentStrategy;
import pos.Movies.OperationCostToRentChildrensMovie;
import pos.Movies.OperationCostToRentNewReleaseMovie;
import pos.Movies.OperationCostToRentRegularMovie;
import pos.PS4.OperationCostToRentPS4;
import pos.PS4.OperationSellPS4;

public class RentalStrategyFactory {

    public IRentStrategy getCostToRentStrategy(int itemType) {
        if (itemType == SalesItem.CHILDRENS_MOVIE) {
            return new OperationCostToRentChildrensMovie();
        } else if (itemType == SalesItem.NEW_RELEASE_MOVIE) {
            return new OperationCostToRentNewReleaseMovie();
        } else if (itemType == SalesItem.REGULAR_MOVIE) {
            return new OperationCostToRentRegularMovie();
        } else if (itemType == SalesItem.PS4) {
            return new OperationCostToRentPS4();
        }

        return null;
    }
}
