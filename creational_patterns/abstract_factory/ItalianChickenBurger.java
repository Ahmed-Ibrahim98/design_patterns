package creational_patterns.abstract_factory;

public class ItalianChickenBurger implements ChickenBurger{
    @Override
    public void prepare() {
        System.out.println("Here's is your Italian recipe Chicken Burger");
    }
}
