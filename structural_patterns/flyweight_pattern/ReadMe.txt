Flyweight Design Pattern:
    # Introduction:
        ** A structural design pattern.
        ** Lets you fit more objects in the available RAM by sharing common parts of state between multiple
           objects instead of storing all of the data in each object individually
        ** This pattern is composed of four elements:
            1- Flyweight class: it contains a portion of the original object's state. the same flyweight
               object is reused in many different "CONTEXTS" and the state stored inside a flyweight is called
               ((intrinsic))
            2- Context class: it contains the extrinsic state, unique across all original objects. when a
               Context is paired with a Flyweight object, it represents the full state of the original object
            3- Flyweight Factory: to create the Flyweights what you need is a Flyweight Factory. this class
               manages a pool of existing flyweights. with the factory clients don't create flyweights directly,
               instead they call the factory which looks over previously created flyweights and either returns
               an existing one that matches the provided search criteria or creates a new one if nothing is found
            4- Client: from the client's perspective a flyweight is a normal object just like any other object.

    # Code Breakdown:
        ** TreeType: An interface for that has the common operation between all flyweights
            - it has an abstract draw method

        ** ConcreteTreeType: A Flyweight that implements the TreeType interface.
            - it has three fields that stores a portion of an original Tree object and those fields are name, color,
              and texture
            - the draw method is overridden an in it we use the intrinsic state stored in the aforementioned three
              fields as well as extrinsic state represented by the coordinates (X,Y).
            - it has a Constructor to set the three fields

        ** TreeFactory: it's a class that creates ConcreteTreeType Flyweight objects and has a pool that stores them
            - it has a hash map for the flyweight objects
            - it has a method to check if a certain flyweight object exists in the pool and if it does then return a
              reference to it if not then create a new one and store it in the pool and return a reference to it.
              similar to how Java manages strings in a String pool.

        ** Tree: that is our Context which uses a flyweight object as part of its internal state
            - it's state is composed of extrinsic state which is represented by the (X,Y) primitive variables
              and an intrinsic state which is stored within a flyweight object and both make up the full state
              of a Tree object
            - it has a constructor to set the initial values for the extrinsic state variables and initializes the
              flyweight object
            - it also has a draw methods in which the draw method of the flyweight object is called

        ** FlyweightPatternDemo: which is our client
            - here we create a TreeFactory object first (which is our Flyweight Factory) and then
            - then we create several tree objects by making a new instance of Tree class and provide the constructor
              with the extrinsic data and as for the intrinsic we call the tree factory object method and provide it
              with the intrinsic data to see if such flyweight object exists and if so return and a reference to it
              so that it may be referenced by the flyweight object in the Tree object and if not they make one with
              this intrinsic data and return a reference to it just as well.
            - then we simply call the Tree object draw method which takes care of drawing a tree of certain
              characteristics at a certain coordinates

        ** NOTE: doing this reduced the amount of data each tree object needed to store to make up it's state and
                 the tree object only referenced the intrinsic data that is common to other tree objects instead
                 of having every tree storing its entire data sets. doing this will prove to be valuable when you
                 a huge amount of tree objects and little amount of RAM

    # In Conclusion:
        ** A Flyweight refers to an object that minimizes memory usage by sharing some of the initial object's
           data with other similar objects
        ** Should only be used when your program must support a huge number of similar objects which barely
           fit into the available amount of RAM
        ** Applying this pattern will split the state of the initial object into two:
            - an Intrinsic-immutable state
            - and an extrinsic-mutable state