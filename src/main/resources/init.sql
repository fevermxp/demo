-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


--
-- 数据库: 'mvndemo'
--
CREATE DATABASE IF NOT EXISTS mvndemo;
use mvndemo;
-- --------------------------------------------------------

--
-- 表的结构 'tb_menu'
--

CREATE TABLE IF NOT EXISTS menu (
  menu_id int(10) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  menu_name varchar(20) DEFAULT NULL COMMENT '菜单名称',
  menu_url varchar(100) DEFAULT NULL COMMENT '路径',
  parent_id int(10) DEFAULT NULL COMMENT '父菜单',
  PRIMARY KEY (menu_id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=25 ;

--
-- 转存表中的数据 'tb_menu'
--

INSERT INTO menu (menu_id, menu_name, menu_url, parent_id) VALUES
(1, '系统管理', '', NULL),
(2, '业务管理', '', NULL),
(3, 'XX管理', '', NULL),
(5, '用户管理', 'user.html', 1),
(6, '角色管理', 'role.html', 1),
(7, '菜单管理', 'menu.html', 1),
(8, '分页', 'info.html', 2),
(9, 'bbb', 'info.html', 2),
(10, '分页测试', 'info.html', 3),
(21, '系统信息监控', 'serv/cpuinfo.html', 2),
(22, '数据源配置', 'ds/list.html', 1),
(23, '自动邮件设置', 'mails/list.html', 1),
(24, 'SQL检查', 'sql/list.html', 2);

-- --------------------------------------------------------

--
-- 表的结构 userinfo
--

CREATE TABLE IF NOT EXISTS userinfo (
  usid int(11) NOT NULL COMMENT '用户id',
  login varchar(30) COLLATE utf8_bin NOT NULL COMMENT '登录名',
  pass varchar(30) COLLATE utf8_bin NOT NULL COMMENT '密码',
  realname varchar(20) COLLATE utf8_bin NOT NULL COMMENT '姓名',
  tel varchar(20) COLLATE utf8_bin NOT NULL COMMENT '电话',
  workcode varchar(20) COLLATE utf8_bin NOT NULL COMMENT '工号',
  crdt date NOT NULL COMMENT '创建时间',
  lndt date NOT NULL COMMENT '最后登录时间',
  updt date NOT NULL COMMENT '更新时间',
  rights bigint(20) NOT NULL COMMENT '权限',
  PRIMARY KEY (usid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 userinfo
--

INSERT INTO userinfo (usid, login, pass, realname, tel, workcode, crdt, lndt, updt, rights) VALUES
(1, 'admin', '123456', '张三', '18900000000', '002313', '2015-07-23', '2015-07-23', '2015-07-23', 0);
