Facade Design Pattern:
    # Introduction:
        ** A structural design pattern
        ** Provides a simplified interface to a library, a framework, or any other complex set of classes
        ** it is composed of four elements:
            1- Facade: it is a class that provides convenient access to a particular part
               of the subsystem's functionality. it knows where to direct a client's request and how to operate
               all the moving parts of these requests
            2- Additional Facade: when a facade grows too big and becomes a god object, making all of our code depend
               on it. to avoid that an additional facade class can be created to prevent polluting a single facade
               with unrelated features. and we do so because the idea of a facade is providing a simple interface
               to the client, and if the code becomes too dependent on this class that might make it another complex
               structure and no longer a simple object.
               the additional facades can be used by both the client and other facades and may come in handy in
               such use cases
            3- Complex Subsystem Classes: these classes are represented by various objects and classes provided by
               a third party library
               the facade initializes these objects in the correct order and supplies them with data and the proper
               format.
               the subsystem classes aren't aware of the facade's existence, they operate within the system and work
               with each other directly
            4- The Client: it uses the facade instead of calling the subsystem objects directly

    # Code Breakdown:
        ** Subsystems (Services):
            - UserService: Simulates a service that retrieves user data.
            - ProductService: Simulates a service that retrieves product data.
            - OrderService: Simulates a service that retrieves order data.

        ** Facade Class (ShopFacade):
            - Provides a simplified interface to the client by exposing a single method getFullDetails that internally
            calls the respective services' methods to fetch the details.

        ** Client:
            - The FacadePatternDemo class interacts with the system via the ShopFacade without needing to know the
              details of the individual subsystems.

        ** there were no need for additional facades since our example is very simple we didn't create any

    # In Conclusion:
        ** A facade is a class that serves as a front-facing interface that masks complex underlying structural code
        ** improves the readability and usability of a software library by hiding the interaction of its components
        ** applies the single responsibility principle
        ** facade defines entry points to each level of a subsystem, thus decoupling multiple subsystems and forcing
           them to communicate only through facades