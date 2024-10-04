package creational_patterns.full_factory_pattern;

public class BeefBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Here's your Beef Burger");
    }
}
