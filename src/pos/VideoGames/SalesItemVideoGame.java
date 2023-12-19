package pos.VideoGames;

import pos.SalesItem;

public class SalesItemVideoGame extends SalesItem {
    private static int priceCode = SalesItem.VIDEO_GAME;

    public SalesItemVideoGame(String title) {
        super(title, priceCode);
    }
}
