package com.kingshuk.enumpractice;

public enum EmployeeType {
	
	FULL_TIME_EMPLOYEE("124589", "RiverWoods"),
	PART_TIME_EMPLOYEE("1487956", "Rosemont");
	
	private String batchNo;
	
	private String location;

	//Notice the constructor of an enum is private
	private EmployeeType(String batchNo, String location) {
		this.batchNo = batchNo;
		this.location = location;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public String getLocation() {
		return location;
	}
	
		

}
