
use pips;

create table user(
    id varchar(45) primary key ,
    name varchar(30) not null,
    password varchar(30) not null
)ENGINE=INNODB DEFAULT CHARSET=utf8;

insert user values ('root', 'Admin', 'root');

create table todo_list(
    list_id varchar(45) primary key ,
    list_name varchar(30) not null,
    intro varchar(50)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

insert todo_list values ('10000000001','默认清单', '');

create table todo_item(
    item_id varchar(45) primary key ,
    item_name varchar(30) not null ,
    start_time datetime,
    end_time datetime,
    belong_list varchar(45) default '10000000001',
    `repeat` varchar(35),
    add_to_clock tinyint(1),
    priority int default 0,
    intro varchar(50),
    foreign key (belong_list) references todo_list(list_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

create table todo_flood(
    id varchar(45) primary key,
    flood_name varchar(30) not null,
    intro varchar(50)
)ENGINE=INNODB DEFAULT CHARSET=utf8;


create table flood_node(
    id varchar(45) primary key ,
    node_name varchar(30) not null,
    deadline datetime,
    prev varchar(45),
    next varchar(45),
    active_trigger varchar(30),
    belong_flood varchar(45),
    intro varchar(50),
    foreign key (belong_flood) references todo_flood(id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;