package pos;

import Interfaces.ISalesItem;
import Interfaces.IShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ShoppingCart implements IShoppingCart {
    public static final int NO_COUPON = 0;
    public static final int HALF_OFF_COUPON     = 1;
    public static final int X_DOLLARS_OFF_COUPON   = 2;
    public static final int FREE_MOVIE_AFTER_10_POINTS = 3;
    public static final double DISCOUNT_COUPON_THRESHOLD = 40;
    private double      _totalAmount          = 0;
    private int         _frequentRenterPoints = 0;
    private Vector<ISalesItem> itemsInCart;
    private List<ShoppingCart> cartCategoryList;

    public ShoppingCart() {
        cartCategoryList = new ArrayList<ShoppingCart>();
        itemsInCart = new Vector<ISalesItem>();
    }

    public void addCategoryCart(ShoppingCart sc) {
        cartCategoryList.add(sc);
    }

    public void removeCategoryCart(ShoppingCart sc) {
        cartCategoryList.remove(sc);
    }

    public List<ShoppingCart> getCartCategoryList() {
        return cartCategoryList;
    }

    public void addItemToCart(ISalesItem s) {
        itemsInCart.add(s);
//        updateRunningCostCartTotal();
    }

    public void removeItemFromCart(ISalesItem r) {
        itemsInCart.remove(r);
    }

    public Vector<ISalesItem> getCartItemList(){
        return itemsInCart;
    }

//    private void updateRunningCostCartTotal() {
//        _totalAmount = 0;
//        for (Interfaces.ISalesItem s : itemsInCart) {
//            _totalAmount+=s.getCost();
//        }
//    }

    public double getCartCostTotal() {
        double cartCostTotal = 0;
        for (ShoppingCart shoppingCart : getCartCategoryList()) {

            for (ISalesItem item : shoppingCart.getCartItemList()) {
                cartCostTotal += item.getCost();
            }
        }
        return cartCostTotal;
    }

    public int getCartPointsTotal() {
        int cartPointsTotal = 0;
        for (ShoppingCart shoppingCart : getCartCategoryList()) {

            for (ISalesItem item : shoppingCart.getCartItemList()) {
                cartPointsTotal += item.getPoints();
            }
        }
        return cartPointsTotal;
    }


    //update running cost total
    //update running points total
}
