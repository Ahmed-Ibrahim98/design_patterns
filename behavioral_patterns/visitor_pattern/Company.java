package behavioral_patterns.visitor_pattern;

public class Company extends Client{
    private final int nmbrOfEmployees;

    public Company(String name, String address, String number, int nmbrOfEmployees) {
        super(name, address, number);
        this.nmbrOfEmployees = nmbrOfEmployees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
