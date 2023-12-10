package pos.Movies;

import pos.SalesItem;

public class RegularMovie extends SalesItem {

    private static int priceCode = 0;

    public RegularMovie(String title) {
        super(title, priceCode);
    }
}