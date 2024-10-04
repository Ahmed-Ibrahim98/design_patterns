package creational_patterns.abstract_factory;

public class AmericanBeefBurger implements BeefBurger{
    @Override
    public void prepare() {
        System.out.println("Here's your American recipe Beef Burger");
    }
}
