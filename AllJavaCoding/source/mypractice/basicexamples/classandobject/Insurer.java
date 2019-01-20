package mypractice.basicexamples.classandobject;

public class Insurer {
	private String firstName;
	private String lastName;
	private String addressLine1;
	private String addressLine2;
	private String phone;
	
	private InsurancePolicy policies [] ;
	
	public void addPolicy(InsurancePolicy policy){
		
	}
	
	public InsurancePolicy[] getPolicies() {
		return policies;
	}
	public Insurer() {
		super();
	}
	public Insurer(String firstName, String lastName, String addressLine1,
			String addressLine2, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.phone = phone;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
