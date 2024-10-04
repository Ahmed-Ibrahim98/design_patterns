package creational_patterns.abstract_factory;

public class AmericanBurgerRestaurant extends Restaurant{
    @Override
    public ChickenBurger createChickenBurger() {
        return new AmericanChickenBurger();
    }

    @Override
    public BeefBurger createBeefBurger() {
        return new AmericanBeefBurger();
    }
}
