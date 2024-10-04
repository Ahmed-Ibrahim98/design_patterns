Chain of Responsibility design pattern:
    - it is a behavioral design pattern
    - it allows you to create handlers each handler takes care of one part of a task and hands the
      task to the next handler till the task is finished
    - here in our project we created a class called Database which represents a database
      we didn't reference a real database instead we made a field type Map called users
      we made a constructor that initializes the users hard codes the map content
      we made two methods one that searches the constructed map users for a key and we call
      the method isValidUser and it returns true if the key exists and false if not and another method
      called isValidPassword that searches the map with one parameter called username and gets the
      value associated with it and  then compares it to a parameter called password and see if they match
      if so it returns true if not it returns false
    - we then create an abstract class called Handler that represents a base handler and it is what directs
      you from one handler to the next.
      it has a private field called next which is of type handler
      it also has a setter method for this field called setNextHandler that takes
      in a parameter of type Handler which is not only used to set the next field
      which would be used to get to the next handler but also returns that very handler as well
      there is an abstract method called handle that takes in two parameters called username and password
      this method is to be implemented by concrete handlers which will extend our abstract Handler class
      there is also another method called handleNext which takes in two parameters username and  password
      and then checks the next field if it is null that means that it is the end of the line and the task has
      been completed and returns true and if not then the task still needs to go through other handlers to be
      finished at which point we call the next handler stored in our next field and then call the handle
      method on it and pass the two arguments username and password
    - we then create a concrete handler called UserExistsHandler that extends Handler
      it has a field called database of type Database and a constructor that has a parameter
      of type Database that is used to initialize the field database
      then we override the handle method defined in Handler that takes in username and password and
      checks if the username is not stored in the database object then print a message to user to tell him
      to sign up first but if the username exists then he calls the handleNext defined in the Handle parent
      class which would then check if this concrete handler has any next handler stored inside the next field
      if so then it calls the handle method again on that next handler if not then it returns false
    - we then create another concrete handler called ValidPasswordHandler and in it also a field for database
      is created and initialized in a constructor and the handle method once again overridden and then
      inside it you check if the password associated with this certain username exists in the database if
      so then handleNext is once again called to direct to the next handler but if it doesn't then a message
      is printed to tell the user that the password is invalid
    - lastly another concrete class called RoleCheckHandler that also extends the Handler class and it also
      overrides the handle method and in it checks if the user name entered is associated with a certain role
      like admin or user and if so print corresponding messages and return true but if none if the conditions
      evaluates to true then call the handleNext once again and let it decide where to go from there if there is
      no next handler stored in the next field associated with this instance then just return false but if
      yes then continue onto the next handler and call its handle method
    - then we created a class called AuthService which has a field called handler of type Handler
      that is initialized in the constructor and a method called logIn which basically gets the
      handle field and runs the handle method on it
    - then finally in the main class we make an object of Database and then
      make an object of Handler and assign it to a new instance of the UserExistsHandler and we pass the
      database object we just created to it and then we call the setter method of its next field
      and give it a new instance of ValidPasswordHandler which also takes in the database object
      and we know this setter method will return the ValidPasswordHandler instance again so call the setter
      method of next field for this instance as well and pass a new instance of RoleCheckHandler and we don't
      call an setter method for this one since it is the end of the line anyway
      then we create an object of the AuthService class and pass it the handler we created and then
      call the login method on that object we created and give it a username and password
      if there is or there is not such a user with such a username and password it will be handled accordingly by
      our abstract and concrete handlers

    - that is the entire logic of the chain of Responsibility pattern example
      i hope it was clear
