-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-11-2024 a las 02:49:00
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `aeropuerto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aerolinea`
--

CREATE TABLE `aerolinea` (
  `ID` int(11) NOT NULL,
  `NOMBREAEROLINEA` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `aerolinea`
--

INSERT INTO `aerolinea` (`ID`, `NOMBREAEROLINEA`) VALUES
(1, 'Argentinas'),
(2, 'American Airlines');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aeropuerto`
--

CREATE TABLE `aeropuerto` (
  `ID` int(11) NOT NULL,
  `NOMBREAEROPUERTO` varchar(255) DEFAULT NULL,
  `CIUDAD_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asiento`
--

CREATE TABLE `asiento` (
  `ID` int(11) NOT NULL,
  `CLASEASIENTO` varchar(255) DEFAULT NULL,
  `FILAASIENTO` int(11) DEFAULT NULL,
  `LETRAASIENTO` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avion`
--

CREATE TABLE `avion` (
  `ID` int(11) NOT NULL,
  `NUMEROAVION` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `avion`
--

INSERT INTO `avion` (`ID`, `NUMEROAVION`) VALUES
(1, 4585),
(2, 2654);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avion_asiento`
--

CREATE TABLE `avion_asiento` (
  `Avion_ID` int(11) NOT NULL,
  `asientos_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `ID` int(11) NOT NULL,
  `NOMBRECIUDAD` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta`
--

CREATE TABLE `consulta` (
  `ID` int(11) NOT NULL,
  `NUMEROCONSULTA` int(11) DEFAULT NULL,
  `VUELO_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `consulta`
--

INSERT INTO `consulta` (`ID`, `NUMEROCONSULTA`, `VUELO_ID`) VALUES
(1, 254, 1),
(2, 255, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fecha`
--

CREATE TABLE `fecha` (
  `ID` int(11) NOT NULL,
  `FECHA` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `fecha`
--

INSERT INTO `fecha` (`ID`, `FECHA`) VALUES
(1, '25/11/2024'),
(2, '15/04/2025');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `NUMPAGO` int(11) NOT NULL,
  `CANTPAGO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `DNI` int(11) NOT NULL,
  `APELLIDO` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`DNI`, `APELLIDO`, `NOMBRE`) VALUES
(2541236, 'Perez', 'Comandante'),
(12458974, 'Pilo', 'Otto'),
(354126589, 'Suarez', 'Gaston');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piloto`
--

CREATE TABLE `piloto` (
  `ID` int(11) NOT NULL,
  `NUMEROPILOTO` int(11) DEFAULT NULL,
  `PER_DNI` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `piloto`
--

INSERT INTO `piloto` (`ID`, `NUMEROPILOTO`, `PER_DNI`) VALUES
(1, 1, 12458974),
(2, 2, 2541236);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `ID` int(11) NOT NULL,
  `NUMERORESERVA` int(11) DEFAULT NULL,
  `PAGO_NUMPAGO` int(11) DEFAULT NULL,
  `VUELO_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarifa`
--

CREATE TABLE `tarifa` (
  `ID` int(11) NOT NULL,
  `CLASE` varchar(255) DEFAULT NULL,
  `IMPUESTOTARIFA` int(11) DEFAULT NULL,
  `NUMEROTARIFA` int(11) DEFAULT NULL,
  `PRECIOTARIFA` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjeta`
--

CREATE TABLE `tarjeta` (
  `NUMTARJETA` int(11) NOT NULL,
  `TIPOTARJETA` varchar(255) DEFAULT NULL,
  `PAGO_NUMPAGO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `NUMEROUSUARIO` int(11) NOT NULL,
  `CONTRASEÑA` varchar(255) DEFAULT NULL,
  `MAIL` varchar(255) DEFAULT NULL,
  `PER_DNI` int(11) DEFAULT NULL,
  `RESERVA_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`NUMEROUSUARIO`, `CONTRASEÑA`, `MAIL`, `PER_DNI`, `RESERVA_ID`) VALUES
(1, 'password', 'suarez@gmail.com', 354126589, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_consulta`
--

CREATE TABLE `usuario_consulta` (
  `Usuario_NUMEROUSUARIO` int(11) NOT NULL,
  `consultas_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_tarjeta`
--

CREATE TABLE `usuario_tarjeta` (
  `Usuario_NUMEROUSUARIO` int(11) NOT NULL,
  `tarjetas_NUMTARJETA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo`
--

CREATE TABLE `vuelo` (
  `ID` int(11) NOT NULL,
  `NUMEROVUELO` int(11) DEFAULT NULL,
  `AEROLINEA_ID` int(11) DEFAULT NULL,
  `AVION_ID` int(11) DEFAULT NULL,
  `FECHA_ID` int(11) DEFAULT NULL,
  `PILOTO_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vuelo`
--

INSERT INTO `vuelo` (`ID`, `NUMEROVUELO`, `AEROLINEA_ID`, `AVION_ID`, `FECHA_ID`, `PILOTO_ID`) VALUES
(1, 1, 1, 1, 1, 1),
(2, 2, 2, 2, 2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo_aeropuerto`
--

CREATE TABLE `vuelo_aeropuerto` (
  `Vuelo_ID` int(11) NOT NULL,
  `aeropuertos_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo_tarifa`
--

CREATE TABLE `vuelo_tarifa` (
  `Vuelo_ID` int(11) NOT NULL,
  `tarifas_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aerolinea`
--
ALTER TABLE `aerolinea`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `aeropuerto`
--
ALTER TABLE `aeropuerto`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_AEROPUERTO_CIUDAD_ID` (`CIUDAD_ID`);

--
-- Indices de la tabla `asiento`
--
ALTER TABLE `asiento`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `avion`
--
ALTER TABLE `avion`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `avion_asiento`
--
ALTER TABLE `avion_asiento`
  ADD PRIMARY KEY (`Avion_ID`,`asientos_ID`),
  ADD KEY `FK_AVION_ASIENTO_asientos_ID` (`asientos_ID`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_CONSULTA_VUELO_ID` (`VUELO_ID`);

--
-- Indices de la tabla `fecha`
--
ALTER TABLE `fecha`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`NUMPAGO`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `piloto`
--
ALTER TABLE `piloto`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_PILOTO_PER_DNI` (`PER_DNI`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_RESERVA_VUELO_ID` (`VUELO_ID`),
  ADD KEY `FK_RESERVA_PAGO_NUMPAGO` (`PAGO_NUMPAGO`);

--
-- Indices de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  ADD PRIMARY KEY (`NUMTARJETA`),
  ADD KEY `FK_TARJETA_PAGO_NUMPAGO` (`PAGO_NUMPAGO`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`NUMEROUSUARIO`),
  ADD KEY `FK_USUARIO_PER_DNI` (`PER_DNI`),
  ADD KEY `FK_USUARIO_RESERVA_ID` (`RESERVA_ID`);

--
-- Indices de la tabla `usuario_consulta`
--
ALTER TABLE `usuario_consulta`
  ADD PRIMARY KEY (`Usuario_NUMEROUSUARIO`,`consultas_ID`),
  ADD KEY `FK_USUARIO_CONSULTA_consultas_ID` (`consultas_ID`);

--
-- Indices de la tabla `usuario_tarjeta`
--
ALTER TABLE `usuario_tarjeta`
  ADD PRIMARY KEY (`Usuario_NUMEROUSUARIO`,`tarjetas_NUMTARJETA`),
  ADD KEY `FK_USUARIO_TARJETA_tarjetas_NUMTARJETA` (`tarjetas_NUMTARJETA`);

--
-- Indices de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_VUELO_AEROLINEA_ID` (`AEROLINEA_ID`),
  ADD KEY `FK_VUELO_AVION_ID` (`AVION_ID`),
  ADD KEY `FK_VUELO_FECHA_ID` (`FECHA_ID`),
  ADD KEY `FK_VUELO_PILOTO_ID` (`PILOTO_ID`);

--
-- Indices de la tabla `vuelo_aeropuerto`
--
ALTER TABLE `vuelo_aeropuerto`
  ADD PRIMARY KEY (`Vuelo_ID`,`aeropuertos_ID`),
  ADD KEY `FK_VUELO_AEROPUERTO_aeropuertos_ID` (`aeropuertos_ID`);

--
-- Indices de la tabla `vuelo_tarifa`
--
ALTER TABLE `vuelo_tarifa`
  ADD PRIMARY KEY (`Vuelo_ID`,`tarifas_ID`),
  ADD KEY `FK_VUELO_TARIFA_tarifas_ID` (`tarifas_ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `aerolinea`
--
ALTER TABLE `aerolinea`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `aeropuerto`
--
ALTER TABLE `aeropuerto`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `asiento`
--
ALTER TABLE `asiento`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `avion`
--
ALTER TABLE `avion`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `consulta`
--
ALTER TABLE `consulta`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `fecha`
--
ALTER TABLE `fecha`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `NUMPAGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `piloto`
--
ALTER TABLE `piloto`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `NUMEROUSUARIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `aeropuerto`
--
ALTER TABLE `aeropuerto`
  ADD CONSTRAINT `FK_AEROPUERTO_CIUDAD_ID` FOREIGN KEY (`CIUDAD_ID`) REFERENCES `ciudad` (`ID`);

--
-- Filtros para la tabla `avion_asiento`
--
ALTER TABLE `avion_asiento`
  ADD CONSTRAINT `FK_AVION_ASIENTO_Avion_ID` FOREIGN KEY (`Avion_ID`) REFERENCES `avion` (`ID`),
  ADD CONSTRAINT `FK_AVION_ASIENTO_asientos_ID` FOREIGN KEY (`asientos_ID`) REFERENCES `asiento` (`ID`);

--
-- Filtros para la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `FK_CONSULTA_VUELO_ID` FOREIGN KEY (`VUELO_ID`) REFERENCES `vuelo` (`ID`);

--
-- Filtros para la tabla `piloto`
--
ALTER TABLE `piloto`
  ADD CONSTRAINT `FK_PILOTO_PER_DNI` FOREIGN KEY (`PER_DNI`) REFERENCES `persona` (`DNI`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `FK_RESERVA_PAGO_NUMPAGO` FOREIGN KEY (`PAGO_NUMPAGO`) REFERENCES `pago` (`NUMPAGO`),
  ADD CONSTRAINT `FK_RESERVA_VUELO_ID` FOREIGN KEY (`VUELO_ID`) REFERENCES `vuelo` (`ID`);

--
-- Filtros para la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  ADD CONSTRAINT `FK_TARJETA_PAGO_NUMPAGO` FOREIGN KEY (`PAGO_NUMPAGO`) REFERENCES `pago` (`NUMPAGO`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `FK_USUARIO_PER_DNI` FOREIGN KEY (`PER_DNI`) REFERENCES `persona` (`DNI`),
  ADD CONSTRAINT `FK_USUARIO_RESERVA_ID` FOREIGN KEY (`RESERVA_ID`) REFERENCES `reserva` (`ID`);

--
-- Filtros para la tabla `usuario_consulta`
--
ALTER TABLE `usuario_consulta`
  ADD CONSTRAINT `FK_USUARIO_CONSULTA_Usuario_NUMEROUSUARIO` FOREIGN KEY (`Usuario_NUMEROUSUARIO`) REFERENCES `usuario` (`NUMEROUSUARIO`),
  ADD CONSTRAINT `FK_USUARIO_CONSULTA_consultas_ID` FOREIGN KEY (`consultas_ID`) REFERENCES `consulta` (`ID`);

--
-- Filtros para la tabla `usuario_tarjeta`
--
ALTER TABLE `usuario_tarjeta`
  ADD CONSTRAINT `FK_USUARIO_TARJETA_Usuario_NUMEROUSUARIO` FOREIGN KEY (`Usuario_NUMEROUSUARIO`) REFERENCES `usuario` (`NUMEROUSUARIO`),
  ADD CONSTRAINT `FK_USUARIO_TARJETA_tarjetas_NUMTARJETA` FOREIGN KEY (`tarjetas_NUMTARJETA`) REFERENCES `tarjeta` (`NUMTARJETA`);

--
-- Filtros para la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD CONSTRAINT `FK_VUELO_AEROLINEA_ID` FOREIGN KEY (`AEROLINEA_ID`) REFERENCES `aerolinea` (`ID`),
  ADD CONSTRAINT `FK_VUELO_AVION_ID` FOREIGN KEY (`AVION_ID`) REFERENCES `avion` (`ID`),
  ADD CONSTRAINT `FK_VUELO_FECHA_ID` FOREIGN KEY (`FECHA_ID`) REFERENCES `fecha` (`ID`),
  ADD CONSTRAINT `FK_VUELO_PILOTO_ID` FOREIGN KEY (`PILOTO_ID`) REFERENCES `piloto` (`ID`);

--
-- Filtros para la tabla `vuelo_aeropuerto`
--
ALTER TABLE `vuelo_aeropuerto`
  ADD CONSTRAINT `FK_VUELO_AEROPUERTO_Vuelo_ID` FOREIGN KEY (`Vuelo_ID`) REFERENCES `vuelo` (`ID`),
  ADD CONSTRAINT `FK_VUELO_AEROPUERTO_aeropuertos_ID` FOREIGN KEY (`aeropuertos_ID`) REFERENCES `aeropuerto` (`ID`);

--
-- Filtros para la tabla `vuelo_tarifa`
--
ALTER TABLE `vuelo_tarifa`
  ADD CONSTRAINT `FK_VUELO_TARIFA_Vuelo_ID` FOREIGN KEY (`Vuelo_ID`) REFERENCES `vuelo` (`ID`),
  ADD CONSTRAINT `FK_VUELO_TARIFA_tarifas_ID` FOREIGN KEY (`tarifas_ID`) REFERENCES `tarifa` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
