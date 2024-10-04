package creational_patterns.abstract_factory;

public class ItalianBurgerRestaurant extends Restaurant{
    @Override
    public ChickenBurger createChickenBurger() {
        return new ItalianChickenBurger();
    }

    @Override
    public BeefBurger createBeefBurger() {
        return new ItalianBeefBurger();
    }
}
