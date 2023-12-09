public class SalesItem {
    //SELL PRICE TYPES
    public static final int SELL_WHOLESALE_PRICE = 0;
    public static final int SELL_MSRP_PRICE = 1;
    //ITEM TYPES
    public static final int REGULAR_MOVIE     = 0;
    public static final int NEW_RELEASE_MOVIE = 1;
    public static final int CHILDRENS_MOVIE   = 2;
    public static final int MOVIE = 3;
    public static final int VIDEO_GAME = 4;
    public static final int MUSIC_CD = 5;
    public static final int XBOX = 6;
    public static final int PS4 = 7;
    public static final int BOOK = 8;

    private String _title;
    private int _priceCode;

    public SalesItem(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }
}
