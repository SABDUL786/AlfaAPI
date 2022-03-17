package com.model;

public class Customer{
    public String cusRef;
    public String cusName;
    public String cusJob;
    public String cusPhoneNo;
    public CusAddress cusAddress;
    public CusBankAcc cusBankAcc;
    
    
    
	public Customer(String cusRef, String cusName, String cusJob, String cusPhoneNo, CusAddress cusAddress,
			CusBankAcc cusBankAcc) {
		super();
		this.cusRef = cusRef;
		this.cusName = cusName;
		this.cusJob = cusJob;
		this.cusPhoneNo = cusPhoneNo;
		this.cusAddress = cusAddress;
		this.cusBankAcc = cusBankAcc;
	}
	public String getCusRef() {
		return cusRef;
	}
	public void setCusRef(String cusRef) {
		this.cusRef = cusRef;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusJob() {
		return cusJob;
	}
	public void setCusJob(String cusJob) {
		this.cusJob = cusJob;
	}
	public String getCusPhoneNo() {
		return cusPhoneNo;
	}
	public void setCusPhoneNo(String cusPhoneNo) {
		this.cusPhoneNo = cusPhoneNo;
	}
	public CusAddress getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(CusAddress cusAddress) {
		this.cusAddress = cusAddress;
	}
	public CusBankAcc getCusBankAcc() {
		return cusBankAcc;
	}
	public void setCusBankAcc(CusBankAcc cusBankAcc) {
		this.cusBankAcc = cusBankAcc;
	}
    
    
}