package behavioral_patterns.observer_pattern;

public class Store {
    private final NotificationService notificationService;
    public Store(){
        notificationService = new NotificationService();
    }

    public NotificationService getService(){
        return notificationService;
    }
    public void newEventNotification(Event eventType){
        notificationService.notify(eventType);
    }
}
