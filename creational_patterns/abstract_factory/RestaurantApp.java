package creational_patterns.abstract_factory;

public class RestaurantApp {
    public static void main(String[] arg){
        Restaurant italianRestaurant = new ItalianBurgerRestaurant();
        ChickenBurger chickenBurger = italianRestaurant.orderChickenBurger();

        Restaurant americanRestaurant = new AmericanBurgerRestaurant();
        ChickenBurger chickenBurger1 = americanRestaurant.orderChickenBurger();
    }
}
