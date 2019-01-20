package mypractice.reflectionapi.basic;

public class EmployeeForReflection {
    private String name;
    private String designation;
    private double salary;

    protected static String version = "1.0.0.1";

    public EmployeeForReflection(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public EmployeeForReflection(String name) {
        this.name = name;
    }

    public EmployeeForReflection() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        System.out.println("Employee Salary Calculation");
        return salary;
    }

}
