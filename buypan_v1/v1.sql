/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50133
Source Host           : localhost:3306
Source Database       : rgsj

Target Server Type    : MYSQL
Target Server Version : 50133
File Encoding         : 65001

Date: 2022-10-11 19:19:38
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `buyer`
-- ----------------------------
DROP TABLE IF EXISTS `buyer`;
CREATE TABLE `buyer` (
  `buyername` varchar(20) CHARACTER SET utf8 NOT NULL,
  `buyerid` varchar(20) NOT NULL,
  `buyerpw` varchar(20) NOT NULL,
  `buyeraddress` varchar(50) DEFAULT NULL,
  `buyerphone` varchar(20) DEFAULT NULL,
  `buyersex` enum('f','m') DEFAULT NULL,
  PRIMARY KEY (`buyerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of buyer
-- ----------------------------
INSERT INTO `buyer` VALUES ('l4', '1', '1', '1', '1', 'f');

-- ----------------------------
-- Table structure for `evaluate`
-- ----------------------------
DROP TABLE IF EXISTS `evaluate`;
CREATE TABLE `evaluate` (
  `evaluateid` varchar(20) CHARACTER SET utf8 NOT NULL,
  `waresid` varchar(20) DEFAULT NULL,
  `buyerid` varchar(20) DEFAULT NULL,
  `evaluatecontent` varchar(255) DEFAULT NULL,
  `evaluatetime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`evaluateid`),
  KEY `waresid` (`waresid`),
  KEY `buyerid` (`buyerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of evaluate
-- ----------------------------

-- ----------------------------
-- Table structure for `historyorder`
-- ----------------------------
DROP TABLE IF EXISTS `historyorder`;
CREATE TABLE `historyorder` (
  `historyid` varchar(20) NOT NULL,
  `wiresid` varchar(20) NOT NULL,
  `shopid` varchar(20) NOT NULL,
  `buyerid` varchar(20) NOT NULL,
  `waresnumber` int(20) NOT NULL,
  `finishtime` varchar(40) NOT NULL,
  `buyeraddress` varchar(255) NOT NULL,
  `buyerphone` varchar(20) NOT NULL,
  PRIMARY KEY (`historyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of historyorder
-- ----------------------------
INSERT INTO `historyorder` VALUES ('1', '1', '1', '1', '1', '10-10-2022 20:22:51', '1', '13616760368');
INSERT INTO `historyorder` VALUES ('2', '1', '1', '1', '1', '09-10-2022 21:30:04', '1', '19855555555');
INSERT INTO `historyorder` VALUES ('5', '2', '1', '1', '1', '10-10-2022 22:03:37', '1', '13616760368');

-- ----------------------------
-- Table structure for `orderr`
-- ----------------------------
DROP TABLE IF EXISTS `orderr`;
CREATE TABLE `orderr` (
  `orderid` varchar(20) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `waresid` varchar(20) NOT NULL,
  `shopid` varchar(20) NOT NULL,
  `buyerid` varchar(20) NOT NULL,
  `waresnumber` int(10) NOT NULL,
  `ordertime` varchar(20) NOT NULL,
  `buyeraddress` varchar(100) NOT NULL,
  `buyerphone` varchar(20) NOT NULL,
  PRIMARY KEY (`orderid`),
  KEY `waresid` (`waresid`),
  KEY `buyerid` (`buyerid`),
  CONSTRAINT `orderr_ibfk_1` FOREIGN KEY (`waresid`) REFERENCES `wares` (`waresid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orderr_ibfk_2` FOREIGN KEY (`buyerid`) REFERENCES `buyer` (`buyerid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of orderr
-- ----------------------------
INSERT INTO `orderr` VALUES ('5', '2', '1', '1', '1', '10-10-2022 22:02:52', '1', '13616760368');

-- ----------------------------
-- Table structure for `seller`
-- ----------------------------
DROP TABLE IF EXISTS `seller`;
CREATE TABLE `seller` (
  `sellername` varchar(20) CHARACTER SET utf8 NOT NULL,
  `sellerid` varchar(20) NOT NULL,
  `sellerpw` varchar(20) NOT NULL,
  `sellerphone` varchar(20) DEFAULT NULL,
  `shopid` varchar(20) NOT NULL,
  PRIMARY KEY (`sellerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of seller
-- ----------------------------
INSERT INTO `seller` VALUES ('zhangsan', '1234', '12345ztc', '139635357710', '1');

-- ----------------------------
-- Table structure for `shop`
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `shopid` varchar(20) CHARACTER SET utf8 NOT NULL,
  `sellerid` varchar(20) NOT NULL,
  `shopname` varchar(20) NOT NULL,
  `shopcreated` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`shopid`),
  KEY `sellerid` (`sellerid`),
  CONSTRAINT `shop_ibfk_1` FOREIGN KEY (`sellerid`) REFERENCES `seller` (`sellerid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO `shop` VALUES ('1', '1234', 'hero pen shopping', '1');

-- ----------------------------
-- Table structure for `wares`
-- ----------------------------
DROP TABLE IF EXISTS `wares`;
CREATE TABLE `wares` (
  `waresid` varchar(20) NOT NULL,
  `waresname` varchar(20) CHARACTER SET utf8 NOT NULL,
  `waresprice` double(10,0) NOT NULL,
  `waresnumber` int(10) NOT NULL,
  `shopid` varchar(20) NOT NULL,
  `waresstate` enum('putaway','freeze','remove') DEFAULT NULL,
  `warespicture` varchar(255) DEFAULT NULL,
  `waresclass` varchar(20) DEFAULT NULL,
  `matketing` varchar(255) DEFAULT NULL,
  `oldprice` double(10,0) DEFAULT NULL,
  PRIMARY KEY (`waresid`),
  KEY `shopid` (`shopid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of wares
-- ----------------------------
INSERT INTO `wares` VALUES ('1', '大牌钢笔', '5', '1', '1', 'putaway', '73645d1a-b00d-49fa-9ae6-01badcdd7fc7.jpg', 'pen', '0', null);
INSERT INTO `wares` VALUES ('2', 'hero pan', '53', '1', '1', 'remove', '3de39a0b-2e8e-47d4-b3b3-ecfdd53821e6.jpg', 'pen', '2', null);
