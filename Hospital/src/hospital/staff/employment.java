package hospital.staff;

import java.time.LocalDate;

public class employment {
	private int employmentID;
	private int staffID;
	private String staffRole;
	private String department;
	private LocalDate employmentDate;
	private String shiftTimings;
	private double salary;
	private String emergencyConatctName;
	private String emergencyContactPhone;
	
	//getters
	public int getEmploymentID() {
		return employmentID;
	}
	
	public int getStaffID() {
		return staffID;
	}
	
	public String getStaffRole() {
		return staffRole;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public LocalDate getEmploymentDate() {
		return employmentDate;
	}
	
	public String getShiftTimings() {
		return shiftTimings;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getEmergencyConatctName() {
		return emergencyConatctName;
	}
	
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	//setters
		public void setEmploymentID(int employmentID) {
		this.employmentID = employmentID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setEmploymentDate(LocalDate employmentDate) {
		this.employmentDate = employmentDate;
	}

	public void setShiftTimings(String shiftTimings) {
		this.shiftTimings = shiftTimings;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setEmergencyConatctName(String emergencyConatctName) {
		this.emergencyConatctName = emergencyConatctName;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}
}
