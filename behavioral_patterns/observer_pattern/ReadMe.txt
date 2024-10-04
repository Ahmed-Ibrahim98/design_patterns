#Observer Design Pattern
    ** Type:
        Behavioral Design Pattern

    ** Description:
        - The Observer pattern facilitates indirect, unidirectional communication between two families
          of objects: from the publisher (subject) and to the subscriber (observer).
        - Communication is managed through a single point of contact, typically a <CLIENT>,
          which creates the subject and registers the observers with the subject.

    ** Key Components:
        - Publisher (Subject): Maintains a list of subscribers (observers) and notifies them of any state changes.
          The publisher does not need to know the specific details of the observers.
        - Subscriber (Observer): Receives updates from the publisher and reacts accordingly.
        - Client: Creates the Publisher and relays to the publisher observer objects to be registered

    ** Customization:
        - An Observer interface can be used if you have different observers that process the relayed information
          differently. This allows for flexibility in how different observers handle updates.
        - You can implement an enum to hold various events. Within the publisher, you can create a map
          of constants (events) as keys and lists of observers as values. This allows you to manage
          different lists of observers for different events or subjects, providing more granular
          control over notifications.

    ** Code Breakdown:
        - Client: Store class which creates a subject object and notification method
        - Abstract Observer: EventListener Interface which define an abstract update method
        - Concrete Observers: EmailMsgListener, and MobileAppListener classes which both implement EventListener
          interface and both handle the update method differently one based on email and the other based on
          username
        - Enum: Event which is a class holding multiple constants representing different subjects
        - Subject: NotificationService class which creates a map with events as keys and values as lists
          has methods for registering and unregistering an observer and a method to notify all observer of
          a certain subject (Event)
        - NotificationManager: a demo class that shows how all of this comes together and how the observer pattern
          components are integrated into a single unit