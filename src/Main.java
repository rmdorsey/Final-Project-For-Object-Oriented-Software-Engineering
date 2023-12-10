import Primary.Customer;
import pos.Books.SalesItemBook;
import pos.CDs.SalesItemMusicCD;
import pos.Movies.ChildrensMovie;
import pos.Movies.NewRelease;
import pos.Movies.RegularMovie;
import pos.PS4.SalesItemPS4;
import Primary.Rental;
import pos.SalesItem;
import pos.ShoppingCart;
import Primary.SoldItem;
import pos.VideoGames.SalesItemVideoGame;
import pos.XBOX.SalesItemXBox;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Matt Dorsey", ShoppingCart.FREE_MOVIE_AFTER_10_POINTS);

        //ITEMS
        //MOVIES
        SalesItem movie_independent_day = new RegularMovie("Independence Day");
        SalesItem movie_home_alone = new RegularMovie("Home Alone");
        SalesItem movie_last_unicorn = new ChildrensMovie("The Last Unicorn");
        SalesItem movie_avatar_2 = new NewRelease("Avatar 2");
        //GAME SYSTEMS
        SalesItem ps4 = new SalesItemPS4("Playstation 4");
        SalesItem xbox = new SalesItemXBox("XBOX");
        //BOOKS
        SalesItem book_lonesomeDove = new SalesItemBook("Lonesome Dove");
        SalesItem book_onTheRoad = new SalesItemBook("On The Road");
        //CDs
        SalesItem cd_countryGrammar = new SalesItemMusicCD("Country Grammar");
        SalesItem cd_aceOfBase = new SalesItemMusicCD("Ace of Base");
        //Videos Games
        SalesItem vg_marioBros = new SalesItemVideoGame("Mario Brother");
        SalesItem vg_aceCombat = new SalesItemVideoGame("Ace Combat");

        //RENTALS
        //GAME SYSTEMS RENTED
        customer.addRental(new Rental(xbox, 2));
        customer.addRental(new Rental(ps4, 2));
        //VIDEO GAMES RENTED
        customer.addRental(new Rental(vg_aceCombat,4));
        customer.addRental(new Rental(vg_marioBros, 2));
        //BOOKS RENTED
        customer.addRental(new Rental(book_lonesomeDove,2));
        customer.addRental(new Rental(book_onTheRoad, 2));
        //MUSIC CDs RENTED
        customer.addRental(new Rental(cd_aceOfBase,2));
        customer.addRental(new Rental(cd_countryGrammar, 2));
        //MOVIES RENTED
        customer.addRental(new Rental(movie_independent_day, 2));
        customer.addRental(new Rental(movie_home_alone, 2));
        customer.addRental(new Rental(movie_last_unicorn, 2));
        customer.addRental(new Rental(movie_avatar_2, 3));
        customer.addRental(new Rental(movie_independent_day, 3));


        //SOLD ITEMS
        //MOVIES SOLD
        customer.addSoldItem(new SoldItem(movie_home_alone,SalesItem.SELL_MSRP_PRICE));
        customer.addSoldItem(new SoldItem(movie_last_unicorn,SalesItem.SELL_MSRP_PRICE));
        customer.addSoldItem(new SoldItem(movie_avatar_2,SalesItem.SELL_MSRP_PRICE));
        //GAME SYSTEMS SOLD
        customer.addSoldItem(new SoldItem(xbox,SalesItem.SELL_MSRP_PRICE));
        customer.addSoldItem(new SoldItem(ps4,SalesItem.SELL_MSRP_PRICE));
        //VIDEO GAMES SOLD
        customer.addSoldItem(new SoldItem(vg_aceCombat,SalesItem.SELL_MSRP_PRICE));
        customer.addSoldItem(new SoldItem(vg_marioBros,SalesItem.SELL_MSRP_PRICE));
        //BOOKS SOLD
        customer.addSoldItem(new SoldItem(book_lonesomeDove,SalesItem.SELL_MSRP_PRICE));
        customer.addSoldItem(new SoldItem(book_onTheRoad,SalesItem.SELL_MSRP_PRICE));
        //MUSIC CDs SOLD
        customer.addSoldItem(new SoldItem(cd_aceOfBase,SalesItem.SELL_MSRP_PRICE));
        customer.addSoldItem(new SoldItem(cd_countryGrammar,SalesItem.SELL_MSRP_PRICE));

        System.out.println(customer.statement());
//        System.out.println(customer.statementInXML());

    }
}