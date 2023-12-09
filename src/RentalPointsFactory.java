public class RentalPointsFactory {

    public IRentalPointsStrategy getRentalPointsStrategy(int movieType) {
        if (movieType == SalesItem.CHILDRENS_MOVIE) {
            return new OperationRentalPointsChildrensMovie();
        } else if (movieType == SalesItem.NEW_RELEASE_MOVIE) {
            return new OperationRentalPointsNewReleaseMovie();
        } else if (movieType == SalesItem.REGULAR_MOVIE) {
            return new OperationRentalPointsRegularMovie();
        }

        return null;
    }
}
