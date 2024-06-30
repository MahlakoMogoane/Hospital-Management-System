package hospital.finance;

public class hospitalMedication {
	private int medID;
	private String medName;
	private double price;
	
	//getters
	public int getMedID() {
		return medID;
	}
	
	public String getMedName() {
		return medName;
	}
	
	public double getPrice() {
		return price;
	}
	
	//setters
	public void setMedID(int medID) {
		this.medID = medID;
	}
	
	public void setMedName(String medName) {
		this.medName = medName;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
