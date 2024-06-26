USE HospitalManagement;

CREATE TABLE Report(
	ReportID INT IDENTITY(1000,1) NOT NULL UNIQUE,
	ReportType VARCHAR(20) NOT NULL,
	GenerationDate DATE NOT NULL,
	GeneratedBy VARCHAR(25) NOT NULL,
	Summary VARCHAR(255) NOT NULL
);