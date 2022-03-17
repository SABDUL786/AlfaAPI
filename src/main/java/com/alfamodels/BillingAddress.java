package com.alfamodels;

public class BillingAddress {
	private String country;
	private String line1;
	private String line2;
	private String line3;
	private String line4;
	private String line5;
	private String geoCode;
	private String deliveryInformation;
	private String addressType;

	// Getter Methods

	public String getCountry() {
		return country;
	}

	public String getLine1() {
		return line1;
	}

	public String getLine2() {
		return line2;
	}

	public String getLine3() {
		return line3;
	}

	public String getLine4() {
		return line4;
	}

	public String getLine5() {
		return line5;
	}

	public String getGeoCode() {
		return geoCode;
	}

	public String getDeliveryInformation() {
		return deliveryInformation;
	}

	public String getAddressType() {
		return addressType;
	}

	// Setter Methods

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public void setLine4(String line4) {
		this.line4 = line4;
	}

	public void setLine5(String line5) {
		this.line5 = line5;
	}

	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}

	public void setDeliveryInformation(String deliveryInformation) {
		this.deliveryInformation = deliveryInformation;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
}