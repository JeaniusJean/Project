CREATE DATABASE TickTask;
DROP DATABASE IF EXISTS TickTask;
USE TickTask;

CREATE TABLE User(
FName varchar (50),
LName varchar (50),
Email varchar (50),
Pword varchar (50)
);

SELECT * FROM User;

CREATE TABLE Task (
Email varchar (50),
Deadline date,
ProjectName varchar (50),
Task varchar (300),
Complete boolean
);

SELECT * FROM Task;


