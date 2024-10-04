package behavioral_patterns.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

// Concrete Collection Implementation
public class ConcreteCollection<T> implements Collection<T> {
    private final List<T> items = new ArrayList<>();

    @Override
    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items); // Delegate iterator creation to a separate class
    }
}
