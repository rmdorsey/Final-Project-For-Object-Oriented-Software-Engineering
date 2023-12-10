package pos.PS4;

import Interfaces.ISellStrategy;
import pos.SalesItem;

public class OperationSellPS4  implements ISellStrategy {
    private double wholeSalePrice = 100.00;
    private double msrpPrice = 150.00;
    //private int discountThreshold = 3;
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