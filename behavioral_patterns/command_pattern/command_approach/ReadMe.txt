Command Design Pattern:
    - it is a behavioral design pattern that helps you convert a certain request
      like switching light to an object that has every thing about that object which is then used to
      switch the light
    - basically you have a command interface that has a method called execute
    - and then you make concrete commands (SwitchLightsCommand) that implement that command interface
    - each concrete command is composed of a receiver(Light) object as a field and
      a constructor that takes in an instance of such receiver object and assigns it to
      the receiver object field and overrides the execute method and within it you call a certain
      action associated with the receiver object stored in your field
    - after that you have a receiver(Light) class which has a field (switchedOn) that acts as
      a flag to control or be used in methods to control a certain feature (switchLights) about that class
    - and then an invoker(Room) which is composed of a command object as a field and a setter
      for that field that takes in a new instance of command and set it to the field
      and another method that calls the execute method of the command object
    - then you have concrete classes (LivingRoom, Bathroom, etc.) that extend the invoker
      and then a main class or client(HomeApp) that creates object of an invoker(Room) and using polymorphism
      he can assign its value to a new instance of one of its subclasses (LivingRoom) and pass
      the instance a new instance of a specific concrete command(SwitchLightsCommand) and pass
      the instance  a new instance of a specific receiver (Light) and then the object you created
      you can use its execute method to execute  a certain command at runtime (switchLights)
    - you separated the business logic from the invoker and encapsulated the business logic inside the receiver
    - you turned the request into an entire object(command) that has all the necessary information to perform
      a certain task
    - finally you left it up to the client to control which invoker should execute which command to execute
