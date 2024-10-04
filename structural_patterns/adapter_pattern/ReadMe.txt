Adapter Pattern
    # Introduction:
        ** Structural design pattern
        ** allows objects with incompatible interfaces to collaborate with one another

    # Project's Idea:
        ** we have an application that shows the menus from various restaurants and gives recommendations
        ** the app uses an old UI and that UI uses XML data format
        ** we found a new library to make things more fancy and revamp our application
        ** but this new library only deals with JSON data format and hence it is not compatible with our
           system and services we provide
        ** hence we need an adapter that works as a middle layer between the old interface and the new
           interface that we are going to use to me our app look nicer
        ** this adapter is going to implement the old interface but is also going to be composed of the new
           interface
        ** the adapter is going to implement the methods of the old interface and the adapter is going to have
           a method or more for the conversion logic like in our example converting xml data to json data
        ** those conversion methods are going to be used to convert the xml data parameters of the old interface
           methods. and the newly converted data is going to be used with an object of the new interface to get
           stuff done

    # Code Breakdown:
        ** XmlData, JsonData:
            - two empty classes that represent a type of data the the old and new interface use
            - it only serves as an example so as not to break the code but doesn't have actual significance

        ** IMultiRestoApp:
            - an old UI interface
            - has abstract methods that takes in xml data format

        ** MultiRestoApp:
            - the concrete app implementing the IMultiRestoApp and all of its methods

        ** FancyUIService:
            - new UI using the new fancy library to revamp our app
            - has the same methods as the concrete MultiRestoApp but the methods in this class only accept
              json data format and not xml

        ** FancyUIServiceAdapter:
            - an adapter class that implements the IMultiRestoApp and is composed of a FancyUIService object
            - implements IMultiRestoApp and all of its methods
            - has a method that converts the xml data to json data and that method is called within the
              implemented methods of the IMultiRestoApp interface
            - after the conversion of the data format the FancyUIService object is then used to call it's
              corresponding method and then we pass it the converted data format
            - this way we use old methods then convert data then use converted data with new methods of the new
              FancyUIService object to do the same functionalities but with a perhaps better User experience

    # Key Takeaways:
        ** the adapter is a class that is able to work with both the client and the service
        ** uses inheritance and composition to enable objects with incompatible interfaces to collaborate with
           one another
        ** it creates a middle layer class that serves as a translator
        ** applies the single responsibility and the open/closed principle
        ** the adapting behavior is now separated and we can introduce new adapters without breaking
           existing code
