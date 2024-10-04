package behavioral_patterns.mediator_pattern;

public abstract class Component {
    private Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receiveMessage(String message, Component sender);
    public abstract String getName();
}
