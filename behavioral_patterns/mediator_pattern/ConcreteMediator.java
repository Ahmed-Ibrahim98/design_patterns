package behavioral_patterns.mediator_pattern;

import java.util.HashMap;

public class ConcreteMediator implements Mediator{
    private HashMap<String, Component> components;

    public HashMap getComponents(){
        return components;
    }

    public ConcreteMediator() {
        components = new HashMap();
    }

    @Override
    public void registerComponent(Component component) {
        components.put(component.getName(), component);
        System.out.println("Registered component: " + component.getName());
    }

    @Override
    public void sendMessage(String message, Component sender) {
        for (Component component : components.values()) {
            if (component != sender) {
                component.receiveMessage(message, sender);
            }
        }
    }
}
