package behavioral_patterns.iterator_pattern;

import java.util.List;

// Concrete Iterator Implementation
public class ConcreteIterator<T> implements Iterator<T> {
    private final List<T> items;
    private int position = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        return items.get(position++);
    }
}
