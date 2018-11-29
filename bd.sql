-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: lojainformatica
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.16.04.1

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `sexo` varchar(9) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `numero` int(5) DEFAULT NULL,
  `complemento` varchar(9) DEFAULT NULL,
  `bairro` varchar(20) DEFAULT NULL,
  `cep` int(10) DEFAULT NULL,
  `cidade` varchar(14) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `telefone` int(16) DEFAULT NULL,
  `celular` int(16) DEFAULT NULL,
  `date_entered` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'teste','teste@teste.com.br','-1592937450','Masculino','teste',123,'','teste',4433050,'Sao PAulo','SP',1239123,-466215869,'2018-11-22 00:00:00'),(2,'Teste','teste@teste.com.br','45651702806','Masculino','oscar de barros',888,'1','JArdim itapura',4433050,'Sao PAUlo','SP',15231241,123123123,'2018-11-26 14:54:08');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_pedido`
--

DROP TABLE IF EXISTS `item_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_pedido` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `idvenda` int(6) unsigned NOT NULL,
  `idproduto` int(6) unsigned NOT NULL,
  `qtd` int(3) unsigned NOT NULL,
  `valor` float unsigned NOT NULL,
  `date_entered` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_pedido`
--

LOCK TABLES `item_pedido` WRITE;
/*!40000 ALTER TABLE `item_pedido` DISABLE KEYS */;
INSERT INTO `item_pedido` VALUES (6,6,3,20,246820,'2018-11-28 21:54:44'),(7,7,3,20,246820,'2018-11-28 21:55:41'),(8,7,3,20,246820,'2018-11-28 21:55:41'),(9,8,3,12,148092,'2018-11-28 22:00:36'),(10,8,3,12,148092,'2018-11-28 22:00:36'),(11,9,3,1,12341,'2018-11-28 22:02:13'),(12,10,3,12,148092,'2018-11-28 22:03:35'),(13,11,3,12,148092,'2018-11-28 22:03:48'),(14,12,3,12,148092,'2018-11-28 22:16:06'),(15,13,3,12,148092,'2018-11-28 22:16:35'),(16,14,3,12,148092,'2018-11-28 22:16:51'),(17,15,3,12,148092,'2018-11-28 22:17:16'),(18,16,3,12,148092,'2018-11-28 22:17:49'),(19,17,3,12,148092,'2018-11-28 22:19:56');
/*!40000 ALTER TABLE `item_pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produtos` (
  `codproduto` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `categoria` varchar(20) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `description` text,
  `qtd` int(5) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `date_entered` datetime DEFAULT NULL,
  PRIMARY KEY (`codproduto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (3,'Notebook','Notebook Acer','Notebook Acer muito',51,12341,'2018-11-26 15:50:35');
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendas`
--

DROP TABLE IF EXISTS `vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendas` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `valor` float NOT NULL,
  `meiodepagamento` varchar(20) NOT NULL,
  `idcliente` int(6) unsigned NOT NULL,
  `date_entered` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendas`
--

LOCK TABLES `vendas` WRITE;
/*!40000 ALTER TABLE `vendas` DISABLE KEYS */;
INSERT INTO `vendas` VALUES (5,148092,'Dinheiro',1,'2018-11-28 01:27:59'),(6,246820,'Cartão de Crédito',1,'2018-11-28 21:54:44'),(7,493640,'Cartão de Crédito',1,'2018-11-28 21:55:41'),(8,296184,'Dinheiro',1,'2018-11-28 22:00:36'),(9,12341,'Dinheiro',2,'2018-11-28 22:02:13'),(10,148092,'Dinheiro',1,'2018-11-28 22:03:35'),(11,148092,'Dinheiro',2,'2018-11-28 22:03:48'),(12,148092,'Dinheiro',1,'2018-11-28 22:16:06'),(13,148092,'Dinheiro',1,'2018-11-28 22:16:35'),(14,148092,'Dinheiro',1,'2018-11-28 22:16:51'),(15,148092,'Dinheiro',2,'2018-11-28 22:17:16'),(16,148092,'Dinheiro',2,'2018-11-28 22:17:49'),(17,148092,'Dinheiro',2,'2018-11-28 22:19:56');
/*!40000 ALTER TABLE `vendas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-28 22:24:53
