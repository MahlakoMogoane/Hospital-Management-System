package hospital.staff;

public class Nurse {
	//attributes
	private String specialization;
	private String qualifications;
	private int numYearsExperience;
	private String licenseNumber;
	private boolean Availability;
		
	//getters
	public String getSpecialization() {
		return specialization;
	}
	
	public String getQualifications() {
		return qualifications;
	}
		
	public int getNumYearsExperience() {
		return numYearsExperience;
	}
		
	public String getLicenseNumber() {
		return licenseNumber;
	}
		
	public boolean isAvailability() {
		return Availability;
	}
		
	//setters
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
		
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
		
	public void setNumYearsExperience(int numYearsExperience) {
		this.numYearsExperience = numYearsExperience;
	}
		
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
		
	public void setAvailability(boolean availability) {
		Availability = availability;
	}
}
