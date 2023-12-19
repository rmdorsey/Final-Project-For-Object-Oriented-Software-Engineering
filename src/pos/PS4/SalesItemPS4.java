package pos.PS4;

import pos.SalesItem;

public class SalesItemPS4 extends SalesItem {
    private static int priceCode = SalesItem.PS4;

    public SalesItemPS4(String title) {
        super(title, priceCode);
    }
}
