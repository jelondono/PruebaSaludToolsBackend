-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-03-2022 a las 00:42:50
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27
SET
    SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";

START TRANSACTION;

SET
    time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */
;

/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */
;

/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */
;

/*!40101 SET NAMES utf8mb4 */
;

--
-- Base de datos: `db_saludtools`
--
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `tbs_tipocitas`
--
CREATE DATABASE tbs_tipocitas;

USE tbs_tipocitas;

CREATE TABLE
    `tbs_tipocitas` (
        `id` INT(11) NOT NULL,
        `nombre` VARCHAR(100) NOT NULL,
        `descripcion` VARCHAR(200) NOT NULL,
        `color` VARCHAR(50) NOT NULL,
        `duracion_minutos` INT(10) NOT NULL,
        `activo` tinyint(1) NOT NULL,
        `fec_creacion` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP()
        ON
        UPDATE
            CURRENT_TIMESTAMP(),
            `fec_actualizacion` TIMESTAMP NULL DEFAULT NULL
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

--
-- Índices para tablas volcadas
--
--
-- Indices de la tabla `tbs_tipocitas`
--
ALTER TABLE
    `tbs_tipocitas`
ADD
    PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--
--
-- AUTO_INCREMENT de la tabla `tbs_tipocitas`
--
ALTER TABLE
    `tbs_tipocitas` MODIFY `id` INT(11) NOT NULL AUTO_INCREMENT;

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */
;

/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */
;

/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */
;