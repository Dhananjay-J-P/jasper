/**
 * 
 */
package com.erp.payment;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.erp.order.ERPOrder;

/**
 * @author Dhananjay P
 *
 */
public class ERPPayment {

	/**
	 * 
	 */
	public ERPPayment() {
		// TODO Auto-generated constructor stub
	}

	int paymentId;

	String paymentType = "Cash";

	int paymentAcceptedBy;

	Date paymentDate;

	double amount;

	ERPOrder order;

	String chequeId ="";

	/**
	 * @return the chequeId
	 */
	public String getChequeId() {
		return chequeId;
	}

	/**
	 * @param chequeId
	 *            the chequeId to set
	 */
	public void setChequeId(String chequeId) {
		this.chequeId = chequeId;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the order
	 */
	public ERPOrder getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(ERPOrder order) {
		this.order = order;
	}

	/**
	 * @param paymentType
	 * @param paymentAcceptedBy
	 * @param paymentDate
	 */
	public ERPPayment(String paymentType, int amount, Date paymentDate) {
		this.paymentType = paymentType;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the paymentId
	 */
	public int getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId
	 *            the paymentId to set
	 */
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType
	 *            the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getFormattedPaymentType() {

		if (this.paymentType.equalsIgnoreCase(PAYMENT_TYPE.PAYMENT_TYPE_CHEQUE.get())) {
			return paymentType + "-" + chequeId;

		}
		return paymentType;

	}

	/**
	 * @return the paymentAcceptedBy
	 */
	public int getPaymentAcceptedBy() {
		return paymentAcceptedBy;
	}

	/**
	 * @param paymentAcceptedBy
	 *            the paymentAcceptedBy to set
	 */
	public void setPaymentAcceptedBy(int paymentAcceptedBy) {
		this.paymentAcceptedBy = paymentAcceptedBy;
	}

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}
	
	public String getFormattedOrderDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(paymentDate);
	}

	/**
	 * @param paymentDate
	 *            the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPPayment [paymentId=" + paymentId + ", paymentType=" + paymentType + ", paymentAcceptedBy="
				+ paymentAcceptedBy + ", paymentDate=" + paymentDate + "]";
	}

}
