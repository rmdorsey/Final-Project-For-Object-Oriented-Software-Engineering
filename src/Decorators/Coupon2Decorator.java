package Decorators;

import pos.ShoppingCart;

public class Coupon2Decorator extends CouponDiscountDecorator {
    //A coupon for a rental that takes 10$ off for a total price of more than 50$
    public Coupon2Decorator(ShoppingCart decoratedShoppingCart) {
        super(decoratedShoppingCart);
    }

    @Override
    public double getCartCostTotal() {
        double totalCost = decoratedShoppingCart.getCartCostTotal();

        if(totalCost> ShoppingCart.DISCOUNT_COUPON_THRESHOLD) {
            return totalCost-10;
        } else {
            return totalCost;
        }
    }
}