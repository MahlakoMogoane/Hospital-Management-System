USE HospitalManagement;

CREATE TABLE Appointment.Appointment(
	ID INT IDENTITY(1,1) NOT NULL UNIQUE,
	PatientID INT NOT NULL,
	DoctorID INT NOT NULL,
	AppointmentDate DATE NOT NULL,
	AppointmentTime TIME NOT NULL,
	Reason VARCHAR(50) NOT NULL,
	AppointmentStatus VARCHAR(10) NOT NULL,
	Notes VARCHAR(255) NOT NULL,

	PRIMARY KEY(ID),
	FOREIGN KEY(PatientID) REFERENCES Patient.Personal(PatientID),
	FOREIGN KEY(DoctorID) REFERENCES Staff.Doctor(StaffID)
);