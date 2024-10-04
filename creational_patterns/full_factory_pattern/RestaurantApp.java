package creational_patterns.full_factory_pattern;

public class RestaurantApp {
    public static void main(){
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger burger = beefRestaurant.orderBurger();

        Restaurant chickenRestaurant = new ChickenBurgerRestaurant();
        Burger burger1 = chickenRestaurant.orderBurger();
    }
}
