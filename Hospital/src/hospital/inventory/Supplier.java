package hospital.inventory;

public class Supplier {
	private int supplierID;
	private String supplierName;
	private String contactName;
	private String contactNumber;
	private String contactEMail;
	private String website;
	
	//getters
	public int getSupplierID() {
		return supplierID;
	}
	
	public String getSupplierName() {
		return supplierName;
	}
	
	public String getContactName() {
		return contactName;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public String getContactEMail() {
		return contactEMail;
	}
	
	public String getWebsite() {
		return website;
	}
	
	//setters
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void setContactEMail(String contactEMail) {
		this.contactEMail = contactEMail;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}
}
