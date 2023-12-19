package pos.VideoGames;

import Interfaces.ISellStrategy;
import pos.SalesItem;

public class OperationSellVideoGame implements ISellStrategy {
    private double wholeSalePrice = 25.00;
    private double msrpPrice = 50.00;
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