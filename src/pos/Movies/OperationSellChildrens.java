package pos.Movies;

import Interfaces.ISellStrategy;
import pos.SalesItem;

public class OperationSellChildrens implements ISellStrategy {
    private double wholeSalePrice = 10.00;
    private double msrpPrice = 20.00;
    @Override
    public double calculateSellPrice(int priceType) {
        double cost = 0;
        if(priceType== SalesItem.SELL_WHOLESALE_PRICE) {
            cost = wholeSalePrice;
        } else {
            cost = msrpPrice;
        }

        return cost;
    }
}
