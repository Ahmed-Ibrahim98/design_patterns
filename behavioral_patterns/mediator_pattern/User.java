package behavioral_patterns.mediator_pattern;

public class User extends Component{
    private String name;
    Mediator mediator;

    public User(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
        this.mediator = mediator;
        mediator.registerComponent(this);
    }

    @Override
    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message,
                               Component sender) {
        System.out.println("[" + sender.getName() + "] sent you a message: " + message);
    }
}
