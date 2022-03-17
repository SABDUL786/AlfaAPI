package com.alfamodels;

public class BankDetails {
	private String accountCountry;
	private String accountName;
	AccountNumber AccountNumberObject;
	Address AddressObject;
	private String bankName;
	private String contactName;
	private String faxNumber;
	private String iban;
	private String internationalSwiftCode;
	private String phoneNumber;
	SortCode SortCodeObject;

	// Getter Methods

	public String getAccountCountry() {
		return accountCountry;
	}

	public String getAccountName() {
		return accountName;
	}

	public AccountNumber getAccountNumber() {
		return AccountNumberObject;
	}

	public Address getAddress() {
		return AddressObject;
	}

	public String getBankName() {
		return bankName;
	}

	public String getContactName() {
		return contactName;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public String getIban() {
		return iban;
	}

	public String getInternationalSwiftCode() {
		return internationalSwiftCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public SortCode getSortCode() {
		return SortCodeObject;
	}

	// Setter Methods

	public void setAccountCountry(String accountCountry) {
		this.accountCountry = accountCountry;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccountNumber(AccountNumber accountNumberObject) {
		this.AccountNumberObject = accountNumberObject;
	}

	public void setAddress(Address addressObject) {
		this.AddressObject = addressObject;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public void setInternationalSwiftCode(String internationalSwiftCode) {
		this.internationalSwiftCode = internationalSwiftCode;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setSortCode(SortCode sortCodeObject) {
		this.SortCodeObject = sortCodeObject;
	}
}
