package hospital.room;

public class Room {
	//attribute
	private String bedID;
	private String roomType;
	private int numberOfBeds;
	private String occupiedStatus;
	private String assignedStaff;
	private String cleaningSchedule;
	
	//getters
	public String getBedID() {
		return bedID;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public int getNumberOfBeds() {
		return numberOfBeds;
	}
	
	public String getOccupiedStatus() {
		return occupiedStatus;
	}
	
	public String getAssignedStaff() {
		return assignedStaff;
	}
	
	public String getCleaningSchedule() {
		return cleaningSchedule;
	}
	
	//setters
	public void setBedID(String bedID) {
		this.bedID = bedID;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}
	
	public void setOccupiedStatus(String occupiedStatus) {
		this.occupiedStatus = occupiedStatus;
	}
	
	public void setAssignedStaff(String assignedStaff) {
		this.assignedStaff = assignedStaff;
	}
	
	public void setCleaningSchedule(String cleaningSchedule) {
		this.cleaningSchedule = cleaningSchedule;
	}
}
