package com.alfamodels;

import java.util.ArrayList;

public class RelationshipManagement {

	private String businessCentreCode;
	private boolean prospect;
	private String branchCode;
	private String thirdPartyControllerType;
	ArrayList<Object> preferredCaseHandlerGroupCodes = new ArrayList<Object>();

	// Getter Methods

	public String getBusinessCentreCode() {
		return businessCentreCode;
	}

	public boolean getProspect() {
		return prospect;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public String getThirdPartyControllerType() {
		return thirdPartyControllerType;
	}

	// Setter Methods

	public void setBusinessCentreCode(String businessCentreCode) {
		this.businessCentreCode = businessCentreCode;
	}

	public void setProspect(boolean prospect) {
		this.prospect = prospect;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public void setThirdPartyControllerType(String thirdPartyControllerType) {
		this.thirdPartyControllerType = thirdPartyControllerType;
	}

}
