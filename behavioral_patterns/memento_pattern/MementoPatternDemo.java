package behavioral_patterns.memento_pattern;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");

        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.getMemento());
        System.out.println("Restored to State: " + originator.getState());

        originator.getStateFromMemento(caretaker.getMemento());
        System.out.println("Restored to State: " + originator.getState());
    }
}
