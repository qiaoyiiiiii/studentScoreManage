/*
 Navicat Premium Dump SQL

 Source Server         : localMysql
 Source Server Type    : MySQL
 Source Server Version : 80036 (8.0.36)
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 80036 (8.0.36)
 File Encoding         : 65001

 Date: 07/12/2024 21:42:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for accounts
-- ----------------------------
DROP TABLE IF EXISTS `accounts`;
CREATE TABLE `accounts`  (
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `role` int NOT NULL DEFAULT 0 COMMENT '0学生，1教师，2管理员',
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`user_id` DESC) USING BTREE,
  UNIQUE INDEX `onlyone`(`user_id` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of accounts
-- ----------------------------
INSERT INTO `accounts` VALUES ('s789012', 0, 'zelda.fitzgerald@163.com');
INSERT INTO `accounts` VALUES ('r678901', 0, 'yuri.gagarin@163.com');
INSERT INTO `accounts` VALUES ('q567890', 0, 'xavier.byron@163.com');
INSERT INTO `accounts` VALUES ('y789012', 0, 'winston.churchill@163.com');
INSERT INTO `accounts` VALUES ('p456789', 0, 'walter.scott@163.com');
INSERT INTO `accounts` VALUES ('x678901', 0, 'virginia.woolfe@163.com');
INSERT INTO `accounts` VALUES ('o345678', 0, 'vincent.vega@163.com');
INSERT INTO `accounts` VALUES ('v0123456', 1, 'vincent.crabbe@163.com');
INSERT INTO `accounts` VALUES ('n234567', 0, 'ulysses.s.grant@163.com');
INSERT INTO `accounts` VALUES ('x567890', 0, 'ulysses.grant@163.com');
INSERT INTO `accounts` VALUES ('t7890123', 0, 'tracey.davis@163.com');
INSERT INTO `accounts` VALUES ('F445566', 1, 'tom.wang@qq.com');
INSERT INTO `accounts` VALUES ('w456789', 0, 'tiffany.trump@163.com');
INSERT INTO `accounts` VALUES ('t6789012', 0, 'terry.boot@163.com');
INSERT INTO `accounts` VALUES ('m123456', 0, 'tchaikovsky@163.com');
INSERT INTO `accounts` VALUES ('v345678', 0, 'steven.king@163.com');
INSERT INTO `accounts` VALUES ('W987654', 1, 'sophia.garcia@qq.com');
INSERT INTO `accounts` VALUES ('M876543', 1, 'sofia.taylor@qq.com');
INSERT INTO `accounts` VALUES ('l012345', 0, 'sigmund.freud@163.com');
INSERT INTO `accounts` VALUES ('s5678901', 1, 'severus.snape@163.com');
INSERT INTO `accounts` VALUES ('d345678', 1, 'sebastian.evans@qq.com');
INSERT INTO `accounts` VALUES ('s8901234', 1, 'seamus.finnigan@163.com');
INSERT INTO `accounts` VALUES ('F876543', 1, 'scarlett.davis@qq.com');
INSERT INTO `accounts` VALUES ('k901234', 0, 'rosa.luxemburg@163.com');
INSERT INTO `accounts` VALUES ('r3456789', 1, 'ron.weasley@163.com');
INSERT INTO `accounts` VALUES ('j890123', 0, 'richard.feynman@163.com');
INSERT INTO `accounts` VALUES ('u234567', 0, 'rachel.green@163.com');
INSERT INTO `accounts` VALUES ('t123456', 0, 'quincy.johnson@163.com');
INSERT INTO `accounts` VALUES ('123123', 0, 'qbsHMIueioeM@163.com');
INSERT INTO `accounts` VALUES ('p9012345', 0, 'poppy.pomfrey@163.com');
INSERT INTO `accounts` VALUES ('p8901234', 0, 'pomona.sprout@163.com');
INSERT INTO `accounts` VALUES ('p1234567', 1, 'peter.petrificus@163.com');
INSERT INTO `accounts` VALUES ('s012345', 0, 'peter.parker@163.com');
INSERT INTO `accounts` VALUES ('p6789012', 1, 'parvati.patil@163.com');
INSERT INTO `accounts` VALUES ('p2345678', 1, 'padma.patil@163.com');
INSERT INTO `accounts` VALUES ('z890123', 0, 'oscar.wilde@163.com');
INSERT INTO `accounts` VALUES ('r901234', 0, 'olivia.wilde@163.com');
INSERT INTO `accounts` VALUES ('I876543', 1, 'olivia.brown@qq.com');
INSERT INTO `accounts` VALUES ('o3456789', 0, 'oliver.wood@163.com');
INSERT INTO `accounts` VALUES ('j345678', 1, 'noah.johnson@qq.com');
INSERT INTO `accounts` VALUES ('i789012', 0, 'niels.bohr@163.com');
INSERT INTO `accounts` VALUES ('n9012345', 1, 'neville.longbottom@163.com');
INSERT INTO `accounts` VALUES ('q890123', 0, 'natalie.portman@163.com');
INSERT INTO `accounts` VALUES ('G987654', 1, 'mila.robinson@qq.com');
INSERT INTO `accounts` VALUES ('c54321', 1, 'mike.jones@qq.com');
INSERT INTO `accounts` VALUES ('K987654', 1, 'mia.davis@qq.com');
INSERT INTO `accounts` VALUES ('p789012', 0, 'mark.twain@163.com');
INSERT INTO `accounts` VALUES ('h678901', 0, 'marie.curie@163.com');
INSERT INTO `accounts` VALUES ('a901234', 0, 'mahatma.gandhi@163.com');
INSERT INTO `accounts` VALUES ('l0123456', 1, 'luna.lovegood@163.com');
INSERT INTO `accounts` VALUES ('C876543', 1, 'lucy.jenkins@qq.com');
INSERT INTO `accounts` VALUES ('h234567', 1, 'lucas.miller@qq.com');
INSERT INTO `accounts` VALUES ('a111111', 0, 'lucas.miller@163.com');
INSERT INTO `accounts` VALUES ('v8901234', 1, 'lord.voldemort@163.com');
INSERT INTO `accounts` VALUES ('A987654', 1, 'lily.perez@qq.com');
INSERT INTO `accounts` VALUES ('e112233', 1, 'lihua.chen@qq.com');
INSERT INTO `accounts` VALUES ('g567890', 0, 'leo.tolstoy@163.com');
INSERT INTO `accounts` VALUES ('g345678', 1, 'leo.morris@qq.com');
INSERT INTO `accounts` VALUES ('j4567890', 1, 'lee.jordan@163.com');
INSERT INTO `accounts` VALUES ('o678901', 0, 'laura.walker@163.com');
INSERT INTO `accounts` VALUES ('n567890', 0, 'kevin.garnett@163.com');
INSERT INTO `accounts` VALUES ('m456789', 0, 'julia.roberts@163.com');
INSERT INTO `accounts` VALUES ('t234567', 1, 'joseph.white@qq.com');
INSERT INTO `accounts` VALUES ('a12345', 1, 'john.doe@qq.com');
INSERT INTO `accounts` VALUES ('b222222', 0, 'john.doe@163.com');
INSERT INTO `accounts` VALUES ('B67890', 1, 'jane.smith@qq.com');
INSERT INTO `accounts` VALUES ('c333333', 0, 'jane.smith@163.com');
INSERT INTO `accounts` VALUES ('Q876543', 0, 'james.clark@qq.com');
INSERT INTO `accounts` VALUES ('b234567', 1, 'jackson.taylor@qq.com');
INSERT INTO `accounts` VALUES ('l234567', 1, 'jack.martin@qq.com');
INSERT INTO `accounts` VALUES ('Y876543', 1, 'isabella.hernandez@qq.com');
INSERT INTO `accounts` VALUES ('l345678', 0, 'isaac.newton@163.com');
INSERT INTO `accounts` VALUES ('f456789', 0, 'isaac.asimov@163.com');
INSERT INTO `accounts` VALUES ('g2345678', 1, 'hermione.granger@163.com');
INSERT INTO `accounts` VALUES ('h1234567', 1, 'harry.potter@163.com');
INSERT INTO `accounts` VALUES ('E987654', 1, 'harper.thompson@qq.com');
INSERT INTO `accounts` VALUES ('k234567', 0, 'hannah.montana@163.com');
INSERT INTO `accounts` VALUES ('g9012345', 1, 'gregory.goyle@163.com');
INSERT INTO `accounts` VALUES ('g1234567', 1, 'ginny.weasley@163.com');
INSERT INTO `accounts` VALUES ('g3456789', 1, 'george.weasley@163.com');
INSERT INTO `accounts` VALUES ('j123456', 0, 'george.washington@163.com');
INSERT INTO `accounts` VALUES ('z456789', 0, 'george.orwell@163.com');
INSERT INTO `accounts` VALUES ('e345678', 0, 'galileo.galilei@163.com');
INSERT INTO `accounts` VALUES ('z345678', 1, 'gabriel.lopez@qq.com');
INSERT INTO `accounts` VALUES ('f2345678', 1, 'fred.weasley@163.com');
INSERT INTO `accounts` VALUES ('i999999', 0, 'franklin.adams@163.com');
INSERT INTO `accounts` VALUES ('y345678', 0, 'frankenstein@163.com');
INSERT INTO `accounts` VALUES ('d234567', 0, 'francis.bacon@163.com');
INSERT INTO `accounts` VALUES ('f4567890', 0, 'fluffy@163.com');
INSERT INTO `accounts` VALUES ('f0123456', 0, 'filch@163.com');
INSERT INTO `accounts` VALUES ('f3456789', 0, 'fawkes@163.com');
INSERT INTO `accounts` VALUES ('x234567', 0, 'eve.from.the.biblical.genesis@163.com');
INSERT INTO `accounts` VALUES ('h888888', 0, 'eric.wright@163.com');
INSERT INTO `accounts` VALUES ('O987654', 0, 'emma.lee@qq.com');
INSERT INTO `accounts` VALUES ('D98765', 1, 'emily.wang@qq.com');
INSERT INTO `accounts` VALUES ('v345678', 1, 'elijah.rodriguez@qq.com');
INSERT INTO `accounts` VALUES ('m6789012', 1, 'draco.malfoy@163.com');
INSERT INTO `accounts` VALUES ('w123456', 0, 'diana.the.huntress@163.com');
INSERT INTO `accounts` VALUES ('g777777', 0, 'diana.miller@163.com');
INSERT INTO `accounts` VALUES ('d7890123', 1, 'dean.thomas@163.com');
INSERT INTO `accounts` VALUES ('x234567', 1, 'daniel.miller@qq.com');
INSERT INTO `accounts` VALUES ('c5678901', 1, 'cho.chang@163.com');
INSERT INTO `accounts` VALUES ('U876543', 1, 'chloe.martinez@qq.com');
INSERT INTO `accounts` VALUES ('S987654', 0, 'charlotte.young@qq.com');
INSERT INTO `accounts` VALUES ('f666666', 0, 'charlie.davis@163.com');
INSERT INTO `accounts` VALUES ('v012345', 0, 'charlie.and.the.chocolate.factory@163.com');
INSERT INTO `accounts` VALUES ('c123456', 0, 'charles.darwin@163.com');
INSERT INTO `accounts` VALUES ('b2345678', 0, 'buckbeak@163.com');
INSERT INTO `accounts` VALUES ('u901234', 0, 'bob.the.builder@163.com');
INSERT INTO `accounts` VALUES ('e555555', 0, 'bob.brown@163.com');
INSERT INTO `accounts` VALUES ('r345678', 0, 'benjamin.walker@qq.com');
INSERT INTO `accounts` VALUES ('b7890123', 1, 'bellatrix.lestrange@163.com');
INSERT INTO `accounts` VALUES ('p234567', 0, 'ava.harris@qq.com');
INSERT INTO `accounts` VALUES ('a1234567', 0, 'aragog@163.com');
INSERT INTO `accounts` VALUES ('a4567890', 0, 'angus.flint@163.com');
INSERT INTO `accounts` VALUES ('g998877', 1, 'alice.zhao@qq.com');
INSERT INTO `accounts` VALUES ('d444444', 0, 'alice.johnson@163.com');
INSERT INTO `accounts` VALUES ('t890123', 0, 'alice.in.wonderland@163.com');
INSERT INTO `accounts` VALUES ('d4567890', 1, 'albus.dumbledore@163.com');
INSERT INTO `accounts` VALUES ('b012345', 0, 'albert.einstein@163.com');
INSERT INTO `accounts` VALUES ('f234567', 1, 'aiden.wilson@qq.com');
INSERT INTO `accounts` VALUES ('a5678901', 0, 'aidan.lynch@163.com');
INSERT INTO `accounts` VALUES ('s123123', 0, '2805464155@qq.com');
INSERT INTO `accounts` VALUES ('admin222', 2, '2222222test@qq.com');
INSERT INTO `accounts` VALUES ('admin111', 2, '1111111test@qq.com');

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `user_id` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `college` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE,
  INDEX `user_id`(`user_id` ASC) USING BTREE,
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `accounts` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, '张一闪', '2222222test@qq.com', '计算机学院');
INSERT INTO `admin` VALUES (2, '张二闪', '1111111test@qq.com', '外语学院');

-- ----------------------------
-- Table structure for applications
-- ----------------------------
DROP TABLE IF EXISTS `applications`;
CREATE TABLE `applications`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `applicantid` int NOT NULL,
  `application_info` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `receptid` int NOT NULL,
  `application_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isvalid` int NOT NULL DEFAULT 1 COMMENT '1为有效，0为无效',
  `admit` int NULL DEFAULT NULL COMMENT '是否同意,1为有效，0为无效',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `applicantid`(`applicantid` ASC) USING BTREE,
  INDEX `receptid`(`receptid` ASC) USING BTREE,
  CONSTRAINT `applications_ibfk_1` FOREIGN KEY (`applicantid`) REFERENCES `teachers` (`teacher_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `applications_ibfk_2` FOREIGN KEY (`receptid`) REFERENCES `admin` (`admin_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of applications
-- ----------------------------

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses`  (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `course_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `credits` int NOT NULL,
  `course_type` int NULL DEFAULT NULL COMMENT '0必修，1选修',
  `department` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`course_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `courses` VALUES (1, '计算机导论', 3, 0, '计算机学院');
INSERT INTO `courses` VALUES (2, '数据结构与算法', 4, 0, '计算机学院');
INSERT INTO `courses` VALUES (3, '数据库原理', 3, 0, '计算机学院');
INSERT INTO `courses` VALUES (4, '操作系统', 3, 0, '计算机学院');
INSERT INTO `courses` VALUES (5, '计算机网络', 3, 1, '计算机学院');
INSERT INTO `courses` VALUES (6, '人工智能基础', 4, 1, '计算机学院');
INSERT INTO `courses` VALUES (7, '软件工程', 3, 0, '计算机学院');
INSERT INTO `courses` VALUES (8, '大学英语', 4, 0, '外语学院');
INSERT INTO `courses` VALUES (9, '英语听力与口语', 3, 0, '外语学院');
INSERT INTO `courses` VALUES (10, '英语写作', 3, 0, '外语学院');
INSERT INTO `courses` VALUES (11, '英语翻译基础', 3, 1, '外语学院');
INSERT INTO `courses` VALUES (12, '英语文化与社会', 2, 1, '外语学院');
INSERT INTO `courses` VALUES (13, '法语基础', 3, 1, '外语学院');
INSERT INTO `courses` VALUES (14, '日语基础', 3, 1, '外语学院');

-- ----------------------------
-- Table structure for grades
-- ----------------------------
DROP TABLE IF EXISTS `grades`;
CREATE TABLE `grades`  (
  `grade_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `teaching_id` int NOT NULL,
  `score` decimal(5, 2) NOT NULL,
  `academic_year` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `semester` int NULL DEFAULT NULL COMMENT '0春季，1秋季',
  PRIMARY KEY (`grade_id`) USING BTREE,
  INDEX `student_id`(`student_id` ASC) USING BTREE,
  INDEX `course_id`(`teaching_id` ASC) USING BTREE,
  CONSTRAINT `grades_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `students` (`student_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `grades_ibfk_2` FOREIGN KEY (`teaching_id`) REFERENCES `teaching` (`teaching_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `grades_chk_1` CHECK ((`score` >= 0) and (`score` <= 100))
) ENGINE = InnoDB AUTO_INCREMENT = 134 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of grades
-- ----------------------------
INSERT INTO `grades` VALUES (2, 55, 1, 75.00, '1', 1);
INSERT INTO `grades` VALUES (3, 57, 1, 80.00, '1', 1);
INSERT INTO `grades` VALUES (4, 58, 1, 72.00, '1', 1);
INSERT INTO `grades` VALUES (5, 60, 1, 41.00, '1', 1);
INSERT INTO `grades` VALUES (6, 61, 1, 92.00, '1', 1);
INSERT INTO `grades` VALUES (7, 64, 1, 61.00, '1', 1);
INSERT INTO `grades` VALUES (8, 67, 1, 89.00, '1', 1);
INSERT INTO `grades` VALUES (9, 69, 1, 82.00, '1', 1);
INSERT INTO `grades` VALUES (10, 70, 1, 91.00, '1', 1);
INSERT INTO `grades` VALUES (11, 72, 1, 86.00, '1', 1);
INSERT INTO `grades` VALUES (12, 75, 1, 87.00, '1', 1);
INSERT INTO `grades` VALUES (13, 76, 1, 87.00, '1', 1);
INSERT INTO `grades` VALUES (14, 79, 1, 71.00, '1', 1);
INSERT INTO `grades` VALUES (15, 81, 1, 87.00, '1', 1);
INSERT INTO `grades` VALUES (16, 82, 1, 99.00, '1', 1);
INSERT INTO `grades` VALUES (17, 84, 1, 100.00, '1', 1);
INSERT INTO `grades` VALUES (18, 87, 1, 94.00, '1', 1);
INSERT INTO `grades` VALUES (19, 89, 1, 91.00, '1', 1);
INSERT INTO `grades` VALUES (20, 90, 1, 80.00, '1', 1);
INSERT INTO `grades` VALUES (21, 92, 1, 83.00, '1', 1);
INSERT INTO `grades` VALUES (22, 102, 1, 75.00, '1', 1);
INSERT INTO `grades` VALUES (23, 55, 2, 83.00, '1', 1);
INSERT INTO `grades` VALUES (24, 57, 2, 72.00, '1', 1);
INSERT INTO `grades` VALUES (25, 58, 2, 91.00, '1', 1);
INSERT INTO `grades` VALUES (26, 60, 2, 97.00, '1', 1);
INSERT INTO `grades` VALUES (27, 61, 2, 70.00, '1', 1);
INSERT INTO `grades` VALUES (28, 64, 2, 81.00, '1', 1);
INSERT INTO `grades` VALUES (29, 67, 2, 93.00, '1', 1);
INSERT INTO `grades` VALUES (30, 69, 2, 81.00, '1', 1);
INSERT INTO `grades` VALUES (31, 70, 2, 63.00, '1', 1);
INSERT INTO `grades` VALUES (32, 72, 2, 96.00, '1', 1);
INSERT INTO `grades` VALUES (33, 75, 2, 64.00, '1', 1);
INSERT INTO `grades` VALUES (34, 76, 2, 95.00, '1', 1);
INSERT INTO `grades` VALUES (35, 79, 2, 61.00, '1', 1);
INSERT INTO `grades` VALUES (36, 81, 2, 81.00, '1', 1);
INSERT INTO `grades` VALUES (37, 82, 2, 77.00, '1', 1);
INSERT INTO `grades` VALUES (38, 84, 2, 85.00, '1', 1);
INSERT INTO `grades` VALUES (39, 87, 2, 93.00, '1', 1);
INSERT INTO `grades` VALUES (40, 89, 2, 65.00, '1', 1);
INSERT INTO `grades` VALUES (41, 90, 2, 70.00, '1', 1);
INSERT INTO `grades` VALUES (42, 92, 2, 93.00, '1', 1);
INSERT INTO `grades` VALUES (43, 102, 2, 70.00, '1', 1);
INSERT INTO `grades` VALUES (86, 55, 3, 76.00, '1', 1);
INSERT INTO `grades` VALUES (87, 102, 3, 95.00, '1', 1);
INSERT INTO `grades` VALUES (88, 67, 3, 67.00, '1', 1);
INSERT INTO `grades` VALUES (89, 69, 3, 72.00, '1', 1);
INSERT INTO `grades` VALUES (90, 70, 3, 99.00, '1', 1);
INSERT INTO `grades` VALUES (91, 72, 3, 98.00, '1', 1);
INSERT INTO `grades` VALUES (92, 75, 3, 88.00, '1', 1);
INSERT INTO `grades` VALUES (93, 76, 3, 88.00, '1', 1);
INSERT INTO `grades` VALUES (94, 79, 3, 72.00, '1', 1);
INSERT INTO `grades` VALUES (95, 81, 3, 79.00, '1', 1);
INSERT INTO `grades` VALUES (96, 82, 3, 76.00, '1', 1);
INSERT INTO `grades` VALUES (97, 84, 3, 83.00, '1', 1);
INSERT INTO `grades` VALUES (98, 87, 3, 88.00, '1', 1);
INSERT INTO `grades` VALUES (99, 89, 3, 86.00, '1', 1);
INSERT INTO `grades` VALUES (100, 90, 3, 64.00, '1', 1);
INSERT INTO `grades` VALUES (101, 92, 3, 85.00, '1', 1);
INSERT INTO `grades` VALUES (107, 57, 3, 88.00, '1', 1);
INSERT INTO `grades` VALUES (108, 58, 3, 77.00, '1', 1);
INSERT INTO `grades` VALUES (109, 60, 3, 99.00, '1', 1);
INSERT INTO `grades` VALUES (110, 64, 3, 83.00, '1', 1);
INSERT INTO `grades` VALUES (111, 61, 3, 97.00, '1', 1);
INSERT INTO `grades` VALUES (112, 55, 4, 94.00, '1', 1);
INSERT INTO `grades` VALUES (113, 57, 4, 79.00, '1', 1);
INSERT INTO `grades` VALUES (114, 58, 4, 91.00, '1', 1);
INSERT INTO `grades` VALUES (115, 60, 4, 75.00, '1', 1);
INSERT INTO `grades` VALUES (116, 61, 4, 85.00, '1', 1);
INSERT INTO `grades` VALUES (117, 64, 4, 97.00, '1', 1);
INSERT INTO `grades` VALUES (118, 67, 4, 87.00, '1', 1);
INSERT INTO `grades` VALUES (119, 69, 4, 83.00, '1', 1);
INSERT INTO `grades` VALUES (120, 70, 4, 96.00, '1', 1);
INSERT INTO `grades` VALUES (121, 72, 4, 85.00, '1', 1);
INSERT INTO `grades` VALUES (122, 75, 4, 79.00, '1', 1);
INSERT INTO `grades` VALUES (123, 76, 4, 79.00, '1', 1);
INSERT INTO `grades` VALUES (124, 79, 4, 99.00, '1', 1);
INSERT INTO `grades` VALUES (125, 81, 4, 72.00, '1', 1);
INSERT INTO `grades` VALUES (126, 82, 4, 87.00, '1', 1);
INSERT INTO `grades` VALUES (127, 84, 4, 74.00, '1', 1);
INSERT INTO `grades` VALUES (128, 87, 4, 89.00, '1', 1);
INSERT INTO `grades` VALUES (129, 89, 4, 83.00, '1', 1);
INSERT INTO `grades` VALUES (130, 90, 4, 86.00, '1', 1);
INSERT INTO `grades` VALUES (131, 92, 4, 81.00, '1', 1);

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `id` int NOT NULL,
  `menuCode` varchar(8) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '菜单编码',
  `menuName` varchar(16) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '菜单名字',
  `menuClick` varchar(16) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '点击触发的函数',
  `menuRight` varchar(8) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '权限 0admin, 1表示teacher, 2表示student,可以用逗号组合使用',
  `menuComponent` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `menuIcon` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students`  (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `gender` int NULL DEFAULT NULL COMMENT '0男1女',
  `age` int NOT NULL,
  `grade` int NOT NULL,
  `college` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `major` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `studentclass` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `user_id` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`student_id`) USING BTREE,
  UNIQUE INDEX `onlystu`(`user_id` ASC) USING BTREE,
  INDEX `student_user_id`(`user_id` ASC) USING BTREE,
  CONSTRAINT `students_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `accounts` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 103 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES (1, '黄晓', 1, 19, 2023, '计算机学院', '软件工程', '1', '2805464155@qq.com');
INSERT INTO `students` VALUES (29, '卢卡斯', 0, 20, 2022, '计算机学院', '软件工程', '1', 'lucas.miller@163.com');
INSERT INTO `students` VALUES (30, '约翰', 0, 21, 2023, '计算机学院', '软件工程', '1', 'john.doe@163.com');
INSERT INTO `students` VALUES (31, '简', 1, 20, 2021, '外国语学院', '英语', '1', 'jane.smith@163.com');
INSERT INTO `students` VALUES (32, '爱丽丝', 1, 22, 2024, '外国语学院', '英语', '1', 'alice.johnson@163.com');
INSERT INTO `students` VALUES (33, '鲍勃', 0, 21, 2022, '计算机学院', '软件工程', '1', 'bob.brown@163.com');
INSERT INTO `students` VALUES (34, '查理', 0, 22, 2023, '计算机学院', '软件工程', '1', 'charlie.davis@163.com');
INSERT INTO `students` VALUES (35, '黛安娜', 1, 20, 2021, '外国语学院', '英语', '1', 'diana.miller@163.com');
INSERT INTO `students` VALUES (36, '埃里克', 0, 21, 2024, '计算机学院', '软件工程', '1', 'eric.wright@163.com');
INSERT INTO `students` VALUES (37, '富兰克林', 0, 22, 2022, '计算机学院', '软件工程', '1', 'franklin.adams@163.com');
INSERT INTO `students` VALUES (38, '乔治', 0, 23, 2021, '计算机学院', '软件工程', '1', 'george.washington@163.com');
INSERT INTO `students` VALUES (39, '汉娜', 1, 20, 2023, '外国语学院', '英语', '1', 'hannah.montana@163.com');
INSERT INTO `students` VALUES (40, '艾萨克', 0, 21, 2024, '计算机学院', '软件工程', '1', 'isaac.newton@163.com');
INSERT INTO `students` VALUES (41, '朱莉娅', 1, 22, 2022, '外国语学院', '英语', '1', 'julia.roberts@163.com');
INSERT INTO `students` VALUES (42, '凯文', 0, 23, 2021, '计算机学院', '软件工程', '1', 'kevin.garnett@163.com');
INSERT INTO `students` VALUES (43, '劳拉', 1, 20, 2023, '外国语学院', '英语', '1', 'laura.walker@163.com');
INSERT INTO `students` VALUES (44, '马克', 0, 21, 2024, '计算机学院', '软件工程', '1', 'mark.twain@163.com');
INSERT INTO `students` VALUES (45, '娜塔莉', 1, 22, 2022, '外国语学院', '英语', '1', 'natalie.portman@163.com');
INSERT INTO `students` VALUES (46, '奥利维亚', 1, 23, 2021, '外国语学院', '英语', '1', 'olivia.wilde@163.com');
INSERT INTO `students` VALUES (47, '彼得', 0, 20, 2023, '计算机学院', '软件工程', '1', 'peter.parker@163.com');
INSERT INTO `students` VALUES (48, '昆西', 0, 21, 2024, '计算机学院', '软件工程', '1', 'quincy.johnson@163.com');
INSERT INTO `students` VALUES (49, '瑞秋', 1, 22, 2022, '外国语学院', '英语', '1', 'rachel.green@163.com');
INSERT INTO `students` VALUES (50, '史蒂文', 0, 23, 2021, '计算机学院', '软件工程', '1', 'steven.king@163.com');
INSERT INTO `students` VALUES (51, '蒂芙尼', 1, 20, 2023, '外国语学院', '英语', '1', 'tiffany.trump@163.com');
INSERT INTO `students` VALUES (52, '尤利西斯', 0, 21, 2024, '计算机学院', '软件工程', '1', 'ulysses.grant@163.com');
INSERT INTO `students` VALUES (53, '张伟', 0, 20, 2022, '计算机学院', '软件工程', '1', 'virginia.woolfe@163.com');
INSERT INTO `students` VALUES (54, '李娜', 1, 21, 2023, '外国语学院', '英语', '1', 'winston.churchill@163.com');
INSERT INTO `students` VALUES (55, '刘洋', 0, 20, 2023, '计算机学院', '软件工程', '2', 'oscar.wilde@163.com');
INSERT INTO `students` VALUES (56, '陈思', 1, 22, 2024, '外国语学院', '英语', '2', 'mahatma.gandhi@163.com');
INSERT INTO `students` VALUES (57, '王强', 0, 21, 2023, '计算机学院', '软件工程', '2', 'albert.einstein@163.com');
INSERT INTO `students` VALUES (58, '赵敏', 1, 22, 2023, '计算机学院', '软件工程', '2', 'charles.darwin@163.com');
INSERT INTO `students` VALUES (59, '钱学森', 0, 23, 2021, '外国语学院', '英语', '1', 'francis.bacon@163.com');
INSERT INTO `students` VALUES (60, '孙悟饭', 0, 20, 2023, '计算机学院', '软件工程', '2', 'galileo.galilei@163.com');
INSERT INTO `students` VALUES (61, '李嘉诚', 0, 21, 2023, '计算机学院', '软件工程', '2', 'isaac.asimov@163.com');
INSERT INTO `students` VALUES (62, '周树人', 0, 22, 2023, '外国语学院', '英语', '2', 'leo.tolstoy@163.com');
INSERT INTO `students` VALUES (63, '吴仪', 1, 23, 2021, '外国语学院', '英语', '2', 'marie.curie@163.com');
INSERT INTO `students` VALUES (64, '郑和', 0, 20, 2023, '计算机学院', '软件工程', '2', 'niels.bohr@163.com');
INSERT INTO `students` VALUES (65, '王安石', 0, 21, 2022, '外国语学院', '英语', '2', 'richard.feynman@163.com');
INSERT INTO `students` VALUES (66, '冯诺依曼', 0, 22, 2023, '外国语学院', '英语', '2', 'rosa.luxemburg@163.com');
INSERT INTO `students` VALUES (67, '陈独秀', 0, 23, 2023, '计算机学院', '软件工程', '2', 'sigmund.freud@163.com');
INSERT INTO `students` VALUES (68, '褚时健', 0, 20, 2024, '外国语学院', '英语', '2', 'tchaikovsky@163.com');
INSERT INTO `students` VALUES (69, '卫青', 0, 21, 2023, '计算机学院', '软件工程', '2', 'ulysses.s.grant@163.com');
INSERT INTO `students` VALUES (70, '蒋方舟', 1, 22, 2023, '计算机学院', '软件工程', '2', 'vincent.vega@163.com');
INSERT INTO `students` VALUES (71, '沈从文', 0, 23, 2021, '外国语学院', '英语', '2', 'walter.scott@163.com');
INSERT INTO `students` VALUES (72, '韩愈', 0, 20, 2023, '计算机学院', '软件工程', '2', 'xavier.byron@163.com');
INSERT INTO `students` VALUES (73, '杨绛', 1, 21, 2022, '外国语学院', '英语', '2', 'yuri.gagarin@163.com');
INSERT INTO `students` VALUES (74, '朱自清', 0, 22, 2023, '外国语学院', '英语', '2', 'zelda.fitzgerald@163.com');
INSERT INTO `students` VALUES (75, '秦汉', 0, 23, 2023, '计算机学院', '软件工程', '2', 'alice.in.wonderland@163.com');
INSERT INTO `students` VALUES (76, '吕不韦', 0, 20, 2023, '计算机学院', '软件工程', '2', 'bob.the.builder@163.com');
INSERT INTO `students` VALUES (77, '高渐离', 0, 21, 2022, '外国语学院', '英语', '2', 'charlie.and.the.chocolate.factory@163.com');
INSERT INTO `students` VALUES (78, '郭靖', 0, 22, 2023, '外国语学院', '英语', '2', 'diana.the.huntress@163.com');
INSERT INTO `students` VALUES (79, '曹雪芹', 1, 23, 2023, '计算机学院', '软件工程', '2', 'eve.from.the.biblical.genesis@163.com');
INSERT INTO `students` VALUES (80, '窦娥', 1, 20, 2024, '外国语学院', '英语', '2', 'frankenstein@163.com');
INSERT INTO `students` VALUES (81, '朱元璋', 0, 21, 2023, '计算机学院', '软件工程', '2', 'george.orwell@163.com');
INSERT INTO `students` VALUES (82, '张强', 0, 20, 2023, '计算机学院', '软件工程', '2', 'oliver.wood@163.com');
INSERT INTO `students` VALUES (83, '李婷', 1, 21, 2023, '外国语学院', '英语', '2', 'angus.flint@163.com');
INSERT INTO `students` VALUES (84, '刘波', 0, 20, 2023, '计算机学院', '软件工程', '2', 'aidan.lynch@163.com');
INSERT INTO `students` VALUES (85, '王芳', 1, 22, 2024, '外国语学院', '英语', '2', 'terry.boot@163.com');
INSERT INTO `students` VALUES (86, '陈晨', 1, 21, 2022, '外国语学院', '英语', '2', 'tracey.davis@163.com');
INSERT INTO `students` VALUES (87, '赵敏', 1, 22, 2023, '计算机学院', '软件工程', '2', 'pomona.sprout@163.com');
INSERT INTO `students` VALUES (88, '钱伟', 0, 23, 2021, '外国语学院', '英语', '2', 'poppy.pomfrey@163.com');
INSERT INTO `students` VALUES (89, '孙红', 1, 20, 2023, '计算机学院', '软件工程', '2', 'filch@163.com');
INSERT INTO `students` VALUES (90, '周杰', 0, 21, 2023, '计算机学院', '软件工程', '2', 'aragog@163.com');
INSERT INTO `students` VALUES (91, '吴兰', 1, 22, 2023, '外国语学院', '英语', '2', 'buckbeak@163.com');
INSERT INTO `students` VALUES (92, '郑军', 0, 23, 2023, '计算机学院', '软件工程', '2', 'fawkes@163.com');
INSERT INTO `students` VALUES (93, '冯娟', 1, 20, 2024, '外国语学院', '英语', '2', 'fluffy@163.com');
INSERT INTO `students` VALUES (94, '周夏洛', 1, 20, 2022, '外国语学院', '英语', '1', 'charlotte.young@qq.com');
INSERT INTO `students` VALUES (95, '王本杰明', 0, 21, 2023, '计算机学院', '软件工程', '1', 'benjamin.walker@qq.com');
INSERT INTO `students` VALUES (96, '李詹姆斯', 0, 20, 2021, '计算机学院', '软件工程', '1', 'james.clark@qq.com');
INSERT INTO `students` VALUES (97, '哈丽斯', 1, 22, 2024, '外国语学院', '英语', '1', 'ava.harris@qq.com');
INSERT INTO `students` VALUES (98, '李艾玛', 1, 21, 2022, '外国语学院', '英语', '1', 'emma.lee@qq.com');
INSERT INTO `students` VALUES (102, '吴亦凡', 1, 19, 2023, '计算机学院', '软件工程', '2', 'qbsHMIueioeM@163.com');

-- ----------------------------
-- Table structure for teachers
-- ----------------------------
DROP TABLE IF EXISTS `teachers`;
CREATE TABLE `teachers`  (
  `teacher_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `age` int NULL DEFAULT NULL,
  `course_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `user_id` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `isvalid` tinyint(1) NULL DEFAULT 0 COMMENT '0无效，1有效',
  PRIMARY KEY (`teacher_id`) USING BTREE,
  UNIQUE INDEX `onlytea`(`user_id` ASC) USING BTREE,
  INDEX `user_id`(`user_id` ASC) USING BTREE,
  CONSTRAINT `teachers_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `accounts` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 52 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teachers
-- ----------------------------
INSERT INTO `teachers` VALUES (1, '张三', 35, '计算机导论', 'john.doe@qq.com', 0);
INSERT INTO `teachers` VALUES (2, '李四', 40, '数据结构与算法', 'jane.smith@qq.com', 0);
INSERT INTO `teachers` VALUES (3, '王五', 45, '数据库原理', 'mike.jones@qq.com', 0);
INSERT INTO `teachers` VALUES (4, '赵六', 38, '操作系统', 'emily.wang@qq.com', 0);
INSERT INTO `teachers` VALUES (5, '陈丽华', 32, '计算机网络', 'lihua.chen@qq.com', 0);
INSERT INTO `teachers` VALUES (6, '王涛', 42, '软件工程', 'tom.wang@qq.com', 0);
INSERT INTO `teachers` VALUES (7, '赵阿丽', 30, '人工智能基础', 'alice.zhao@qq.com', 0);
INSERT INTO `teachers` VALUES (8, '刘宇', 37, '英语写作', 'lucas.miller@qq.com', 0);
INSERT INTO `teachers` VALUES (9, '黄莺', 34, '英语听力与口语', 'olivia.brown@qq.com', 0);
INSERT INTO `teachers` VALUES (10, '孙亮', 41, '英语翻译基础', 'noah.johnson@qq.com', 0);
INSERT INTO `teachers` VALUES (11, '周媛', 29, '英语文化与社会', 'mia.davis@qq.com', 0);
INSERT INTO `teachers` VALUES (12, '吴杰', 36, '英语文化与社会', 'jack.martin@qq.com', 0);
INSERT INTO `teachers` VALUES (13, '宋婷', 39, '英语听力与口语', 'sofia.taylor@qq.com', 0);
INSERT INTO `teachers` VALUES (14, '郑明', 33, '高等数学', 'joseph.white@qq.com', 0);
INSERT INTO `teachers` VALUES (15, '周璇', 34, '线性代数', 'chloe.martinez@qq.com', 0);
INSERT INTO `teachers` VALUES (16, '王琳', 40, '概率论', 'elijah.rodriguez@qq.com', 0);
INSERT INTO `teachers` VALUES (17, '刘翔', 37, '离散数学', 'sophia.garcia@qq.com', 0);
INSERT INTO `teachers` VALUES (18, '杨杰', 41, '编译原理', 'daniel.miller@qq.com', 0);
INSERT INTO `teachers` VALUES (19, '陈婷', 38, '数据挖掘', 'isabella.hernandez@qq.com', 0);
INSERT INTO `teachers` VALUES (20, '彭程', 43, '人工智能基础', 'gabriel.lopez@qq.com', 0);
INSERT INTO `teachers` VALUES (21, '张娜', 35, '计算机组成原理', 'lily.perez@qq.com', 0);
INSERT INTO `teachers` VALUES (22, '刘安', 39, '图像处理', 'jackson.taylor@qq.com', 0);
INSERT INTO `teachers` VALUES (23, '杨春', 32, '操作系统', 'lucy.jenkins@qq.com', 0);
INSERT INTO `teachers` VALUES (24, '高晓', 40, '算法分析与设计', 'sebastian.evans@qq.com', 0);
INSERT INTO `teachers` VALUES (25, '钱玥', 33, '数据结构与算法', 'harper.thompson@qq.com', 0);
INSERT INTO `teachers` VALUES (26, '宋凡', 37, '计算机导论', 'aiden.wilson@qq.com', 0);
INSERT INTO `teachers` VALUES (27, '周欣', 38, '计算机网络', 'scarlett.davis@qq.com', 0);
INSERT INTO `teachers` VALUES (28, '刘宇航', 41, '数据库原理', 'leo.morris@qq.com', 0);
INSERT INTO `teachers` VALUES (29, '王瑜', 34, '操作系统', 'mila.robinson@qq.com', 0);
INSERT INTO `teachers` VALUES (30, '哈利', 35, '计算机导论', 'harry.potter@163.com', 0);
INSERT INTO `teachers` VALUES (31, '赫敏', 34, '数据结构与算法', 'hermione.granger@163.com', 0);
INSERT INTO `teachers` VALUES (32, '罗恩', 36, '数据库原理', 'ron.weasley@163.com', 0);
INSERT INTO `teachers` VALUES (33, '邓布利多', 40, '操作系统', 'albus.dumbledore@163.com', 0);
INSERT INTO `teachers` VALUES (34, '斯内普', 50, '计算机网络', 'severus.snape@163.com', 0);
INSERT INTO `teachers` VALUES (35, '马尔福', 33, '软件工程', 'draco.malfoy@163.com', 0);
INSERT INTO `teachers` VALUES (36, '贝拉特', 45, '人工智能基础', 'bellatrix.lestrange@163.com', 0);
INSERT INTO `teachers` VALUES (37, '伏地魔', 60, '计算机组成原理', 'lord.voldemort@163.com', 0);
INSERT INTO `teachers` VALUES (38, '内维尔', 36, '数据库原理', 'neville.longbottom@163.com', 0);
INSERT INTO `teachers` VALUES (39, '露娜', 34, '图像处理', 'luna.lovegood@163.com', 0);
INSERT INTO `teachers` VALUES (40, '金妮', 31, '软件工程', 'ginny.weasley@163.com', 0);
INSERT INTO `teachers` VALUES (41, '弗雷德', 35, '计算机导论', 'fred.weasley@163.com', 0);
INSERT INTO `teachers` VALUES (42, '乔治', 35, '计算机导论', 'george.weasley@163.com', 0);
INSERT INTO `teachers` VALUES (43, '李乔丹', 32, '计算机组成原理', 'lee.jordan@163.com', 0);
INSERT INTO `teachers` VALUES (44, '周璇', 34, '图像处理', 'cho.chang@163.com', 0);
INSERT INTO `teachers` VALUES (45, '帕瓦蒂', 33, '数据结构与算法', 'parvati.patil@163.com', 0);
INSERT INTO `teachers` VALUES (46, '迪恩', 34, '人工智能基础', 'dean.thomas@163.com', 0);
INSERT INTO `teachers` VALUES (47, '西莫', 35, '数据挖掘', 'seamus.finnigan@163.com', 0);
INSERT INTO `teachers` VALUES (48, '格雷戈里', 36, '数据库原理', 'gregory.goyle@163.com', 0);
INSERT INTO `teachers` VALUES (49, '文森特', 40, '操作系统', 'vincent.crabbe@163.com', 0);
INSERT INTO `teachers` VALUES (50, '彼得', 45, '计算机网络', 'peter.petrificus@163.com', 0);
INSERT INTO `teachers` VALUES (51, '帕德玛', 38, '软件工程', 'padma.patil@163.com', 0);

-- ----------------------------
-- Table structure for teaching
-- ----------------------------
DROP TABLE IF EXISTS `teaching`;
CREATE TABLE `teaching`  (
  `teaching_id` int NOT NULL AUTO_INCREMENT,
  `teacher_id` int NOT NULL,
  `course_id` int NOT NULL,
  PRIMARY KEY (`teaching_id`) USING BTREE,
  INDEX `course_id`(`course_id` ASC) USING BTREE,
  INDEX `teacher_id`(`teacher_id` ASC) USING BTREE,
  CONSTRAINT `teaching_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `courses` (`course_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `teaching_ibfk_2` FOREIGN KEY (`teacher_id`) REFERENCES `teachers` (`teacher_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teaching
-- ----------------------------
INSERT INTO `teaching` VALUES (1, 50, 1);
INSERT INTO `teaching` VALUES (2, 2, 2);
INSERT INTO `teaching` VALUES (3, 3, 3);
INSERT INTO `teaching` VALUES (4, 4, 4);
INSERT INTO `teaching` VALUES (5, 5, 5);

SET FOREIGN_KEY_CHECKS = 1;
