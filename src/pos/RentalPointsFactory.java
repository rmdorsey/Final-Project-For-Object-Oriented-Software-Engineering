package pos;

import Interfaces.IRentalPointsStrategy;
import pos.Books.OperationRentalPointsBook;
import pos.CDs.OperationRentalPointsMusicCD;
import pos.Movies.OperationRentalPointsChildrensMovie;
import pos.Movies.OperationRentalPointsNewReleaseMovie;
import pos.Movies.OperationRentalPointsRegularMovie;
import pos.PS4.OperationCostToRentPS4;
import pos.PS4.OperationRentalPointsPS4;
import pos.VideoGames.OperationRentalPointsVideoGame;
import pos.XBOX.OperationRentalPointsXBox;

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
        } else if (itemType == SalesItem.XBOX) {
            return new OperationRentalPointsXBox();
        } else if (itemType == SalesItem.VIDEO_GAME) {
            return new OperationRentalPointsVideoGame();
        } else if (itemType == SalesItem.MUSIC_CD) {
            return new OperationRentalPointsMusicCD();
        } else if (itemType == SalesItem.BOOK) {
            return new OperationRentalPointsBook();
        }

        return null;
    }
}
