use pips;

create table tag(
	id varchar(45) primary key ,
	tag_name varchar(30) not null,
	intro varchar(50)
)ENGINE=INNODB DEFAULT CHARSET=utf8;


create table location(
	id varchar(45) primary key,
    loc_name varchar(30) not null
)ENGINE=INNODB DEFAULT CHARSET=utf8;

create table item_list(
	id varchar(45) primary key,
    list_name varchar(30) not null
)ENGINE=INNODB DEFAULT CHARSET=utf8;

create table item(
	id varchar(45) primary key ,
	item_name varchar(30) not null,
    belong_list varchar(45),
    own_time date,
    service_duration date,
    fav float,
    price int,
    location varchar(45),
	tag_list varchar(45),
	intro varchar(50),
    foreign key (location) references location(id),
    foreign key (belong_list) references item_list(id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

create table item_tag(
	id varchar(45) primary key,
	item_id varchar(45) not null,
	tag_id varchar(45) not null,
    foreign key (tag_id) references tag(id),
    foreign key (item_id) references item(id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
