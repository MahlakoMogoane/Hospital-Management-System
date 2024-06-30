package hospital.staff;

import java.time.LocalDate;

//interface
public class personalInfo {
	private int staffID;
	private String fullName;
	private String surname;
	private LocalDate dateofBirth;
	private String gender;
	private String phoneNumber;
	private String email;
	private String staffType;
	
	//getters
	public int getStaffID() {
		return staffID;
	}
	public String getFullName() {
		return fullName;
	}
	public String getSurname() {
		return surname;
	}
	public LocalDate getDateofBirth() {
		return dateofBirth;
	}
	public String getGender() {
		return gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getStaffType() {
		return staffType;
	}
	
	//setters
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}
}
