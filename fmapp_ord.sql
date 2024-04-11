/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80300 (8.3.0)
 Source Host           : localhost:3306
 Source Schema         : fmapp_ord

 Target Server Type    : MySQL
 Target Server Version : 80300 (8.3.0)
 File Encoding         : 65001

 Date: 11/04/2024 14:51:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ord_after
-- ----------------------------
DROP TABLE IF EXISTS `ord_after`;
CREATE TABLE `ord_after` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `after_id` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  `order_id` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  `status_cd` tinyint DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_after_id` (`after_id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for ord_after_item
-- ----------------------------
DROP TABLE IF EXISTS `ord_after_item`;
CREATE TABLE `ord_after_item` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `after_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `order_item_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `qty` int DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  `delete_flag` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_after_id` (`after_id`),
  KEY `idx_order_item_id` (`order_item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for ord_after_workflow
-- ----------------------------
DROP TABLE IF EXISTS `ord_after_workflow`;
CREATE TABLE `ord_after_workflow` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `after_id` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  `current_status_cd` tinyint DEFAULT NULL,
  `next_status_cd` tinyint DEFAULT NULL,
  `created_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `remark` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for ord_order
-- ----------------------------
DROP TABLE IF EXISTS `ord_order`;
CREATE TABLE `ord_order` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `order_id` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  `status_cd` tinyint DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  `delete_flag` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1775352921181921282 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for ord_order_item
-- ----------------------------
DROP TABLE IF EXISTS `ord_order_item`;
CREATE TABLE `ord_order_item` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `order_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `order_item_id` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  `qty` int DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  `delete_flag` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_order_id` (`order_id`),
  KEY `idx_order_item_id` (`order_item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1775352921202892802 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
