Composite Pattern:
    # Introduction:
        ** is a structural design pattern
        ** Composes objects into tree structures and then work with these structures as if they were individual
           objects
        ** made up of four elements:
            - Component: a common interface which describes the operations that are common to both the simple and
              complex elements of the tree
            - Leaf: which are basic elements that of the tree that don't have children or sub elements
            - Composite: which has sub elements but doesn't know the concrete classes of its children
            - Client: works in the same way with both complex and primitive objects of the tree via the common
              interface

    # Code Breakdown:
        ** Box: the common interface which has a common operation which is calculating the price of something
        ** Product: an abstract leaf which describes the common attributes and operation of concrete leaves:
            - each concrete leaf or product must have a title and a price
            - and each must have methods that allows for reading the values of title and price
            - it is worth noting that Product implements Box but since it is abstract it left the burden of
              implementing Box's method to the concrete leaves or products which are going to extend it

        ** Book, VideoGame: concrete leaves that extend the Product abstract class
            - since Product implements the Box then the implementation of the abstract methods of the box such
              as calculatePrice is now the responsibility of any class that extends Product in that case
              they are Book and VideoGame classes
            - since Product has a title and price fields then each of our concrete classes' constructors have
              to take in those values and then pass them to the super constructor

        ** CompositeBox: a complex object that extend Box
            - it has a field to store a list of Box objects
            - it has a constructor that takes in any number of box objects and convert them into an
              arraylist and assigns it to the aforementioned field
            - it off course implements box's abstract methods such as calculatePrice in which we loop over the
              list of boxes and call the calculatePrice method of each box and if the box is a simple object
              then we easily access its price field but if it is a complex then the hand down the request to
              the children and so on and then sum the price of all boxes which gives us the total price

        ** DeliveryService: a helper object that takes in a CompositeBox object and stores it which basically
           help us set up our tree structure so that we can treat the tree structure as a single complex object
           and then call the calculatePrice on it

        ** CompositePatternDemo: Client code
            - here we simply create a DeliveryService object and pass it our tree structure which is in the
              form of a complex object
            - then we call a method on that DeliveryService object which helps us calculate the price by calling
              the calculatePrice method

    # In Conclusion:
        ** Composite pattern helps you create a tree like object structure using simple and complex objects
        ** All elements have a common interface allowing the client to allowing clients to treat individual
           objects and composition uniformly
        ** Applies the open/closed principle
        ** you can now introduce new element types into the application without breaking existing code