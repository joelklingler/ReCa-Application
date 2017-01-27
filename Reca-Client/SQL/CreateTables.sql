CREATE TABLE Customer
(
	Id INT IDENTITY(1,1) NOT NULL,
	FirstName VARCHAR(max),
	LastName VARCHAR(max),
	CommunicationAddress VARCHAR(max),
	CommunicationEmail VARCHAR(max),
	CommunicationTelephone VARCHAR(max),
	Insurance VARCHAR(max),	
	PRIMARY KEY (Id),
)
CREATE TABLE Communication
(
	Id INT IDENTITY(1,1) NOT NULL,
	CommunicationDate DateTime,
	Author VARCHAR(max),
	Receiver VARCHAR(max),
	Regard VARCHAR(max),
	Content TEXT,
	CustomerId INT NOT NULL,
	PRIMARY KEY (Id),
	FOREIGN KEY (CustomerId) REFERENCES Customer(Id)
)
CREATE TABLE Vehicle
(
	Id INT IDENTITY(1,1) NOT NULL,
	LicenseNumber VARCHAR(max),
	VehicleType VARCHAR(max),
	VehicleYear DATETIME,
	VehicleColor VARCHAR(max),
	MaxPersonsCount INT,
	VehicleBrand VARCHAR(max),
	VehicleCost DECIMAL(19,4),
	VehicleInsurance VARCHAR(max),
	VehicleStatus BIT,
	PRIMARY KEY(Id)
)
CREATE TABLE Rental
(
	Id INT IDENTITY(1,1) NOT NULL,
	VehicleId INT NOT NULL,
	CustomerId INT NOT NULL,
	StartDate DATETIME,
	EndDate DATETIME,
	PRIMARY KEY (Id),
	FOREIGN KEY (VehicleId) REFERENCES Vehicle(Id),
	FOREIGN KEY (CustomerId) REFERENCES Customer(Id)
)
CREATE TABLE Invoice
(
	Id INT IDENTITY(1,1) NOT NULL,
	InvoiceDate DATETIME,
	MaxPayDate DATETIME,
	Amount DECIMAL(19,4),
	CustomerId INT NOT NULL,
	InvoiceState BIT,
	AdditionalInformation TEXT,
	RentalId INT NOT NULL,
	PRIMARY KEY (Id),
	FOREIGN KEY (CustomerId) REFERENCES Customer(Id),
	FOREIGN KEY (RentalId) REFERENCES Rental(Id)
)
CREATE TABLE Payment
(
	Id INT IDENTITY(1,1) NOT NULL,
	PaymentDate DATETIME,
	IBAN VARCHAR(max),
	AdditionalInformation TEXT,
	InvoiceId INT NOT NULL,
	PRIMARY KEY (Id),
	FOREIGN KEY (InvoiceId) REFERENCES Invoice(Id)
)
