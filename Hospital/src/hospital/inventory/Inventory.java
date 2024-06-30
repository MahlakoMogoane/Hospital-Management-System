package hospital.inventory;

import java.time.LocalDate;

public class Inventory {
	private int itemID;
	private String itemName;
	private String Code;
	private int numInStock;
	private int supplierID;
	private LocalDate purchaseDate;
	private LocalDate expiryDate;
	
	//getters
	public int getItemID() {
		return itemID;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public String getCode() {
		return Code;
	}
	
	public int getNumInStock() {
		return numInStock;
	}
	
	public int getSupplierID() {
		return supplierID;
	}
	
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	
	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	//setters
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void setCode(String code) {
		Code = code;
	}
	
	public void setNumInStock(int numInStock) {
		this.numInStock = numInStock;
	}
	
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
}
