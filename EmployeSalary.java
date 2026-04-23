import java.util.*;

// Base class
class Employee {
    String name;
    int employeeID;

    // Constructor
    Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }
}

// Derived class (inherits Employee)
class Manager extends Employee {
    double salary; // monthly salary

    // Constructor
    Manager(String name, int employeeID, double salary) {
        super(name, employeeID); // call parent constructor
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

public class EmployeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String name = sc.nextLine();
        int employeeID = sc.nextInt();
        double salary = sc.nextDouble();

        // Create Manager object
        Manager m = new Manager(name, employeeID, salary);

        // Calculate annual salary
        double annualSalary = m.calculateAnnualSalary();

        // Output
        System.out.println("Name: " + m.name);
        System.out.printf("Annual Salary: Rs. %.2f", annualSalary);

        sc.close();
    }
}