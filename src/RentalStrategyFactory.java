public class RentalStrategyFactory {

    public IRentStrategy getCostToRentStrategy(int itemType) {
        if (itemType == SalesItem.CHILDRENS_MOVIE) {
            return new OperationCostToRentChildrensMovie();
        } else if (itemType == SalesItem.NEW_RELEASE_MOVIE) {
            return new OperationCostToRentNewReleaseMovie();
        } else if (itemType == SalesItem.REGULAR_MOVIE) {
            return new OperationCostToRentRegularMovie();
        }

        return null;
    }
}
