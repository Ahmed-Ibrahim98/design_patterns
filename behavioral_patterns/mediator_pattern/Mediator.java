package behavioral_patterns.mediator_pattern;

public interface Mediator {
    void registerComponent(Component component);
    void sendMessage(String message, Component sender);
}
