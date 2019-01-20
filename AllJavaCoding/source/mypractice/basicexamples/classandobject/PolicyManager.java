package mypractice.basicexamples.classandobject;

public class PolicyManager {
	private InsurancePolicy [] policies;
	
	public void addInsurancePolicy(InsurancePolicy policy){
		
	}
   public void removeInsurancePolicy(InsurancePolicy policy){
		
	}
    public void listInsurancePolicy(Insurer insurer){
		
	}
    public void addInsurerToPolicy(Insurer insurer,InsurancePolicy policy){
    	policy.setInsurer(insurer);
    	insurer.addPolicy(policy);
    }
}	
