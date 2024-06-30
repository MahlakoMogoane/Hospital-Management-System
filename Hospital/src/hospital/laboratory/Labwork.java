package hospital.laboratory;

import java.time.LocalDate;

public class Labwork {
	//attributes
	private int workID;
	private String testName;
	private int patientID;
	private int doctorID;
	private LocalDate testDate;
	private String results;
	private String status;
	private String notes;
	
	//getters
	public int getWorkID() {
		return workID;
	}
	
	public String getTestName() {
		return testName;
	}
	
	public int getPatientID() {
		return patientID;
	}
	
	public int getDoctorID() {
		return doctorID;
	}
	
	public LocalDate getTestDate() {
		return testDate;
	}
	
	public String getResults() {
		return results;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getNotes() {
		return notes;
	}
	
	//setters
	public void setWorkID(int workID) {
		this.workID = workID;
	}
	
	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	
	public void setTestDate(LocalDate testDate) {
		this.testDate = testDate;
	}
	
	public void setResults(String results) {
		this.results = results;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
