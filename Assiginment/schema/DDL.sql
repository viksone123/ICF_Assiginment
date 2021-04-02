CREATE TABLE Employee (
    ID varchar(10),
    First_Name varchar(10),
    Last_Name varchar(10),
    Emp_ID varchar(10),
    Start_Date varchar(5),
    Designation varchar(10).
    Department varchar(10),
    End_Date varchar(10),
    Status varchar(10),
    DOB varchar(10),
    Reporting_Manager varchar(10),
    Gender varchar(6),
    Blood_Group varchar(3),
    Address varchar(10)
);

CREATE TABLE Dependants (
	ID varchar(10),
    First_Name varchar(10),
    Last_Name varchar(10),
    DOB varchar(10),
    Gender varchar(6),
    Relation varchar(10)
);

CREATE TABLE Education (
	ID varchar(10),
    Type varchar(10),
    Start_Date varchar(10),
    End_Date varchar(10),
    Institution varchar(10),
    Address varchar(10),
    Percentage varchar(4)
);
