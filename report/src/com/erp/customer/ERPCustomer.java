/**
 * 
 */
package com.erp.customer;

import java.util.HashSet;
import java.util.Set;

import com.erp.order.ERPOrder;

/**
 * @author Dhananjay P
 *
 */

public class ERPCustomer {

	/**
	 * 
	 */
	public ERPCustomer() {
		// TODO Auto-generated constructor stub
	}
	
	String customerId;
	
	String name;
	
	String lname;
	
	
	ERPAddress address;
	
	String emailId;
	
	
	
	long mobileNumber;
	
	long alternateContact;

	
	Set<ERPOrder> orderSet = new HashSet<>();
	
	
	
	
	/**
	 * @return the orderSet
	 */
	public Set<ERPOrder> getOrderSet() {
		return orderSet;
	}

	/**
	 * @param orderSet the orderSet to set
	 */
	public void setOrderSet(Set<ERPOrder> orderSet) {
		this.orderSet = orderSet;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @param name
	 * @param lname
	 * @param address
	 * @param mobileNumber
	 * @param alternateContact
	 */
	public ERPCustomer(String name, String lname, ERPAddress address, long mobileNumber, long alternateContact) {
		this.name = name;
		this.lname = lname;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.alternateContact = alternateContact;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the address
	 */
	public ERPAddress getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(ERPAddress address) {
		this.address = address;
	}

	/**
	 * @return the mobileNumber
	 */
	public long getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the alternateContact
	 */
	public long getAlternateContact() {
		return alternateContact;
	}

	/**
	 * @param alternateContact the alternateContact to set
	 */
	public void setAlternateContact(long alternateContact) {
		this.alternateContact = alternateContact;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPCustomer [customerId=" + customerId + ", name=" + name + ", lname=" + lname + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", alternateContact=" + alternateContact + "]";
	}
	
	
	

}

