package com.alfamodels;

public class BillingPreferences {
	private float daysAheadToInvoice;
	private String defaultAdhocPaymentMethod;
	private String defaultCurrency;
	private String accountsPayablePaymentMethod;
	private String accountsReceivablePaymentMethod;
	private boolean canEmail;
	private boolean canFax;
	private String informationalCurrency;
	private boolean canMail;
	private boolean canPhone;
	private String automatedRefundPaymentMethod;
	private boolean supplierPaymentSuspended;
	private String defaultInvoiceConsolidationLevel;
	private String invoiceConsolidationSource;

	// Getter Methods

	public float getDaysAheadToInvoice() {
		return daysAheadToInvoice;
	}

	public String getDefaultAdhocPaymentMethod() {
		return defaultAdhocPaymentMethod;
	}

	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	public String getAccountsPayablePaymentMethod() {
		return accountsPayablePaymentMethod;
	}

	public String getAccountsReceivablePaymentMethod() {
		return accountsReceivablePaymentMethod;
	}

	public boolean getCanEmail() {
		return canEmail;
	}

	public boolean getCanFax() {
		return canFax;
	}

	public String getInformationalCurrency() {
		return informationalCurrency;
	}

	public boolean getCanMail() {
		return canMail;
	}

	public boolean getCanPhone() {
		return canPhone;
	}

	public String getAutomatedRefundPaymentMethod() {
		return automatedRefundPaymentMethod;
	}

	public boolean getSupplierPaymentSuspended() {
		return supplierPaymentSuspended;
	}

	public String getDefaultInvoiceConsolidationLevel() {
		return defaultInvoiceConsolidationLevel;
	}

	public String getInvoiceConsolidationSource() {
		return invoiceConsolidationSource;
	}

	// Setter Methods

	public void setDaysAheadToInvoice(float daysAheadToInvoice) {
		this.daysAheadToInvoice = daysAheadToInvoice;
	}

	public void setDefaultAdhocPaymentMethod(String defaultAdhocPaymentMethod) {
		this.defaultAdhocPaymentMethod = defaultAdhocPaymentMethod;
	}

	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

	public void setAccountsPayablePaymentMethod(String accountsPayablePaymentMethod) {
		this.accountsPayablePaymentMethod = accountsPayablePaymentMethod;
	}

	public void setAccountsReceivablePaymentMethod(String accountsReceivablePaymentMethod) {
		this.accountsReceivablePaymentMethod = accountsReceivablePaymentMethod;
	}

	public void setCanEmail(boolean canEmail) {
		this.canEmail = canEmail;
	}

	public void setCanFax(boolean canFax) {
		this.canFax = canFax;
	}

	public void setInformationalCurrency(String informationalCurrency) {
		this.informationalCurrency = informationalCurrency;
	}

	public void setCanMail(boolean canMail) {
		this.canMail = canMail;
	}

	public void setCanPhone(boolean canPhone) {
		this.canPhone = canPhone;
	}

	public void setAutomatedRefundPaymentMethod(String automatedRefundPaymentMethod) {
		this.automatedRefundPaymentMethod = automatedRefundPaymentMethod;
	}

	public void setSupplierPaymentSuspended(boolean supplierPaymentSuspended) {
		this.supplierPaymentSuspended = supplierPaymentSuspended;
	}

	public void setDefaultInvoiceConsolidationLevel(String defaultInvoiceConsolidationLevel) {
		this.defaultInvoiceConsolidationLevel = defaultInvoiceConsolidationLevel;
	}

	public void setInvoiceConsolidationSource(String invoiceConsolidationSource) {
		this.invoiceConsolidationSource = invoiceConsolidationSource;
	}
}
