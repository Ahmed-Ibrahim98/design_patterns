package structural_patterns.decorator_pattern;

public class WhatsAppDecorator extends BaseNotifierDecorator{
    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message){
        super.send(message);
        String phoneNbr = databaseService.getPhoneNbrFromUsername(getUsername());
        System.out.println("Sending " + message + " by WhatsApp on " + phoneNbr);
    }
}
