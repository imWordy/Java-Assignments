package Assignment6;

import java.time.LocalDate;

public abstract class Employee {
    protected String name;
    protected String panNo;
    protected LocalDate joiningDate;
    protected String designation;
    protected int empId;

    // Constructor
    public Employee(String name, String panNo, LocalDate joiningDate, String designation, int empId) {
        this.name = name;
        this.panNo = panNo;
        this.joiningDate = joiningDate;
        this.designation = designation;
        this.empId = empId;
    }

    // Abstract method
    public abstract double calcCTC();

    // Common display method (optional)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("PAN: " + panNo);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Designation: " + designation);
        System.out.println("Employee ID: " + empId);
    }
}