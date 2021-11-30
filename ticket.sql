-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 30-11-2021 a las 03:02:30
-- Versión del servidor: 5.7.31
-- Versión de PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ticket`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localidad_partido`
--

DROP TABLE IF EXISTS `localidad_partido`;
CREATE TABLE IF NOT EXISTS `localidad_partido` (
  `CODIGO_LOCALIDAD` int(11) NOT NULL,
  `CODIGO` int(11) DEFAULT NULL,
  `DISPONIBILIDAD` varchar(2) NOT NULL,
  `PRECIO` float(5,2) NOT NULL,
  PRIMARY KEY (`CODIGO_LOCALIDAD`),
  KEY `FK_LOCALIDA_REFERENCE_PARTIDO_` (`CODIGO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `localidad_partido`
--

INSERT INTO `localidad_partido` (`CODIGO_LOCALIDAD`, `CODIGO`, `DISPONIBILIDAD`, `PRECIO`) VALUES
(1, 1, '30', 20.00),
(2, 1, '12', 30.00),
(3, 1, '8', 13.00),
(4, 2, '5', 10.00),
(5, 3, '10', 20.00),
(6, 2, '7', 20.00),
(7, 4, '9', 10.00),
(8, 4, '9', 20.00),
(9, 5, '3', 20.00),
(10, 2, '3', 10.00),
(11, 3, '20', 25.00),
(12, 6, '30', 25.00),
(13, 6, '33', 10.00),
(14, 6, '20', 20.00),
(15, 5, '15', 20.00),
(16, 1, '20', 20.00),
(17, 1, '45', 20.00),
(18, 6, '30', 10.00),
(19, 6, '20', 20.00),
(20, 5, '30', 20.00),
(21, 6, '30', 20.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido_futbol`
--

DROP TABLE IF EXISTS `partido_futbol`;
CREATE TABLE IF NOT EXISTS `partido_futbol` (
  `CODIGO` int(11) NOT NULL,
  `EQUIPO_LOCAL` varchar(50) NOT NULL,
  `EQUIPO_VISITA` varchar(50) NOT NULL,
  `FECHA` date NOT NULL,
  `LUGAR` varchar(50) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `partido_futbol`
--

INSERT INTO `partido_futbol` (`CODIGO`, `EQUIPO_LOCAL`, `EQUIPO_VISITA`, `FECHA`, `LUGAR`) VALUES
(1, 'LIGA DE LOJA', 'INDEPENDIENTE', '2021-07-11', 'QUITO'),
(2, 'NACIONAL', 'AUCAS', '2021-03-12', 'QUITO'),
(3, 'REAL AMBATO', 'NACIONAL', '2021-09-28', 'AMBATO'),
(4, 'BARCELONA', 'EMELEC', '2021-10-15', 'GUAYAQUIL'),
(5, 'INDEPENDIENTE', 'MACARA', '2021-02-23', 'SANGOLQUI'),
(6, 'LIBERTAD', 'ESTUDIANTES', '2021-05-03', 'EL ORO');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
