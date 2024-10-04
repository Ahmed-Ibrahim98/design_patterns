# Mediator Design Pattern

The Mediator design pattern is a behavioral design pattern that centralizes communication between objects.
Instead of objects communicating directly with each other, they communicate through a mediator.
This pattern helps reduce dependencies, making the system more scalable and easier to maintain.

## Steps to Implement the Mediator Pattern

1. **Define the Mediator Interface:**
   - Create a `Mediator` interface that defines abstract methods for communication between a set of objects.

2. **Implement the Concrete Mediator:**
   - Create a `ConcreteMediator` class that implements the `Mediator` interface.
   - This class stores a set of objects, provides a method to register these objects, and defines
     how they should communicate with one another.

3. **Create the Abstract Component:**
   - Define an abstract `Component` class that includes abstract methods for receiving messages
     and retrieving the component's name.

4. **Develop Component Subclasses:**
   - Implement subclasses of the `Component` class (e.g., `User`, `ChatRoom`).
   - Each subclass should implement the abstract methods and include a mediator field to reference
     the mediator for registering and sending messages.

5. **Client Code:**
   - In the client code, create a `ConcreteMediator` object to store and route messages between components.
   - Instantiate several `User` and `ChatRoom` objects, passing them the `ConcreteMediator` to
     enable communication.
   - Use the mediator to facilitate communication between components.

6. **Advantages:**
   - The Mediator pattern encapsulates the interaction logic within the mediator,
     reducing direct dependencies between components.
   - This pattern makes the system more scalable, reusable, and easier to modify or extend.
     You can easily define other mediators to implement different communication strategies.


This README gives a clear and structured explanation of how the Mediator pattern works and how it's applied in
our code.
