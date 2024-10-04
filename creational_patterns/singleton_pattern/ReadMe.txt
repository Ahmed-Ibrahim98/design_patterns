Singleton Design Pattern:
    # Introduction:
        ** it is a creational design pattern
        ** this pattern ensures that only one instance of its kind exists
        ** and it provides a single point of access to it from any other part of our application
        ** just like how there can only be one president of a country, the singleton can be used to represent this
           in code. by making a president class for example that can only have one instance and you can't make a
           second one of it. this is the singleton in a nutshell

    # Code Breakdown:
        ** SimpleSingleton: a basic traditional way of making singleton
            - it is a class with a private constructor to prevent clients from directly instantiating it
            - it has a field that stores an instance of itself
            - it has a method that allow client to reference the instance if there is one already created and if there
              is none then it creates one and returns a reference to it
            - the rest is just other fields and methods that any other class might have

        ** SingletonClass: a more nuanced advanced class that is set up an adapted to be a thread safe singleton
            - it has more mechanisms to ensure that no two threads try to create an instance at the same time
            - it has mechanisms to ensure that no thread will reference an instance while it is still being
              constructed
            - it has mechanisms (Double Checked Locking) to reduce the overhead of trying to reference an instance.
              in case a thread already created an instance then just reference that instance and stop it from going
              through the synchronized block
            - in the end it's just like any other singleton it jut has more parts to make sure it is a thread safe
              singleton

        ** EnumSingleton: an enum that has only a single constant (instance)
            - the rest is just fields and methods that a singleton instance or any class instance might have
            - what is great about using enum to implement the singleton pattern is that you don't have to
              make the constructor private, since it is private by default. you also don't have to make a static
              method to access the constant (instance), you can access it directly. and you don't have to worry about
              thread safety since enums are thread safe by design.

        ** SingletonMain: client code
            - in it we procure the an instance from the three different singletons we discussed above and how to
              work with those instances

    # Quick Question:
        ** why don't i just use an anonymous class in the client code and be done with it?
            well you could and that way would be making a single instance which is in line with the singleton pattern
            but if the instance is supposed to have a lot of data and a lot of methods that the client code will get
            cluttered and becomes harder to read so it's just for simplicity

    # In Conclusion:
        ** a Singleton should be used when a class must have a single instance available to all its clients
        ** this pattern disables all other means of creating objects of a class except for the special static
           creation method
        ** this method either creates a new object or returns an existing instance if it has already been created
        ** this pattern requires special treatment in a multi-threaded environment as its code needs to be adapted
           to handle multiple threads