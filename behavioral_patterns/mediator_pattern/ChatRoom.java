package behavioral_patterns.mediator_pattern;

public class ChatRoom extends Component{
    private String name;
    public ChatRoom(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
        mediator.registerComponent(this);
    }

    @Override
    public String getName() { // Implement the getName method
        return name; // Or any default name
    }

    @Override
    public void receiveMessage(String message, Component sender) {
        System.out.println("[" + sender.getName() + "] " + message);
    }
}
