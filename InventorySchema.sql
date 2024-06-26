USE HospitalManagement;

CREATE TABLE Inventory.Inventory(
	ItemID INT IDENTITY(100, 1) NOT NULL UNIQUE,
	ItemName VARCHAR(50) NOT NULL,
	ItemCode VARCHAR(5) NOT NULL UNIQUE,
	QuantityinStock INT NOT NULL,
	SupplierID INT NOT NULL,
	PurchaseDate DATE NOT NULL,
	ExpiryDate DATE NOT NULL,

	PRIMARY KEY(ItemID),
	FOREIGN KEY(SupplierID) REFERENCES Supplier(SupplierID)
);


CREATE TABLE Supplier(
	SupplierID INT IDENTITY(1, 1) NOT NULL UNIQUE,
	SupplierName VARCHAR(25) NOT NULL,
	Supplies VARCHAR(50) NOT NULL
);
