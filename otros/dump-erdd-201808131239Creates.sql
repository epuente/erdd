-- MySQL dump 10.13  Distrib 5.7.23, for Linux (x86_64)
--
-- Host: localhost    Database: erdd
-- ------------------------------------------------------
-- Server version	5.7.23-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alcance_curricular`
--

DROP TABLE IF EXISTS `alcance_curricular`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alcance_curricular` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alcance_curricular`
--

LOCK TABLES `alcance_curricular` WRITE;
/*!40000 ALTER TABLE `alcance_curricular` DISABLE KEYS */;
INSERT INTO `alcance_curricular` VALUES (1,'Concepto','2018-05-08 16:26:25','2018-05-08 16:26:25'),(2,'Tema','2018-05-08 16:26:25','2018-05-08 16:26:25'),(3,'Unidad','2018-05-08 16:26:25','2018-05-08 16:26:25'),(4,'Módulo','2018-05-08 16:26:25','2018-05-08 16:26:25'),(5,'Asignatura','2018-05-08 16:26:25','2018-05-08 16:26:25'),(99,'Otro','2018-05-08 16:26:25','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `alcance_curricular` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `alcance_curricular_BEFORE_INSERT`BEFORE INSERT ON `alcance_curricular` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `alcance_curricular_BEFORE_UPDATE` BEFORE UPDATE ON `alcance_curricular` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `areaconocimiento`
--

DROP TABLE IF EXISTS `areaconocimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `areaconocimiento` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areaconocimiento`
--

LOCK TABLES `areaconocimiento` WRITE;
/*!40000 ALTER TABLE `areaconocimiento` DISABLE KEYS */;
INSERT INTO `areaconocimiento` VALUES (1,'Ciencias sociales y administrativas','2015-09-21 13:03:04','2018-06-22 09:01:40'),(2,'Ciencias físico-matemáticas','2015-09-21 13:03:04','2018-06-22 09:02:15'),(3,'Ciencias médico-biológicas','2015-09-21 13:03:04','2018-06-22 09:02:07'),(4,'Interdisciplinarias','2018-04-03 11:45:03','2018-06-22 09:02:32');
/*!40000 ALTER TABLE `areaconocimiento` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `areaconocimiento_BEFORE_INSERT`BEFORE INSERT ON `areaconocimiento` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `areaconocimiento_BEFORE_UPDATE` BEFORE UPDATE ON `areaconocimiento` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `aspecto`
--

DROP TABLE IF EXISTS `aspecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aspecto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aspecto`
--

LOCK TABLES `aspecto` WRITE;
/*!40000 ALTER TABLE `aspecto` DISABLE KEYS */;
INSERT INTO `aspecto` VALUES (1,'Pedagógico','2015-09-21 13:03:07','2018-05-08 16:26:25'),(2,'Editorial','2015-09-21 13:03:07','2018-05-08 16:26:25'),(3,'Técnico','2015-09-21 13:03:07','2018-05-08 16:26:25'),(4,'Diseño gráfico','2015-09-21 13:03:07','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `aspecto` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `aspecto_BEFORE_INSERT`BEFORE INSERT ON `aspecto` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `aspecto_BEFORE_UPDATE` BEFORE UPDATE ON `aspecto` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `autorfuncion`
--

DROP TABLE IF EXISTS `autorfuncion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `autorfuncion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autorfuncion`
--

LOCK TABLES `autorfuncion` WRITE;
/*!40000 ALTER TABLE `autorfuncion` DISABLE KEYS */;
INSERT INTO `autorfuncion` VALUES (1,'Autor de contenidos que fungirá como responsable','2015-09-21 13:03:03','2018-05-08 16:26:25'),(2,'Autor de contenidos','2015-09-21 13:03:03','2018-05-08 16:26:25'),(3,'Diseñador didáctico','2015-09-21 13:03:03','2018-05-08 16:26:25'),(4,'Diseñador instruccional','2015-09-21 13:03:04','2018-05-08 16:26:25'),(5,'Integrador de medios y tecnologías','2015-09-21 13:03:04','2018-05-08 16:26:25'),(6,'Corrector de estilo','2015-09-21 13:03:04','2018-05-08 16:26:25'),(7,'Diseñador gráfico','2015-09-21 13:03:04','2018-05-08 16:26:25'),(8,'Programador','2015-09-21 13:03:04','2018-05-08 16:26:25'),(9,'Otro','2015-09-21 13:03:04','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `autorfuncion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `autorfuncion_BEFORE_INSERT`BEFORE INSERT ON `autorfuncion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `autorfuncion_BEFORE_UPDATE` BEFORE UPDATE ON `autorfuncion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `calendario`
--

DROP TABLE IF EXISTS `calendario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calendario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `desde` datetime DEFAULT NULL,
  `hasta` datetime DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calendario`
--

LOCK TABLES `calendario` WRITE;
/*!40000 ALTER TABLE `calendario` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendario` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `calendario_BEFORE_INSERT`BEFORE INSERT ON `calendario` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `calendario_BEFORE_UPDATE` BEFORE UPDATE ON `calendario` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `clasificacion`
--

DROP TABLE IF EXISTS `clasificacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `criterio1_id` bigint(20) DEFAULT NULL,
  `criterio2_id` bigint(20) DEFAULT NULL,
  `criterio3_id` bigint(20) DEFAULT NULL,
  `tiporecurso_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_clasificacion_recurso_1` (`recurso_id`),
  KEY `ix_clasificacion_criterio1_2` (`criterio1_id`),
  KEY `ix_clasificacion_criterio2_3` (`criterio2_id`),
  KEY `ix_clasificacion_criterio3_4` (`criterio3_id`),
  KEY `ix_clasificacion_tiporecurso_5` (`tiporecurso_id`),
  CONSTRAINT `fk_clasificacion_criterio1_2` FOREIGN KEY (`criterio1_id`) REFERENCES `clasificador_criterio1` (`id`),
  CONSTRAINT `fk_clasificacion_criterio2_3` FOREIGN KEY (`criterio2_id`) REFERENCES `clasificador_criterio2` (`id`),
  CONSTRAINT `fk_clasificacion_criterio3_4` FOREIGN KEY (`criterio3_id`) REFERENCES `clasificador_criterio3` (`id`),
  CONSTRAINT `fk_clasificacion_recurso_1` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`),
  CONSTRAINT `fk_clasificacion_tiporecurso_5` FOREIGN KEY (`tiporecurso_id`) REFERENCES `clasificador_tiporecurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificacion`
--

LOCK TABLES `clasificacion` WRITE;
/*!40000 ALTER TABLE `clasificacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `clasificacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificacion_BEFORE_INSERT`BEFORE INSERT ON `clasificacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificacion_BEFORE_UPDATE` BEFORE UPDATE ON `clasificacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `clasificacion_observacion`
--

DROP TABLE IF EXISTS `clasificacion_observacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificacion_observacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `clasificacion_id` bigint(20) DEFAULT NULL,
  `observacion` varchar(255) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_clasificacion_observacion_clasificacion_93` (`clasificacion_id`),
  CONSTRAINT `fk_clasificacion_observacion_clasificacion_93` FOREIGN KEY (`clasificacion_id`) REFERENCES `clasificacion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificacion_observacion`
--

LOCK TABLES `clasificacion_observacion` WRITE;
/*!40000 ALTER TABLE `clasificacion_observacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `clasificacion_observacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificacion_observacion_BEFORE_INSERT`BEFORE INSERT ON `clasificacion_observacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificacion_observacion_BEFORE_UPDATE` BEFORE UPDATE ON `clasificacion_observacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `clasificador_cancelable`
--

DROP TABLE IF EXISTS `clasificador_cancelable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificador_cancelable` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `criterio1_id` bigint(20) DEFAULT NULL,
  `criterio2_id` bigint(20) DEFAULT NULL,
  `criterio3_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_clasificador_cancelable_criterio1_6` (`criterio1_id`),
  KEY `ix_clasificador_cancelable_criterio2_7` (`criterio2_id`),
  KEY `ix_clasificador_cancelable_criterio3_8` (`criterio3_id`),
  CONSTRAINT `fk_clasificador_cancelable_criterio1_6` FOREIGN KEY (`criterio1_id`) REFERENCES `clasificador_criterio1` (`id`),
  CONSTRAINT `fk_clasificador_cancelable_criterio2_7` FOREIGN KEY (`criterio2_id`) REFERENCES `clasificador_criterio2` (`id`),
  CONSTRAINT `fk_clasificador_cancelable_criterio3_8` FOREIGN KEY (`criterio3_id`) REFERENCES `clasificador_criterio3` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificador_cancelable`
--

LOCK TABLES `clasificador_cancelable` WRITE;
/*!40000 ALTER TABLE `clasificador_cancelable` DISABLE KEYS */;
INSERT INTO `clasificador_cancelable` VALUES (1,1,2,16,'2015-09-21 13:03:08','2018-08-01 13:03:27'),(2,1,2,17,'2015-09-21 13:03:08','2018-08-01 13:03:27'),(3,1,3,18,'2015-09-21 13:03:08','2018-08-01 13:03:27');
/*!40000 ALTER TABLE `clasificador_cancelable` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_cancelable_BEFORE_INSERT`BEFORE INSERT ON `clasificador_cancelable` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_cancelable_BEFORE_UPDATE` BEFORE UPDATE ON `clasificador_cancelable` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `clasificador_catalogo_criterio3`
--

DROP TABLE IF EXISTS `clasificador_catalogo_criterio3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificador_catalogo_criterio3` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `informacion` varchar(600) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificador_catalogo_criterio3`
--

LOCK TABLES `clasificador_catalogo_criterio3` WRITE;
/*!40000 ALTER TABLE `clasificador_catalogo_criterio3` DISABLE KEYS */;
INSERT INTO `clasificador_catalogo_criterio3` VALUES (1,'Curso completo','Una especialidad o disciplina científica completa.','2015-09-21 13:03:08','2018-05-08 16:26:25'),(2,'Unidad o módulo','Dos o más temas secuenciados o relacionados.','2015-09-21 13:03:08','2018-05-08 16:26:25'),(3,'Tema','Un tema específico en extenso.','2015-09-21 13:03:08','2018-05-08 16:26:25'),(4,'Concepto','Solo un argumento o un registro de referencia.','2015-09-21 13:03:08','2018-05-08 16:26:25'),(5,'Complejo e integrado','Se constituye a través de módulos que interactúan y funcionan para el logro de objetivos funcionales y operativos en común.','2015-09-21 13:03:08','2015-12-14 11:18:36'),(6,'Modular o subsistema','Es un componente autocontrolado con una interfaz bien definida, producto de la unión de varias partes que interactúan entre sí y que trabajan para alcanzar un objetivo.','2015-09-21 13:03:08','2015-12-14 11:18:36');
/*!40000 ALTER TABLE `clasificador_catalogo_criterio3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clasificador_criterio1`
--

DROP TABLE IF EXISTS `clasificador_criterio1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificador_criterio1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificador_criterio1`
--

LOCK TABLES `clasificador_criterio1` WRITE;
/*!40000 ALTER TABLE `clasificador_criterio1` DISABLE KEYS */;
INSERT INTO `clasificador_criterio1` VALUES (1,'Recurso Didáctico Digital','2015-09-21 13:03:07','2018-05-08 16:26:25'),(2,'Software educativo','2015-09-21 13:03:07','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `clasificador_criterio1` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_criterio1_BEFORE_INSERT`BEFORE INSERT ON `clasificador_criterio1` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_criterio1_BEFORE_UPDATE` BEFORE UPDATE ON `clasificador_criterio1` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `clasificador_criterio2`
--

DROP TABLE IF EXISTS `clasificador_criterio2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificador_criterio2` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `criterio1_id` bigint(20) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `informacion` varchar(600) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_clasificador_criterio2_criterio1_9` (`criterio1_id`),
  CONSTRAINT `fk_clasificador_criterio2_criterio1_9` FOREIGN KEY (`criterio1_id`) REFERENCES `clasificador_criterio1` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificador_criterio2`
--

LOCK TABLES `clasificador_criterio2` WRITE;
/*!40000 ALTER TABLE `clasificador_criterio2` DISABLE KEYS */;
INSERT INTO `clasificador_criterio2` VALUES (1,1,'Informativo','Integran documentos de autoría propia que contienen datos de utilidad y que explican o aclaran desde una teoría hasta datos específicos y concretos, pasando por conceptos clave. Su marco de referencia es temático.','2015-09-21 13:03:08','2018-05-08 16:26:25'),(2,1,'Apoyo educativo','Incluyen contenidos que favorecen la incorporación de conocimientos, cuentan con actividades para el estudiante y están encaminados a un grado y especialidad específicos.','2015-09-21 13:03:08','2018-05-08 16:26:25'),(3,1,'Tratamiento educativo','Incluyen contenidos que median el acceso a la información para procurar un aprendizaje formativo significativo con un lenguaje apropiado según el usuario al que va dirigido; cuentan con un diseño instruccional o didáctico implícito.','2015-09-21 13:03:08','2018-05-08 16:26:25'),(4,2,'Tutorial interactivo o practicador','Aplicación de cómputo que enseña y/o ayuda al alumno a descubrir ciertos principios o conceptos preestablecidos. Además de entregar información, exige la intervención del estudiante, propiciando la comprensión, análisis, síntesis y evaluación realizados a través de la interacción con el software.','2015-09-21 13:03:08','2015-12-14 11:15:57'),(5,2,'Simulador','Aplicación de cómputo que emula una situación de la realidad, permitiendo al alumno estudiar un proceso o fenómeno que estará en permanente cambio y que obligará al estudiante a actuar, de acuerdo a las diversas condiciones que se vayan presentando, en forma progresiva y de manera interactiva.','2015-09-21 13:03:08','2015-12-14 11:15:57'),(6,2,'Sistema','Desarrollo informático integral de carácter educativo basado en una estructura modular (a veces establecida con técnicas de inteligencia artificial), que permite a los usuarios llevar a cabo varias tareas específicas automatizadas o asistidas.','2015-09-21 13:03:08','2015-12-14 11:15:57');
/*!40000 ALTER TABLE `clasificador_criterio2` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_criterio2_BEFORE_INSERT`BEFORE INSERT ON `clasificador_criterio2` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_criterio2_BEFORE_UPDATE` BEFORE UPDATE ON `clasificador_criterio2` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `clasificador_criterio3`
--

DROP TABLE IF EXISTS `clasificador_criterio3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificador_criterio3` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `criterio1_id` bigint(20) DEFAULT NULL,
  `criterio2_id` bigint(20) DEFAULT NULL,
  `catalogo_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_clasificador_criterio3_criterio1_10` (`criterio1_id`),
  KEY `ix_clasificador_criterio3_criterio2_11` (`criterio2_id`),
  KEY `ix_clasificador_criterio3_catalogo_12` (`catalogo_id`),
  CONSTRAINT `fk_clasificador_criterio3_catalogo_12` FOREIGN KEY (`catalogo_id`) REFERENCES `clasificador_catalogo_criterio3` (`id`),
  CONSTRAINT `fk_clasificador_criterio3_criterio1_10` FOREIGN KEY (`criterio1_id`) REFERENCES `clasificador_criterio1` (`id`),
  CONSTRAINT `fk_clasificador_criterio3_criterio2_11` FOREIGN KEY (`criterio2_id`) REFERENCES `clasificador_criterio2` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificador_criterio3`
--

LOCK TABLES `clasificador_criterio3` WRITE;
/*!40000 ALTER TABLE `clasificador_criterio3` DISABLE KEYS */;
INSERT INTO `clasificador_criterio3` VALUES (1,1,1,1,'2015-09-21 13:03:08','2018-04-11 17:23:23'),(2,1,1,2,'2015-09-21 13:03:08','2018-04-11 17:23:23'),(3,1,2,1,'2015-09-21 13:03:08','2018-04-11 17:23:23'),(4,1,2,2,'2015-09-21 13:03:08','2018-04-11 17:23:23'),(5,1,2,3,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(6,1,3,1,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(7,1,3,2,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(8,1,3,3,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(9,1,3,4,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(10,2,4,5,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(11,2,4,6,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(12,2,5,5,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(13,2,5,6,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(14,2,6,5,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(15,2,6,6,'2015-09-21 13:03:08','2015-12-14 11:18:36'),(16,1,1,3,'2015-09-21 13:03:08','2015-09-21 13:03:08'),(17,1,1,4,'2015-09-21 13:03:08','2015-09-21 13:03:08'),(18,1,2,4,'2015-09-21 13:03:08','2015-12-14 11:18:36');
/*!40000 ALTER TABLE `clasificador_criterio3` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_criterio3_BEFORE_INSERT`BEFORE INSERT ON `clasificador_criterio3` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_criterio3_BEFORE_UPDATE` BEFORE UPDATE ON `clasificador_criterio3` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `clasificador_criterio3ejemplo`
--

DROP TABLE IF EXISTS `clasificador_criterio3ejemplo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificador_criterio3ejemplo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `criterio3_id` bigint(20) DEFAULT NULL,
  `tiporecurso_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_clasificador_criterio3ejemplo_criterio3_13` (`criterio3_id`),
  KEY `ix_clasificador_criterio3ejemplo_tiporecurso_14` (`tiporecurso_id`),
  CONSTRAINT `fk_clasificador_criterio3ejemplo_criterio3_13` FOREIGN KEY (`criterio3_id`) REFERENCES `clasificador_criterio3` (`id`),
  CONSTRAINT `fk_clasificador_criterio3ejemplo_tiporecurso_14` FOREIGN KEY (`tiporecurso_id`) REFERENCES `clasificador_tiporecurso` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificador_criterio3ejemplo`
--

LOCK TABLES `clasificador_criterio3ejemplo` WRITE;
/*!40000 ALTER TABLE `clasificador_criterio3ejemplo` DISABLE KEYS */;
INSERT INTO `clasificador_criterio3ejemplo` VALUES (1,1,1,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(2,1,2,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(3,1,3,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(4,1,4,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(5,1,5,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(6,1,6,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(7,1,8,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(8,1,9,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(9,2,5,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(10,2,6,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(11,2,9,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(12,2,8,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(13,3,13,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(14,3,14,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(15,3,15,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(16,3,16,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(17,3,5,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(18,3,8,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(19,3,17,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(20,3,18,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(21,4,8,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(22,4,17,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(23,4,18,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(24,4,5,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(25,5,8,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(26,5,17,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(27,5,18,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(28,5,5,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(29,6,13,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(30,6,19,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(31,6,20,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(32,7,20,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(33,8,20,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(34,9,20,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(35,10,21,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(37,11,22,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(38,12,23,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(39,13,24,'2018-04-12 12:01:43','2018-04-11 12:00:00'),(40,13,25,'2018-04-12 12:01:43','2018-04-11 12:00:00'),(41,14,26,'2018-04-12 12:01:43','2018-04-11 12:00:00'),(42,14,27,'2018-04-12 12:01:43','2018-04-11 12:00:00'),(43,14,28,'2018-04-12 12:01:43','2018-04-11 12:00:00'),(44,15,29,'2018-04-12 12:01:43','2018-04-11 12:00:00'),(45,15,30,'2018-04-12 12:01:43','2018-04-11 12:00:00'),(46,16,5,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(47,16,6,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(48,16,9,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(49,16,8,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(50,18,8,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(51,18,17,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(52,18,18,'2018-04-11 12:00:00','2018-04-11 12:00:00'),(53,18,5,'2018-04-11 12:00:00','2018-04-11 12:00:00');
/*!40000 ALTER TABLE `clasificador_criterio3ejemplo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clasificador_ejemplo`
--

DROP TABLE IF EXISTS `clasificador_ejemplo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificador_ejemplo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `criterio1_id` bigint(20) DEFAULT NULL,
  `criterio2_id` bigint(20) DEFAULT NULL,
  `criterio3_id` bigint(20) DEFAULT NULL,
  `tiporecurso_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_clasificador_ejemplo_criterio1_15` (`criterio1_id`),
  KEY `ix_clasificador_ejemplo_criterio2_16` (`criterio2_id`),
  KEY `ix_clasificador_ejemplo_criterio3_17` (`criterio3_id`),
  KEY `ix_clasificador_ejemplo_tiporecurso_18` (`tiporecurso_id`),
  CONSTRAINT `fk_clasificador_ejemplo_criterio1_15` FOREIGN KEY (`criterio1_id`) REFERENCES `clasificador_criterio1` (`id`),
  CONSTRAINT `fk_clasificador_ejemplo_criterio2_16` FOREIGN KEY (`criterio2_id`) REFERENCES `clasificador_criterio2` (`id`),
  CONSTRAINT `fk_clasificador_ejemplo_criterio3_17` FOREIGN KEY (`criterio3_id`) REFERENCES `clasificador_criterio3` (`id`),
  CONSTRAINT `fk_clasificador_ejemplo_tiporecurso_18` FOREIGN KEY (`tiporecurso_id`) REFERENCES `clasificador_tiporecurso` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificador_ejemplo`
--

LOCK TABLES `clasificador_ejemplo` WRITE;
/*!40000 ALTER TABLE `clasificador_ejemplo` DISABLE KEYS */;
INSERT INTO `clasificador_ejemplo` VALUES (1,1,1,1,1,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(2,1,1,1,2,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(3,1,1,1,3,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(4,1,1,1,4,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(5,1,1,1,5,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(6,1,1,1,6,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(7,1,1,1,9,'2015-07-10 11:20:49','2015-10-15 10:51:05'),(8,1,1,1,8,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(9,1,1,2,5,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(10,1,1,2,6,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(11,1,1,2,9,'2015-07-10 11:20:49','2015-10-15 10:51:05'),(12,1,1,2,8,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(13,1,1,3,5,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(14,1,1,3,6,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(15,1,1,3,9,'2015-07-10 11:20:49','2015-10-15 10:51:05'),(16,1,1,3,8,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(17,1,1,4,5,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(18,1,1,4,6,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(19,1,1,4,9,'2015-07-10 11:20:49','2015-10-15 10:51:05'),(20,1,1,4,8,'2015-07-10 11:20:49','2015-10-15 10:51:04'),(21,1,1,4,10,'2015-07-10 11:20:49','2015-10-15 10:54:48'),(22,1,1,4,11,'2015-07-10 11:20:49','2015-10-15 10:54:48'),(23,1,1,4,12,'2015-07-10 11:20:49','2015-10-15 10:54:48'),(24,1,2,1,13,'2015-07-15 10:47:20','2015-10-15 10:54:48'),(25,1,2,1,14,'2015-07-15 10:47:20','2015-10-15 10:54:48'),(26,1,2,1,15,'2015-07-15 10:47:20','2015-10-15 10:54:49'),(27,1,2,1,16,'2015-07-15 10:47:20','2015-10-15 10:57:01'),(28,1,2,1,5,'2015-07-15 10:47:20','2015-10-15 10:51:04'),(29,1,2,1,8,'2015-07-15 10:47:20','2015-10-15 10:51:04'),(30,1,2,1,17,'2015-07-15 10:47:20','2015-10-15 10:54:49'),(31,1,2,1,18,'2015-07-15 10:47:20','2015-10-15 10:54:49'),(32,1,2,2,8,'2015-07-15 10:57:57','2015-10-15 10:51:04'),(33,1,2,2,17,'2015-07-15 10:57:57','2015-10-15 10:54:49'),(34,1,2,2,18,'2015-07-15 10:57:57','2015-10-15 10:54:49'),(35,1,2,3,5,'2015-07-15 10:57:57','2015-10-15 10:51:04'),(36,1,2,3,8,'2015-07-15 10:57:57','2015-10-15 10:51:04'),(37,1,2,3,17,'2015-07-15 10:57:57','2015-10-15 10:54:49'),(38,1,2,3,18,'2015-07-15 10:57:57','2015-10-15 10:54:49'),(39,1,2,4,5,'2015-07-15 10:57:57','2015-10-15 10:51:04'),(40,1,2,4,8,'2015-07-15 10:57:57','2015-10-15 10:51:04'),(41,1,2,4,17,'2015-07-15 10:57:57','2015-10-15 10:54:49'),(42,1,2,4,18,'2015-07-15 10:57:57','2015-10-15 10:54:49'),(43,1,3,1,13,'2015-07-15 10:57:57','2015-10-15 10:54:48'),(44,1,3,1,19,'2015-07-15 10:57:57','2015-10-15 10:57:01'),(45,1,3,1,20,'2015-07-15 10:57:57','2015-10-15 10:54:48'),(46,1,3,2,20,'2015-07-15 10:57:57','2015-10-15 10:54:48'),(47,1,3,3,20,'2015-07-15 10:57:57','2015-10-15 10:54:48'),(48,1,3,4,20,'2015-07-15 10:57:57','2015-10-15 10:54:48'),(49,2,4,5,21,'2015-12-14 11:30:10','2018-05-08 16:26:26'),(50,2,4,6,22,'2015-12-14 11:30:10','2018-05-08 16:26:26'),(51,2,5,5,23,'2015-12-14 11:30:10','2015-12-14 11:31:30'),(52,2,5,6,24,'2015-12-14 11:30:10','2018-05-08 16:26:26'),(53,2,5,6,25,'2015-12-14 11:31:30','2018-05-08 16:26:26'),(54,2,6,5,26,'2015-12-14 11:34:53','2018-05-08 16:26:26'),(55,2,6,5,27,'2015-12-14 11:34:53','2018-05-08 16:26:26'),(56,2,6,5,28,'2015-12-14 11:34:53','2018-05-08 16:26:26'),(59,2,6,6,29,'2015-12-14 11:35:56','2018-05-08 16:26:26'),(60,2,6,6,30,'2015-12-14 11:35:56','2018-05-08 16:26:26');
/*!40000 ALTER TABLE `clasificador_ejemplo` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_ejemplo_BEFORE_INSERT`BEFORE INSERT ON `clasificador_ejemplo` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_ejemplo_BEFORE_UPDATE` BEFORE UPDATE ON `clasificador_ejemplo` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `clasificador_noevaluable`
--

DROP TABLE IF EXISTS `clasificador_noevaluable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificador_noevaluable` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `criterio1_id` bigint(20) DEFAULT NULL,
  `criterio2_id` bigint(20) DEFAULT NULL,
  `criterio3_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_clasificador_noevaluable_criterio1_19` (`criterio1_id`),
  KEY `ix_clasificador_noevaluable_criterio2_20` (`criterio2_id`),
  KEY `ix_clasificador_noevaluable_criterio3_21` (`criterio3_id`),
  CONSTRAINT `fk_clasificador_noevaluable_criterio1_19` FOREIGN KEY (`criterio1_id`) REFERENCES `clasificador_criterio1` (`id`),
  CONSTRAINT `fk_clasificador_noevaluable_criterio2_20` FOREIGN KEY (`criterio2_id`) REFERENCES `clasificador_criterio2` (`id`),
  CONSTRAINT `fk_clasificador_noevaluable_criterio3_21` FOREIGN KEY (`criterio3_id`) REFERENCES `clasificador_criterio3` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificador_noevaluable`
--

LOCK TABLES `clasificador_noevaluable` WRITE;
/*!40000 ALTER TABLE `clasificador_noevaluable` DISABLE KEYS */;
INSERT INTO `clasificador_noevaluable` VALUES (1,1,1,4,'2015-09-21 13:03:08','2018-05-08 16:26:26'),(2,1,1,3,'2015-09-21 13:03:08','2018-05-08 16:26:26'),(3,1,2,4,'2015-09-21 13:03:08','2018-05-08 16:26:26');
/*!40000 ALTER TABLE `clasificador_noevaluable` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_noevaluable_BEFORE_INSERT`BEFORE INSERT ON `clasificador_noevaluable` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_noevaluable_BEFORE_UPDATE` BEFORE UPDATE ON `clasificador_noevaluable` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `clasificador_tiporecurso`
--

DROP TABLE IF EXISTS `clasificador_tiporecurso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clasificador_tiporecurso` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clasificador_tiporecurso`
--

LOCK TABLES `clasificador_tiporecurso` WRITE;
/*!40000 ALTER TABLE `clasificador_tiporecurso` DISABLE KEYS */;
INSERT INTO `clasificador_tiporecurso` VALUES (1,'Libro digital','2018-05-08 16:26:26','2018-05-08 16:26:26'),(2,'Apunte','2018-05-08 16:26:26','2018-05-08 16:26:26'),(3,'Cuaderno','2018-05-08 16:26:26','2018-05-08 16:26:26'),(4,'Instructivo de taller','2018-05-08 16:26:26','2018-05-08 16:26:26'),(5,'Multimedia','2018-05-08 16:26:26','2018-05-08 16:26:26'),(6,'Audiovisual','2018-05-08 16:26:26','2018-05-08 16:26:26'),(8,'Blog','2018-05-08 16:26:26','2018-05-08 16:26:26'),(9,'Podcast','2018-05-08 16:26:26','2018-05-08 16:26:26'),(10,'Fotografia','2018-05-08 16:26:26','2018-05-08 16:26:26'),(11,'Diagrama','2018-05-08 16:26:26','2018-05-08 16:26:26'),(12,'Ilustracion','2018-05-08 16:26:26','2018-05-08 16:26:26'),(13,'Polilibro','2018-05-08 16:26:26','2018-05-08 16:26:26'),(14,'Libro digital interactivo','2018-05-08 16:26:26','2018-05-08 16:26:26'),(15,'Problemario','2018-05-08 16:26:26','2018-05-08 16:26:26'),(16,'Práctica de laboratorio','2018-05-08 16:26:26','2018-05-08 16:26:26'),(17,'Webquest','2018-05-08 16:26:26','2018-05-08 16:26:26'),(18,'Wikis','2018-05-08 16:26:26','2018-05-08 16:26:26'),(19,'Curso en línea','2018-05-08 16:26:26','2018-05-08 16:26:26'),(20,'Objeto de aprendizaje','2018-05-08 16:26:26','2018-05-08 16:26:26'),(21,'Tutorial completo para el manejo de una plataforma','2015-12-14 11:21:17','2018-05-08 16:26:26'),(22,'Tutorial para la creación de una cuenta de correo electrónico','2015-12-14 11:21:17','2018-05-08 16:26:26'),(23,'Videojuego en varios niveles','2015-12-14 11:21:51','2018-05-08 16:26:26'),(24,'Videojuego','2015-12-14 11:23:00','2018-05-08 16:26:26'),(25,'Recorrido virtual en un museo','2015-12-14 11:23:00','2018-05-08 16:26:26'),(26,'Plataforma educativa','2015-12-14 11:33:21','2018-05-08 16:26:26'),(27,'Sistema de administración de objetos de aprendizaje','2015-12-14 11:33:21','2018-05-08 16:26:26'),(28,'Agente educativo','2015-12-14 11:33:21','2018-05-08 16:26:26'),(29,'Programa de autoría','2015-12-14 11:33:21','2018-05-08 16:26:26'),(30,'Agente educativo','2015-12-14 11:33:21','2018-05-08 16:26:26');
/*!40000 ALTER TABLE `clasificador_tiporecurso` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_tiporecurso_BEFORE_INSERT`BEFORE INSERT ON `clasificador_tiporecurso` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `clasificador_tiporecurso_BEFORE_UPDATE` BEFORE UPDATE ON `clasificador_tiporecurso` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `correo_autor`
--

DROP TABLE IF EXISTS `correo_autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `correo_autor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `autor_id` bigint(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` varchar(5) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_correo_autor_autor_22` (`autor_id`),
  CONSTRAINT `fk_correo_autor_autor_22` FOREIGN KEY (`autor_id`) REFERENCES `recurso_autor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correo_autor`
--

LOCK TABLES `correo_autor` WRITE;
/*!40000 ALTER TABLE `correo_autor` DISABLE KEYS */;
/*!40000 ALTER TABLE `correo_autor` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `correo_autor_BEFORE_INSERT`BEFORE INSERT ON `correo_autor` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `correo_autor_BEFORE_UPDATE` BEFORE UPDATE ON `correo_autor` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `correo_salida`
--

DROP TABLE IF EXISTS `correo_salida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `correo_salida` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `estado_id` bigint(20) DEFAULT NULL,
  `asunto` varchar(255) DEFAULT NULL,
  `mensaje` varchar(900) DEFAULT NULL,
  `host` varchar(255) DEFAULT NULL,
  `de` varchar(255) DEFAULT NULL,
  `enviado` tinyint(1) DEFAULT '0',
  `mensajeoperacion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_correo_salida_recurso_23` (`recurso_id`),
  KEY `ix_correo_salida_estado_24` (`estado_id`),
  CONSTRAINT `fk_correo_salida_estado_24` FOREIGN KEY (`estado_id`) REFERENCES `estado` (`id`),
  CONSTRAINT `fk_correo_salida_recurso_23` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correo_salida`
--

LOCK TABLES `correo_salida` WRITE;
/*!40000 ALTER TABLE `correo_salida` DISABLE KEYS */;
/*!40000 ALTER TABLE `correo_salida` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `correo_salida_BEFORE_INSERT`BEFORE INSERT ON `correo_salida` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `correo_salida_BEFORE_UPDATE` BEFORE UPDATE ON `correo_salida` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `correo_salida_para`
--

DROP TABLE IF EXISTS `correo_salida_para`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `correo_salida_para` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `correosalida_id` bigint(20) DEFAULT NULL,
  `para` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_correo_salida_para_correosalida_25` (`correosalida_id`),
  CONSTRAINT `fk_correo_salida_para_correosalida_25` FOREIGN KEY (`correosalida_id`) REFERENCES `correo_salida` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correo_salida_para`
--

LOCK TABLES `correo_salida_para` WRITE;
/*!40000 ALTER TABLE `correo_salida_para` DISABLE KEYS */;
/*!40000 ALTER TABLE `correo_salida_para` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `correo_salida_para_BEFORE_INSERT`BEFORE INSERT ON `correo_salida_para` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `correo_salida_para_BEFORE_UPDATE` BEFORE UPDATE ON `correo_salida_para` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `ctacorreo`
--

DROP TABLE IF EXISTS `ctacorreo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ctacorreo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `hostname` varchar(255) NOT NULL,
  `puerto` varchar(255) NOT NULL,
  `cuenta` varchar(255) DEFAULT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctacorreo`
--

LOCK TABLES `ctacorreo` WRITE;
/*!40000 ALTER TABLE `ctacorreo` DISABLE KEYS */;
INSERT INTO `ctacorreo` VALUES (1,'correo.ipn.mx','587','evaluardd@ipn.mx','','2016-04-05 13:21:22','2018-08-13 12:06:07');
/*!40000 ALTER TABLE `ctacorreo` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `ctacorreo_BEFORE_INSERT`BEFORE INSERT ON `ctacorreo` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `ctacorreo_BEFORE_UPDATE` BEFORE UPDATE ON `ctacorreo` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `dirigidoa`
--

DROP TABLE IF EXISTS `dirigidoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dirigidoa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dirigidoa`
--

LOCK TABLES `dirigidoa` WRITE;
/*!40000 ALTER TABLE `dirigidoa` DISABLE KEYS */;
INSERT INTO `dirigidoa` VALUES (1,'Docentes','2018-05-08 16:26:25','2018-05-08 16:26:25'),(2,'Alumnos','2018-05-08 16:26:25','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `dirigidoa` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `dirigidoa_BEFORE_INSERT`BEFORE INSERT ON `dirigidoa` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `dirigidoa_BEFORE_UPDATE` BEFORE UPDATE ON `dirigidoa` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `documento`
--

DROP TABLE IF EXISTS `documento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documento` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `tipodocumento_id` bigint(20) DEFAULT NULL,
  `nombrearchivo` varchar(255) DEFAULT NULL,
  `contenttype` varchar(255) DEFAULT NULL,
  `contenido` longblob,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_documento_recurso_26` (`recurso_id`),
  KEY `ix_documento_tipodocumento_27` (`tipodocumento_id`),
  CONSTRAINT `fk_documento_recurso_26` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`),
  CONSTRAINT `fk_documento_tipodocumento_27` FOREIGN KEY (`tipodocumento_id`) REFERENCES `tipodocumento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documento`
--

LOCK TABLES `documento` WRITE;
/*!40000 ALTER TABLE `documento` DISABLE KEYS */;
/*!40000 ALTER TABLE `documento` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `documento_BEFORE_INSERT`BEFORE INSERT ON `documento` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `documento_BEFORE_UPDATE` BEFORE UPDATE ON `documento` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `encuesta_observacion`
--

DROP TABLE IF EXISTS `encuesta_observacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `encuesta_observacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `encuesta_id` bigint(20) DEFAULT NULL,
  `respuesta` varchar(255) NOT NULL,
  `descripcion` varchar(600) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_encuesta_observacion_encuesta_28` (`encuesta_id`),
  CONSTRAINT `fk_encuesta_observacion_encuesta_28` FOREIGN KEY (`encuesta_id`) REFERENCES `encuesta_respuesta` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encuesta_observacion`
--

LOCK TABLES `encuesta_observacion` WRITE;
/*!40000 ALTER TABLE `encuesta_observacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `encuesta_observacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `encuesta_observacion_BEFORE_INSERT`BEFORE INSERT ON `encuesta_observacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `encuesta_observacion_BEFORE_UPDATE` BEFORE UPDATE ON `encuesta_observacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `encuesta_reactivo`
--

DROP TABLE IF EXISTS `encuesta_reactivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `encuesta_reactivo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `numreactivo` bigint(20) DEFAULT NULL,
  `reactivo` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encuesta_reactivo`
--

LOCK TABLES `encuesta_reactivo` WRITE;
/*!40000 ALTER TABLE `encuesta_reactivo` DISABLE KEYS */;
INSERT INTO `encuesta_reactivo` VALUES (1,1,'¿Qué le motivó a elaborar un Recurso Didáctico Digital? ','2015-10-09 16:36:37','2015-11-04 14:24:37'),(2,2,'Antes de elaborar su recurso, ¿conocía los criterios y requisitos que debe cubrir un Recurso Didáctico Digital? ','2015-10-09 16:36:37','2015-11-04 14:24:20'),(3,3,'En el reporte de evaluación que emitió la UPEV, con relación a su recurso ¿le resultaron claros y pertinentes los comentarios y sugerencias de mejora? ','2015-10-09 16:36:37','2015-11-04 14:24:20'),(4,4,'En una escala del 1 al 5, cómo calificaría su nivel de satisfacción con el servicio recibido, considerando 5 como el más alto y 1 el más bajo. ','2015-10-09 16:36:37','2015-11-04 14:24:20'),(5,5,'Para nosotros es muy importante su opinión. En el siguiente espacio le invitamos que nos dé sus comentarios sobre el servicio recibido, esto con la intención de ayudarnos a mejorar el proceso.','2015-10-09 16:36:37','2015-11-04 14:24:20');
/*!40000 ALTER TABLE `encuesta_reactivo` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `encuesta_reactivo_BEFORE_INSERT`BEFORE INSERT ON `encuesta_reactivo` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `encuesta_reactivo_BEFORE_UPDATE` BEFORE UPDATE ON `encuesta_reactivo` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `encuesta_respuesta`
--

DROP TABLE IF EXISTS `encuesta_respuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `encuesta_respuesta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `respuesta1` varchar(255) DEFAULT NULL,
  `respuesta1txt` varchar(600) DEFAULT NULL,
  `respuesta2` varchar(255) DEFAULT NULL,
  `respuesta2txt` varchar(600) DEFAULT NULL,
  `respuesta3` varchar(255) DEFAULT NULL,
  `respuesta3txt` varchar(600) DEFAULT NULL,
  `respuesta4` varchar(255) DEFAULT NULL,
  `respuesta4txt` varchar(600) DEFAULT NULL,
  `respuesta5txt` varchar(600) DEFAULT NULL,
  `estado_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_encuesta_respuesta_recurso_29` (`recurso_id`),
  KEY `ix_encuesta_respuesta_estado_30` (`estado_id`),
  CONSTRAINT `fk_encuesta_respuesta_estado_30` FOREIGN KEY (`estado_id`) REFERENCES `estado_encuesta` (`id`),
  CONSTRAINT `fk_encuesta_respuesta_recurso_29` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encuesta_respuesta`
--

LOCK TABLES `encuesta_respuesta` WRITE;
/*!40000 ALTER TABLE `encuesta_respuesta` DISABLE KEYS */;
/*!40000 ALTER TABLE `encuesta_respuesta` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `encuesta_respuesta_BEFORE_INSERT`BEFORE INSERT ON `encuesta_respuesta` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `encuesta_respuesta_BEFORE_UPDATE` BEFORE UPDATE ON `encuesta_respuesta` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=403 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,'Cédula recibida vía web','2015-09-21 13:03:06','2018-05-08 16:26:25'),(2,'Tiene observaciones','2015-09-21 13:03:06','2018-05-08 16:26:25'),(3,'Solicitud aceptada','2015-09-21 13:03:06','2018-05-08 16:26:25'),(4,'Oficio recibido','2015-09-21 13:03:07','2018-05-08 16:26:25'),(5,'Clasificado','2015-09-21 13:03:07','2018-05-08 16:26:25'),(6,'Evaluadores asignados','2015-09-21 13:03:07','2018-05-08 16:26:25'),(7,'Evaluación en proceso','2015-09-21 13:03:07','2018-05-08 16:26:25'),(8,'Evaluación para revisar por el administrador','2015-09-21 13:03:07','2018-05-08 16:26:25'),(9,'Evaluación con observaciones','2015-09-21 13:03:07','2018-05-08 16:26:25'),(10,'Evaluación concluida','2015-09-21 13:03:07','2018-05-08 16:26:25'),(11,'Encuesta recibida','2015-09-21 13:03:07','2018-05-08 16:26:25'),(12,'Recurso cerrado','2015-09-21 13:03:07','2018-05-08 16:26:25'),(100,'Asignación parcial de evaluadores','2015-09-21 13:03:07','2018-05-08 16:26:25'),(105,'Observaciones corregidas','2018-05-08 16:26:25','2018-05-08 16:26:25'),(110,'Con oficio de valoracion','2018-05-08 16:26:25','2018-05-08 16:26:25'),(400,'Solicitud de cancelación','2015-09-21 13:03:07','2015-09-22 10:34:15'),(401,'Solicitud cancelada en clasificación','2015-09-21 13:03:07','2018-05-08 16:26:25'),(402,'Solicitud cancelada en evaluación','2015-09-21 13:03:07','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `estado_BEFORE_INSERT`BEFORE INSERT ON `estado` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `estado_BEFORE_UPDATE` BEFORE UPDATE ON `estado` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `estado_activo`
--

DROP TABLE IF EXISTS `estado_activo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado_activo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_activo`
--

LOCK TABLES `estado_activo` WRITE;
/*!40000 ALTER TABLE `estado_activo` DISABLE KEYS */;
INSERT INTO `estado_activo` VALUES (1,'Inactivo','2018-05-08 16:26:22','2018-05-08 16:26:22'),(2,'Activo','2018-05-08 16:26:22','2018-05-08 16:26:22');
/*!40000 ALTER TABLE `estado_activo` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `estado_activo_BEFORE_INSERT`BEFORE INSERT ON `estado_activo` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `estado_activo_BEFORE_UPDATE` BEFORE UPDATE ON `estado_activo` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `estado_encuesta`
--

DROP TABLE IF EXISTS `estado_encuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado_encuesta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_encuesta`
--

LOCK TABLES `estado_encuesta` WRITE;
/*!40000 ALTER TABLE `estado_encuesta` DISABLE KEYS */;
INSERT INTO `estado_encuesta` VALUES (1,'Para revisión','2018-05-08 16:26:26','2018-05-08 16:26:26'),(2,'Con observaciones','2018-05-08 16:26:26','2018-05-08 16:26:26'),(3,'Terminada','2018-05-08 16:26:26','2018-05-08 16:26:26');
/*!40000 ALTER TABLE `estado_encuesta` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `estado_encuesta_BEFORE_INSERT`BEFORE INSERT ON `estado_encuesta` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `estado_encuesta_BEFORE_UPDATE` BEFORE UPDATE ON `estado_encuesta` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `estado_evaluacion`
--

DROP TABLE IF EXISTS `estado_evaluacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado_evaluacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=401 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_evaluacion`
--

LOCK TABLES `estado_evaluacion` WRITE;
/*!40000 ALTER TABLE `estado_evaluacion` DISABLE KEYS */;
INSERT INTO `estado_evaluacion` VALUES (1,'Sin atender','2015-09-21 13:03:07','2018-05-08 16:26:26'),(2,'En proceso','2015-09-21 13:03:07','2018-05-08 16:26:26'),(3,'Para revisar por el administrador','2015-09-21 13:03:07','2018-05-08 16:26:26'),(4,'Con observaciones','2015-09-21 13:03:07','2018-05-08 16:26:26'),(5,'Concluida','2015-09-21 13:03:07','2018-05-08 16:26:26'),(400,'Solicitud de cancelación','2015-09-22 10:29:37','2018-05-08 16:26:26');
/*!40000 ALTER TABLE `estado_evaluacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `estado_evaluacion_BEFORE_INSERT`BEFORE INSERT ON `estado_evaluacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `estado_evaluacion_BEFORE_UPDATE` BEFORE UPDATE ON `estado_evaluacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluacion`
--

DROP TABLE IF EXISTS `evaluacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recursoevaluador_id` bigint(20) DEFAULT NULL,
  `evaluaciontabla_id` bigint(20) NOT NULL,
  `respuesta` int(11) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluacion_recursoevaluador_31` (`recursoevaluador_id`),
  KEY `ix_evaluacion_evaluaciontabla_32` (`evaluaciontabla_id`),
  CONSTRAINT `fk_evaluacion_evaluaciontabla_32` FOREIGN KEY (`evaluaciontabla_id`) REFERENCES `evaluacion_tabla` (`id`),
  CONSTRAINT `fk_evaluacion_recursoevaluador_31` FOREIGN KEY (`recursoevaluador_id`) REFERENCES `recursoevaluador` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion`
--

LOCK TABLES `evaluacion` WRITE;
/*!40000 ALTER TABLE `evaluacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_BEFORE_INSERT`BEFORE INSERT ON `evaluacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_BEFORE_UPDATE` BEFORE UPDATE ON `evaluacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluacion_fecha`
--

DROP TABLE IF EXISTS `evaluacion_fecha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_fecha` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `fechainicio` datetime DEFAULT NULL,
  `ndias` int(11) DEFAULT NULL,
  `fechalimite` datetime DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluacion_fecha_recurso_33` (`recurso_id`),
  CONSTRAINT `fk_evaluacion_fecha_recurso_33` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_fecha`
--

LOCK TABLES `evaluacion_fecha` WRITE;
/*!40000 ALTER TABLE `evaluacion_fecha` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion_fecha` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_fecha_BEFORE_INSERT`BEFORE INSERT ON `evaluacion_fecha` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_fecha_BEFORE_UPDATE` BEFORE UPDATE ON `evaluacion_fecha` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluacion_observacion`
--

DROP TABLE IF EXISTS `evaluacion_observacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_observacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `respuesta_id` bigint(20) DEFAULT NULL,
  `observacion` varchar(600) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluacion_observacion_respuesta_34` (`respuesta_id`),
  CONSTRAINT `fk_evaluacion_observacion_respuesta_34` FOREIGN KEY (`respuesta_id`) REFERENCES `evaluacion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_observacion`
--

LOCK TABLES `evaluacion_observacion` WRITE;
/*!40000 ALTER TABLE `evaluacion_observacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion_observacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_observacion_BEFORE_INSERT`BEFORE INSERT ON `evaluacion_observacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_observacion_BEFORE_UPDATE` BEFORE UPDATE ON `evaluacion_observacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluacion_observacion_gral`
--

DROP TABLE IF EXISTS `evaluacion_observacion_gral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_observacion_gral` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recursoevaluador_id` bigint(20) DEFAULT NULL,
  `observacion` varchar(900) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluacion_observacion_gral_recursoevaluador_35` (`recursoevaluador_id`),
  CONSTRAINT `fk_evaluacion_observacion_gral_recursoevaluador_35` FOREIGN KEY (`recursoevaluador_id`) REFERENCES `recursoevaluador` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_observacion_gral`
--

LOCK TABLES `evaluacion_observacion_gral` WRITE;
/*!40000 ALTER TABLE `evaluacion_observacion_gral` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion_observacion_gral` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_observacion_gral_BEFORE_INSERT`BEFORE INSERT ON `evaluacion_observacion_gral` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_observacion_gral_BEFORE_UPDATE` BEFORE UPDATE ON `evaluacion_observacion_gral` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluacion_observacion_observacion_gral`
--

DROP TABLE IF EXISTS `evaluacion_observacion_observacion_gral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_observacion_observacion_gral` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `evaluacionobservaciongral_id` bigint(20) DEFAULT NULL,
  `observacion` varchar(900) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluacion_observacion_observacion_gral_evaluacionobservac_36` (`evaluacionobservaciongral_id`),
  CONSTRAINT `fk_evaluacion_observacion_observacion_gral_evaluacionobservac_36` FOREIGN KEY (`evaluacionobservaciongral_id`) REFERENCES `evaluacion_observacion_gral` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_observacion_observacion_gral`
--

LOCK TABLES `evaluacion_observacion_observacion_gral` WRITE;
/*!40000 ALTER TABLE `evaluacion_observacion_observacion_gral` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion_observacion_observacion_gral` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_observacion_observacion_gral_BEFORE_INSERT`BEFORE INSERT ON `evaluacion_observacion_observacion_gral` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_observacion_observacion_gral_BEFORE_UPDATE` BEFORE UPDATE ON `evaluacion_observacion_observacion_gral` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluacion_prorroga`
--

DROP TABLE IF EXISTS `evaluacion_prorroga`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_prorroga` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recursoevaluador_id` bigint(20) DEFAULT NULL,
  `ndias` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `autorizado` tinyint(1) DEFAULT '0',
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluacion_prorroga_recursoevaluador_37` (`recursoevaluador_id`),
  CONSTRAINT `fk_evaluacion_prorroga_recursoevaluador_37` FOREIGN KEY (`recursoevaluador_id`) REFERENCES `recursoevaluador` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_prorroga`
--

LOCK TABLES `evaluacion_prorroga` WRITE;
/*!40000 ALTER TABLE `evaluacion_prorroga` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion_prorroga` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluacion_tabla`
--

DROP TABLE IF EXISTS `evaluacion_tabla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_tabla` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version_id` bigint(20) DEFAULT NULL,
  `reactivo_id` bigint(20) DEFAULT NULL,
  `aspecto_id` bigint(20) DEFAULT NULL,
  `criterio1_id` bigint(20) DEFAULT NULL,
  `criterio2_id` bigint(20) DEFAULT NULL,
  `criterio3_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluacion_tabla_version_38` (`version_id`),
  KEY `ix_evaluacion_tabla_reactivo_39` (`reactivo_id`),
  KEY `ix_evaluacion_tabla_aspecto_40` (`aspecto_id`),
  KEY `ix_evaluacion_tabla_criterio1_41` (`criterio1_id`),
  KEY `ix_evaluacion_tabla_criterio2_42` (`criterio2_id`),
  KEY `ix_evaluacion_tabla_criterio3_43` (`criterio3_id`),
  CONSTRAINT `fk_evaluacion_tabla_aspecto_40` FOREIGN KEY (`aspecto_id`) REFERENCES `aspecto` (`id`),
  CONSTRAINT `fk_evaluacion_tabla_criterio1_41` FOREIGN KEY (`criterio1_id`) REFERENCES `clasificador_criterio1` (`id`),
  CONSTRAINT `fk_evaluacion_tabla_criterio2_42` FOREIGN KEY (`criterio2_id`) REFERENCES `clasificador_criterio2` (`id`),
  CONSTRAINT `fk_evaluacion_tabla_criterio3_43` FOREIGN KEY (`criterio3_id`) REFERENCES `clasificador_criterio3` (`id`),
  CONSTRAINT `fk_evaluacion_tabla_reactivo_39` FOREIGN KEY (`reactivo_id`) REFERENCES `evaluacion_tabla_reactivo` (`id`),
  CONSTRAINT `fk_evaluacion_tabla_version_38` FOREIGN KEY (`version_id`) REFERENCES `evaluacion_tabla_version` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4879 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_tabla`
--

LOCK TABLES `evaluacion_tabla` WRITE;
/*!40000 ALTER TABLE `evaluacion_tabla` DISABLE KEYS */;
INSERT INTO `evaluacion_tabla` VALUES (4,1,1,1,1,2,4,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(8,1,1,1,1,3,7,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(9,1,1,1,1,3,6,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(10,1,1,1,2,4,11,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(11,1,1,1,2,4,10,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(12,1,1,1,2,5,13,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(13,1,1,1,2,5,12,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(14,1,1,1,2,6,15,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(15,1,1,1,2,6,14,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(16,1,2,1,1,1,2,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(17,1,2,1,1,1,1,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(19,1,2,1,1,2,4,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(20,1,2,1,1,2,3,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(23,1,2,1,1,3,7,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(24,1,2,1,1,3,6,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(25,1,2,1,2,4,11,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(26,1,2,1,2,4,10,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(27,1,2,1,2,5,13,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(28,1,2,1,2,5,12,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(29,1,2,1,2,6,15,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(30,1,2,1,2,6,14,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(31,1,3,1,1,1,2,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(32,1,3,1,1,1,1,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(34,1,3,1,1,2,4,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(35,1,3,1,1,2,3,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(37,1,3,1,1,3,7,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(38,1,3,1,1,3,6,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(39,1,3,1,2,4,11,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(40,1,3,1,2,4,10,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(41,1,3,1,2,5,13,'2016-04-05 13:19:53','2018-08-07 14:36:34'),(42,1,3,1,2,5,12,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(43,1,3,1,2,6,15,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(44,1,3,1,2,6,14,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(45,1,4,1,1,1,2,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(46,1,4,1,1,1,1,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(48,1,4,1,1,2,4,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(49,1,4,1,1,2,3,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(51,1,4,1,1,3,7,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(52,1,4,1,1,3,6,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(53,1,4,1,2,4,11,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(54,1,4,1,2,4,10,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(55,1,4,1,2,5,13,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(56,1,4,1,2,5,12,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(57,1,4,1,2,6,15,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(58,1,4,1,2,6,14,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(59,1,5,1,1,1,2,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(60,1,5,1,1,1,1,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(62,1,5,1,1,2,4,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(63,1,5,1,1,2,3,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(65,1,5,1,1,3,7,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(66,1,5,1,1,3,6,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(67,1,5,1,2,4,11,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(68,1,5,1,2,4,10,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(69,1,5,1,2,5,13,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(70,1,5,1,2,5,12,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(71,1,5,1,2,6,15,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(72,1,5,1,2,6,14,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(73,1,6,2,1,1,2,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(76,1,6,2,1,2,4,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(77,1,6,2,1,2,3,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(80,1,6,2,1,3,7,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(81,1,6,2,1,3,6,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(82,1,6,2,2,4,11,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(83,1,6,2,2,4,10,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(84,1,6,2,2,5,13,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(85,1,6,2,2,5,12,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(86,1,6,2,2,6,15,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(87,1,6,2,2,6,14,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(88,1,7,1,1,1,2,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(89,1,7,1,1,1,1,'2016-04-05 13:19:54','2018-08-07 14:36:34'),(91,1,7,1,1,2,4,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(92,1,7,1,1,2,3,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(95,1,7,1,1,3,7,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(96,1,7,1,1,3,6,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(97,1,7,1,2,4,11,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(98,1,7,1,2,4,10,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(99,1,7,1,2,5,13,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(100,1,7,1,2,5,12,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(101,1,7,1,2,6,15,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(102,1,7,1,2,6,14,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(103,1,8,1,1,1,2,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(104,1,8,1,1,1,1,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(106,1,8,1,1,2,4,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(107,1,8,1,1,2,3,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(109,1,8,1,1,3,7,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(110,1,8,1,1,3,6,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(111,1,8,1,2,4,11,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(112,1,8,1,2,4,10,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(113,1,8,1,2,5,13,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(114,1,8,1,2,5,12,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(115,1,8,1,2,6,15,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(116,1,8,1,2,6,14,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(117,1,9,1,1,1,2,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(118,1,9,1,1,1,1,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(120,1,9,1,1,2,4,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(121,1,9,1,1,2,3,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(124,1,9,1,1,3,7,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(125,1,9,1,1,3,6,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(126,1,9,1,2,4,11,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(127,1,9,1,2,4,10,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(128,1,9,1,2,5,13,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(129,1,9,1,2,5,12,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(130,1,9,1,2,6,15,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(131,1,9,1,2,6,14,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(132,1,10,1,1,1,2,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(133,1,10,1,1,1,1,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(135,1,10,1,1,2,4,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(136,1,10,1,1,2,3,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(138,1,10,1,1,3,7,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(139,1,10,1,1,3,6,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(140,1,10,1,2,4,11,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(141,1,10,1,2,4,10,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(142,1,10,1,2,5,13,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(143,1,10,1,2,5,12,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(144,1,10,1,2,6,15,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(145,1,10,1,2,6,14,'2016-04-05 13:19:55','2018-08-07 14:36:34'),(146,1,11,1,1,1,2,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(147,1,11,1,1,1,1,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(149,1,11,1,1,2,4,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(150,1,11,1,1,2,3,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(152,1,11,1,1,3,7,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(153,1,11,1,1,3,6,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(154,1,11,1,2,4,11,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(155,1,11,1,2,4,10,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(156,1,11,1,2,5,13,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(157,1,11,1,2,5,12,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(158,1,11,1,2,6,15,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(159,1,11,1,2,6,14,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(160,1,12,1,1,1,2,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(161,1,12,1,1,1,1,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(163,1,12,1,1,2,4,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(164,1,12,1,1,2,3,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(167,1,12,1,1,3,7,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(168,1,12,1,1,3,6,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(169,1,12,1,2,4,11,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(170,1,12,1,2,4,10,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(171,1,12,1,2,5,13,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(172,1,12,1,2,5,12,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(173,1,12,1,2,6,15,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(174,1,12,1,2,6,14,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(175,1,13,1,1,1,2,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(176,1,13,1,1,1,1,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(178,1,13,1,1,2,4,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(179,1,13,1,1,2,3,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(181,1,13,1,1,3,7,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(182,1,13,1,1,3,6,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(183,1,13,1,2,4,11,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(184,1,13,1,2,4,10,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(185,1,13,1,2,5,13,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(186,1,13,1,2,5,12,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(187,1,13,1,2,6,15,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(188,1,13,1,2,6,14,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(189,1,14,1,1,1,2,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(190,1,14,1,1,1,1,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(192,1,14,1,1,2,4,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(193,1,14,1,1,2,3,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(196,1,14,1,1,3,7,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(197,1,14,1,1,3,6,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(198,1,14,1,2,4,11,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(199,1,14,1,2,4,10,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(200,1,14,1,2,5,13,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(201,1,14,1,2,5,12,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(202,1,14,1,2,6,15,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(203,1,14,1,2,6,14,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(204,1,15,1,1,1,2,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(205,1,15,1,1,1,1,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(207,1,15,1,1,2,4,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(208,1,15,1,1,2,3,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(211,1,15,1,1,3,7,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(212,1,15,1,1,3,6,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(213,1,15,1,2,4,11,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(214,1,15,1,2,4,10,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(215,1,15,1,2,5,13,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(216,1,15,1,2,5,12,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(217,1,15,1,2,6,15,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(218,1,15,1,2,6,14,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(219,1,16,1,1,1,2,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(220,1,16,1,1,1,1,'2016-04-05 13:19:56','2018-08-07 14:36:34'),(222,1,16,1,1,2,4,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(223,1,16,1,1,2,3,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(226,1,16,1,1,3,7,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(227,1,16,1,1,3,6,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(228,1,16,1,2,4,11,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(229,1,16,1,2,4,10,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(230,1,16,1,2,5,13,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(231,1,16,1,2,5,12,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(232,1,16,1,2,6,15,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(233,1,16,1,2,6,14,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(234,1,17,1,1,1,2,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(235,1,17,1,1,1,1,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(237,1,17,1,1,2,4,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(238,1,17,1,1,2,3,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(240,1,17,1,1,3,7,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(241,1,17,1,1,3,6,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(242,1,17,1,2,4,11,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(243,1,17,1,2,4,10,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(244,1,17,1,2,5,13,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(245,1,17,1,2,5,12,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(246,1,17,1,2,6,15,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(247,1,17,1,2,6,14,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(248,1,18,1,1,1,2,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(249,1,18,1,1,1,1,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(251,1,18,1,1,2,4,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(252,1,18,1,1,2,3,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(255,1,18,1,1,3,7,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(256,1,18,1,1,3,6,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(257,1,18,1,2,4,11,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(258,1,18,1,2,4,10,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(259,1,18,1,2,5,13,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(260,1,18,1,2,5,12,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(261,1,18,1,2,6,15,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(262,1,18,1,2,6,14,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(263,1,19,1,1,1,2,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(264,1,19,1,1,1,1,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(266,1,19,1,1,2,4,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(267,1,19,1,1,2,3,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(269,1,19,1,1,3,7,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(270,1,19,1,1,3,6,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(271,1,19,1,2,4,11,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(272,1,19,1,2,4,10,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(273,1,19,1,2,5,13,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(274,1,19,1,2,5,12,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(275,1,19,1,2,6,15,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(276,1,19,1,2,6,14,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(277,1,20,1,1,1,2,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(278,1,20,1,1,1,1,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(280,1,20,1,1,2,4,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(281,1,20,1,1,2,3,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(284,1,20,1,1,3,7,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(285,1,20,1,1,3,6,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(286,1,20,1,2,4,11,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(287,1,20,1,2,4,10,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(288,1,20,1,2,5,13,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(289,1,20,1,2,5,12,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(290,1,20,1,2,6,15,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(291,1,20,1,2,6,14,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(292,1,21,1,1,1,2,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(293,1,21,1,1,1,1,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(295,1,21,1,1,2,4,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(296,1,21,1,1,2,3,'2016-04-05 13:19:57','2018-08-07 14:36:34'),(299,1,21,1,1,3,7,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(300,1,21,1,1,3,6,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(301,1,21,1,2,4,11,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(302,1,21,1,2,4,10,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(303,1,21,1,2,5,13,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(304,1,21,1,2,5,12,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(305,1,21,1,2,6,15,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(306,1,21,1,2,6,14,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(307,1,22,1,1,1,2,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(308,1,22,1,1,1,1,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(310,1,22,1,1,2,4,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(311,1,22,1,1,2,3,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(314,1,22,1,1,3,7,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(315,1,22,1,1,3,6,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(316,1,22,1,2,4,11,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(317,1,22,1,2,4,10,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(318,1,22,1,2,5,13,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(319,1,22,1,2,5,12,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(320,1,22,1,2,6,15,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(321,1,22,1,2,6,14,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(322,1,23,1,1,1,2,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(323,1,23,1,1,1,1,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(325,1,23,1,1,2,4,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(326,1,23,1,1,2,3,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(329,1,23,1,1,3,7,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(330,1,23,1,1,3,6,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(331,1,23,1,2,4,11,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(332,1,23,1,2,4,10,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(333,1,23,1,2,5,13,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(334,1,23,1,2,5,12,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(335,1,23,1,2,6,15,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(336,1,23,1,2,6,14,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(337,1,24,1,1,1,2,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(338,1,24,1,1,1,1,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(340,1,24,1,1,2,4,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(341,1,24,1,1,2,3,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(344,1,24,1,1,3,7,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(345,1,24,1,1,3,6,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(346,1,24,1,2,4,11,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(347,1,24,1,2,4,10,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(348,1,24,1,2,5,13,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(349,1,24,1,2,5,12,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(350,1,24,1,2,6,15,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(351,1,24,1,2,6,14,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(352,1,25,1,1,1,2,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(353,1,25,1,1,1,1,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(355,1,25,1,1,2,4,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(356,1,25,1,1,2,3,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(359,1,25,1,1,3,7,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(360,1,25,1,1,3,6,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(361,1,25,1,2,4,11,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(362,1,25,1,2,4,10,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(363,1,25,1,2,5,13,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(364,1,25,1,2,5,12,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(365,1,25,1,2,6,15,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(366,1,25,1,2,6,14,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(367,1,26,1,1,1,2,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(368,1,26,1,1,1,1,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(370,1,26,1,1,2,4,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(371,1,26,1,1,2,3,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(374,1,26,1,1,3,7,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(375,1,26,1,1,3,6,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(376,1,26,1,2,4,11,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(377,1,26,1,2,4,10,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(378,1,26,1,2,5,13,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(379,1,26,1,2,5,12,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(380,1,26,1,2,6,15,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(381,1,26,1,2,6,14,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(382,1,27,3,1,1,2,'2016-04-05 13:19:58','2018-08-07 14:36:34'),(385,1,27,3,1,2,4,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(386,1,27,3,1,2,3,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(389,1,27,3,1,3,7,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(390,1,27,3,1,3,6,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(391,1,27,3,2,4,11,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(392,1,27,3,2,4,10,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(393,1,27,3,2,5,13,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(394,1,27,3,2,5,12,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(395,1,27,3,2,6,15,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(396,1,27,3,2,6,14,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(397,1,28,1,1,1,2,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(398,1,28,1,1,1,1,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(400,1,28,1,1,2,4,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(401,1,28,1,1,2,3,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(404,1,28,1,1,3,7,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(405,1,28,1,1,3,6,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(406,1,28,1,2,4,11,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(407,1,28,1,2,4,10,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(408,1,28,1,2,5,13,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(409,1,28,1,2,5,12,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(410,1,28,1,2,6,15,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(411,1,28,1,2,6,14,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(412,1,29,1,1,1,2,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(413,1,29,1,1,1,1,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(415,1,29,1,1,2,4,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(416,1,29,1,1,2,3,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(419,1,29,1,1,3,7,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(420,1,29,1,1,3,6,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(421,1,29,1,2,4,11,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(422,1,29,1,2,4,10,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(423,1,29,1,2,5,13,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(424,1,29,1,2,5,12,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(425,1,29,1,2,6,15,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(426,1,29,1,2,6,14,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(427,1,30,1,1,1,2,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(428,1,30,1,1,1,1,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(430,1,30,1,1,2,4,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(431,1,30,1,1,2,3,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(434,1,30,1,1,3,7,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(435,1,30,1,1,3,6,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(436,1,30,1,2,4,11,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(437,1,30,1,2,4,10,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(438,1,30,1,2,5,13,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(439,1,30,1,2,5,12,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(440,1,30,1,2,6,15,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(441,1,30,1,2,6,14,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(442,1,31,1,1,1,2,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(443,1,31,1,1,1,1,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(445,1,31,1,1,2,4,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(446,1,31,1,1,2,3,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(449,1,31,1,1,3,7,'2016-04-05 13:19:59','2018-08-07 14:36:34'),(450,1,31,1,1,3,6,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(451,1,31,1,2,4,11,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(452,1,31,1,2,4,10,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(453,1,31,1,2,5,13,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(454,1,31,1,2,5,12,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(455,1,31,1,2,6,15,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(456,1,31,1,2,6,14,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(457,1,32,1,1,1,2,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(458,1,32,1,1,1,1,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(460,1,32,1,1,2,4,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(461,1,32,1,1,2,3,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(464,1,32,1,1,3,7,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(465,1,32,1,1,3,6,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(466,1,32,1,2,4,11,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(467,1,32,1,2,4,10,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(468,1,32,1,2,5,13,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(469,1,32,1,2,5,12,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(470,1,32,1,2,6,15,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(471,1,32,1,2,6,14,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(472,1,33,1,1,1,2,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(473,1,33,1,1,1,1,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(475,1,33,1,1,2,4,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(476,1,33,1,1,2,3,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(479,1,33,1,1,3,7,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(480,1,33,1,1,3,6,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(481,1,33,1,2,4,11,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(482,1,33,1,2,4,10,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(483,1,33,1,2,5,13,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(484,1,33,1,2,5,12,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(485,1,33,1,2,6,15,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(486,1,33,1,2,6,14,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(487,1,34,1,1,1,2,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(488,1,34,1,1,1,1,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(490,1,34,1,1,2,4,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(491,1,34,1,1,2,3,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(494,1,34,1,1,3,7,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(495,1,34,1,1,3,6,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(496,1,34,1,2,4,11,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(497,1,34,1,2,4,10,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(498,1,34,1,2,5,13,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(499,1,34,1,2,5,12,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(500,1,34,1,2,6,15,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(501,1,34,1,2,6,14,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(502,1,35,1,1,1,2,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(503,1,35,1,1,1,1,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(505,1,35,1,1,2,4,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(506,1,35,1,1,2,3,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(509,1,35,1,1,3,7,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(510,1,35,1,1,3,6,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(511,1,35,1,2,4,11,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(512,1,35,1,2,4,10,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(513,1,35,1,2,5,13,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(514,1,35,1,2,5,12,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(515,1,35,1,2,6,15,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(516,1,35,1,2,6,14,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(517,1,36,1,1,1,2,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(518,1,36,1,1,1,1,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(520,1,36,1,1,2,4,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(521,1,36,1,1,2,3,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(524,1,36,1,1,3,7,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(525,1,36,1,1,3,6,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(526,1,36,1,2,4,11,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(527,1,36,1,2,4,10,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(528,1,36,1,2,5,13,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(529,1,36,1,2,5,12,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(530,1,36,1,2,6,15,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(531,1,36,1,2,6,14,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(532,1,37,1,1,1,2,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(533,1,37,1,1,1,1,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(535,1,37,1,1,2,4,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(536,1,37,1,1,2,3,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(539,1,37,1,1,3,7,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(540,1,37,1,1,3,6,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(541,1,37,1,2,4,11,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(542,1,37,1,2,4,10,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(543,1,37,1,2,5,13,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(544,1,37,1,2,5,12,'2016-04-05 13:20:00','2018-08-07 14:36:34'),(545,1,37,1,2,6,15,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(546,1,37,1,2,6,14,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(547,1,38,1,1,1,2,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(548,1,38,1,1,1,1,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(550,1,38,1,1,2,4,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(551,1,38,1,1,2,3,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(554,1,38,1,1,3,7,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(555,1,38,1,1,3,6,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(556,1,38,1,2,4,11,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(557,1,38,1,2,4,10,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(558,1,38,1,2,5,13,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(559,1,38,1,2,5,12,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(560,1,38,1,2,6,15,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(561,1,38,1,2,6,14,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(562,1,39,1,1,1,2,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(563,1,39,1,1,1,1,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(565,1,39,1,1,2,4,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(566,1,39,1,1,2,3,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(569,1,39,1,1,3,7,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(570,1,39,1,1,3,6,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(571,1,39,1,2,4,11,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(572,1,39,1,2,4,10,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(573,1,39,1,2,5,13,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(574,1,39,1,2,5,12,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(575,1,39,1,2,6,15,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(576,1,39,1,2,6,14,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(577,1,40,1,1,1,2,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(578,1,40,1,1,1,1,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(580,1,40,1,1,2,4,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(581,1,40,1,1,2,3,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(584,1,40,1,1,3,7,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(585,1,40,1,1,3,6,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(586,1,40,1,2,4,11,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(587,1,40,1,2,4,10,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(588,1,40,1,2,5,13,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(589,1,40,1,2,5,12,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(590,1,40,1,2,6,15,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(591,1,40,1,2,6,14,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(592,1,41,1,1,1,2,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(593,1,41,1,1,1,1,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(595,1,41,1,1,2,4,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(596,1,41,1,1,2,3,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(599,1,41,1,1,3,7,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(600,1,41,1,1,3,6,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(601,1,41,1,2,4,11,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(602,1,41,1,2,4,10,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(603,1,41,1,2,5,13,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(604,1,41,1,2,5,12,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(605,1,41,1,2,6,15,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(606,1,41,1,2,6,14,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(607,1,42,1,1,1,2,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(608,1,42,1,1,1,1,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(610,1,42,1,1,2,4,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(611,1,42,1,1,2,3,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(614,1,42,1,1,3,7,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(615,1,42,1,1,3,6,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(616,1,42,1,2,4,11,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(617,1,42,1,2,4,10,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(618,1,42,1,2,5,13,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(619,1,42,1,2,5,12,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(620,1,42,1,2,6,15,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(621,1,42,1,2,6,14,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(622,1,43,1,1,1,2,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(623,1,43,1,1,1,1,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(625,1,43,1,1,2,4,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(626,1,43,1,1,2,3,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(628,1,43,1,1,3,7,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(629,1,43,1,1,3,6,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(630,1,43,1,2,4,11,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(631,1,43,1,2,4,10,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(632,1,43,1,2,5,13,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(633,1,43,1,2,5,12,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(634,1,43,1,2,6,15,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(635,1,43,1,2,6,14,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(636,1,44,1,1,1,2,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(637,1,44,1,1,1,1,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(639,1,44,1,1,2,4,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(640,1,44,1,1,2,3,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(643,1,44,1,1,3,7,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(644,1,44,1,1,3,6,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(645,1,44,1,2,4,11,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(646,1,44,1,2,4,10,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(647,1,44,1,2,5,13,'2016-04-05 13:20:01','2018-08-07 14:36:34'),(648,1,44,1,2,5,12,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(649,1,44,1,2,6,15,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(650,1,44,1,2,6,14,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(651,1,45,1,1,1,2,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(652,1,45,1,1,1,1,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(654,1,45,1,1,2,4,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(655,1,45,1,1,2,3,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(658,1,45,1,1,3,7,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(659,1,45,1,1,3,6,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(660,1,45,1,2,4,11,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(661,1,45,1,2,4,10,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(662,1,45,1,2,5,13,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(663,1,45,1,2,5,12,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(664,1,45,1,2,6,15,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(665,1,45,1,2,6,14,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(666,1,46,1,1,1,2,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(667,1,46,1,1,1,1,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(669,1,46,1,1,2,4,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(670,1,46,1,1,2,3,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(673,1,46,1,1,3,7,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(674,1,46,1,1,3,6,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(675,1,46,1,2,4,11,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(676,1,46,1,2,4,10,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(677,1,46,1,2,5,13,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(678,1,46,1,2,5,12,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(679,1,46,1,2,6,15,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(680,1,46,1,2,6,14,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(681,1,47,1,1,1,2,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(682,1,47,1,1,1,1,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(684,1,47,1,1,2,4,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(685,1,47,1,1,2,3,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(688,1,47,1,1,3,7,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(689,1,47,1,1,3,6,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(690,1,47,1,2,4,11,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(691,1,47,1,2,4,10,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(692,1,47,1,2,5,13,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(693,1,47,1,2,5,12,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(694,1,47,1,2,6,15,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(695,1,47,1,2,6,14,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(696,1,48,1,1,1,2,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(697,1,48,1,1,1,1,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(699,1,48,1,1,2,4,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(700,1,48,1,1,2,3,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(703,1,48,1,1,3,7,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(704,1,48,1,1,3,6,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(705,1,48,1,2,4,11,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(706,1,48,1,2,4,10,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(707,1,48,1,2,5,13,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(708,1,48,1,2,5,12,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(709,1,48,1,2,6,15,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(710,1,48,1,2,6,14,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(711,1,49,1,1,1,2,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(712,1,49,1,1,1,1,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(714,1,49,1,1,2,4,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(715,1,49,1,1,2,3,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(718,1,49,1,1,3,7,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(719,1,49,1,1,3,6,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(720,1,49,1,2,4,11,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(721,1,49,1,2,4,10,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(722,1,49,1,2,5,13,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(723,1,49,1,2,5,12,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(724,1,49,1,2,6,15,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(725,1,49,1,2,6,14,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(726,1,50,1,1,1,2,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(727,1,50,1,1,1,1,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(729,1,50,1,1,2,4,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(730,1,50,1,1,2,3,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(733,1,50,1,1,3,7,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(734,1,50,1,1,3,6,'2016-04-05 13:20:02','2018-08-07 14:36:34'),(735,1,50,1,2,4,11,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(736,1,50,1,2,4,10,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(737,1,50,1,2,5,13,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(738,1,50,1,2,5,12,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(739,1,50,1,2,6,15,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(740,1,50,1,2,6,14,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(741,1,51,1,1,1,2,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(742,1,51,1,1,1,1,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(744,1,51,1,1,2,4,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(745,1,51,1,1,2,3,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(748,1,51,1,1,3,7,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(749,1,51,1,1,3,6,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(750,1,51,1,2,4,11,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(751,1,51,1,2,4,10,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(752,1,51,1,2,5,13,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(753,1,51,1,2,5,12,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(754,1,51,1,2,6,15,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(755,1,51,1,2,6,14,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(756,1,52,2,1,1,2,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(759,1,52,2,1,2,4,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(760,1,52,2,1,2,3,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(763,1,52,2,1,3,7,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(764,1,52,2,1,3,6,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(765,1,52,2,2,4,11,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(766,1,52,2,2,4,10,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(767,1,52,2,2,5,13,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(768,1,52,2,2,5,12,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(769,1,52,2,2,6,15,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(770,1,52,2,2,6,14,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(771,1,53,2,1,1,2,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(774,1,53,2,1,2,4,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(775,1,53,2,1,2,3,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(778,1,53,2,1,3,7,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(779,1,53,2,1,3,6,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(780,1,53,2,2,4,11,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(781,1,53,2,2,4,10,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(782,1,53,2,2,5,13,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(783,1,53,2,2,5,12,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(784,1,53,2,2,6,15,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(785,1,53,2,2,6,14,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(786,1,54,2,1,1,2,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(789,1,54,2,1,2,4,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(790,1,54,2,1,2,3,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(793,1,54,2,1,3,7,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(794,1,54,2,1,3,6,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(795,1,54,2,2,4,11,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(796,1,54,2,2,4,10,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(797,1,54,2,2,5,13,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(798,1,54,2,2,5,12,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(799,1,54,2,2,6,15,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(800,1,54,2,2,6,14,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(801,1,55,1,1,1,2,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(802,1,55,1,1,1,1,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(804,1,55,1,1,2,4,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(805,1,55,1,1,2,3,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(808,1,55,1,1,3,7,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(809,1,55,1,1,3,6,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(810,1,55,1,2,4,11,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(811,1,55,1,2,4,10,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(812,1,55,1,2,5,13,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(813,1,55,1,2,5,12,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(814,1,55,1,2,6,15,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(815,1,55,1,2,6,14,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(816,1,56,1,1,1,2,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(817,1,56,1,1,1,1,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(819,1,56,1,1,2,4,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(820,1,56,1,1,2,3,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(823,1,56,1,1,3,7,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(824,1,56,1,1,3,6,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(825,1,56,1,2,4,11,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(826,1,56,1,2,4,10,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(827,1,56,1,2,5,13,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(828,1,56,1,2,5,12,'2016-04-05 13:20:03','2018-08-07 14:36:34'),(829,1,56,1,2,6,15,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(830,1,56,1,2,6,14,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(831,1,57,2,1,1,2,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(834,1,57,2,1,2,4,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(835,1,57,2,1,2,3,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(838,1,57,2,1,3,7,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(839,1,57,2,1,3,6,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(840,1,57,2,2,4,11,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(841,1,57,2,2,4,10,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(842,1,57,2,2,5,13,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(843,1,57,2,2,5,12,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(844,1,57,2,2,6,15,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(845,1,57,2,2,6,14,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(846,1,58,2,1,1,2,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(849,1,58,2,1,2,4,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(850,1,58,2,1,2,3,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(853,1,58,2,1,3,7,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(854,1,58,2,1,3,6,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(855,1,58,2,2,4,11,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(856,1,58,2,2,4,10,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(857,1,58,2,2,5,13,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(858,1,58,2,2,5,12,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(859,1,58,2,2,6,15,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(860,1,58,2,2,6,14,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(861,1,59,2,1,1,2,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(864,1,59,2,1,2,4,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(865,1,59,2,1,2,3,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(868,1,59,2,1,3,7,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(869,1,59,2,1,3,6,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(870,1,59,2,2,4,11,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(871,1,59,2,2,4,10,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(872,1,59,2,2,5,13,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(873,1,59,2,2,5,12,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(874,1,59,2,2,6,15,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(875,1,59,2,2,6,14,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(876,1,60,2,1,1,2,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(879,1,60,2,1,2,4,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(880,1,60,2,1,2,3,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(883,1,60,2,1,3,7,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(884,1,60,2,1,3,6,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(885,1,60,2,2,4,11,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(886,1,60,2,2,4,10,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(887,1,60,2,2,5,13,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(888,1,60,2,2,5,12,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(889,1,60,2,2,6,15,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(890,1,60,2,2,6,14,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(891,1,61,2,1,1,2,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(894,1,61,2,1,2,4,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(895,1,61,2,1,2,3,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(898,1,61,2,1,3,7,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(899,1,61,2,1,3,6,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(900,1,61,2,2,4,11,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(901,1,61,2,2,4,10,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(902,1,61,2,2,5,13,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(903,1,61,2,2,5,12,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(904,1,61,2,2,6,15,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(905,1,61,2,2,6,14,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(906,1,62,2,1,1,2,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(909,1,62,2,1,2,4,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(910,1,62,2,1,2,3,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(913,1,62,2,1,3,7,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(914,1,62,2,1,3,6,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(915,1,62,2,2,4,11,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(916,1,62,2,2,4,10,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(917,1,62,2,2,5,13,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(918,1,62,2,2,5,12,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(919,1,62,2,2,6,15,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(920,1,62,2,2,6,14,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(921,1,63,2,1,1,2,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(924,1,63,2,1,2,4,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(925,1,63,2,1,2,3,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(928,1,63,2,1,3,7,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(929,1,63,2,1,3,6,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(930,1,63,2,2,4,11,'2016-04-05 13:20:04','2018-08-07 14:36:34'),(931,1,63,2,2,4,10,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(932,1,63,2,2,5,13,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(933,1,63,2,2,5,12,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(934,1,63,2,2,6,15,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(935,1,63,2,2,6,14,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(936,1,64,2,1,1,2,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(939,1,64,2,1,2,4,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(940,1,64,2,1,2,3,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(943,1,64,2,1,3,7,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(944,1,64,2,1,3,6,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(945,1,64,2,2,4,11,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(946,1,64,2,2,4,10,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(947,1,64,2,2,5,13,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(948,1,64,2,2,5,12,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(949,1,64,2,2,6,15,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(950,1,64,2,2,6,14,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(951,1,65,1,1,1,2,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(952,1,65,1,1,1,1,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(954,1,65,1,1,2,4,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(955,1,65,1,1,2,3,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(958,1,65,1,1,3,7,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(959,1,65,1,1,3,6,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(960,1,65,1,2,4,11,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(961,1,65,1,2,4,10,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(962,1,65,1,2,5,13,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(963,1,65,1,2,5,12,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(964,1,65,1,2,6,15,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(965,1,65,1,2,6,14,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(966,1,66,1,1,1,2,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(967,1,66,1,1,1,1,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(969,1,66,1,1,2,4,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(970,1,66,1,1,2,3,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(973,1,66,1,1,3,7,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(974,1,66,1,1,3,6,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(975,1,66,1,2,4,11,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(976,1,66,1,2,4,10,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(977,1,66,1,2,5,13,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(978,1,66,1,2,5,12,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(979,1,66,1,2,6,15,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(980,1,66,1,2,6,14,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(981,1,67,1,1,1,2,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(982,1,67,1,1,1,1,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(984,1,67,1,1,2,4,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(985,1,67,1,1,2,3,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(988,1,67,1,1,3,7,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(989,1,67,1,1,3,6,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(990,1,67,1,2,4,11,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(991,1,67,1,2,4,10,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(992,1,67,1,2,5,13,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(993,1,67,1,2,5,12,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(994,1,67,1,2,6,15,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(995,1,67,1,2,6,14,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(996,1,68,1,1,1,2,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(997,1,68,1,1,1,1,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(999,1,68,1,1,2,4,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1000,1,68,1,1,2,3,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1003,1,68,1,1,3,7,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1004,1,68,1,1,3,6,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1005,1,68,1,2,4,11,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1006,1,68,1,2,4,10,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1007,1,68,1,2,5,13,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1008,1,68,1,2,5,12,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1009,1,68,1,2,6,15,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1010,1,68,1,2,6,14,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1011,1,69,1,1,1,2,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1012,1,69,1,1,1,1,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1014,1,69,1,1,2,4,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1015,1,69,1,1,2,3,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1018,1,69,1,1,3,7,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1019,1,69,1,1,3,6,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1020,1,69,1,2,4,11,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1021,1,69,1,2,4,10,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1022,1,69,1,2,5,13,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1023,1,69,1,2,5,12,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1024,1,69,1,2,6,15,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1025,1,69,1,2,6,14,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1026,1,70,1,1,1,2,'2016-04-05 13:20:05','2018-08-07 14:36:34'),(1027,1,70,1,1,1,1,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1029,1,70,1,1,2,4,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1030,1,70,1,1,2,3,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1033,1,70,1,1,3,7,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1034,1,70,1,1,3,6,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1035,1,70,1,2,4,11,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1036,1,70,1,2,4,10,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1037,1,70,1,2,5,13,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1038,1,70,1,2,5,12,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1039,1,70,1,2,6,15,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1040,1,70,1,2,6,14,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1041,1,71,1,1,1,2,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1042,1,71,1,1,1,1,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1044,1,71,1,1,2,4,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1045,1,71,1,1,2,3,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1048,1,71,1,1,3,7,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1049,1,71,1,1,3,6,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1050,1,71,1,2,4,11,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1051,1,71,1,2,4,10,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1052,1,71,1,2,5,13,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1053,1,71,1,2,5,12,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1054,1,71,1,2,6,15,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1055,1,71,1,2,6,14,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1056,1,72,3,1,1,2,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1059,1,72,3,1,2,4,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1060,1,72,3,1,2,3,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1063,1,72,3,1,3,7,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1064,1,72,3,1,3,6,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1065,1,72,3,2,4,11,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1066,1,72,3,2,4,10,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1067,1,72,3,2,5,13,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1068,1,72,3,2,5,12,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1069,1,72,3,2,6,15,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1070,1,72,3,2,6,14,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1071,1,73,3,1,1,2,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1074,1,73,3,1,2,4,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1075,1,73,3,1,2,3,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1078,1,73,3,1,3,7,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1079,1,73,3,1,3,6,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1080,1,73,3,2,4,11,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1081,1,73,3,2,4,10,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1082,1,73,3,2,5,13,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1083,1,73,3,2,5,12,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1084,1,73,3,2,6,15,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1085,1,73,3,2,6,14,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1086,1,74,3,1,1,2,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1089,1,74,3,1,2,4,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1090,1,74,3,1,2,3,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1093,1,74,3,1,3,7,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1094,1,74,3,1,3,6,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1095,1,74,3,2,4,11,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1096,1,74,3,2,4,10,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1097,1,74,3,2,5,13,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1098,1,74,3,2,5,12,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1099,1,74,3,2,6,15,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1100,1,74,3,2,6,14,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1101,1,75,3,1,1,2,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1104,1,75,3,1,2,4,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1105,1,75,3,1,2,3,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1108,1,75,3,1,3,7,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1109,1,75,3,1,3,6,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1110,1,75,3,2,4,11,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1111,1,75,3,2,4,10,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1112,1,75,3,2,5,13,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1113,1,75,3,2,5,12,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1114,1,75,3,2,6,15,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1115,1,75,3,2,6,14,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1116,1,76,3,1,1,2,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1119,1,76,3,1,2,4,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1120,1,76,3,1,2,3,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1123,1,76,3,1,3,7,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1124,1,76,3,1,3,6,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1125,1,76,3,2,4,11,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1126,1,76,3,2,4,10,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1127,1,76,3,2,5,13,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1128,1,76,3,2,5,12,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1129,1,76,3,2,6,15,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1130,1,76,3,2,6,14,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1131,1,77,1,1,1,2,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1132,1,77,1,1,1,1,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1134,1,77,1,1,2,4,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1135,1,77,1,1,2,3,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1138,1,77,1,1,3,7,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1139,1,77,1,1,3,6,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1140,1,77,1,2,4,11,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1141,1,77,1,2,4,10,'2016-04-05 13:20:06','2018-08-07 14:36:34'),(1142,1,77,1,2,5,13,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1143,1,77,1,2,5,12,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1144,1,77,1,2,6,15,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1145,1,77,1,2,6,14,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1146,1,78,1,1,1,2,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1147,1,78,1,1,1,1,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1149,1,78,1,1,2,4,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1150,1,78,1,1,2,3,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1152,1,78,1,1,3,7,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1153,1,78,1,1,3,6,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1154,1,78,1,2,4,11,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1155,1,78,1,2,4,10,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1156,1,78,1,2,5,13,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1157,1,78,1,2,5,12,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1158,1,78,1,2,6,15,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1159,1,78,1,2,6,14,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1160,1,79,1,1,1,2,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1161,1,79,1,1,1,1,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1163,1,79,1,1,2,4,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1164,1,79,1,1,2,3,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1167,1,79,1,1,3,7,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1168,1,79,1,1,3,6,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1169,1,79,1,2,4,11,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1170,1,79,1,2,4,10,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1171,1,79,1,2,5,13,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1172,1,79,1,2,5,12,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1173,1,79,1,2,6,15,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1174,1,79,1,2,6,14,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1175,1,80,1,1,1,2,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1176,1,80,1,1,1,1,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1178,1,80,1,1,2,4,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1179,1,80,1,1,2,3,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1181,1,80,1,1,3,7,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1182,1,80,1,1,3,6,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1183,1,80,1,2,4,11,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1184,1,80,1,2,4,10,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1185,1,80,1,2,5,13,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1186,1,80,1,2,5,12,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1187,1,80,1,2,6,15,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1188,1,80,1,2,6,14,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1189,1,81,1,1,1,2,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1190,1,81,1,1,1,1,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1192,1,81,1,1,2,4,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1193,1,81,1,1,2,3,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1196,1,81,1,1,3,7,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1197,1,81,1,1,3,6,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1198,1,81,1,2,4,11,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1199,1,81,1,2,4,10,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1200,1,81,1,2,5,13,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1201,1,81,1,2,5,12,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1202,1,81,1,2,6,15,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1203,1,81,1,2,6,14,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1204,1,82,1,1,1,2,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1205,1,82,1,1,1,1,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1207,1,82,1,1,2,4,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1208,1,82,1,1,2,3,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1211,1,82,1,1,3,7,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1212,1,82,1,1,3,6,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1213,1,82,1,2,4,11,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1214,1,82,1,2,4,10,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1215,1,82,1,2,5,13,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1216,1,82,1,2,5,12,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1217,1,82,1,2,6,15,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1218,1,82,1,2,6,14,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1219,1,83,1,1,1,2,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1220,1,83,1,1,1,1,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1222,1,83,1,1,2,4,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1223,1,83,1,1,2,3,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1226,1,83,1,1,3,7,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1227,1,83,1,1,3,6,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1228,1,83,1,2,4,11,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1229,1,83,1,2,4,10,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1230,1,83,1,2,5,13,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1231,1,83,1,2,5,12,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1232,1,83,1,2,6,15,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1233,1,83,1,2,6,14,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1234,1,84,1,1,1,2,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1235,1,84,1,1,1,1,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1237,1,84,1,1,2,4,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1238,1,84,1,1,2,3,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1241,1,84,1,1,3,7,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1242,1,84,1,1,3,6,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1243,1,84,1,2,4,11,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1244,1,84,1,2,4,10,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1245,1,84,1,2,5,13,'2016-04-05 13:20:07','2018-08-07 14:36:34'),(1246,1,84,1,2,5,12,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1247,1,84,1,2,6,15,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1248,1,84,1,2,6,14,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1249,1,85,1,1,1,2,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1250,1,85,1,1,1,1,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1252,1,85,1,1,2,4,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1253,1,85,1,1,2,3,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1256,1,85,1,1,3,7,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1257,1,85,1,1,3,6,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1258,1,85,1,2,4,11,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1259,1,85,1,2,4,10,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1260,1,85,1,2,5,13,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1261,1,85,1,2,5,12,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1262,1,85,1,2,6,15,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1263,1,85,1,2,6,14,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1264,1,86,1,1,1,2,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1265,1,86,1,1,1,1,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1267,1,86,1,1,2,4,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1268,1,86,1,1,2,3,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1271,1,86,1,1,3,7,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1272,1,86,1,1,3,6,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1273,1,86,1,2,4,11,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1274,1,86,1,2,4,10,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1275,1,86,1,2,5,13,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1276,1,86,1,2,5,12,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1277,1,86,1,2,6,15,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1278,1,86,1,2,6,14,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1279,1,87,1,1,1,2,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1280,1,87,1,1,1,1,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1282,1,87,1,1,2,4,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1283,1,87,1,1,2,3,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1286,1,87,1,1,3,7,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1287,1,87,1,1,3,6,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1288,1,87,1,2,4,11,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1289,1,87,1,2,4,10,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1290,1,87,1,2,5,13,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1291,1,87,1,2,5,12,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1292,1,87,1,2,6,15,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1293,1,87,1,2,6,14,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1294,1,88,1,1,1,2,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1295,1,88,1,1,1,1,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1297,1,88,1,1,2,4,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1298,1,88,1,1,2,3,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1301,1,88,1,1,3,7,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1302,1,88,1,1,3,6,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1303,1,88,1,2,4,11,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1304,1,88,1,2,4,10,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1305,1,88,1,2,5,13,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1306,1,88,1,2,5,12,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1307,1,88,1,2,6,15,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1308,1,88,1,2,6,14,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1309,1,89,1,1,1,2,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1310,1,89,1,1,1,1,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1312,1,89,1,1,2,4,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1313,1,89,1,1,2,3,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1316,1,89,1,1,3,7,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1317,1,89,1,1,3,6,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1318,1,89,1,2,4,11,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1319,1,89,1,2,4,10,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1320,1,89,1,2,5,13,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1321,1,89,1,2,5,12,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1322,1,89,1,2,6,15,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1323,1,89,1,2,6,14,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1324,1,90,1,1,1,2,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1325,1,90,1,1,1,1,'2016-04-05 13:20:08','2018-08-07 14:36:34'),(1327,1,90,1,1,2,4,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1328,1,90,1,1,2,3,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1331,1,90,1,1,3,7,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1332,1,90,1,1,3,6,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1333,1,90,1,2,4,11,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1334,1,90,1,2,4,10,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1335,1,90,1,2,5,13,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1336,1,90,1,2,5,12,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1337,1,90,1,2,6,15,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1338,1,90,1,2,6,14,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1339,1,91,1,1,1,2,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1340,1,91,1,1,1,1,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1342,1,91,1,1,2,4,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1343,1,91,1,1,2,3,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1346,1,91,1,1,3,7,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1347,1,91,1,1,3,6,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1348,1,91,1,2,4,11,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1349,1,91,1,2,4,10,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1350,1,91,1,2,5,13,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1351,1,91,1,2,5,12,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1352,1,91,1,2,6,15,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1353,1,91,1,2,6,14,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1354,1,92,1,1,1,2,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1355,1,92,1,1,1,1,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1357,1,92,1,1,2,4,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1358,1,92,1,1,2,3,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1361,1,92,1,1,3,7,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1362,1,92,1,1,3,6,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1363,1,92,1,2,4,11,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1364,1,92,1,2,4,10,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1365,1,92,1,2,5,13,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1366,1,92,1,2,5,12,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1367,1,92,1,2,6,15,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1368,1,92,1,2,6,14,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1369,1,93,1,1,1,2,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1370,1,93,1,1,1,1,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1372,1,93,1,1,2,4,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1373,1,93,1,1,2,3,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1376,1,93,1,1,3,7,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1377,1,93,1,1,3,6,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1378,1,93,1,2,4,11,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1379,1,93,1,2,4,10,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1380,1,93,1,2,5,13,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1381,1,93,1,2,5,12,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1382,1,93,1,2,6,15,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1383,1,93,1,2,6,14,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1384,1,94,1,1,1,2,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1385,1,94,1,1,1,1,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1387,1,94,1,1,2,4,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1388,1,94,1,1,2,3,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1391,1,94,1,1,3,7,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1392,1,94,1,1,3,6,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1393,1,94,1,2,4,11,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1394,1,94,1,2,4,10,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1395,1,94,1,2,5,13,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1396,1,94,1,2,5,12,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1397,1,94,1,2,6,15,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1398,1,94,1,2,6,14,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1399,1,95,1,1,1,2,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1400,1,95,1,1,1,1,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1402,1,95,1,1,2,4,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1403,1,95,1,1,2,3,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1406,1,95,1,1,3,7,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1407,1,95,1,1,3,6,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1408,1,95,1,2,4,11,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1409,1,95,1,2,4,10,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1410,1,95,1,2,5,13,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1411,1,95,1,2,5,12,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1412,1,95,1,2,6,15,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1413,1,95,1,2,6,14,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1414,1,96,1,1,1,2,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1415,1,96,1,1,1,1,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1417,1,96,1,1,2,4,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1418,1,96,1,1,2,3,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1421,1,96,1,1,3,7,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1422,1,96,1,1,3,6,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1423,1,96,1,2,4,11,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1424,1,96,1,2,4,10,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1425,1,96,1,2,5,13,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1426,1,96,1,2,5,12,'2016-04-05 13:20:09','2018-08-07 14:36:34'),(1427,1,96,1,2,6,15,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1428,1,96,1,2,6,14,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1429,1,97,1,1,1,2,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1430,1,97,1,1,1,1,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1432,1,97,1,1,2,4,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1433,1,97,1,1,2,3,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1436,1,97,1,1,3,7,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1437,1,97,1,1,3,6,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1438,1,97,1,2,4,11,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1439,1,97,1,2,4,10,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1440,1,97,1,2,5,13,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1441,1,97,1,2,5,12,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1442,1,97,1,2,6,15,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1443,1,97,1,2,6,14,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1444,1,98,1,1,1,2,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1445,1,98,1,1,1,1,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1447,1,98,1,1,2,4,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1448,1,98,1,1,2,3,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1451,1,98,1,1,3,7,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1452,1,98,1,1,3,6,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1453,1,98,1,2,4,11,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1454,1,98,1,2,4,10,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1455,1,98,1,2,5,13,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1456,1,98,1,2,5,12,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1457,1,98,1,2,6,15,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1458,1,98,1,2,6,14,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1459,1,99,1,1,1,2,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1460,1,99,1,1,1,1,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1462,1,99,1,1,2,4,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1463,1,99,1,1,2,3,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1466,1,99,1,1,3,7,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1467,1,99,1,1,3,6,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1468,1,99,1,2,4,11,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1469,1,99,1,2,4,10,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1470,1,99,1,2,5,13,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1471,1,99,1,2,5,12,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1472,1,99,1,2,6,15,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1473,1,99,1,2,6,14,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1474,1,100,1,1,1,2,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1475,1,100,1,1,1,1,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1477,1,100,1,1,2,4,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1478,1,100,1,1,2,3,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1481,1,100,1,1,3,7,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1482,1,100,1,1,3,6,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1483,1,100,1,2,4,11,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1484,1,100,1,2,4,10,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1485,1,100,1,2,5,13,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1486,1,100,1,2,5,12,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1487,1,100,1,2,6,15,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1488,1,100,1,2,6,14,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1489,1,101,1,1,1,2,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1490,1,101,1,1,1,1,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1492,1,101,1,1,2,4,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1493,1,101,1,1,2,3,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1496,1,101,1,1,3,7,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1497,1,101,1,1,3,6,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1498,1,101,1,2,4,11,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1499,1,101,1,2,4,10,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1500,1,101,1,2,5,13,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1501,1,101,1,2,5,12,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1502,1,101,1,2,6,15,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1503,1,101,1,2,6,14,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1504,1,102,1,1,1,2,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1505,1,102,1,1,1,1,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1507,1,102,1,1,2,4,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1508,1,102,1,1,2,3,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1511,1,102,1,1,3,7,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1512,1,102,1,1,3,6,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1513,1,102,1,2,4,11,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1514,1,102,1,2,4,10,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1515,1,102,1,2,5,13,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1516,1,102,1,2,5,12,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1517,1,102,1,2,6,15,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1518,1,102,1,2,6,14,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1519,1,103,1,1,1,2,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1520,1,103,1,1,1,1,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1522,1,103,1,1,2,4,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1523,1,103,1,1,2,3,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1526,1,103,1,1,3,7,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1527,1,103,1,1,3,6,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1528,1,103,1,2,4,11,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1529,1,103,1,2,4,10,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1530,1,103,1,2,5,13,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1531,1,103,1,2,5,12,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1532,1,103,1,2,6,15,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1533,1,103,1,2,6,14,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1534,1,104,1,1,1,2,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1535,1,104,1,1,1,1,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1537,1,104,1,1,2,4,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1538,1,104,1,1,2,3,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1541,1,104,1,1,3,7,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1542,1,104,1,1,3,6,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1543,1,104,1,2,4,11,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1544,1,104,1,2,4,10,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1545,1,104,1,2,5,13,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1546,1,104,1,2,5,12,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1547,1,104,1,2,6,15,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1548,1,104,1,2,6,14,'2016-04-05 13:20:10','2018-08-07 14:36:34'),(1549,1,105,1,1,1,2,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1550,1,105,1,1,1,1,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1552,1,105,1,1,2,4,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1553,1,105,1,1,2,3,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1556,1,105,1,1,3,7,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1557,1,105,1,1,3,6,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1558,1,105,1,2,4,11,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1559,1,105,1,2,4,10,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1560,1,105,1,2,5,13,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1561,1,105,1,2,5,12,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1562,1,105,1,2,6,15,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1563,1,105,1,2,6,14,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1564,1,106,1,1,1,2,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1565,1,106,1,1,1,1,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1567,1,106,1,1,2,4,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1568,1,106,1,1,2,3,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1571,1,106,1,1,3,7,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1572,1,106,1,1,3,6,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1573,1,106,1,2,4,11,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1574,1,106,1,2,4,10,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1575,1,106,1,2,5,13,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1576,1,106,1,2,5,12,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1577,1,106,1,2,6,15,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1578,1,106,1,2,6,14,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1579,1,107,1,1,1,2,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1580,1,107,1,1,1,1,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1582,1,107,1,1,2,4,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1583,1,107,1,1,2,3,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1586,1,107,1,1,3,7,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1587,1,107,1,1,3,6,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1588,1,107,1,2,4,11,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1589,1,107,1,2,4,10,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1590,1,107,1,2,5,13,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1591,1,107,1,2,5,12,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1592,1,107,1,2,6,15,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1593,1,107,1,2,6,14,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1594,1,108,1,1,1,2,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1595,1,108,1,1,1,1,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1597,1,108,1,1,2,4,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1598,1,108,1,1,2,3,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1601,1,108,1,1,3,7,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1602,1,108,1,1,3,6,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1603,1,108,1,2,4,11,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1604,1,108,1,2,4,10,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1605,1,108,1,2,5,13,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1606,1,108,1,2,5,12,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1607,1,108,1,2,6,15,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1608,1,108,1,2,6,14,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1609,1,109,1,1,1,2,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1610,1,109,1,1,1,1,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1612,1,109,1,1,2,4,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1613,1,109,1,1,2,3,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1616,1,109,1,1,3,7,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1617,1,109,1,1,3,6,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1618,1,109,1,2,4,11,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1619,1,109,1,2,4,10,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1620,1,109,1,2,5,13,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1621,1,109,1,2,5,12,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1622,1,109,1,2,6,15,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1623,1,109,1,2,6,14,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1624,1,110,1,1,1,2,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1625,1,110,1,1,1,1,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1627,1,110,1,1,2,4,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1628,1,110,1,1,2,3,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1631,1,110,1,1,3,7,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1632,1,110,1,1,3,6,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1633,1,110,1,2,4,11,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1634,1,110,1,2,4,10,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1635,1,110,1,2,5,13,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1636,1,110,1,2,5,12,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1637,1,110,1,2,6,15,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1638,1,110,1,2,6,14,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1639,1,111,1,1,1,2,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1640,1,111,1,1,1,1,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1642,1,111,1,1,2,4,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1643,1,111,1,1,2,3,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1646,1,111,1,1,3,7,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1647,1,111,1,1,3,6,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1648,1,111,1,2,4,11,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1649,1,111,1,2,4,10,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1650,1,111,1,2,5,13,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1651,1,111,1,2,5,12,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1652,1,111,1,2,6,15,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1653,1,111,1,2,6,14,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1654,1,112,1,1,1,2,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1655,1,112,1,1,1,1,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1657,1,112,1,1,2,4,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1658,1,112,1,1,2,3,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1661,1,112,1,1,3,7,'2016-04-05 13:20:11','2018-08-07 14:36:34'),(1662,1,112,1,1,3,6,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1663,1,112,1,2,4,11,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1664,1,112,1,2,4,10,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1665,1,112,1,2,5,13,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1666,1,112,1,2,5,12,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1667,1,112,1,2,6,15,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1668,1,112,1,2,6,14,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1669,1,113,1,1,1,2,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1670,1,113,1,1,1,1,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1672,1,113,1,1,2,4,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1673,1,113,1,1,2,3,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1676,1,113,1,1,3,7,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1677,1,113,1,1,3,6,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1678,1,113,1,2,4,11,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1679,1,113,1,2,4,10,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1680,1,113,1,2,5,13,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1681,1,113,1,2,5,12,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1682,1,113,1,2,6,15,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1683,1,113,1,2,6,14,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1684,1,114,1,1,1,2,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1685,1,114,1,1,1,1,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1687,1,114,1,1,2,4,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1688,1,114,1,1,2,3,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1691,1,114,1,1,3,7,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1692,1,114,1,1,3,6,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1693,1,114,1,2,4,11,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1694,1,114,1,2,4,10,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1695,1,114,1,2,5,13,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1696,1,114,1,2,5,12,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1697,1,114,1,2,6,15,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1698,1,114,1,2,6,14,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1699,1,115,1,1,1,2,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1700,1,115,1,1,1,1,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1702,1,115,1,1,2,4,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1703,1,115,1,1,2,3,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1706,1,115,1,1,3,7,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1707,1,115,1,1,3,6,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1708,1,115,1,2,4,11,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1709,1,115,1,2,4,10,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1710,1,115,1,2,5,13,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1711,1,115,1,2,5,12,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1712,1,115,1,2,6,15,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1713,1,115,1,2,6,14,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1714,1,116,1,1,1,2,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1715,1,116,1,1,1,1,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1717,1,116,1,1,2,4,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1718,1,116,1,1,2,3,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1721,1,116,1,1,3,7,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1722,1,116,1,1,3,6,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1723,1,116,1,2,4,11,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1724,1,116,1,2,4,10,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1725,1,116,1,2,5,13,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1726,1,116,1,2,5,12,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1727,1,116,1,2,6,15,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1728,1,116,1,2,6,14,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1729,1,117,1,1,1,2,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1730,1,117,1,1,1,1,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1732,1,117,1,1,2,4,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1733,1,117,1,1,2,3,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1736,1,117,1,1,3,7,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1737,1,117,1,1,3,6,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1738,1,117,1,2,4,11,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1739,1,117,1,2,4,10,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1740,1,117,1,2,5,13,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1741,1,117,1,2,5,12,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1742,1,117,1,2,6,15,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1743,1,117,1,2,6,14,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1744,1,118,1,1,1,2,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1745,1,118,1,1,1,1,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1747,1,118,1,1,2,4,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1748,1,118,1,1,2,3,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1751,1,118,1,1,3,7,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1752,1,118,1,1,3,6,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1753,1,118,1,2,4,11,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1754,1,118,1,2,4,10,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1755,1,118,1,2,5,13,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1756,1,118,1,2,5,12,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1757,1,118,1,2,6,15,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1758,1,118,1,2,6,14,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1759,1,119,1,1,1,2,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1760,1,119,1,1,1,1,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1762,1,119,1,1,2,4,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1763,1,119,1,1,2,3,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1766,1,119,1,1,3,7,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1767,1,119,1,1,3,6,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1768,1,119,1,2,4,11,'2016-04-05 13:20:12','2018-08-07 14:36:34'),(1769,1,119,1,2,4,10,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1770,1,119,1,2,5,13,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1771,1,119,1,2,5,12,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1772,1,119,1,2,6,15,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1773,1,119,1,2,6,14,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1774,1,120,1,1,1,2,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1775,1,120,1,1,1,1,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1777,1,120,1,1,2,4,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1778,1,120,1,1,2,3,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1780,1,120,1,1,3,7,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1781,1,120,1,1,3,6,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1782,1,120,1,2,4,11,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1783,1,120,1,2,4,10,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1784,1,120,1,2,5,13,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1785,1,120,1,2,5,12,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1786,1,120,1,2,6,15,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1787,1,120,1,2,6,14,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1788,1,121,1,1,1,2,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1789,1,121,1,1,1,1,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1791,1,121,1,1,2,4,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1792,1,121,1,1,2,3,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1794,1,121,1,1,3,7,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1795,1,121,1,1,3,6,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1796,1,121,1,2,4,11,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1797,1,121,1,2,4,10,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1798,1,121,1,2,5,13,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1799,1,121,1,2,5,12,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1800,1,121,1,2,6,15,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1801,1,121,1,2,6,14,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1802,1,122,1,1,1,2,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1803,1,122,1,1,1,1,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1805,1,122,1,1,2,4,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1806,1,122,1,1,2,3,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1809,1,122,1,1,3,7,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1810,1,122,1,1,3,6,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1811,1,122,1,2,4,11,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1812,1,122,1,2,4,10,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1813,1,122,1,2,5,13,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1814,1,122,1,2,5,12,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1815,1,122,1,2,6,15,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1816,1,122,1,2,6,14,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1817,1,123,1,1,1,2,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1818,1,123,1,1,1,1,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1820,1,123,1,1,2,4,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1821,1,123,1,1,2,3,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1824,1,123,1,1,3,7,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1825,1,123,1,1,3,6,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1826,1,123,1,2,4,11,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1827,1,123,1,2,4,10,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1828,1,123,1,2,5,13,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1829,1,123,1,2,5,12,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1830,1,123,1,2,6,15,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1831,1,123,1,2,6,14,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1832,1,124,1,1,1,2,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1833,1,124,1,1,1,1,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1835,1,124,1,1,2,4,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1836,1,124,1,1,2,3,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1839,1,124,1,1,3,7,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1840,1,124,1,1,3,6,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1841,1,124,1,2,4,11,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1842,1,124,1,2,4,10,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1843,1,124,1,2,5,13,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1844,1,124,1,2,5,12,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1845,1,124,1,2,6,15,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1846,1,124,1,2,6,14,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1847,1,125,1,1,1,2,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1848,1,125,1,1,1,1,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1850,1,125,1,1,2,4,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1851,1,125,1,1,2,3,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1854,1,125,1,1,3,7,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1855,1,125,1,1,3,6,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1856,1,125,1,2,4,11,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1857,1,125,1,2,4,10,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1858,1,125,1,2,5,13,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1859,1,125,1,2,5,12,'2016-04-05 13:20:13','2018-08-07 14:36:34'),(1860,1,125,1,2,6,15,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1861,1,125,1,2,6,14,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1862,1,126,1,1,1,2,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1863,1,126,1,1,1,1,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1865,1,126,1,1,2,4,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1866,1,126,1,1,2,3,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1869,1,126,1,1,3,7,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1870,1,126,1,1,3,6,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1871,1,126,1,2,4,11,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1872,1,126,1,2,4,10,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1873,1,126,1,2,5,13,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1874,1,126,1,2,5,12,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1875,1,126,1,2,6,15,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1876,1,126,1,2,6,14,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1877,1,127,1,1,1,2,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1878,1,127,1,1,1,1,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1880,1,127,1,1,2,4,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1881,1,127,1,1,2,3,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1884,1,127,1,1,3,7,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1885,1,127,1,1,3,6,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1886,1,127,1,2,4,11,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1887,1,127,1,2,4,10,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1888,1,127,1,2,5,13,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1889,1,127,1,2,5,12,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1890,1,127,1,2,6,15,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1891,1,127,1,2,6,14,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1892,1,128,1,1,1,2,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1893,1,128,1,1,1,1,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1895,1,128,1,1,2,4,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1896,1,128,1,1,2,3,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1899,1,128,1,1,3,7,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1900,1,128,1,1,3,6,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1901,1,128,1,2,4,11,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1902,1,128,1,2,4,10,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1903,1,128,1,2,5,13,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1904,1,128,1,2,5,12,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1905,1,128,1,2,6,15,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1906,1,128,1,2,6,14,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1907,1,129,1,1,1,2,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1908,1,129,1,1,1,1,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1910,1,129,1,1,2,4,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1911,1,129,1,1,2,3,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1914,1,129,1,1,3,7,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1915,1,129,1,1,3,6,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1916,1,129,1,2,4,11,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1917,1,129,1,2,4,10,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1918,1,129,1,2,5,13,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1919,1,129,1,2,5,12,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1920,1,129,1,2,6,15,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1921,1,129,1,2,6,14,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1922,1,130,1,1,1,2,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1923,1,130,1,1,1,1,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1925,1,130,1,1,2,4,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1926,1,130,1,1,2,3,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1929,1,130,1,1,3,7,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1930,1,130,1,1,3,6,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1931,1,130,1,2,4,11,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1932,1,130,1,2,4,10,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1933,1,130,1,2,5,13,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1934,1,130,1,2,5,12,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1935,1,130,1,2,6,15,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1936,1,130,1,2,6,14,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1937,1,131,1,1,1,2,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1938,1,131,1,1,1,1,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1940,1,131,1,1,2,4,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1941,1,131,1,1,2,3,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1944,1,131,1,1,3,7,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1945,1,131,1,1,3,6,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1946,1,131,1,2,4,11,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1947,1,131,1,2,4,10,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1948,1,131,1,2,5,13,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1949,1,131,1,2,5,12,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1950,1,131,1,2,6,15,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1951,1,131,1,2,6,14,'2016-04-05 13:20:14','2018-08-07 14:36:34'),(1952,1,132,1,1,1,2,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1953,1,132,1,1,1,1,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1955,1,132,1,1,2,4,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1956,1,132,1,1,2,3,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1959,1,132,1,1,3,7,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1960,1,132,1,1,3,6,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1961,1,132,1,2,4,11,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1962,1,132,1,2,4,10,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1963,1,132,1,2,5,13,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1964,1,132,1,2,5,12,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1965,1,132,1,2,6,15,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1966,1,132,1,2,6,14,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1967,1,133,1,1,1,2,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1968,1,133,1,1,1,1,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1970,1,133,1,1,2,4,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1971,1,133,1,1,2,3,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1974,1,133,1,1,3,7,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1975,1,133,1,1,3,6,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1976,1,133,1,2,4,11,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1977,1,133,1,2,4,10,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1978,1,133,1,2,5,13,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1979,1,133,1,2,5,12,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1980,1,133,1,2,6,15,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1981,1,133,1,2,6,14,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1982,1,134,1,1,1,2,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1983,1,134,1,1,1,1,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1985,1,134,1,1,2,4,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1986,1,134,1,1,2,3,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1989,1,134,1,1,3,7,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1990,1,134,1,1,3,6,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1991,1,134,1,2,4,11,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1992,1,134,1,2,4,10,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1993,1,134,1,2,5,13,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1994,1,134,1,2,5,12,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1995,1,134,1,2,6,15,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1996,1,134,1,2,6,14,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1997,1,135,1,1,1,2,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(1998,1,135,1,1,1,1,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2000,1,135,1,1,2,4,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2001,1,135,1,1,2,3,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2004,1,135,1,1,3,7,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2005,1,135,1,1,3,6,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2006,1,135,1,2,4,11,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2007,1,135,1,2,4,10,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2008,1,135,1,2,5,13,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2009,1,135,1,2,5,12,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2010,1,135,1,2,6,15,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2011,1,135,1,2,6,14,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2012,1,136,1,1,1,2,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2013,1,136,1,1,1,1,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2015,1,136,1,1,2,4,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2016,1,136,1,1,2,3,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2019,1,136,1,1,3,7,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2020,1,136,1,1,3,6,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2021,1,136,1,2,4,11,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2022,1,136,1,2,4,10,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2023,1,136,1,2,5,13,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2024,1,136,1,2,5,12,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2025,1,136,1,2,6,15,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2026,1,136,1,2,6,14,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2027,1,137,1,1,1,2,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2028,1,137,1,1,1,1,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2030,1,137,1,1,2,4,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2031,1,137,1,1,2,3,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2034,1,137,1,1,3,7,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2035,1,137,1,1,3,6,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2036,1,137,1,2,4,11,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2037,1,137,1,2,4,10,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2038,1,137,1,2,5,13,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2039,1,137,1,2,5,12,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2040,1,137,1,2,6,15,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2041,1,137,1,2,6,14,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2042,1,138,1,1,1,2,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2043,1,138,1,1,1,1,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2045,1,138,1,1,2,4,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2046,1,138,1,1,2,3,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2049,1,138,1,1,3,7,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2050,1,138,1,1,3,6,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2051,1,138,1,2,4,11,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2052,1,138,1,2,4,10,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2053,1,138,1,2,5,13,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2054,1,138,1,2,5,12,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2055,1,138,1,2,6,15,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2056,1,138,1,2,6,14,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2057,1,139,1,1,1,2,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2058,1,139,1,1,1,1,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2060,1,139,1,1,2,4,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2061,1,139,1,1,2,3,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2064,1,139,1,1,3,7,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2065,1,139,1,1,3,6,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2066,1,139,1,2,4,11,'2016-04-05 13:20:15','2018-08-07 14:36:34'),(2067,1,139,1,2,4,10,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2068,1,139,1,2,5,13,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2069,1,139,1,2,5,12,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2070,1,139,1,2,6,15,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2071,1,139,1,2,6,14,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2072,1,140,1,1,1,2,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2073,1,140,1,1,1,1,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2075,1,140,1,1,2,4,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2076,1,140,1,1,2,3,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2079,1,140,1,1,3,7,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2080,1,140,1,1,3,6,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2081,1,140,1,2,4,11,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2082,1,140,1,2,4,10,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2083,1,140,1,2,5,13,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2084,1,140,1,2,5,12,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2085,1,140,1,2,6,15,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2086,1,140,1,2,6,14,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2087,1,141,1,1,1,2,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2088,1,141,1,1,1,1,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2090,1,141,1,1,2,4,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2091,1,141,1,1,2,3,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2094,1,141,1,1,3,7,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2095,1,141,1,1,3,6,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2096,1,141,1,2,4,11,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2097,1,141,1,2,4,10,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2098,1,141,1,2,5,13,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2099,1,141,1,2,5,12,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2100,1,141,1,2,6,15,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2101,1,141,1,2,6,14,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2102,1,142,1,1,1,2,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2103,1,142,1,1,1,1,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2105,1,142,1,1,2,4,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2106,1,142,1,1,2,3,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2109,1,142,1,1,3,7,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2110,1,142,1,1,3,6,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2111,1,142,1,2,4,11,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2112,1,142,1,2,4,10,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2113,1,142,1,2,5,13,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2114,1,142,1,2,5,12,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2115,1,142,1,2,6,15,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2116,1,142,1,2,6,14,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2117,1,143,1,1,1,2,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2118,1,143,1,1,1,1,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2120,1,143,1,1,2,4,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2121,1,143,1,1,2,3,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2124,1,143,1,1,3,7,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2125,1,143,1,1,3,6,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2126,1,143,1,2,4,11,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2127,1,143,1,2,4,10,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2128,1,143,1,2,5,13,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2129,1,143,1,2,5,12,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2130,1,143,1,2,6,15,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2131,1,143,1,2,6,14,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2132,1,144,1,1,1,2,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2133,1,144,1,1,1,1,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2135,1,144,1,1,2,4,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2136,1,144,1,1,2,3,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2139,1,144,1,1,3,7,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2140,1,144,1,1,3,6,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2141,1,144,1,2,4,11,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2142,1,144,1,2,4,10,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2143,1,144,1,2,5,13,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2144,1,144,1,2,5,12,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2145,1,144,1,2,6,15,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2146,1,144,1,2,6,14,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2147,1,145,1,1,1,2,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2148,1,145,1,1,1,1,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2150,1,145,1,1,2,4,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2151,1,145,1,1,2,3,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2154,1,145,1,1,3,7,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2155,1,145,1,1,3,6,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2156,1,145,1,2,4,11,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2157,1,145,1,2,4,10,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2158,1,145,1,2,5,13,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2159,1,145,1,2,5,12,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2160,1,145,1,2,6,15,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2161,1,145,1,2,6,14,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2162,1,146,1,1,1,2,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2163,1,146,1,1,1,1,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2165,1,146,1,1,2,4,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2166,1,146,1,1,2,3,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2169,1,146,1,1,3,7,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2170,1,146,1,1,3,6,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2171,1,146,1,2,4,11,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2172,1,146,1,2,4,10,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2173,1,146,1,2,5,13,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2174,1,146,1,2,5,12,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2175,1,146,1,2,6,15,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2176,1,146,1,2,6,14,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2177,1,147,1,1,1,2,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2178,1,147,1,1,1,1,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2180,1,147,1,1,2,4,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2181,1,147,1,1,2,3,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2184,1,147,1,1,3,7,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2185,1,147,1,1,3,6,'2016-04-05 13:20:16','2018-08-07 14:36:34'),(2186,1,147,1,2,4,11,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2187,1,147,1,2,4,10,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2188,1,147,1,2,5,13,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2189,1,147,1,2,5,12,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2190,1,147,1,2,6,15,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2191,1,147,1,2,6,14,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2192,1,148,1,1,1,2,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2193,1,148,1,1,1,1,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2195,1,148,1,1,2,4,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2196,1,148,1,1,2,3,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2199,1,148,1,1,3,7,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2200,1,148,1,1,3,6,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2201,1,148,1,2,4,11,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2202,1,148,1,2,4,10,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2203,1,148,1,2,5,13,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2204,1,148,1,2,5,12,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2205,1,148,1,2,6,15,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2206,1,148,1,2,6,14,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2207,1,149,1,1,1,2,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2208,1,149,1,1,1,1,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2210,1,149,1,1,2,4,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2211,1,149,1,1,2,3,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2214,1,149,1,1,3,7,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2215,1,149,1,1,3,6,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2216,1,149,1,2,4,11,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2217,1,149,1,2,4,10,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2218,1,149,1,2,5,13,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2219,1,149,1,2,5,12,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2220,1,149,1,2,6,15,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2221,1,149,1,2,6,14,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2222,1,150,1,1,1,2,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2223,1,150,1,1,1,1,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2225,1,150,1,1,2,4,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2226,1,150,1,1,2,3,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2229,1,150,1,1,3,7,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2230,1,150,1,1,3,6,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2231,1,150,1,2,4,11,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2232,1,150,1,2,4,10,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2233,1,150,1,2,5,13,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2234,1,150,1,2,5,12,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2235,1,150,1,2,6,15,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2236,1,150,1,2,6,14,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2237,1,151,1,1,1,2,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2238,1,151,1,1,1,1,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2240,1,151,1,1,2,4,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2241,1,151,1,1,2,3,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2244,1,151,1,1,3,7,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2245,1,151,1,1,3,6,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2246,1,151,1,2,4,11,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2247,1,151,1,2,4,10,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2248,1,151,1,2,5,13,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2249,1,151,1,2,5,12,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2250,1,151,1,2,6,15,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2251,1,151,1,2,6,14,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2252,1,152,1,1,1,2,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2253,1,152,1,1,1,1,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2255,1,152,1,1,2,4,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2256,1,152,1,1,2,3,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2259,1,152,1,1,3,7,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2260,1,152,1,1,3,6,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2261,1,152,1,2,4,11,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2262,1,152,1,2,4,10,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2263,1,152,1,2,5,13,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2264,1,152,1,2,5,12,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2265,1,152,1,2,6,15,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2266,1,152,1,2,6,14,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2267,1,153,1,1,1,2,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2268,1,153,1,1,1,1,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2270,1,153,1,1,2,4,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2271,1,153,1,1,2,3,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2274,1,153,1,1,3,7,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2275,1,153,1,1,3,6,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2276,1,153,1,2,4,11,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2277,1,153,1,2,4,10,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2278,1,153,1,2,5,13,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2279,1,153,1,2,5,12,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2280,1,153,1,2,6,15,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2281,1,153,1,2,6,14,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2282,1,154,1,1,1,2,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2283,1,154,1,1,1,1,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2285,1,154,1,1,2,4,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2286,1,154,1,1,2,3,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2289,1,154,1,1,3,7,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2290,1,154,1,1,3,6,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2291,1,154,1,2,4,11,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2292,1,154,1,2,4,10,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2293,1,154,1,2,5,13,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2294,1,154,1,2,5,12,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2295,1,154,1,2,6,15,'2016-04-05 13:20:17','2018-08-07 14:36:34'),(2296,1,154,1,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2297,1,155,1,1,1,2,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2298,1,155,1,1,1,1,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2300,1,155,1,1,2,4,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2301,1,155,1,1,2,3,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2304,1,155,1,1,3,7,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2305,1,155,1,1,3,6,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2306,1,155,1,2,4,11,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2307,1,155,1,2,4,10,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2308,1,155,1,2,5,13,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2309,1,155,1,2,5,12,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2310,1,155,1,2,6,15,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2311,1,155,1,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2312,1,156,2,1,1,2,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2315,1,156,2,1,2,4,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2316,1,156,2,1,2,3,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2319,1,156,2,1,3,7,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2320,1,156,2,1,3,6,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2321,1,156,2,2,4,11,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2322,1,156,2,2,4,10,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2323,1,156,2,2,5,13,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2324,1,156,2,2,5,12,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2325,1,156,2,2,6,15,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2326,1,156,2,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2327,1,157,2,1,1,2,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2330,1,157,2,1,2,4,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2331,1,157,2,1,2,3,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2334,1,157,2,1,3,7,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2335,1,157,2,1,3,6,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2336,1,157,2,2,4,11,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2337,1,157,2,2,4,10,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2338,1,157,2,2,5,13,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2339,1,157,2,2,5,12,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2340,1,157,2,2,6,15,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2341,1,157,2,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2342,1,158,2,1,1,2,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2345,1,158,2,1,2,4,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2346,1,158,2,1,2,3,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2349,1,158,2,1,3,7,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2350,1,158,2,1,3,6,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2351,1,158,2,2,4,11,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2352,1,158,2,2,4,10,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2353,1,158,2,2,5,13,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2354,1,158,2,2,5,12,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2355,1,158,2,2,6,15,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2356,1,158,2,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2357,1,159,2,1,1,2,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2360,1,159,2,1,2,4,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2361,1,159,2,1,2,3,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2364,1,159,2,1,3,7,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2365,1,159,2,1,3,6,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2366,1,159,2,2,4,11,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2367,1,159,2,2,4,10,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2368,1,159,2,2,5,13,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2369,1,159,2,2,5,12,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2370,1,159,2,2,6,15,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2371,1,159,2,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2372,1,160,2,1,1,2,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2375,1,160,2,1,2,4,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2376,1,160,2,1,2,3,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2379,1,160,2,1,3,7,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2380,1,160,2,1,3,6,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2381,1,160,2,2,4,11,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2382,1,160,2,2,4,10,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2383,1,160,2,2,5,13,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2384,1,160,2,2,5,12,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2385,1,160,2,2,6,15,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2386,1,160,2,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2387,1,161,2,1,1,2,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2390,1,161,2,1,2,4,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2391,1,161,2,1,2,3,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2394,1,161,2,1,3,7,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2395,1,161,2,1,3,6,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2396,1,161,2,2,4,11,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2397,1,161,2,2,4,10,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2398,1,161,2,2,5,13,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2399,1,161,2,2,5,12,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2400,1,161,2,2,6,15,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2401,1,161,2,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2402,1,162,2,1,1,2,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2404,1,162,2,1,2,5,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2405,1,162,2,1,2,4,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2406,1,162,2,1,2,3,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2407,1,162,2,1,3,9,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2408,1,162,2,1,3,8,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2409,1,162,2,1,3,7,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2410,1,162,2,1,3,6,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2411,1,162,2,2,4,11,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2412,1,162,2,2,4,10,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2413,1,162,2,2,5,13,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2414,1,162,2,2,5,12,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2415,1,162,2,2,6,15,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2416,1,162,2,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2417,1,163,2,1,1,2,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2419,1,163,2,1,2,5,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2420,1,163,2,1,2,4,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2421,1,163,2,1,2,3,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2422,1,163,2,1,3,9,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2423,1,163,2,1,3,8,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2424,1,163,2,1,3,7,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2425,1,163,2,1,3,6,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2426,1,163,2,2,4,11,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2427,1,163,2,2,4,10,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2428,1,163,2,2,5,13,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2429,1,163,2,2,5,12,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2430,1,163,2,2,6,15,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2431,1,163,2,2,6,14,'2016-04-05 13:20:18','2018-08-07 14:36:34'),(2432,1,164,2,1,1,2,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2434,1,164,2,1,2,5,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2435,1,164,2,1,2,4,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2436,1,164,2,1,2,3,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2437,1,164,2,1,3,9,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2438,1,164,2,1,3,8,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2439,1,164,2,1,3,7,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2440,1,164,2,1,3,6,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2441,1,164,2,2,4,11,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2442,1,164,2,2,4,10,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2443,1,164,2,2,5,13,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2444,1,164,2,2,5,12,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2445,1,164,2,2,6,15,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2446,1,164,2,2,6,14,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2447,1,165,2,1,1,2,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2449,1,165,2,1,2,5,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2450,1,165,2,1,2,4,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2451,1,165,2,1,2,3,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2452,1,165,2,1,3,9,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2453,1,165,2,1,3,8,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2454,1,165,2,1,3,7,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2455,1,165,2,1,3,6,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2456,1,165,2,2,4,11,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2457,1,165,2,2,4,10,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2458,1,165,2,2,5,13,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2459,1,165,2,2,5,12,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2460,1,165,2,2,6,15,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2461,1,165,2,2,6,14,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2462,1,166,2,1,1,2,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2464,1,166,2,1,2,5,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2465,1,166,2,1,2,4,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2466,1,166,2,1,2,3,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2467,1,166,2,1,3,9,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2468,1,166,2,1,3,8,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2469,1,166,2,1,3,7,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2470,1,166,2,1,3,6,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2471,1,166,2,2,4,11,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2472,1,166,2,2,4,10,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2473,1,166,2,2,5,13,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2474,1,166,2,2,5,12,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2475,1,166,2,2,6,15,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2476,1,166,2,2,6,14,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2477,1,167,2,1,1,2,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2479,1,167,2,1,2,5,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2480,1,167,2,1,2,4,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2481,1,167,2,1,2,3,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2482,1,167,2,1,3,9,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2483,1,167,2,1,3,8,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2484,1,167,2,1,3,7,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2485,1,167,2,1,3,6,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2486,1,167,2,2,4,11,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2487,1,167,2,2,4,10,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2488,1,167,2,2,5,13,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2489,1,167,2,2,5,12,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2490,1,167,2,2,6,15,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2491,1,167,2,2,6,14,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2492,1,168,2,1,1,2,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2494,1,168,2,1,2,5,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2495,1,168,2,1,2,4,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2496,1,168,2,1,2,3,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2497,1,168,2,1,3,9,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2498,1,168,2,1,3,8,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2499,1,168,2,1,3,7,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2500,1,168,2,1,3,6,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2501,1,168,2,2,4,11,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2502,1,168,2,2,4,10,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2503,1,168,2,2,5,13,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2504,1,168,2,2,5,12,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2505,1,168,2,2,6,15,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2506,1,168,2,2,6,14,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2507,1,169,2,1,1,2,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2509,1,169,2,1,2,5,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2510,1,169,2,1,2,4,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2511,1,169,2,1,2,3,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2512,1,169,2,1,3,9,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2513,1,169,2,1,3,8,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2514,1,169,2,1,3,7,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2515,1,169,2,1,3,6,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2516,1,169,2,2,4,11,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2517,1,169,2,2,4,10,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2518,1,169,2,2,5,13,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2519,1,169,2,2,5,12,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2520,1,169,2,2,6,15,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2521,1,169,2,2,6,14,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2522,1,170,2,1,1,2,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2524,1,170,2,1,2,5,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2525,1,170,2,1,2,4,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2526,1,170,2,1,2,3,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2527,1,170,2,1,3,9,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2528,1,170,2,1,3,8,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2529,1,170,2,1,3,7,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2530,1,170,2,1,3,6,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2531,1,170,2,2,4,11,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2532,1,170,2,2,4,10,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2533,1,170,2,2,5,13,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2534,1,170,2,2,5,12,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2535,1,170,2,2,6,15,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2536,1,170,2,2,6,14,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2537,1,171,2,1,1,2,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2539,1,171,2,1,2,5,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2540,1,171,2,1,2,4,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2541,1,171,2,1,2,3,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2542,1,171,2,1,3,9,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2543,1,171,2,1,3,8,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2544,1,171,2,1,3,7,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2545,1,171,2,1,3,6,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2546,1,171,2,2,4,11,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2547,1,171,2,2,4,10,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2548,1,171,2,2,5,13,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2549,1,171,2,2,5,12,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2550,1,171,2,2,6,15,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2551,1,171,2,2,6,14,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2552,1,172,2,1,1,2,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2554,1,172,2,1,2,5,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2555,1,172,2,1,2,4,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2556,1,172,2,1,2,3,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2557,1,172,2,1,3,9,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2558,1,172,2,1,3,8,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2559,1,172,2,1,3,7,'2016-04-05 13:20:19','2018-08-07 14:36:34'),(2560,1,172,2,1,3,6,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2561,1,172,2,2,4,11,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2562,1,172,2,2,4,10,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2563,1,172,2,2,5,13,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2564,1,172,2,2,5,12,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2565,1,172,2,2,6,15,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2566,1,172,2,2,6,14,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2567,1,173,2,1,1,2,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2569,1,173,2,1,2,5,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2570,1,173,2,1,2,4,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2571,1,173,2,1,2,3,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2572,1,173,2,1,3,9,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2573,1,173,2,1,3,8,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2574,1,173,2,1,3,7,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2575,1,173,2,1,3,6,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2576,1,173,2,2,4,11,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2577,1,173,2,2,4,10,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2578,1,173,2,2,5,13,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2579,1,173,2,2,5,12,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2580,1,173,2,2,6,15,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2581,1,173,2,2,6,14,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2582,1,174,2,1,1,2,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2584,1,174,2,1,2,5,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2585,1,174,2,1,2,4,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2586,1,174,2,1,2,3,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2587,1,174,2,1,3,9,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2588,1,174,2,1,3,8,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2589,1,174,2,1,3,7,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2590,1,174,2,1,3,6,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2591,1,174,2,2,4,11,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2592,1,174,2,2,4,10,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2593,1,174,2,2,5,13,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2594,1,174,2,2,5,12,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2595,1,174,2,2,6,15,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2596,1,174,2,2,6,14,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2597,1,175,2,1,1,2,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2599,1,175,2,1,2,5,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2600,1,175,2,1,2,4,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2601,1,175,2,1,2,3,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2602,1,175,2,1,3,9,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2603,1,175,2,1,3,8,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2604,1,175,2,1,3,7,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2605,1,175,2,1,3,6,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2606,1,175,2,2,4,11,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2607,1,175,2,2,4,10,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2608,1,175,2,2,5,13,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2609,1,175,2,2,5,12,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2610,1,175,2,2,6,15,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2611,1,175,2,2,6,14,'2016-04-05 13:20:20','2018-08-07 14:36:34'),(2612,1,176,2,1,1,2,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2614,1,176,2,1,2,5,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2615,1,176,2,1,2,4,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2616,1,176,2,1,2,3,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2617,1,176,2,1,3,9,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2618,1,176,2,1,3,8,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2619,1,176,2,1,3,7,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2620,1,176,2,1,3,6,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2621,1,176,2,2,4,11,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2622,1,176,2,2,4,10,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2623,1,176,2,2,5,13,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2624,1,176,2,2,5,12,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2625,1,176,2,2,6,15,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2626,1,176,2,2,6,14,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2627,1,177,3,1,1,2,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2629,1,177,3,1,2,5,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2630,1,177,3,1,2,4,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2631,1,177,3,1,2,3,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2632,1,177,3,1,3,9,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2633,1,177,3,1,3,8,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2634,1,177,3,1,3,7,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2635,1,177,3,1,3,6,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2636,1,177,3,2,4,11,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2637,1,177,3,2,4,10,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2638,1,177,3,2,5,13,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2639,1,177,3,2,5,12,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2640,1,177,3,2,6,15,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2641,1,177,3,2,6,14,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2642,1,178,3,1,1,2,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2644,1,178,3,1,2,5,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2645,1,178,3,1,2,4,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2646,1,178,3,1,2,3,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2647,1,178,3,1,3,9,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2648,1,178,3,1,3,8,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2649,1,178,3,1,3,7,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2650,1,178,3,1,3,6,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2651,1,178,3,2,4,11,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2652,1,178,3,2,4,10,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2653,1,178,3,2,5,13,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2654,1,178,3,2,5,12,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2655,1,178,3,2,6,15,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2656,1,178,3,2,6,14,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2657,1,179,3,1,1,2,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2659,1,179,3,1,2,5,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2660,1,179,3,1,2,4,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2661,1,179,3,1,2,3,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2662,1,179,3,1,3,9,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2663,1,179,3,1,3,8,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2664,1,179,3,1,3,7,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2665,1,179,3,1,3,6,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2666,1,179,3,2,4,11,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2667,1,179,3,2,4,10,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2668,1,179,3,2,5,13,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2669,1,179,3,2,5,12,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2670,1,179,3,2,6,15,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2671,1,179,3,2,6,14,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2672,1,180,3,1,1,2,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2674,1,180,3,1,2,5,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2675,1,180,3,1,2,4,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2676,1,180,3,1,2,3,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2677,1,180,3,1,3,9,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2678,1,180,3,1,3,8,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2679,1,180,3,1,3,7,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2680,1,180,3,1,3,6,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2681,1,180,3,2,4,11,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2682,1,180,3,2,4,10,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2683,1,180,3,2,5,13,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2684,1,180,3,2,5,12,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2685,1,180,3,2,6,15,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2686,1,180,3,2,6,14,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2687,1,181,3,1,1,2,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2689,1,181,3,1,2,5,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2690,1,181,3,1,2,4,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2691,1,181,3,1,2,3,'2016-04-05 13:20:21','2018-08-07 14:36:34'),(2692,1,181,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2693,1,181,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2694,1,181,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2695,1,181,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2696,1,181,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2697,1,181,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2698,1,181,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2699,1,181,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2700,1,181,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2701,1,181,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2702,1,182,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2704,1,182,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2705,1,182,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2706,1,182,3,1,2,3,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2707,1,182,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2708,1,182,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2709,1,182,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2710,1,182,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2711,1,182,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2712,1,182,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2713,1,182,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2714,1,182,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2715,1,182,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2716,1,182,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2717,1,183,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2719,1,183,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2720,1,183,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2721,1,183,3,1,2,3,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2722,1,183,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2723,1,183,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2724,1,183,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2725,1,183,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2726,1,183,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2727,1,183,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2728,1,183,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2729,1,183,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2730,1,183,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2731,1,183,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2732,1,184,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2734,1,184,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2735,1,184,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2736,1,184,3,1,2,3,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2737,1,184,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2738,1,184,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2739,1,184,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2740,1,184,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2741,1,184,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2742,1,184,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2743,1,184,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2744,1,184,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2745,1,184,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2746,1,184,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2747,1,185,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2749,1,185,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2750,1,185,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2751,1,185,3,1,2,3,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2752,1,185,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2753,1,185,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2754,1,185,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2755,1,185,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2756,1,185,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2757,1,185,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2758,1,185,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2759,1,185,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2760,1,185,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2761,1,185,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2762,1,186,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2764,1,186,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2765,1,186,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2766,1,186,3,1,2,3,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2767,1,186,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2768,1,186,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2769,1,186,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2770,1,186,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2771,1,186,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2772,1,186,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2773,1,186,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2774,1,186,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2775,1,186,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2776,1,186,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2777,1,187,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2779,1,187,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2780,1,187,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2781,1,187,3,1,2,3,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2782,1,187,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2783,1,187,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2784,1,187,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2785,1,187,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2786,1,187,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2787,1,187,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2788,1,187,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2789,1,187,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2790,1,187,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2791,1,187,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2792,1,188,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2794,1,188,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2795,1,188,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2796,1,188,3,1,2,3,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2797,1,188,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2798,1,188,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2799,1,188,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2800,1,188,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2801,1,188,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2802,1,188,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2803,1,188,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2804,1,188,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2805,1,188,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2806,1,188,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2807,1,189,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2809,1,189,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2810,1,189,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2811,1,189,3,1,2,3,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2812,1,189,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2813,1,189,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2814,1,189,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2815,1,189,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2816,1,189,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2817,1,189,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2818,1,189,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2819,1,189,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2820,1,189,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2821,1,189,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2822,1,190,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2824,1,190,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2825,1,190,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2826,1,190,3,1,2,3,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2827,1,190,3,1,3,9,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2828,1,190,3,1,3,8,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2829,1,190,3,1,3,7,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2830,1,190,3,1,3,6,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2831,1,190,3,2,4,11,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2832,1,190,3,2,4,10,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2833,1,190,3,2,5,13,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2834,1,190,3,2,5,12,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2835,1,190,3,2,6,15,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2836,1,190,3,2,6,14,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2837,1,191,3,1,1,2,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2839,1,191,3,1,2,5,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2840,1,191,3,1,2,4,'2016-04-05 13:20:22','2018-08-07 14:36:34'),(2841,1,191,3,1,2,3,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2842,1,191,3,1,3,9,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2843,1,191,3,1,3,8,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2844,1,191,3,1,3,7,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2845,1,191,3,1,3,6,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2846,1,191,3,2,4,11,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2847,1,191,3,2,4,10,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2848,1,191,3,2,5,13,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2849,1,191,3,2,5,12,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2850,1,191,3,2,6,15,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2851,1,191,3,2,6,14,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2852,1,192,3,1,1,2,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2854,1,192,3,1,2,5,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2855,1,192,3,1,2,4,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2856,1,192,3,1,2,3,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2857,1,192,3,1,3,9,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2858,1,192,3,1,3,8,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2859,1,192,3,1,3,7,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2860,1,192,3,1,3,6,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2861,1,192,3,2,4,11,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2862,1,192,3,2,4,10,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2863,1,192,3,2,5,13,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2864,1,192,3,2,5,12,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2865,1,192,3,2,6,15,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2866,1,192,3,2,6,14,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2867,1,193,3,1,1,2,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2869,1,193,3,1,2,5,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2870,1,193,3,1,2,4,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2871,1,193,3,1,2,3,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2872,1,193,3,1,3,9,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2873,1,193,3,1,3,8,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2874,1,193,3,1,3,7,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2875,1,193,3,1,3,6,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2876,1,193,3,2,4,11,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2877,1,193,3,2,4,10,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2878,1,193,3,2,5,13,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2879,1,193,3,2,5,12,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2880,1,193,3,2,6,15,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2881,1,193,3,2,6,14,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2882,1,194,3,1,1,2,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2884,1,194,3,1,2,5,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2885,1,194,3,1,2,4,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2886,1,194,3,1,2,3,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2887,1,194,3,1,3,9,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2888,1,194,3,1,3,8,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2889,1,194,3,1,3,7,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2890,1,194,3,1,3,6,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2891,1,194,3,2,4,11,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2892,1,194,3,2,4,10,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2893,1,194,3,2,5,13,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2894,1,194,3,2,5,12,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2895,1,194,3,2,6,15,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2896,1,194,3,2,6,14,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2897,1,195,3,1,1,2,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2900,1,195,3,1,2,4,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2901,1,195,3,1,2,3,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2904,1,195,3,1,3,7,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2905,1,195,3,1,3,6,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2906,1,195,3,2,4,11,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2907,1,195,3,2,4,10,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2908,1,195,3,2,5,13,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2909,1,195,3,2,5,12,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2910,1,195,3,2,6,15,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2911,1,195,3,2,6,14,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2912,1,196,3,1,1,2,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2915,1,196,3,1,2,4,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2916,1,196,3,1,2,3,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2919,1,196,3,1,3,7,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2920,1,196,3,1,3,6,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2921,1,196,3,2,4,11,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2922,1,196,3,2,4,10,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2923,1,196,3,2,5,13,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2924,1,196,3,2,5,12,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2925,1,196,3,2,6,15,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2926,1,196,3,2,6,14,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2927,1,197,3,1,1,2,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2930,1,197,3,1,2,4,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2931,1,197,3,1,2,3,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2934,1,197,3,1,3,7,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2935,1,197,3,1,3,6,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2936,1,197,3,2,4,11,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2937,1,197,3,2,4,10,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2938,1,197,3,2,5,13,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2939,1,197,3,2,5,12,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2940,1,197,3,2,6,15,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2941,1,197,3,2,6,14,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2942,1,198,3,1,1,2,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2945,1,198,3,1,2,4,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2946,1,198,3,1,2,3,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2949,1,198,3,1,3,7,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2950,1,198,3,1,3,6,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2951,1,198,3,2,4,11,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2952,1,198,3,2,4,10,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2953,1,198,3,2,5,13,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2954,1,198,3,2,5,12,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2955,1,198,3,2,6,15,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2956,1,198,3,2,6,14,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2957,1,199,3,1,1,2,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2960,1,199,3,1,2,4,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2961,1,199,3,1,2,3,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2964,1,199,3,1,3,7,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2965,1,199,3,1,3,6,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2966,1,199,3,2,4,11,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2967,1,199,3,2,4,10,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2968,1,199,3,2,5,13,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2969,1,199,3,2,5,12,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2970,1,199,3,2,6,15,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2971,1,199,3,2,6,14,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2972,1,200,3,1,1,2,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2975,1,200,3,1,2,4,'2016-04-05 13:20:23','2018-08-07 14:36:34'),(2976,1,200,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2979,1,200,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2980,1,200,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2981,1,200,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2982,1,200,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2983,1,200,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2984,1,200,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2985,1,200,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2986,1,200,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2987,1,201,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2990,1,201,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2991,1,201,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2994,1,201,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2995,1,201,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2996,1,201,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2997,1,201,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2998,1,201,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(2999,1,201,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3000,1,201,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3001,1,201,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3002,1,202,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3005,1,202,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3006,1,202,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3009,1,202,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3010,1,202,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3011,1,202,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3012,1,202,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3013,1,202,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3014,1,202,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3015,1,202,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3016,1,202,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3017,1,203,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3020,1,203,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3021,1,203,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3024,1,203,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3025,1,203,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3026,1,203,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3027,1,203,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3028,1,203,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3029,1,203,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3030,1,203,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3031,1,203,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3032,1,204,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3035,1,204,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3036,1,204,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3039,1,204,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3040,1,204,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3041,1,204,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3042,1,204,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3043,1,204,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3044,1,204,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3045,1,204,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3046,1,204,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3047,1,205,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3050,1,205,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3051,1,205,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3054,1,205,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3055,1,205,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3056,1,205,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3057,1,205,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3058,1,205,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3059,1,205,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3060,1,205,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3061,1,205,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3062,1,206,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3065,1,206,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3066,1,206,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3069,1,206,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3070,1,206,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3071,1,206,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3072,1,206,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3073,1,206,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3074,1,206,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3075,1,206,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3076,1,206,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3077,1,207,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3080,1,207,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3081,1,207,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3084,1,207,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3085,1,207,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3086,1,207,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3087,1,207,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3088,1,207,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3089,1,207,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3090,1,207,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3091,1,207,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3092,1,208,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3095,1,208,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3096,1,208,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3099,1,208,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3100,1,208,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3101,1,208,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3102,1,208,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3103,1,208,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3104,1,208,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3105,1,208,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3106,1,208,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3107,1,209,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3110,1,209,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3111,1,209,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3114,1,209,3,1,3,7,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3115,1,209,3,1,3,6,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3116,1,209,3,2,4,11,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3117,1,209,3,2,4,10,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3118,1,209,3,2,5,13,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3119,1,209,3,2,5,12,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3120,1,209,3,2,6,15,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3121,1,209,3,2,6,14,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3122,1,210,3,1,1,2,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3125,1,210,3,1,2,4,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3126,1,210,3,1,2,3,'2016-04-05 13:20:24','2018-08-07 14:36:34'),(3129,1,210,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3130,1,210,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3131,1,210,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3132,1,210,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3133,1,210,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3134,1,210,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3135,1,210,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3136,1,210,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3137,1,211,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3140,1,211,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3141,1,211,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3144,1,211,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3145,1,211,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3146,1,211,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3147,1,211,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3148,1,211,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3149,1,211,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3150,1,211,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3151,1,211,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3152,1,212,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3155,1,212,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3156,1,212,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3159,1,212,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3160,1,212,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3161,1,212,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3162,1,212,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3163,1,212,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3164,1,212,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3165,1,212,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3166,1,212,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3167,1,213,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3170,1,213,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3171,1,213,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3174,1,213,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3175,1,213,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3176,1,213,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3177,1,213,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3178,1,213,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3179,1,213,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3180,1,213,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3181,1,213,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3182,1,214,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3185,1,214,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3186,1,214,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3189,1,214,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3190,1,214,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3191,1,214,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3192,1,214,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3193,1,214,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3194,1,214,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3195,1,214,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3196,1,214,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3197,1,215,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3200,1,215,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3201,1,215,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3204,1,215,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3205,1,215,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3206,1,215,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3207,1,215,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3208,1,215,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3209,1,215,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3210,1,215,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3211,1,215,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3212,1,216,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3215,1,216,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3216,1,216,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3219,1,216,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3220,1,216,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3221,1,216,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3222,1,216,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3223,1,216,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3224,1,216,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3225,1,216,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3226,1,216,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3227,1,217,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3230,1,217,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3231,1,217,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3234,1,217,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3235,1,217,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3236,1,217,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3237,1,217,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3238,1,217,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3239,1,217,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3240,1,217,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3241,1,217,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3242,1,218,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3245,1,218,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3246,1,218,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3249,1,218,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3250,1,218,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3251,1,218,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3252,1,218,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3253,1,218,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3254,1,218,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3255,1,218,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3256,1,218,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3257,1,219,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3260,1,219,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3261,1,219,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3264,1,219,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3265,1,219,3,1,3,6,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3266,1,219,3,2,4,11,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3267,1,219,3,2,4,10,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3268,1,219,3,2,5,13,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3269,1,219,3,2,5,12,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3270,1,219,3,2,6,15,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3271,1,219,3,2,6,14,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3272,1,220,3,1,1,2,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3275,1,220,3,1,2,4,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3276,1,220,3,1,2,3,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3279,1,220,3,1,3,7,'2016-04-05 13:20:25','2018-08-07 14:36:34'),(3280,1,220,3,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3281,1,220,3,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3282,1,220,3,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3283,1,220,3,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3284,1,220,3,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3285,1,220,3,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3286,1,220,3,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3287,1,221,3,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3290,1,221,3,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3291,1,221,3,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3294,1,221,3,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3295,1,221,3,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3296,1,221,3,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3297,1,221,3,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3298,1,221,3,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3299,1,221,3,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3300,1,221,3,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3301,1,221,3,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3302,1,222,3,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3305,1,222,3,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3306,1,222,3,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3309,1,222,3,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3310,1,222,3,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3311,1,222,3,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3312,1,222,3,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3313,1,222,3,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3314,1,222,3,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3315,1,222,3,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3316,1,222,3,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3317,1,223,3,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3320,1,223,3,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3321,1,223,3,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3324,1,223,3,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3325,1,223,3,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3326,1,223,3,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3327,1,223,3,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3328,1,223,3,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3329,1,223,3,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3330,1,223,3,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3331,1,223,3,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3332,1,224,3,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3335,1,224,3,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3336,1,224,3,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3339,1,224,3,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3340,1,224,3,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3341,1,224,3,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3342,1,224,3,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3343,1,224,3,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3344,1,224,3,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3345,1,224,3,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3346,1,224,3,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3347,1,225,3,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3350,1,225,3,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3351,1,225,3,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3354,1,225,3,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3355,1,225,3,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3356,1,225,3,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3357,1,225,3,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3358,1,225,3,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3359,1,225,3,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3360,1,225,3,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3361,1,225,3,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3362,1,226,1,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3363,1,226,1,1,1,1,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3365,1,226,1,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3366,1,226,1,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3369,1,226,1,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3370,1,226,1,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3371,1,226,1,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3372,1,226,1,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3373,1,226,1,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3374,1,226,1,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3375,1,226,1,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3376,1,226,1,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3377,1,227,4,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3380,1,227,4,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3381,1,227,4,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3384,1,227,4,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3385,1,227,4,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3386,1,227,4,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3387,1,227,4,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3388,1,227,4,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3389,1,227,4,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3390,1,227,4,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3391,1,227,4,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3392,1,228,4,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3395,1,228,4,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3396,1,228,4,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3399,1,228,4,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3400,1,228,4,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3401,1,228,4,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3402,1,228,4,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3403,1,228,4,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3404,1,228,4,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3405,1,228,4,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3406,1,228,4,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3407,1,229,4,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3410,1,229,4,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3411,1,229,4,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3414,1,229,4,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3415,1,229,4,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3416,1,229,4,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3417,1,229,4,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3418,1,229,4,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3419,1,229,4,2,5,12,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3420,1,229,4,2,6,15,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3421,1,229,4,2,6,14,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3422,1,230,4,1,1,2,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3425,1,230,4,1,2,4,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3426,1,230,4,1,2,3,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3429,1,230,4,1,3,7,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3430,1,230,4,1,3,6,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3431,1,230,4,2,4,11,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3432,1,230,4,2,4,10,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3433,1,230,4,2,5,13,'2016-04-05 13:20:26','2018-08-07 14:36:34'),(3434,1,230,4,2,5,12,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3435,1,230,4,2,6,15,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3436,1,230,4,2,6,14,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3437,1,231,4,1,1,2,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3440,1,231,4,1,2,4,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3441,1,231,4,1,2,3,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3444,1,231,4,1,3,7,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3445,1,231,4,1,3,6,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3446,1,231,4,2,4,11,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3447,1,231,4,2,4,10,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3448,1,231,4,2,5,13,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3449,1,231,4,2,5,12,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3450,1,231,4,2,6,15,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3451,1,231,4,2,6,14,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3452,1,232,4,1,1,2,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3455,1,232,4,1,2,4,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3456,1,232,4,1,2,3,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3459,1,232,4,1,3,7,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3460,1,232,4,1,3,6,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3461,1,232,4,2,4,11,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3462,1,232,4,2,4,10,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3463,1,232,4,2,5,13,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3464,1,232,4,2,5,12,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3465,1,232,4,2,6,15,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3466,1,232,4,2,6,14,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3467,1,233,4,1,1,2,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3470,1,233,4,1,2,4,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3471,1,233,4,1,2,3,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3474,1,233,4,1,3,7,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3475,1,233,4,1,3,6,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3476,1,233,4,2,4,11,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3477,1,233,4,2,4,10,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3478,1,233,4,2,5,13,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3479,1,233,4,2,5,12,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3480,1,233,4,2,6,15,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3481,1,233,4,2,6,14,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3482,1,234,4,1,1,2,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3485,1,234,4,1,2,4,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3486,1,234,4,1,2,3,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3489,1,234,4,1,3,7,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3490,1,234,4,1,3,6,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3491,1,234,4,2,4,11,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3492,1,234,4,2,4,10,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3493,1,234,4,2,5,13,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3494,1,234,4,2,5,12,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3495,1,234,4,2,6,15,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3496,1,234,4,2,6,14,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3497,1,235,4,1,1,2,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3500,1,235,4,1,2,4,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3501,1,235,4,1,2,3,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3504,1,235,4,1,3,7,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3505,1,235,4,1,3,6,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3506,1,235,4,2,4,11,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3507,1,235,4,2,4,10,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3508,1,235,4,2,5,13,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3509,1,235,4,2,5,12,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3510,1,235,4,2,6,15,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3511,1,235,4,2,6,14,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3512,1,236,4,1,1,2,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3515,1,236,4,1,2,4,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3516,1,236,4,1,2,3,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3519,1,236,4,1,3,7,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3520,1,236,4,1,3,6,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3521,1,236,4,2,4,11,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3522,1,236,4,2,4,10,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3523,1,236,4,2,5,13,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3524,1,236,4,2,5,12,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3525,1,236,4,2,6,15,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3526,1,236,4,2,6,14,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3527,1,237,4,1,1,2,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3530,1,237,4,1,2,4,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3531,1,237,4,1,2,3,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3534,1,237,4,1,3,7,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3535,1,237,4,1,3,6,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3536,1,237,4,2,4,11,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3537,1,237,4,2,4,10,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3538,1,237,4,2,5,13,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3539,1,237,4,2,5,12,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3540,1,237,4,2,6,15,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3541,1,237,4,2,6,14,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3542,1,238,4,1,1,2,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3545,1,238,4,1,2,4,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3546,1,238,4,1,2,3,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3549,1,238,4,1,3,7,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3550,1,238,4,1,3,6,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3551,1,238,4,2,4,11,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3552,1,238,4,2,4,10,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3553,1,238,4,2,5,13,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3554,1,238,4,2,5,12,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3555,1,238,4,2,6,15,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3556,1,238,4,2,6,14,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3557,1,239,4,1,1,2,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3560,1,239,4,1,2,4,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3561,1,239,4,1,2,3,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3564,1,239,4,1,3,7,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3565,1,239,4,1,3,6,'2016-04-05 13:20:27','2018-08-07 14:36:34'),(3566,1,239,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3567,1,239,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3568,1,239,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3569,1,239,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3570,1,239,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3571,1,239,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3572,1,240,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3575,1,240,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3576,1,240,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3579,1,240,4,1,3,7,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3580,1,240,4,1,3,6,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3581,1,240,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3582,1,240,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3583,1,240,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3584,1,240,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3585,1,240,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3586,1,240,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3587,1,241,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3590,1,241,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3591,1,241,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3594,1,241,4,1,3,7,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3595,1,241,4,1,3,6,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3596,1,241,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3597,1,241,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3598,1,241,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3599,1,241,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3600,1,241,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3601,1,241,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3602,1,242,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3605,1,242,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3606,1,242,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3609,1,242,4,1,3,7,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3610,1,242,4,1,3,6,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3611,1,242,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3612,1,242,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3613,1,242,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3614,1,242,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3615,1,242,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3616,1,242,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3617,1,243,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3620,1,243,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3621,1,243,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3624,1,243,4,1,3,7,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3625,1,243,4,1,3,6,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3626,1,243,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3627,1,243,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3628,1,243,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3629,1,243,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3630,1,243,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3631,1,243,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3632,1,244,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3635,1,244,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3636,1,244,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3639,1,244,4,1,3,7,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3640,1,244,4,1,3,6,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3641,1,244,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3642,1,244,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3643,1,244,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3644,1,244,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3645,1,244,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3646,1,244,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3647,1,245,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3650,1,245,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3651,1,245,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3654,1,245,4,1,3,7,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3655,1,245,4,1,3,6,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3656,1,245,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3657,1,245,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3658,1,245,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3659,1,245,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3660,1,245,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3661,1,245,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3662,1,246,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3665,1,246,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3666,1,246,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3669,1,246,4,1,3,7,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3670,1,246,4,1,3,6,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3671,1,246,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3672,1,246,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3673,1,246,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3674,1,246,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3675,1,246,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3676,1,246,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3677,1,247,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3680,1,247,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3681,1,247,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3684,1,247,4,1,3,7,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3685,1,247,4,1,3,6,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3686,1,247,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3687,1,247,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3688,1,247,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3689,1,247,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3690,1,247,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3691,1,247,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3692,1,248,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3695,1,248,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3696,1,248,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3699,1,248,4,1,3,7,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3700,1,248,4,1,3,6,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3701,1,248,4,2,4,11,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3702,1,248,4,2,4,10,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3703,1,248,4,2,5,13,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3704,1,248,4,2,5,12,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3705,1,248,4,2,6,15,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3706,1,248,4,2,6,14,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3707,1,249,4,1,1,2,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3710,1,249,4,1,2,4,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3711,1,249,4,1,2,3,'2016-04-05 13:20:28','2018-08-07 14:36:34'),(3714,1,249,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3715,1,249,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3716,1,249,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3717,1,249,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3718,1,249,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3719,1,249,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3720,1,249,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3721,1,249,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3722,1,250,4,1,1,2,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3725,1,250,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3726,1,250,4,1,2,3,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3729,1,250,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3730,1,250,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3731,1,250,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3732,1,250,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3733,1,250,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3734,1,250,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3735,1,250,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3736,1,250,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3737,1,251,4,1,1,2,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3740,1,251,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3741,1,251,4,1,2,3,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3744,1,251,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3745,1,251,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3746,1,251,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3747,1,251,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3748,1,251,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3749,1,251,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3750,1,251,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3751,1,251,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3752,1,252,4,1,1,2,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3755,1,252,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3756,1,252,4,1,2,3,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3759,1,252,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3760,1,252,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3761,1,252,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3762,1,252,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3763,1,252,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3764,1,252,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3765,1,252,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3766,1,252,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3767,1,253,4,1,1,2,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3770,1,253,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3771,1,253,4,1,2,3,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3774,1,253,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3775,1,253,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3776,1,253,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3777,1,253,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3778,1,253,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3779,1,253,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3780,1,253,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3781,1,253,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3782,1,254,4,1,1,2,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3785,1,254,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3786,1,254,4,1,2,3,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3789,1,254,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3790,1,254,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3791,1,254,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3792,1,254,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3793,1,254,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3794,1,254,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3795,1,254,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3796,1,254,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3797,1,255,4,1,1,2,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3800,1,255,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3801,1,255,4,1,2,3,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3804,1,255,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3805,1,255,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3806,1,255,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3807,1,255,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3808,1,255,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3809,1,255,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3810,1,255,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3811,1,255,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3812,1,256,4,1,1,2,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3815,1,256,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3816,1,256,4,1,2,3,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3819,1,256,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3820,1,256,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3821,1,256,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3822,1,256,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3823,1,256,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3824,1,256,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3825,1,256,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3826,1,256,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3830,1,257,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3834,1,257,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3835,1,257,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3836,1,257,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3837,1,257,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3838,1,257,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3839,1,257,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3840,1,257,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3841,1,257,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3842,1,258,4,1,1,2,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3845,1,258,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3846,1,258,4,1,2,3,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3849,1,258,4,1,3,7,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3850,1,258,4,1,3,6,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3851,1,258,4,2,4,11,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3852,1,258,4,2,4,10,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3853,1,258,4,2,5,13,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3854,1,258,4,2,5,12,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3855,1,258,4,2,6,15,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3856,1,258,4,2,6,14,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3857,1,259,4,1,1,2,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3860,1,259,4,1,2,4,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3861,1,259,4,1,2,3,'2016-04-05 13:20:29','2018-08-07 14:36:34'),(3864,1,259,4,1,3,7,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3865,1,259,4,1,3,6,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3866,1,259,4,2,4,11,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3867,1,259,4,2,4,10,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3868,1,259,4,2,5,13,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3869,1,259,4,2,5,12,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3870,1,259,4,2,6,15,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3871,1,259,4,2,6,14,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3872,1,260,4,1,1,2,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3875,1,260,4,1,2,4,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3876,1,260,4,1,2,3,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3879,1,260,4,1,3,7,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3880,1,260,4,1,3,6,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3881,1,260,4,2,4,11,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3882,1,260,4,2,4,10,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3883,1,260,4,2,5,13,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3884,1,260,4,2,5,12,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3885,1,260,4,2,6,15,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3886,1,260,4,2,6,14,'2016-04-05 13:20:30','2018-08-07 14:36:34'),(3906,1,261,4,1,2,4,'2018-08-07 11:14:45','2018-08-07 14:36:34'),(3908,1,261,4,1,3,6,'2018-08-07 11:14:45','2018-08-07 14:36:34'),(3909,1,261,4,1,3,7,'2018-08-07 11:14:45','2018-08-07 14:36:34'),(3912,1,261,4,2,4,10,'2018-08-07 11:14:46','2018-08-07 14:36:34'),(3913,1,261,4,2,4,11,'2018-08-07 11:14:46','2018-08-07 14:36:34'),(3914,1,261,4,2,5,12,'2018-08-07 11:14:46','2018-08-07 14:36:34'),(3915,1,261,4,2,5,13,'2018-08-07 11:14:46','2018-08-07 14:36:34'),(3916,1,261,4,2,6,14,'2018-08-07 11:14:46','2018-08-07 14:36:34'),(3917,1,261,4,2,6,15,'2018-08-07 11:14:46','2018-08-07 14:36:34'),(3920,1,1,1,1,2,5,'2018-08-07 12:00:44','2018-08-07 14:36:34'),(3921,1,1,1,1,3,8,'2018-08-07 12:00:46','2018-08-07 14:36:34'),(3922,1,1,1,1,3,9,'2018-08-07 12:00:47','2018-08-07 14:36:34'),(3923,1,2,1,1,3,8,'2018-08-07 12:00:56','2018-08-07 14:36:34'),(3924,1,2,1,1,3,9,'2018-08-07 12:00:57','2018-08-07 14:36:34'),(3925,1,2,1,1,2,5,'2018-08-07 12:00:59','2018-08-07 14:36:34'),(3926,1,3,1,1,2,5,'2018-08-07 12:01:05','2018-08-07 14:36:34'),(3927,1,3,1,1,3,8,'2018-08-07 12:01:08','2018-08-07 14:36:34'),(3929,1,4,1,1,2,5,'2018-08-07 12:01:14','2018-08-07 14:36:34'),(3931,1,4,1,1,3,8,'2018-08-07 12:01:19','2018-08-07 14:36:34'),(3932,1,5,1,1,3,8,'2018-08-07 12:01:26','2018-08-07 14:36:34'),(3934,1,5,1,1,2,5,'2018-08-07 12:01:29','2018-08-07 14:36:34'),(3935,1,6,2,1,2,5,'2018-08-07 12:01:35','2018-08-07 14:36:34'),(3936,1,6,2,1,3,8,'2018-08-07 12:01:44','2018-08-07 14:36:34'),(3937,1,6,2,1,3,9,'2018-08-07 12:01:45','2018-08-07 14:36:34'),(3938,1,7,1,1,2,5,'2018-08-07 12:02:03','2018-08-07 14:36:34'),(3939,1,7,1,1,3,8,'2018-08-07 12:02:07','2018-08-07 14:36:34'),(3940,1,7,1,1,3,9,'2018-08-07 12:02:08','2018-08-07 14:36:34'),(3941,1,8,1,1,3,8,'2018-08-07 12:02:11','2018-08-07 14:36:34'),(3943,1,8,1,1,2,5,'2018-08-07 12:02:14','2018-08-07 14:36:34'),(3944,1,9,1,1,2,5,'2018-08-07 12:02:25','2018-08-07 14:36:34'),(3946,1,9,1,1,3,8,'2018-08-07 12:02:31','2018-08-07 14:36:34'),(3947,1,10,1,1,2,5,'2018-08-07 12:02:35','2018-08-07 14:36:34'),(3948,1,10,1,1,3,8,'2018-08-07 12:02:38','2018-08-07 14:36:34'),(3950,1,11,1,1,2,5,'2018-08-07 12:02:43','2018-08-07 14:36:34'),(3951,1,11,1,1,3,8,'2018-08-07 12:02:46','2018-08-07 14:36:34'),(3953,1,261,4,1,3,8,'2018-08-07 12:02:51','2018-08-07 14:36:34'),(3954,1,261,4,1,3,9,'2018-08-07 12:02:53','2018-08-07 14:36:34'),(3955,1,261,4,1,2,5,'2018-08-07 12:02:55','2018-08-07 14:36:34'),(3956,1,260,4,1,3,8,'2018-08-07 12:03:02','2018-08-07 14:36:34'),(3957,1,260,4,1,3,9,'2018-08-07 12:03:03','2018-08-07 14:36:34'),(3958,1,260,4,1,2,5,'2018-08-07 12:03:05','2018-08-07 14:36:34'),(3959,1,259,4,1,3,8,'2018-08-07 12:03:12','2018-08-07 14:36:34'),(3960,1,259,4,1,3,9,'2018-08-07 12:03:13','2018-08-07 14:36:34'),(3961,1,259,4,1,2,5,'2018-08-07 12:03:15','2018-08-07 14:36:34'),(4052,1,261,4,1,1,2,'2018-08-08 08:52:09','2018-08-08 08:52:09'),(4053,1,261,4,1,2,3,'2018-08-08 08:52:09','2018-08-08 08:52:09'),(4067,1,257,4,1,1,2,'2018-08-08 08:52:16','2018-08-08 08:52:16'),(4068,1,257,4,1,2,3,'2018-08-08 08:52:16','2018-08-08 08:52:16'),(4084,1,1,1,1,2,2,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4085,1,1,1,1,3,1,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4086,1,1,1,1,3,2,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4087,1,1,1,1,3,3,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4088,1,1,1,2,4,6,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4089,1,1,1,1,3,4,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4090,1,1,1,2,4,5,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4091,1,1,1,2,5,5,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4092,1,1,1,2,5,6,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4093,1,1,1,2,6,5,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4094,1,1,1,2,6,6,'2018-08-08 08:54:48','2018-08-08 08:54:48'),(4096,1,1,1,1,1,2,'2018-08-08 09:43:09','2018-08-08 09:43:09'),(4097,1,1,1,1,1,1,'2018-08-08 10:53:19','2018-08-08 10:53:19'),(4098,1,1,1,1,2,3,'2018-08-08 10:53:37','2018-08-08 10:53:37'),(4099,1,6,2,1,1,1,'2018-08-08 10:54:04','2018-08-08 10:54:04'),(4100,1,12,1,1,2,5,'2018-08-08 10:54:51','2018-08-08 10:54:51'),(4101,1,12,1,1,3,8,'2018-08-08 10:54:55','2018-08-08 10:54:55'),(4102,1,12,1,1,3,9,'2018-08-08 10:54:57','2018-08-08 10:54:57'),(4103,1,13,1,1,2,5,'2018-08-08 10:55:02','2018-08-08 10:55:02'),(4104,1,13,1,1,3,8,'2018-08-08 10:55:05','2018-08-08 10:55:05'),(4106,1,14,1,1,3,8,'2018-08-08 10:55:11','2018-08-08 10:55:11'),(4107,1,14,1,1,3,9,'2018-08-08 10:55:12','2018-08-08 10:55:12'),(4108,1,14,1,1,2,5,'2018-08-08 10:55:14','2018-08-08 10:55:14'),(4109,1,15,1,1,3,8,'2018-08-08 10:55:20','2018-08-08 10:55:20'),(4110,1,15,1,1,3,9,'2018-08-08 10:55:21','2018-08-08 10:55:21'),(4111,1,15,1,1,2,5,'2018-08-08 10:55:22','2018-08-08 10:55:22'),(4112,1,16,1,1,3,8,'2018-08-08 10:55:29','2018-08-08 10:55:29'),(4113,1,16,1,1,2,5,'2018-08-08 10:55:30','2018-08-08 10:55:30'),(4114,1,16,1,1,3,9,'2018-08-08 10:55:32','2018-08-08 10:55:32'),(4115,1,17,1,1,3,8,'2018-08-08 10:55:41','2018-08-08 10:55:41'),(4117,1,17,1,1,2,5,'2018-08-08 10:55:44','2018-08-08 10:55:44'),(4118,1,18,1,1,2,5,'2018-08-08 10:55:57','2018-08-08 10:55:57'),(4119,1,18,1,1,3,9,'2018-08-08 10:56:00','2018-08-08 10:56:00'),(4120,1,18,1,1,3,8,'2018-08-08 10:56:01','2018-08-08 10:56:01'),(4121,1,19,1,1,2,5,'2018-08-08 10:56:06','2018-08-08 10:56:06'),(4122,1,19,1,1,3,8,'2018-08-08 10:56:10','2018-08-08 10:56:10'),(4124,1,20,1,1,3,8,'2018-08-08 10:56:15','2018-08-08 10:56:15'),(4125,1,20,1,1,3,9,'2018-08-08 10:56:17','2018-08-08 10:56:17'),(4126,1,20,1,1,2,5,'2018-08-08 10:56:18','2018-08-08 10:56:18'),(4127,1,21,1,1,3,8,'2018-08-08 10:56:23','2018-08-08 10:56:23'),(4128,1,21,1,1,3,9,'2018-08-08 10:56:24','2018-08-08 10:56:24'),(4129,1,21,1,1,2,5,'2018-08-08 10:56:26','2018-08-08 10:56:26'),(4130,1,22,1,1,2,5,'2018-08-08 16:46:47','2018-08-08 16:46:47'),(4131,1,22,1,1,3,8,'2018-08-08 16:46:52','2018-08-08 16:46:52'),(4132,1,22,1,1,3,9,'2018-08-08 16:46:54','2018-08-08 16:46:54'),(4133,1,23,1,1,3,8,'2018-08-08 16:47:02','2018-08-08 16:47:02'),(4134,1,23,1,1,3,9,'2018-08-08 16:47:04','2018-08-08 16:47:04'),(4135,1,23,1,1,2,5,'2018-08-08 16:47:07','2018-08-08 16:47:07'),(4136,1,24,1,1,2,5,'2018-08-08 16:47:16','2018-08-08 16:47:16'),(4137,1,24,1,1,3,8,'2018-08-08 16:47:20','2018-08-08 16:47:20'),(4138,1,24,1,1,3,9,'2018-08-08 16:47:22','2018-08-08 16:47:22'),(4139,1,25,1,1,2,5,'2018-08-08 16:47:26','2018-08-08 16:47:26'),(4140,1,25,1,1,3,8,'2018-08-08 16:47:30','2018-08-08 16:47:30'),(4141,1,25,1,1,3,9,'2018-08-08 16:47:32','2018-08-08 16:47:32'),(4142,1,26,1,1,2,5,'2018-08-08 16:47:37','2018-08-08 16:47:37'),(4143,1,26,1,1,3,8,'2018-08-08 16:47:41','2018-08-08 16:47:41'),(4144,1,26,1,1,3,9,'2018-08-08 16:47:43','2018-08-08 16:47:43'),(4145,1,27,3,1,3,8,'2018-08-08 16:47:47','2018-08-08 16:47:47'),(4146,1,27,3,1,3,9,'2018-08-08 16:47:48','2018-08-08 16:47:48'),(4147,1,27,3,1,2,5,'2018-08-08 16:47:49','2018-08-08 16:47:49'),(4148,1,28,1,1,3,8,'2018-08-08 16:47:55','2018-08-08 16:47:55'),(4149,1,28,1,1,3,9,'2018-08-08 16:47:57','2018-08-08 16:47:57'),(4150,1,28,1,1,2,5,'2018-08-08 16:47:59','2018-08-08 16:47:59'),(4151,1,29,1,1,3,8,'2018-08-08 16:48:10','2018-08-08 16:48:10'),(4152,1,29,1,1,3,9,'2018-08-08 16:48:12','2018-08-08 16:48:12'),(4153,1,29,1,1,2,5,'2018-08-08 16:48:13','2018-08-08 16:48:13'),(4154,1,30,1,1,2,5,'2018-08-08 16:55:51','2018-08-08 16:55:51'),(4155,1,30,1,1,3,9,'2018-08-08 16:55:51','2018-08-08 16:55:51'),(4156,1,30,1,1,3,8,'2018-08-08 16:55:51','2018-08-08 16:55:51'),(4157,1,31,1,1,3,8,'2018-08-08 16:56:55','2018-08-08 16:56:55'),(4158,1,31,1,1,3,9,'2018-08-08 16:56:55','2018-08-08 16:56:55'),(4159,1,31,1,1,2,5,'2018-08-08 16:56:55','2018-08-08 16:56:55'),(4160,1,27,3,1,1,1,'2018-08-08 17:02:46','2018-08-08 17:02:46'),(4161,1,32,1,1,3,8,'2018-08-08 17:03:41','2018-08-08 17:03:41'),(4162,1,32,1,1,3,9,'2018-08-08 17:03:41','2018-08-08 17:03:41'),(4163,1,32,1,1,2,5,'2018-08-08 17:03:41','2018-08-08 17:03:41'),(4164,1,33,1,1,3,9,'2018-08-08 17:04:10','2018-08-08 17:04:10'),(4165,1,33,1,1,2,5,'2018-08-08 17:04:10','2018-08-08 17:04:10'),(4166,1,33,1,1,3,8,'2018-08-08 17:04:10','2018-08-08 17:04:10'),(4167,1,34,1,1,2,5,'2018-08-08 17:04:32','2018-08-08 17:04:32'),(4168,1,34,1,1,3,8,'2018-08-08 17:04:32','2018-08-08 17:04:32'),(4169,1,34,1,1,3,9,'2018-08-08 17:04:32','2018-08-08 17:04:32'),(4170,1,35,1,1,3,8,'2018-08-08 17:04:51','2018-08-08 17:04:51'),(4171,1,35,1,1,2,5,'2018-08-08 17:04:51','2018-08-08 17:04:51'),(4172,1,35,1,1,3,9,'2018-08-08 17:04:51','2018-08-08 17:04:51'),(4173,1,36,1,1,2,5,'2018-08-08 17:05:25','2018-08-08 17:05:25'),(4174,1,36,1,1,3,9,'2018-08-08 17:05:25','2018-08-08 17:05:25'),(4175,1,36,1,1,3,8,'2018-08-08 17:05:25','2018-08-08 17:05:25'),(4176,1,37,1,1,3,9,'2018-08-08 17:09:11','2018-08-08 17:09:11'),(4177,1,37,1,1,3,8,'2018-08-08 17:09:11','2018-08-08 17:09:11'),(4178,1,37,1,1,2,5,'2018-08-08 17:09:11','2018-08-08 17:09:11'),(4179,1,38,1,1,2,5,'2018-08-08 17:09:18','2018-08-08 17:09:18'),(4180,1,38,1,1,3,8,'2018-08-08 17:09:18','2018-08-08 17:09:18'),(4181,1,38,1,1,3,9,'2018-08-08 17:09:18','2018-08-08 17:09:18'),(4182,1,39,1,1,2,5,'2018-08-08 17:09:27','2018-08-08 17:09:27'),(4183,1,39,1,1,3,8,'2018-08-08 17:09:27','2018-08-08 17:09:27'),(4184,1,39,1,1,3,9,'2018-08-08 17:09:27','2018-08-08 17:09:27'),(4185,1,40,1,1,2,5,'2018-08-08 17:09:32','2018-08-08 17:09:32'),(4186,1,40,1,1,3,9,'2018-08-08 17:09:32','2018-08-08 17:09:32'),(4187,1,40,1,1,3,8,'2018-08-08 17:09:32','2018-08-08 17:09:32'),(4188,1,41,1,1,2,5,'2018-08-08 17:09:37','2018-08-08 17:09:37'),(4189,1,41,1,1,3,9,'2018-08-08 17:09:37','2018-08-08 17:09:37'),(4190,1,41,1,1,3,8,'2018-08-08 17:09:37','2018-08-08 17:09:37'),(4191,1,42,1,1,2,5,'2018-08-08 17:09:41','2018-08-08 17:09:41'),(4192,1,42,1,1,3,8,'2018-08-08 17:09:41','2018-08-08 17:09:41'),(4193,1,42,1,1,3,9,'2018-08-08 17:09:41','2018-08-08 17:09:41'),(4194,1,43,1,1,2,5,'2018-08-08 17:09:45','2018-08-08 17:09:45'),(4195,1,43,1,1,3,8,'2018-08-08 17:09:45','2018-08-08 17:09:45'),(4197,1,44,1,1,2,5,'2018-08-08 17:09:49','2018-08-08 17:09:49'),(4198,1,44,1,1,3,9,'2018-08-08 17:09:49','2018-08-08 17:09:49'),(4199,1,44,1,1,3,8,'2018-08-08 17:09:49','2018-08-08 17:09:49'),(4200,1,45,1,1,2,5,'2018-08-08 17:09:54','2018-08-08 17:09:54'),(4201,1,45,1,1,3,8,'2018-08-08 17:09:54','2018-08-08 17:09:54'),(4202,1,45,1,1,3,9,'2018-08-08 17:09:54','2018-08-08 17:09:54'),(4203,1,46,1,1,2,5,'2018-08-08 17:09:58','2018-08-08 17:09:58'),(4204,1,46,1,1,3,8,'2018-08-08 17:09:58','2018-08-08 17:09:58'),(4205,1,46,1,1,3,9,'2018-08-08 17:09:58','2018-08-08 17:09:58'),(4206,1,47,1,1,2,5,'2018-08-08 17:10:02','2018-08-08 17:10:02'),(4207,1,47,1,1,3,8,'2018-08-08 17:10:02','2018-08-08 17:10:02'),(4208,1,47,1,1,3,9,'2018-08-08 17:10:02','2018-08-08 17:10:02'),(4209,1,48,1,1,2,5,'2018-08-08 17:10:05','2018-08-08 17:10:05'),(4210,1,48,1,1,3,9,'2018-08-08 17:10:05','2018-08-08 17:10:05'),(4211,1,48,1,1,3,8,'2018-08-08 17:10:05','2018-08-08 17:10:05'),(4212,1,49,1,1,2,5,'2018-08-08 17:10:09','2018-08-08 17:10:09'),(4213,1,49,1,1,3,9,'2018-08-08 17:10:09','2018-08-08 17:10:09'),(4214,1,49,1,1,3,8,'2018-08-08 17:10:09','2018-08-08 17:10:09'),(4215,1,50,1,1,2,5,'2018-08-08 17:10:13','2018-08-08 17:10:13'),(4216,1,50,1,1,3,8,'2018-08-08 17:10:13','2018-08-08 17:10:13'),(4217,1,50,1,1,3,9,'2018-08-08 17:10:13','2018-08-08 17:10:13'),(4218,1,51,1,1,2,5,'2018-08-08 17:10:18','2018-08-08 17:10:18'),(4219,1,51,1,1,3,9,'2018-08-08 17:10:18','2018-08-08 17:10:18'),(4220,1,51,1,1,3,8,'2018-08-08 17:10:18','2018-08-08 17:10:18'),(4221,1,52,2,1,1,1,'2018-08-08 17:10:22','2018-08-08 17:10:22'),(4222,1,52,2,1,2,5,'2018-08-08 17:10:22','2018-08-08 17:10:22'),(4223,1,52,2,1,3,9,'2018-08-08 17:10:22','2018-08-08 17:10:22'),(4224,1,52,2,1,3,8,'2018-08-08 17:10:22','2018-08-08 17:10:22'),(4225,1,53,2,1,3,8,'2018-08-08 17:10:25','2018-08-08 17:10:25'),(4226,1,53,2,1,1,1,'2018-08-08 17:10:25','2018-08-08 17:10:25'),(4227,1,53,2,1,2,5,'2018-08-08 17:10:26','2018-08-08 17:10:26'),(4228,1,53,2,1,3,9,'2018-08-08 17:10:26','2018-08-08 17:10:26'),(4229,1,54,2,1,3,8,'2018-08-08 17:10:29','2018-08-08 17:10:29'),(4230,1,54,2,1,1,1,'2018-08-08 17:10:29','2018-08-08 17:10:29'),(4231,1,54,2,1,2,5,'2018-08-08 17:10:29','2018-08-08 17:10:29'),(4232,1,54,2,1,3,9,'2018-08-08 17:10:29','2018-08-08 17:10:29'),(4233,1,55,1,1,2,5,'2018-08-08 17:10:33','2018-08-08 17:10:33'),(4234,1,55,1,1,3,9,'2018-08-08 17:10:33','2018-08-08 17:10:33'),(4235,1,55,1,1,3,8,'2018-08-08 17:10:33','2018-08-08 17:10:33'),(4236,1,56,1,1,2,5,'2018-08-08 17:10:37','2018-08-08 17:10:37'),(4237,1,56,1,1,3,9,'2018-08-08 17:10:37','2018-08-08 17:10:37'),(4238,1,56,1,1,3,8,'2018-08-08 17:10:37','2018-08-08 17:10:37'),(4239,1,57,2,1,1,1,'2018-08-08 17:10:41','2018-08-08 17:10:41'),(4240,1,57,2,1,2,5,'2018-08-08 17:10:41','2018-08-08 17:10:41'),(4241,1,57,2,1,3,8,'2018-08-08 17:10:41','2018-08-08 17:10:41'),(4242,1,57,2,1,3,9,'2018-08-08 17:10:41','2018-08-08 17:10:41'),(4243,1,58,2,1,1,1,'2018-08-08 17:10:45','2018-08-08 17:10:45'),(4244,1,58,2,1,2,5,'2018-08-08 17:10:45','2018-08-08 17:10:45'),(4245,1,58,2,1,3,9,'2018-08-08 17:10:45','2018-08-08 17:10:45'),(4246,1,58,2,1,3,8,'2018-08-08 17:10:45','2018-08-08 17:10:45'),(4247,1,59,2,1,1,1,'2018-08-08 17:10:49','2018-08-08 17:10:49'),(4248,1,59,2,1,2,5,'2018-08-08 17:10:49','2018-08-08 17:10:49'),(4249,1,59,2,1,3,9,'2018-08-08 17:10:49','2018-08-08 17:10:49'),(4250,1,59,2,1,3,8,'2018-08-08 17:10:49','2018-08-08 17:10:49'),(4251,1,60,2,1,2,5,'2018-08-08 17:10:53','2018-08-08 17:10:53'),(4252,1,60,2,1,3,8,'2018-08-08 17:10:53','2018-08-08 17:10:53'),(4253,1,60,2,1,3,9,'2018-08-08 17:10:53','2018-08-08 17:10:53'),(4254,1,60,2,1,1,1,'2018-08-08 17:10:53','2018-08-08 17:10:53'),(4255,1,61,2,1,3,8,'2018-08-08 17:10:57','2018-08-08 17:10:57'),(4256,1,61,2,1,2,5,'2018-08-08 17:10:57','2018-08-08 17:10:57'),(4257,1,61,2,1,3,9,'2018-08-08 17:10:57','2018-08-08 17:10:57'),(4258,1,61,2,1,1,1,'2018-08-08 17:10:57','2018-08-08 17:10:57'),(4259,1,62,2,1,1,1,'2018-08-08 17:11:01','2018-08-08 17:11:01'),(4260,1,62,2,1,2,5,'2018-08-08 17:11:01','2018-08-08 17:11:01'),(4261,1,62,2,1,3,9,'2018-08-08 17:11:01','2018-08-08 17:11:01'),(4262,1,62,2,1,3,8,'2018-08-08 17:11:01','2018-08-08 17:11:01'),(4263,1,63,2,1,1,1,'2018-08-08 17:11:05','2018-08-08 17:11:05'),(4264,1,63,2,1,2,5,'2018-08-08 17:11:05','2018-08-08 17:11:05'),(4265,1,63,2,1,3,9,'2018-08-08 17:11:05','2018-08-08 17:11:05'),(4266,1,63,2,1,3,8,'2018-08-08 17:11:05','2018-08-08 17:11:05'),(4267,1,64,2,1,2,5,'2018-08-08 17:11:08','2018-08-08 17:11:08'),(4268,1,64,2,1,1,1,'2018-08-08 17:11:08','2018-08-08 17:11:08'),(4269,1,64,2,1,3,8,'2018-08-08 17:11:08','2018-08-08 17:11:08'),(4270,1,64,2,1,3,9,'2018-08-08 17:11:08','2018-08-08 17:11:08'),(4271,1,65,1,1,2,5,'2018-08-08 17:11:12','2018-08-08 17:11:12'),(4272,1,65,1,1,3,8,'2018-08-08 17:11:12','2018-08-08 17:11:12'),(4273,1,65,1,1,3,9,'2018-08-08 17:11:12','2018-08-08 17:11:12'),(4274,1,66,1,1,2,5,'2018-08-08 17:11:16','2018-08-08 17:11:16'),(4275,1,66,1,1,3,8,'2018-08-08 17:11:16','2018-08-08 17:11:16'),(4276,1,66,1,1,3,9,'2018-08-08 17:11:16','2018-08-08 17:11:16'),(4277,1,67,1,1,2,5,'2018-08-08 17:11:20','2018-08-08 17:11:20'),(4278,1,67,1,1,3,9,'2018-08-08 17:11:20','2018-08-08 17:11:20'),(4279,1,67,1,1,3,8,'2018-08-08 17:11:20','2018-08-08 17:11:20'),(4280,1,68,1,1,2,5,'2018-08-08 17:11:24','2018-08-08 17:11:24'),(4281,1,68,1,1,3,8,'2018-08-08 17:11:24','2018-08-08 17:11:24'),(4282,1,68,1,1,3,9,'2018-08-08 17:11:24','2018-08-08 17:11:24'),(4283,1,69,1,1,2,5,'2018-08-08 17:11:27','2018-08-08 17:11:27'),(4284,1,69,1,1,3,9,'2018-08-08 17:11:27','2018-08-08 17:11:27'),(4285,1,69,1,1,3,8,'2018-08-08 17:11:27','2018-08-08 17:11:27'),(4286,1,70,1,1,2,5,'2018-08-08 17:11:31','2018-08-08 17:11:31'),(4287,1,70,1,1,3,8,'2018-08-08 17:11:31','2018-08-08 17:11:31'),(4288,1,70,1,1,3,9,'2018-08-08 17:11:31','2018-08-08 17:11:31'),(4289,1,71,1,1,2,5,'2018-08-08 17:11:34','2018-08-08 17:11:34'),(4290,1,71,1,1,3,8,'2018-08-08 17:11:34','2018-08-08 17:11:34'),(4291,1,71,1,1,3,9,'2018-08-08 17:11:34','2018-08-08 17:11:34'),(4292,1,72,3,1,2,5,'2018-08-08 17:11:38','2018-08-08 17:11:38'),(4293,1,72,3,1,1,1,'2018-08-08 17:11:38','2018-08-08 17:11:38'),(4294,1,72,3,1,3,8,'2018-08-08 17:11:38','2018-08-08 17:11:38'),(4295,1,72,3,1,3,9,'2018-08-08 17:11:38','2018-08-08 17:11:38'),(4296,1,73,3,1,3,8,'2018-08-08 17:11:42','2018-08-08 17:11:42'),(4297,1,73,3,1,3,9,'2018-08-08 17:11:42','2018-08-08 17:11:42'),(4298,1,73,3,1,2,5,'2018-08-08 17:11:42','2018-08-08 17:11:42'),(4299,1,73,3,1,1,1,'2018-08-08 17:11:42','2018-08-08 17:11:42'),(4300,1,74,3,1,1,1,'2018-08-08 17:11:58','2018-08-08 17:11:58'),(4301,1,74,3,1,2,5,'2018-08-08 17:11:58','2018-08-08 17:11:58'),(4302,1,74,3,1,3,8,'2018-08-08 17:11:58','2018-08-08 17:11:58'),(4303,1,74,3,1,3,9,'2018-08-08 17:11:58','2018-08-08 17:11:58'),(4304,1,75,3,1,1,1,'2018-08-08 17:12:32','2018-08-08 17:12:32'),(4305,1,75,3,1,2,5,'2018-08-08 17:12:32','2018-08-08 17:12:32'),(4306,1,75,3,1,3,8,'2018-08-08 17:12:32','2018-08-08 17:12:32'),(4307,1,75,3,1,3,9,'2018-08-08 17:12:32','2018-08-08 17:12:32'),(4308,1,76,3,1,1,1,'2018-08-08 17:14:11','2018-08-08 17:14:11'),(4310,1,76,3,1,3,8,'2018-08-08 17:14:11','2018-08-08 17:14:11'),(4311,1,76,3,1,3,9,'2018-08-08 17:14:11','2018-08-08 17:14:11'),(4315,1,78,1,1,2,5,'2018-08-08 17:14:18','2018-08-08 17:14:18'),(4316,1,78,1,1,3,8,'2018-08-08 17:14:18','2018-08-08 17:14:18'),(4321,1,76,3,1,2,5,'2018-08-08 17:26:36','2018-08-08 17:26:36'),(4322,1,77,1,1,2,5,'2018-08-08 17:26:59','2018-08-08 17:26:59'),(4323,1,77,1,1,3,8,'2018-08-08 17:27:00','2018-08-08 17:27:00'),(4324,1,77,1,1,3,9,'2018-08-08 17:27:01','2018-08-08 17:27:01'),(4332,1,79,1,1,2,5,'2018-08-08 17:30:09','2018-08-08 17:30:09'),(4333,1,79,1,1,3,9,'2018-08-08 17:30:09','2018-08-08 17:30:09'),(4334,1,79,1,1,3,8,'2018-08-08 17:30:09','2018-08-08 17:30:09'),(4335,1,80,1,1,2,5,'2018-08-08 17:30:48','2018-08-08 17:30:48'),(4336,1,80,1,1,3,8,'2018-08-08 17:30:48','2018-08-08 17:30:48'),(4338,1,81,1,1,2,5,'2018-08-08 17:32:56','2018-08-08 17:32:56'),(4339,1,81,1,1,3,8,'2018-08-08 17:32:56','2018-08-08 17:32:56'),(4340,1,81,1,1,3,9,'2018-08-08 17:32:56','2018-08-08 17:32:56'),(4341,1,82,1,1,2,5,'2018-08-08 17:33:11','2018-08-08 17:33:11'),(4342,1,82,1,1,3,8,'2018-08-08 17:33:11','2018-08-08 17:33:11'),(4343,1,82,1,1,3,9,'2018-08-08 17:33:11','2018-08-08 17:33:11'),(4344,1,83,1,1,2,5,'2018-08-08 17:33:17','2018-08-08 17:33:17'),(4345,1,83,1,1,3,8,'2018-08-08 17:33:17','2018-08-08 17:33:17'),(4346,1,83,1,1,3,9,'2018-08-08 17:33:17','2018-08-08 17:33:17'),(4347,1,84,1,1,2,5,'2018-08-08 17:33:25','2018-08-08 17:33:25'),(4348,1,84,1,1,3,8,'2018-08-08 17:33:25','2018-08-08 17:33:25'),(4349,1,84,1,1,3,9,'2018-08-08 17:33:25','2018-08-08 17:33:25'),(4350,1,85,1,1,3,8,'2018-08-08 17:34:16','2018-08-08 17:34:16'),(4351,1,85,1,1,2,5,'2018-08-08 17:34:16','2018-08-08 17:34:16'),(4352,1,85,1,1,3,9,'2018-08-08 17:34:16','2018-08-08 17:34:16'),(4353,1,86,1,1,2,5,'2018-08-08 17:34:22','2018-08-08 17:34:22'),(4354,1,86,1,1,3,8,'2018-08-08 17:34:22','2018-08-08 17:34:22'),(4355,1,86,1,1,3,9,'2018-08-08 17:34:22','2018-08-08 17:34:22'),(4356,1,87,1,1,3,8,'2018-08-08 17:34:28','2018-08-08 17:34:28'),(4357,1,87,1,1,2,5,'2018-08-08 17:34:28','2018-08-08 17:34:28'),(4358,1,87,1,1,3,9,'2018-08-08 17:34:28','2018-08-08 17:34:28'),(4359,1,88,1,1,2,5,'2018-08-08 17:34:33','2018-08-08 17:34:33'),(4360,1,88,1,1,3,8,'2018-08-08 17:34:33','2018-08-08 17:34:33'),(4361,1,88,1,1,3,9,'2018-08-08 17:34:33','2018-08-08 17:34:33'),(4362,1,89,1,1,2,5,'2018-08-08 17:34:37','2018-08-08 17:34:37'),(4363,1,89,1,1,3,8,'2018-08-08 17:34:37','2018-08-08 17:34:37'),(4364,1,89,1,1,3,9,'2018-08-08 17:34:37','2018-08-08 17:34:37'),(4365,1,90,1,1,2,5,'2018-08-08 17:34:41','2018-08-08 17:34:41'),(4366,1,90,1,1,3,8,'2018-08-08 17:34:41','2018-08-08 17:34:41'),(4367,1,90,1,1,3,9,'2018-08-08 17:34:41','2018-08-08 17:34:41'),(4368,1,91,1,1,2,5,'2018-08-08 17:34:45','2018-08-08 17:34:45'),(4369,1,91,1,1,3,8,'2018-08-08 17:34:45','2018-08-08 17:34:45'),(4370,1,91,1,1,3,9,'2018-08-08 17:34:45','2018-08-08 17:34:45'),(4371,1,92,1,1,2,5,'2018-08-08 17:34:54','2018-08-08 17:34:54'),(4372,1,92,1,1,3,8,'2018-08-08 17:34:54','2018-08-08 17:34:54'),(4373,1,92,1,1,3,9,'2018-08-08 17:34:54','2018-08-08 17:34:54'),(4374,1,93,1,1,3,9,'2018-08-08 17:35:00','2018-08-08 17:35:00'),(4375,1,93,1,1,2,5,'2018-08-08 17:35:00','2018-08-08 17:35:00'),(4376,1,93,1,1,3,8,'2018-08-08 17:35:00','2018-08-08 17:35:00'),(4377,1,94,1,1,2,5,'2018-08-08 17:35:05','2018-08-08 17:35:05'),(4378,1,94,1,1,3,9,'2018-08-08 17:35:05','2018-08-08 17:35:05'),(4379,1,94,1,1,3,8,'2018-08-08 17:35:05','2018-08-08 17:35:05'),(4380,1,95,1,1,2,5,'2018-08-08 17:36:34','2018-08-08 17:36:34'),(4381,1,95,1,1,3,8,'2018-08-08 17:36:34','2018-08-08 17:36:34'),(4382,1,95,1,1,3,9,'2018-08-08 17:36:34','2018-08-08 17:36:34'),(4383,1,96,1,1,2,5,'2018-08-08 17:36:52','2018-08-08 17:36:52'),(4384,1,96,1,1,3,8,'2018-08-08 17:36:52','2018-08-08 17:36:52'),(4385,1,96,1,1,3,9,'2018-08-08 17:36:52','2018-08-08 17:36:52'),(4386,1,97,1,1,2,5,'2018-08-08 17:37:05','2018-08-08 17:37:05'),(4387,1,97,1,1,3,8,'2018-08-08 17:37:05','2018-08-08 17:37:05'),(4388,1,97,1,1,3,9,'2018-08-08 17:37:05','2018-08-08 17:37:05'),(4389,1,98,1,1,2,5,'2018-08-08 17:37:10','2018-08-08 17:37:10'),(4390,1,98,1,1,3,8,'2018-08-08 17:37:10','2018-08-08 17:37:10'),(4391,1,98,1,1,3,9,'2018-08-08 17:37:10','2018-08-08 17:37:10'),(4392,1,99,1,1,2,5,'2018-08-08 17:38:25','2018-08-08 17:38:25'),(4393,1,99,1,1,3,8,'2018-08-08 17:38:26','2018-08-08 17:38:26'),(4394,1,99,1,1,3,9,'2018-08-08 17:38:26','2018-08-08 17:38:26'),(4395,1,100,1,1,2,5,'2018-08-08 17:38:37','2018-08-08 17:38:37'),(4396,1,100,1,1,3,9,'2018-08-08 17:38:37','2018-08-08 17:38:37'),(4397,1,100,1,1,3,8,'2018-08-08 17:38:37','2018-08-08 17:38:37'),(4398,1,101,1,1,2,5,'2018-08-08 17:38:41','2018-08-08 17:38:41'),(4399,1,101,1,1,3,9,'2018-08-08 17:38:41','2018-08-08 17:38:41'),(4400,1,101,1,1,3,8,'2018-08-08 17:38:41','2018-08-08 17:38:41'),(4401,1,102,1,1,2,5,'2018-08-08 17:39:00','2018-08-08 17:39:00'),(4402,1,102,1,1,3,8,'2018-08-08 17:39:00','2018-08-08 17:39:00'),(4403,1,102,1,1,3,9,'2018-08-08 17:39:00','2018-08-08 17:39:00'),(4404,1,103,1,1,2,5,'2018-08-08 17:39:06','2018-08-08 17:39:06'),(4405,1,103,1,1,3,8,'2018-08-08 17:39:06','2018-08-08 17:39:06'),(4406,1,103,1,1,3,9,'2018-08-08 17:39:06','2018-08-08 17:39:06'),(4407,1,104,1,1,2,5,'2018-08-08 17:39:30','2018-08-08 17:39:30'),(4408,1,104,1,1,3,8,'2018-08-08 17:39:30','2018-08-08 17:39:30'),(4409,1,104,1,1,3,9,'2018-08-08 17:39:30','2018-08-08 17:39:30'),(4410,1,105,1,1,2,5,'2018-08-08 17:39:42','2018-08-08 17:39:42'),(4411,1,105,1,1,3,8,'2018-08-08 17:39:42','2018-08-08 17:39:42'),(4412,1,105,1,1,3,9,'2018-08-08 17:39:42','2018-08-08 17:39:42'),(4413,1,106,1,1,2,5,'2018-08-08 17:39:50','2018-08-08 17:39:50'),(4414,1,106,1,1,3,8,'2018-08-08 17:39:50','2018-08-08 17:39:50'),(4415,1,106,1,1,3,9,'2018-08-08 17:39:50','2018-08-08 17:39:50'),(4416,1,107,1,1,2,5,'2018-08-08 17:39:56','2018-08-08 17:39:56'),(4417,1,107,1,1,3,8,'2018-08-08 17:39:56','2018-08-08 17:39:56'),(4418,1,107,1,1,3,9,'2018-08-08 17:39:56','2018-08-08 17:39:56'),(4419,1,108,1,1,2,5,'2018-08-08 17:40:20','2018-08-08 17:40:20'),(4420,1,108,1,1,3,8,'2018-08-08 17:40:20','2018-08-08 17:40:20'),(4421,1,108,1,1,3,9,'2018-08-08 17:40:20','2018-08-08 17:40:20'),(4422,1,109,1,1,2,5,'2018-08-08 17:40:28','2018-08-08 17:40:28'),(4423,1,109,1,1,3,8,'2018-08-08 17:40:28','2018-08-08 17:40:28'),(4424,1,109,1,1,3,9,'2018-08-08 17:40:28','2018-08-08 17:40:28'),(4425,1,110,1,1,2,5,'2018-08-08 17:40:32','2018-08-08 17:40:32'),(4426,1,110,1,1,3,8,'2018-08-08 17:40:32','2018-08-08 17:40:32'),(4427,1,110,1,1,3,9,'2018-08-08 17:40:32','2018-08-08 17:40:32'),(4428,1,111,1,1,2,5,'2018-08-08 17:40:36','2018-08-08 17:40:36'),(4429,1,111,1,1,3,8,'2018-08-08 17:40:36','2018-08-08 17:40:36'),(4430,1,111,1,1,3,9,'2018-08-08 17:40:36','2018-08-08 17:40:36'),(4431,1,112,1,1,2,5,'2018-08-08 17:40:40','2018-08-08 17:40:40'),(4432,1,112,1,1,3,8,'2018-08-08 17:40:40','2018-08-08 17:40:40'),(4433,1,112,1,1,3,9,'2018-08-08 17:40:40','2018-08-08 17:40:40'),(4434,1,113,1,1,2,5,'2018-08-08 17:41:08','2018-08-08 17:41:08'),(4435,1,113,1,1,3,8,'2018-08-08 17:41:08','2018-08-08 17:41:08'),(4436,1,113,1,1,3,9,'2018-08-08 17:41:08','2018-08-08 17:41:08'),(4437,1,114,1,1,2,5,'2018-08-08 17:41:26','2018-08-08 17:41:26'),(4438,1,114,1,1,3,8,'2018-08-08 17:41:26','2018-08-08 17:41:26'),(4439,1,114,1,1,3,9,'2018-08-08 17:41:26','2018-08-08 17:41:26'),(4440,1,261,4,1,1,1,'2018-08-08 17:41:35','2018-08-08 17:41:35'),(4441,1,260,4,1,1,1,'2018-08-08 17:41:39','2018-08-08 17:41:39'),(4442,1,259,4,1,1,1,'2018-08-08 17:41:49','2018-08-08 17:41:49'),(4443,1,258,4,1,1,1,'2018-08-08 17:41:54','2018-08-08 17:41:54'),(4444,1,258,4,1,2,5,'2018-08-08 17:41:54','2018-08-08 17:41:54'),(4445,1,258,4,1,3,8,'2018-08-08 17:41:54','2018-08-08 17:41:54'),(4446,1,258,4,1,3,9,'2018-08-08 17:41:54','2018-08-08 17:41:54'),(4447,1,257,4,1,1,1,'2018-08-08 17:41:58','2018-08-08 17:41:58'),(4448,1,257,4,1,2,5,'2018-08-08 17:41:58','2018-08-08 17:41:58'),(4449,1,257,4,1,3,8,'2018-08-08 17:41:58','2018-08-08 17:41:58'),(4450,1,257,4,1,3,9,'2018-08-08 17:41:58','2018-08-08 17:41:58'),(4451,1,256,4,1,1,1,'2018-08-08 17:42:03','2018-08-08 17:42:03'),(4452,1,256,4,1,2,5,'2018-08-08 17:42:03','2018-08-08 17:42:03'),(4453,1,256,4,1,3,8,'2018-08-08 17:42:03','2018-08-08 17:42:03'),(4454,1,256,4,1,3,9,'2018-08-08 17:42:03','2018-08-08 17:42:03'),(4455,1,255,4,1,1,1,'2018-08-08 17:42:46','2018-08-08 17:42:46'),(4456,1,255,4,1,2,5,'2018-08-08 17:42:46','2018-08-08 17:42:46'),(4457,1,255,4,1,3,8,'2018-08-08 17:42:46','2018-08-08 17:42:46'),(4458,1,255,4,1,3,9,'2018-08-08 17:42:47','2018-08-08 17:42:47'),(4459,1,254,4,1,1,1,'2018-08-08 17:43:04','2018-08-08 17:43:04'),(4460,1,254,4,1,2,5,'2018-08-08 17:43:04','2018-08-08 17:43:04'),(4461,1,254,4,1,3,9,'2018-08-08 17:43:04','2018-08-08 17:43:04'),(4462,1,254,4,1,3,8,'2018-08-08 17:43:04','2018-08-08 17:43:04'),(4463,1,253,4,1,1,1,'2018-08-08 17:43:19','2018-08-08 17:43:19'),(4464,1,253,4,1,2,5,'2018-08-08 17:43:19','2018-08-08 17:43:19'),(4465,1,253,4,1,3,8,'2018-08-08 17:43:19','2018-08-08 17:43:19'),(4466,1,253,4,1,3,9,'2018-08-08 17:43:19','2018-08-08 17:43:19'),(4467,1,252,4,1,1,1,'2018-08-08 17:43:33','2018-08-08 17:43:33'),(4468,1,252,4,1,2,5,'2018-08-08 17:43:33','2018-08-08 17:43:33'),(4469,1,252,4,1,3,8,'2018-08-08 17:43:33','2018-08-08 17:43:33'),(4470,1,252,4,1,3,9,'2018-08-08 17:43:33','2018-08-08 17:43:33'),(4471,1,251,4,1,1,1,'2018-08-08 17:43:43','2018-08-08 17:43:43'),(4472,1,251,4,1,2,5,'2018-08-08 17:43:43','2018-08-08 17:43:43'),(4473,1,251,4,1,3,8,'2018-08-08 17:43:43','2018-08-08 17:43:43'),(4474,1,251,4,1,3,9,'2018-08-08 17:43:43','2018-08-08 17:43:43'),(4475,1,250,4,1,1,1,'2018-08-08 17:43:57','2018-08-08 17:43:57'),(4476,1,250,4,1,2,5,'2018-08-08 17:43:57','2018-08-08 17:43:57'),(4477,1,250,4,1,3,8,'2018-08-08 17:43:57','2018-08-08 17:43:57'),(4478,1,250,4,1,3,9,'2018-08-08 17:43:57','2018-08-08 17:43:57'),(4479,1,249,4,1,1,1,'2018-08-08 17:44:10','2018-08-08 17:44:10'),(4480,1,249,4,1,2,5,'2018-08-08 17:44:10','2018-08-08 17:44:10'),(4481,1,249,4,1,3,8,'2018-08-08 17:44:10','2018-08-08 17:44:10'),(4482,1,249,4,1,3,9,'2018-08-08 17:44:10','2018-08-08 17:44:10'),(4483,1,248,4,1,1,1,'2018-08-08 17:44:23','2018-08-08 17:44:23'),(4484,1,248,4,1,2,5,'2018-08-08 17:44:23','2018-08-08 17:44:23'),(4485,1,248,4,1,3,8,'2018-08-08 17:44:23','2018-08-08 17:44:23'),(4486,1,248,4,1,3,9,'2018-08-08 17:44:23','2018-08-08 17:44:23'),(4487,1,247,4,1,1,1,'2018-08-08 17:44:33','2018-08-08 17:44:33'),(4488,1,247,4,1,2,5,'2018-08-08 17:44:33','2018-08-08 17:44:33'),(4489,1,247,4,1,3,8,'2018-08-08 17:44:33','2018-08-08 17:44:33'),(4490,1,247,4,1,3,9,'2018-08-08 17:44:33','2018-08-08 17:44:33'),(4491,1,246,4,1,1,1,'2018-08-08 17:44:46','2018-08-08 17:44:46'),(4492,1,246,4,1,2,5,'2018-08-08 17:44:46','2018-08-08 17:44:46'),(4493,1,246,4,1,3,8,'2018-08-08 17:44:46','2018-08-08 17:44:46'),(4494,1,246,4,1,3,9,'2018-08-08 17:44:46','2018-08-08 17:44:46'),(4495,1,245,4,1,1,1,'2018-08-08 17:46:26','2018-08-08 17:46:26'),(4496,1,245,4,1,2,5,'2018-08-08 17:46:26','2018-08-08 17:46:26'),(4497,1,245,4,1,3,8,'2018-08-08 17:46:26','2018-08-08 17:46:26'),(4498,1,245,4,1,3,9,'2018-08-08 17:46:26','2018-08-08 17:46:26'),(4499,1,244,4,1,1,1,'2018-08-08 17:47:02','2018-08-08 17:47:02'),(4500,1,244,4,1,2,5,'2018-08-08 17:47:02','2018-08-08 17:47:02'),(4501,1,244,4,1,3,8,'2018-08-08 17:47:02','2018-08-08 17:47:02'),(4502,1,244,4,1,3,9,'2018-08-08 17:47:02','2018-08-08 17:47:02'),(4503,1,243,4,1,1,1,'2018-08-08 17:47:15','2018-08-08 17:47:15'),(4504,1,243,4,1,2,5,'2018-08-08 17:47:15','2018-08-08 17:47:15'),(4505,1,243,4,1,3,8,'2018-08-08 17:47:15','2018-08-08 17:47:15'),(4506,1,243,4,1,3,9,'2018-08-08 17:47:15','2018-08-08 17:47:15'),(4507,1,242,4,1,1,1,'2018-08-08 17:50:25','2018-08-08 17:50:25'),(4508,1,242,4,1,2,5,'2018-08-08 17:50:25','2018-08-08 17:50:25'),(4509,1,242,4,1,3,8,'2018-08-08 17:50:25','2018-08-08 17:50:25'),(4510,1,242,4,1,3,9,'2018-08-08 17:50:25','2018-08-08 17:50:25'),(4511,1,241,4,1,1,1,'2018-08-08 17:50:50','2018-08-08 17:50:50'),(4512,1,241,4,1,2,5,'2018-08-08 17:50:50','2018-08-08 17:50:50'),(4513,1,241,4,1,3,8,'2018-08-08 17:50:50','2018-08-08 17:50:50'),(4514,1,241,4,1,3,9,'2018-08-08 17:50:50','2018-08-08 17:50:50'),(4515,1,240,4,1,1,1,'2018-08-08 17:51:13','2018-08-08 17:51:13'),(4516,1,240,4,1,2,5,'2018-08-08 17:51:13','2018-08-08 17:51:13'),(4517,1,240,4,1,3,8,'2018-08-08 17:51:13','2018-08-08 17:51:13'),(4518,1,240,4,1,3,9,'2018-08-08 17:51:13','2018-08-08 17:51:13'),(4519,1,239,4,1,1,1,'2018-08-08 17:51:23','2018-08-08 17:51:23'),(4520,1,239,4,1,2,5,'2018-08-08 17:51:23','2018-08-08 17:51:23'),(4521,1,239,4,1,3,8,'2018-08-08 17:51:23','2018-08-08 17:51:23'),(4522,1,239,4,1,3,9,'2018-08-08 17:51:23','2018-08-08 17:51:23'),(4523,1,238,4,1,1,1,'2018-08-08 17:51:36','2018-08-08 17:51:36'),(4524,1,238,4,1,2,5,'2018-08-08 17:51:36','2018-08-08 17:51:36'),(4525,1,238,4,1,3,8,'2018-08-08 17:51:36','2018-08-08 17:51:36'),(4526,1,238,4,1,3,9,'2018-08-08 17:51:36','2018-08-08 17:51:36'),(4527,1,237,4,1,1,1,'2018-08-08 17:52:01','2018-08-08 17:52:01'),(4528,1,237,4,1,2,5,'2018-08-08 17:52:02','2018-08-08 17:52:02'),(4529,1,237,4,1,3,8,'2018-08-08 17:52:02','2018-08-08 17:52:02'),(4530,1,237,4,1,3,9,'2018-08-08 17:52:02','2018-08-08 17:52:02'),(4531,1,236,4,1,1,1,'2018-08-08 17:53:06','2018-08-08 17:53:06'),(4532,1,236,4,1,2,5,'2018-08-08 17:53:06','2018-08-08 17:53:06'),(4533,1,236,4,1,3,8,'2018-08-08 17:53:06','2018-08-08 17:53:06'),(4534,1,236,4,1,3,9,'2018-08-08 17:53:06','2018-08-08 17:53:06'),(4535,1,235,4,1,1,1,'2018-08-08 17:54:37','2018-08-08 17:54:37'),(4536,1,235,4,1,3,8,'2018-08-08 17:54:37','2018-08-08 17:54:37'),(4537,1,235,4,1,2,5,'2018-08-08 17:54:37','2018-08-08 17:54:37'),(4538,1,235,4,1,3,9,'2018-08-08 17:54:37','2018-08-08 17:54:37'),(4539,1,234,4,1,1,1,'2018-08-08 17:55:05','2018-08-08 17:55:05'),(4540,1,234,4,1,2,5,'2018-08-08 17:55:05','2018-08-08 17:55:05'),(4541,1,234,4,1,3,8,'2018-08-08 17:55:05','2018-08-08 17:55:05'),(4542,1,234,4,1,3,9,'2018-08-08 17:55:05','2018-08-08 17:55:05'),(4543,1,233,4,1,2,5,'2018-08-08 17:55:19','2018-08-08 17:55:19'),(4544,1,233,4,1,3,8,'2018-08-08 17:55:19','2018-08-08 17:55:19'),(4545,1,233,4,1,1,1,'2018-08-08 17:55:19','2018-08-08 17:55:19'),(4546,1,233,4,1,3,9,'2018-08-08 17:55:19','2018-08-08 17:55:19'),(4547,1,232,4,1,1,1,'2018-08-08 17:55:28','2018-08-08 17:55:28'),(4548,1,232,4,1,3,8,'2018-08-08 17:55:28','2018-08-08 17:55:28'),(4549,1,232,4,1,2,5,'2018-08-08 17:55:28','2018-08-08 17:55:28'),(4550,1,232,4,1,3,9,'2018-08-08 17:55:28','2018-08-08 17:55:28'),(4551,1,231,4,1,1,1,'2018-08-08 17:55:40','2018-08-08 17:55:40'),(4552,1,231,4,1,2,5,'2018-08-08 17:55:43','2018-08-08 17:55:43'),(4553,1,231,4,1,3,9,'2018-08-08 17:55:44','2018-08-08 17:55:44'),(4554,1,231,4,1,3,8,'2018-08-08 17:55:45','2018-08-08 17:55:45'),(4555,1,230,4,1,1,1,'2018-08-08 17:55:52','2018-08-08 17:55:52'),(4556,1,230,4,1,2,5,'2018-08-08 17:55:53','2018-08-08 17:55:53'),(4557,1,230,4,1,3,8,'2018-08-08 17:55:55','2018-08-08 17:55:55'),(4558,1,230,4,1,3,9,'2018-08-08 17:55:56','2018-08-08 17:55:56'),(4559,1,229,4,1,1,1,'2018-08-08 17:58:17','2018-08-08 17:58:17'),(4560,1,229,4,1,3,8,'2018-08-08 17:58:17','2018-08-08 17:58:17'),(4561,1,229,4,1,2,5,'2018-08-08 17:58:17','2018-08-08 17:58:17'),(4562,1,229,4,1,3,9,'2018-08-08 17:58:17','2018-08-08 17:58:17'),(4563,1,228,4,1,3,8,'2018-08-08 17:58:21','2018-08-08 17:58:21'),(4564,1,228,4,1,1,1,'2018-08-08 17:58:21','2018-08-08 17:58:21'),(4565,1,228,4,1,2,5,'2018-08-08 17:58:21','2018-08-08 17:58:21'),(4566,1,228,4,1,3,9,'2018-08-08 17:58:21','2018-08-08 17:58:21'),(4567,1,227,4,1,2,5,'2018-08-08 17:58:24','2018-08-08 17:58:24'),(4568,1,227,4,1,1,1,'2018-08-08 17:58:24','2018-08-08 17:58:24'),(4569,1,227,4,1,3,9,'2018-08-08 17:58:24','2018-08-08 17:58:24'),(4570,1,227,4,1,3,8,'2018-08-08 17:58:24','2018-08-08 17:58:24'),(4571,1,226,1,1,2,5,'2018-08-08 17:58:26','2018-08-08 17:58:26'),(4572,1,226,1,1,3,8,'2018-08-08 17:58:26','2018-08-08 17:58:26'),(4573,1,226,1,1,3,9,'2018-08-08 17:58:26','2018-08-08 17:58:26'),(4574,1,225,3,1,2,5,'2018-08-08 17:58:29','2018-08-08 17:58:29'),(4575,1,225,3,1,1,1,'2018-08-08 17:58:29','2018-08-08 17:58:29'),(4576,1,225,3,1,3,8,'2018-08-08 17:58:29','2018-08-08 17:58:29'),(4577,1,225,3,1,3,9,'2018-08-08 17:58:29','2018-08-08 17:58:29'),(4578,1,224,3,1,1,1,'2018-08-08 17:58:32','2018-08-08 17:58:32'),(4579,1,224,3,1,2,5,'2018-08-08 17:58:32','2018-08-08 17:58:32'),(4580,1,224,3,1,3,8,'2018-08-08 17:58:32','2018-08-08 17:58:32'),(4581,1,224,3,1,3,9,'2018-08-08 17:58:32','2018-08-08 17:58:32'),(4582,1,223,3,1,2,5,'2018-08-08 17:58:35','2018-08-08 17:58:35'),(4583,1,223,3,1,1,1,'2018-08-08 17:58:35','2018-08-08 17:58:35'),(4584,1,223,3,1,3,8,'2018-08-08 17:58:35','2018-08-08 17:58:35'),(4585,1,223,3,1,3,9,'2018-08-08 17:58:35','2018-08-08 17:58:35'),(4586,1,222,3,1,1,1,'2018-08-08 17:58:37','2018-08-08 17:58:37'),(4587,1,222,3,1,2,5,'2018-08-08 17:58:37','2018-08-08 17:58:37'),(4588,1,222,3,1,3,9,'2018-08-08 17:58:37','2018-08-08 17:58:37'),(4589,1,222,3,1,3,8,'2018-08-08 17:58:37','2018-08-08 17:58:37'),(4590,1,221,3,1,1,1,'2018-08-08 17:58:40','2018-08-08 17:58:40'),(4591,1,221,3,1,2,5,'2018-08-08 17:58:40','2018-08-08 17:58:40'),(4592,1,221,3,1,3,9,'2018-08-08 17:58:40','2018-08-08 17:58:40'),(4593,1,221,3,1,3,8,'2018-08-08 17:58:40','2018-08-08 17:58:40'),(4594,1,220,3,1,1,1,'2018-08-08 17:58:42','2018-08-08 17:58:42'),(4595,1,220,3,1,2,5,'2018-08-08 17:58:42','2018-08-08 17:58:42'),(4596,1,220,3,1,3,9,'2018-08-08 17:58:42','2018-08-08 17:58:42'),(4597,1,220,3,1,3,8,'2018-08-08 17:58:42','2018-08-08 17:58:42'),(4598,1,219,3,1,1,1,'2018-08-08 17:58:50','2018-08-08 17:58:50'),(4599,1,219,3,1,2,5,'2018-08-08 17:58:50','2018-08-08 17:58:50'),(4600,1,219,3,1,3,9,'2018-08-08 17:58:50','2018-08-08 17:58:50'),(4601,1,219,3,1,3,8,'2018-08-08 17:58:50','2018-08-08 17:58:50'),(4602,1,218,3,1,1,1,'2018-08-08 17:58:52','2018-08-08 17:58:52'),(4603,1,218,3,1,2,5,'2018-08-08 17:58:52','2018-08-08 17:58:52'),(4604,1,218,3,1,3,8,'2018-08-08 17:58:52','2018-08-08 17:58:52'),(4605,1,218,3,1,3,9,'2018-08-08 17:58:52','2018-08-08 17:58:52'),(4606,1,217,3,1,1,1,'2018-08-08 17:58:54','2018-08-08 17:58:54'),(4607,1,217,3,1,3,9,'2018-08-08 17:58:54','2018-08-08 17:58:54'),(4608,1,217,3,1,2,5,'2018-08-08 17:58:54','2018-08-08 17:58:54'),(4609,1,217,3,1,3,8,'2018-08-08 17:58:54','2018-08-08 17:58:54'),(4610,1,216,3,1,1,1,'2018-08-08 17:58:57','2018-08-08 17:58:57'),(4611,1,216,3,1,2,5,'2018-08-08 17:58:57','2018-08-08 17:58:57'),(4612,1,216,3,1,3,8,'2018-08-08 17:58:57','2018-08-08 17:58:57'),(4613,1,216,3,1,3,9,'2018-08-08 17:58:57','2018-08-08 17:58:57'),(4614,1,215,3,1,1,1,'2018-08-08 17:59:05','2018-08-08 17:59:05'),(4615,1,215,3,1,2,5,'2018-08-08 17:59:05','2018-08-08 17:59:05'),(4616,1,215,3,1,3,8,'2018-08-08 17:59:05','2018-08-08 17:59:05'),(4617,1,215,3,1,3,9,'2018-08-08 17:59:05','2018-08-08 17:59:05'),(4618,1,214,3,1,1,1,'2018-08-08 17:59:08','2018-08-08 17:59:08'),(4619,1,214,3,1,3,8,'2018-08-08 17:59:08','2018-08-08 17:59:08'),(4620,1,214,3,1,2,5,'2018-08-08 17:59:08','2018-08-08 17:59:08'),(4621,1,214,3,1,3,9,'2018-08-08 17:59:08','2018-08-08 17:59:08'),(4622,1,213,3,1,2,5,'2018-08-08 17:59:11','2018-08-08 17:59:11'),(4623,1,213,3,1,1,1,'2018-08-08 17:59:11','2018-08-08 17:59:11'),(4624,1,213,3,1,3,9,'2018-08-08 17:59:11','2018-08-08 17:59:11'),(4625,1,213,3,1,3,8,'2018-08-08 17:59:11','2018-08-08 17:59:11'),(4626,1,212,3,1,1,1,'2018-08-08 17:59:13','2018-08-08 17:59:13'),(4627,1,212,3,1,2,5,'2018-08-08 17:59:13','2018-08-08 17:59:13'),(4628,1,212,3,1,3,8,'2018-08-08 17:59:13','2018-08-08 17:59:13'),(4629,1,212,3,1,3,9,'2018-08-08 17:59:13','2018-08-08 17:59:13'),(4630,1,211,3,1,1,1,'2018-08-08 17:59:15','2018-08-08 17:59:15'),(4631,1,211,3,1,2,5,'2018-08-08 17:59:15','2018-08-08 17:59:15'),(4632,1,211,3,1,3,8,'2018-08-08 17:59:15','2018-08-08 17:59:15'),(4633,1,211,3,1,3,9,'2018-08-08 17:59:15','2018-08-08 17:59:15'),(4634,1,210,3,1,1,1,'2018-08-08 17:59:18','2018-08-08 17:59:18'),(4635,1,210,3,1,3,9,'2018-08-08 17:59:18','2018-08-08 17:59:18'),(4636,1,210,3,1,2,5,'2018-08-08 17:59:18','2018-08-08 17:59:18'),(4637,1,210,3,1,3,8,'2018-08-08 17:59:18','2018-08-08 17:59:18'),(4638,1,209,3,1,1,1,'2018-08-08 17:59:21','2018-08-08 17:59:21'),(4639,1,209,3,1,3,8,'2018-08-08 17:59:21','2018-08-08 17:59:21'),(4640,1,209,3,1,3,9,'2018-08-08 17:59:21','2018-08-08 17:59:21'),(4641,1,209,3,1,2,5,'2018-08-08 17:59:21','2018-08-08 17:59:21'),(4642,1,208,3,1,1,1,'2018-08-08 17:59:24','2018-08-08 17:59:24'),(4643,1,208,3,1,3,8,'2018-08-08 17:59:24','2018-08-08 17:59:24'),(4644,1,208,3,1,2,5,'2018-08-08 17:59:24','2018-08-08 17:59:24'),(4645,1,208,3,1,3,9,'2018-08-08 17:59:24','2018-08-08 17:59:24'),(4646,1,207,3,1,3,8,'2018-08-08 17:59:27','2018-08-08 17:59:27'),(4647,1,207,3,1,2,5,'2018-08-08 17:59:27','2018-08-08 17:59:27'),(4648,1,207,3,1,1,1,'2018-08-08 17:59:27','2018-08-08 17:59:27'),(4649,1,207,3,1,3,9,'2018-08-08 17:59:27','2018-08-08 17:59:27'),(4650,1,206,3,1,1,1,'2018-08-08 17:59:30','2018-08-08 17:59:30'),(4651,1,206,3,1,3,8,'2018-08-08 17:59:30','2018-08-08 17:59:30'),(4652,1,206,3,1,2,5,'2018-08-08 17:59:30','2018-08-08 17:59:30'),(4653,1,206,3,1,3,9,'2018-08-08 17:59:30','2018-08-08 17:59:30'),(4654,1,205,3,1,1,1,'2018-08-08 17:59:33','2018-08-08 17:59:33'),(4655,1,205,3,1,2,5,'2018-08-08 17:59:33','2018-08-08 17:59:33'),(4656,1,205,3,1,3,8,'2018-08-08 17:59:33','2018-08-08 17:59:33'),(4657,1,205,3,1,3,9,'2018-08-08 17:59:33','2018-08-08 17:59:33'),(4658,1,204,3,1,1,1,'2018-08-08 17:59:36','2018-08-08 17:59:36'),(4659,1,204,3,1,3,8,'2018-08-08 17:59:36','2018-08-08 17:59:36'),(4660,1,204,3,1,2,5,'2018-08-08 17:59:36','2018-08-08 17:59:36'),(4661,1,204,3,1,3,9,'2018-08-08 17:59:36','2018-08-08 17:59:36'),(4662,1,203,3,1,1,1,'2018-08-08 17:59:43','2018-08-08 17:59:43'),(4663,1,203,3,1,2,5,'2018-08-08 17:59:43','2018-08-08 17:59:43'),(4664,1,203,3,1,3,9,'2018-08-08 17:59:43','2018-08-08 17:59:43'),(4665,1,203,3,1,3,8,'2018-08-08 17:59:43','2018-08-08 17:59:43'),(4666,1,202,3,1,1,1,'2018-08-08 17:59:46','2018-08-08 17:59:46'),(4667,1,202,3,1,2,5,'2018-08-08 17:59:46','2018-08-08 17:59:46'),(4668,1,202,3,1,3,8,'2018-08-08 17:59:46','2018-08-08 17:59:46'),(4669,1,202,3,1,3,9,'2018-08-08 17:59:46','2018-08-08 17:59:46'),(4670,1,201,3,1,1,1,'2018-08-08 17:59:48','2018-08-08 17:59:48'),(4671,1,201,3,1,2,5,'2018-08-08 17:59:48','2018-08-08 17:59:48'),(4672,1,201,3,1,3,8,'2018-08-08 17:59:48','2018-08-08 17:59:48'),(4673,1,201,3,1,3,9,'2018-08-08 17:59:48','2018-08-08 17:59:48'),(4674,1,200,3,1,1,1,'2018-08-08 17:59:52','2018-08-08 17:59:52'),(4675,1,200,3,1,2,5,'2018-08-08 17:59:52','2018-08-08 17:59:52'),(4676,1,200,3,1,3,9,'2018-08-08 17:59:52','2018-08-08 17:59:52'),(4677,1,200,3,1,3,8,'2018-08-08 17:59:52','2018-08-08 17:59:52'),(4678,1,199,3,1,2,5,'2018-08-08 17:59:55','2018-08-08 17:59:55'),(4679,1,199,3,1,1,1,'2018-08-08 17:59:55','2018-08-08 17:59:55'),(4680,1,199,3,1,3,8,'2018-08-08 17:59:55','2018-08-08 17:59:55'),(4681,1,199,3,1,3,9,'2018-08-08 17:59:55','2018-08-08 17:59:55'),(4682,1,198,3,1,1,1,'2018-08-08 17:59:58','2018-08-08 17:59:58'),(4683,1,198,3,1,2,5,'2018-08-08 17:59:58','2018-08-08 17:59:58'),(4684,1,198,3,1,3,8,'2018-08-08 17:59:58','2018-08-08 17:59:58'),(4685,1,198,3,1,3,9,'2018-08-08 17:59:58','2018-08-08 17:59:58'),(4686,1,197,3,1,1,1,'2018-08-08 18:00:00','2018-08-08 18:00:00'),(4687,1,197,3,1,3,8,'2018-08-08 18:00:00','2018-08-08 18:00:00'),(4688,1,197,3,1,2,5,'2018-08-08 18:00:00','2018-08-08 18:00:00'),(4689,1,197,3,1,3,9,'2018-08-08 18:00:00','2018-08-08 18:00:00'),(4690,1,196,3,1,1,1,'2018-08-08 18:00:04','2018-08-08 18:00:04'),(4691,1,196,3,1,3,9,'2018-08-08 18:00:04','2018-08-08 18:00:04'),(4692,1,196,3,1,2,5,'2018-08-08 18:00:04','2018-08-08 18:00:04'),(4693,1,196,3,1,3,8,'2018-08-08 18:00:04','2018-08-08 18:00:04'),(4694,1,195,3,1,1,1,'2018-08-08 18:00:07','2018-08-08 18:00:07'),(4695,1,195,3,1,3,8,'2018-08-08 18:00:07','2018-08-08 18:00:07'),(4696,1,195,3,1,2,5,'2018-08-08 18:00:07','2018-08-08 18:00:07'),(4697,1,195,3,1,3,9,'2018-08-08 18:00:07','2018-08-08 18:00:07'),(4698,1,194,3,1,1,1,'2018-08-08 18:00:10','2018-08-08 18:00:10'),(4699,1,193,3,1,1,1,'2018-08-08 18:00:13','2018-08-08 18:00:13'),(4700,1,192,3,1,1,1,'2018-08-08 18:00:46','2018-08-08 18:00:46'),(4701,1,191,3,1,1,1,'2018-08-08 18:00:49','2018-08-08 18:00:49'),(4702,1,190,3,1,1,1,'2018-08-08 18:00:52','2018-08-08 18:00:52'),(4703,1,189,3,1,1,1,'2018-08-08 18:00:54','2018-08-08 18:00:54'),(4704,1,188,3,1,1,1,'2018-08-08 18:00:58','2018-08-08 18:00:58'),(4705,1,187,3,1,1,1,'2018-08-08 18:01:01','2018-08-08 18:01:01'),(4706,1,186,3,1,1,1,'2018-08-08 18:01:04','2018-08-08 18:01:04'),(4707,1,185,3,1,1,1,'2018-08-08 18:01:07','2018-08-08 18:01:07'),(4708,1,184,3,1,1,1,'2018-08-08 18:01:09','2018-08-08 18:01:09'),(4709,1,183,3,1,1,1,'2018-08-08 18:01:12','2018-08-08 18:01:12'),(4710,1,182,3,1,1,1,'2018-08-08 18:01:15','2018-08-08 18:01:15'),(4711,1,181,3,1,1,1,'2018-08-08 18:01:17','2018-08-08 18:01:17'),(4712,1,180,3,1,1,1,'2018-08-08 18:01:21','2018-08-08 18:01:21'),(4713,1,179,3,1,1,1,'2018-08-08 18:01:26','2018-08-08 18:01:26'),(4714,1,178,3,1,1,1,'2018-08-08 18:01:29','2018-08-08 18:01:29'),(4715,1,177,3,1,1,1,'2018-08-08 18:01:31','2018-08-08 18:01:31'),(4716,1,176,2,1,1,1,'2018-08-08 18:01:34','2018-08-08 18:01:34'),(4717,1,175,2,1,1,1,'2018-08-08 18:01:37','2018-08-08 18:01:37'),(4718,1,174,2,1,1,1,'2018-08-08 18:01:42','2018-08-08 18:01:42'),(4719,1,173,2,1,1,1,'2018-08-08 18:01:44','2018-08-08 18:01:44'),(4720,1,172,2,1,1,1,'2018-08-08 18:01:49','2018-08-08 18:01:49'),(4721,1,171,2,1,1,1,'2018-08-08 18:01:53','2018-08-08 18:01:53'),(4722,1,170,2,1,1,1,'2018-08-08 18:01:56','2018-08-08 18:01:56'),(4723,1,169,2,1,1,1,'2018-08-08 18:01:59','2018-08-08 18:01:59'),(4724,1,168,2,1,1,1,'2018-08-08 18:02:02','2018-08-08 18:02:02'),(4725,1,167,2,1,1,1,'2018-08-08 18:02:04','2018-08-08 18:02:04'),(4726,1,166,2,1,1,1,'2018-08-08 18:02:06','2018-08-08 18:02:06'),(4727,1,165,2,1,1,1,'2018-08-08 18:02:09','2018-08-08 18:02:09'),(4728,1,164,2,1,1,1,'2018-08-08 18:02:12','2018-08-08 18:02:12'),(4729,1,163,2,1,1,1,'2018-08-08 18:02:14','2018-08-08 18:02:14'),(4730,1,162,2,1,1,1,'2018-08-08 18:02:21','2018-08-08 18:02:21'),(4731,1,161,2,1,1,1,'2018-08-08 18:02:24','2018-08-08 18:02:24'),(4732,1,161,2,1,3,8,'2018-08-08 18:02:24','2018-08-08 18:02:24'),(4733,1,161,2,1,3,9,'2018-08-08 18:02:24','2018-08-08 18:02:24'),(4734,1,161,2,1,2,5,'2018-08-08 18:02:24','2018-08-08 18:02:24'),(4735,1,160,2,1,1,1,'2018-08-08 18:02:27','2018-08-08 18:02:27'),(4736,1,160,2,1,3,9,'2018-08-08 18:02:27','2018-08-08 18:02:27'),(4737,1,160,2,1,3,8,'2018-08-08 18:02:27','2018-08-08 18:02:27'),(4738,1,160,2,1,2,5,'2018-08-08 18:02:27','2018-08-08 18:02:27'),(4739,1,159,2,1,1,1,'2018-08-08 18:02:29','2018-08-08 18:02:29'),(4740,1,159,2,1,3,9,'2018-08-08 18:02:29','2018-08-08 18:02:29'),(4741,1,159,2,1,2,5,'2018-08-08 18:02:29','2018-08-08 18:02:29'),(4742,1,159,2,1,3,8,'2018-08-08 18:02:29','2018-08-08 18:02:29'),(4743,1,158,2,1,1,1,'2018-08-08 18:02:32','2018-08-08 18:02:32'),(4744,1,158,2,1,3,8,'2018-08-08 18:02:32','2018-08-08 18:02:32'),(4745,1,158,2,1,2,5,'2018-08-08 18:02:32','2018-08-08 18:02:32'),(4746,1,158,2,1,3,9,'2018-08-08 18:02:32','2018-08-08 18:02:32'),(4747,1,157,2,1,1,1,'2018-08-08 18:02:35','2018-08-08 18:02:35'),(4748,1,157,2,1,2,5,'2018-08-08 18:02:35','2018-08-08 18:02:35'),(4749,1,157,2,1,3,8,'2018-08-08 18:02:35','2018-08-08 18:02:35'),(4750,1,157,2,1,3,9,'2018-08-08 18:02:35','2018-08-08 18:02:35'),(4751,1,156,2,1,1,1,'2018-08-08 18:02:37','2018-08-08 18:02:37'),(4752,1,156,2,1,2,5,'2018-08-08 18:02:37','2018-08-08 18:02:37'),(4753,1,156,2,1,3,8,'2018-08-08 18:02:37','2018-08-08 18:02:37'),(4754,1,156,2,1,3,9,'2018-08-08 18:02:37','2018-08-08 18:02:37'),(4755,1,155,1,1,2,5,'2018-08-08 18:02:40','2018-08-08 18:02:40'),(4756,1,155,1,1,3,8,'2018-08-08 18:02:40','2018-08-08 18:02:40'),(4757,1,155,1,1,3,9,'2018-08-08 18:02:40','2018-08-08 18:02:40'),(4758,1,154,1,1,3,8,'2018-08-08 18:02:43','2018-08-08 18:02:43'),(4759,1,154,1,1,2,5,'2018-08-08 18:02:43','2018-08-08 18:02:43'),(4760,1,154,1,1,3,9,'2018-08-08 18:02:43','2018-08-08 18:02:43'),(4761,1,153,1,1,2,5,'2018-08-08 18:02:46','2018-08-08 18:02:46'),(4762,1,153,1,1,3,8,'2018-08-08 18:02:46','2018-08-08 18:02:46'),(4763,1,153,1,1,3,9,'2018-08-08 18:02:46','2018-08-08 18:02:46'),(4764,1,152,1,1,3,8,'2018-08-08 18:02:48','2018-08-08 18:02:48'),(4765,1,152,1,1,2,5,'2018-08-08 18:02:48','2018-08-08 18:02:48'),(4766,1,152,1,1,3,9,'2018-08-08 18:02:48','2018-08-08 18:02:48'),(4767,1,151,1,1,2,5,'2018-08-08 18:02:51','2018-08-08 18:02:51'),(4768,1,151,1,1,3,8,'2018-08-08 18:02:51','2018-08-08 18:02:51'),(4769,1,151,1,1,3,9,'2018-08-08 18:02:51','2018-08-08 18:02:51'),(4770,1,150,1,1,3,8,'2018-08-08 18:02:54','2018-08-08 18:02:54'),(4771,1,150,1,1,2,5,'2018-08-08 18:02:54','2018-08-08 18:02:54'),(4772,1,150,1,1,3,9,'2018-08-08 18:02:54','2018-08-08 18:02:54'),(4773,1,149,1,1,2,5,'2018-08-08 18:02:57','2018-08-08 18:02:57'),(4774,1,149,1,1,3,8,'2018-08-08 18:02:57','2018-08-08 18:02:57'),(4775,1,149,1,1,3,9,'2018-08-08 18:02:57','2018-08-08 18:02:57'),(4776,1,148,1,1,2,5,'2018-08-08 18:03:00','2018-08-08 18:03:00'),(4777,1,148,1,1,3,8,'2018-08-08 18:03:00','2018-08-08 18:03:00'),(4778,1,148,1,1,3,9,'2018-08-08 18:03:00','2018-08-08 18:03:00'),(4779,1,147,1,1,2,5,'2018-08-08 18:03:03','2018-08-08 18:03:03'),(4780,1,147,1,1,3,8,'2018-08-08 18:03:03','2018-08-08 18:03:03'),(4781,1,147,1,1,3,9,'2018-08-08 18:03:03','2018-08-08 18:03:03'),(4782,1,146,1,1,2,5,'2018-08-08 18:03:06','2018-08-08 18:03:06'),(4783,1,146,1,1,3,8,'2018-08-08 18:03:06','2018-08-08 18:03:06'),(4784,1,146,1,1,3,9,'2018-08-08 18:03:06','2018-08-08 18:03:06'),(4785,1,145,1,1,2,5,'2018-08-08 18:03:09','2018-08-08 18:03:09'),(4786,1,145,1,1,3,8,'2018-08-08 18:03:09','2018-08-08 18:03:09'),(4787,1,145,1,1,3,9,'2018-08-08 18:03:09','2018-08-08 18:03:09'),(4788,1,144,1,1,3,8,'2018-08-08 18:03:12','2018-08-08 18:03:12'),(4789,1,144,1,1,2,5,'2018-08-08 18:03:12','2018-08-08 18:03:12'),(4790,1,144,1,1,3,9,'2018-08-08 18:03:12','2018-08-08 18:03:12'),(4791,1,143,1,1,2,5,'2018-08-08 18:03:15','2018-08-08 18:03:15'),(4792,1,143,1,1,3,8,'2018-08-08 18:03:15','2018-08-08 18:03:15'),(4793,1,143,1,1,3,9,'2018-08-08 18:03:15','2018-08-08 18:03:15'),(4794,1,142,1,1,2,5,'2018-08-08 18:03:17','2018-08-08 18:03:17'),(4795,1,142,1,1,3,9,'2018-08-08 18:03:17','2018-08-08 18:03:17'),(4796,1,142,1,1,3,8,'2018-08-08 18:03:17','2018-08-08 18:03:17'),(4797,1,141,1,1,2,5,'2018-08-08 18:03:20','2018-08-08 18:03:20'),(4798,1,141,1,1,3,8,'2018-08-08 18:03:20','2018-08-08 18:03:20'),(4799,1,141,1,1,3,9,'2018-08-08 18:03:20','2018-08-08 18:03:20'),(4800,1,140,1,1,2,5,'2018-08-08 18:03:24','2018-08-08 18:03:24'),(4801,1,140,1,1,3,8,'2018-08-08 18:03:24','2018-08-08 18:03:24'),(4802,1,140,1,1,3,9,'2018-08-08 18:03:24','2018-08-08 18:03:24'),(4803,1,139,1,1,2,5,'2018-08-08 18:03:26','2018-08-08 18:03:26'),(4804,1,139,1,1,3,9,'2018-08-08 18:03:26','2018-08-08 18:03:26'),(4805,1,139,1,1,3,8,'2018-08-08 18:03:26','2018-08-08 18:03:26'),(4806,1,138,1,1,2,5,'2018-08-08 18:03:29','2018-08-08 18:03:29'),(4807,1,138,1,1,3,8,'2018-08-08 18:03:29','2018-08-08 18:03:29'),(4808,1,138,1,1,3,9,'2018-08-08 18:03:29','2018-08-08 18:03:29'),(4809,1,137,1,1,2,5,'2018-08-08 18:03:31','2018-08-08 18:03:31'),(4810,1,137,1,1,3,8,'2018-08-08 18:03:31','2018-08-08 18:03:31'),(4811,1,137,1,1,3,9,'2018-08-08 18:03:31','2018-08-08 18:03:31'),(4812,1,136,1,1,2,5,'2018-08-08 18:03:34','2018-08-08 18:03:34'),(4813,1,136,1,1,3,8,'2018-08-08 18:03:34','2018-08-08 18:03:34'),(4814,1,136,1,1,3,9,'2018-08-08 18:03:34','2018-08-08 18:03:34'),(4815,1,135,1,1,3,9,'2018-08-08 18:03:36','2018-08-08 18:03:36'),(4816,1,135,1,1,2,5,'2018-08-08 18:03:36','2018-08-08 18:03:36'),(4817,1,135,1,1,3,8,'2018-08-08 18:03:36','2018-08-08 18:03:36'),(4818,1,134,1,1,3,9,'2018-08-08 18:03:39','2018-08-08 18:03:39'),(4819,1,134,1,1,2,5,'2018-08-08 18:03:39','2018-08-08 18:03:39'),(4820,1,134,1,1,3,8,'2018-08-08 18:03:39','2018-08-08 18:03:39'),(4821,1,133,1,1,2,5,'2018-08-08 18:03:42','2018-08-08 18:03:42'),(4822,1,133,1,1,3,9,'2018-08-08 18:03:42','2018-08-08 18:03:42'),(4823,1,133,1,1,3,8,'2018-08-08 18:03:42','2018-08-08 18:03:42'),(4824,1,132,1,1,3,9,'2018-08-08 18:03:45','2018-08-08 18:03:45'),(4825,1,132,1,1,2,5,'2018-08-08 18:03:45','2018-08-08 18:03:45'),(4826,1,132,1,1,3,8,'2018-08-08 18:03:45','2018-08-08 18:03:45'),(4827,1,131,1,1,3,9,'2018-08-08 18:03:50','2018-08-08 18:03:50'),(4828,1,131,1,1,2,5,'2018-08-08 18:03:50','2018-08-08 18:03:50'),(4829,1,131,1,1,3,8,'2018-08-08 18:03:50','2018-08-08 18:03:50'),(4830,1,130,1,1,2,5,'2018-08-08 18:03:54','2018-08-08 18:03:54'),(4831,1,130,1,1,3,8,'2018-08-08 18:03:54','2018-08-08 18:03:54'),(4832,1,130,1,1,3,9,'2018-08-08 18:03:54','2018-08-08 18:03:54'),(4833,1,129,1,1,2,5,'2018-08-08 18:03:58','2018-08-08 18:03:58'),(4834,1,129,1,1,3,8,'2018-08-08 18:03:58','2018-08-08 18:03:58'),(4835,1,129,1,1,3,9,'2018-08-08 18:03:58','2018-08-08 18:03:58'),(4836,1,128,1,1,2,5,'2018-08-08 18:04:01','2018-08-08 18:04:01'),(4837,1,128,1,1,3,8,'2018-08-08 18:04:01','2018-08-08 18:04:01'),(4838,1,128,1,1,3,9,'2018-08-08 18:04:01','2018-08-08 18:04:01'),(4839,1,127,1,1,3,9,'2018-08-08 18:04:04','2018-08-08 18:04:04'),(4840,1,127,1,1,2,5,'2018-08-08 18:04:04','2018-08-08 18:04:04'),(4841,1,127,1,1,3,8,'2018-08-08 18:04:04','2018-08-08 18:04:04'),(4842,1,126,1,1,3,8,'2018-08-08 18:04:08','2018-08-08 18:04:08'),(4843,1,126,1,1,2,5,'2018-08-08 18:04:08','2018-08-08 18:04:08'),(4844,1,126,1,1,3,9,'2018-08-08 18:04:08','2018-08-08 18:04:08'),(4845,1,125,1,1,2,5,'2018-08-08 18:04:10','2018-08-08 18:04:10'),(4846,1,125,1,1,3,8,'2018-08-08 18:04:10','2018-08-08 18:04:10'),(4847,1,125,1,1,3,9,'2018-08-08 18:04:10','2018-08-08 18:04:10'),(4848,1,124,1,1,2,5,'2018-08-08 18:04:13','2018-08-08 18:04:13'),(4849,1,124,1,1,3,8,'2018-08-08 18:04:13','2018-08-08 18:04:13'),(4850,1,124,1,1,3,9,'2018-08-08 18:04:13','2018-08-08 18:04:13'),(4851,1,123,1,1,2,5,'2018-08-08 18:04:17','2018-08-08 18:04:17'),(4852,1,123,1,1,3,8,'2018-08-08 18:04:17','2018-08-08 18:04:17'),(4853,1,123,1,1,3,9,'2018-08-08 18:04:17','2018-08-08 18:04:17'),(4854,1,122,1,1,2,5,'2018-08-08 18:04:20','2018-08-08 18:04:20'),(4855,1,122,1,1,3,9,'2018-08-08 18:04:20','2018-08-08 18:04:20'),(4856,1,122,1,1,3,8,'2018-08-08 18:04:20','2018-08-08 18:04:20'),(4857,1,121,1,1,2,5,'2018-08-08 18:04:22','2018-08-08 18:04:22'),(4858,1,121,1,1,3,8,'2018-08-08 18:04:22','2018-08-08 18:04:22'),(4860,1,120,1,1,2,5,'2018-08-08 18:04:25','2018-08-08 18:04:25'),(4861,1,120,1,1,3,8,'2018-08-08 18:04:25','2018-08-08 18:04:25'),(4863,1,119,1,1,3,8,'2018-08-08 18:04:27','2018-08-08 18:04:27'),(4864,1,119,1,1,2,5,'2018-08-08 18:04:27','2018-08-08 18:04:27'),(4865,1,119,1,1,3,9,'2018-08-08 18:04:27','2018-08-08 18:04:27'),(4866,1,118,1,1,3,9,'2018-08-08 18:04:30','2018-08-08 18:04:30'),(4867,1,118,1,1,2,5,'2018-08-08 18:04:30','2018-08-08 18:04:30'),(4868,1,118,1,1,3,8,'2018-08-08 18:04:30','2018-08-08 18:04:30'),(4869,1,117,1,1,2,5,'2018-08-08 18:04:32','2018-08-08 18:04:32'),(4870,1,117,1,1,3,9,'2018-08-08 18:04:32','2018-08-08 18:04:32'),(4871,1,117,1,1,3,8,'2018-08-08 18:04:32','2018-08-08 18:04:32'),(4872,1,116,1,1,2,5,'2018-08-08 18:04:35','2018-08-08 18:04:35'),(4873,1,116,1,1,3,8,'2018-08-08 18:04:35','2018-08-08 18:04:35'),(4874,1,116,1,1,3,9,'2018-08-08 18:04:35','2018-08-08 18:04:35'),(4875,1,115,1,1,3,8,'2018-08-08 18:04:37','2018-08-08 18:04:37'),(4876,1,115,1,1,2,5,'2018-08-08 18:04:37','2018-08-08 18:04:37'),(4877,1,115,1,1,3,9,'2018-08-08 18:04:37','2018-08-08 18:04:37'),(4878,1,9,1,1,3,9,'2018-08-09 14:11:38','2018-08-09 14:11:38');
/*!40000 ALTER TABLE `evaluacion_tabla` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_tabla_BEFORE_INSERT`BEFORE INSERT ON `evaluacion_tabla` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_tabla_BEFORE_UPDATE` BEFORE UPDATE ON `evaluacion_tabla` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluacion_tabla_reactivo`
--

DROP TABLE IF EXISTS `evaluacion_tabla_reactivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_tabla_reactivo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(600) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=262 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_tabla_reactivo`
--

LOCK TABLES `evaluacion_tabla_reactivo` WRITE;
/*!40000 ALTER TABLE `evaluacion_tabla_reactivo` DISABLE KEYS */;
INSERT INTO `evaluacion_tabla_reactivo` VALUES (1,'La imagen de inicio representa el contenido del recurso','2016-04-05 13:19:52','2018-05-08 16:26:26'),(2,'En la introducción o bienvenida se menciona al Instituto Politécnico Nacional.','2016-04-05 13:19:53','2018-05-08 16:26:26'),(3,'En la introducción o bienvenida se menciona la carrera o unidad de aprendizaje a la que pertenece el recurso.','2016-04-05 13:19:53','2018-08-10 11:49:34'),(4,'En la introducción o bienvenida se mencionan las ventajas que el recurso le proporciona al estudiante para su formación.','2016-04-05 13:19:54','2018-05-08 16:26:26'),(5,'En la introducción o bienvenida se describe con claridad su propósito, por qué se eligieron esos contenidos y si es el caso, el tipo de manejo o dominio que se obtendrá de algunos procedimientos y/o herramientas.','2016-04-05 13:19:54','2018-05-08 16:26:26'),(6,'En la introducción o bienvenida se motiva al estudiante, de tal forma que logra captar su interés y promueve el deseo de aprender.','2016-04-05 13:19:54','2018-05-08 16:26:26'),(7,'En la introducción o bienvenida se presenta el nombre completo del recurso, tal y como aparece en el oficio y la cédula de solicitud.','2016-04-05 13:19:54','2018-05-08 16:26:26'),(8,'Se hace mención de la Competencia general y de las Competencias particulares que el usuario desarrollará con el recurso.','2016-04-05 13:19:55','2018-05-08 16:26:26'),(9,'Las competencias dejan claro los conocimientos, habilidades, actitudes y valores que el estudiante adquirirá, así como las acciones que realizará con éstos.','2016-04-05 13:19:55','2018-05-08 16:26:26'),(10,'Las competencias se identifican y expresan de manera clara.','2016-04-05 13:19:55','2018-05-08 16:26:26'),(11,'Las competencias pueden ser alcanzadas con base en las estrategias didácticas, la extensión y la modalidad del recurso.','2016-04-05 13:19:55','2018-05-08 16:26:26'),(12,'Las competencias están formuladas colocando en el centro de la actividad al estudiante y no al docente y destacando lo que el alumno debe ser capaz de realizar como resultado del proceso de aprendizaje.','2016-04-05 13:19:56','2018-05-08 16:26:26'),(13,'Las competencias se encuentran identificadas con los siguientes títulos: Competencia general y Competencias particulares.','2016-04-05 13:19:56','2018-05-08 16:26:26'),(14,'Responde, con claridad y de una manera descriptiva, a la pregunta \"¿cómo se va a trabajar?\", de tal modo que quedan claras las etapas o fases para el desarrollo de las competencias. ','2016-04-05 13:19:56','2018-05-08 16:26:26'),(15,'Se especifica si el uso del recurso didáctico será de apoyo, opcional u obligatorio para los estudiantes.','2016-04-05 13:19:56','2018-05-08 16:26:26'),(16,'Se indica si las actividades de aprendizaje se realizarán en el aula de manera presencial o bien, las desarrollarán de manera individual o por grupos, en horario fuera de clase.','2016-04-05 13:19:56','2018-05-08 16:26:26'),(17,'Se hace referencia a los momentos  y tipos de evaluación (diagnóstica, formativa, sumativa e integradora) con los que se valorarán las actividades realizadas y se verificará el nivel de dominio alcanzado de la competencia.','2016-04-05 13:19:57','2018-05-08 16:26:26'),(18,'Se presenta de manera clara el conjunto de recursos sugeridos de los que el estudiante deberá disponer y utilizar.','2016-04-05 13:19:57','2018-05-08 16:26:26'),(19,'Se enuncia la estructura de los contenidos del recurso (por módulos, capítulos, unidades, temas, subtemas).','2016-04-05 13:19:57','2018-05-08 16:26:26'),(20,'Se explican los diferentes tipos de actividades que debe realizar el alumno (trabajo teórico y/o práctico) para remplazar el laboratorio o taller en el ambiente virtual.','2016-04-05 13:19:57','2018-05-08 16:26:26'),(21,'Los contenidos y las actividades a lo largo del recurso son congruentes con la metodología.','2016-04-05 13:19:57','2018-05-08 16:26:26'),(22,'La forma de trabajo descrita es pertinente con la modalidad en la que se utilizará el recurso.','2016-04-05 13:19:58','2018-05-08 16:26:26'),(23,'Especifica el número de horas de estudio por semana. ','2016-04-05 13:19:58','2018-05-08 16:26:26'),(24,'La ubicación de las actividades corresponde con su ubicación real en el recurso.','2016-04-05 13:19:58','2018-05-08 16:26:26'),(25,'La distribución de las actividades a lo largo del período de duración del recurso, resulta pertinente para su realización y entrega.','2016-04-05 13:19:58','2018-05-08 16:26:26'),(26,'Los tipos de actividades se distinguen de la siguiente manera: actividad diagnóstica, actividades de aprendizaje, actividades integradoras y actividad de recuperación','2016-04-05 13:19:58','2018-05-08 16:26:26'),(27,'La agenda de actividades se encuentra en formato PDF y puede imprimirse.','2016-04-05 13:19:58','2018-05-08 16:26:26'),(28,'La organización de los datos que corresponden a este apartado incluye la siguiente información: unidad didáctica, tema o equivalente (encabezado), nombre y tipo de actividad, evidencia de aprendizaje y período en el que deberá entregarse.','2016-04-05 13:19:59','2018-05-08 16:26:26'),(29,'La numeración de las actividades es secuencial, con números arábigos, sin importar el tipo de actividad.','2016-04-05 13:19:59','2018-05-08 16:26:26'),(30,'El nombre y número de las actividades coincide con la agenda de actividades, contenidos, tabla de evaluación y demás secciones donde aparezcan.','2016-04-05 13:19:59','2018-05-08 16:26:26'),(31,'Incluye una introducción que presenta el recurso y su relación con un tema, unidad, disciplina o carrera.','2016-04-05 13:19:59','2018-05-08 16:26:26'),(32,'La introducción explica la finalidad del recurso, sin ser tan específica como la metodología.','2016-04-05 13:20:00','2018-05-08 16:26:26'),(33,'Responde de una manera descriptiva a las preguntas: ¿Qué aprenderé con este recurso? ¿Para qué quiero aprender eso? ¿Qué tengo que hacer para aprender? ¿Cómo me evaluarán? ¿A quién puedo acudir para solicitar ayuda?','2016-04-05 13:20:00','2018-05-08 16:26:26'),(34,'La respuesta a la pregunta ¿qué aprenderé con este recurso? es congruente con los contenidos y la competencia general.','2016-04-05 13:20:00','2018-05-08 16:26:26'),(35,'La respuesta a la pregunta ¿para qué quiero aprender eso?, explica con claridad la importancia del recurso para la vida profesional y cotidiana del estudiante.','2016-04-05 13:20:00','2018-05-08 16:26:26'),(36,'La respuesta a la pregunta: ¿qué tengo que hacer para aprender? describe con claridad la manera en la que va a  trabajar el estudiante.','2016-04-05 13:20:00','2018-05-08 16:26:26'),(37,'La respuesta a la pregunta: ¿qué tengo que hacer para aprender? indica la manera en la que trabajará el estudiante y se relaciona con la metodología planteada en el recurso.','2016-04-05 13:20:00','2018-05-08 16:26:26'),(38,'La respuesta a la pregunta: ¿qué tengo que hacer para aprender? se ofrece al estudiante una panorámica sobre recomendaciones o estrategias en las que se puede apoyar para alcanzar las competencias esperadas. ','2016-04-05 13:20:01','2018-05-08 16:26:26'),(39,'La respuesta a la pregunta: ¿qué tengo que hacer para aprender? describe con claridad las acciones que tendrán que realizar los estudiantes.','2016-04-05 13:20:01','2018-05-08 16:26:26'),(40,'La respuesta a la pregunta: ¿qué tengo que hacer para aprender?  proporciona los elementos suficientes para que el estudiante tome decisiones a lo largo del curso o recurso.','2016-04-05 13:20:01','2018-05-08 16:26:26'),(41,'La respuesta a la pregunta ¿cómo me evaluarán? incluye la ponderación de cada actividad integradora y ésta coincide con la tabla de evaluación.','2016-04-05 13:20:01','2018-05-08 16:26:26'),(42,'La respuesta a la pregunta ¿a quién puedo acudir para solicitar ayuda? Menciona las diferentes figuras a las cuales puede acudir el alumno durante su proceso de aprendizaje.','2016-04-05 13:20:01','2018-05-08 16:26:26'),(43,'La ubicación de las actividades corresponde con su ubicación real en los contenidos del recurso.','2016-04-05 13:20:01','2018-05-08 16:26:26'),(44,'La ponderación de las actividades integradoras en la tabla de evaluación corresponde con lo que se muestra en los contenidos y actividades.','2016-04-05 13:20:01','2018-05-08 16:26:26'),(45,'Los tipos de actividades se distinguen de la siguiente manera: actividad diagnóstica, actividades de aprendizaje, actividades integradoras y actividad de recuperación.','2016-04-05 13:20:02','2018-05-08 16:26:26'),(46,'Se especifican los productos o evidencias correspondientes a la actividad. ','2016-04-05 13:20:02','2018-05-08 16:26:26'),(47,'La organización de los datos que corresponden a este apartado incluye la siguiente información: unidad didáctica, tema o equivalente (encabezado), nombre y tipo de actividad, ponderación.','2016-04-05 13:20:02','2018-05-08 16:26:26'),(48,'El nombre y número de las actividades coincide en la agenda de actividades, contenidos, tabla de evaluación y demás secciones donde aparezcan.','2016-04-05 13:20:02','2018-05-08 16:26:26'),(49,'Las actividades diagnóstica y de aprendizaje no tienen puntuación.','2016-04-05 13:20:02','2018-05-08 16:26:26'),(50,'La ponderación de las actividades integradoras suma un total de 100%.','2016-04-05 13:20:02','2018-05-08 16:26:26'),(51,'El valor de la actividad de recuperación es de 100%.','2016-04-05 13:20:03','2018-05-08 16:26:26'),(52,'Se encuentra en formato APA Harvard.','2016-04-05 13:20:03','2018-05-08 16:26:26'),(53,'Todas las fuentes citadas en el contenido aparecen en la bibliografía. ','2016-04-05 13:20:03','2018-05-08 16:26:26'),(54,'Las fuentes de consulta aparecen en la bibliografía en orden alfabético.','2016-04-05 13:20:03','2018-05-08 16:26:26'),(55,'Incluye un glosario explicando en lenguaje sencillo los términos y conceptos especializados.','2016-04-05 13:20:03','2018-05-08 16:26:26'),(56,'Todas las palabras del glosario aparecen en orden alfabético.','2016-04-05 13:20:03','2018-05-08 16:26:26'),(57,'Las entradas léxicas del glosario se presentan en masculino; en caso de que la palabra también tenga su forma femenina, se especifica.','2016-04-05 13:20:04','2018-05-08 16:26:26'),(58,'No se pluraliza en las entradas del glosario, a menos que así lo indique la jerga de cada profesión, en cuyo caso debe existir una nota aclaratoria.','2016-04-05 13:20:04','2018-05-08 16:26:26'),(59,'Uso correcto de términos equivalentes en español para palabras extranjeras, cuando no se trate de terminología propia de la disciplina.','2016-04-05 13:20:04','2018-05-08 16:26:26'),(60,'Aclaración respecto del uso de terminología específica de la disciplina, cuando exista.','2016-04-05 13:20:04','2018-05-08 16:26:26'),(61,'Se evitan definiciones redondas, es decir, las que remiten a otra definición. ','2016-04-05 13:20:04','2018-05-08 16:26:26'),(62,'Las entradas léxicas no se cierran con punto final. ','2016-04-05 13:20:04','2018-05-08 16:26:26'),(63,'Se hace uso correcto de entradas léxicas formadas por palabras compuestas.','2016-04-05 13:20:04','2018-05-08 16:26:26'),(64,'La entrada léxica aparece en negritas.','2016-04-05 13:20:05','2018-05-08 16:26:26'),(65,'La sección de \"ayuda\" responde dudas académicas de los estudiantes.','2016-04-05 13:20:05','2018-05-08 16:26:26'),(66,'La sección de \"ayuda\" responde las dudas técnicas de los estudiantes. \n','2016-04-05 13:20:05','2018-05-08 16:26:26'),(67,'Las guías de instalación y uso de recursos especializados son inéditas.  ','2016-04-05 13:20:05','2018-05-08 16:26:26'),(68,'Las guías de instalación y uso de recursos presentan descripciones claras y detalladas de los procedimientos. ','2016-04-05 13:20:05','2018-05-08 16:26:26'),(69,'La sección de “ayuda” para el usuario es fácilmente visible y se localiza siempre en el mismo lugar en todas las pantallas del recurso y opera de una manera consistente.','2016-04-05 13:20:05','2018-05-08 16:26:26'),(70,'Se incluyen los manuales, guías, tutoriales y archivos de instalación, uso y desinstalación del recurso, necesarios para que el estudiante pueda realizar las actividades y revisar los contenidos.','2016-04-05 13:20:05','2018-05-08 16:26:26'),(71,'El recurso resulta fácil de usar y auto explicativo, de manera que los usuarios pueden utilizarlo sin tener que realizar una exhaustiva lectura de manuales ni largas tareas previas de configuración.','2016-04-05 13:20:06','2018-05-08 16:26:26'),(72,'Se especifican al usuario las características técnicas que debe tener el dispositivo para la reproducción correcta del recurso (p. ej. para instalar o desinstalar el recurso, la velocidad mínima de conexión a Internet, etc.).','2016-04-05 13:20:06','2018-05-08 16:26:26'),(73,'Las instrucciones para la operación del recurso son accesibles para los usuarios (en español, comprensibles y fáciles de ejecutar sin ayuda o soporte técnico adicional).','2016-04-05 13:20:06','2018-05-08 16:26:26'),(74,'Se brinda previamente a los usuarios información de los posibles conflictos del programa y, en su caso, con diferentes plataformas y programas, así como sugerencias sobre cómo resolverlos.','2016-04-05 13:20:06','2018-05-08 16:26:26'),(75,'La operación del recurso no requiere la compra y/o instalación de software comercial (de licencia) por parte del usuario, ni la descarga y/o instalación de software comercial en versiones de prueba que puedan afectar el funcionamiento normal de la computadora.','2016-04-05 13:20:06','2018-05-08 16:26:26'),(76,'El recurso orienta para la instalación de los plugins (aplicaciones complementarias), drivers (controladores) y visualizadores necesarios, y proporciona acceso a los mismos.','2016-04-05 13:20:06','2018-05-08 16:26:26'),(77,'El contenido está conformado por la información estructurada de la materia, y con base en ella se enuncian los conceptos, principios, leyes y teorías que se requiere abordar para el desarrollo de las competencias.','2016-04-05 13:20:06','2018-05-08 16:26:26'),(78,'Existe un apartado de introducción en cada tema, unidad didáctica o equivalente, que explica al estudiante la finalidad de los contenidos que se abordan, permite entender la relación entre la unidad didáctica y las anteriores y es coherente con la competencia particular (y los RAP).','2016-04-05 13:20:07','2018-05-08 16:26:26'),(79,'El mapa de conceptos no es una representación gráfica del temario.','2016-04-05 13:20:07','2018-05-08 16:26:26'),(80,'La organización lógica de los contenidos y su progresiva complejidad son congruentes con lo establecido en la estructura de cada tema, unidad didáctica o equivalente, según el nivel de dominio establecido en la competencia particular (y los RAP).','2016-04-05 13:20:07','2018-05-08 16:26:26'),(81,'Se propicia la interacción entre el estudiante y el recurso por medio de técnicas como la inclusión de ejercicios independientes de las actividades de autoevaluación y de aprendizaje o la pregunta didáctica, por ejemplo.  ','2016-04-05 13:20:07','2018-05-08 16:26:26'),(82,'Los ejemplos ayudan a comprender los contenidos.  ','2016-04-05 13:20:07','2018-05-08 16:26:26'),(83,'Existen recursos que ayudan a entender la relación de los contenidos con el entorno profesional y personal del estudiante. ','2016-04-05 13:20:07','2018-05-08 16:26:26'),(84,'Está presente el subtítulo Conclusión al final del tema, unidad didáctica o equivalente, debajo del cual se encuentra la conclusión particular o conclusiones generales.','2016-04-05 13:20:07','2018-05-08 16:26:26'),(85,'Hay un texto entre apartados, temas o subtemas, que establece la relación de un nivel  jerárquico a otro.','2016-04-05 13:20:08','2018-05-08 16:26:26'),(86,'Existe coherencia entre la introducción del tema, unidad didáctica o equivalente y la conclusión de la que le precede, cuando es el caso. ','2016-04-05 13:20:08','2018-05-08 16:26:26'),(87,'Se incluye al inicio un mapa en el cual se visualizan los conceptos fundamentales del tema, unidad didáctica o equivalente, de una manera estructurada y con una adecuada jerarquización de ideas y conceptos.','2016-04-05 13:20:08','2018-05-08 16:26:26'),(88,'Es claro el propósito didáctico del recurso multimedia en relación con la competencia particular (y los RAP) y, en consecuencia, motiva al estudiante a consultarlo. ','2016-04-05 13:20:08','2018-05-08 16:26:26'),(89,'La actividad tiene un texto introductorio donde se describe su propósito y en qué consiste.','2016-04-05 13:20:08','2018-05-08 16:26:26'),(90,'El propósito descrito de la actividad es congruente con la competencia particular (y los RAP) del tema, unidad didáctica o equivalente, que corresponda.','2016-04-05 13:20:08','2018-05-08 16:26:26'),(91,'Las actividades del recurso cubren la totalidad de las competencias (y los RAP).','2016-04-05 13:20:09','2018-05-08 16:26:26'),(92,'Las instrucciones comienzan con un verbo que indica la acción que debe ejecutar el estudiante.','2016-04-05 13:20:09','2018-05-08 16:26:26'),(93,'Las instrucciones de la actividad son claras y precisas.','2016-04-05 13:20:09','2018-05-08 16:26:26'),(94,'Las actividades  de aprendizaje permiten al estudiante desarrollar conocimientos, habilidades, actitudes y valores, y no sólo repetir información; permiten que el estudiante aborde, analice, ejercite, proponga soluciones etc.; de manera teórica y práctica a partir de lo aprendido.','2016-04-05 13:20:09','2018-05-08 16:26:26'),(95,'Las actividades solicitadas al estudiante son adecuadas, graduales y permiten estimar, valorar y verificar el nivel de logro de la competencia planteada.','2016-04-05 13:20:09','2018-05-08 16:26:26'),(96,'El grado de complejidad de la actividad es coherente con el tiempo designado para su elaboración y entrega.','2016-04-05 13:20:09','2018-05-08 16:26:26'),(97,'El grado de complejidad de las actividades integradoras es coherente con su ponderación.','2016-04-05 13:20:10','2018-05-08 16:26:26'),(98,'Las actividades integradoras implican la generación de evidencias para demostrar el desarrollo de la competencia particular (y del RAP) que corresponda.','2016-04-05 13:20:10','2018-05-08 16:26:26'),(99,'Las actividades se plantean de forma diversa, para favorecer los distintos tipos y estilos de aprendizaje.','2016-04-05 13:20:10','2018-05-08 16:26:26'),(100,'Hay una secuencia didáctica entre las actividades, congruente con la metodología, a partir de los métodos científicos analítico, sintético, deductivo y/o inductivo, según los métodos didácticos heurísticos como el basado en problemas o proyectos, por ejemplo, o la articulación lógica entre dos o más de éstos.','2016-04-05 13:20:10','2018-05-08 16:26:26'),(101,'A lo largo del recurso se ofrece al estudiante la oportunidad de ir identificando su nivel de aprendizaje, mediante técnicas como la autoevaluación, ejercicios, preguntas que promuevan la observación y/o reflexión, entre otras.','2016-04-05 13:20:10','2018-05-08 16:26:26'),(102,'Se incluyen actividades que fomentan el aprendizaje autónomo.','2016-04-05 13:20:10','2018-05-08 16:26:26'),(103,'Se incluyen actividades que fomentan el trabajo colaborativo.','2016-04-05 13:20:10','2018-05-08 16:26:26'),(104,'Se incluyen actividades que fomentan la investigación.','2016-04-05 13:20:10','2018-05-08 16:26:26'),(105,'Se incluyen actividades que permiten al alumno proponer innovaciones sobre lo aprendido.','2016-04-05 13:20:10','2018-05-08 16:26:26'),(106,'Se incluyen actividades que fomentan la integración con el resto de los alumnos que interactúan en la plataforma (foros, chats, wikis).','2016-04-05 13:20:11','2018-05-08 16:26:26'),(107,'Hay relación entre las actividades de autoevaluación y las del aprendizaje propuesto.','2016-04-05 13:20:11','2018-05-08 16:26:26'),(108,'Se expresan con claridad los criterios de evaluación que se utilizarán para constatar que el alumno ha logrado el desarrollo y adquisición de las competencias planteadas.','2016-04-05 13:20:11','2018-05-08 16:26:26'),(109,'Los instrumentos utilizados para obtener la información con la que se evalúa el aprovechamiento del estudiante son suficientes, pertinentes, diversificados y claros.','2016-04-05 13:20:11','2018-05-08 16:26:26'),(110,'Las características de las evidencias o productos y desempeños solicitados al alumno en la evaluación sumativa permiten sin lugar a duda la acreditación.','2016-04-05 13:20:11','2018-05-08 16:26:26'),(111,'El propósito descrito de la actividad es congruente con lo que se solicita en la misma. ','2016-04-05 13:20:11','2018-05-08 16:26:26'),(112,'La distribución de las actividades a lo largo del período de duración total del recurso, resulta pertinente para su realización y entrega.','2016-04-05 13:20:11','2018-05-08 16:26:26'),(113,'El desarrollo de los contenidos se encuentra relacionado de una manera pertinente con lo que se solicita en la actividad.','2016-04-05 13:20:12','2018-05-08 16:26:26'),(114,'La actividad promueve la relación del estudiante con su entorno profesional y personal.','2016-04-05 13:20:12','2018-05-08 16:26:26'),(115,'La ubicación de las actividades en la agenda corresponde con su ubicación real en el recurso.','2016-04-05 13:20:12','2018-05-08 16:26:26'),(116,'Las características de las evidencias o productos solicitados coinciden con la tabla de evaluación.','2016-04-05 13:20:12','2018-05-08 16:26:26'),(117,'Se incluyen actividades en los diferentes momentos del recurso: inicio, desarrollo y cierre.','2016-04-05 13:20:12','2018-05-08 16:26:26'),(118,'En la evaluación diagnóstica se cuenta con retroalimentación','2016-04-05 13:20:12','2018-05-08 16:26:26'),(119,'La evaluación diagnóstica incluye guía para el estudiante y/o asesor para favorecer el proceso de aprendizaje de los estudiantes tomando en cuenta su puntuación. \n','2016-04-05 13:20:12','2018-05-08 16:26:26'),(120,'En el período de recuperación (actividad de recuperación), las características de las evidencias, productos y desempeños solicitados al alumno, permiten demostrar el logro de la competencia general de la unidad de aprendizaje.','2016-04-05 13:20:13','2018-05-08 16:26:26'),(121,'La actividad de recuperación se presenta como una actividad independiente (no seriada). ','2016-04-05 13:20:13','2018-05-08 16:26:26'),(122,'En los cuestionarios de opciones se explica al usuario cuántas preguntas integran la evaluación.','2016-04-05 13:20:13','2018-05-08 16:26:26'),(123,'En los cuestionarios de opciones se menciona el puntaje por pregunta.','2016-04-05 13:20:13','2018-05-08 16:26:26'),(124,'En los cuestionarios de opciones se menciona el número de intentos para resolver la evaluación.','2016-04-05 13:20:13','2018-05-08 16:26:26'),(125,'En los cuestionarios de opciones, se especifican los criterios de penalización y de registro de calificación','2016-04-05 13:20:13','2018-05-08 16:26:26'),(126,'La instrucción para nombrar el archivo de evidencia es congruente con el número de actividad y tiene una nomenclatura uniforme: apellidopaterno_materno_nombre(s)_act#','2016-04-05 13:20:14','2018-05-08 16:26:26'),(127,'Las actividades diagnósticas y de aprendizaje no tienen puntuación.','2016-04-05 13:20:14','2018-05-08 16:26:26'),(128,'El recurso favorece la comprensión y el aprendizaje en la modalidad en la que se impartirá.','2016-04-05 13:20:14','2018-05-08 16:26:26'),(129,'El usuario tiene la posibilidad de realizar actividades e incidir sobre el comportamiento del recurso educativo (interacción alumno-recurso).','2016-04-05 13:20:14','2018-05-08 16:26:26'),(130,'El uso de las animaciones y demás recursos interactivos se justifica en situaciones donde se requiere la intervención del usuario en un ambiente que implique movimiento, con el objeto de observar un resultado específico producido por su interacción. ','2016-04-05 13:20:14','2018-05-08 16:26:26'),(131,'Existe un ambiente para intercambiar puntos de vista o información ya sea en forma sincrónica o asincrónica (interacción alumno-alumno).','2016-04-05 13:20:14','2018-05-08 16:26:26'),(132,'El profesor y los alumnos se encontrarán intercambiando información, traducida en conocimiento, lo cual implica estar en constante comunicación, que puede ser sincrónica y/o asincrónica (interacción alumno-profesor).','2016-04-05 13:20:14','2018-05-08 16:26:26'),(133,'El recurso incluye y explica los medios y mecanismos a utilizar en las consultas y asesorías virtuales, así como el funcionamiento de los medios para el efecto, tales como: aulas virtuales, calendario, tablero de anuncios, foros, e-mail, chat, videoconferencia, etc.','2016-04-05 13:20:15','2018-05-08 16:26:26'),(134,'Se incluyen los nombres de los autores y la fecha de la última actualización del recurso.','2016-04-05 13:20:15','2018-05-08 16:26:26'),(135,'Las imágenes de la identidad gráfica son consistentes con el contenido.','2016-04-05 13:20:15','2018-05-08 16:26:26'),(136,'Los títulos, subtítulos e incisos se identifican con facilidad y están alineados a la izquierda, o centrados en el caso de documentos adjuntos. ','2016-04-05 13:20:15','2018-05-08 16:26:26'),(137,'Los títulos, subtítulos e incisos se encuentran sin punto final. ','2016-04-05 13:20:15','2018-05-08 16:26:26'),(138,'Las ideas y los párrafos están redactados de manera clara y hay una relación lógica entre ambos (coherencia comunicativa).','2016-04-05 13:20:15','2018-05-08 16:26:26'),(139,'Todos los párrafos de más de dos renglones están justificados, excepto por títulos, frases o texto resaltado, instrucciones y pies de imagen.','2016-04-05 13:20:15','2018-05-08 16:26:26'),(140,'Los recursos multimedia son coherentes con las explicaciones presentadas en su contenido.','2016-04-05 13:20:16','2018-05-08 16:26:26'),(141,'Los recursos multimedia provenientes de sitios o plataformas de Internet como: YouTube, Prezzi, SlideShare, blogs, entre otros, están publicados desde una cuenta de usuario del plantel.','2016-04-05 13:20:16','2018-05-08 16:26:26'),(142,'Los contenidos de Internet incluyen referencias de su origen real, no de su ubicación en la página o cuenta del autor.','2016-04-05 13:20:16','2018-05-08 16:26:26'),(143,'Las imágenes, tablas, animaciones y videos no tienen fondos que compiten visualmente con el texto o contenido, textos encimados o contrastes que dificultan la lectura o comprensión del contenido principal.','2016-04-05 13:20:16','2018-05-08 16:26:26'),(144,'Los recursos que incluyen audio cuentan con una dicción correcta, nítida y sin distorsión.','2016-04-05 13:20:16','2018-05-08 16:26:26'),(145,'Existe una clara distinción de sonidos de apoyo y éstos permiten escuchar distintivamente la voz del narrador, la nitidez de la grabación o transmisión, según el caso.','2016-04-05 13:20:16','2018-05-08 16:26:26'),(146,'Cuando una animación o presentación PowerPoint contiene audio, se indica mediante una instrucción de texto o con un icono.','2016-04-05 13:20:16','2018-05-08 16:26:26'),(147,'Los recursos multimedia que implican interacción por parte del usuario, cuentan con instrucciones claras y coherentes con el funcionamiento de éstos.','2016-04-05 13:20:16','2018-05-08 16:26:26'),(148,'Los recursos multimedia que se presentan en la plataforma son de autoría propia, desarrollados exclusivamente para el recurso. ','2016-04-05 13:20:17','2018-05-08 16:26:26'),(149,'No se incluyen archivos con Derechos de Autor. Cuando se trata de documentos libres de derechos se muestra la información de donde fueron obtenidos con los datos de los respectivos autores (referencia).','2016-04-05 13:20:17','2018-05-08 16:26:26'),(150,'El uso que se hace de textos copiados de páginas de Internet corresponde a citas textuales breves que sirven de apoyo al contenido inédito (de autoría propia), desarrollado exclusivamente para el recurso. ','2016-04-05 13:20:17','2018-05-08 16:26:26'),(151,'En el uso de recursos e información para consulta en Internet (por ejemplo: conceptos y definiciones), se utilizan páginas con dominios de instituciones educativas o gubernamentales que garantizan el rigor académico cuando se trata de información primordial para la unidad de aprendizaje.','2016-04-05 13:20:17','2018-05-08 16:26:26'),(152,'El uso de dominios .com está reservado para consultas complementarias o para exponer ejemplos que no sustituyen la información esencial del recurso. ','2016-04-05 13:20:17','2018-05-08 16:26:26'),(153,'Las ligas de páginas de Internet que se presentan están disponibles y vigentes.','2016-04-05 13:20:17','2018-05-08 16:26:26'),(154,'Las palabras del glosario están presentes al menos una vez en las actividades o el contenido del recurso.','2016-04-05 13:20:17','2018-05-08 16:26:26'),(155,'Los textos que sirven como enlace para descargar un archivo presentan un nombre coherente, generalmente el título del documento.','2016-04-05 13:20:18','2018-05-08 16:26:26'),(156,'El título del recurso se encuentra con las letras iniciales en mayúsculas y resaltado en negritas.','2016-04-05 13:20:18','2018-05-08 16:26:26'),(157,'Se evita el uso de la arroba para integrar el género femenino y el masculino en una sola palabra. Ejemplo: Bienvenid@s','2016-04-05 13:20:18','2018-05-08 16:26:26'),(158,'Uso limitado de expresiones coloquiales: “¡Enhorabuena!”, “¡Continúa, tú puedes!”, “¡Ánimo, ya estás cerca de la meta!”, “¡Sigue adelante, ya falta poco!”, “¡Gracias por compartir con nosotros esta maravillosa experiencia!”','2016-04-05 13:20:18','2018-05-08 16:26:26'),(159,'Uso correcto de mayúsculas y minúsculas.','2016-04-05 13:20:18','2018-05-08 16:26:26'),(160,'Uso adecuado de tipografía (negritas y cursivas).','2016-04-05 13:20:18','2018-05-08 16:26:26'),(161,'Solamente el hipertexto aparece subrayado.','2016-04-05 13:20:18','2018-05-08 16:26:26'),(162,'Se aplican las reglas de acentuación (incluye acentos diacríticos en pronombres demostrativos).','2016-04-05 13:20:18','2018-05-08 16:26:26'),(163,'Las abreviaturas, siglas y acrónimos están correctamente escritos. ','2016-04-05 13:20:18','2018-05-08 16:26:26'),(164,'Uso correcto y moderado de las preposiciones, locuciones preposicionales y adverbiales.','2016-04-05 13:20:19','2018-05-08 16:26:26'),(165,'Los contenidos están exentos de vicios de lenguaje (anfibología o ambigüedad, cacofonías, dequeísmo, pobreza de lenguaje, etcétera).','2016-04-05 13:20:19','2018-05-08 16:26:26'),(166,'Uso correcto de los signos de puntuación (punto, coma, punto y coma, dos puntos, puntos suspensivos). ','2016-04-05 13:20:19','2018-05-08 16:26:26'),(167,'Uso correcto de signos auxiliares (comillas, guiones, raya, paréntesis, corchetes, admiración, interrogación).','2016-04-05 13:20:19','2018-05-08 16:26:26'),(168,'Hay concordancia gramatical.','2016-04-05 13:20:19','2018-05-08 16:26:26'),(169,'Hay coherencia entre oraciones y párrafos.','2016-04-05 13:20:19','2018-05-08 16:26:26'),(170,'Las estructuras sintácticas y semánticas son correctas.','2016-04-05 13:20:19','2018-05-08 16:26:26'),(171,'El texto está claramente estructurado, es fluido y cuenta con información pertinente y bien organizada, sin contenido ambiguo, redundante y/o incoherente.','2016-04-05 13:20:19','2018-05-08 16:26:26'),(172,'Los párrafos son cortos y concisos (no más de nueve líneas por párrafo), para una adecuada lectura en pantalla.','2016-04-05 13:20:19','2018-05-08 16:26:26'),(173,'Muestra oraciones completas (sin omisión de preposiciones, artículos, verbos, etcétera).','2016-04-05 13:20:20','2018-05-08 16:26:26'),(174,'Uso correcto del participio y el gerundio.','2016-04-05 13:20:20','2018-05-08 16:26:26'),(175,'La palabra clic no se encuentra escrita con k ni con mayúsculas.','2016-04-05 13:20:20','2018-05-08 16:26:26'),(176,'Aclaración respecto al uso de terminología específica de la disciplina, cuando exista.','2016-04-05 13:20:21','2018-05-08 16:26:26'),(177,'El recurso se abre y/o reproduce automáticamente al insertar el CD o DVD en la unidad lectora de la computadora. En su defecto, se indica de antemano el archivo que debe abrirse o ejecutarse para iniciarlo o instalarlo.','2016-04-05 13:20:21','2018-05-08 16:26:26'),(178,'El tiempo máximo de descarga y/o comienzo de la reproducción del recurso es de 30 segundos, ya sea mediante la conexión a Internet o como resultado de la ejecución de una instrucción en la computadora.','2016-04-05 13:20:21','2018-05-08 16:26:26'),(179,'La instalación y desinstalación del recurso es sencilla, rápida y transparente.','2016-04-05 13:20:21','2018-05-08 16:26:26'),(180,'La ejecución del recurso es constante y confiable: no tiene errores de funcionamiento. ','2016-04-05 13:20:21','2018-05-08 16:26:26'),(181,'El recurso se visualiza y funciona correctamente al menos en los siguientes navegadores de Internet: Chrome, Explorer 10+. Si el recurso debe abrirse con algún navegador en particular, se especifica de antemano al usuario.','2016-04-05 13:20:21','2018-05-08 16:26:26'),(182,'El recurso puede abrirse o reproducirse de manera independiente con respecto de una plataforma de computación específica (multiplataforma).','2016-04-05 13:20:22','2018-05-08 16:26:26'),(183,'Existe en todo momento una opción de contenido en formato de texto que cumple esencialmente la misma función o propósito que el contenido visual o auditivo (accesible).','2016-04-05 13:20:22','2018-05-08 16:26:26'),(184,'El recurso cuenta con mecanismos de navegación (barras de navegación, un mapa del sitio) claros, consistentes, lógicos y estructurados.','2016-04-05 13:20:22','2018-05-08 16:26:26'),(185,'Los mecanismos de navegación están disponibles y visibles en todas las páginas o pantallas del recurso.','2016-04-05 13:20:22','2018-05-08 16:26:26'),(186,'Si el recurso se compone de varias páginas o pantallas existe una de “inicio” donde se muestra un gráfico o un texto con el título del recurso.','2016-04-05 13:20:22','2018-05-08 16:26:26'),(187,'El menú está estructurado para una consulta rápida de los contenidos.','2016-04-05 13:20:22','2018-05-08 16:26:26'),(188,'Si el menú cuenta con muchas opciones, se utilizan subniveles para subordinar la información existente.','2016-04-05 13:20:22','2018-05-08 16:26:26'),(189,'Las funciones de navegación del recurso no entran en conflicto de nombre, icono o función con los botones estándar de navegación de Internet.','2016-04-05 13:20:22','2018-05-08 16:26:26'),(190,'El recurso cuenta con indicadores que ayudan al usuario a  conocer en todo momento el lugar donde se encuentra dentro del recurso, de dónde viene y hacía dónde pude dirigirse, al igual que las diferentes formas de llegar a un punto.','2016-04-05 13:20:22','2018-05-08 16:26:26'),(191,'Los indicadores de ubicación están en un lugar específico y constante en todas las secciones del recurso.','2016-04-05 13:20:22','2018-05-08 16:26:26'),(192,'Las imágenes incluyen el atributo ALT (texto alternativo) que describe en breves palabras el contenido de la imagen (esta etiqueta no se visualiza en todos los navegadores de Internet).','2016-04-05 13:20:23','2018-05-08 16:26:26'),(193,'Cuando un archivo de video es de un tamaño mayor a 50Mb, no se incluye dentro de los archivos en la plataforma, aparece como enlace para verlo bajo demanda (video streaming) en una ventana emergente.','2016-04-05 13:20:23','2018-05-08 16:26:26'),(194,'En recursos desarrollados como página Web, los videos están en formato MP4 y tienen controles de reproducción propios de la etiqueta <video> del estándar HTML5.','2016-04-05 13:20:23','2018-05-08 16:26:26'),(195,'Los archivos de video y audio no se reproducen automáticamente al abrir la página, sino mediante la acción del botón de reproducción.','2016-04-05 13:20:23','2018-05-08 16:26:26'),(196,'En recursos desarrollados como página Web, los archivos de audio están en formato MP3 a 64 kbps. (mínimo) y 128 kbps. (máximo) y se reproducen mediante la barra de control de la etiqueta <audio> del estándar HTML5.','2016-04-05 13:20:23','2018-05-08 16:26:26'),(197,'Los textos de las ligas a archivos descargables están a renglón seguido.','2016-04-05 13:20:23','2018-05-08 16:26:26'),(198,'Los nombres de los archivos descargables son consistentes con su contenido, pero respetan la nomenclatura (en minúsculas, sin espacios, ni acentos, etc.).','2016-04-05 13:20:23','2018-05-08 16:26:26'),(199,'Todos los banners y plecas tienen un pixel de relleno, sin cortes, para ajustarse a los diferentes tamaños de resolución de pantalla.','2016-04-05 13:20:23','2018-05-08 16:26:26'),(200,'Existe un espacio de por lo menos 10px entre las imágenes y los textos que las rodean.','2016-04-05 13:20:23','2018-05-08 16:26:26'),(201,'Los archivos que integran el recurso no incluyen archivos o carpetas de desarrollo o que no pertenecen a los contenidos útiles del recurso.','2016-04-05 13:20:24','2018-05-08 16:26:26'),(202,'Los archivos contenidos en el recurso no están infectados con virus.','2016-04-05 13:20:24','2018-05-08 16:26:26'),(203,'Utiliza solamente minúsculas y nombres cortos para los archivos, sin acentos, espacios ni caracteres inusuales (como la letra “ñ” o signos). Los nombres de los archivos no empiezan con punto (.) ni contienen el signo de dos puntos (:); los nombres de los archivos tienen menos de 31 caracteres y las carpetas menos de 29. No se utilizan los caracteres: “” / \\ * ¿ ? <> |: reservados a funciones particulares.','2016-04-05 13:20:24','2018-05-08 16:26:26'),(204,'Utiliza valores relativos al especificar el tamaño en los atributos de las hojas de estilo, de tal manera que al cambio de resolución del monitor no se afecta el tamaño de los componentes.','2016-04-05 13:20:24','2018-05-08 16:26:26'),(205,'Los textos en ventanas pop-up respetan la hoja de estilos del recurso.','2016-04-05 13:20:24','2018-05-08 16:26:26'),(206,'Utiliza hojas de estilo (CSS) para controlar la maquetación y la presentación.','2016-04-05 13:20:24','2018-05-08 16:26:26'),(207,'Se evita en lo posible el uso de marcos (frames) en el diseño de la interfaz.','2016-04-05 13:20:24','2018-05-08 16:26:26'),(208,'Se emplean las etiquetas de cabecera (headers) de manera adecuada, es decir,  <H1> para el texto más importante de las páginas (títulos principales) y  de manera consecutiva <H2> y <H3> para títulos, subtítulos de secciones u otras frases a destacar. ','2016-04-05 13:20:24','2018-05-08 16:26:26'),(209,'Todas las páginas HTML mantienen una estructura y uso uniforme en la etiqueta <TITLE> ','2016-04-05 13:20:24','2018-05-08 16:26:26'),(210,'En las ventanas emergentes, la etiqueta <TITLE> describe de manera breve el contenido de la ventana, observando las reglas ortográficas.','2016-04-05 13:20:24','2018-05-08 16:26:26'),(211,'Se hace uso correcto de las cajas de: Referencia: Actividad, Foro, Cuestionario, Importante, Para saber más, etc.','2016-04-05 13:20:25','2018-05-08 16:26:26'),(212,'Las cajas de Referencia, Actividad, Para saber más, Lectura, para resaltar texto Importante, etc.; están debidamente alineadas al centro, o a la izquierda cuando el texto es muy extenso, sin espacios ni cortes.','2016-04-05 13:20:25','2018-05-08 16:26:26'),(213,'En las cajas que hacen referencia a un recurso dentro de plataforma, se omite el enlace a dicho elemento en plataforma dentro de las cajas.','2016-04-05 13:20:25','2018-05-08 16:26:26'),(214,'En cursos en plataforma, los cuestionarios de preguntas de opciones se seleccionan al azar de un conjunto mayor.','2016-04-05 13:20:25','2018-05-08 16:26:26'),(215,'Las fórmulas y ecuaciones están en formato de imagen, debidamente alineados con respecto al texto en HTML.','2016-04-05 13:20:25','2018-05-08 16:26:26'),(216,'Todos los textos en los contenidos HTML, SCORM y en la plataforma Moodle, están en Arial a 1 Em o su equivalente en puntos: Arial 12 y en el caso de títulos su tamaño es de 1.2Ems o su equivalente en puntos: Arial 14.','2016-04-05 13:20:25','2018-05-08 16:26:26'),(217,'Todas las instrucciones y pies de imagen están en Arial a 0.8 Em o su equivalente en puntos: Arial 10.','2016-04-05 13:20:25','2018-05-08 16:26:26'),(218,'Cuando se utilizan imágenes como ligas, está deshabilitado el borde de color azul del hipervínculo alrededor de la imagen, el cual aparece de manera automática en algunos navegadores de Internet.','2016-04-05 13:20:25','2018-05-08 16:26:26'),(219,'Todo el hipertexto interno está habilitado y los elementos de destino están disponibles.','2016-04-05 13:20:25','2018-05-08 16:26:26'),(220,'Los hipervínculos del recurso se identifican claramente del resto del contenido e incluyen una referencia que explica su propósito. ','2016-04-05 13:20:25','2018-05-08 16:26:26'),(221,'Cada enlace de hipertexto lleva directamente al contenido de destino a través de un solo clic.','2016-04-05 13:20:26','2018-05-08 16:26:26'),(222,'El uso del hipertexto es limitado en cada página.','2016-04-05 13:20:26','2018-05-08 16:26:26'),(223,'Si el tamaño de una imagen en una ventana emergente es mayor a 800 X 600 pixeles se encuentra habilitada ya sea la barra de desplazamiento vertical o la barra de desplazamiento horizontal, según corresponda. ','2016-04-05 13:20:26','2018-05-08 16:26:26'),(224,'Las ventanas emergentes o pop-ups tienen un tamaño personalizado, no mayor a 800 X 600 pixeles, sin barras de dirección, de menú ni de herramientas. ','2016-04-05 13:20:26','2018-05-08 16:26:26'),(225,'Los recursos creados como página Web, respetan el ancho máximo de pantalla, de tal manera que no se generan barras de desplazamiento adicionales a las del navegador de Internet.','2016-04-05 13:20:26','2018-05-08 16:26:26'),(226,'Los componentes que integran el recurso se encuentran ubicados dentro de un margen imaginario de 745 x 415 px (safe area).','2016-04-05 13:20:26','2018-05-08 16:26:26'),(227,'Todos los elementos (textos, imágenes, animaciones, etc.) son visibles y se muestran sin distorsión en resolución de pantalla de 800 X 600 pixeles.','2016-04-05 13:20:26','2018-05-08 16:26:26'),(228,'El tamaño del menú es el adecuado para ser ubicado y manejado con facilidad, sin que compita visualmente con el resto de los componentes del recurso.','2016-04-05 13:20:26','2018-05-08 16:26:26'),(229,'El elemento de mayor relevancia se encuentra ubicado en la parte superior izquierda, siguiendo con una continuidad jerárquica que va descendiendo en grado de acuerdo con su importancia.','2016-04-05 13:20:26','2018-05-08 16:26:26'),(230,'Los elementos se combinan sin romper el reticulado y las alineaciones básicas, para dar variedad visual y frescura al diseño (sangrías).','2016-04-05 13:20:26','2018-05-08 16:26:26'),(231,'El recurso muestra un equilibrio de pesos visuales, dando una sensación de orden. La alineación de los textos e imágenes se ve organizada y equilibrada en la pantalla, sin amontonamiento o dejando espacios en blanco demasiado amplios.','2016-04-05 13:20:27','2018-05-08 16:26:26'),(232,'Se conserva una identidad de diseño gráfico en todo el recurso (un estilo de presentación que sea consistente en todas las páginas). ','2016-04-05 13:20:27','2018-05-08 16:26:26'),(233,'Las imágenes (incluyendo logotipos, botones e iconografía) tienen un tamaño proporcionado y adecuado al diseño de la interfaz.','2016-04-05 13:20:27','2018-05-08 16:26:26'),(234,'Las combinaciones de los colores de fondo y primer plano tienen el suficiente contraste para ser vistas por personas con problemas visuales.','2016-04-05 13:20:27','2018-05-08 16:26:26'),(235,'Se evita el empleo de contrastes de color saturados (colores brillantes).','2016-04-05 13:20:27','2018-05-08 16:26:26'),(236,'Los colores de estado “nuevo”, “over” y “visitado” del hipervínculo son de diferentes colores, uniformes en todo el recurso, de preferencia utilizando la misma gama de colores del diseño.','2016-04-05 13:20:27','2018-05-08 16:26:26'),(237,'Incluye etiquetas en CD  y/o caja, con un diseño gráfico consistente con el del recurso, que incluye el título del recurso y nombre(s) del o los autores.','2016-04-05 13:20:27','2018-05-08 16:26:26'),(238,'La fuente empleada pertenece a las familias sans-serif (Arial, Helvética, Tahoma, Verdana).','2016-04-05 13:20:27','2018-05-08 16:26:26'),(239,'Al trabajar con texto, se utilizan dos estilos de letra cuando mucho, uno para la lectura y otro para los cabezales.','2016-04-05 13:20:27','2018-05-08 16:26:26'),(240,'Los títulos, subtítulos y contenidos están jerarquizados de una manera uniforme en relación con su color, tamaño y estilo de fuente (altas, bajas, negritas y cursivas).','2016-04-05 13:20:28','2018-05-08 16:26:26'),(241,'El formato de las imágenes incluidas en el recurso es GIF, JPEG, JPG y/o PNG.','2016-04-05 13:20:28','2018-05-08 16:26:26'),(242,'Las imágenes, animaciones y videos son acordes con el texto que las antecede.','2016-04-05 13:20:28','2018-05-08 16:26:26'),(243,'Los elementos multimedia (gráficos, fotografías, animaciones, videos, audio), tienen una adecuada calidad técnica y estética.','2016-04-05 13:20:28','2018-05-08 16:26:26'),(244,'Los recursos gráficos no se ven pixeleados ni se encuentran distorsionados de su tamaño original.','2016-04-05 13:20:28','2018-05-08 16:26:26'),(245,'Todos los mapas de contenidos y tablas tienen un diseño uniforme y acorde con la identidad gráfica del recurso.','2016-04-05 13:20:28','2018-05-08 16:26:26'),(246,'Si por el tamaño de una imagen se requiere habilitar ambas barras de desplazamiento, la imagen NO se presenta como pop-up, sino como archivo PDF en ventana emergente.','2016-04-05 13:20:28','2018-05-08 16:26:26'),(247,'Los formatos empleados en las animaciones son: GIF’s animados y/o SWF.','2016-04-05 13:20:28','2018-05-08 16:26:26'),(248,'Los archivos PDF están protegidos con contraseña para que no puedan ser modificados por el usuario y se permite su impresión a resolución baja.','2016-04-05 13:20:28','2018-05-08 16:26:26'),(249,'Los archivos PDF están optimizados para la web.','2016-04-05 13:20:28','2018-05-08 16:26:26'),(250,'Todos los archivos descargables (PDF, Word, PowerPoint, Excel, etc.) y las páginas de Internet externas a los contenidos del recurso se abren en una ventana nueva.','2016-04-05 13:20:29','2018-05-08 16:26:26'),(251,' En las presentaciones en PowerPoint se utilizan fuentes tipo Arial (sin patines) de manera jerárquica: 32pts. (títulos), 28 pts. (subtítulos) y 24 pts. (contenidos). ','2016-04-05 13:20:29','2018-05-08 16:26:26'),(252,' En las presentaciones en PowerPoint se utilizan fondos que contrasten con el texto para que puedan leerse con claridad. ','2016-04-05 13:20:29','2018-05-08 16:26:26'),(253,' En las presentaciones en PowerPoint se mantienen los criterios gráficos en todas las presentaciones del recurso.','2016-04-05 13:20:29','2018-05-08 16:26:26'),(254,' Las presentaciones en PowerPoint no contienen textos demasiado extensos. No se utiliza este formato para presentar solamente texto. Cada diapositiva incluye 10 renglones de texto o menos. ','2016-04-05 13:20:29','2018-05-08 16:26:26'),(255,' En las presentaciones en PowerPoint no se invaden los bordes del recuadro de la diapositiva con imágenes ni texto (existe un margen imaginario de 2.5% en los cuatro márgenes de la diapositiva). ','2016-04-05 13:20:29','2018-05-08 16:26:26'),(256,' En las presentaciones en PowerPoint las gráficas o imágenes son claras y visibles y no se forza el aumento de su tamaño original.','2016-04-05 13:20:29','2018-05-08 16:26:26'),(257,'Los archivos PowerPoint están publicados como PPS (presentación).','2016-04-05 13:20:29','2018-05-08 16:26:26'),(258,'Todos los archivos descargables de producción propia (PDF, Word, PowerPoint, Excel, etc.) tienen tratamiento de diseño gráfico, imágenes optimizadas y tooltips habilitados para las definiciones de glosario.','2016-04-05 13:20:29','2018-05-08 16:26:26'),(259,'Las imágenes de gran dimensión están cortadas en secciones (mapeo) para optimizar su peso y velocidad de descarga.','2016-04-05 13:20:29','2018-05-08 16:26:26'),(260,'La iconografía empleada se comprende sin previa experiencia computacional y su función se puede deducir de manera intuitiva o en su defecto se acompaña de textos que aclaran su significado.','2016-04-05 13:20:30','2018-05-08 16:26:26'),(261,'La iconografía del recurso es uniforme en todas sus secciones y pantallas.','2016-04-05 13:20:30','2018-05-08 16:26:26');
/*!40000 ALTER TABLE `evaluacion_tabla_reactivo` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_tabla_reactivo_BEFORE_INSERT`BEFORE INSERT ON `evaluacion_tabla_reactivo` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_tabla_reactivo_BEFORE_UPDATE` BEFORE UPDATE ON `evaluacion_tabla_reactivo` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluacion_tabla_tipo_recurso`
--

DROP TABLE IF EXISTS `evaluacion_tabla_tipo_recurso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_tabla_tipo_recurso` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `evaluaciontabla_id` bigint(20) DEFAULT NULL,
  `tiporecurso_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluacion_tabla_tipo_recurso_evaluaciontabla_44` (`evaluaciontabla_id`),
  KEY `ix_evaluacion_tabla_tipo_recurso_tiporecurso_45` (`tiporecurso_id`),
  CONSTRAINT `fk_evaluacion_tabla_tipo_recurso_evaluaciontabla_44` FOREIGN KEY (`evaluaciontabla_id`) REFERENCES `evaluacion_tabla` (`id`),
  CONSTRAINT `fk_evaluacion_tabla_tipo_recurso_tiporecurso_45` FOREIGN KEY (`tiporecurso_id`) REFERENCES `clasificador_tiporecurso` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15030 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_tabla_tipo_recurso`
--

LOCK TABLES `evaluacion_tabla_tipo_recurso` WRITE;
/*!40000 ALTER TABLE `evaluacion_tabla_tipo_recurso` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion_tabla_tipo_recurso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluacion_tabla_version`
--

DROP TABLE IF EXISTS `evaluacion_tabla_version`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_tabla_version` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `terminado` varchar(1) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_tabla_version`
--

LOCK TABLES `evaluacion_tabla_version` WRITE;
/*!40000 ALTER TABLE `evaluacion_tabla_version` DISABLE KEYS */;
INSERT INTO `evaluacion_tabla_version` VALUES (1,1,'S','2018-05-08 16:26:26','2018-08-13 09:18:28');
/*!40000 ALTER TABLE `evaluacion_tabla_version` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_tabla_version_BEFORE_INSERT`BEFORE INSERT ON `evaluacion_tabla_version` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluacion_tabla_version_BEFORE_UPDATE` BEFORE UPDATE ON `evaluacion_tabla_version` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluador`
--

DROP TABLE IF EXISTS `evaluador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluador` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `personal_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluador_personal_46` (`personal_id`),
  CONSTRAINT `fk_evaluador_personal_46` FOREIGN KEY (`personal_id`) REFERENCES `personal` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluador`
--

LOCK TABLES `evaluador` WRITE;
/*!40000 ALTER TABLE `evaluador` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluador` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluador_BEFORE_INSERT`BEFORE INSERT ON `evaluador` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluador_BEFORE_UPDATE` BEFORE UPDATE ON `evaluador` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `evaluador_aspecto`
--

DROP TABLE IF EXISTS `evaluador_aspecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluador_aspecto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `evaluador_id` bigint(20) NOT NULL,
  `aspecto_id` bigint(20) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_evaluador_aspecto_evaluador_47` (`evaluador_id`),
  KEY `ix_evaluador_aspecto_aspecto_48` (`aspecto_id`),
  CONSTRAINT `fk_evaluador_aspecto_aspecto_48` FOREIGN KEY (`aspecto_id`) REFERENCES `aspecto` (`id`),
  CONSTRAINT `fk_evaluador_aspecto_evaluador_47` FOREIGN KEY (`evaluador_id`) REFERENCES `evaluador` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluador_aspecto`
--

LOCK TABLES `evaluador_aspecto` WRITE;
/*!40000 ALTER TABLE `evaluador_aspecto` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluador_aspecto` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluador_aspecto_BEFORE_INSERT`BEFORE INSERT ON `evaluador_aspecto` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `evaluador_aspecto_BEFORE_UPDATE` BEFORE UPDATE ON `evaluador_aspecto` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `formatoentrega`
--

DROP TABLE IF EXISTS `formatoentrega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `formatoentrega` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formatoentrega`
--

LOCK TABLES `formatoentrega` WRITE;
/*!40000 ALTER TABLE `formatoentrega` DISABLE KEYS */;
INSERT INTO `formatoentrega` VALUES (1,'CD','2015-09-21 13:03:06','2018-05-08 16:26:25'),(2,'DVD','2015-09-21 13:03:06','2018-05-08 16:26:25'),(3,'Otro','2015-09-21 13:03:06','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `formatoentrega` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `formatoentrega_BEFORE_INSERT`BEFORE INSERT ON `formatoentrega` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `formatoentrega_BEFORE_UPDATE` BEFORE UPDATE ON `formatoentrega` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `historialestado`
--

DROP TABLE IF EXISTS `historialestado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historialestado` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) NOT NULL,
  `estado_id` bigint(20) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_historialestado_recurso_49` (`recurso_id`),
  KEY `ix_historialestado_estado_50` (`estado_id`),
  CONSTRAINT `fk_historialestado_estado_50` FOREIGN KEY (`estado_id`) REFERENCES `estado` (`id`),
  CONSTRAINT `fk_historialestado_recurso_49` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historialestado`
--

LOCK TABLES `historialestado` WRITE;
/*!40000 ALTER TABLE `historialestado` DISABLE KEYS */;
/*!40000 ALTER TABLE `historialestado` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `historialestado_BEFORE_INSERT`BEFORE INSERT ON `historialestado` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `historialestado_BEFORE_UPDATE` BEFORE UPDATE ON `historialestado` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `historialestado_encuesta`
--

DROP TABLE IF EXISTS `historialestado_encuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historialestado_encuesta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) NOT NULL,
  `estado_id` bigint(20) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_historialestado_encuesta_recurso_51` (`recurso_id`),
  KEY `ix_historialestado_encuesta_estado_52` (`estado_id`),
  CONSTRAINT `fk_historialestado_encuesta_estado_52` FOREIGN KEY (`estado_id`) REFERENCES `estado_encuesta` (`id`),
  CONSTRAINT `fk_historialestado_encuesta_recurso_51` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historialestado_encuesta`
--

LOCK TABLES `historialestado_encuesta` WRITE;
/*!40000 ALTER TABLE `historialestado_encuesta` DISABLE KEYS */;
/*!40000 ALTER TABLE `historialestado_encuesta` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `historialestado_encuesta_BEFORE_INSERT`BEFORE INSERT ON `historialestado_encuesta` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `historialestado_encuesta_BEFORE_UPDATE` BEFORE UPDATE ON `historialestado_encuesta` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `historialestado_evaluacion`
--

DROP TABLE IF EXISTS `historialestado_evaluacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historialestado_evaluacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) NOT NULL,
  `recursoevaluador_id` bigint(20) NOT NULL,
  `estado_id` bigint(20) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_historialestado_evaluacion_recurso_53` (`recurso_id`),
  KEY `ix_historialestado_evaluacion_recursoevaluador_54` (`recursoevaluador_id`),
  KEY `ix_historialestado_evaluacion_estado_55` (`estado_id`),
  CONSTRAINT `fk_historialestado_evaluacion_estado_55` FOREIGN KEY (`estado_id`) REFERENCES `estado_evaluacion` (`id`),
  CONSTRAINT `fk_historialestado_evaluacion_recurso_53` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`),
  CONSTRAINT `fk_historialestado_evaluacion_recursoevaluador_54` FOREIGN KEY (`recursoevaluador_id`) REFERENCES `recursoevaluador` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historialestado_evaluacion`
--

LOCK TABLES `historialestado_evaluacion` WRITE;
/*!40000 ALTER TABLE `historialestado_evaluacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `historialestado_evaluacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `historialestado_evaluacion_BEFORE_INSERT`BEFORE INSERT ON `historialestado_evaluacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `historialestado_evaluacion_BEFORE_UPDATE` BEFORE UPDATE ON `historialestado_evaluacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `modalidad`
--

DROP TABLE IF EXISTS `modalidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modalidad` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modalidad`
--

LOCK TABLES `modalidad` WRITE;
/*!40000 ALTER TABLE `modalidad` DISABLE KEYS */;
INSERT INTO `modalidad` VALUES (1,'Escolarizada','2015-09-21 13:03:04','2018-05-08 16:26:25'),(2,'No escolarizada','2015-09-21 13:03:04','2018-05-08 16:26:25'),(3,'Mixta','2015-09-21 13:03:04','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `modalidad` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `modalidad_BEFORE_INSERT`BEFORE INSERT ON `modalidad` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `modalidad_BEFORE_UPDATE` BEFORE UPDATE ON `modalidad` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `niveleducativo`
--

DROP TABLE IF EXISTS `niveleducativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `niveleducativo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `niveleducativo`
--

LOCK TABLES `niveleducativo` WRITE;
/*!40000 ALTER TABLE `niveleducativo` DISABLE KEYS */;
INSERT INTO `niveleducativo` VALUES (1,'Medio superior','2015-09-21 13:03:04','2018-05-08 16:26:22'),(2,'Superior','2015-09-21 13:03:04','2018-05-08 16:26:22'),(3,'Posgrado','2015-09-21 13:03:04','2018-05-08 16:26:22');
/*!40000 ALTER TABLE `niveleducativo` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `niveleducativo_BEFORE_INSERT`BEFORE INSERT ON `niveleducativo` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `niveleducativo_BEFORE_UPDATE` BEFORE UPDATE ON `niveleducativo` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `observacion`
--

DROP TABLE IF EXISTS `observacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `observacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `campo` varchar(255) DEFAULT NULL,
  `observacion` varchar(600) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_observacion_recurso_56` (`recurso_id`),
  CONSTRAINT `fk_observacion_recurso_56` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `observacion`
--

LOCK TABLES `observacion` WRITE;
/*!40000 ALTER TABLE `observacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `observacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `observacion_BEFORE_INSERT`BEFORE INSERT ON `observacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `observacion_BEFORE_UPDATE` BEFORE UPDATE ON `observacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `observacion_cancelacion`
--

DROP TABLE IF EXISTS `observacion_cancelacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `observacion_cancelacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `observacion` varchar(600) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_observacion_cancelacion_recurso_57` (`recurso_id`),
  CONSTRAINT `fk_observacion_cancelacion_recurso_57` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `observacion_cancelacion`
--

LOCK TABLES `observacion_cancelacion` WRITE;
/*!40000 ALTER TABLE `observacion_cancelacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `observacion_cancelacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `observacion_cancelacion_BEFORE_INSERT`BEFORE INSERT ON `observacion_cancelacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `observacion_cancelacion_BEFORE_UPDATE` BEFORE UPDATE ON `observacion_cancelacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `oficio`
--

DROP TABLE IF EXISTS `oficio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oficio` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `numero` varchar(255) NOT NULL,
  `folio` varchar(255) NOT NULL,
  `contenttype` varchar(255) DEFAULT NULL,
  `contenido` longblob,
  `nombrearchivo` varchar(255) DEFAULT NULL,
  `fechaoficio` datetime DEFAULT NULL,
  `fecharecepcion` datetime DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_oficio_recurso_58` (`recurso_id`),
  CONSTRAINT `fk_oficio_recurso_58` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oficio`
--

LOCK TABLES `oficio` WRITE;
/*!40000 ALTER TABLE `oficio` DISABLE KEYS */;
/*!40000 ALTER TABLE `oficio` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `oficio_BEFORE_INSERT`BEFORE INSERT ON `oficio` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `oficio_BEFORE_UPDATE` BEFORE UPDATE ON `oficio` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `oficio_valoracion`
--

DROP TABLE IF EXISTS `oficio_valoracion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oficio_valoracion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `numero` varchar(255) NOT NULL,
  `contenttype` varchar(255) DEFAULT NULL,
  `contenido` longblob,
  `nombrearchivo` varchar(255) DEFAULT NULL,
  `fechaoficio` datetime DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_oficio_valoracion_recurso_59` (`recurso_id`),
  CONSTRAINT `fk_oficio_valoracion_recurso_59` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oficio_valoracion`
--

LOCK TABLES `oficio_valoracion` WRITE;
/*!40000 ALTER TABLE `oficio_valoracion` DISABLE KEYS */;
/*!40000 ALTER TABLE `oficio_valoracion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `oficio_valoracion_BEFORE_INSERT`BEFORE INSERT ON `oficio_valoracion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `oficio_valoracion_BEFORE_UPDATE` BEFORE UPDATE ON `oficio_valoracion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `palabraclave`
--

DROP TABLE IF EXISTS `palabraclave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `palabraclave` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `descripcion` varchar(35) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_palabraclave_recurso_60` (`recurso_id`),
  CONSTRAINT `fk_palabraclave_recurso_60` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `palabraclave`
--

LOCK TABLES `palabraclave` WRITE;
/*!40000 ALTER TABLE `palabraclave` DISABLE KEYS */;
/*!40000 ALTER TABLE `palabraclave` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `palabraclave_BEFORE_INSERT`BEFORE INSERT ON `palabraclave` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `palabraclave_BEFORE_UPDATE` BEFORE UPDATE ON `palabraclave` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `personal`
--

DROP TABLE IF EXISTS `personal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personal` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `paterno` varchar(255) DEFAULT NULL,
  `materno` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `activo_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_personal_activo_61` (`activo_id`),
  CONSTRAINT `fk_personal_activo_61` FOREIGN KEY (`activo_id`) REFERENCES `estado_activo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal`
--

LOCK TABLES `personal` WRITE;
/*!40000 ALTER TABLE `personal` DISABLE KEYS */;
INSERT INTO `personal` VALUES (1,'Carlos','Pérez','Salazar','evaluardd@ipn.mx',2,'2015-09-21 13:03:08','2018-08-13 12:06:34'),(8,'Filiberto','Flores','Nogal','evaluardd@ipn.mx',2,'2018-05-03 12:00:00','2018-08-13 12:06:34');
/*!40000 ALTER TABLE `personal` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `personal_BEFORE_INSERT`BEFORE INSERT ON `personal` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `personal_BEFORE_UPDATE` BEFORE UPDATE ON `personal` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `recurso`
--

DROP TABLE IF EXISTS `recurso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recurso` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(150) NOT NULL,
  `areaconocimiento_id` bigint(20) NOT NULL,
  `niveleducativo_id` bigint(20) NOT NULL,
  `unidadmedida_id` bigint(20) DEFAULT NULL,
  `duracion` varchar(5) DEFAULT NULL,
  `unidadacademica_id` bigint(20) NOT NULL,
  `alcancecurricular_id` bigint(20) DEFAULT NULL,
  `alcancecurricularotro` varchar(120) DEFAULT NULL,
  `elaboracion` datetime NOT NULL,
  `programaacad` varchar(80) NOT NULL,
  `modalidad_id` bigint(20) NOT NULL,
  `version_id` bigint(20) NOT NULL,
  `sinopsis` varchar(250) DEFAULT NULL,
  `formatoentrega_id` bigint(20) NOT NULL,
  `formatoentregaotro` varchar(100) DEFAULT NULL,
  `url` varchar(80) DEFAULT NULL,
  `estado_id` bigint(20) DEFAULT NULL,
  `numcontrol` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_recurso_numcontrol` (`numcontrol`),
  KEY `ix_recurso_areaconocimiento_62` (`areaconocimiento_id`),
  KEY `ix_recurso_niveleducativo_63` (`niveleducativo_id`),
  KEY `ix_recurso_unidadmedida_64` (`unidadmedida_id`),
  KEY `ix_recurso_unidadacademica_65` (`unidadacademica_id`),
  KEY `ix_recurso_alcancecurricular_66` (`alcancecurricular_id`),
  KEY `ix_recurso_modalidad_67` (`modalidad_id`),
  KEY `ix_recurso_version_68` (`version_id`),
  KEY `ix_recurso_formatoentrega_69` (`formatoentrega_id`),
  KEY `ix_recurso_estado_70` (`estado_id`),
  CONSTRAINT `fk_recurso_alcancecurricular_66` FOREIGN KEY (`alcancecurricular_id`) REFERENCES `alcance_curricular` (`id`),
  CONSTRAINT `fk_recurso_areaconocimiento_62` FOREIGN KEY (`areaconocimiento_id`) REFERENCES `areaconocimiento` (`id`),
  CONSTRAINT `fk_recurso_estado_70` FOREIGN KEY (`estado_id`) REFERENCES `estado` (`id`),
  CONSTRAINT `fk_recurso_formatoentrega_69` FOREIGN KEY (`formatoentrega_id`) REFERENCES `formatoentrega` (`id`),
  CONSTRAINT `fk_recurso_modalidad_67` FOREIGN KEY (`modalidad_id`) REFERENCES `modalidad` (`id`),
  CONSTRAINT `fk_recurso_niveleducativo_63` FOREIGN KEY (`niveleducativo_id`) REFERENCES `niveleducativo` (`id`),
  CONSTRAINT `fk_recurso_unidadacademica_65` FOREIGN KEY (`unidadacademica_id`) REFERENCES `unidadacademica` (`id`),
  CONSTRAINT `fk_recurso_unidadmedida_64` FOREIGN KEY (`unidadmedida_id`) REFERENCES `unidad_medida` (`id`),
  CONSTRAINT `fk_recurso_version_68` FOREIGN KEY (`version_id`) REFERENCES `version` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recurso`
--

LOCK TABLES `recurso` WRITE;
/*!40000 ALTER TABLE `recurso` DISABLE KEYS */;
/*!40000 ALTER TABLE `recurso` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recurso_BEFORE_INSERT`
BEFORE INSERT ON `recurso` FOR EACH ROW
BEGIN
	declare auxNC varchar(255);
    declare existe boolean;

    ciclo:
		repeat
			set auxNC = conv(floor(rand() * 99999999999999), 20, 36);
			select count(numcontrol) into existe from recurso where numcontrol = auxNC;
		until existe = 0
		end repeat ciclo;
	set new.numcontrol = auxNC;
    if new.auditinsert is null then
		set new.auditinsert = current_timestamp();
    end if;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recurso_AFTER_INSERT`
AFTER INSERT ON `recurso` FOR EACH ROW
BEGIN
	insert into historialestado values (null, new.id, new.estado_id, null,now());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recurso_BEFORE_UPDATE`
BEFORE UPDATE ON `recurso` FOR EACH ROW
BEGIN
		set new.auditlastupdate = current_timestamp();
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recurso_AFTER_UPDATE`
AFTER UPDATE ON `recurso` FOR EACH ROW
BEGIN
	insert into historialestado values (null, new.id, new.estado_id, null,now());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `recurso_autor`
--

DROP TABLE IF EXISTS `recurso_autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recurso_autor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `autorfuncion_id` bigint(20) DEFAULT NULL,
  `otrafuncion` varchar(255) DEFAULT NULL,
  `paterno` varchar(35) DEFAULT NULL,
  `materno` varchar(35) DEFAULT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_recurso_autor_recurso_71` (`recurso_id`),
  KEY `ix_recurso_autor_autorfuncion_72` (`autorfuncion_id`),
  CONSTRAINT `fk_recurso_autor_autorfuncion_72` FOREIGN KEY (`autorfuncion_id`) REFERENCES `autorfuncion` (`id`),
  CONSTRAINT `fk_recurso_autor_recurso_71` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recurso_autor`
--

LOCK TABLES `recurso_autor` WRITE;
/*!40000 ALTER TABLE `recurso_autor` DISABLE KEYS */;
/*!40000 ALTER TABLE `recurso_autor` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recurso_autor_BEFORE_INSERT`BEFORE INSERT ON `recurso_autor` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recurso_autor_BEFORE_UPDATE` BEFORE UPDATE ON `recurso_autor` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `recurso_dirigidoa`
--

DROP TABLE IF EXISTS `recurso_dirigidoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recurso_dirigidoa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `dirigidoa_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_recurso_dirigidoa_recurso_94` (`recurso_id`),
  KEY `ix_recurso_dirigidoa_dirigidoa_95` (`dirigidoa_id`),
  CONSTRAINT `fk_recurso_dirigidoa_dirigidoa_95` FOREIGN KEY (`dirigidoa_id`) REFERENCES `dirigidoa` (`id`),
  CONSTRAINT `fk_recurso_dirigidoa_recurso_94` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recurso_dirigidoa`
--

LOCK TABLES `recurso_dirigidoa` WRITE;
/*!40000 ALTER TABLE `recurso_dirigidoa` DISABLE KEYS */;
/*!40000 ALTER TABLE `recurso_dirigidoa` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recurso_dirigidoa_BEFORE_INSERT`BEFORE INSERT ON `recurso_dirigidoa` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recurso_dirigidoa_BEFORE_UPDATE` BEFORE UPDATE ON `recurso_dirigidoa` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `recursoenweb`
--

DROP TABLE IF EXISTS `recursoenweb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recursoenweb` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `usuario` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_recursoenweb_recurso_73` (`recurso_id`),
  CONSTRAINT `fk_recursoenweb_recurso_73` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recursoenweb`
--

LOCK TABLES `recursoenweb` WRITE;
/*!40000 ALTER TABLE `recursoenweb` DISABLE KEYS */;
/*!40000 ALTER TABLE `recursoenweb` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recursoenweb_BEFORE_INSERT`BEFORE INSERT ON `recursoenweb` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recursoenweb_BEFORE_UPDATE` BEFORE UPDATE ON `recursoenweb` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `recursoevaluador`
--

DROP TABLE IF EXISTS `recursoevaluador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recursoevaluador` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `aspecto_id` bigint(20) DEFAULT NULL,
  `evaluador_id` bigint(20) DEFAULT NULL,
  `estadoevaluacion_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_recursoevaluador_recurso_74` (`recurso_id`),
  KEY `ix_recursoevaluador_aspecto_75` (`aspecto_id`),
  KEY `ix_recursoevaluador_evaluador_76` (`evaluador_id`),
  KEY `ix_recursoevaluador_estadoevaluacion_77` (`estadoevaluacion_id`),
  CONSTRAINT `fk_recursoevaluador_aspecto_75` FOREIGN KEY (`aspecto_id`) REFERENCES `aspecto` (`id`),
  CONSTRAINT `fk_recursoevaluador_estadoevaluacion_77` FOREIGN KEY (`estadoevaluacion_id`) REFERENCES `estado_evaluacion` (`id`),
  CONSTRAINT `fk_recursoevaluador_evaluador_76` FOREIGN KEY (`evaluador_id`) REFERENCES `evaluador` (`id`),
  CONSTRAINT `fk_recursoevaluador_recurso_74` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recursoevaluador`
--

LOCK TABLES `recursoevaluador` WRITE;
/*!40000 ALTER TABLE `recursoevaluador` DISABLE KEYS */;
/*!40000 ALTER TABLE `recursoevaluador` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recursoevaluador_BEFORE_INSERT`BEFORE INSERT ON `recursoevaluador` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `recursoevaluador_BEFORE_UPDATE` BEFORE UPDATE ON `recursoevaluador` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `registro_acceso`
--

DROP TABLE IF EXISTS `registro_acceso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registro_acceso` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `usuario_id` bigint(20) DEFAULT NULL,
  `autor_id` bigint(20) DEFAULT NULL,
  `ruta` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_registro_acceso_usuario_78` (`usuario_id`),
  KEY `ix_registro_acceso_autor_79` (`autor_id`),
  CONSTRAINT `fk_registro_acceso_autor_79` FOREIGN KEY (`autor_id`) REFERENCES `recurso_autor` (`id`),
  CONSTRAINT `fk_registro_acceso_usuario_78` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro_acceso`
--

LOCK TABLES `registro_acceso` WRITE;
/*!40000 ALTER TABLE `registro_acceso` DISABLE KEYS */;
/*!40000 ALTER TABLE `registro_acceso` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `registro_acceso_BEFORE_INSERT`BEFORE INSERT ON `registro_acceso` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `registro_acceso_BEFORE_UPDATE` BEFORE UPDATE ON `registro_acceso` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rol` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,'Administrador de sistema','2015-09-21 13:03:04','2018-05-02 14:20:02'),(2,'Evaluador','2015-09-21 13:03:04','2018-05-02 14:20:02'),(3,'Coordinador proceso ERDD','2018-05-03 12:00:00','2018-05-03 12:00:00');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `rol_BEFORE_INSERT`BEFORE INSERT ON `rol` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `rol_BEFORE_UPDATE` BEFORE UPDATE ON `rol` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `solicitud_cancelacion`
--

DROP TABLE IF EXISTS `solicitud_cancelacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solicitud_cancelacion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `evaluador_id` bigint(20) DEFAULT NULL,
  `recursoestadoanterior_id` bigint(20) DEFAULT NULL,
  `motivo_cancelacion` varchar(255) DEFAULT NULL,
  `observacion` varchar(255) DEFAULT NULL,
  `fecha_solicitud` datetime NOT NULL,
  `aceptada` tinyint(1) DEFAULT '0',
  `fecha_aceptacion` datetime DEFAULT NULL,
  `fecha_reactivacion` datetime DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_solicitud_cancelacion_recurso_80` (`recurso_id`),
  KEY `ix_solicitud_cancelacion_evaluador_81` (`evaluador_id`),
  KEY `ix_solicitud_cancelacion_recursoestadoanterior_82` (`recursoestadoanterior_id`),
  CONSTRAINT `fk_solicitud_cancelacion_evaluador_81` FOREIGN KEY (`evaluador_id`) REFERENCES `evaluador` (`id`),
  CONSTRAINT `fk_solicitud_cancelacion_recurso_80` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`),
  CONSTRAINT `fk_solicitud_cancelacion_recursoestadoanterior_82` FOREIGN KEY (`recursoestadoanterior_id`) REFERENCES `estado` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitud_cancelacion`
--

LOCK TABLES `solicitud_cancelacion` WRITE;
/*!40000 ALTER TABLE `solicitud_cancelacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `solicitud_cancelacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `solicitud_cancelacion_BEFORE_INSERT`BEFORE INSERT ON `solicitud_cancelacion` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `solicitud_cancelacion_BEFORE_UPDATE` BEFORE UPDATE ON `solicitud_cancelacion` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `tipodocumento`
--

DROP TABLE IF EXISTS `tipodocumento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipodocumento` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado_id` bigint(20) DEFAULT NULL,
  `obligatorio` int(11) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_tipodocumento_estado_83` (`estado_id`),
  CONSTRAINT `fk_tipodocumento_estado_83` FOREIGN KEY (`estado_id`) REFERENCES `estado_activo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipodocumento`
--

LOCK TABLES `tipodocumento` WRITE;
/*!40000 ALTER TABLE `tipodocumento` DISABLE KEYS */;
INSERT INTO `tipodocumento` VALUES (1,'Planeación didáctica validada por la Dirección de Coordinación',2,0,'2015-09-21 13:03:07','2018-05-08 16:26:25'),(2,'Manual de instalación, instructivo o guía para el usuario del recurso didáctico digital',2,1,'2015-09-21 13:03:07','2018-05-08 16:26:25'),(3,'Formato de estrategia didáctica para el uso del recurso',2,1,'2015-09-21 13:03:07','2018-05-08 16:26:25'),(4,'Carta de cesión de derechos de autor a favor del IPN',2,1,'2015-09-21 13:03:07','2018-05-08 16:26:25'),(5,'Registro de autoría en Creative Commons',2,1,'2015-09-21 13:03:07','2018-05-08 16:26:25'),(6,'Constancia de validación académica (con sello y firma)',2,1,'2015-09-21 13:03:07','2018-05-08 16:26:25'),(7,'Manual de uso',2,0,'2015-09-21 13:03:07','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `tipodocumento` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `tipodocumento_BEFORE_INSERT`BEFORE INSERT ON `tipodocumento` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `tipodocumento_BEFORE_UPDATE` BEFORE UPDATE ON `tipodocumento` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `unidad_medida`
--

DROP TABLE IF EXISTS `unidad_medida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unidad_medida` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidad_medida`
--

LOCK TABLES `unidad_medida` WRITE;
/*!40000 ALTER TABLE `unidad_medida` DISABLE KEYS */;
INSERT INTO `unidad_medida` VALUES (1,'Horas','2018-01-01 12:00:00','2018-01-01 12:00:00'),(2,'Días','2018-01-01 12:00:00','2018-01-01 12:00:00'),(3,'Semanas','2018-01-01 12:00:00','2018-01-01 12:00:00'),(4,'Meses','2018-01-01 12:00:00','2018-01-01 12:00:00'),(5,'Semestres','2018-01-01 12:00:00','2018-01-01 12:00:00');
/*!40000 ALTER TABLE `unidad_medida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidadacademica`
--

DROP TABLE IF EXISTS `unidadacademica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unidadacademica` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidadacademica`
--

LOCK TABLES `unidadacademica` WRITE;
/*!40000 ALTER TABLE `unidadacademica` DISABLE KEYS */;
INSERT INTO `unidadacademica` VALUES (1,'Centro de Educación Continua Unidad Allende','2015-09-21 13:03:04','2018-05-08 16:26:22'),(2,'Centro de Educación Continua Unidad Campeche','2015-09-21 13:03:04','2018-05-08 16:26:22'),(3,'Centro de Educación Continua Unidad Cancún','2015-09-21 13:03:04','2018-05-08 16:26:22'),(4,'Centro de Educación Continua Unidad Culiacán','2015-09-21 13:03:04','2018-05-08 16:26:22'),(5,'Centro de Educación Continua Unidad Mazatlán','2015-09-21 13:03:04','2018-05-08 16:26:22'),(6,'Centro de Educación Continua Unidad Mochis','2015-09-21 13:03:04','2018-05-08 16:26:22'),(7,'Centro de Educación Continua Unidad Morelia','2015-09-21 13:03:04','2018-05-08 16:26:22'),(8,'Centro de Educación Continua Unidad Oaxaca','2015-09-21 13:03:04','2018-05-08 16:26:22'),(9,'Centro de Educación Continua Unidad Reynosa','2015-09-21 13:03:04','2018-05-08 16:26:22'),(10,'Centro de Educación Continua Unidad Tampico','2015-09-21 13:03:04','2018-05-08 16:26:22'),(11,'Centro de Educación Continua Unidad Tijuana','2015-09-21 13:03:04','2018-05-08 16:26:22'),(12,'Centro de Educación Continua Unidad Tlaxcala','2015-09-21 13:03:04','2018-05-08 16:26:22'),(13,'Centro de Biotecnología Genómica','2015-09-21 13:03:04','2018-05-08 16:26:22'),(14,'Centro de Desarrollo de Productos Bióticos','2015-09-21 13:03:05','2018-05-08 16:26:22'),(15,'Centro de Innovación y Desarrollo Tecnológico en Cómputo','2015-09-21 13:03:05','2018-05-08 16:26:22'),(16,'Centro de Investigación e Innovación Tecnológica Azcapotzalco','2015-09-21 13:03:05','2018-05-08 16:26:22'),(17,'Centro de Investigación en Biotecnología Aplicada IPN Tlaxcala','2015-09-21 13:03:05','2018-05-08 16:26:22'),(18,'Centro de Investigación en Ciencia Aplicada y Tecnología Avanzada Unidad Altamira','2015-09-21 13:03:05','2018-05-08 16:26:22'),(19,'Centro de Investigación en Ciencia Aplicada y Tecnología Avanzada Unidad Legaria','2015-09-21 13:03:05','2018-05-08 16:26:22'),(20,'Centro de Investigación en Ciencia Aplicada y Tecnología Avanzada Unidad Querétaro','2015-09-21 13:03:05','2018-05-08 16:26:22'),(21,'Centro de Investigación en Computación','2015-09-21 13:03:05','2018-05-08 16:26:22'),(22,'Centro de Investigación y Desarrollo de Tecnología Digital Tijuana','2015-09-21 13:03:05','2018-05-08 16:26:22'),(23,'Centro de Investigaciones Económicas Administrativas y Sociales','2015-09-21 13:03:05','2018-05-08 16:26:22'),(24,'Centro de Nanociencias Micro y Nanotecnologías','2015-09-21 13:03:05','2018-05-08 16:26:22'),(25,'Centro Interdisciplinario de Ciencias Marinas','2015-09-21 13:03:05','2018-05-08 16:26:22'),(26,'Centro Interdisciplinario de Investigación para el Desarrollo Integral Regional Unidad Durango','2015-09-21 13:03:05','2018-05-08 16:26:22'),(27,'Centro Interdisciplinario de Investigación para el Desarrollo Integral Regional Unidad Michoacán','2015-09-21 13:03:05','2018-05-08 16:26:22'),(28,'Centro Interdisciplinario de Investigación para el Desarrollo Integral Regional Unidad Oaxaca','2015-09-21 13:03:05','2018-05-08 16:26:22'),(29,'Centro Interdisciplinario de Investigación para el Desarrollo Integral Regional Unidad Sinaloa Guasave','2015-09-21 13:03:05','2018-05-08 16:26:22'),(30,'Centro Interdisciplinario de Investigación y Estudios Sobre Medio Ambiente y Desarrollo','2015-09-21 13:03:05','2018-05-08 16:26:22'),(31,'Centro Mexicano para la Producción más Limpia','2015-09-21 13:03:05','2018-05-08 16:26:22'),(32,'Centro de Estudios Científicos y Tecnológicos No. 1 \"Gonzalo Vázquez Vela\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(33,'Centro de Estudios Científicos y Tecnológicos No. 2 \"Miguel Bernard\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(34,'Centro de Estudios Científicos y Tecnológicos No. 3 \"Estanislao Ramírez Ruiz\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(35,'Centro de Estudios Científicos y Tecnológicos No. 4 \"Lázaro Cárdenas\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(36,'Centro de Estudios Científicos y Tecnológicos No. 5 \"Benito Juárez García\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(37,'Centro de Estudios Científicos y Tecnológicos No. 6 \"Miguel Othón de Mendizábal\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(38,'Centro de Estudios Científicos y Tecnológicos No. 7 \"Cuauhtémoc\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(39,'Centro de Estudios Científicos y Tecnológicos No. 8 \"Narciso Bassols García\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(40,'Centro de Estudios Científicos y Tecnológicos No. 9 \"Juan de Dios Bátiz\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(41,'Centro de Estudios Científicos y Tecnológicos No. 10 \"Carlos Vallejo Márquez\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(42,'Centro de Estudios Científicos y Tecnológicos No. 11 \"Wilfrido Massieu Pérez\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(43,'Centro de Estudios Científicos y Tecnológicos No. 12 \"José María Morelos y Pavón\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(44,'Centro de Estudios Científicos y Tecnológicos No. 13 \"Ricardo Flores Magón\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(45,'Centro de Estudios Científicos y Tecnológicos No. 14 \"Luis Enrique Erro\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(46,'Centro de Estudios Científicos y Tecnológicos No. 15 \"Diódoro Antúnez Echegaray\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(47,'Centro de Estudios Tecnológicos No.1 \"Walter Cross Buchanan\"','2015-09-21 13:03:05','2018-05-08 16:26:22'),(48,'Centro Interdisciplinario de Ciencias de la Salud Unidad Milpa Alta (CICS)','2015-09-21 13:03:05','2018-05-08 16:26:22'),(49,'Centro Interdisciplinario de Ciencias de la Salud Unidad Santo Tomás (CICS)','2015-09-21 13:03:05','2018-05-08 16:26:22'),(50,'Escuela Nacional de Ciencias Biológicas Unidad Santo Tomás (ENCB)','2015-09-21 13:03:05','2018-05-08 16:26:22'),(51,'Escuela Nacional de Ciencias Biológicas Unidad Zacatenco (ENCB)','2015-09-21 13:03:05','2018-05-08 16:26:22'),(52,'Escuela Nacional de Medicina y Homeopatía (ENMH)','2015-09-21 13:03:05','2018-05-08 16:26:22'),(53,'Escuela Superior de Comercio y Administración Unidad Santo Tomás (ESCA)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(54,'Escuela Superior de Comercio y Administración Unidad Tepepan (ESCA)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(55,'Escuela Superior de Cómputo (ESCOM)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(56,'Escuela Superior de Economía (ESE)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(57,'Escuela Superior De Enfermería Y Obstetricia (ESEO)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(58,'Escuela Superior de Física y Matemáticas (ESFM)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(59,'Escuela Superior de Ingeniería Mecánica y Eléctrica Unidad Azcapotzalco (ESIME)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(60,'Escuela Superior de Ingeniería Mecánica y Eléctrica Unidad Culhuacán (ESIME)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(61,'Escuela Superior de Ingeniería Mecánica y Eléctrica Unidad Ticomán (ESIME)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(62,'Escuela Superior de Ingeniería Mecánica y Eléctrica Unidad Zacatenco (ESIME)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(63,'Escuela Superior de Ingeniería Química e Industrias Extractivas (ESIQIE)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(64,'Escuela Superior de Ingeniería Textil (ESIT)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(65,'Escuela Superior de Ingeniería y Arquitectura Unidad Tecamachalco (ESIA)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(66,'Escuela Superior de Ingeniería y Arquitectura Unidad Ticomán (ESIA)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(67,'Escuela Superior de Ingeniería y Arquitectura Unidad Zacatenco (ESIA)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(68,'Escuela Superior de Medicina (ESM)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(69,'Escuela Superior de Turismo (EST)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(70,'TechnoPoli','2015-09-21 13:03:06','2018-05-08 16:26:22'),(71,'Unidad Profesional Interdisciplinaria de Biotecnología (UPIBI)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(72,'Unidad Profesional Interdisciplinaria de Ingeniería Campus Zacatecas (UPIIZ)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(73,'Unidad Profesional Interdisciplinaria de Ingeniería y Ciencias Sociales y Administrativas (UPIICSA)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(74,'Unidad Profesional Interdisciplinaria en Ingeniería Campus Guanajuato (UPIIG)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(75,'Unidad Profesional Interdisciplinaria en Ingeniería y Tecnologías Avanzadas (UPIITA)','2015-09-21 13:03:06','2018-05-08 16:26:22'),(76,'0escuela superior de supremacia mexicana','2018-05-08 19:51:05','2018-05-08 19:51:38');
/*!40000 ALTER TABLE `unidadacademica` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `unidadacademica_BEFORE_INSERT`BEFORE INSERT ON `unidadacademica` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `unidadacademica_BEFORE_UPDATE` BEFORE UPDATE ON `unidadacademica` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `unidadacademica_areaconocimiento`
--

DROP TABLE IF EXISTS `unidadacademica_areaconocimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unidadacademica_areaconocimiento` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `unidadacademica_id` bigint(20) DEFAULT NULL,
  `area_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_unidadacademica_areaconocimiento_unidadacademica_84` (`unidadacademica_id`),
  KEY `ix_unidadacademica_areaconocimiento_area_85` (`area_id`),
  CONSTRAINT `fk_unidadacademica_areaconocimiento_area_85` FOREIGN KEY (`area_id`) REFERENCES `areaconocimiento` (`id`),
  CONSTRAINT `fk_unidadacademica_areaconocimiento_unidadacademica_84` FOREIGN KEY (`unidadacademica_id`) REFERENCES `unidadacademica` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidadacademica_areaconocimiento`
--

LOCK TABLES `unidadacademica_areaconocimiento` WRITE;
/*!40000 ALTER TABLE `unidadacademica_areaconocimiento` DISABLE KEYS */;
INSERT INTO `unidadacademica_areaconocimiento` VALUES (5,13,3,'2018-04-03 13:16:04','2018-04-03 13:16:04'),(7,14,3,'2018-04-03 13:17:50','2018-04-03 13:17:50'),(17,73,4,'2018-04-03 16:31:19','2018-04-03 16:31:19'),(18,75,4,'2018-04-03 16:31:35','2018-04-03 16:31:35'),(19,74,4,'2018-04-03 16:31:50','2018-04-03 16:31:50'),(22,72,4,'2018-04-03 16:32:41','2018-04-03 16:32:41'),(23,71,4,'2018-04-03 16:32:58','2018-04-03 16:32:58'),(24,68,3,'2018-04-03 16:39:22','2018-04-03 16:39:22'),(28,2,4,'2018-04-03 16:40:16','2018-04-03 16:40:16'),(30,5,4,'2018-04-03 16:40:32','2018-04-03 16:40:32'),(31,6,4,'2018-04-03 16:40:40','2018-04-03 16:40:40'),(32,7,4,'2018-04-03 16:40:49','2018-04-03 16:40:49'),(33,4,4,'2018-04-03 16:42:47','2018-04-03 16:42:47'),(34,9,4,'2018-04-03 16:42:57','2018-04-03 16:42:57'),(35,8,4,'2018-04-03 16:43:07','2018-04-03 16:43:07'),(36,10,4,'2018-04-03 16:43:26','2018-04-03 16:43:26'),(37,11,4,'2018-04-03 16:43:37','2018-04-03 16:43:37'),(38,12,4,'2018-04-03 16:43:48','2018-04-03 16:43:48'),(39,50,3,'2018-04-03 16:44:17','2018-04-03 16:44:17'),(40,17,3,'2018-04-03 16:45:30','2018-04-03 16:45:30'),(41,18,2,'2018-04-03 16:46:53','2018-04-03 16:46:53'),(43,58,2,'2018-04-03 16:48:01','2018-04-03 16:48:01'),(44,57,3,'2018-04-03 16:48:42','2018-04-03 16:48:42'),(45,62,2,'2018-04-03 16:49:28','2018-04-03 16:49:28'),(46,56,1,'2018-04-03 16:49:48','2018-04-03 16:49:48'),(47,55,2,'2018-04-03 16:50:39','2018-04-03 16:50:39'),(48,69,1,'2018-04-03 16:51:31','2018-04-03 16:51:31'),(49,59,2,'2018-04-03 16:52:16','2018-04-03 16:52:16'),(50,32,2,'2018-04-03 17:20:36','2018-04-03 17:20:36'),(51,41,2,'2018-04-03 17:22:02','2018-04-03 17:22:02'),(52,42,2,'2018-04-03 17:22:30','2018-04-03 17:22:30'),(53,43,1,'2018-04-03 17:23:11','2018-04-03 17:23:11'),(54,33,2,'2018-04-03 17:25:30','2018-04-03 17:25:30'),(55,34,2,'2018-04-03 17:25:41','2018-04-03 17:25:41'),(56,35,2,'2018-04-03 17:25:55','2018-04-03 17:25:55'),(57,38,2,'2018-04-03 17:26:02','2018-04-03 17:26:02'),(58,39,2,'2018-04-03 17:26:11','2018-04-03 17:26:11'),(59,40,2,'2018-04-03 17:26:32','2018-04-03 17:26:32'),(60,47,2,'2018-04-03 17:26:50','2018-04-03 17:26:50'),(62,46,3,'2018-04-03 17:27:31','2018-04-03 17:27:31'),(63,44,1,'2018-04-03 17:27:56','2018-04-03 17:27:56'),(64,45,1,'2018-04-03 17:28:05','2018-04-03 17:28:05'),(65,36,1,'2018-04-03 17:28:13','2018-04-03 17:28:13'),(66,15,2,'2018-04-03 17:30:00','2018-04-03 17:30:00'),(67,16,2,'2018-04-03 17:30:39','2018-04-03 17:30:39'),(68,20,4,'2018-04-03 17:31:27','2018-04-03 17:31:27'),(70,53,1,'2018-04-03 17:32:51','2018-04-03 17:32:51'),(71,25,4,'2018-04-04 11:26:00','2018-04-04 11:26:00'),(72,1,4,'2018-04-04 11:27:03','2018-04-04 11:27:03'),(73,21,4,'2018-04-04 12:34:22','2018-04-04 12:34:22'),(74,19,2,'2018-04-04 15:21:46','2018-04-04 15:21:46'),(75,37,3,'2018-04-04 16:52:18','2018-04-04 16:52:18'),(76,3,4,'2018-04-05 09:16:21','2018-04-05 09:16:21'),(78,76,4,'2018-05-08 19:51:39','2018-05-08 19:51:39');
/*!40000 ALTER TABLE `unidadacademica_areaconocimiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidadacademica_niveleducativo`
--

DROP TABLE IF EXISTS `unidadacademica_niveleducativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unidadacademica_niveleducativo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `unidadacademica_id` bigint(20) DEFAULT NULL,
  `nivel_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_unidadacademica_niveleducativo_unidadacademica_86` (`unidadacademica_id`),
  KEY `ix_unidadacademica_niveleducativo_nivel_87` (`nivel_id`),
  CONSTRAINT `fk_unidadacademica_niveleducativo_nivel_87` FOREIGN KEY (`nivel_id`) REFERENCES `niveleducativo` (`id`),
  CONSTRAINT `fk_unidadacademica_niveleducativo_unidadacademica_86` FOREIGN KEY (`unidadacademica_id`) REFERENCES `unidadacademica` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidadacademica_niveleducativo`
--

LOCK TABLES `unidadacademica_niveleducativo` WRITE;
/*!40000 ALTER TABLE `unidadacademica_niveleducativo` DISABLE KEYS */;
INSERT INTO `unidadacademica_niveleducativo` VALUES (10,13,3,'2018-04-03 10:10:13','2018-04-03 10:10:13'),(11,13,2,'2018-04-03 10:10:13','2018-04-03 10:10:13'),(12,13,1,'2018-04-03 10:10:13','2018-04-03 10:10:13'),(16,2,3,'2018-04-03 11:50:04','2018-04-03 11:50:04'),(17,14,2,'2018-04-03 11:55:20','2018-04-03 11:55:20'),(18,14,3,'2018-04-03 11:55:20','2018-04-03 11:55:20'),(22,73,3,'2018-04-03 11:59:46','2018-04-03 11:59:46'),(23,73,2,'2018-04-03 11:59:46','2018-04-03 11:59:46'),(24,32,1,'2018-04-03 12:00:07','2018-04-03 12:00:07'),(25,41,1,'2018-04-03 12:00:17','2018-04-03 12:00:17'),(26,42,1,'2018-04-03 12:00:24','2018-04-03 12:00:24'),(27,43,1,'2018-04-03 12:00:29','2018-04-03 12:00:29'),(28,44,1,'2018-04-03 12:00:36','2018-04-03 12:00:36'),(29,45,1,'2018-04-03 12:00:46','2018-04-03 12:00:46'),(30,46,1,'2018-04-03 12:00:53','2018-04-03 12:00:53'),(31,33,1,'2018-04-03 12:01:04','2018-04-03 12:01:04'),(32,34,1,'2018-04-03 12:01:23','2018-04-03 12:01:23'),(33,35,1,'2018-04-03 12:01:33','2018-04-03 12:01:33'),(34,36,1,'2018-04-03 12:01:41','2018-04-03 12:01:41'),(35,37,1,'2018-04-03 12:01:54','2018-04-03 12:01:54'),(36,38,1,'2018-04-03 12:02:02','2018-04-03 12:02:02'),(37,39,1,'2018-04-03 12:02:10','2018-04-03 12:02:10'),(38,40,1,'2018-04-03 12:02:18','2018-04-03 12:02:18'),(39,47,1,'2018-04-03 12:02:30','2018-04-03 12:02:30'),(40,55,3,'2018-04-03 12:03:05','2018-04-03 12:03:05'),(41,55,2,'2018-04-03 12:03:05','2018-04-03 12:03:05'),(42,57,2,'2018-04-03 12:06:26','2018-04-03 12:06:26'),(43,58,2,'2018-04-03 12:07:10','2018-04-03 12:07:10'),(44,50,3,'2018-04-03 12:07:59','2018-04-03 12:07:59'),(45,50,2,'2018-04-03 12:07:59','2018-04-03 12:07:59'),(47,56,2,'2018-04-03 12:09:05','2018-04-03 12:09:05'),(48,75,2,'2018-04-03 12:10:03','2018-04-03 12:10:03'),(49,74,2,'2018-04-03 12:11:08','2018-04-03 12:11:08'),(51,76,3,'2018-05-08 19:51:39','2018-05-08 19:51:39');
/*!40000 ALTER TABLE `unidadacademica_niveleducativo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `personal_id` bigint(20) DEFAULT NULL,
  `usuario` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_usuario_personal_88` (`personal_id`),
  CONSTRAINT `fk_usuario_personal_88` FOREIGN KEY (`personal_id`) REFERENCES `personal` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,1,'e1','e1','2015-05-25 12:30:01','2018-05-08 16:26:22'),(8,8,'e2','e2','2018-05-03 12:00:00','2018-05-03 12:00:00');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `usuario_BEFORE_INSERT`BEFORE INSERT ON `usuario` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `usuario_BEFORE_UPDATE` BEFORE UPDATE ON `usuario` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `usuario_rol`
--

DROP TABLE IF EXISTS `usuario_rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_rol` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `usuario_id` bigint(20) DEFAULT NULL,
  `rol_id` bigint(20) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_usuario_rol_usuario_89` (`usuario_id`),
  KEY `ix_usuario_rol_rol_90` (`rol_id`),
  CONSTRAINT `fk_usuario_rol_rol_90` FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`),
  CONSTRAINT `fk_usuario_rol_usuario_89` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_rol`
--

LOCK TABLES `usuario_rol` WRITE;
/*!40000 ALTER TABLE `usuario_rol` DISABLE KEYS */;
INSERT INTO `usuario_rol` VALUES (1,1,1,'2015-06-29 13:00:06','2018-05-08 16:26:22'),(8,8,3,'2018-05-03 12:00:00','2018-05-03 12:00:00');
/*!40000 ALTER TABLE `usuario_rol` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `usuario_rol_BEFORE_INSERT`BEFORE INSERT ON `usuario_rol` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `usuario_rol_BEFORE_UPDATE` BEFORE UPDATE ON `usuario_rol` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `version`
--

DROP TABLE IF EXISTS `version`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `version` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `version`
--

LOCK TABLES `version` WRITE;
/*!40000 ALTER TABLE `version` DISABLE KEYS */;
INSERT INTO `version` VALUES (1,'Obra nueva','2015-09-21 13:03:06','2018-05-08 16:26:25'),(2,'Actualización','2015-09-21 13:03:06','2018-05-08 16:26:25');
/*!40000 ALTER TABLE `version` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `version_BEFORE_INSERT`BEFORE INSERT ON `version` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `version_BEFORE_UPDATE` BEFORE UPDATE ON `version` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `versionanterior`
--

DROP TABLE IF EXISTS `versionanterior`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `versionanterior` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `recurso_id` bigint(20) DEFAULT NULL,
  `recursoanterior_id` bigint(20) NOT NULL,
  `auditinsert` datetime NOT NULL,
  `auditlastupdate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_versionanterior_recurso_91` (`recurso_id`),
  KEY `ix_versionanterior_recursoanterior_92` (`recursoanterior_id`),
  CONSTRAINT `fk_versionanterior_recurso_91` FOREIGN KEY (`recurso_id`) REFERENCES `recurso` (`id`),
  CONSTRAINT `fk_versionanterior_recursoanterior_92` FOREIGN KEY (`recursoanterior_id`) REFERENCES `recurso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `versionanterior`
--

LOCK TABLES `versionanterior` WRITE;
/*!40000 ALTER TABLE `versionanterior` DISABLE KEYS */;
/*!40000 ALTER TABLE `versionanterior` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `versionanterior_BEFORE_INSERT`BEFORE INSERT ON `versionanterior` FOR EACH ROW BEGIN  if (new.auditinsert is null) then     set new.auditinsert = current_timestamp();   end if; END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 */ /*!50003 TRIGGER `versionanterior_BEFORE_UPDATE` BEFORE UPDATE ON `versionanterior` FOR EACH ROW BEGIN    set new.auditlastupdate = current_timestamp(); END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'erdd'
--

--
-- Dumping routines for database 'erdd'
--
/*!50003 DROP FUNCTION IF EXISTS `EvaluacionEstado` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE  FUNCTION `EvaluacionEstado`(edo int) RETURNS bigint(20)
BEGIN
    DECLARE reslutval BIGINT;
    SET reslutval := 0;
	select count(*)	into reslutval from(
		select recurso_id  from recursoevaluador
		where estadoevaluacion_id = edo
		group by recurso_id
		order by recurso_id
		) auxiliar;
    RETURN reslutval;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `VersionActual` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE  FUNCTION `VersionActual`() RETURNS bigint(20)
BEGIN
    DECLARE reslutval BIGINT;
    SET reslutval := 0;
		select max(version) into reslutval from evaluacion_tabla_version;
    RETURN reslutval;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `VersionActualTerminada` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE  FUNCTION `VersionActualTerminada`() RETURNS bigint(20)
BEGIN
    DECLARE reslutval BIGINT;
    SET reslutval := 0;
		select max(version) into reslutval from evaluacion_tabla_version where terminado = 'S';
    RETURN reslutval;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-13 12:39:55