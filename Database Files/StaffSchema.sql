USE HospitalManagement;

DROP TABLE Staff.EmployeePersonalInfo;

CREATE TABLE Staff.EmployeePersonalInfo(
	StaffID INT IDENTITY(100, 1) NOT NULL UNIQUE,
	FullName VARCHAR(50) NOT NULL,
	Surname VARCHAR(50) NOT NULL,
	DateOfBirth DATE NOT NULL,
	Gender VARCHAR(1) NOT NULL,
	PhoneNumber VARCHAR(10) NOT NULL UNIQUE,
	EMail VARCHAR(50) NOT NULL UNIQUE,
	StaffType VARCHAR(1) NOT NULL, --D: Doctor, N: nurse, G: General

	PRIMARY KEY(StaffID)
);

CREATE TABLE Staff.EmploymentInfo(
	EmploymentID INT NOT NULL UNIQUE,
	StaffID INT NOT NULL UNIQUE,
	StaffRole VARCHAR(15) NOT NULL,		--(Admin, Receptionist, Technician, etc.)
	Department VARCHAR(30) NOT NULL,
	EmploymentDate DATE NOT NULL,
	ShiftTimings VARCHAR(20) NOT NULL,
	Salary DECIMAL(10,2) NOT NULL,
	EmergencyContactName VARCHAR(25) NOT NULL,
	EmergencyConatctNum VARCHAR(10) NOT NULL UNIQUE,

	PRIMARY KEY(EmploymentID),
	FOREIGN KEY(StaffID) REFERENCES Staff.EmployeePersonalInfo
);

DROP TABLE STAFF.DOCTOR;
CREATE TABLE Staff.Doctor(
	DoctorID INT NOT NULL UNIQUE,
	Specialization VARCHAR(20) NOT NULL,
	Qualifications VARCHAR(50) NOT NULL,
	YearsOfExperience INT NOT NULL,
	LicenseNumber VARCHAR(9) NOT NULL UNIQUE,
	AvailabilityStatus BIT NOT NULL --1 = AVAILABLE.

	PRIMARY KEY(DoctorID),
	FOREIGN KEY(DoctorID) REFERENCES Staff.EmployeePersonalInfo(StaffID)
);


CREATE TABLE Staff.Nurse(
	NurseID INT NOT NULL UNIQUE,
	--NurseID AS ('N' + RIGHT('000' + CAST(StaffID AS VARCHAR(4)), 4)) PERSISTED,
	Specialization VARCHAR(20) NOT NULL,
	Qualifications VARCHAR(50) NOT NULL,
	YearsOfExperience INT NOT NULL,
	LicenseNumber VARCHAR(9) NOT NULL UNIQUE,
	AvailabilityStatus BIT NOT NULL --1 = AVAILABLE.

	PRIMARY KEY(NurseID),
	FOREIGN KEY(NurseID) REFERENCES Staff.EmployeePersonalInfo(StaffID)
);

SELECT * FROM Staff.Doctor;
SELECT * FROM Staff.Nurse;
SELECT * FROM Staff.EmployeePersonalInfo;
SELECT * FROM Staff.EmploymentInfo;

--comments:

--DoctorID AS ('D' + RIGHT('000' + CAST(StaffID AS VARCHAR(4)), 4)) PERSISTED,
	--StaffID AS (...) PERSISTED: 
		--defines a computed column. The code in the brackets specifies how to calculated the columns value (returns a NVARCHAR)
		--PERSISTED means that the column is created and saved in the table, instead of being calculated "on the fly"

	--'G
		-- constant letter is used to format the ID to discriminate amongst workers

	--RIGHT('000' + CAST(StaffID AS VARCHAR(4)), 4)
		--from the inside out:
			--CAST(StaffID AS VARCHAR(4)) : converts the StaffID to an string with a limit off 4 characters
			--'000' : adds 3 zeros in front a number if it is a single digit number
			--RIGHT(..) : will shift the staffID up by the necessary digits if the number is (example) a tens value
