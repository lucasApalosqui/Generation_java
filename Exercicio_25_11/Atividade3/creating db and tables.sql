-- creating database and use
CREATE DATABASE db_school;
USE db_school;

-- creating tables
CREATE TABLE tbl_students (
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    student_name VARCHAR(80) NOT NULL,
	student_class BIGINT(4) NULL,
    grades float NOT NULL,
    recovery BOOLEAN NOT NULL
);