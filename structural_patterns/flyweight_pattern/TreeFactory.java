package structural_patterns.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory Class
class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + color + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new ConcreteTreeType(name, color, texture));
            System.out.println("Created new TreeType: " + key);
        }
        return treeTypes.get(key);
    }
}
