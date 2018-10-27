/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : hibernate

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2018-10-27 17:01:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_course`
-- ----------------------------
DROP TABLE IF EXISTS `tb_course`;
CREATE TABLE `tb_course` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(50) NOT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_course
-- ----------------------------
INSERT INTO `tb_course` VALUES ('1', '??');
INSERT INTO `tb_course` VALUES ('2', '??');
INSERT INTO `tb_course` VALUES ('3', '??');
INSERT INTO `tb_course` VALUES ('4', '??');
INSERT INTO `tb_course` VALUES ('7', '??');
INSERT INTO `tb_course` VALUES ('8', '??');

-- ----------------------------
-- Table structure for `tb_select_course`
-- ----------------------------
DROP TABLE IF EXISTS `tb_select_course`;
CREATE TABLE `tb_select_course` (
  `fstu_id` int(11) NOT NULL,
  `fc_id` int(11) NOT NULL,
  `fdate` date DEFAULT NULL,
  PRIMARY KEY (`fstu_id`,`fc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_select_course
-- ----------------------------
INSERT INTO `tb_select_course` VALUES ('7', '7', null);
INSERT INTO `tb_select_course` VALUES ('8', '7', null);
INSERT INTO `tb_select_course` VALUES ('8', '8', null);

-- ----------------------------
-- Table structure for `tb_student`
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(50) NOT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES ('1', 'shx');
INSERT INTO `tb_student` VALUES ('2', 'shx2');
INSERT INTO `tb_student` VALUES ('3', 'shx');
INSERT INTO `tb_student` VALUES ('4', 'shx2');
INSERT INTO `tb_student` VALUES ('7', 'shx');
INSERT INTO `tb_student` VALUES ('8', 'shx2');

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `fusername` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `fpassword` varchar(255) DEFAULT NULL,
  `fgroupid` int(11) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('2', '??', '1', '4');
INSERT INTO `tb_user` VALUES ('3', '??23', '1', '4');
INSERT INTO `tb_user` VALUES ('4', '??', '1', '5');
INSERT INTO `tb_user` VALUES ('5', '??23', '1', '5');
INSERT INTO `tb_user` VALUES ('6', 'shx', '123456', '6');

-- ----------------------------
-- Table structure for `tb_user2`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user2`;
CREATE TABLE `tb_user2` (
  `fid` int(11) NOT NULL,
  `fusername` varchar(255) DEFAULT NULL,
  `fpassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_user2
-- ----------------------------
INSERT INTO `tb_user2` VALUES ('1', 'shx', '123456');

-- ----------------------------
-- Table structure for `tb_usergroup`
-- ----------------------------
DROP TABLE IF EXISTS `tb_usergroup`;
CREATE TABLE `tb_usergroup` (
  `fgroupid` int(11) NOT NULL AUTO_INCREMENT,
  `fgroupname` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`fgroupid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_usergroup
-- ----------------------------
INSERT INTO `tb_usergroup` VALUES ('4', '????');
INSERT INTO `tb_usergroup` VALUES ('5', '????');
INSERT INTO `tb_usergroup` VALUES ('6', '401');
