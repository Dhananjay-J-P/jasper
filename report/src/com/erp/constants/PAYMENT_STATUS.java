/**
 * 
 */
package com.erp.constants;

/**
 * @author Dhananjay P
 *
 */
public enum PAYMENT_STATUS {

	STATUS_PENDING("Pending"), STATUS_PARITAL("Partial Payment"), STATUS_COMPLETE("Completed");

	private final String status;

	/**
	 * @param text
	 */
	private PAYMENT_STATUS(final String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ""+status;
	}

	public String value()
	{
		return status;
	}
	
}
