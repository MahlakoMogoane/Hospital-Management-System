USE HospitalManagement;

CREATE TABLE Inventory.Supplier(
	SupplierID INT IDENTITY(1, 1) NOT NULL UNIQUE,
	SupplierName VARCHAR(25) NOT NULL,
	ContactName VARCHAR(25) NOT NULL,
	ContactNumber VARCHAR(10) NOT NULL UNIQUE,
	ContactEMail VARCHAR(50) NOT NULL UNIQUE,
	Website VARCHAR(50) NOT NULL UNIQUE,

	PRIMARY KEY(SupplierID)
);

CREATE TABLE Inventory.Inventory(
	ItemID INT IDENTITY(100, 1) NOT NULL UNIQUE,
	ItemName VARCHAR(50) NOT NULL,
	ItemCode VARCHAR(5) NOT NULL UNIQUE,
	QuantityinStock INT NOT NULL,
	SupplierID INT NOT NULL,
	PurchaseDate DATE NOT NULL,
	ExpiryDate DATE NOT NULL,

	PRIMARY KEY(ItemID),
	FOREIGN KEY(SupplierID) REFERENCES Inventory.Supplier(SupplierID)
);
