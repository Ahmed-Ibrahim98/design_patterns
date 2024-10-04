Template Method Pattern:
    - We took a method that contained an algorithm that does a certain task
    - We saw that for various objects the algorithms steps are the same only the steps implementation
      is different
    - We decided to make a base class to house that method and call it a template method
    - We decided to turn the algorithm steps into methods that have the steps implementation contained within those
      methods
    - only those steps (Methods) that had the same implementation across all objects are to be defined and
      implemented within the base class
    - as for steps (Methods) that had different implementation across all objects they are to be abstract and
      implementation is to be left for subclasses that implement the base class
    - this way we maintained the algorithm's structure while at the same time eliminated code duplication
    - and while we were at it allowed for mor flexibility to define the our own implementation for certain steps