package pos;

import Interfaces.ISellStrategy;
import pos.Books.OperationSellBook;
import pos.CDs.OperationSellMusicCD;
import pos.Movies.OperationSellChildrens;
//import pos.Movies.OperationSellMovie;
import pos.Movies.OperationSellNewRelease;
import pos.Movies.OperationSellRegular;
import pos.PS4.OperationSellPS4;
import pos.VideoGames.OperationSellVideoGame;
import pos.XBOX.OperationSellXBox;

public class SellStrategyFactory {
    public ISellStrategy getSellStrategy(int itemType) {
        if (itemType == SalesItem.BOOK) {
            return new OperationSellBook();
        } else if (itemType == SalesItem.NEW_RELEASE_MOVIE) {
            return new OperationSellNewRelease();
        } else if (itemType == SalesItem.REGULAR_MOVIE) {
            return new OperationSellRegular();
        } else if (itemType == SalesItem.CHILDRENS_MOVIE) {
            return new OperationSellChildrens();
        } else if (itemType == SalesItem.PS4) {
            return new OperationSellPS4();
        } else if (itemType == SalesItem.MUSIC_CD) {
            return new OperationSellMusicCD();
        } else if (itemType == SalesItem.XBOX) {
            return new OperationSellXBox();
        } else if (itemType == SalesItem.VIDEO_GAME) {
            return new OperationSellVideoGame();
        }

        return null;
    }
}
