CREATE DATABASE `jwt-boot_db`

-- `jwt-boot_db`.authentication definition

CREATE TABLE `authentication` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `jwt-boot_db`.authentication(username, password) VALUES('username', 'password');

-- `jwt-boot_db`.employees definition

CREATE TABLE `employees` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `data_1` varchar(50) DEFAULT NULL,
  `data_2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

INSERT INTO `jwt-boot_db`.employees (employee_id, first_name, last_name, data_1, data_2) VALUES(1, 'a', 's', '0', '1');
INSERT INTO `jwt-boot_db`.employees (employee_id, first_name, last_name, data_1, data_2) VALUES(3, 'a', 'z', '3', '2');
INSERT INTO `jwt-boot_db`.employees (employee_id, first_name, last_name, data_1, data_2) VALUES(5, 'a', 'c', '1', '1');
INSERT INTO `jwt-boot_db`.employees (employee_id, first_name, last_name, data_1, data_2) VALUES(6, 'a', 'q', '1', '5');
INSERT INTO `jwt-boot_db`.employees (employee_id, first_name, last_name, data_1, data_2) VALUES(7, 'a', 'a', '6', '1');
