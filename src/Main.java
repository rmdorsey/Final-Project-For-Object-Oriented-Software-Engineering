import Primary.Customer;
import pos.Movies.ChildrensMovie;
import pos.Movies.NewRelease;
import pos.Movies.RegularMovie;
import pos.PS4.SalesItemPS4;
import Primary.Rental;
import pos.SalesItem;
import pos.ShoppingCart;
import Primary.SoldItem;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Matt Dorsey", ShoppingCart.NO_COUPON);
        SalesItem movie_independent_day = new RegularMovie("Independence Day");
        SalesItem movie_home_alone = new RegularMovie("Home Alone");
        SalesItem movie_last_unicorn = new ChildrensMovie("The Last Unicorn");
        SalesItem movie_avatar_2 = new NewRelease("Avatar 2");

        SalesItem ps4 = new SalesItemPS4("Playstation 4");

        //RENTALS
        //MOVIES RENTED
        customer.addRental(new Rental(movie_independent_day, 3));
        customer.addRental(new Rental(movie_home_alone, 2));
        customer.addRental(new Rental(movie_last_unicorn, 2));
        customer.addRental(new Rental(movie_avatar_2, 3));
        //PS4 RENTED
        customer.addRental(new Rental(ps4, 2));

        //SOLD ITEMS
        //PS4 SOLD
        customer.addSoldItem(new SoldItem(ps4,SalesItem.SELL_MSRP_PRICE));

        System.out.println(customer.statement());
        //System.out.println(customer.statementInXML());


        //System.out.println(customer.statement(Primary.Rental.NO_COUPON));
//        System.out.println(customer.statement(Primary.Rental.HALF_OFF_COUPON));
//        System.out.println(customer.statement(Primary.Rental.DOLLAR_OFF_COUPON));
//        System.out.println(customer.statementInXML(Primary.Rental.NO_COUPON));
//        System.out.println(customer.statementInXML(Primary.Rental.HALF_OFF_COUPON));
//        System.out.println(customer.statementInXML(Primary.Rental.DOLLAR_OFF_COUPON));
    }
}