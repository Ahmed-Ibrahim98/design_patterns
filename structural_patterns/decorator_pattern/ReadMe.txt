Decorator Design Pattern:
    # Introduction:
        ** A structural design pattern
        ** Lets you attach new behaviors to an object by placing this object inside a special wrapper that contains
           these behaviors
        ** is composed of five elements;
            1- an interface (component): it declares the common behaviors for both wrappers and wrapped objects
            2- concrete component:  it's the wrapped class, and it defines the basic behavior which can be altered by
               decorators
            3- Base decorator: it references the wrapped object via the interface so it can reference both the concrete
               component and its decorators
            4- concrete decorators: they extend the base decorator and override the methods of the base decorator but
               still make use of it either before or after their own execution
            5- client: which wraps components in layers of decorators but must work via the component interface

    # Code Breakdown:
        ** DatabaseServiceDecorator: a class simulating a database and has:
            - a method that gives an email of a certain username
            - a method that gives a phone number of a certain username
            - a method that gives a facebook account of a certain username
            - so it basically has those method to simulate a database containing information about the contacts of
              a certain user

        ** INotifier: that is our interface (component):
            - it has two common behaviors for both the wrapper and wrapped objects namely a send(), and getUsername()
              methods
        ** Notifier: a concrete component that implements the INotifier interface
            - its constructor takes in a string and assigns it to a field called username
            - it has a getter method for that field which is one of two method that need to be implemented from the
              INotifier interface
            - it has another method called send which is the second method that we needed to provide implementation for
              and this method basically sends a message to the email of a certain user and it gets that email form
              the DatabaseService object that we created and calls the method that returns an email

        ** BaseNotifierDecorator: this is the base decorator
            - it has a field of type INotifier named wrapped that field can be later be a concrete decorator or a
              concrete component like a Notifier object
            - it of course provides the implementation for the send(), and getUsername() methods. and it does so by
              calling the send() and getUsername of the wrapped object

        ** FacebookDecorator, WhatsAppDecorator: two concrete decorators that extend the BaseNotifierDecorator class
            - it overrides the send() method of the parent and in it, it calls the parent's send() method then
              after the super's send() method call it provides additional behavior which is our aim
            - in doing so we make it possible to make the add on the behavior of the wrapped object and extending a new
              behavior for example if you pass a Notifier object to a new instance of the facebook decorator what
              happens is that when i call the send method of the facebook decorator object is that we now not only send
              a notification by email but also a notification through facebook
            - the behavior of sending a message to the emil comes form the notifier object and the behavior of sending
              a notification through facebook is form the facebook decorator object and what enables this is because
              we wrapped the concrete component within a the decorator which enabled us to call the send method of both
              of them consecutively

        # DecoratorDemo: the client code
            - in it we simply created an INotifier object and set it to a new instance of facebook decorator and we
              passed the instance a new instance of the whatsapp decorator and that instance we passed it a new
              of Notifier
            - doing so made us recursively call the send method of all three of them first the basic send method of
              the Notifier and then the send method of the whatsapp decorator and then facebook decorator at last
            - this pattern solves the problem that we may face when we want to send for example a notification through
              multiple channels but we don't want to make classes for all possible combinations of these channels for
              example we want to send via facebook and whatsapp or whatsapp and email and so on and the more the channels
              through which we may send a notification the larger the number of combination gets and the more it gets
              worse if we went with inheritance as opposed to composition for a solution
            - we don't need to write compo classes instead we can wrap distinct classes to enable various combinations
              and extend the behaviors of an object with the behaviors of another through composition

    # In Conclusion:
        ** The decorator design pattern wraps an exiting object allowing you to add a new functionality to that object
           without altering its structure
        ** assign extra behaviors to your object at runtime without breaking the code that uses that object
        ** applies the single responsibility and open/closed principles
        ** each behavior is isolated in a separate class, and you have the ability to introduce new decorators without
           modifying existing classes