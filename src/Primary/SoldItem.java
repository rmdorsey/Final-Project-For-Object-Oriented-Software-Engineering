package Primary;

import Interfaces.ISalesItem;
import Interfaces.ISellStrategy;
import pos.SalesItem;
import pos.SellStrategyFactory;

public class SoldItem implements ISalesItem {
    private SalesItem _salesItem;
    private double soldItemCost = 0;
    private int points = 0;
    private int priceType;
    private boolean isRental = false;
    public SoldItem(SalesItem salesItem, int priceType) {
        _salesItem      = salesItem;
        this.priceType = priceType;
        calculateCost();
        calculatePoints();
    }
    public SalesItem getSalesItem() {
        return _salesItem;
    }
    private double calculateCost() {
        SellStrategyFactory sellStrategyFactory = new SellStrategyFactory();

        ISellStrategy sellStrategy = sellStrategyFactory.getSellStrategy(getSalesItem().getPriceCode());
        soldItemCost = sellStrategy.calculateSellPrice(getPriceType());

        return soldItemCost;
    }

    private int calculatePoints() {
//        pos.RentalPointsFactory rentalPointsFactory = new pos.RentalPointsFactory();
//
//        Interfaces.IRentalPointsStrategy rentalPointsStrategy = rentalPointsFactory.getRentalPointsStrategy(getSalesItem().getPriceCode());
//
//        rentalPoints = rentalPointsStrategy.calculateRentalPoints(getDaysRented());
//
//        return rentalPoints;
        return 0;
    }

    public int getPriceType() {
        return this.priceType;
    }

    public double getCost() {
        return soldItemCost;
    }

    public int getPoints() {
        return points;
    }
    public int getPriceCode() {
        return getSalesItem().getPriceCode();
    }
    public boolean isRental() {
        return isRental;
    }
}
