/**
 * 
 */
package com.erp.product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dhananjay P
 *
 */
public class ERPProduct {

	/**
	 * 
	 */
	public ERPProduct() {
		// TODO Auto-generated constructor stub
	}

	List<String> partsList=new ArrayList<>();
	
	List<Integer> quantityList= new ArrayList<>();
	
	String quantityArray[];
	
	String id;

	String name;

	String description;

	Double cost;

	String imagePath;
	
	int inventoryCount;
	
	Set<ERPPartQuantityMap> partQuantityMapSet = new HashSet<>();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ERPProduct [id=" + id + ", name=" + name + ", description=" + description + ", cost=" + cost
				+ ", imagePath=" + imagePath + ", inventoryCount=" + inventoryCount + ", serialNumber=" + serialNumber
				+ "]";
	}



	/**
	 * @return the partQuantityMapSet
	 */
	public Set<ERPPartQuantityMap> getPartQuantityMapSet() {
		return partQuantityMapSet;
	}



	/**
	 * @param partQuantityMapSet the partQuantityMapSet to set
	 */
	public void setPartQuantityMapSet(Set<ERPPartQuantityMap> partQuantityMapSet) {
		this.partQuantityMapSet = partQuantityMapSet;
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
	 * @param id
	 * @param name
	 * @param description
	 * @param cost
	 * @param imagePath
	 * @param serialNumber
	 * @param requiredPartsMap
	 */
	public ERPProduct( String name, String description, Double cost, String imagePath) {
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.imagePath = imagePath;
	}
	
	
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber
	 *            the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	String serialNumber;

	/**
	 * @return the id
	 */
	public String getId() {
		return id!=null ? id.toUpperCase():id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the cost
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath
	 *            the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}






	/**
	 * @return the partsList
	 */
	public List<String> getPartsList() {
		return partsList;
	}



	/**
	 * @param partsList the partsList to set
	 */
	public void setPartsList(List<String> partsList) {
		this.partsList = partsList;
	}



	/**
	 * @return the quantityList
	 */
	public List<Integer> getQuantityList() {
		return quantityList;
	}



	/**
	 * @param quantityList the quantityList to set
	 */
	public void setQuantityList(List<Integer> quantityList) {
		this.quantityList = quantityList;
	}



	/**
	 * @return the quantityArray
	 */
	public String[] getQuantityArray() {
		return quantityArray;
	}



	/**
	 * @param quantityArray the quantityArray to set
	 */
	public void setQuantityArray(String[] quantityArray) {
		this.quantityArray = quantityArray;
	}

	
	
}
