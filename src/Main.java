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

        customer.addRental(new Rental(movie_independent_day, 3));
        customer.addRental(new Rental(movie_home_alone, 2));
        customer.addRental(new Rental(movie_last_unicorn, 2));
        customer.addRental(new Rental(movie_avatar_2, 3));

        customer.addSoldItem(new SoldItem(ps4,SalesItem.SELL_MSRP_PRICE));

        System.out.println(customer.statement());
//        System.out.println(customer.statementInXML());


        //System.out.println(customer.statement(Rental.NO_COUPON));
//        System.out.println(customer.statement(Rental.HALF_OFF_COUPON));
//        System.out.println(customer.statement(Rental.DOLLAR_OFF_COUPON));
//        System.out.println(customer.statementInXML(Rental.NO_COUPON));
//        System.out.println(customer.statementInXML(Rental.HALF_OFF_COUPON));
//        System.out.println(customer.statementInXML(Rental.DOLLAR_OFF_COUPON));
    }
}