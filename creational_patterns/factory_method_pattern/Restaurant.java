package creational_patterns.factory_method_pattern;

public class Restaurant {
    public void orderBurger(String request){
        Factory factory = new Factory();
        Burger burger = factory.createBurger(request);
        burger.prepare();
    }
}
