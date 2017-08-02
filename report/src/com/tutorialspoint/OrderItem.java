package com.tutorialspoint;

public class OrderItem {

	
	String itemId;
	
	String itemQ;

	public OrderItem(String itemId, String itemQ) {
		super();
		this.itemId = itemId;
		this.itemQ = itemQ;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemQ() {
		return itemQ;
	}

	public void setItemQ(String itemQ) {
		this.itemQ = itemQ;
	}
	
	
	
}
