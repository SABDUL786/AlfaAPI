package com.alfamodels;

import java.util.ArrayList;

import lombok.Data;

@Data
public class ThirdParty {
	private String thirdPartyClass;
	BankDetails BankDetailsObject;
	private float billingAddressNumber;
	CreditInformation CreditInformationObject;
	private String displayName;
	private String nationalId;
	private String thirdPartyNumber;
	private boolean driver;
	private String emailAddress;
	private String faxNumber;
	private String mobileTelephoneNumber;
	private String telephoneNumber;
	NameDetails NameDetailsObject;
	private String name;
	private boolean deceased;
	private String residentialStatus;
	private String maritalStatus;
	private String nationalityCode;
	private String employer;
	private String occupation;
	private String drivingLicenceNumber;
	BillingPreferences BillingPreferencesObject;
	RelationshipManagement RelationshipManagementObject;
	private String type;
	private String ticket;
	BillingAddress BillingAddressObject;
	ArrayList<Object> contactMethods = new ArrayList<Object>();

	// Getter Methods

	public String getThirdPartyClass() {
		return thirdPartyClass;
	}

	public BankDetails getBankDetails() {
		return BankDetailsObject;
	}

	public float getBillingAddressNumber() {
		return billingAddressNumber;
	}

	public CreditInformation getCreditInformation() {
		return CreditInformationObject;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public String getThirdPartyNumber() {
		return thirdPartyNumber;
	}

	public boolean getDriver() {
		return driver;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public String getMobileTelephoneNumber() {
		return mobileTelephoneNumber;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public NameDetails getNameDetails() {
		return NameDetailsObject;
	}

	public String getName() {
		return name;
	}

	public boolean getDeceased() {
		return deceased;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getNationalityCode() {
		return nationalityCode;
	}

	public String getEmployer() {
		return employer;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getDrivingLicenceNumber() {
		return drivingLicenceNumber;
	}

	public BillingPreferences getBillingPreferences() {
		return BillingPreferencesObject;
	}

	public RelationshipManagement getRelationshipManagement() {
		return RelationshipManagementObject;
	}

	public String getType() {
		return type;
	}

	public BillingAddress getBillingAddress() {
		return BillingAddressObject;
	}

	// Setter Methods

	public void setThirdPartyClass(String thirdPartyClass) {
		this.thirdPartyClass = thirdPartyClass;
	}

	public void setBankDetails(BankDetails bankDetailsObject) {
		this.BankDetailsObject = bankDetailsObject;
	}

	public void setBillingAddressNumber(float billingAddressNumber) {
		this.billingAddressNumber = billingAddressNumber;
	}

	public void setCreditInformation(CreditInformation creditInformationObject) {
		this.CreditInformationObject = creditInformationObject;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public void setThirdPartyNumber(String thirdPartyNumber) {
		this.thirdPartyNumber = thirdPartyNumber;
	}

	public void setDriver(boolean driver) {
		this.driver = driver;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public void setMobileTelephoneNumber(String mobileTelephoneNumber) {
		this.mobileTelephoneNumber = mobileTelephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public void setNameDetails(NameDetails nameDetailsObject) {
		this.NameDetailsObject = nameDetailsObject;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeceased(boolean deceased) {
		this.deceased = deceased;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setDrivingLicenceNumber(String drivingLicenceNumber) {
		this.drivingLicenceNumber = drivingLicenceNumber;
	}

	public void setBillingPreferences(BillingPreferences billingPreferencesObject) {
		this.BillingPreferencesObject = billingPreferencesObject;
	}

	public void setRelationshipManagement(RelationshipManagement relationshipManagementObject) {
		this.RelationshipManagementObject = relationshipManagementObject;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBillingAddress(BillingAddress billingAddressObject) {
		this.BillingAddressObject = billingAddressObject;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
}
