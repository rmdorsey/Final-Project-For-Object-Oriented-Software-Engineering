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
        Enumeration rentals = _rentalCart.getCartItemList().elements();
        Enumeration sales = _soldItemCart.getCartItemList().elements(); //(not rentals)
        String      viewResult               = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            // show figures for this rental
            viewResult += getFiguresForRental(each.getSalesItem().getTitle(), each.getCost(), false);
        }

        while (sales.hasMoreElements()) {
            SoldItem each = (SoldItem) sales.nextElement();

            // show figures for this rental
            viewResult += getFiguresForSoldItem(each.getSalesItem().getTitle(), each.getCost(), false);
        }

        // add footer lines
        viewResult += getFooterLines(_shoppingCart.getCartCostTotal(), _shoppingCart.getCartPointsTotal(), false);
        return viewResult;
    }

    public String statementInXML() {
        Enumeration rentals = _rentalCart.getCartItemList().elements();
        Enumeration sales = _soldItemCart.getCartItemList().elements(); //(not rentals)
        String      viewResult               = "<name>" + getName() + "</name>\n";

        while (rentals.hasMoreElements()) {

            Rental each       = (Rental) rentals.nextElement();

            // show figures for this rental
            viewResult += getFiguresForRental(each.getSalesItem().getTitle(), each.getCost(), true);
        }

        while (sales.hasMoreElements()) {
            SoldItem each = (SoldItem) sales.nextElement();

            // show figures for this rental
            viewResult += getFiguresForSoldItem(each.getSalesItem().getTitle(), each.getCost(), true);
        }

        // add footer lines
        viewResult += getFooterLines(_shoppingCart.getCartCostTotal(), _shoppingCart.getCartPointsTotal(), true);
        return viewResult;
    }

    private String getFiguresForRental(String _rentalTitle, double _rentalAmount, boolean xmlFmt) {
        String figuresForRental = "";

        if(xmlFmt) {
            figuresForRental += "<rental>\n\t<title>" + _rentalTitle + "</title>\n\t<cost>$" + String.format("%.02f",_rentalAmount) + "</cost>\n</rental>\n";
        } else {
            figuresForRental += "(RENTAL)\t$" + String.format("%.02f",_rentalAmount) +
                    "\t    " + _rentalTitle + "\n";
        }

        return figuresForRental;
    }

    private String getFiguresForSoldItem(String _itemTitle, double _salesAmount, boolean xmlFmt) {
        String figuresForSoldItem = "";

        if(xmlFmt) {
            figuresForSoldItem += "<solditem>\n\t<title>" + _itemTitle + "</title>\n\t<cost>$" + String.format("%.02f",_salesAmount) + "</cost>\n</solditem>\n";
        } else {
            figuresForSoldItem += "(SOLD)    \t$" + String.format("%.02f",_salesAmount) +
                    "\t    " + _itemTitle + "\n";
        }

        return figuresForSoldItem;
    }

    private String getFooterLines(double _totalAmount, int _frequentRenterPoints, boolean xmlFmt) {
        String footer = "";

        if(xmlFmt) {
            footer += "<footer>\n\t<amountowed>$" + String.format("%.02f",_totalAmount) + "</amountowed>\n";
            footer += "\t<pointsearned>" + String.valueOf(_frequentRenterPoints) + "</pointsearned>\n</footer>";
        } else {
            footer += "\nAmount owed is $" + String.format("%.02f",_totalAmount) + "\n";
            footer += "You earned " + String.valueOf(_frequentRenterPoints) +
                    " frequent renter points";
        }

        return footer;
    }

}
