package creational_patterns.factory_method_pattern;

public class Factory {
    public Burger createBurger(String request) {
        Burger burger = null;
        if(request.equals("BEEF")){
            burger = new BeefBurger();
        } else if(request.equals("CHICKEN")){
           burger = new ChickenBurger();
        }
        return burger;
    }
}
