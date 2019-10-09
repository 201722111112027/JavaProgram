SET NAMES utf8;

-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
  `id`         bigint(20) NOT NULL AUTO_INCREMENT,
  `username`   varchar(50)  DEFAULT NULL comment '用户名',
  `password`   varchar(255) DEFAULT NULL comment '密码',
  `nickname`   varchar(50)  DEFAULT NULL comment '用户昵称',
  `head_portrait` varchar(200) DEFAULT '' comment '头像',
  `personal——signature` varchar(200) DEFAULT '' comment '个性签名',
  PRIMARY KEY (`id`)
);

-- 歌单表
DROP TABLE IF EXISTS `song_list`;
CREATE TABLE `song_sheet`
(
  `id`      bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL comment '歌单名',
  `author` varchar(50) DEFAULT NULL comment '创建者',
  `time` varchar(50) DEFAULT NULL comment '发布时间',
  `click_throughput` varchar(50) DEFAULT NULL comment '点击量',
  `state` varchar(50) DEFAULT NULL comment '是否公布',
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `songs`;
CREATE TABLE `songs`
(
  `id`      bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL comment '歌名',
  `author` varchar(50) DEFAULT NULL comment '歌手名',
  `url` varchar(50) DEFAULT NULL comment '歌曲的相对地址',
  `click_throughput` varchar(50) DEFAULT NULL comment '播放量',
  `ascription` varchar(50) DEFAULT NULL comment '所属歌单',
  `state` varchar(50) DEFAULT NULL comment '上传是否',
  PRIMARY KEY (`id`)
);

-- 评论表
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`
(
  `id`              bigint(20) NOT NULL AUTO_INCREMENT,
  `author`          varchar(50)  DEFAULT NULL comment '作者',
  `content`         varchar(250) DEFAULT NULL comment '评论内容',
  `praisePoints`    varchar(250) DEFAULT NULL comment '点赞数',
  `publicationTime` varchar(250) DEFAULT NULL comment '发表时间',
  `replay_id` varchar(250) DEFAULT NULL comment '回复id',
  PRIMARY KEY (`id`)
);

-- DROP TABLE IF EXISTS `replay`;
-- CREATE TABLE `replay`
-- (
--   `id`              bigint(20) NOT NULL AUTO_INCREMENT,
--   `author`          varchar(50)  DEFAULT NULL comment '作者',
--   `content`         varchar(250) DEFAULT NULL comment '回复内容',
--   `replyObject`     varchar(250) DEFAULT NULL comment '回复对象',
--   `praisePoints`    varchar(250) DEFAULT NULL comment '点赞数',
--   `publicationTime` varchar(250) DEFAULT NULL comment '发表时间',
--   PRIMARY KEY (`id`)
-- );


