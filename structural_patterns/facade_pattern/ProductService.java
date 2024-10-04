package structural_patterns.facade_pattern;

// Another Subsystem
// Simulating a simple "database" class for Product data
public class ProductService {
    public String getProductDetails(String productId) {
        return "Product details for product ID: " + productId;
    }
}
