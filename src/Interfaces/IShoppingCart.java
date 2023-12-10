package Interfaces;

import pos.ShoppingCart;

import java.util.List;

public interface IShoppingCart {
    public double getCartCostTotal();
    public int getCartPointsTotal();
    public void addCategoryCart(ShoppingCart sc);
    public void removeCategoryCart(ShoppingCart sc);
    public List<ShoppingCart> getCartCategoryList();

}
