USE HospitalManagement;

CREATE TABLE Finance.Bill(
	BillID INT IDENTITY(1,1) NOT NULL UNIQUE,
	PatientID INT NOT NULL UNIQUE,
	Total DECIMAL(10, 2) NOT NULL,
	PaymentStaus VARCHAR(9) NOT NULL,
	Method VARCHAR(11) NOT NULL,

	PRIMARY KEY(BillID)
);

CREATE TABLE Finance.HospitalService(
	ServiceID INT IDENTITY(100,1) NOT NULL UNIQUE,
	ServiceName VARCHAR(20) NOT NULL,
	ServicePrice DECIMAL(10, 2),

	PRIMARY KEY(ServiceID)
);

CREATE TABLE Finance.Medication(
	MedID INT IDENTITY(100,1) NOT NULL UNIQUE,
	MedicationName VARCHAR(50) NOT NULL,
	Price DECIMAL(10, 2) NOT NULL,

	PRIMARY KEY(MedID)
);

CREATE TABLE ServiceBridge(
	PatientID INT NOT NULL,
	ServiceID INT NOT NULL UNIQUE,

	PRIMARY KEY(PatientID, ServiceID),
	FOREIGN KEY(PatientID) REFERENCES Patient.Personal(PatientID),
	FOREIGN KEY(ServiceID) REFERENCES Finance.HospitalService(ServiceID)
);

CREATE TABLE MedBridge(
	PatientID INT NOT NULL,
	MedID INT NOT NULL UNIQUE,

	PRIMARY KEY(PatientID, MedID),
	FOREIGN KEY(PatientID) REFERENCES Patient.Personal(PatientID),
	FOREIGN KEY(MedID) REFERENCES Finance.Medication(MedID)
);