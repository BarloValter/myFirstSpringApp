-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`producers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`producers` ;

CREATE TABLE IF NOT EXISTS `mydb`.`producers` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `producer_name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`phones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`phones` ;

CREATE TABLE IF NOT EXISTS `mydb`.`phones` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `phone_name` VARCHAR(45) NOT NULL,
  `screen` DOUBLE NOT NULL,
  `camera` INT(11) NOT NULL,
  `ram` INT(11) NOT NULL,
  `memory` INT(11) NOT NULL,
  `sim` INT(11) NOT NULL,
  `price` DECIMAL(10,0) NOT NULL,
  `producers_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`, `producers_id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_smartphones_producers_idx` (`producers_id` ASC) VISIBLE,
  CONSTRAINT `fk_smartphones_producers`
    FOREIGN KEY (`producers_id`)
    REFERENCES `mydb`.`producers` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

USE `mydb`;

INSERT INTO mydb.producers (id, producer_name) VALUES (1, 'Samsung');
INSERT INTO mydb.producers (id, producer_name) VALUES (2, 'Xiaomi');
INSERT INTO mydb.producers (id, producer_name) VALUES (3, 'Huawei');
INSERT INTO mydb.producers (id, producer_name) VALUES (4, 'TP-Link');
INSERT INTO mydb.producers (id, producer_name) VALUES (5, 'Honor');

INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (1, ' Y7', 6.26, 13, 3, 32, 2, 3999, 2);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (2, ' Neffos C9s', 5.71, 13, 2, 16, 2, 2099, 4);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (3, ' Redmi Note 8 Pro', 6.53, 64, 6, 64, 2, 5999, 2);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (4, 'Y5', 5.71, 13, 2, 16, 2, 2239, 3);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (5, ' 10 Lite', 6.21, 13, 3, 64, 2, 3999, 5);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (6, ' Galaxy S10', 6.7, 48, 6, 128, 2, 15999, 1);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (7, ' Neffos X20 Pro', 6.26, 13, 3, 64, 2, 3299, 4);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (8, ' Neffos C5 Plus', 5.34, 5, 1, 8, 1, 1399, 4);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (9, ' Redmi 8', 6.22, 12, 4, 64, 2, 3699, 3);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (10, ' Redmi 7A ', 5.45, 13, 2, 16, 2, 2199, 3);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (11, ' Galaxy S9', 5.8, 12, 4, 64, 2, 11999, 1);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (12, ' Galaxy M30s', 6.4, 48, 4, 64, 2, 5999, 1);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (13, ' Galaxy A10s', 6.2, 13, 2, 32, 2, 3599, 1);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (14, ' Nova 5T', 6.26, 48, 6, 128, 2, 9999, 3);
INSERT INTO mydb.phones (id, phone_name, screen, camera, ram, memory, sim, price, producers_id) VALUES (15, 'Galaxy A51', 6.5, 48, 4, 64, 2, 8499, 1);

SELECT * FROM mydb.phones;