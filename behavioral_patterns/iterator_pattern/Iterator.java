package behavioral_patterns.iterator_pattern;

// Iterator Interface with Generics
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
