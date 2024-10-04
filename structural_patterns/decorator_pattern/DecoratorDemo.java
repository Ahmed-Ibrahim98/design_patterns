package structural_patterns.decorator_pattern;

public class DecoratorDemo {
    public static void main(String[] args) {
        INotifier notifier = new FacebookDecorator(
                new WhatsAppDecorator(
                        new Notifier("Ahmed")
                )
        );
        notifier.send("Live long and prosperous!");
    }
}
