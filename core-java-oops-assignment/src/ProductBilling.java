// Handles US-04: Method Overloading & Polymorphism
public class ProductBilling {

    // Bill for 1 product
    public double calculateBill(double price1) {
        return price1;
    }

    // Bill for 2 products
    public double calculateBill(double price1, double price2) {
        return price1 + price2;
    }

    // Bill for 3 products
    public double calculateBill(double price1, double price2, double price3) {
        return price1 + price2 + price3;
    }

    // Bonus: Add discount calculation in billing
    public double calculateBill(double price1, double price2, double price3, double discountPercentage) {
        double subtotal = price1 + price2 + price3;
        double discountAmount = subtotal * (discountPercentage / 100);
        return subtotal - discountAmount;
    }
}
