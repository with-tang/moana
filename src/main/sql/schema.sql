
--建表语句
create table movie_info(
movie_id bigint   not null primary key  comment '电影票ID',
movie_name varchar(120) comment '电影名称',
movie_price float comment '电影票价格',
movie_count int comment '剩余数量',
movie_start_time datetime comment '上映时间',
moive_min int  comment '影片时长'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT charset=utf8 comment='电影票库存表';

create table user_info(
user_id  bigint   not null primary key comment '用户id' ,
user_name varchar(120) comment '用户姓名',
user_phone bigint comment '用户电话',
user_qq varchar(100) comment 'qq',
user_email varchar(120) comment 'email'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT charset=utf8 comment='用户信息表';

create table buy_info(
buy_id  int not null comment '购买ID',
movie_id bigint   not null  comment '电影票ID',
user_id  bigint   not null   comment '用户ID',
movie_count int not null comment '购买张数',
create_time timestamp default current_timestamp comment '购买时间'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT charset=utf8 comment='购买明细表';

insert into user_info(user_name,user_phone,user_qq,user_email)values
('唐家',15926270102,337230792,'with_tang@163.com');
insert into user_info(user_name,user_phone,user_qq,user_email)values
('梨花',15926270102,337230792,'with_tang@163.com');

insert  into movie_info (moive_min,movie_name,movie_price,movie_count,movie_start_time)
values(120, '摆渡人',	100,300, '2016-12-11 20:54:32'),
( 123, '你的名字',		100,300, '2016-12-14 22:00:33'),
( 100, '铁道飞虎',		100,300, '2017-01-01 22:42:03'),
( 100, '长城',		  	100,300, '2016-12-30 12:23:34'),
( 120, '神奇动物在哪里',100,300, '2016-12-01 12:24:24'),
( 129, '少年',			  100,0,   '2016-12-23 12:24:56'),
( 130, '萨利机长',		100,300, '2016-12-15 12:05:39'),
( 123, '海洋奇缘',		100,300, '2016-12-16 12:06:43'),
( 220, '血战钢锯岭',	100,300, '2016-12-23 12:07:18');
