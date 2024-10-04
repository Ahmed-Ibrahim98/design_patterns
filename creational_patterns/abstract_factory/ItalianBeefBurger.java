package creational_patterns.abstract_factory;

public class ItalianBeefBurger implements BeefBurger{
    @Override
    public void prepare() {
        System.out.println("Here's your Italian recipe Beef Burger");
    }
}
