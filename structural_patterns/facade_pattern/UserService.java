package structural_patterns.facade_pattern;

// A subsystem
// Simulating a simple "database" class for User data
public class UserService {
    public String getUserDetails(String userId) {
        return "User details for user ID: " + userId;
    }
}
