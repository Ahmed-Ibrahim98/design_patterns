package creational_patterns.factory_method_pattern;

public class ChickenBurger extends Burger{
    private String name = "Chicken";
    @Override
    public void prepare(){
        System.out.println("Here's your " + name + "Burger");
    }
}
