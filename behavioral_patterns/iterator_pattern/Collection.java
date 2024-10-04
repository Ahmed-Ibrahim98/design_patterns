package behavioral_patterns.iterator_pattern;

// Collection Interface with Generics
public interface Collection<T> {
    Iterator<T> createIterator();
    public void addItem(T item);
}
