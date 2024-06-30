package hospital.finance;

public class Bill {
	private int ID;
	private int patientID;
	private double total;
	private String status;
	private String method;
	
	//getters
	public int getID() {
		return ID;
	}
	
	public int getPatientID() {
		return patientID;
	}
	
	public double getTotal() {
		return total;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getMethod() {
		return method;
	}
	
	//setters
	public void setID(int iD) {
		ID = iD;
	}
	
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
}
