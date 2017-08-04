/**
 * 
 */
package com.erp.payment;

/**
 * @author Dhananjay P
 *
 */
public enum PAYMENT_TYPE {

	/**
	 * 
	 */
	PAYMENT_TYPE_CASH("Cash"), PAYMENT_TYPE_CHEQUE("Cheque");

	String type;

	PAYMENT_TYPE(String type) {
		this.type = type;
		
	}

	public String get() {
		return this.type;
	}
	

}
