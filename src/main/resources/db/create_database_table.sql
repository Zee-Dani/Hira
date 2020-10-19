DROP USER IF EXITS 'arewa'@'localhost';
CREATE USER 'arewa'@'localhost' IDENTIFIED BY 'arewa123';
GRANT ALL PRIVILEGES ON hira.* TO 'arewa'@'localhost';

DROP DATABASE IF EXISTS hira;
CREATE DATABASE hira,
ENGINE=INNODB;


--CREATE TABLE [IF NOT EXISTS] hira_user(
-- id INT AUTO_INCREMENT PRIMARY KEY,
-- username VARCHAR(100) NOT NULL,
-- first_name VARCHAR(50) NULL,
-- last_name VARCHAR(50) NULL,
-- email VARCHAR(250) NOT NULL,
-- phone_number VARCHAR(20) NULL,
-- address VARCHAR(300) NULL,
-- gender
-- date_of_birth
-- date_created )
