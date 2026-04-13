// Handles US-08: Inheritance (Child Class)
public class CollegeStudent extends Student {
    String degree;

    public CollegeStudent(int rollNo, String name, double[] marks, String degree) {
        super(rollNo, name, marks); // Calls the parent constructor
        this.degree = degree;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Reuses parent method
        System.out.println("Degree Program: " + degree);
    }
}
