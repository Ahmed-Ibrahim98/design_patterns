package structural_patterns.flyweight_pattern;

// Client Code
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();

        Tree tree1 = new Tree(1, 2, treeFactory.getTreeType("Oak", "Green", "Smooth"));
        Tree tree2 = new Tree(3, 4, treeFactory.getTreeType("Pine", "Dark Green", "Rough"));
        Tree tree3 = new Tree(5, 6, treeFactory.getTreeType("Oak", "Green", "Smooth"));
        Tree tree4 = new Tree(7, 8, treeFactory.getTreeType("Pine", "Dark Green", "Rough"));

        tree1.draw();
        tree2.draw();
        tree3.draw();
        tree4.draw();
    }
}
