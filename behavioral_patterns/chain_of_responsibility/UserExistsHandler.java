package behavioral_patterns.chain_of_responsibility;

public class UserExistsHandler extends Handler{
    private final Database database;

    public UserExistsHandler(Database database){
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidUser(username)){
            System.out.println("This username is not registered");
            System.out.println("Signup to our App Now!");
            return false;
        }
        return handleNext(username, password);
    }
}
