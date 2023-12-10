package pos.Movies;

import pos.SalesItem;

public class ChildrensMovie extends SalesItem {

    private static int priceCode = 2;

    public ChildrensMovie(String title) {
        super(title, priceCode);
    }
}