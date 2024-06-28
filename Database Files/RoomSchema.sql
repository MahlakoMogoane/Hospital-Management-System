USE HospitalManagement;

CREATE TABLE Bed(
	BedID VARCHAR(3) NOT NULL UNIQUE, --<BLOCK LETTER><00>
	RoomType VARCHAR(9) NOT NULL, --GENERAL, ICU, PRIVATE, ETC.
	NumBed INT NOT NULL, --in room
	Occupied VARCHAR(1) NOT NULL,
	AssignedStaff VARCHAR(3) NOT NULL,
	CleaningSchedule VARCHAR(25) NOT NULL
);

SELECT * FROM Bed;