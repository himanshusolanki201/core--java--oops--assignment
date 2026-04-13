// Master execution file
public class Main {
    public static void main(String[] args) {
        System.out.println("========== STUDENT SYSTEM ==========");

        // US-03: Create an array of 5 marks
        double[] studentMarks = { 85.5, 90.0, 78.5, 92.0, 88.0 };

        // US-01: Create a Student object
        Student student1 = new Student(101, "Alice Smith", studentMarks);
        student1.displayDetails();

        // US-02: String formatting
        student1.formatName();

        // US-03: Print array loop and Bonus (average)
        student1.displayMarks();
        System.out.println("Average Marks: " + student1.calculateAverageMarks());

        System.out.println("\n========== INHERITANCE SYSTEM ==========");
        // US-08: Distinguish between general and college students
        double[] collegeMarks = { 95.0, 89.5, 91.0, 88.5, 94.0 };
        CollegeStudent cStudent = new CollegeStudent(201, "Bob Jones", collegeMarks, "B.Sc Computer Science");
        cStudent.displayDetails(); // Displays parent + child properties

        System.out.println("\n========== EMPLOYEE SYSTEM ==========");
        // US-05 & US-06: Employee initialization and static shared data
        Employee emp1 = new Employee(1, "John Doe", 55000);
        Employee emp2 = new Employee(2, "Jane Roe", 60000);
        emp1.displayEmployee();
        emp2.displayEmployee(); // Notice company name is shared

        System.out.println("\n========== PRODUCT & ENCAPSULATION ==========");
        // US-07: Encapsulation (Protecting details)
        Product laptop = new Product();
        laptop.setProductId(5001);
        laptop.setProductName("Developer Laptop");
        laptop.setPrice(1200.50); // Set via secure setter

        System.out.println("Product ID: " + laptop.getProductId());
        System.out.println("Product Name: " + laptop.getProductName());
        System.out.println("Product Price: $" + laptop.getPrice()); // Accessed via secure getter

        System.out.println("\n========== BILLING & POLYMORPHISM ==========");
        // US-04: Method Overloading for billing
        ProductBilling billing = new ProductBilling();
        System.out.println("Bill for 1 product: $" + billing.calculateBill(100.0));
        System.out.println("Bill for 2 products: $" + billing.calculateBill(100.0, 50.0));
        System.out.println("Bill for 3 products: $" + billing.calculateBill(100.0, 50.0, 200.0));

        // Bonus: Billing with discount
        System.out.println("Bill for 3 products (with 10% discount): $" +
                billing.calculateBill(100.0, 50.0, 200.0, 10.0));
    }
}