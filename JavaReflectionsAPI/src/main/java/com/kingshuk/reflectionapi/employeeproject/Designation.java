package com.kingshuk.reflectionapi.employeeproject;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@InfoIncluded
@AllArgsConstructor
@NoArgsConstructor
public class Designation {
	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	public String getDesignationDescription() {
		return designationDescription;
	}

	public void setDesignationDescription(String designationDescription) {
		this.designationDescription = designationDescription;
	}

	public String getInfoId() {
		return infoId;
	}

	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}

	private String designationName;
	
	private String designationDescription;
	
	private String infoId;
	
	
}
