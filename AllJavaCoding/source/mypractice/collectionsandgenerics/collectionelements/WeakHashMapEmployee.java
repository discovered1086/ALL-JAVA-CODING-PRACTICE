package mypractice.collectionsandgenerics.collectionelements;

public class WeakHashMapEmployee {
    private String name;
    private String designation;
    private double salary;

    protected static String version = "1.0.0.1";

    public WeakHashMapEmployee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public WeakHashMapEmployee(String name) {
        this.name = name;
    }

    public WeakHashMapEmployee() {

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

    public static void showVersion() {
        System.out.println(version);
    }

    @Override
    public String toString() {
        return "WeakHashMapEmployee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize was called");
    }
}
