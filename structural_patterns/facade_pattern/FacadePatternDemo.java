package structural_patterns.facade_pattern;

// Client Code
public class FacadePatternDemo {
    public static void main(String[] args) {
        // Creating the facade for simplified interaction
        ShopFacade shopFacade = new ShopFacade();

        // Using the facade to get all required details with one call
        shopFacade.getFullDetails("USER123", "PROD456", "ORD789");
    }
}
