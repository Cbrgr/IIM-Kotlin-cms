-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 26 mai 2019 à 20:48
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `cms`
--

-- --------------------------------------------------------

--
-- Structure de la table `articles`
--

DROP TABLE IF EXISTS `articles`;
CREATE TABLE IF NOT EXISTS `articles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `text` text COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Déchargement des données de la table `articles`
--

INSERT INTO `articles` (`id`, `title`, `text`) VALUES
(1, 'Article exemple', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vitae sagittis risus, et gravida mi. Maecenas ut feugiat nisi, at efficitur nisl. Quisque dapibus massa quam. Nunc non posuere sapien. In nunc ipsum, lacinia sed convallis eget, vulputate a ligula. Ut euismod ligula quis viverra aliquet. Vestibulum vel velit porta, facilisis odio a, feugiat dolor. Curabitur id sapien risus. Praesent vel orci tincidunt, pharetra est at, porttitor leo. Nam at felis quis mi mattis lacinia. Pellentesque a justo justo. Nam tortor sapien, venenatis quis nisi non, pretium pharetra augue. Vivamus a eros molestie, placerat leo a, varius nulla. Fusce nisi ex, luctus eget massa eget, sollicitudin cursus arcu. Nam dui mauris, mattis vitae diam vitae, iaculis volutpat purus.'),
(2, 'Article génial', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vitae sagittis risus, et gravida mi. Maecenas ut feugiat nisi, at efficitur nisl. Quisque dapibus massa quam. Nunc non posuere sapien. In nunc ipsum, lacinia sed convallis eget, vulputate a ligula. Ut euismod ligula quis viverra aliquet. Vestibulum vel velit porta, facilisis odio a, feugiat dolor. Curabitur id sapien risus. Praesent vel orci tincidunt, pharetra est at, porttitor leo. Nam at felis quis mi mattis lacinia. Pellentesque a justo justo. Nam tortor sapien, venenatis quis nisi non, pretium pharetra augue. Vivamus a eros molestie, placerat leo a, varius nulla. Fusce nisi ex, luctus eget massa eget, sollicitudin cursus arcu. Nam dui mauris, mattis vitae diam vitae, iaculis volutpat purus.'),
(3, 'Article banal', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vitae sagittis risus, et gravida mi. Maecenas ut feugiat nisi, at efficitur nisl. Quisque dapibus massa quam. Nunc non posuere sapien. In nunc ipsum, lacinia sed convallis eget, vulputate a ligula. Ut euismod ligula quis viverra aliquet. Vestibulum vel velit porta, facilisis odio a, feugiat dolor. Curabitur id sapien risus. Praesent vel orci tincidunt, pharetra est at, porttitor leo. Nam at felis quis mi mattis lacinia. Pellentesque a justo justo. Nam tortor sapien, venenatis quis nisi non, pretium pharetra augue. Vivamus a eros molestie, placerat leo a, varius nulla. Fusce nisi ex, luctus eget massa eget, sollicitudin cursus arcu. Nam dui mauris, mattis vitae diam vitae, iaculis volutpat purus.');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
