package pos;

import Interfaces.IRentStrategy;
import pos.Books.OperationCostToRentBook;
import pos.Books.OperationRentalPointsBook;
import pos.CDs.OperationCostToRentMusicCD;
import pos.CDs.OperationRentalPointsMusicCD;
import pos.Movies.OperationCostToRentChildrensMovie;
import pos.Movies.OperationCostToRentNewReleaseMovie;
import pos.Movies.OperationCostToRentRegularMovie;
import pos.PS4.OperationCostToRentPS4;
import pos.PS4.OperationSellPS4;
import pos.VideoGames.OperationCostToRentVideoGame;
import pos.VideoGames.OperationRentalPointsVideoGame;
import pos.XBOX.OperationCostToRentXBox;

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
        } else if (itemType == SalesItem.XBOX) {
            return new OperationCostToRentXBox();
        } else if (itemType == SalesItem.VIDEO_GAME) {
            return new OperationCostToRentVideoGame();
        } else if (itemType == SalesItem.MUSIC_CD) {
            return new OperationCostToRentMusicCD();
        } else if (itemType == SalesItem.BOOK) {
            return new OperationCostToRentBook();
        }

        return null;
    }
}
