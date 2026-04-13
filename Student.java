// Handles US-01, US-02, US-03, and Bonus Tasks (Array average, static count)
public class Student {
    int rollNo;
    String name;
    double[] marks; // US-03: Array of marks

    // Bonus: Add student count using static
    static int studentCount = 0;

    public Student(int rollNo, String name, double[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        studentCount++;
    }

    // US-01: Display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Students Enrolled: " + studentCount);
    }

    // US-02: Format student name
    public void formatName() {
        System.out.println("--- Name Formatting ---");
        System.out.println("Original Name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Name Length: " + name.length());
    }

    // US-03: Print array using loop
    public void displayMarks() {
        System.out.print("Marks Array: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    // Bonus: Calculate average of marks array
    public double calculateAverageMarks() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}