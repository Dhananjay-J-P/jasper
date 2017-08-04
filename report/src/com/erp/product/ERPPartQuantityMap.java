/**
 * 
 */
package com.erp.product;

/**
 * @author Dhananjay P
 *
 */
public class ERPPartQuantityMap {

	long partQuantiyId;
	
	ERPPart part;
	
	int quantity;

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPPartQuantityMap [partQuantiyId=" + partQuantiyId + ", part=" + part + ", quantity=" + quantity + "]";
	}

	/**
	 * @return the partQuantiyId
	 */
	public long getPartQuantiyId() {
		return partQuantiyId;
	}

	/**
	 * @param partQuantiyId the partQuantiyId to set
	 */
	public void setPartQuantiyId(long partQuantiyId) {
		this.partQuantiyId = partQuantiyId;
	}

	/**
	 * @return the part
	 */
	public ERPPart getPart() {
		return part;
	}

	/**
	 * @param part the part to set
	 */
	public void setPart(ERPPart part) {
		this.part = part;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param partQuantiyId
	 * @param part
	 * @param quantity
	 */
	public ERPPartQuantityMap(long partQuantiyId, ERPPart part, int quantity) {
		this.partQuantiyId = partQuantiyId;
		this.part = part;
		this.quantity = quantity;
	}

	/**
	 * 
	 */
	public ERPPartQuantityMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param part
	 * @param quantity
	 */
	public ERPPartQuantityMap(ERPPart part, int quantity) {
		this.part = part;
		this.quantity = quantity;
	}
	
		
	
	
	
}
