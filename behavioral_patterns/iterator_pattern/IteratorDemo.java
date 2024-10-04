package behavioral_patterns.iterator_pattern;

public class IteratorDemo {
    public static void main(String[] args){
        // Create a concrete collection
        Collection<String> collection = new ConcreteCollection<String>();
        collection.addItem("Item 1");
        collection.addItem("Item 2");
        collection.addItem("Item 3");

        // Create an iterator for the collection
        Iterator<String> iterator = collection.createIterator();

        // Traverse the collection using the iterator
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
