drop database if exists mobileshop;
create database mobileshop;
use mobileshop;

drop table if exists user;
create table user(
	logname varchar(20) primary key,
    password varchar(20),
    phone varchar(20),
    addess varchar(20),
    realname varchar(20)
);

drop table if exists mobileClassify;
create table mobileClassify(
	id int primary key,
    name varchar(20)
);

drop table if exists mobilefrom;
create table mobilefrom(
	mobile_version varchar(20),
    mobile_name varchar(20),
    mMobile_made varchar(20),
    mobile_price float,
    mobile_mess varchar(30),
    mobile_pic varchar(20) primary key,
    id int
);

drop table if exists orderform;
create table orderform(
	id int,
	logname varchar(20),
    mess varchar(30),
    sum float
);

insert into mobileClassify values(1,'iphone');
insert into mobileClassify values(2,'Andriod');
insert into mobileClassify values(3,'Win_Phone');

insert into mobilefrom values
('A89S6','苹果S5','苹果公司',9876,'高清大屏幕','apple.jpg',1);
insert into mobilefrom values
('B8978','三星A98','三星公司',8976,'高分辨率图像','aa.jpg',2);
insert into mobilefrom values
('C555','中兴N986','中兴公司',3567,'双卡双待','cc.jpg',3);

insert into user values
('sen','123','17826807026','广东省惠州市','王文杰');

GRANT ALL PRIVILEGES ON ComicFM.* TO ‘root’@’localhost’ IDENTIFIED BY '2535663' WITH GRANT OPTION;