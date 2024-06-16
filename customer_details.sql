-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 07:41 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `customer details`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cid` int(11) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Province` varchar(20) NOT NULL,
  `ContactNumber` varchar(45) NOT NULL,
  `ContactNumber2` varchar(20) NOT NULL,
  `EmailAddress` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cid`, `FullName`, `Address`, `Province`, `ContactNumber`, `ContactNumber2`, `EmailAddress`) VALUES
(1, 'Akila ', 'Malwane', 'Southern', '77626778', '74569823', 'akila@gamil.com'),
(9, 'ganga sewmini', 'magura,wesy,baduraliya', 'Northern', '87757543', '6774386', 'fdeshjhujb@gmail.com'),
(11, 'kasuni mekala', 'gamapaha', 'Western', '77455534', '2666171', 'hsjansk@gmail.com'),
(13, 'ureni noshika', 'ajhaj,mathugama', 'Eastern', '62768278', '6276278', 'hsjkajk@gmail.com'),
(15, 'reswdf naswe', 'asewq ghjk', 'Northern', '07411234586', '67644677', 'fhgjfh@gmail.com'),
(16, 'jalani nangi', 'asewq ghjk', 'Northern', '07411234586', '67644677', 'fhgjfh@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `FullName` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Number` int(20) NOT NULL,
  `oid` int(11) NOT NULL,
  `price` varchar(45) NOT NULL,
  `date` varchar(20) NOT NULL,
  `track` varchar(20) NOT NULL,
  `deliver` varchar(50) NOT NULL,
  `update` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order`
--

INSERT INTO `order` (`FullName`, `Address`, `Number`, `oid`, `price`, `date`, `track`, `deliver`, `update`) VALUES
('kju', 'cx', 12, 1, '12', '332', '32', 'Sl Post', 'Successfull Dilivered'),
('jalani', 'magura,west,baduraliya', 741185765, 2, '10542.00', '2024.05.12', 'as00896532', 'Curreir Service', 'Delivery Fail'),
('jalani', 'sewmini', 7625566, 3, '7000.00', '04/04/2026', '56177888', 'Curreir Service', 'Successfull Dilivered'),
('jalani', 'magura,west,baduraliya', 74556231, 4, '4500.00', '09/4/2024', '6277189', 'Curreir Service', 'Successfull Dilivered');

-- --------------------------------------------------------

--
-- Table structure for table `sregister`
--

CREATE TABLE `sregister` (
  `sid` int(11) NOT NULL,
  `Shopname` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Number` int(20) NOT NULL,
  `Emergencynumber` int(20) NOT NULL,
  `shoptype` varchar(45) NOT NULL,
  `Typeofflower` varchar(50) NOT NULL,
  `Averagetime` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sregister`
--

INSERT INTO `sregister` (`sid`, `Shopname`, `Address`, `Number`, `Emergencynumber`, `shoptype`, `Typeofflower`, `Averagetime`) VALUES
(4, 'samindi', 'hajhaja', 766277, 5266277, 'Register', 'rose,daisy', 'Less than 1 hour'),
(5, 'yositha', 'malwana,maharagama', 7543555, 565646, 'Register', 'rose,daisy', '1 hour ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`oid`);

--
-- Indexes for table `sregister`
--
ALTER TABLE `sregister`
  ADD PRIMARY KEY (`sid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
  MODIFY `oid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `sregister`
--
ALTER TABLE `sregister`
  MODIFY `sid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
