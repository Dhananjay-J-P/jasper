/**
 * 
 */
package com.erp.product;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhananjay P
 *
 */

public class ERPPart{

	/**
	 * 
	 */
	public ERPPart() {
		// TODO Auto-generated constructor stub
	}
	
	int partId;
	
	
	String name;
	
	double cost;
	
	int quantity;
	
	String imagePath;
	
	Set<ERPProduct> productsSet=new HashSet<>();
	
	int inventoryCount;

	/**
	 * @return the productsSet
	 */
	public Set<ERPProduct> getProductsSet() {
		return productsSet;
	}

	/**
	 * @param productsSet the productsSet to set
	 */
	public void setProductsSet(Set<ERPProduct> productsSet) {
		this.productsSet = productsSet;
	}

	/**
	 * @return the inventoryCount
	 */
	public int getInventoryCount() {
		return inventoryCount;
	}

	/**
	 * @param inventoryCount the inventoryCount to set
	 */
	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
	}

	/**
	 * @return the partId
	 */
	public int getPartId() {
		return partId;
	}

	/**
	 * @param partId the partId to set
	 */
	public void setPartId(int partId) {
		this.partId = partId;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Part [partId=" + partId + ", name=" + name + ", cost=" + cost + ", quantity=" + quantity + "]";
	}



	/**
	 * @param name
	 * @param cost
	 * @param imagePath
	 */
	public ERPPart(String name, double cost, String imagePath) {
		this.name = name;
		this.cost = cost;
		this.imagePath = imagePath;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((imagePath == null) ? 0 : imagePath.hashCode());
		result = prime * result + inventoryCount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + partId;
		result = prime * result + quantity;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ERPPart other = (ERPPart) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (imagePath == null) {
			if (other.imagePath != null)
				return false;
		} else if (!imagePath.equals(other.imagePath))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (partId != other.partId)
			return false;
		
		return true;
	}

	
	
	
}
