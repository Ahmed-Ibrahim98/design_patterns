package behavioral_patterns.observer_pattern;

public class NotificationManager {
    public static void main(String[] args){
        Store store = new Store();
        store.getService().subscribe(Event.SALE,
                new EmailMsgListener("Test@test.com"));
        store.getService().subscribe(Event.SALE,
                new EmailMsgListener("Test2@test.com"));
        store.getService().subscribe(Event.SALE,
                new EmailMsgListener("Test3@test.com"));

        store.newEventNotification(Event.SALE);
    }
}
