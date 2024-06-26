USE HospitalManagement;

DROP TABLE Staff.Employee;

CREATE TABLE Staff.Employee(
	StaffID INT IDENTITY(100, 1) NOT NULL UNIQUE,
	FullName VARCHAR(50) NOT NULL,
	Surname VARCHAR(50) NOT NULL,
	DateOfBirth DATE NOT NULL,
	Gender VARCHAR(1) NOT NULL,
	PhoneNumber VARCHAR(10) NOT NULL UNIQUE,
	EMail VARCHAR(50) NOT NULL UNIQUE,
	StaffType VARCHAR(1) NOT NULL, --D: Doctor, N: nurse, G: General
	ShiftTimings VARCHAR(20) NOT NULL,

	PRIMARY KEY(StaffID)
);

CREATE TABLE Staff.Doctor(
	Specialization VARCHAR(20) NOT NULL,
	Qualifications VARCHAR(50) NOT NULL,
	YearsOfExperience INT NOT NULL,
	LicenseNumber VARCHAR(9) NOT NULL UNIQUE,
	AvailabilityStatus BIT NOT NULL --1 = AVAILABLE.
);

CREATE TABLE Staff.Nurse(
	--StaffID INT NOT NULL UNIQUE,
	--NurseID AS ('N' + RIGHT('000' + CAST(StaffID AS VARCHAR(4)), 4)) PERSISTED,
	Specialization VARCHAR(20) NOT NULL,
	Qualifications VARCHAR(50) NOT NULL,
	YearsOfExperience INT NOT NULL,
	LicenseNumber VARCHAR(9) NOT NULL UNIQUE,
	AvailabilityStatus BIT NOT NULL --1 = AVAILABLE.
);

CREATE TABLE Staff.General(
	--StaffID INT NOT NULL UNIQUE,
	JobType VARCHAR(20),
	Department VARCHAR(20) NOT NULL
);
--extra employmeny info:
	--Role (Admin, Receptionist, Technician, etc.)
	--Department
	--Date of Joining
	--Work Schedule
	--Salary Details
	--Emergency Contact Information

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
