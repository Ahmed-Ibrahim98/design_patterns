Visitor Pattern:
    # Introduction:
        ** A behavioral design pattern
        ** Separates the algorithms or behaviors from the objects on which they operate
        ** Basically it allows you to extend the functionality of a group of objects without altering the
           objects themselves

    # Code Breakdown:
        ** Client: (element) abstract class to be extended
            - has common fields
            - has a constructor for initializing those fields
            - has abstract accept method that takes in a visitor object as a parameter

        ** Bank, Company, Resident, Restaurant: (concrete elements) concrete classes extending Client class
            - each has its own special field(s)
            - each has its own constructor for initializing its field(s) and its parent's fields
            - each implements the accept method and calls the visitor object's visit method and pass it a
              reference to itself

        ** Visitor: an interface
            - has several overloaded visit method each taking in a different concrete client object

        ** InsuranceMessagingVisitor: a class extending the visitor interface
            - has a method called sendInsuranceMail which takes in a list of clients as a parameter
              then loops through the list and calls the accept method on each concrete client object and
              pass it a reference to itself
            - has the implementation of the several overloaded visit method defined in the visitor interface

        ** VisitorDemo: client code
            - creates several concrete client object by means of polymorphism
            - creates a list which is an array list of client objects
            - adds newly created concrete client objects to the list
            - creates a concrete visitor object
            - calls the sendInsuranceMail method on that concrete visitor object

    # Key Takeaways:
        ** extending the functionality by making a visitor makes the concrete elements adheres to
            - single responsibility principle
            - open/closed principle

        ** you can introduce new visitors to change the behavior of the visit methods and doing so
           would make your concrete visitors interchangeable at runtime which is better for the flexibility of
           your program

        ** the visitor patter uses something called double dispatch and what that is:
            - basically the element accept method takes in a visitor object as a parameter
            - and the visitor visit method takes in an element object as a parameter
            - doing so lets visitor object know what kind of element object is operating the visit method
              and this in turn makes us able to know which overloaded visit method to call