// Handles US-05 and US-06
public class Employee {
    int empId;
    String empName;
    double salary;

    // US-06: Shared company name using static variable
    static String companyName = "Tech Academy";

    // US-05: Initialize employee details using constructor
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println(
                "Emp ID: " + empId + " | Name: " + empName + " | Salary: $" + salary + " | Company: " + companyName);
    }
}