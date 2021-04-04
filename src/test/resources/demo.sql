CREATE TABLE `role` (
`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
`role_name` varchar(255) DEFAULT NULL COMMENT '角色名字',
`note` varchar(255) DEFAULT NULL COMMENT '备注',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into role (role_name, note) values ("管理员", "很牛逼");
insert into role (role_name, note) values ("运营", "留存客户");