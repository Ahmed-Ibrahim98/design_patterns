package structural_patterns.facade_pattern;

// Another Subsystem
// Simulating a simple "database" class for Order data
public class OrderService {
    public String getOrderDetails(String orderId) {
        return "Order details for order ID: " + orderId;
    }
}
