package Primary;

import Interfaces.IRentStrategy;
import Interfaces.IRentalPointsStrategy;
import Interfaces.ISalesItem;
import pos.RentalPointsFactory;
import pos.RentalStrategyFactory;
import pos.SalesItem;

public class Rental implements ISalesItem {
    //    public static final int NEW_RELEASE = 1;
    private SalesItem _salesItem;
    private int   _daysRented;
    private double rentalCost = 0;
    private int rentalPoints = 0;
    public Rental(SalesItem salesItem, int daysRented) {
        _salesItem      = salesItem;
        _daysRented = daysRented;
        calculateCost();
        calculatePoints();
    }
    public int getDaysRented() {
        return _daysRented;
    }
    public SalesItem getSalesItem() {
        return _salesItem;
    }
    private double calculateCost() {
        RentalStrategyFactory rentalCostStrategyFactory = new RentalStrategyFactory();

        IRentStrategy costToRentStrategy = rentalCostStrategyFactory.getCostToRentStrategy(getSalesItem().getPriceCode());
        rentalCost = costToRentStrategy.calculateCostToRent(getDaysRented());

        return rentalCost;
    }

    private int calculatePoints() {
        RentalPointsFactory rentalPointsFactory = new RentalPointsFactory();

        IRentalPointsStrategy rentalPointsStrategy = rentalPointsFactory.getRentalPointsStrategy(getSalesItem().getPriceCode());

        rentalPoints = rentalPointsStrategy.calculateRentalPoints(getDaysRented());

        return rentalPoints;
    }

    public double getCost() {
        return rentalCost;
    }

    public int getPoints() {
        return rentalPoints;
    }
}