package structural_patterns.composite_pattern;

public class Book extends Product{
    protected Book(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
