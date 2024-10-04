package behavioral_patterns.observer_pattern;

public class MobileAppListener implements EventListener{
    private final String username;

    public  MobileAppListener(String username){
        this.username = username;
    }
    @Override
    public void update(Event eventType) {
        // Actually send the push notification based on an event type
    }
}
