package mypractice.collectionsandgenerics.collectionelements;
import java.util.Date;


public class Manager extends Employee 
implements Cloneable , Comparable
{
	private String department;
	private double incentive;
	private Date joinDate;
	
	public Manager() {
		super();
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Manager(String name, String designation, double salary,
			String department, double incentive) {
		super(name, designation, salary);
		this.department = department;
		this.incentive = incentive;
	}
	public Manager(String name, String designation, double salary) {
		super(name, designation, salary);
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public double calculateSalary() {
		System.out.println("Manager Salary Calculation");
		return getSalary() + incentive;
	}
	
	protected Object clone() 
	throws CloneNotSupportedException {
		return super.clone();
	}
	
 	public int compareTo(Object o) {
		Manager m = (Manager) o;
		if(m.getSalary() == getSalary())
		return 0;
		else if(m.getSalary() > getSalary())
			return 1;
		else
			return -1;
	} 
	public String toString()
	{
		return "Name " + getName() + " Designation " + getDepartment() + " Salary " + getSalary(); 
				
	}
	
}


