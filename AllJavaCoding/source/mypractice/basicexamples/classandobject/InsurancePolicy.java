package mypractice.basicexamples.classandobject;

import java.util.Date;

public class InsurancePolicy {
	private Insurer insurer;
	private String termTable;
	private Date maturityDate;
	private double sumAssured;
	private double rateOfIncrement;
	private boolean suspended;
	
	
	

	public InsurancePolicy() {
		super();
	}




	public InsurancePolicy(Insurer insurer, String termTable,
			Date maturityDate, double sumAssured, double rateOfIncrement,
			boolean suspended) {
		super();
		this.insurer = insurer;
		this.termTable = termTable;
		this.maturityDate = maturityDate;
		this.sumAssured = sumAssured;
		this.rateOfIncrement = rateOfIncrement;
		this.suspended = suspended;
	}




	public Insurer getInsurer() {
		return insurer;
	}




	public void setInsurer(Insurer insurer) {
		this.insurer = insurer;
	}




	public String getTermTable() {
		return termTable;
	}




	public void setTermTable(String termTable) {
		this.termTable = termTable;
	}




	public Date getMaturityDate() {
		return maturityDate;
	}




	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}




	public double getSumAssured() {
		return sumAssured;
	}




	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}




	public double getRateOfIncrement() {
		return rateOfIncrement;
	}




	public void setRateOfIncrement(double rateOfIncrement) {
		this.rateOfIncrement = rateOfIncrement;
	}




	public boolean isSuspended() {
		return suspended;
	}




	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
