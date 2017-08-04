/**
 * 
 */
package com.erp.constants;

/**
 * @author Dhananjay P
 *
 */
public enum ORDER_STATUS {

	STATUS_PLACED("New"), STATUS_STARTED("Initiated"), STATUS_CONSTRUCTION("Construction"),

	STATUS_COMPLETED("Completed"), STATUS_PACKAGE("Package"),

	STATUS_DELIVERED("Delivered");

	private final String status;

	/**
	 * @param text
	 */
	private ORDER_STATUS(final String status) {
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
