package Decorators;

import Interfaces.ISalesItem;
import Interfaces.IShoppingCart;
import pos.ShoppingCart;

import java.util.List;

public class CouponDiscountDecorator implements IShoppingCart {
    protected ShoppingCart decoratedShoppingCart;

    public CouponDiscountDecorator(ShoppingCart decoratedShoppingCart) {
        this.decoratedShoppingCart = decoratedShoppingCart;
    }
    public double getCartCostTotal() {
        return decoratedShoppingCart.getCartCostTotal();
    }
    public int getCartPointsTotal() {
        return decoratedShoppingCart.getCartPointsTotal();
    }
    public void addCategoryCart(ShoppingCart sc) {
        decoratedShoppingCart.addCategoryCart(sc);
    }
    public void removeCategoryCart(ShoppingCart sc) {
        decoratedShoppingCart.removeCategoryCart(sc);
    }
    public List<ShoppingCart> getCartCategoryList() {
        return decoratedShoppingCart.getCartCategoryList();
    }
    public void addItemToCart(ISalesItem s) {
        decoratedShoppingCart.addItemToCart(s);
    }
}
