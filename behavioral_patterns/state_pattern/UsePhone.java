package behavioral_patterns.state_pattern;

public class UsePhone {
    public static void main(String[] args){
        Phone phone = new Phone();
        System.out.println(phone.getState().onHome());
        System.out.println(phone.getState().onHome());
        System.out.println(phone.getState().onOffOn());
    }
}
