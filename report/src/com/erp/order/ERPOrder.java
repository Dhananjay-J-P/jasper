/**
 * 
 */
package com.erp.order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.erp.customer.ERPCustomer;
import com.erp.payment.ERPPayment;
import com.erp.product.ERPSaleItem;

/**
 * @author Dhananjay P
 *
 */

public class ERPOrder {

	/**
	 * 
	 */
	public ERPOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	ERPCustomer customer;

	List<ERPSaleItem> saleItemList = new ArrayList<>();

	// Id of employee who placed order
	String employeeId;

	List<ERPPayment> tenderList = new ArrayList<>();

	String orderId;

	Date orderDate;

	Date orderCompletedDate;

	String orderStatus ;

	String paymentStatus ;

	// 0 - Existing, 1 - new
	int customerType = 0;

	// 0- Pay later, 1 - pay now
	int paymentType = 0;

	/**
	 * @return the customerType
	 */
	public int getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType
	 *            the customerType to set
	 */
	public void setCustomerType(int customerType) {
		this.customerType = customerType;
	}

	/**
	 * @param orderDate
	 * @param orderCompletedDate
	 * @param status
	 * @param isNewCustomer
	 * @param customer
	 * @param employeeId
	 * @param tenderList
	 */
	public ERPOrder(Date orderDate, Date orderCompletedDate, String orderStatus, ERPCustomer customer,
			String employeeId, List<ERPPayment> tenderList) {
		this.orderDate = orderDate;
		this.orderCompletedDate = orderCompletedDate;
		this.orderStatus = orderStatus;

		this.customer = customer;
		this.employeeId = employeeId;
		this.tenderList = tenderList;
	}

	/**
	 * @return the saleItemList
	 */
	public List<ERPSaleItem> getSaleItemList() {
		return saleItemList;
	}

	/**
	 * @param saleItemList
	 *            the saleItemList to set
	 */
	public void setSaleItemList(List<ERPSaleItem> saleItemList) {
		this.saleItemList = saleItemList;
	}

	/**
	 * @return the tenderList
	 */
	public List<ERPPayment> getTenderList() {
		return tenderList;
	}

	/**
	 * @param tenderList
	 *            the tenderList to set
	 */
	public void setTenderList(List<ERPPayment> tenderList) {
		this.tenderList = tenderList;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	public String getFormattedOrderDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(orderDate);
	}
	/**
	 * @param orderDate
	 *            the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the orderCompletedDate
	 */
	public Date getOrderCompletedDate() {
		return orderCompletedDate;
	}

	/**
	 * @param orderCompletedDate
	 *            the orderCompletedDate to set
	 */
	public void setOrderCompletedDate(Date orderCompletedDate) {
		this.orderCompletedDate = orderCompletedDate;
	}

	/**
	 * @return the customer
	 */
	public ERPCustomer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(ERPCustomer customer) {
		this.customer = customer;
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the paymentStatus
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * @param paymentStatus
	 *            the paymentStatus to set
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	/**
	 * @return the paymentType
	 */
	public int getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType
	 *            the paymentType to set
	 */
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	
	public double getOrderTotal()
	{
		double total=0.00;
		for(ERPSaleItem item: getSaleItemList())
		{
			total+=item.getTotal();
		}
		return total;
	}
	
	public double getOrderTenderTotal()
	{
		double total=0.00;
		for(ERPPayment tender: getTenderList())
		{
			total+=tender.getAmount();
		}
		return total;
	}

}
