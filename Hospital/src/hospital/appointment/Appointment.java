/**
 * 
 */
package hospital.appointment;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 
 */
public class Appointment {
	//attributes
	private int ID;
	private int patientID;
	private int doctorID;
	private LocalDate date;
	private LocalTime time;
	private String reason;
	private String status;
	private String Notes;
	
	//getters
	public int getID() {
		return ID;
	}
	
	public int getPatientID() {
		return patientID;
	}
	
	public int getDoctorID() {
		return doctorID;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public LocalTime getTime() {
		return time;
	}
	
	public String getReason() {
		return reason;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getNotes() {
		return Notes;
	}
	
	//setters
	public void setID(int iD) {
		ID = iD;
	}
	
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setNotes(String notes) {
		Notes = notes;
	}
	
	
}
