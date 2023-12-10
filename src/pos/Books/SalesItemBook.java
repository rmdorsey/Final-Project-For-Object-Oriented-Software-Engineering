package pos.Books;

import pos.SalesItem;

public class SalesItemBook extends SalesItem {
    private static int priceCode = SalesItem.BOOK;

    public SalesItemBook(String title) {
        super(title, priceCode);
    }
}
