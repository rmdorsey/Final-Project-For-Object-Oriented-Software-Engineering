package pos.Movies;

import Interfaces.ISellStrategy;
import pos.SalesItem;

public class OperationSellNewRelease implements ISellStrategy {
    private double wholeSalePrice = 15.00;
    private double msrpPrice = 25.00;
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
