Bridge Pattern:
    # Introduction
        ** A structural design pattern
        ** when you try to extend a class in two independent dimensions (the Type, and Way) or in our example
           the pizza and recipe you should switch from inheritance to composition, otherwise you will write too
           many classes the more recipes and pizzas there are
        ** doing so won't change the class hierarchy of either the type classes and the way classes if you ever
           add a new type (pizza) or a new recipe (mexican pizza recipe)
        ** so the bridge pattern splits a large class into two separate hierarchies which can be developed
           independently of each other
        ** in the gang of four book these two hierarchies are referred to as abstraction and implementation
        ** abstraction is a high level control layer and this layer isn't supposed to do any real work on its own
           it delegates the work to the implementation layer
        ** the abstraction here is the (restaurant) since they don't do real work themselves but call the
           functions of the implementation which is the (pizza)

    # Project Idea:
        ** first you have a pizza deliver business
        ** to implement the different transactions you decided to make an abstract pizza class and several
           concrete products like Pepperoni Pizza and Veggie Pizza but then your business is booming
        ** the delivery app now delivers pizza from two different restaurants one makes Pepperoni Pizza
           and Veggie Pizza with american recipes and one also makes Pepperoni Pizza and Veggie Pizza
           but with italian recipes
        ** so what to do? do you make four concrete products which are (Italian Pepperoni pizza, American
           Pepperoni Pizza, Italian Veggie Pizza and American Veggie Pizza) ??
        ** what if you had more than just two types of pizza and more than just two recipes to make them
           aside from the Italian and American ways then these classes would increase exponentially
        ** doesn't this seem kinda messed up ? and you are still gonna have to handle the logic of which pizza
           to deliver
        ** so we came up with an idea and that is LETS make an abstract restaurant and that
           is going to use composition and has a field that stores a pizza object then i am going to use it
           as a bridge between the concrete restaurants and concrete products but instead of making
           italian pepperoni pizza and american pepperoni pizza i am going to only make a single concrete
           product of each kind so i am going to make pepperoni pizza and use that as a pizza bridge object
           and then within the my concrete restaurant i am going to set other characteristics of that pizza
           object that makes turn it from just a regular pepperoni pizza to either italian or american pepperoni
           pizza
        ** that is basically then main idea of the bridge design pattern

    # Code Breakdown:
        ** Pizza: an abstract class
            - has three fields for sauce, crust, and toppings
            - has setter methods for all three fields
            - has two abstract methods (assemble, qualityCheck)

        ** PepperoniPizza, VeggiePizza: two concrete products implementing Pizza
            - each class implements the Pizza class two abstract methods (assemble, qualityCheck)
            - each method uses one or more of the Pizza parent class's fields to drive its behavior

        ** Restaurant: an abstract class to be extended
            - Uses composition and stores a Pizza object to connect the concrete restaurants to concrete pizzas
            - has three abstract methods that are supposed to set the values of pizza fields through pizza
              class setter methods
            - has a constructor that takes in a reference to a pizza object and assign the reference to
              the pizza field object
            - has a deliver() method that calls in the the three aforementioned methods and pizza's own methods
              (assemble, qualityCheck)

        ** ItalianRestaurant, AmericanRestaurant: concrete restaurant that implement Restaurant
            - each implement the Restaurant's three abstract methods by using the setter methods of the pizza
              object stored in the parent Restaurant

        ** BridgeDemo: a demo of how the pattern is used
            - makes a concrete restaurant object and passes a concrete pizza instance within the constructor
              of the concrete restaurant's new instance
            - then calls the deliver method on the concrete restaurant object

        ** here in this code the pizza object within the abstract restaurant as well as the restaurant itself as a
           combination work together as a bridge between the products and their families (pizzas, and recipes)

    # Key takeaway:
        ** so all in all a bridge is the link between an abstract product and an abstract family where one of
           them houses a reference to the other