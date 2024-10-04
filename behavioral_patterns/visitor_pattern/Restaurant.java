package behavioral_patterns.visitor_pattern;

public class Restaurant extends Client{
    private final boolean availableAbroad;

    public Restaurant(String name, String address, String number, boolean availableAbroad) {
        super(name, address, number);
        this.availableAbroad = availableAbroad;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
