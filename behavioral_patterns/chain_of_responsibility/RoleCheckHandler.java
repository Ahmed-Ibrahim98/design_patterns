package behavioral_patterns.chain_of_responsibility;

public class RoleCheckHandler extends Handler{

    @Override
    public boolean handle(String username, String password) {
        if(username.equals("admin_username")){
            System.out.println("Loading Admin Dashboard");
            return true;
        }else if(username.equals("user_username")){
            System.out.println("Loading User Homepage");
            return true;
        }
        return handleNext(username, password);
    }
}
