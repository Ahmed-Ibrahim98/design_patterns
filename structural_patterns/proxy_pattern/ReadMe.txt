Proxy Design Pattern:
    # Introduction:
        ** A structural design pattern:
        ** It provides a substitute for another object and controls access to that object, allowing you to perform
           something before or after the request reaches the original object
        ** It's composed of Four elements:
            - A Service Interface: this interface is that of the service, and the proxy must follow this interface to
              be able to disguise itself as a service object
            - Service: is the actual implementation of the interface. it is a class that provides some useful business
              logic for our application
            - Proxy: it has a reference field that points to a Service object. after the proxy finishes the work it
              was intended to do, usually, it passes the request to the service
            - Client: it should work with both the services and proxies via the same interface, by doing that, the
              client can pass a proxy object to a code that expects a service object

    # Scenario:
        ** Suppose the internet is a class in your application and every time a user tries to connect to a particular
           website he or she can create an instance of that class and call a connectTo method for example and boom
           it's done
        ** Now suppose that for the requirement for the Internet class you have to restrict access to a couple banned
           websites for particular users however should you do so from within the internet class you would be
           restricting everybody and none would be able to access those banned website.
        ** Then what we need is an intermediary server, a proxy that checks the user request among a list of banned
           websites and if the user tries to access any of these websites an access denied error would pop up for
           example
        ** Next we will show how to do that in code using the Proxy design pattern

    # Code Breakdown:
        ** Internet: It's the service interface
            - it only has one abstract method called connectTo()
        ** RealInternet: a Concrete service class that implements the Internet interface
            - implements the connectTo() method
        ** ProxyInternet: This is our Proxy class and in it we have a reference field that point to a RealInternet
           object. it also implements the Internet interface
            - it has a field that stores a list of strings each string represents a banned website
            - since it also implements the Internet interface it also provide implementation for the connectTo()
              method
            - in this very method we check the list of banned sites everytime a user tries to connect to a host
              through the connectTo method and if it is a banned site and Access Denied is printed out and if not
              then the real connectTo of the RealInternet object is called and the user may connect to the site
        ** ProxyPatternDemo: that is our client.
            - in it we create an Internet object and make it point to a new instance of our proxy class which is
              the ProxyInternet.
            - then we call the connectTo() method on it with a website we want to connect to as an argument.
            - the proxy will take care of connecting us to the site of we are allowed

        # In Conclusion:
            ** The Proxy design pattern allows you to control the access to a particular object by performing
               something before or after the request reaches that object
            ** The proxy must implement the same interface of the original object in question allowing it to be used
               as a substitute for that object
            ** additionally the proxy can manage the life cycle of the service object if clients don't care about it
               and the proxy object will still work even if the service object isn't ready or isn't available
            ** This pattern applies the open/closed principle, as you can introduce new proxies without changing the
               service not the clients