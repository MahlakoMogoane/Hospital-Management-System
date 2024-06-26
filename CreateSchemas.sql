USE HospitalManagement;
GO;

--"CREATE SCHEMA" allows the databse to essentially have "sub databases" which will work amazingly with the organization of the following databases
--"GO" signals the end of a batch, ensuring each schema creation command is executed in its own batch.

CREATE SCHEMA Patient;
GO;

CREATE SCHEMA Appointment;
GO;

CREATE SCHEMA Finance;
GO;

CREATE SCHEMA Inventory;
GO;

CREATE SCHEMA Laboratory;
GO;

CREATE SCHEMA Staff;
GO;

CREATE SCHEMA Room;
GO;

CREATE SCHEMA Pharmacy;
GO;

CREATE SCHEMA Report;
GO;

--drop schemas
DROP SCHEMA Patient;
DROP SCHEMA Appointment;
DROP SCHEMA Finance;
DROP SCHEMA Inventory;
DROP SCHEMA Laboratory;
DROP SCHEMA Staff;
DROP SCHEMA Room;
DROP SCHEMA Pharmacy;
DROP SCHEMA Report;