package behavioral_patterns.visitor_pattern;


import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {
    public static void main(String[] args){
        Client bank = new Bank("Misr", "Talkha",
                "203040", 5);
        Client company = new Company("Pharma", "Talkha",
                "253545", 5000);
        Client resident = new Resident("Ahmed", "Talkha",
                "152535", "Mid");
        Client restaurant = new Restaurant("Dalla3 Kirshak", "port fouaad",
                "2526", true);

        List<Client> clients = new ArrayList<>();
        clients.add(bank);
        clients.add(company);
        clients.add(resident);
        clients.add(restaurant);

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMail(clients);
    }
}
