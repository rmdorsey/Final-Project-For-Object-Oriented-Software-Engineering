public class Coupon3Decorator extends CouponDiscountDecorator {
    public Coupon3Decorator(ShoppingCart decoratedShoppingCart) {
        super(decoratedShoppingCart);
    }

    @Override
    public double getCartCostTotal() {
        double cartCostTotal = 0;
        int cartPoints = 0;

        for (ShoppingCart shoppingCart : getCartCategoryList()) {
            for (ISalesItem item : shoppingCart.getCartItemList()) {

                if(cartPoints>=10) {
                    //points gets reset to 0 after they're used for a free item
                    cartPoints = 0;
                    //free rental every 10 points
                    cartCostTotal += 0;
                } else {
                    cartPoints += item.getPoints();
                    cartCostTotal += item.getCost();
                }

            }
        }
        return cartCostTotal;
    }

    @Override
    public int getCartPointsTotal() {
        int cartPointsTotal = 0;
        for (ShoppingCart shoppingCart : getCartCategoryList()) {
            for (ISalesItem item : shoppingCart.getCartItemList()) {
                if(cartPointsTotal>=10) {
                    //points gets reset to 0 after they're used for a free item
                    cartPointsTotal = 0;
                } else {
                    cartPointsTotal += item.getPoints();
                }
            }
        }
        return cartPointsTotal;
    }

//    @Override
//    public void addTo_TotalAmount(double amount) {
//        //customer gets a free movie once they have 10 points
//        if(decoratedCustomerRentObj.get_frequentRenterPoints()>10) {
//            decoratedCustomerRentObj.addTo_TotalAmount(0);
//            //cash in your points
//            decoratedCustomerRentObj.subtractFrom_frequentRenterPoints(10);
//        } else {
//            decoratedCustomerRentObj.addTo_TotalAmount(amount);
//        }
//    }
//
//    @Override
//    public void addTo_frequentRenterPoints(int points) {
//        decoratedCustomerRentObj.addTo_frequentRenterPoints(points);
//    }

}
