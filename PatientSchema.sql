USE HospitalManagement;
GO;

CREATE TABLE Patient.Personal(
	PatientID INT IDENTITY(1,1) NOT NULL,
	FullName VARCHAR(25) NOT NULL,
	Surname VARCHAR(25) NOT NULL,
	DateOfBirth DATE NOT NULL,
	IDNumber VARCHAR(13) NOT NULL UNIQUE,
	Gender VARCHAR(1) NOT NULL,
	PhoneNumber VARCHAR(10) NOT NULL UNIQUE,
	EMail VARCHAR(30) NOT NULL UNIQUE,
	EmergencyContactName VARCHAR(20) NOT NULL,
	EmergencyContactPhone VARCHAR(10) NOT NULL,

	PRIMARY KEY(PatientID)
);

CREATE TABLE Patient.Medical(
	PatientID INT NOT NULL,
	PrimaryDoctorID INT NOT NULL,

	FOREIGN KEY(PatientID) REFERENCES Patient.Personal
);

CREATE TABLE Patient.Visit(
	PatientID INT NOT NULL,
	AdmissionDate DATE NOT NULL,
	DischargeDate DATE,
	ReasonForVisit VARCHAR(25) NOT NULL,
	AssignedNurse INT NOT NULL,
	BedNumber INT NOT NULL,

	FOREIGN KEY(PatientID) REFERENCES Patient.Personal
);

