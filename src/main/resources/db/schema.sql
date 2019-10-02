SET NAMES utf8;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL comment '用户名',
  `password` varchar(255) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL comment '用户昵称',
  `avatar_url` varchar(200) DEFAULT '' comment '头像',
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `words`;
CREATE TABLE `words` (
                      `id` bigint(20) NOT NULL AUTO_INCREMENT,
                      `content` varchar(50) DEFAULT NULL comment '内容',
                      PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
                       `id` bigint(20) NOT NULL AUTO_INCREMENT,
                       `author` varchar(50) DEFAULT NULL comment '作者',
                       `content` varchar(250) DEFAULT NULL comment '评论内容',
                       `praisePoints` varchar(250) DEFAULT NULL comment '点赞数',
                       `publicationTime` varchar(250) DEFAULT NULL comment '发表时间',
                       PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `replay`;
CREATE TABLE `replay` (
                         `id` bigint(20) NOT NULL AUTO_INCREMENT,
                         `author` varchar(50) DEFAULT NULL comment '作者',
                         `content` varchar(250) DEFAULT NULL comment '回复内容',
                         `replyObject` varchar(250) DEFAULT NULL comment '回复对象',
                         `praisePoints` varchar(250) DEFAULT NULL comment '点赞数',
                         `publicationTime` varchar(250) DEFAULT NULL comment '发表时间',
                         PRIMARY KEY (`id`)
);


