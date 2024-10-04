package creational_patterns.abstract_factory;

public abstract class Restaurant {
    public ChickenBurger orderChickenBurger(){
        ChickenBurger chickenBurger = createChickenBurger();
        chickenBurger.prepare();
        return chickenBurger;
    }

    public BeefBurger orderBeefBurger(){
        BeefBurger beefBurger = createBeefBurger();
        beefBurger.prepare();
        return beefBurger;
    }

    public abstract ChickenBurger createChickenBurger();
    public abstract BeefBurger createBeefBurger();
}
