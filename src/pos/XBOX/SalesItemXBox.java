package pos.XBOX;

import pos.SalesItem;

public class SalesItemXBox extends SalesItem {
    private static int priceCode = SalesItem.XBOX;

    public SalesItemXBox(String title) {
        super(title, priceCode);
    }
}
