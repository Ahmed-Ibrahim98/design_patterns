package creational_patterns.factory_method_pattern;

public class RestaurantApp {
    public static void main(String[] arg){
        Restaurant restaurant = new Restaurant();
        restaurant.orderBurger("BEEF");
    }
}
