In a traditional approach:
    - if you wanted to make home automation app that controls the light of all rooms
    - you would need to first create a class that represents lighting and which has a method
      that controls the light state from on and off and a method that returns the state of the light
    - then you would need to create a super class that represent a room which would be composed of a light
      object and a method that invokes invokes the light switch method on the light object
    - then you would make concrete rooms that extend the super class like a livingRoom, bathroom, etc.
    - then you would make a house class which is composed of an arraylist of rooms each room is a Room object
      that is also a concrete room and then a constructor to initialize the arraylist and a method to add rooms
      to the list of rooms
    - then you would make the app itself in which you make an object of house and add to it instances of
      concrete rooms and then you loop on all the rooms in the list and invoke the method that invokes light
      object light switch method
    - this way is clean and all and we even applied the open closed principle but there is a few shortcomings
      first of all you have got an enormous number of subclasses and each time you modify the light's logic
      in the base class Room it affects all of those subclasses which makes our code vulnerable and prone to
      breaking
    - suppose that the home owner equipped sensors for his bathroom to control the light on and off so he
      no longer need to use the app to turn on and off the light in his bathroom but our app currently
      doesn't give him the flexibility to turn on and off the light or remove this feature for a specific room
      because the bathroom class as well as all other concrete rooms extends the Room class in which the business
      logic for controlling light is defined there for all our rooms
    - the invoked operations (i.e,. turning on the light) might need to be called from multiple places
      (places that are not considered rooms like a floor lamp lighting or a front door outside lighting) in
      our application and since it doesn't make sense to make them to extend Room in which the light switching
      business logic is defined things get tricky, i would need to duplicate the light switching logic in those
      new classes
    - for all these reasons the command approach is then introduced, for more on it read the readme file in
      the ReadMe file of the package called command_approach in which we will describe the benefits of
      of the command pattern and how it is used