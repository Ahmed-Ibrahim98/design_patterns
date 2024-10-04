State Pattern:
    # Finite State Machine:
        ** at any given moment there is a finite number of states in which a program can be, and within
           any unique state the program behaves differently
        ** a state can switch the state of our program to another one or not switch at all
        ** these switching rules, called transitions, are finite and predetermined

    # State pattern:
        ** the previous concept is closely related to the state pattern
        ** state pattern is a behavioral design pattern
        ** it allows an object to alter its behavior when its internal state changes

    # Code Breakdown:
        ** Phone Class:
            - it represents a phone which has a state field
            - state field can only be one of three subclasses either the off state or the ready state or the
              locked state
            - it has several methods that returns string that describes action taken by the user like the lock
              method or the home method or the turnOn method or the unlock method
            - it has a setter and getter method for the state field

        ** State Class:
            - an abstract class that represents a general state of a specific phone object
            - has a filed to store a phone object which will have its state altered by the user
            - has the possible actions taken by a user represented as abstract methods which are the onHome method
              or the onOffOn method which the represents the user clicking on the power button or the home button
            - has a constructor which takes in the phone object you are going to deal with and stores it in the
              phone field

        ** OffState, LockedState, ReadyState:
            - three concrete classes that extend the State abstract class and implement the two actions
              onHome, onOffOn methods
            - each class has a different implementation for those two methods and each method returns a
              string which is taken from a corresponding phone method
            - each method uses the phone object's state setter method to return a corresponding state hence
              altering the state of the phone object with each action taken unless you are on home and you click
              the home button again then there is no need to set the state to ready since the state is already
              ready

        ** UsePhone Class:
            - a class that has a main method
            - in the main method a Phone object is created and using the getter method we get its state
            - we call the actions on that state which will either do something or change the state of the phone
              object
            - for example the default state of the phone is the OffState but when we get this state and call
              the onHome method(click the home button) we turn the phone on which also alters the state of the
              phone to locked state and when we click the home button again we unlock the phone which alters
              the state of the phone to ready state and so on

    # State Pattern vs Strategy Pattern:
        ** State can be considered an extension of Strategy as they both are based on composition,
           they change the behavior of the context (ex: phone) by delegating the work to some helper objects
        ** Strategies are independent and completely unaware of each other while States can be dependent as
           you can jump from one state to another
        ** Strategy pattern is all about having different implementations that accomplish the same thing while
           State pattern is all about doing different things based on the state hence the result may vary