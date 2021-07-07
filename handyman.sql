-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-07-2021 a las 17:40:49
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `handyman`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicereport`
--

CREATE TABLE `servicereport` (
  `TECHNICALID` varchar(20) NOT NULL,
  `SERVICEID` varchar(20) NOT NULL,
  `STARTDATE` varchar(20) NOT NULL,
  `FINISHDATE` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `servicereport`
--

INSERT INTO `servicereport` (`TECHNICALID`, `SERVICEID`, `STARTDATE`, `FINISHDATE`) VALUES
('20', '20', '2021-07-06T23:00', '2021-07-06T23:30'),
('30', '45', '2021-07-11T16:30', '2021-07-11T17:50'),
('10', '54488', '2021-07-06T09:00', '2021-07-06T10:30'),
('40', '545', '2021-07-06T07:00', '2021-07-06T08:30'),
('50', '445', '2021-07-06T20:30', '2021-07-06T21:10'),
('60', '454', '2021-07-06T11:53', '2021-07-09T11:53'),
('500', '6446', '2021-06-28T08:00', '2021-06-28T19:00'),
('500', '600', '2021-06-29T08:00', '2021-06-29T19:00'),
('500', '4545', '2021-06-30T08:00', '2021-06-30T19:00'),
('500', '4545', '2021-07-01T08:00', '2021-07-01T19:00'),
('500', '4789', '2021-07-03T13:00', '2021-07-03T17:00'),
('500', '45454', '2021-07-02T08:00', '2021-07-02T16:00');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
