
--�������
create table movie_info(
movie_id bigint   not null primary key  comment '��ӰƱID',
movie_name varchar(120) comment '��Ӱ����',
movie_price float comment '��ӰƱ�۸�',
movie_count int comment 'ʣ������',
movie_start_time datetime comment '��ӳʱ��',
moive_min int  comment 'ӰƬʱ��'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT charset=utf8 comment='��ӰƱ����';

create table user_info(
user_id  bigint   not null primary key comment '�û�id' ,
user_name varchar(120) comment '�û�����',
user_phone bigint comment '�û��绰',
user_qq varchar(100) comment 'qq',
user_email varchar(120) comment 'email'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT charset=utf8 comment='�û���Ϣ��';

create table buy_info(
buy_id  int not null comment '����ID',
movie_id bigint   not null  comment '��ӰƱID',
user_id  bigint   not null   comment '�û�ID',
movie_count int not null comment '��������',
create_time timestamp default current_timestamp comment '����ʱ��'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT charset=utf8 comment='������ϸ��';

insert into user_info(user_name,user_phone,user_qq,user_email)values
('�Ƽ�',15926270102,337230792,'with_tang@163.com');
insert into user_info(user_name,user_phone,user_qq,user_email)values
('�滨',15926270102,337230792,'with_tang@163.com');

insert  into movie_info (moive_min,movie_name,movie_price,movie_count,movie_start_time)
values(120, '�ڶ���',	100,300, '2016-12-11 20:54:32'),
( 123, '�������',		100,300, '2016-12-14 22:00:33'),
( 100, '�����ɻ�',		100,300, '2017-01-01 22:42:03'),
( 100, '����',		  	100,300, '2016-12-30 12:23:34'),
( 120, '���涯��������',100,300, '2016-12-01 12:24:24'),
( 129, '����',			  100,0,   '2016-12-23 12:24:56'),
( 130, '��������',		100,300, '2016-12-15 12:05:39'),
( 123, '������Ե',		100,300, '2016-12-16 12:06:43'),
( 220, 'Ѫս�־���',	100,300, '2016-12-23 12:07:18');
