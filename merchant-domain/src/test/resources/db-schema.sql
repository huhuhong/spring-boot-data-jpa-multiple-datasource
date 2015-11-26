create schema "DBO" authorization sa;

CREATE TABLE DBO.Tenant (
	Id varchar(36) NOT NULL PRIMARY KEY,
	OrganizationCode nvarchar(10) NULL,
	ServerName nvarchar(100) NULL,
	IsDeleted BIT NOT NULL
);
