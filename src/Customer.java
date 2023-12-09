import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private IShoppingCart _shoppingCart;
    private ShoppingCart _rentalCart;
    private ShoppingCart _soldItemCart;

    public Customer (String name, int couponToApply) {
        _name = name;

        if(couponToApply==ShoppingCart.HALF_OFF_COUPON) {
            _shoppingCart = new Coupon1Decorator(new ShoppingCart());
        } else if(couponToApply==ShoppingCart.X_DOLLARS_OFF_COUPON) {
            _shoppingCart = new Coupon2Decorator(new ShoppingCart());
        } else if(couponToApply==ShoppingCart.FREE_MOVIE_AFTER_10_POINTS) {
            _shoppingCart = new Coupon3Decorator(new ShoppingCart());
        } else {
           _shoppingCart = new ShoppingCart();
        }

        _rentalCart = new ShoppingCart();
        _soldItemCart = new ShoppingCart();

        _shoppingCart.addCategoryCart(_rentalCart);
        _shoppingCart.addCategoryCart(_soldItemCart);
    }

    public void addRental(Rental arg) {
        _rentalCart.addItemToCart(arg);
    }

    public void addSoldItem(SoldItem arg) {
        _soldItemCart.addItemToCart(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        Enumeration rentals              = _rentalCart.getCartItemList().elements();
        String      viewResult               = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            // show figures for this rental
            viewResult += getFiguresForRental(each.getSalesItem().getTitle(), each.getCost(), false);
        }

        // add footer lines
        viewResult += getFooterLines(_shoppingCart.getCartCostTotal(), _shoppingCart.getCartPointsTotal(), false);
        return viewResult;
    }

    public String statementInXML() {
        Enumeration rentals              = _rentalCart.getCartItemList().elements();
        String      viewResult               = "<name>" + getName() + "</name>\n";

        while (rentals.hasMoreElements()) {

            Rental each       = (Rental) rentals.nextElement();

            // show figures for this rental
            viewResult += getFiguresForRental(each.getSalesItem().getTitle(), each.getCost(), true);
        }

        // add footer lines
        viewResult += getFooterLines(_shoppingCart.getCartCostTotal(), _shoppingCart.getCartPointsTotal(), true);
        return viewResult;
    }

    private String getFiguresForRental(String _movieTitle, double _rentalAmount, boolean xmlFmt) {
        String figuresForRental = "";

        if(xmlFmt) {
            figuresForRental += "<movie>\n\t<title>" + _movieTitle + "</title>\n\t<rentalcost>" + _rentalAmount + "</rentalcost>\n</movie>\n";
        } else {
            figuresForRental += "\t" + _movieTitle +
                    "\t" + String.valueOf(_rentalAmount) + "\n";
        }

        return figuresForRental;
    }

    private String getFooterLines(double _totalAmount, int _frequentRenterPoints, boolean xmlFmt) {
        String footer = "";

        if(xmlFmt) {
            footer += "<footer>\n\t<amountowed>" + String.valueOf(_totalAmount) + "</amountowed>\n";
            footer += "\t<pointsearned>" + String.valueOf(_frequentRenterPoints) + "</pointsearned>\n</footer>";
        } else {
            footer += "Amount owed is " + String.valueOf(_totalAmount) + "\n";
            footer += "You earned " + String.valueOf(_frequentRenterPoints) +
                    " frequent renter points";
        }

        return footer;
    }

}
