// Handles US-07: Encapsulation
public class Product {
    // Private variables to protect sensitive data
    private int productId;
    private String productName;
    private double price;

    // Bonus: Overloaded constructor (Default)
    public Product() {
    }

    // Bonus: Overloaded constructor (Parameterized)
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getter and Setter methods
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // Basic validation logic can be added here
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }
}
