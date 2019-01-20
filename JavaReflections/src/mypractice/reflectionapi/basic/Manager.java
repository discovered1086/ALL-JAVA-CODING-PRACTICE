package mypractice.reflectionapi.basic;

@ReflectionAPITestAnnotation(managerId = "1261265")
public class Manager {
    private String name;
    private String designation;
    private double salary;

    public Manager(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public Manager(String name) {
        this.name = name;
    }

    public Manager() {

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
