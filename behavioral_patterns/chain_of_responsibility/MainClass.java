package behavioral_patterns.chain_of_responsibility;

public class MainClass {
    public static void main(String[] args){
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService authService = new AuthService(handler);
        authService.logIn("admin_username","admin_password");
    }
}
