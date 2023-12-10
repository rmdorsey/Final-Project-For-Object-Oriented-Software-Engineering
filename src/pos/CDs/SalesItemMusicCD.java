package pos.CDs;

import pos.SalesItem;

public class SalesItemMusicCD extends SalesItem {
    private static int priceCode = SalesItem.MUSIC_CD;

    public SalesItemMusicCD(String title) {
        super(title, priceCode);
    }
}
