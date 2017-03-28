/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : sign_record_test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-03-09 10:40:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_hours_record
-- ----------------------------
DROP TABLE IF EXISTS `t_hours_record`;
CREATE TABLE `t_hours_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime NOT NULL COMMENT '日期',
  `week` int(11) NOT NULL COMMENT '星期一-星期日（1-7）',
  `fixedhours` varchar(255) NOT NULL DEFAULT '0' COMMENT '固定工时（小时制）',
  `starttime` datetime DEFAULT NULL COMMENT '开始时间（几点开始）',
  `endtime` datetime DEFAULT NULL COMMENT '结束时间（几点结束）',
  `actualhours` varchar(255) DEFAULT '0' COMMENT '实际工时（小时制）',
  `type` int(255) NOT NULL DEFAULT '1' COMMENT '1：正常上班；2：正常放假；3：加班；4：调休；5：请假；6：年假；7：其它',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=168 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_hours_record
-- ----------------------------
INSERT INTO `t_hours_record` VALUES ('31', '2016-09-18 00:00:00', '7', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('32', '2016-09-19 00:00:00', '1', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('33', '2016-09-20 00:00:00', '2', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('34', '2016-09-21 00:00:00', '3', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('35', '2016-09-22 00:00:00', '4', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('36', '2016-09-23 00:00:00', '5', '8', null, null, '11', '1');
INSERT INTO `t_hours_record` VALUES ('37', '2016-09-24 00:00:00', '6', '8', null, null, '8', '3');
INSERT INTO `t_hours_record` VALUES ('38', '2016-09-25 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('39', '2016-09-26 00:00:00', '1', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('40', '2016-09-27 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('41', '2016-09-28 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('42', '2016-09-29 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('43', '2016-09-30 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('44', '2016-10-01 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('45', '2016-10-02 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('46', '2016-10-03 00:00:00', '1', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('47', '2016-10-04 00:00:00', '2', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('48', '2016-10-05 00:00:00', '3', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('49', '2016-10-06 00:00:00', '4', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('50', '2016-10-07 00:00:00', '5', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('51', '2016-10-08 00:00:00', '6', '8', null, null, '0', '5');
INSERT INTO `t_hours_record` VALUES ('52', '2016-10-09 00:00:00', '7', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('53', '2016-10-10 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('54', '2016-10-11 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('55', '2016-10-12 00:00:00', '3', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('56', '2016-10-13 00:00:00', '4', '8', null, null, '7', '1');
INSERT INTO `t_hours_record` VALUES ('57', '2016-10-14 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('58', '2016-10-15 00:00:00', '6', '8', null, null, '8', '3');
INSERT INTO `t_hours_record` VALUES ('59', '2016-10-16 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('60', '2016-10-17 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('61', '2016-10-18 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('62', '2016-10-19 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('63', '2016-10-20 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('64', '2016-10-21 00:00:00', '5', '8', null, null, '11', '1');
INSERT INTO `t_hours_record` VALUES ('65', '2016-10-22 00:00:00', '6', '8', null, null, '8', '3');
INSERT INTO `t_hours_record` VALUES ('66', '2016-10-23 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('67', '2016-10-24 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('68', '2016-10-25 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('69', '2016-10-26 00:00:00', '3', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('70', '2016-10-27 00:00:00', '4', '8', null, null, '10', '1');
INSERT INTO `t_hours_record` VALUES ('71', '2016-10-28 00:00:00', '5', '8', null, null, '11', '1');
INSERT INTO `t_hours_record` VALUES ('72', '2016-10-29 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('73', '2016-10-30 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('75', '2016-10-31 00:00:00', '1', '8', null, null, '11', '1');
INSERT INTO `t_hours_record` VALUES ('76', '2016-11-01 00:00:00', '2', '8', null, null, '11', '1');
INSERT INTO `t_hours_record` VALUES ('77', '2016-11-02 00:00:00', '3', '8', null, null, '10', '1');
INSERT INTO `t_hours_record` VALUES ('78', '2016-11-03 00:00:00', '4', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('79', '2016-11-04 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('80', '2016-11-05 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('81', '2016-11-06 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('82', '2016-11-07 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('83', '2016-11-08 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('84', '2016-11-09 00:00:00', '3', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('85', '2016-11-10 00:00:00', '4', '8', null, null, '11', '1');
INSERT INTO `t_hours_record` VALUES ('86', '2016-11-11 00:00:00', '5', '8', null, null, '7', '1');
INSERT INTO `t_hours_record` VALUES ('87', '2016-11-12 00:00:00', '6', '8', null, null, '7', '3');
INSERT INTO `t_hours_record` VALUES ('88', '2016-11-13 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('89', '2016-11-14 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('90', '2016-11-15 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('91', '2016-11-16 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('92', '2016-11-17 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('93', '2016-11-18 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('94', '2016-11-19 00:00:00', '6', '8', null, null, '7', '3');
INSERT INTO `t_hours_record` VALUES ('95', '2016-11-20 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('96', '2016-11-21 00:00:00', '1', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('97', '2016-11-22 00:00:00', '2', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('98', '2016-11-23 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('99', '2016-11-24 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('100', '2016-11-25 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('101', '2016-11-26 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('102', '2016-11-27 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('103', '2016-11-28 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('104', '2016-11-29 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('105', '2016-11-30 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('106', '2016-12-01 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('107', '2016-12-02 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('108', '2016-12-03 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('109', '2016-12-04 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('110', '2016-12-05 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('111', '2016-12-06 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('112', '2016-12-07 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('113', '2016-12-08 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('114', '2016-12-09 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('115', '2016-12-10 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('116', '2016-12-11 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('117', '2016-12-12 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('118', '2016-12-13 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('119', '2016-12-14 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('120', '2016-12-15 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('121', '2016-12-16 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('122', '2016-12-17 00:00:00', '6', '8', null, null, '8', '3');
INSERT INTO `t_hours_record` VALUES ('123', '2016-12-18 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('124', '2016-12-19 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('125', '2016-12-20 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('126', '2016-12-21 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('127', '2016-12-22 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('128', '2016-12-23 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('129', '2016-12-24 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('130', '2016-12-25 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('131', '2016-12-26 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('132', '2016-12-27 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('133', '2016-12-28 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('134', '2016-12-29 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('135', '2016-12-30 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('136', '2016-12-31 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('137', '2017-01-01 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('138', '2017-01-02 00:00:00', '1', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('139', '2017-01-03 00:00:00', '2', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('140', '2017-01-04 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('141', '2017-01-05 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('142', '2017-01-06 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('143', '2017-01-07 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('144', '2017-01-08 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('145', '2017-01-09 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('146', '2017-01-10 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('147', '2017-01-11 00:00:00', '3', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('148', '2017-01-12 00:00:00', '4', '8', null, null, '11', '1');
INSERT INTO `t_hours_record` VALUES ('149', '2017-01-13 00:00:00', '5', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('150', '2017-01-14 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('151', '2017-01-15 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('152', '2017-01-16 00:00:00', '1', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('153', '2017-01-17 00:00:00', '2', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('154', '2017-01-18 00:00:00', '3', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('155', '2017-01-19 00:00:00', '4', '8', null, null, '8', '1');
INSERT INTO `t_hours_record` VALUES ('156', '2017-01-20 00:00:00', '5', '8', null, null, '9', '1');
INSERT INTO `t_hours_record` VALUES ('157', '2017-01-21 00:00:00', '6', '8', null, null, '10', '3');
INSERT INTO `t_hours_record` VALUES ('158', '2017-01-22 00:00:00', '7', '8', null, null, '8', '3');
INSERT INTO `t_hours_record` VALUES ('159', '2017-01-23 00:00:00', '1', '8', null, null, '0', '4');
INSERT INTO `t_hours_record` VALUES ('160', '2017-01-24 00:00:00', '2', '8', null, null, '0', '4');
INSERT INTO `t_hours_record` VALUES ('161', '2017-01-25 00:00:00', '3', '8', null, null, '0', '4');
INSERT INTO `t_hours_record` VALUES ('162', '2017-01-26 00:00:00', '4', '0', null, null, '0', '6');
INSERT INTO `t_hours_record` VALUES ('163', '2017-01-27 00:00:00', '5', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('164', '2017-01-28 00:00:00', '6', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('165', '2017-01-29 00:00:00', '7', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('166', '2017-01-30 00:00:00', '1', '0', null, null, '0', '2');
INSERT INTO `t_hours_record` VALUES ('167', '2017-01-31 00:00:00', '2', '0', null, null, '0', '2');
