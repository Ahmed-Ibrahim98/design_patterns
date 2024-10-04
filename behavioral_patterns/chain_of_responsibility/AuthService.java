package behavioral_patterns.chain_of_responsibility;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler){
        this.handler = handler;
    }

    public boolean logIn(String email, String password){
        if(handler.handle(email, password)){
            System.out.println("Login Successful");
            return true;
        }
        return false;
    }
}
