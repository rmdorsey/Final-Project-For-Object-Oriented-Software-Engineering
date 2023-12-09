public class Coupon1Decorator extends CouponDiscountDecorator {
    //A coupon for a rental that allows 50% off the entire rental price
    public Coupon1Decorator(ShoppingCart decoratedShoppingCart) {
        super(decoratedShoppingCart);
    }

    @Override
    public double getCartCostTotal() {
        double totalCost = decoratedShoppingCart.getCartCostTotal();

        //apply the half off coupon
        return totalCost/2;
    }
}
