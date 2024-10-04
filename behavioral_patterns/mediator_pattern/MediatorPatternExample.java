package behavioral_patterns.mediator_pattern;

public class MediatorPatternExample {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ChatRoom chatRoom = new ChatRoom(mediator, "ChatRoom 1");
        User user1 = new User(mediator, "User 1");
        User user2 = new User(mediator, "User 2");
        User user3 = new User(mediator, "User 3");

        user1.sendMessage("Hello everyone!");
        user2.sendMessage("Hi there!");
        user3.sendMessage("Hey guys!");
        System.out.println(mediator.getComponents().values());
    }
}
