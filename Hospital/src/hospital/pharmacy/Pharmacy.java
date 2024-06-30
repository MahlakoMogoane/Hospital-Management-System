package hospital.pharmacy;

import java.time.LocalDate;

public class Pharmacy {
	//attributes
	private int MedID;
	private String medName;
	private int numAvailable;
	private String dosage;
	private LocalDate expiryDate;
	private int supplierID;
	
	//getters
	public int getMedID() {
		return MedID;
	}
	
	public String getMedName() {
		return medName;
	}
	
	public int getNumAvailable() {
		return numAvailable;
	}
	
	public String getDosage() {
		return dosage;
	}
	
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	
	public int getSupplierID() {
		return supplierID;
	}
	
	//setters
	public void setMedID(int medID) {
		MedID = medID;
	}
	
	public void setMedName(String medName) {
		this.medName = medName;
	}
	
	public void setNumAvailable(int numAvailable) {
		this.numAvailable = numAvailable;
	}
	
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
}
