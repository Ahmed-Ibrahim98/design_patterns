package structural_patterns.facade_pattern;

// The Facade class to simplify interaction with subsystems
public class ShopFacade {
    private final UserService userService;
    private final ProductService productService;
    private final OrderService orderService;

    public ShopFacade() {
        this.userService = new UserService();
        this.productService = new ProductService();
        this.orderService = new OrderService();
    }

    // Simplified method to get all details in one place
    public void getFullDetails(String userId, String productId, String orderId) {
        System.out.println(userService.getUserDetails(userId));
        System.out.println(productService.getProductDetails(productId));
        System.out.println(orderService.getOrderDetails(orderId));
    }
}
