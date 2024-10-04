package creational_patterns.factory_method_pattern;

public class Burger {
    private String name = "Usual";
    public void prepare(){
        System.out.println("Here's your " + name + " Burger");
    }
}
