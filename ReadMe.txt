Design patterns:

# Introduction:
    •	What are design patterns ?
    •	Why were design patterns created ?
    •	Who created these patterns ?
    •	What is design patterns’ main purpose ?
# What are design patterns?
    •	Patterns will not generate ready code for us
    •	Provide a template to follow
    •	A series of formalized best practices tested and verified by developers before us.
    •	A prescription to solve a certain design problem
# Different groups of design patterns:
    •	Creational Patterns
    •	Structural Patterns
    •	Behavioral Patterns
# Creational Patterns:
    •	Deal with the creation of objects
    •	More flexibility in how objects are created
    •	If you have a class that you want to instantiate and that class has many fields and you want to have the
        freedom of how many fields you can provide upon the creation of an object of that class you could use multiple
        constructors each with a different parameter list or you could make one constructor that takes in all values
        and then give it null values for arguments that you currently don’t know the value of or alternatively you
        could use:
        o	BUILDER: follow the template provided by the BUILDER pattern
# Structural Patterns:
    •	Deal with how classes are actually designed
    •	Deal with how inheritance, composition and aggregation can be used to provide extra functionality
    •	Let’s assume that in our application we are storing book objects and there is too many books like hundreds
        of thousands. Like books in a library or books in amazon store and for some reason
        o	We have to represent each book by an object
        o	However, many books (in the thousands) share the same attributes like they have the same author, same
            amazon storage location, same bases it can be delivered to, same provider, etc.
        o	Maybe the only attributes that will differ is the title itself and the price maybe
        o	This will lead to high memory consumption
        o	Hence we can use the template specified by FLYWEIGHT pattern
        o	We will be able to minimize memory usage by sharing as much data as possible between our similar objects
# Behavioral Pattern:
    •	Is concerned with communication and assignment of responsibilities between our objects as our program is
        running
    •	Assume that the state of an object can by changed by other objects and we want to be able to undo the last
        change we can use something called MEMENTO pattern
# To Sum UP:
    •	Design patterns will speed up the development process by
    •	Providing tested and proven development models
    •	At first you may not notice that you require the use of this pattern here or there,  or you may make use of
        them without knowing
