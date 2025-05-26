-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-05-2025 a las 13:59:47
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gym`
--

DELIMITER $$
--
-- Funciones
--
CREATE DEFINER=`root`@`localhost` FUNCTION `calcular_imc` (`id_usuario` INT) RETURNS DECIMAL(5,2) DETERMINISTIC BEGIN
    DECLARE v_peso DECIMAL(5,2);
    DECLARE v_altura DECIMAL(5,2);
    DECLARE v_imc DECIMAL(5,2);
    
    -- Obtener peso y altura del usuario
    SELECT peso, altura 
    INTO v_peso, v_altura
    FROM usuarios 
    WHERE id_usuario = id2;
    
    -- Calcular IMC (peso / altura^2)
    
        SET v_imc = v_peso / (v_altura/100 * v_altura/100);
    
    
    RETURN v_imc;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `nombreUsuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefono` int(9) NOT NULL,
  `id2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`nombreUsuario`, `password`, `email`, `telefono`, `id2`) VALUES
('yoyo', 'root', 'holabuenas8@gmail.com', 123856789, 5),
('anagarcia', 'pass123', 'ana1@gmail.com', 600123001, 12),
('luismartinez', 'pass456', 'luis2@gmail.com', 600123002, 13),
('sofialopez', 'pass789', 'sofia3@gmail.com', 600123003, 14),
('carlosruiz', 'pass101', 'carlos4@gmail.com', 600123004, 15),
('mariafernandez', 'pass112', 'maria5@gmail.com', 600123005, 16),
('pedrosanchez', 'pass131', 'pedro6@gmail.com', 600123006, 17),
('lauragomez', 'pass141', 'laura7@gmail.com', 600123007, 18),
('javierdiaz', 'pass151', 'javier8@gmail.com', 600123008, 19),
('elenamorales', 'pass161', 'elena9@gmail.com', 600123009, 20),
('miguelangel', 'pass171', 'miguel10@gmail.com', 600123010, 21),
('carmantorres', 'pass181', 'carmen11@gmail.com', 600123011, 22),
('davidjimenez', 'pass191', 'david12@gmail.com', 600123012, 23),
('isabelcastro', 'pass201', 'isabel13@gmail.com', 600123013, 24),
('antoniovargas', 'pass211', 'antonio14@gmail.com', 600123014, 25),
('clararomero', 'pass221', 'clara15@gmail.com', 600123015, 26),
('rubenortiz', 'pass231', 'ruben16@gmail.com', 600123016, 27),
('teresanavarro', 'pass241', 'teresa17@gmail.com', 600123017, 28),
('pablomedina', 'pass251', 'pablo18@gmail.com', 600123018, 29),
('martaserrano', 'pass261', 'marta19@gmail.com', 600123019, 30),
('diegoalonso', 'pass271', 'diego20@gmail.com', 600123020, 31),
('luciabravo', 'pass281', 'lucia21@gmail.com', 600123021, 32),
('raulhidalgo', 'pass291', 'raul22@gmail.com', 600123022, 33),
('saradelgado', 'pass301', 'sara23@gmail.com', 600123023, 34),
('alvarocampos', 'pass311', 'alvaro24@gmail.com', 600123024, 35),
('beatrizgil', 'pass321', 'beatriz25@gmail.com', 600123025, 36),
('oscarpena', 'pass331', 'oscar26@gmail.com', 600123026, 37),
('nuriarivas', 'pass341', 'nuria27@gmail.com', 600123027, 38),
('hectorluna', 'pass351', 'hector28@gmail.com', 600123028, 39),
('inesmolina', 'pass361', 'ines29@gmail.com', 600123029, 40),
('victorcano', 'pass371', 'victor30@gmail.com', 600123030, 41),
('lorenasantos', 'pass381', 'lorena31@gmail.com', 600123031, 42),
('marcospardo', 'pass391', 'marcos32@gmail.com', 600123032, 43),
('cristinavega', 'pass401', 'cristina33@gmail.com', 600123033, 44),
('ivanrubio', 'pass411', 'ivan34@gmail.com', 600123034, 45),
('patricialeon', 'pass421', 'patricia35@gmail.com', 600123035, 46),
('adriancruz', 'pass431', 'adrian36@gmail.com', 600123036, 47),
('noeliaramos', 'pass441', 'noelia37@gmail.com', 600123037, 48),
('sergioblanco', 'pass451', 'sergio38@gmail.com', 600123038, 49),
('aliciaflores', 'pass461', 'alicia39@gmail.com', 600123039, 50),
('manolito3432', '1234abcd', 'medac@gmail.com', 987654321, 51),
('manolito3', '1234abcd', 'medac@gmail.com', 987654321, 52);

--
-- Disparadores `cuentas`
--
DELIMITER $$
CREATE TRIGGER `validEmail` BEFORE INSERT ON `cuentas` FOR EACH ROW IF new.email NOT LIKE '%@gmail.com' THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El correo electrónico no es válido, prueba con terminar en "@gmail.com"';
    END IF
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Nombre` varchar(50) NOT NULL,
  `Edad` int(11) DEFAULT NULL,
  `Peso` int(11) DEFAULT NULL,
  `Altura` int(11) DEFAULT NULL,
  `FechaRegistro` date NOT NULL,
  `Entrenando` tinyint(1) NOT NULL,
  `id2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Nombre`, `Edad`, `Peso`, `Altura`, `FechaRegistro`, `Entrenando`, `id2`) VALUES
('Hugo', 19, 70, 175, '2025-05-21', 0, 5),
('Ana García', 22, 55, 160, '2025-05-22', 0, 12),
('Luis Martínez', 30, 80, 180, '2025-05-22', 0, 13),
('Sofía López', 27, 60, 165, '2025-05-22', 0, 14),
('Carlos Ruiz', 35, 85, 175, '2025-05-22', 0, 15),
('María Fernández', 29, 58, 162, '2025-05-22', 0, 16),
('Pedro Sánchez', 40, 90, 182, '2025-05-22', 1, 17),
('Laura Gómez', 24, 52, 158, '2025-05-22', 0, 18),
('Javier Díaz', 32, 78, 178, '2025-05-22', 1, 19),
('Elena Morales', 26, 57, 163, '2025-05-22', 0, 20),
('Miguel Ángel', 28, 75, 170, '2025-05-22', 0, 21),
('Carmen Torres', 33, 62, 167, '2025-05-22', 1, 22),
('David Jiménez', 31, 82, 179, '2025-05-22', 0, 23),
('Isabel Castro', 25, 54, 159, '2025-05-22', 0, 24),
('Antonio Vargas', 36, 88, 183, '2025-05-22', 1, 25),
('Clara Romero', 23, 56, 161, '2025-05-22', 0, 26),
('Rubén Ortiz', 34, 84, 181, '2025-05-22', 0, 27),
('Teresa Navarro', 27, 59, 164, '2025-05-22', 0, 28),
('Pablo Medina', 29, 77, 176, '2025-05-22', 0, 29),
('Marta Serrano', 30, 61, 166, '2025-05-22', 1, 30),
('Diego Alonso', 38, 86, 180, '2025-05-22', 0, 31),
('Lucía Bravo', 26, 53, 157, '2025-05-22', 0, 32),
('Raúl Hidalgo', 33, 79, 177, '2025-05-22', 1, 33),
('Sara Delgado', 28, 58, 162, '2025-05-22', 1, 34),
('Álvaro Campos', 31, 83, 179, '2025-05-22', 1, 35),
('Beatriz Gil', 24, 55, 160, '2025-05-22', 0, 36),
('Óscar Peña', 35, 87, 182, '2025-05-22', 0, 37),
('Nuria Rivas', 27, 60, 165, '2025-05-22', 0, 38),
('Héctor Luna', 29, 76, 175, '2025-05-22', 0, 39),
('Inés Molina', 32, 59, 163, '2025-05-22', 0, 40),
('Víctor Cano', 30, 80, 178, '2025-05-22', 0, 41),
('Lorena Santos', 25, 54, 158, '2025-05-22', 0, 42),
('Marcos Pardo', 34, 85, 180, '2025-05-22', 0, 43),
('Cristina Vega', 26, 57, 161, '2025-05-22', 0, 44),
('Iván Rubio', 31, 82, 179, '2025-05-22', 0, 45),
('Patricia León', 28, 56, 160, '2025-05-22', 0, 46),
('Adrián Cruz', 33, 84, 181, '2025-05-22', 0, 47),
('Noelia Ramos', 27, 58, 162, '2025-05-22', 0, 48),
('Sergio Blanco', 30, 79, 177, '2025-05-22', 0, 49),
('Alicia Flores', 29, 55, 159, '2025-05-22', 0, 50),
('Manuel López Álvarez', 0, 0, 0, '2025-05-23', 0, 51),
('Manuel López Álvarez', 0, 0, 0, '2025-05-23', 0, 51);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD PRIMARY KEY (`id2`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD KEY `id2` (`id2`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  MODIFY `id2` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `id2` FOREIGN KEY (`id2`) REFERENCES `cuentas` (`id2`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
