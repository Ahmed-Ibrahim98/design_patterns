package creational_patterns.factory_method_pattern;

public class BeefBurger extends Burger{
    private String name = "Beef";
    @Override
    public void prepare(){
        System.out.println("Here's your " + name + "Burger");
    }
}
