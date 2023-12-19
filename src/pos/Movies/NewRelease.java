package pos.Movies;

import pos.SalesItem;

public class NewRelease extends SalesItem {

    private static int priceCode = 1;

    public NewRelease(String title) {
        super(title, priceCode);
    }
}