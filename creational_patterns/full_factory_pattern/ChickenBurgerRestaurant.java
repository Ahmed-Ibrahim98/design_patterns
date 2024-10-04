package creational_patterns.full_factory_pattern;

public class ChickenBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
}
