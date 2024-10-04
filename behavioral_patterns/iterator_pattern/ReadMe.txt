Iterator Pattern:
    # Introduction:
        ** It's a behavioral design pattern
        ** extracts the traversal behavior of a collection into a separate object called an iterator
        ** the Iterator then traverses the elements of a collection without exposing its underlying representation
        ** encapsulates all the traversal details
        ** several iterators can go through the same collection at the same time

    # Code Breakdown:
        ** Iterator interface:
            - that uses generics to iterate on a group of objects of certain type which is yet
              to be known
            - has to abstract methods one to check if there is still objects to iterate over and one to get the
              next object in a collection

        ** Collection interface:
            - that uses generics to create a collection that stores a certain type of objects
            - has a two abstract methods one for creating an iterator and one for adding objects of certain type
              to a collection

        ** Concrete Iterator:
            - a class that implements the Iterator interface
            - has a filed to store the collection to iterate over, amd a field to store the position of an
              object in a collection
            - implements the methods in the Iterator interface which have the traversal logic

        ** Concrete Collection:
            - class that implements the Iterator interface and has the logic of managing its data
              like storing a collection in a field and implementing a method to add items to the collection
            - has the implementation for the method that creates an iterator which returns a certain type of
              iterator
            - has an additional method to get the collection stored so that you can pass it to  the
              new concrete iterator instance created by the createIterator method

        ** client Code (IteratorDemo):
            - creates a collection object of a certain type and stores a certain type of objects within it like
              String objects
            - calls the addItem on the collection object to store string objects
            - then call the createIterator method on the collection object to create a new iterator for this
              specific collection
            - use a loop along with the iterator to traverse the collection

    # Key Takeaways:
        ** Iterator pattern simply wanted to separate the logic of traversing a collection from client
           code and hand that over to a helper object called iterator
        ** Iterator pattern is more about creating modular ways to traverse a collection without the client
           knowing anything about their underlying logic
        ** this is a mere example not a production level code as you can see there are areas to improve:
            - the collection is tightly coupled with the iterators which means
                >> dependency between collections and iterators
                >> we are not following the single responsibility principle since collections create
                   iterators as well as manage their own data
                >> collections are hence open for modification which is not exactly following the open/closed
                   principle