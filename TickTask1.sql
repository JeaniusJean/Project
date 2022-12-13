DROP DATABASE TickTask;
CREATE DATABASE TickTask;
USE TickTask;

CREATE TABLE Users (
FName varchar (50),
LName varchar (50),
Email varchar (50),
Pword varchar (50)
);
SELECT * FROM Users;

CREATE TABLE Task (
Email varchar (50),
Deadline date,
ProjectName varchar (50),
Task varchar (255),
Complete boolean
);
SELECT * FROM Task;