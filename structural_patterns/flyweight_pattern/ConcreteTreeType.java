package structural_patterns.flyweight_pattern;

// Concrete Flyweight Class
class ConcreteTreeType implements TreeType {
    private String name;
    private String color;
    private String texture;

    public ConcreteTreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    // Simulates drawing the tree using its intrinsic state, but x, y are extrinsic
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + name + " tree of color " + color + " with texture " + texture +
                " at coordinates (" + x + "," + y + ")");
    }
}
