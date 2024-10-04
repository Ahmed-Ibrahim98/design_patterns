package structural_patterns.composite_pattern;

public class VideoGame extends Product{
    protected VideoGame(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
