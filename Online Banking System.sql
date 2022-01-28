-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: data_technologies
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `Account_ID` int NOT NULL AUTO_INCREMENT,
  `Account_Name` varchar(45) NOT NULL,
  `Account_Type` varchar(45) NOT NULL,
  `Account_Balance` decimal(10,2) NOT NULL,
  PRIMARY KEY (`Account_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=45001010 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (45001000,'Student','Savings',150000.00),(45001001,'Business','Salary',253000.00),(45001002,'Student','Savings',100100.00),(45001003,'Special','Savings',150000.00),(45001004,'Business','Salary',200000.00),(45001005,'Business','Salary',80000.00),(45001006,'Business','Salary',130000.00),(45001007,'Student','Savings',195000.00),(45001008,'Student','Savings',100000.00),(45001009,'Business','Salary',140000.00);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credit`
--

DROP TABLE IF EXISTS `credit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `credit` (
  `Credit_ID` int NOT NULL AUTO_INCREMENT,
  `Credit_Amount` decimal(10,2) NOT NULL,
  `Credit_Total` decimal(10,2) NOT NULL,
  `Credit_Type` varchar(45) NOT NULL,
  `Credit_Info` timestamp(6) NOT NULL,
  PRIMARY KEY (`Credit_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1011 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit`
--

LOCK TABLES `credit` WRITE;
/*!40000 ALTER TABLE `credit` DISABLE KEYS */;
INSERT INTO `credit` VALUES (1001,20000.00,130000.00,'Cash','2020-11-11 02:39:15.000000'),(1002,30000.00,233000.00,'Cheque','2020-12-01 04:45:12.000000'),(1003,15000.00,860000.00,'Cash','2020-11-15 06:31:55.000000'),(1004,20000.00,130000.00,'Cash','2020-11-30 19:42:30.000000'),(1005,15500.00,185500.00,'Cheque','2020-10-28 21:45:10.000000'),(1006,70000.00,10000.00,'Cash','2020-11-01 06:31:02.000000'),(1007,10000.00,120000.00,'Cash','2020-12-15 04:45:30.000000'),(1008,25000.00,165000.00,'Cheque','2020-10-26 05:41:11.000000'),(1009,5000.00,95000.00,'Cash','2020-10-20 06:40:45.000000'),(1010,100000.00,40000.00,'Cheque','2020-11-23 06:45:30.000000');
/*!40000 ALTER TABLE `credit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `Customer_ID` int NOT NULL AUTO_INCREMENT,
  `Customer_Name` varchar(45) NOT NULL,
  `Customer_Address` varchar(45) NOT NULL,
  `Customer_Mobile` varchar(45) NOT NULL,
  `Customer_Email` varchar(45) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1011 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1001,'D.M. Pavithra Nirmana','92, Reclamation Road, Colombo 11','076-4568565','pavithra@sltc.ac.lk','pavithra@sltc.ac.lk','Pavithra$123456'),(1002,'A.S. Bandarathilaka','273 Galle Road, 03','077-6545566','avishka12@gmail.com','avishka12@gmail.com','5482@45'),(1003,'B.H.I.S. Peris','No. 01, Alfred House Avenue','071-5656644','isahdi@sltc.ac.lk','isahdi@sltc.ac.lk','Ishadi456123'),(1004,'S.S. Ambuldeniya','15c Old Quarry Road, Mount Lavinia','075-5656482','sameera15@gmail.com','sameera15@gmail.com','Sameera54'),(1005,'N.M. Vitharana','87 C P De Silva Mawatha, Kaldemulla','077-4511223','nalindu45@gmail.com','nalindu45@gmail.com','Nalindu@456'),(1006,'I.B. Roshan Mendis','63/2, Dharmapala Mawatha','072-5485112','roshan123@gmail.com','roshan123@gmail.com','12345678@R'),(1007,'Himal Samarasinghe','77, Nungamugoda Road','071-5336641','samare14@gmail.com','samare14@gmail.com','Sam45$223'),(1008,'B. Sachindra Walpola','341, Union Place Colombo 2','070-2354122','sachi2002@sltc.ac.lk','sachi2002@sltc.ac.lk','1999.05%sachi'),(1009,'C.B. Rathnayake','266-B, New Road','077-1234582','Rathn@gmail.com','Rathn@gmail.com','8888@Rathna'),(1010,'R.M.D.N. Ranasinghe','No. 15, Katugastota, Kandy','077-4582113','Ransinghe@gmail.com','Ransinghe@gmail.com','RMDN%123456');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `debit`
--

DROP TABLE IF EXISTS `debit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `debit` (
  `Debit_ID` int NOT NULL AUTO_INCREMENT,
  `Debit_Amount` decimal(10,2) NOT NULL,
  `Debit_Total` decimal(10,2) NOT NULL,
  `Debit_Type` varchar(45) NOT NULL,
  `Debit_Info` timestamp NOT NULL,
  PRIMARY KEY (`Debit_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9011 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `debit`
--

LOCK TABLES `debit` WRITE;
/*!40000 ALTER TABLE `debit` DISABLE KEYS */;
INSERT INTO `debit` VALUES (9001,10000.00,140000.00,'Cash','2021-01-15 03:45:30'),(9002,20000.00,250000.00,'Cash','2021-01-16 04:45:30'),(9003,2000.00,880000.00,'Cash','2021-01-17 19:48:30'),(9004,5500.00,135500.00,'Cash','2021-01-14 19:52:50'),(9005,9000.00,199000.00,'Cheque','2021-01-15 04:55:10'),(9006,10000.00,250000.00,'Cash','2021-01-14 19:45:35'),(9007,25000.00,150000.00,'Cash','2021-01-15 06:45:12'),(9008,10000.00,335000.00,'Cash','2021-01-15 06:36:15'),(9009,50000.00,154200.00,'Cash','2021-01-14 22:25:40'),(9010,65000.00,145660.00,'Cash','2021-01-15 06:05:32');
/*!40000 ALTER TABLE `debit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `services`
--

DROP TABLE IF EXISTS `services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `services` (
  `Service_ID` int NOT NULL AUTO_INCREMENT,
  `Customer_ID` int NOT NULL,
  `Services_Type` varchar(45) NOT NULL,
  `Service_Description` timestamp NOT NULL,
  PRIMARY KEY (`Service_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2520 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `services`
--

LOCK TABLES `services` WRITE;
/*!40000 ALTER TABLE `services` DISABLE KEYS */;
INSERT INTO `services` VALUES (2510,1003,'Email','2020-01-02 05:02:10'),(2511,1008,'Email','2020-02-17 06:22:55'),(2512,1001,'Hotline','2020-11-01 20:26:20'),(2513,1006,'Email','2020-03-21 05:15:10'),(2514,1007,'Hotline','2020-08-02 04:05:10'),(2515,1002,'Hotline','2020-12-03 07:05:30'),(2516,1004,'Email','2020-06-11 19:55:10'),(2517,1005,'Email','2020-01-22 04:45:32'),(2518,1009,'Email','2020-03-01 20:43:10'),(2519,1010,'Hotline','2020-01-19 21:45:50');
/*!40000 ALTER TABLE `services` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-19 13:02:30

