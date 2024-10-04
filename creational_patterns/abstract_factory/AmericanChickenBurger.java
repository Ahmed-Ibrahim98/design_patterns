package creational_patterns.abstract_factory;

public class AmericanChickenBurger implements ChickenBurger{
    @Override
    public void prepare() {
        System.out.println("Here's your American recipe Chicken Burger");
    }
}
