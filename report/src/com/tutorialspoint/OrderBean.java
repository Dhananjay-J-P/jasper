package com.tutorialspoint;

import java.util.ArrayList;
import java.util.List;

public class OrderBean {

	String orderId;
	
	String orderDate;

	List<OrderItem> itemList=new ArrayList<>();
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public List<OrderItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<OrderItem> itemList) {
		this.itemList = itemList;
	}

	/**
	 * 
	 */
	public OrderBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param orderId
	 * @param orderDate
	 * @param itemList
	 */
	public OrderBean(String orderId, String orderDate, List<OrderItem> itemList) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.itemList = itemList;
	}
	
	
	
}
